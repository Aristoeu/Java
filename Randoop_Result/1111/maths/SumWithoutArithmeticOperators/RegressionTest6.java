package maths.SumWithoutArithmeticOperators;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest6 {

    public static boolean debug = false;

    @Test
    public void test3001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3001");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(32, (int) '4');
        int int15 = sumWithoutArithmeticOperators0.getSum(44, 100);
        int int18 = sumWithoutArithmeticOperators0.getSum(110, 53);
        int int21 = sumWithoutArithmeticOperators0.getSum(51, 215);
        int int24 = sumWithoutArithmeticOperators0.getSum(680, 616);
        int int27 = sumWithoutArithmeticOperators0.getSum(13150, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 84 + "'", int12 == 84);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 144 + "'", int15 == 144);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 163 + "'", int18 == 163);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 266 + "'", int21 == 266);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1296 + "'", int24 == 1296);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 13150 + "'", int27 == 13150);
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3002");
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
        int int30 = sumWithoutArithmeticOperators0.getSum(5191, 17286);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 122 + "'", int15 == 122);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 162 + "'", int18 == 162);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 623 + "'", int21 == 623);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1172 + "'", int24 == 1172);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 5003 + "'", int27 == 5003);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 22477 + "'", int30 == 22477);
    }

    @Test
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3003");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(250, 195);
        int int9 = sumWithoutArithmeticOperators0.getSum(533, 735);
        int int12 = sumWithoutArithmeticOperators0.getSum(3687, 1412);
        int int15 = sumWithoutArithmeticOperators0.getSum(12177, 6097);
        java.lang.Class<?> wildcardClass16 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 445 + "'", int6 == 445);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1268 + "'", int9 == 1268);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5099 + "'", int12 == 5099);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 18274 + "'", int15 == 18274);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3004");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(51, 53);
        int int15 = sumWithoutArithmeticOperators0.getSum(238, (int) '4');
        int int18 = sumWithoutArithmeticOperators0.getSum(1044, 84);
        int int21 = sumWithoutArithmeticOperators0.getSum(859, 9);
        int int24 = sumWithoutArithmeticOperators0.getSum(2010, 22604);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 104 + "'", int12 == 104);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 290 + "'", int15 == 290);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1128 + "'", int18 == 1128);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 868 + "'", int21 == 868);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 24614 + "'", int24 == 24614);
    }

    @Test
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3005");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(35, (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 35);
        int int15 = sumWithoutArithmeticOperators0.getSum(33, 163);
        int int18 = sumWithoutArithmeticOperators0.getSum((int) 'a', (int) (byte) 100);
        int int21 = sumWithoutArithmeticOperators0.getSum(499, (int) (byte) -1);
        int int24 = sumWithoutArithmeticOperators0.getSum(522, 3095);
        int int27 = sumWithoutArithmeticOperators0.getSum(3050, 0);
        int int30 = sumWithoutArithmeticOperators0.getSum(17, 6405);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 196 + "'", int15 == 196);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 197 + "'", int18 == 197);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 498 + "'", int21 == 498);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3617 + "'", int24 == 3617);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3050 + "'", int27 == 3050);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 6422 + "'", int30 == 6422);
    }

    @Test
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3006");
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
        int int30 = sumWithoutArithmeticOperators0.getSum(1972, 46);
        int int33 = sumWithoutArithmeticOperators0.getSum(2393, 6300);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 84 + "'", int12 == 84);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 144 + "'", int15 == 144);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 455 + "'", int18 == 455);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 156 + "'", int21 == 156);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1967 + "'", int24 == 1967);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 6097 + "'", int27 == 6097);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2018 + "'", int30 == 2018);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 8693 + "'", int33 == 8693);
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3007");
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
        int int42 = sumWithoutArithmeticOperators0.getSum(16667, 1543);
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
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 18210 + "'", int42 == 18210);
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3008");
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
        int int30 = sumWithoutArithmeticOperators0.getSum(2265, 931);
        int int33 = sumWithoutArithmeticOperators0.getSum(2181, 4268);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 84 + "'", int12 == 84);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 144 + "'", int15 == 144);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 163 + "'", int18 == 163);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 483 + "'", int21 == 483);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 635 + "'", int24 == 635);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 803 + "'", int27 == 803);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3196 + "'", int30 == 3196);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 6449 + "'", int33 == 6449);
    }

    @Test
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3009");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 53);
        int int15 = sumWithoutArithmeticOperators0.getSum(53, 101);
        int int18 = sumWithoutArithmeticOperators0.getSum(465, 199);
        int int21 = sumWithoutArithmeticOperators0.getSum(2022, 1143);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 154 + "'", int15 == 154);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 664 + "'", int18 == 664);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3165 + "'", int21 == 3165);
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3010");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(0, 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(9, (int) '#');
        int int12 = sumWithoutArithmeticOperators0.getSum(97, 168);
        int int15 = sumWithoutArithmeticOperators0.getSum(376, 972);
        int int18 = sumWithoutArithmeticOperators0.getSum(814, 1669);
        int int21 = sumWithoutArithmeticOperators0.getSum(15112, 707);
        java.lang.Class<?> wildcardClass22 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 152 + "'", int6 == 152);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 44 + "'", int9 == 44);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 265 + "'", int12 == 265);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1348 + "'", int15 == 1348);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2483 + "'", int18 == 2483);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 15819 + "'", int21 == 15819);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3011");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) ' ', 9);
        int int15 = sumWithoutArithmeticOperators0.getSum(4704, 4398);
        java.lang.Class<?> wildcardClass16 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 41 + "'", int12 == 41);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9102 + "'", int15 == 9102);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3012");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum(0, 486);
        int int12 = sumWithoutArithmeticOperators0.getSum(4188, 4392);
        int int15 = sumWithoutArithmeticOperators0.getSum(7227, 4869);
        java.lang.Class<?> wildcardClass16 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 486 + "'", int9 == 486);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8580 + "'", int12 == 8580);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 12096 + "'", int15 == 12096);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3013");
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
        int int33 = sumWithoutArithmeticOperators0.getSum(0, 4215);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 4215 + "'", int33 == 4215);
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3014");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) -1, 19);
        int int6 = sumWithoutArithmeticOperators0.getSum(21, 35);
        int int9 = sumWithoutArithmeticOperators0.getSum(859, 454);
        int int12 = sumWithoutArithmeticOperators0.getSum(460, 823);
        int int15 = sumWithoutArithmeticOperators0.getSum(2139, 5334);
        int int18 = sumWithoutArithmeticOperators0.getSum(27867, 21071);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 18 + "'", int3 == 18);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 56 + "'", int6 == 56);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1313 + "'", int9 == 1313);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1283 + "'", int12 == 1283);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7473 + "'", int15 == 7473);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 48938 + "'", int18 == 48938);
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3015");
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
        int int33 = sumWithoutArithmeticOperators0.getSum(5352, 24049);
        int int36 = sumWithoutArithmeticOperators0.getSum(2982, 2221);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 29401 + "'", int33 == 29401);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 5203 + "'", int36 == 5203);
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3016");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 18);
        int int9 = sumWithoutArithmeticOperators0.getSum(2339, 5977);
        int int12 = sumWithoutArithmeticOperators0.getSum(1247, 1354);
        int int15 = sumWithoutArithmeticOperators0.getSum(4260, 28340);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 18 + "'", int6 == 18);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8316 + "'", int9 == 8316);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2601 + "'", int12 == 2601);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32600 + "'", int15 == 32600);
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3017");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 53);
        int int15 = sumWithoutArithmeticOperators0.getSum(1972, 1294);
        int int18 = sumWithoutArithmeticOperators0.getSum(10077, 16228);
        int int21 = sumWithoutArithmeticOperators0.getSum(2035, 9548);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3266 + "'", int15 == 3266);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 26305 + "'", int18 == 26305);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 11583 + "'", int21 == 11583);
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3018");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum(0, 486);
        int int12 = sumWithoutArithmeticOperators0.getSum(876, 1869);
        int int15 = sumWithoutArithmeticOperators0.getSum(465, 8777);
        int int18 = sumWithoutArithmeticOperators0.getSum(22352, 4218);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 486 + "'", int9 == 486);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2745 + "'", int12 == 2745);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9242 + "'", int15 == 9242);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 26570 + "'", int18 == 26570);
    }

    @Test
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3019");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(21, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (short) 100);
        int int15 = sumWithoutArithmeticOperators0.getSum(955, 89);
        int int18 = sumWithoutArithmeticOperators0.getSum(1670, 1275);
        int int21 = sumWithoutArithmeticOperators0.getSum(0, 125);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 21 + "'", int9 == 21);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 200 + "'", int12 == 200);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1044 + "'", int15 == 1044);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2945 + "'", int18 == 2945);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 125 + "'", int21 == 125);
    }

    @Test
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3020");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (short) 1, 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(9, (int) (byte) -1);
        int int15 = sumWithoutArithmeticOperators0.getSum(215, 110);
        int int18 = sumWithoutArithmeticOperators0.getSum(3915, 0);
        java.lang.Class<?> wildcardClass19 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 325 + "'", int15 == 325);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3915 + "'", int18 == 3915);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3021");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum(44, 671);
        int int12 = sumWithoutArithmeticOperators0.getSum(785, 422);
        int int15 = sumWithoutArithmeticOperators0.getSum(5352, 156);
        int int18 = sumWithoutArithmeticOperators0.getSum(23533, 4560);
        int int21 = sumWithoutArithmeticOperators0.getSum(569, 2036);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 715 + "'", int9 == 715);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1207 + "'", int12 == 1207);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5508 + "'", int15 == 5508);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 28093 + "'", int18 == 28093);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2605 + "'", int21 == 2605);
    }

    @Test
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3022");
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
        int int30 = sumWithoutArithmeticOperators0.getSum(3618, 1594);
        int int33 = sumWithoutArithmeticOperators0.getSum(692, 1640);
        int int36 = sumWithoutArithmeticOperators0.getSum(825, 5379);
        int int39 = sumWithoutArithmeticOperators0.getSum(0, 10953);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 129 + "'", int15 == 129);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 160 + "'", int18 == 160);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 51 + "'", int21 == 51);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 782 + "'", int24 == 782);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4149 + "'", int27 == 4149);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 5212 + "'", int30 == 5212);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2332 + "'", int33 == 2332);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 6204 + "'", int36 == 6204);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 10953 + "'", int39 == 10953);
    }

    @Test
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3023");
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
        int int36 = sumWithoutArithmeticOperators0.getSum(39794, 5755);
        java.lang.Class<?> wildcardClass37 = sumWithoutArithmeticOperators0.getClass();
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 45549 + "'", int36 == 45549);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3024");
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
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 5274 + "'", int42 == 5274);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3025");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(163, 36);
        int int12 = sumWithoutArithmeticOperators0.getSum(627, 460);
        int int15 = sumWithoutArithmeticOperators0.getSum(10501, 7246);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 199 + "'", int9 == 199);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1087 + "'", int12 == 1087);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 17747 + "'", int15 == 17747);
    }

    @Test
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3026");
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
        int int30 = sumWithoutArithmeticOperators0.getSum(6623, 4750);
        int int33 = sumWithoutArithmeticOperators0.getSum(3946, 2230);
        java.lang.Class<?> wildcardClass34 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 21 + "'", int9 == 21);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 200 + "'", int12 == 200);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1044 + "'", int15 == 1044);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 56 + "'", int18 == 56);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4677 + "'", int21 == 4677);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6167 + "'", int24 == 6167);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 16526 + "'", int27 == 16526);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 11373 + "'", int30 == 11373);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 6176 + "'", int33 == 6176);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3027");
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
        int int30 = sumWithoutArithmeticOperators0.getSum(44, 19257);
        java.lang.Class<?> wildcardClass31 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 33 + "'", int15 == 33);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 163 + "'", int18 == 163);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 295 + "'", int21 == 295);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 76 + "'", int24 == 76);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3291 + "'", int27 == 3291);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 19301 + "'", int30 == 19301);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3028");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(0, 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, (int) (short) 10);
        int int12 = sumWithoutArithmeticOperators0.getSum(1245, 708);
        int int15 = sumWithoutArithmeticOperators0.getSum(0, 3409);
        java.lang.Class<?> wildcardClass16 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 152 + "'", int6 == 152);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1953 + "'", int12 == 1953);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3409 + "'", int15 == 3409);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3029");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) ' ', 35);
        int int6 = sumWithoutArithmeticOperators0.getSum(1253, 1133);
        int int9 = sumWithoutArithmeticOperators0.getSum(524, 166);
        int int12 = sumWithoutArithmeticOperators0.getSum(824, 4193);
        int int15 = sumWithoutArithmeticOperators0.getSum(4768, 987);
        int int18 = sumWithoutArithmeticOperators0.getSum(3024, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 67 + "'", int3 == 67);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2386 + "'", int6 == 2386);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 690 + "'", int9 == 690);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5017 + "'", int12 == 5017);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5755 + "'", int15 == 5755);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3024 + "'", int18 == 3024);
    }

    @Test
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3030");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum(129, 165);
        int int12 = sumWithoutArithmeticOperators0.getSum(66, 0);
        int int15 = sumWithoutArithmeticOperators0.getSum(9307, 1922);
        java.lang.Class<?> wildcardClass16 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 294 + "'", int9 == 294);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 66 + "'", int12 == 66);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 11229 + "'", int15 == 11229);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3031");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(0, 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(9, (int) '#');
        int int12 = sumWithoutArithmeticOperators0.getSum(97, 168);
        int int15 = sumWithoutArithmeticOperators0.getSum(590, 2512);
        int int18 = sumWithoutArithmeticOperators0.getSum(5352, 5769);
        int int21 = sumWithoutArithmeticOperators0.getSum(5894, 4363);
        int int24 = sumWithoutArithmeticOperators0.getSum(921, 7098);
        java.lang.Class<?> wildcardClass25 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 152 + "'", int6 == 152);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 44 + "'", int9 == 44);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 265 + "'", int12 == 265);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3102 + "'", int15 == 3102);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 11121 + "'", int18 == 11121);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10257 + "'", int21 == 10257);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 8019 + "'", int24 == 8019);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3032");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (short) 100, 34);
        int int12 = sumWithoutArithmeticOperators0.getSum(144, 21);
        int int15 = sumWithoutArithmeticOperators0.getSum(44, 210);
        int int18 = sumWithoutArithmeticOperators0.getSum((int) (byte) 0, 416);
        int int21 = sumWithoutArithmeticOperators0.getSum(432, 2165);
        int int24 = sumWithoutArithmeticOperators0.getSum(2343, 1654);
        int int27 = sumWithoutArithmeticOperators0.getSum(2198, 4563);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 134 + "'", int9 == 134);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 165 + "'", int12 == 165);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 254 + "'", int15 == 254);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 416 + "'", int18 == 416);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2597 + "'", int21 == 2597);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3997 + "'", int24 == 3997);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 6761 + "'", int27 == 6761);
    }

    @Test
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3033");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(21, 2250);
        int int9 = sumWithoutArithmeticOperators0.getSum(760, 6076);
        java.lang.Class<?> wildcardClass10 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2271 + "'", int6 == 2271);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 6836 + "'", int9 == 6836);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3034");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(10, (int) (byte) 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(52, 89);
        int int9 = sumWithoutArithmeticOperators0.getSum(499, 208);
        int int12 = sumWithoutArithmeticOperators0.getSum(1963, 1336);
        int int15 = sumWithoutArithmeticOperators0.getSum(1843, 4260);
        int int18 = sumWithoutArithmeticOperators0.getSum(2391, 562);
        int int21 = sumWithoutArithmeticOperators0.getSum(2071, 4145);
        int int24 = sumWithoutArithmeticOperators0.getSum(0, 19);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 141 + "'", int6 == 141);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 707 + "'", int9 == 707);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3299 + "'", int12 == 3299);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6103 + "'", int15 == 6103);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2953 + "'", int18 == 2953);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 6216 + "'", int21 == 6216);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 19 + "'", int24 == 19);
    }

    @Test
    public void test3035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3035");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(3455, 3665);
        int int9 = sumWithoutArithmeticOperators0.getSum(1869, 5573);
        java.lang.Class<?> wildcardClass10 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 7120 + "'", int6 == 7120);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 7442 + "'", int9 == 7442);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3036");
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
        java.lang.Class<?> wildcardClass31 = sumWithoutArithmeticOperators0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test3037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3037");
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
        int int30 = sumWithoutArithmeticOperators0.getSum(2639, 2528);
        int int33 = sumWithoutArithmeticOperators0.getSum(370, 10405);
        java.lang.Class<?> wildcardClass34 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 36 + "'", int15 == 36);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 253 + "'", int18 == 253);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 322 + "'", int21 == 322);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 555 + "'", int24 == 555);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2491 + "'", int27 == 2491);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 5167 + "'", int30 == 5167);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 10775 + "'", int33 == 10775);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test3038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3038");
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
        int int33 = sumWithoutArithmeticOperators0.getSum(1566, 13445);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 15011 + "'", int33 == 15011);
    }

    @Test
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3039");
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
        int int33 = sumWithoutArithmeticOperators0.getSum(3949, 2165);
        int int36 = sumWithoutArithmeticOperators0.getSum(7846, 2464);
        java.lang.Class<?> wildcardClass37 = sumWithoutArithmeticOperators0.getClass();
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 6114 + "'", int33 == 6114);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 10310 + "'", int36 == 10310);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3040");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(35, (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum(11, 0);
        int int15 = sumWithoutArithmeticOperators0.getSum(631, 255);
        int int18 = sumWithoutArithmeticOperators0.getSum(2123, 0);
        int int21 = sumWithoutArithmeticOperators0.getSum(847, 13445);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 11 + "'", int12 == 11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 886 + "'", int15 == 886);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2123 + "'", int18 == 2123);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 14292 + "'", int21 == 14292);
    }

    @Test
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3041");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(739, 186);
        int int12 = sumWithoutArithmeticOperators0.getSum(461, 2656);
        int int15 = sumWithoutArithmeticOperators0.getSum(6301, 3569);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 925 + "'", int9 == 925);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3117 + "'", int12 == 3117);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9870 + "'", int15 == 9870);
    }

    @Test
    public void test3042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3042");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(360, 7637);
        int int9 = sumWithoutArithmeticOperators0.getSum(0, 11724);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 7997 + "'", int6 == 7997);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 11724 + "'", int9 == 11724);
    }

    @Test
    public void test3043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3043");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(21, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(0, 10);
        int int15 = sumWithoutArithmeticOperators0.getSum(3668, 5341);
        java.lang.Class<?> wildcardClass16 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 21 + "'", int9 == 21);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9009 + "'", int15 == 9009);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3044");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int15 = sumWithoutArithmeticOperators0.getSum(122, 67);
        int int18 = sumWithoutArithmeticOperators0.getSum(294, 213);
        int int21 = sumWithoutArithmeticOperators0.getSum(1329, 10223);
        int int24 = sumWithoutArithmeticOperators0.getSum(2750, 1447);
        int int27 = sumWithoutArithmeticOperators0.getSum(360, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 189 + "'", int15 == 189);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 507 + "'", int18 == 507);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 11552 + "'", int21 == 11552);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4197 + "'", int24 == 4197);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 360 + "'", int27 == 360);
    }

    @Test
    public void test3045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3045");
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
        int int36 = sumWithoutArithmeticOperators0.getSum(1856, 4975);
        int int39 = sumWithoutArithmeticOperators0.getSum(6169, 575);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 6831 + "'", int36 == 6831);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 6744 + "'", int39 == 6744);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test3046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3046");
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
        int int30 = sumWithoutArithmeticOperators0.getSum(20344, 5892);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 134 + "'", int9 == 134);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 165 + "'", int12 == 165);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 289 + "'", int18 == 289);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8916 + "'", int21 == 8916);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 9500 + "'", int24 == 9500);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 16238 + "'", int27 == 16238);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 26236 + "'", int30 == 26236);
    }

    @Test
    public void test3047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3047");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum(129, 165);
        int int12 = sumWithoutArithmeticOperators0.getSum(152, 108);
        int int15 = sumWithoutArithmeticOperators0.getSum(117, 0);
        int int18 = sumWithoutArithmeticOperators0.getSum(1428, 4263);
        int int21 = sumWithoutArithmeticOperators0.getSum(8829, 1432);
        int int24 = sumWithoutArithmeticOperators0.getSum(5660, 2060);
        java.lang.Class<?> wildcardClass25 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 294 + "'", int9 == 294);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 260 + "'", int12 == 260);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 117 + "'", int15 == 117);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5691 + "'", int18 == 5691);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10261 + "'", int21 == 10261);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 7720 + "'", int24 == 7720);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3048");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, 98);
        int int9 = sumWithoutArithmeticOperators0.getSum(6580, 3328);
        int int12 = sumWithoutArithmeticOperators0.getSum(25301, 3264);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 108 + "'", int6 == 108);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9908 + "'", int9 == 9908);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 28565 + "'", int12 == 28565);
    }

    @Test
    public void test3049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3049");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 200);
        int int9 = sumWithoutArithmeticOperators0.getSum(156, 36);
        int int12 = sumWithoutArithmeticOperators0.getSum(288, 191);
        int int15 = sumWithoutArithmeticOperators0.getSum(4843, 9311);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 210 + "'", int6 == 210);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 192 + "'", int9 == 192);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 479 + "'", int12 == 479);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 14154 + "'", int15 == 14154);
    }

    @Test
    public void test3050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3050");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 1, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(18, (int) (byte) -1);
        int int15 = sumWithoutArithmeticOperators0.getSum(526, 727);
        int int18 = sumWithoutArithmeticOperators0.getSum(1967, 810);
        int int21 = sumWithoutArithmeticOperators0.getSum(1480, 1636);
        int int24 = sumWithoutArithmeticOperators0.getSum(3025, 199);
        int int27 = sumWithoutArithmeticOperators0.getSum(604, 2645);
        int int30 = sumWithoutArithmeticOperators0.getSum(1538, 12211);
        java.lang.Class<?> wildcardClass31 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 17 + "'", int12 == 17);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1253 + "'", int15 == 1253);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2777 + "'", int18 == 2777);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3116 + "'", int21 == 3116);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3224 + "'", int24 == 3224);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3249 + "'", int27 == 3249);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 13749 + "'", int30 == 13749);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test3051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3051");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, (int) (short) 10);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) '4', 134);
        int int15 = sumWithoutArithmeticOperators0.getSum(18, 1);
        int int18 = sumWithoutArithmeticOperators0.getSum((int) ' ', (int) (byte) 10);
        int int21 = sumWithoutArithmeticOperators0.getSum(0, 17);
        int int24 = sumWithoutArithmeticOperators0.getSum(3463, 1292);
        int int27 = sumWithoutArithmeticOperators0.getSum(6250, 1798);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 186 + "'", int12 == 186);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 19 + "'", int15 == 19);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 42 + "'", int18 == 42);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 17 + "'", int21 == 17);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4755 + "'", int24 == 4755);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 8048 + "'", int27 == 8048);
    }

    @Test
    public void test3052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3052");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(0, 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(9, (int) '#');
        int int12 = sumWithoutArithmeticOperators0.getSum(163, 52);
        int int15 = sumWithoutArithmeticOperators0.getSum(107, 210);
        int int18 = sumWithoutArithmeticOperators0.getSum(21, 975);
        int int21 = sumWithoutArithmeticOperators0.getSum(272, 76);
        int int24 = sumWithoutArithmeticOperators0.getSum(1759, 5220);
        java.lang.Class<?> wildcardClass25 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 152 + "'", int6 == 152);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 44 + "'", int9 == 44);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 215 + "'", int12 == 215);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 317 + "'", int15 == 317);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 996 + "'", int18 == 996);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 348 + "'", int21 == 348);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6979 + "'", int24 == 6979);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3053");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) 'a', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum(196, (int) ' ');
        int int15 = sumWithoutArithmeticOperators0.getSum(41, 692);
        int int18 = sumWithoutArithmeticOperators0.getSum(19360, 16978);
        java.lang.Class<?> wildcardClass19 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 98 + "'", int9 == 98);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 228 + "'", int12 == 228);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 733 + "'", int15 == 733);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 36338 + "'", int18 == 36338);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3054");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(35, (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum(11, 0);
        int int15 = sumWithoutArithmeticOperators0.getSum(631, 255);
        int int18 = sumWithoutArithmeticOperators0.getSum(1331, 1556);
        int int21 = sumWithoutArithmeticOperators0.getSum(22563, 16618);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 11 + "'", int12 == 11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 886 + "'", int15 == 886);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2887 + "'", int18 == 2887);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 39181 + "'", int21 == 39181);
    }

    @Test
    public void test3055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3055");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(21, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (short) 100);
        int int15 = sumWithoutArithmeticOperators0.getSum(955, 89);
        int int18 = sumWithoutArithmeticOperators0.getSum(278, 725);
        int int21 = sumWithoutArithmeticOperators0.getSum(181, 674);
        int int24 = sumWithoutArithmeticOperators0.getSum(8003, 7410);
        java.lang.Class<?> wildcardClass25 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 21 + "'", int9 == 21);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 200 + "'", int12 == 200);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1044 + "'", int15 == 1044);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1003 + "'", int18 == 1003);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 855 + "'", int21 == 855);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 15413 + "'", int24 == 15413);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3056");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(0, 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(162, 35);
        int int9 = sumWithoutArithmeticOperators0.getSum(596, 1623);
        int int12 = sumWithoutArithmeticOperators0.getSum(4456, 4739);
        int int15 = sumWithoutArithmeticOperators0.getSum(5408, 3218);
        int int18 = sumWithoutArithmeticOperators0.getSum(1187, 66);
        int int21 = sumWithoutArithmeticOperators0.getSum(946, 3264);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 197 + "'", int6 == 197);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2219 + "'", int9 == 2219);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9195 + "'", int12 == 9195);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8626 + "'", int15 == 8626);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1253 + "'", int18 == 1253);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4210 + "'", int21 == 4210);
    }

    @Test
    public void test3057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3057");
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
        int int30 = sumWithoutArithmeticOperators0.getSum(3127, 192);
        int int33 = sumWithoutArithmeticOperators0.getSum(8531, 4415);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3889 + "'", int18 == 3889);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 445 + "'", int21 == 445);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 290 + "'", int24 == 290);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 288 + "'", int27 == 288);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3319 + "'", int30 == 3319);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 12946 + "'", int33 == 12946);
    }

    @Test
    public void test3058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3058");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) 'a', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum(196, (int) ' ');
        int int15 = sumWithoutArithmeticOperators0.getSum(1128, 108);
        int int18 = sumWithoutArithmeticOperators0.getSum(123, 309);
        int int21 = sumWithoutArithmeticOperators0.getSum(847, (int) (byte) -1);
        int int24 = sumWithoutArithmeticOperators0.getSum(215, 5450);
        java.lang.Class<?> wildcardClass25 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 98 + "'", int9 == 98);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 228 + "'", int12 == 228);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1236 + "'", int15 == 1236);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 432 + "'", int18 == 432);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 846 + "'", int21 == 846);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5665 + "'", int24 == 5665);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3059");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(35, (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 35);
        int int15 = sumWithoutArithmeticOperators0.getSum(53, 36);
        int int18 = sumWithoutArithmeticOperators0.getSum(844, 289);
        int int21 = sumWithoutArithmeticOperators0.getSum(35, 90);
        int int24 = sumWithoutArithmeticOperators0.getSum(210, 2941);
        int int27 = sumWithoutArithmeticOperators0.getSum(8037, 226);
        java.lang.Class<?> wildcardClass28 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 89 + "'", int15 == 89);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1133 + "'", int18 == 1133);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 125 + "'", int21 == 125);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3151 + "'", int24 == 3151);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 8263 + "'", int27 == 8263);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3060");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) 'a', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum(266, 295);
        int int15 = sumWithoutArithmeticOperators0.getSum(1067, (int) 'a');
        int int18 = sumWithoutArithmeticOperators0.getSum(1003, 1019);
        java.lang.Class<?> wildcardClass19 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 98 + "'", int9 == 98);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 561 + "'", int12 == 561);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1164 + "'", int15 == 1164);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2022 + "'", int18 == 2022);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3061");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (short) 100, 34);
        int int12 = sumWithoutArithmeticOperators0.getSum(144, 21);
        int int15 = sumWithoutArithmeticOperators0.getSum(52, 104);
        int int18 = sumWithoutArithmeticOperators0.getSum(590, 0);
        int int21 = sumWithoutArithmeticOperators0.getSum(1934, 5343);
        int int24 = sumWithoutArithmeticOperators0.getSum(2941, 362);
        java.lang.Class<?> wildcardClass25 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 134 + "'", int9 == 134);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 165 + "'", int12 == 165);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 156 + "'", int15 == 156);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 590 + "'", int18 == 590);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 7277 + "'", int21 == 7277);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3303 + "'", int24 == 3303);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3062");
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
        int int33 = sumWithoutArithmeticOperators0.getSum(141, 463);
        int int36 = sumWithoutArithmeticOperators0.getSum(1425, 0);
        int int39 = sumWithoutArithmeticOperators0.getSum(2432, 1326);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 604 + "'", int33 == 604);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1425 + "'", int36 == 1425);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 3758 + "'", int39 == 3758);
    }

    @Test
    public void test3063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3063");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) -1, 19);
        int int6 = sumWithoutArithmeticOperators0.getSum(21, 35);
        int int9 = sumWithoutArithmeticOperators0.getSum(859, 454);
        int int12 = sumWithoutArithmeticOperators0.getSum(1253, 461);
        int int15 = sumWithoutArithmeticOperators0.getSum(322, 1527);
        int int18 = sumWithoutArithmeticOperators0.getSum(295, 29572);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 18 + "'", int3 == 18);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 56 + "'", int6 == 56);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1313 + "'", int9 == 1313);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1714 + "'", int12 == 1714);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1849 + "'", int15 == 1849);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 29867 + "'", int18 == 29867);
    }

    @Test
    public void test3064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3064");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((-1), 35);
        int int15 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 250);
        int int18 = sumWithoutArithmeticOperators0.getSum(0, 213);
        int int21 = sumWithoutArithmeticOperators0.getSum(1668, 0);
        int int24 = sumWithoutArithmeticOperators0.getSum(597, 186);
        int int27 = sumWithoutArithmeticOperators0.getSum(3958, 2399);
        int int30 = sumWithoutArithmeticOperators0.getSum(13934, 4711);
        java.lang.Class<?> wildcardClass31 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 249 + "'", int15 == 249);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 213 + "'", int18 == 213);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1668 + "'", int21 == 1668);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 783 + "'", int24 == 783);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 6357 + "'", int27 == 6357);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 18645 + "'", int30 == 18645);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test3065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3065");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (short) 100, 34);
        int int12 = sumWithoutArithmeticOperators0.getSum(144, 21);
        int int15 = sumWithoutArithmeticOperators0.getSum(0, 35);
        int int18 = sumWithoutArithmeticOperators0.getSum((-1), 290);
        int int21 = sumWithoutArithmeticOperators0.getSum(289, 734);
        int int24 = sumWithoutArithmeticOperators0.getSum(0, 0);
        int int27 = sumWithoutArithmeticOperators0.getSum(1451, 22858);
        int int30 = sumWithoutArithmeticOperators0.getSum(16401, 8584);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 134 + "'", int9 == 134);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 165 + "'", int12 == 165);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 289 + "'", int18 == 289);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1023 + "'", int21 == 1023);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 24309 + "'", int27 == 24309);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 24985 + "'", int30 == 24985);
    }

    @Test
    public void test3066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3066");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(0, 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(9, (int) '#');
        int int12 = sumWithoutArithmeticOperators0.getSum(211, 245);
        int int15 = sumWithoutArithmeticOperators0.getSum(3880, 377);
        int int18 = sumWithoutArithmeticOperators0.getSum(896, 10046);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 152 + "'", int6 == 152);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 44 + "'", int9 == 44);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 456 + "'", int12 == 456);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4257 + "'", int15 == 4257);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10942 + "'", int18 == 10942);
    }

    @Test
    public void test3067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3067");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(35, (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 35);
        int int15 = sumWithoutArithmeticOperators0.getSum(19, 110);
        int int18 = sumWithoutArithmeticOperators0.getSum(51, 109);
        int int21 = sumWithoutArithmeticOperators0.getSum(256, 727);
        int int24 = sumWithoutArithmeticOperators0.getSum(14534, 5681);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 129 + "'", int15 == 129);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 160 + "'", int18 == 160);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 983 + "'", int21 == 983);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 20215 + "'", int24 == 20215);
    }

    @Test
    public void test3068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3068");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((-1), 35);
        int int15 = sumWithoutArithmeticOperators0.getSum(163, 17);
        int int18 = sumWithoutArithmeticOperators0.getSum(284, 271);
        int int21 = sumWithoutArithmeticOperators0.getSum(1241, 1106);
        int int24 = sumWithoutArithmeticOperators0.getSum(237, 2042);
        int int27 = sumWithoutArithmeticOperators0.getSum(13777, 21);
        int int30 = sumWithoutArithmeticOperators0.getSum(15803, 2476);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 180 + "'", int15 == 180);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 555 + "'", int18 == 555);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2347 + "'", int21 == 2347);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2279 + "'", int24 == 2279);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 13798 + "'", int27 == 13798);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 18279 + "'", int30 == 18279);
    }

    @Test
    public void test3069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3069");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(21, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(238, 253);
        int int15 = sumWithoutArithmeticOperators0.getSum(683, 1003);
        int int18 = sumWithoutArithmeticOperators0.getSum(974, 2511);
        int int21 = sumWithoutArithmeticOperators0.getSum(1000, 9797);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 21 + "'", int9 == 21);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 491 + "'", int12 == 491);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1686 + "'", int15 == 1686);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3485 + "'", int18 == 3485);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10797 + "'", int21 == 10797);
    }

    @Test
    public void test3070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3070");
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
        int int30 = sumWithoutArithmeticOperators0.getSum(15083, 780);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 238 + "'", int9 == 238);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 499 + "'", int12 == 499);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 11 + "'", int15 == 11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 34 + "'", int18 == 34);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1448 + "'", int21 == 1448);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2492 + "'", int24 == 2492);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 23794 + "'", int27 == 23794);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 15863 + "'", int30 == 15863);
    }

    @Test
    public void test3071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3071");
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
        int int30 = sumWithoutArithmeticOperators0.getSum(24049, 4464);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 17 + "'", int12 == 17);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1253 + "'", int15 == 1253);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1326 + "'", int18 == 1326);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2248 + "'", int21 == 2248);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 16269 + "'", int24 == 16269);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 13117 + "'", int27 == 13117);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 28513 + "'", int30 == 28513);
    }

    @Test
    public void test3072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3072");
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
        java.lang.Class<?> wildcardClass28 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 134 + "'", int9 == 134);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 165 + "'", int12 == 165);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 246 + "'", int18 == 246);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 427 + "'", int21 == 427);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1814 + "'", int24 == 1814);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 13241 + "'", int27 == 13241);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3073");
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
        int int30 = sumWithoutArithmeticOperators0.getSum(8527, 1283);
        int int33 = sumWithoutArithmeticOperators0.getSum(1439, 2718);
        java.lang.Class<?> wildcardClass34 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 294 + "'", int9 == 294);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 260 + "'", int12 == 260);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1148 + "'", int15 == 1148);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2391 + "'", int18 == 2391);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3264 + "'", int21 == 3264);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 9794 + "'", int24 == 9794);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 7675 + "'", int27 == 7675);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 9810 + "'", int30 == 9810);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 4157 + "'", int33 == 4157);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test3074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3074");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(257, 250);
        int int12 = sumWithoutArithmeticOperators0.getSum(221, 360);
        int int15 = sumWithoutArithmeticOperators0.getSum(885, (int) '#');
        int int18 = sumWithoutArithmeticOperators0.getSum(1236, 3597);
        int int21 = sumWithoutArithmeticOperators0.getSum(8528, 2100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 507 + "'", int9 == 507);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 581 + "'", int12 == 581);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 920 + "'", int15 == 920);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4833 + "'", int18 == 4833);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10628 + "'", int21 == 10628);
    }

    @Test
    public void test3075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3075");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(0, 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, (int) (short) 10);
        int int12 = sumWithoutArithmeticOperators0.getSum(107, 460);
        int int15 = sumWithoutArithmeticOperators0.getSum(746, 666);
        int int18 = sumWithoutArithmeticOperators0.getSum(181, 738);
        java.lang.Class<?> wildcardClass19 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 152 + "'", int6 == 152);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 567 + "'", int12 == 567);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1412 + "'", int15 == 1412);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 919 + "'", int18 == 919);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3076");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(911, 432);
        int int12 = sumWithoutArithmeticOperators0.getSum(955, 382);
        int int15 = sumWithoutArithmeticOperators0.getSum(2223, 422);
        int int18 = sumWithoutArithmeticOperators0.getSum(2224, 15714);
        int int21 = sumWithoutArithmeticOperators0.getSum(4721, 28736);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1343 + "'", int9 == 1343);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1337 + "'", int12 == 1337);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2645 + "'", int15 == 2645);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 17938 + "'", int18 == 17938);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 33457 + "'", int21 == 33457);
    }

    @Test
    public void test3077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3077");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(35, (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 35);
        int int15 = sumWithoutArithmeticOperators0.getSum(19, 110);
        int int18 = sumWithoutArithmeticOperators0.getSum(51, 109);
        int int21 = sumWithoutArithmeticOperators0.getSum(390, 152);
        int int24 = sumWithoutArithmeticOperators0.getSum(5952, 2824);
        int int27 = sumWithoutArithmeticOperators0.getSum(3542, 13444);
        java.lang.Class<?> wildcardClass28 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 129 + "'", int15 == 129);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 160 + "'", int18 == 160);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 542 + "'", int21 == 542);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 8776 + "'", int24 == 8776);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 16986 + "'", int27 == 16986);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3078");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum(0, 486);
        int int12 = sumWithoutArithmeticOperators0.getSum(1343, 0);
        int int15 = sumWithoutArithmeticOperators0.getSum(2262, 6083);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 486 + "'", int9 == 486);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1343 + "'", int12 == 1343);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8345 + "'", int15 == 8345);
    }

    @Test
    public void test3079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3079");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (short) 100, 34);
        int int12 = sumWithoutArithmeticOperators0.getSum(144, 21);
        int int15 = sumWithoutArithmeticOperators0.getSum(0, 35);
        int int18 = sumWithoutArithmeticOperators0.getSum((-1), 290);
        int int21 = sumWithoutArithmeticOperators0.getSum(170, (int) (byte) 10);
        int int24 = sumWithoutArithmeticOperators0.getSum(6015, 3509);
        int int27 = sumWithoutArithmeticOperators0.getSum(1761, 616);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 134 + "'", int9 == 134);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 165 + "'", int12 == 165);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 289 + "'", int18 == 289);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 180 + "'", int21 == 180);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 9524 + "'", int24 == 9524);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2377 + "'", int27 == 2377);
    }

    @Test
    public void test3080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3080");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) -1, 19);
        int int6 = sumWithoutArithmeticOperators0.getSum(21, 35);
        int int9 = sumWithoutArithmeticOperators0.getSum(1121, 708);
        int int12 = sumWithoutArithmeticOperators0.getSum(1688, 1337);
        int int15 = sumWithoutArithmeticOperators0.getSum(5983, 19404);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 18 + "'", int3 == 18);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 56 + "'", int6 == 56);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1829 + "'", int9 == 1829);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3025 + "'", int12 == 3025);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 25387 + "'", int15 == 25387);
    }

    @Test
    public void test3081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3081");
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
        int int30 = sumWithoutArithmeticOperators0.getSum(6918, 35951);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 196 + "'", int15 == 196);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 197 + "'", int18 == 197);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 498 + "'", int21 == 498);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 245 + "'", int24 == 245);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 7769 + "'", int27 == 7769);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 42869 + "'", int30 == 42869);
    }

    @Test
    public void test3082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3082");
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
        int int30 = sumWithoutArithmeticOperators0.getSum(20035, 26623);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 390 + "'", int12 == 390);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 407 + "'", int15 == 407);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 170 + "'", int18 == 170);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 237 + "'", int21 == 237);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5208 + "'", int24 == 5208);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4127 + "'", int27 == 4127);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 46658 + "'", int30 == 46658);
    }

    @Test
    public void test3083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3083");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) 0, (int) (short) -1);
        int int15 = sumWithoutArithmeticOperators0.getSum((int) ' ', 1);
        int int18 = sumWithoutArithmeticOperators0.getSum(11, 152);
        int int21 = sumWithoutArithmeticOperators0.getSum(286, 9);
        int int24 = sumWithoutArithmeticOperators0.getSum((int) ' ', 44);
        int int27 = sumWithoutArithmeticOperators0.getSum(1380, 735);
        int int30 = sumWithoutArithmeticOperators0.getSum(924, 5402);
        int int33 = sumWithoutArithmeticOperators0.getSum(5865, 3383);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 33 + "'", int15 == 33);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 163 + "'", int18 == 163);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 295 + "'", int21 == 295);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 76 + "'", int24 == 76);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2115 + "'", int27 == 2115);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 6326 + "'", int30 == 6326);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 9248 + "'", int33 == 9248);
    }

    @Test
    public void test3084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3084");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(0, 199);
        int int12 = sumWithoutArithmeticOperators0.getSum(324, 614);
        int int15 = sumWithoutArithmeticOperators0.getSum(533, (int) (short) 10);
        int int18 = sumWithoutArithmeticOperators0.getSum(1748, 1807);
        int int21 = sumWithoutArithmeticOperators0.getSum(1119, 210);
        java.lang.Class<?> wildcardClass22 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 199 + "'", int9 == 199);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 938 + "'", int12 == 938);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 543 + "'", int15 == 543);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3555 + "'", int18 == 3555);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1329 + "'", int21 == 1329);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3085");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 18);
        int int9 = sumWithoutArithmeticOperators0.getSum(36, 160);
        int int12 = sumWithoutArithmeticOperators0.getSum((-1), 108);
        int int15 = sumWithoutArithmeticOperators0.getSum(859, 249);
        int int18 = sumWithoutArithmeticOperators0.getSum(785, 0);
        int int21 = sumWithoutArithmeticOperators0.getSum(3034, 3291);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 18 + "'", int6 == 18);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 196 + "'", int9 == 196);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 107 + "'", int12 == 107);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1108 + "'", int15 == 1108);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 785 + "'", int18 == 785);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 6325 + "'", int21 == 6325);
    }

    @Test
    public void test3086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3086");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(129, 109);
        int int12 = sumWithoutArithmeticOperators0.getSum(390, 109);
        int int15 = sumWithoutArithmeticOperators0.getSum(781, 555);
        int int18 = sumWithoutArithmeticOperators0.getSum(680, 3175);
        int int21 = sumWithoutArithmeticOperators0.getSum(11431, 6732);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 238 + "'", int9 == 238);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 499 + "'", int12 == 499);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1336 + "'", int15 == 1336);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3855 + "'", int18 == 3855);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 18163 + "'", int21 == 18163);
    }

    @Test
    public void test3087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3087");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (short) 100, 34);
        int int12 = sumWithoutArithmeticOperators0.getSum(144, 21);
        int int15 = sumWithoutArithmeticOperators0.getSum(0, 35);
        int int18 = sumWithoutArithmeticOperators0.getSum((-1), 290);
        int int21 = sumWithoutArithmeticOperators0.getSum(456, 0);
        int int24 = sumWithoutArithmeticOperators0.getSum(9153, 5895);
        java.lang.Class<?> wildcardClass25 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 134 + "'", int9 == 134);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 165 + "'", int12 == 165);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 289 + "'", int18 == 289);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 456 + "'", int21 == 456);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 15048 + "'", int24 == 15048);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3088");
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
        int int30 = sumWithoutArithmeticOperators0.getSum(2262, 4105);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 186 + "'", int12 == 186);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 19 + "'", int15 == 19);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 460 + "'", int21 == 460);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 490 + "'", int24 == 490);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 6812 + "'", int27 == 6812);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 6367 + "'", int30 == 6367);
    }

    @Test
    public void test3089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3089");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum(0, 168);
        int int12 = sumWithoutArithmeticOperators0.getSum(2219, 1278);
        int int15 = sumWithoutArithmeticOperators0.getSum(4770, 445);
        int int18 = sumWithoutArithmeticOperators0.getSum(13656, 18033);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 168 + "'", int9 == 168);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3497 + "'", int12 == 3497);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5215 + "'", int15 == 5215);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 31689 + "'", int18 == 31689);
    }

    @Test
    public void test3090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3090");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(10, (int) (byte) 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(52, 89);
        int int9 = sumWithoutArithmeticOperators0.getSum(249, 343);
        int int12 = sumWithoutArithmeticOperators0.getSum(817, 789);
        int int15 = sumWithoutArithmeticOperators0.getSum(29939, 3632);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 141 + "'", int6 == 141);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 592 + "'", int9 == 592);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1606 + "'", int12 == 1606);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 33571 + "'", int15 == 33571);
    }

    @Test
    public void test3091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3091");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(32, (int) '4');
        int int15 = sumWithoutArithmeticOperators0.getSum(44, 100);
        int int18 = sumWithoutArithmeticOperators0.getSum(217, 238);
        int int21 = sumWithoutArithmeticOperators0.getSum(199, 427);
        int int24 = sumWithoutArithmeticOperators0.getSum(6167, 2911);
        int int27 = sumWithoutArithmeticOperators0.getSum(325, 1121);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 84 + "'", int12 == 84);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 144 + "'", int15 == 144);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 455 + "'", int18 == 455);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 626 + "'", int21 == 626);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 9078 + "'", int24 == 9078);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1446 + "'", int27 == 1446);
    }

    @Test
    public void test3092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3092");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(10, (int) (byte) 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(321, 56);
        int int9 = sumWithoutArithmeticOperators0.getSum(117, 100);
        int int12 = sumWithoutArithmeticOperators0.getSum(855, 2230);
        int int15 = sumWithoutArithmeticOperators0.getSum(7315, 2471);
        int int18 = sumWithoutArithmeticOperators0.getSum(9337, 1068);
        int int21 = sumWithoutArithmeticOperators0.getSum(9968, 4706);
        java.lang.Class<?> wildcardClass22 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 377 + "'", int6 == 377);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 217 + "'", int9 == 217);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3085 + "'", int12 == 3085);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9786 + "'", int15 == 9786);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10405 + "'", int18 == 10405);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 14674 + "'", int21 == 14674);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3093");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(129, 109);
        int int12 = sumWithoutArithmeticOperators0.getSum(390, 109);
        int int15 = sumWithoutArithmeticOperators0.getSum(11, (int) (short) 0);
        int int18 = sumWithoutArithmeticOperators0.getSum(6280, 1365);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 238 + "'", int9 == 238);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 499 + "'", int12 == 499);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 11 + "'", int15 == 11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 7645 + "'", int18 == 7645);
    }

    @Test
    public void test3094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3094");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(0, 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(10, (int) (byte) 100);
        int int12 = sumWithoutArithmeticOperators0.getSum(251, 210);
        int int15 = sumWithoutArithmeticOperators0.getSum(246, 9);
        int int18 = sumWithoutArithmeticOperators0.getSum(1128, 246);
        int int21 = sumWithoutArithmeticOperators0.getSum(238, 125);
        int int24 = sumWithoutArithmeticOperators0.getSum(3371, 10105);
        int int27 = sumWithoutArithmeticOperators0.getSum(4787, 1705);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 152 + "'", int6 == 152);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 461 + "'", int12 == 461);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 255 + "'", int15 == 255);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1374 + "'", int18 == 1374);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 363 + "'", int21 == 363);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 13476 + "'", int24 == 13476);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 6492 + "'", int27 == 6492);
    }

    @Test
    public void test3095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3095");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) 0, (int) (short) -1);
        int int15 = sumWithoutArithmeticOperators0.getSum((int) ' ', 1);
        int int18 = sumWithoutArithmeticOperators0.getSum(1373, 186);
        int int21 = sumWithoutArithmeticOperators0.getSum(2042, 16132);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 33 + "'", int15 == 33);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1559 + "'", int18 == 1559);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 18174 + "'", int21 == 18174);
    }

    @Test
    public void test3096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3096");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 1, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(21, 11);
        int int15 = sumWithoutArithmeticOperators0.getSum(0, 34);
        int int18 = sumWithoutArithmeticOperators0.getSum(254, 269);
        int int21 = sumWithoutArithmeticOperators0.getSum(942, 33);
        int int24 = sumWithoutArithmeticOperators0.getSum(6869, 2924);
        java.lang.Class<?> wildcardClass25 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 34 + "'", int15 == 34);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 523 + "'", int18 == 523);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 975 + "'", int21 == 975);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 9793 + "'", int24 == 9793);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3097");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(129, 109);
        int int12 = sumWithoutArithmeticOperators0.getSum(390, 109);
        int int15 = sumWithoutArithmeticOperators0.getSum(3502, 17286);
        java.lang.Class<?> wildcardClass16 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 238 + "'", int9 == 238);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 499 + "'", int12 == 499);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 20788 + "'", int15 == 20788);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3098");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(32, (int) '4');
        int int15 = sumWithoutArithmeticOperators0.getSum((int) (short) 100, 1);
        int int18 = sumWithoutArithmeticOperators0.getSum(161, 84);
        int int21 = sumWithoutArithmeticOperators0.getSum(1999, 526);
        int int24 = sumWithoutArithmeticOperators0.getSum(5077, 9136);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 84 + "'", int12 == 84);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 101 + "'", int15 == 101);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 245 + "'", int18 == 245);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2525 + "'", int21 == 2525);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 14213 + "'", int24 == 14213);
    }

    @Test
    public void test3099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3099");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(35, (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 35);
        int int15 = sumWithoutArithmeticOperators0.getSum(19, 110);
        int int18 = sumWithoutArithmeticOperators0.getSum(51, 109);
        int int21 = sumWithoutArithmeticOperators0.getSum(390, 152);
        int int24 = sumWithoutArithmeticOperators0.getSum(1028, 546);
        int int27 = sumWithoutArithmeticOperators0.getSum(921, 2596);
        int int30 = sumWithoutArithmeticOperators0.getSum(2750, 4767);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 129 + "'", int15 == 129);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 160 + "'", int18 == 160);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 542 + "'", int21 == 542);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1574 + "'", int24 == 1574);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3517 + "'", int27 == 3517);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 7517 + "'", int30 == 7517);
    }

    @Test
    public void test3100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3100");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) 0, (int) (short) -1);
        int int15 = sumWithoutArithmeticOperators0.getSum((int) ' ', 1);
        int int18 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (short) -1);
        int int21 = sumWithoutArithmeticOperators0.getSum(7, (int) (short) 100);
        int int24 = sumWithoutArithmeticOperators0.getSum(786, 294);
        int int27 = sumWithoutArithmeticOperators0.getSum(325, 15821);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 33 + "'", int15 == 33);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 107 + "'", int21 == 107);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1080 + "'", int24 == 1080);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 16146 + "'", int27 == 16146);
    }

    @Test
    public void test3101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3101");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) 'a', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum(266, 295);
        int int15 = sumWithoutArithmeticOperators0.getSum(8969, 1028);
        int int18 = sumWithoutArithmeticOperators0.getSum(11086, 4750);
        int int21 = sumWithoutArithmeticOperators0.getSum(2407, 847);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 98 + "'", int9 == 98);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 561 + "'", int12 == 561);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9997 + "'", int15 == 9997);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 15836 + "'", int18 == 15836);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3254 + "'", int21 == 3254);
    }

    @Test
    public void test3102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3102");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(10, (int) (byte) 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(321, 56);
        int int9 = sumWithoutArithmeticOperators0.getSum(117, 100);
        int int12 = sumWithoutArithmeticOperators0.getSum(1788, 0);
        int int15 = sumWithoutArithmeticOperators0.getSum(132, 936);
        int int18 = sumWithoutArithmeticOperators0.getSum(1197, 14303);
        int int21 = sumWithoutArithmeticOperators0.getSum(20035, 708);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 377 + "'", int6 == 377);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 217 + "'", int9 == 217);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1788 + "'", int12 == 1788);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1068 + "'", int15 == 1068);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 15500 + "'", int18 == 15500);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 20743 + "'", int21 == 20743);
    }

    @Test
    public void test3103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3103");
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
        int int30 = sumWithoutArithmeticOperators0.getSum(144, 601);
        int int33 = sumWithoutArithmeticOperators0.getSum(1684, 0);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 745 + "'", int30 == 745);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1684 + "'", int33 == 1684);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test3104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3104");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(21, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (short) 100);
        int int15 = sumWithoutArithmeticOperators0.getSum(955, 89);
        int int18 = sumWithoutArithmeticOperators0.getSum((int) (short) 1, 55);
        int int21 = sumWithoutArithmeticOperators0.getSum(3266, 1411);
        int int24 = sumWithoutArithmeticOperators0.getSum(0, 4537);
        int int27 = sumWithoutArithmeticOperators0.getSum(692, 781);
        java.lang.Class<?> wildcardClass28 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 21 + "'", int9 == 21);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 200 + "'", int12 == 200);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1044 + "'", int15 == 1044);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 56 + "'", int18 == 56);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4677 + "'", int21 == 4677);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4537 + "'", int24 == 4537);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1473 + "'", int27 == 1473);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3105");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (short) 100, 34);
        int int12 = sumWithoutArithmeticOperators0.getSum(289, 269);
        int int15 = sumWithoutArithmeticOperators0.getSum(0, 343);
        int int18 = sumWithoutArithmeticOperators0.getSum(6059, 2810);
        int int21 = sumWithoutArithmeticOperators0.getSum(1456, 773);
        java.lang.Class<?> wildcardClass22 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 134 + "'", int9 == 134);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 558 + "'", int12 == 558);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 343 + "'", int15 == 343);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8869 + "'", int18 == 8869);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2229 + "'", int21 == 2229);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3106");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(747, 1764);
        int int9 = sumWithoutArithmeticOperators0.getSum(8916, 3400);
        java.lang.Class<?> wildcardClass10 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2511 + "'", int6 == 2511);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 12316 + "'", int9 == 12316);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3107");
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
    }

    @Test
    public void test3108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3108");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(21, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(0, 10);
        int int15 = sumWithoutArithmeticOperators0.getSum(3668, 5341);
        int int18 = sumWithoutArithmeticOperators0.getSum(5651, 8373);
        java.lang.Class<?> wildcardClass19 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 21 + "'", int9 == 21);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9009 + "'", int15 == 9009);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 14024 + "'", int18 == 14024);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3109");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(10, (int) (byte) 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(321, 56);
        int int9 = sumWithoutArithmeticOperators0.getSum(277, 100);
        int int12 = sumWithoutArithmeticOperators0.getSum(625, 55);
        int int15 = sumWithoutArithmeticOperators0.getSum(543, 767);
        int int18 = sumWithoutArithmeticOperators0.getSum(13361, 4231);
        int int21 = sumWithoutArithmeticOperators0.getSum(4817, 3158);
        java.lang.Class<?> wildcardClass22 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 377 + "'", int6 == 377);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 377 + "'", int9 == 377);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 680 + "'", int12 == 680);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1310 + "'", int15 == 1310);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 17592 + "'", int18 == 17592);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 7975 + "'", int21 == 7975);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3110");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(0, 199);
        int int12 = sumWithoutArithmeticOperators0.getSum(156, 460);
        int int15 = sumWithoutArithmeticOperators0.getSum(1449, 983);
        int int18 = sumWithoutArithmeticOperators0.getSum(12935, 26859);
        int int21 = sumWithoutArithmeticOperators0.getSum(2463, 6836);
        int int24 = sumWithoutArithmeticOperators0.getSum(11958, 3130);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 199 + "'", int9 == 199);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 616 + "'", int12 == 616);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2432 + "'", int15 == 2432);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 39794 + "'", int18 == 39794);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 9299 + "'", int21 == 9299);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 15088 + "'", int24 == 15088);
    }

    @Test
    public void test3111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3111");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(21, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(107, 0);
        int int15 = sumWithoutArithmeticOperators0.getSum(289, 555);
        int int18 = sumWithoutArithmeticOperators0.getSum(9185, 3409);
        int int21 = sumWithoutArithmeticOperators0.getSum(5941, 15240);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 21 + "'", int9 == 21);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 107 + "'", int12 == 107);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 844 + "'", int15 == 844);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 12594 + "'", int18 == 12594);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 21181 + "'", int21 == 21181);
    }

    @Test
    public void test3112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3112");
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
        int int30 = sumWithoutArithmeticOperators0.getSum(11979, 4398);
        java.lang.Class<?> wildcardClass31 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 154 + "'", int15 == 154);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1247 + "'", int18 == 1247);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 216 + "'", int21 == 216);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3744 + "'", int24 == 3744);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1238 + "'", int27 == 1238);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 16377 + "'", int30 == 16377);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test3113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3113");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(21, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (short) 100);
        int int15 = sumWithoutArithmeticOperators0.getSum(955, 89);
        int int18 = sumWithoutArithmeticOperators0.getSum(278, 725);
        int int21 = sumWithoutArithmeticOperators0.getSum(601, 0);
        int int24 = sumWithoutArithmeticOperators0.getSum(865, 1724);
        int int27 = sumWithoutArithmeticOperators0.getSum(695, 236);
        int int30 = sumWithoutArithmeticOperators0.getSum(12738, 16834);
        java.lang.Class<?> wildcardClass31 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 21 + "'", int9 == 21);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 200 + "'", int12 == 200);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1044 + "'", int15 == 1044);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1003 + "'", int18 == 1003);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 601 + "'", int21 == 601);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2589 + "'", int24 == 2589);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 931 + "'", int27 == 931);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 29572 + "'", int30 == 29572);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test3114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3114");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(0, 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(9, (int) '#');
        int int12 = sumWithoutArithmeticOperators0.getSum(211, 245);
        int int15 = sumWithoutArithmeticOperators0.getSum(697, 290);
        int int18 = sumWithoutArithmeticOperators0.getSum(5691, 201);
        int int21 = sumWithoutArithmeticOperators0.getSum(1112, 3322);
        int int24 = sumWithoutArithmeticOperators0.getSum(20418, 3606);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 152 + "'", int6 == 152);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 44 + "'", int9 == 44);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 456 + "'", int12 == 456);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 987 + "'", int15 == 987);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5892 + "'", int18 == 5892);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4434 + "'", int21 == 4434);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 24024 + "'", int24 == 24024);
    }

    @Test
    public void test3115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3115");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, (int) (short) 10);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) '4', 134);
        int int15 = sumWithoutArithmeticOperators0.getSum(18, 1);
        int int18 = sumWithoutArithmeticOperators0.getSum((int) '#', 286);
        int int21 = sumWithoutArithmeticOperators0.getSum(202, 0);
        int int24 = sumWithoutArithmeticOperators0.getSum(9342, 3649);
        java.lang.Class<?> wildcardClass25 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 186 + "'", int12 == 186);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 19 + "'", int15 == 19);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 321 + "'", int18 == 321);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 202 + "'", int21 == 202);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 12991 + "'", int24 == 12991);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3116");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (short) 100, 34);
        int int12 = sumWithoutArithmeticOperators0.getSum(289, 269);
        int int15 = sumWithoutArithmeticOperators0.getSum(766, 978);
        int int18 = sumWithoutArithmeticOperators0.getSum(925, 360);
        int int21 = sumWithoutArithmeticOperators0.getSum(2635, 55);
        int int24 = sumWithoutArithmeticOperators0.getSum(5076, 1473);
        int int27 = sumWithoutArithmeticOperators0.getSum(18037, 5993);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 134 + "'", int9 == 134);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 558 + "'", int12 == 558);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1744 + "'", int15 == 1744);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1285 + "'", int18 == 1285);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2690 + "'", int21 == 2690);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6549 + "'", int24 == 6549);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 24030 + "'", int27 == 24030);
    }

    @Test
    public void test3117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3117");
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
        int int36 = sumWithoutArithmeticOperators0.getSum(8014, 2645);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 10659 + "'", int36 == 10659);
    }

    @Test
    public void test3118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3118");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(35, (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 35);
        int int15 = sumWithoutArithmeticOperators0.getSum(352, 375);
        int int18 = sumWithoutArithmeticOperators0.getSum(122, 1327);
        int int21 = sumWithoutArithmeticOperators0.getSum(1171, 1019);
        int int24 = sumWithoutArithmeticOperators0.getSum(2464, 728);
        int int27 = sumWithoutArithmeticOperators0.getSum(9153, 728);
        int int30 = sumWithoutArithmeticOperators0.getSum(13039, 44);
        int int33 = sumWithoutArithmeticOperators0.getSum(2529, 2899);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 727 + "'", int15 == 727);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1449 + "'", int18 == 1449);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2190 + "'", int21 == 2190);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3192 + "'", int24 == 3192);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 9881 + "'", int27 == 9881);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 13083 + "'", int30 == 13083);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 5428 + "'", int33 == 5428);
    }

    @Test
    public void test3119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3119");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(35, (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 35);
        int int15 = sumWithoutArithmeticOperators0.getSum(352, 375);
        int int18 = sumWithoutArithmeticOperators0.getSum(122, 1327);
        int int21 = sumWithoutArithmeticOperators0.getSum(1171, 1019);
        int int24 = sumWithoutArithmeticOperators0.getSum(1241, 199);
        int int27 = sumWithoutArithmeticOperators0.getSum(104, 18205);
        int int30 = sumWithoutArithmeticOperators0.getSum(352, 2495);
        java.lang.Class<?> wildcardClass31 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 727 + "'", int15 == 727);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1449 + "'", int18 == 1449);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2190 + "'", int21 == 2190);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1440 + "'", int24 == 1440);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 18309 + "'", int27 == 18309);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2847 + "'", int30 == 2847);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test3120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3120");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) ' ', 35);
        int int6 = sumWithoutArithmeticOperators0.getSum(98, 180);
        int int9 = sumWithoutArithmeticOperators0.getSum(3025, 1245);
        int int12 = sumWithoutArithmeticOperators0.getSum(1327, 100);
        int int15 = sumWithoutArithmeticOperators0.getSum(352, 460);
        int int18 = sumWithoutArithmeticOperators0.getSum(4739, 3510);
        int int21 = sumWithoutArithmeticOperators0.getSum(10, 604);
        int int24 = sumWithoutArithmeticOperators0.getSum(0, 5206);
        java.lang.Class<?> wildcardClass25 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 67 + "'", int3 == 67);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 278 + "'", int6 == 278);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4270 + "'", int9 == 4270);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1427 + "'", int12 == 1427);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 812 + "'", int15 == 812);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8249 + "'", int18 == 8249);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 614 + "'", int21 == 614);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5206 + "'", int24 == 5206);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3121");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(1953, 10);
        int int15 = sumWithoutArithmeticOperators0.getSum(0, 5084);
        java.lang.Class<?> wildcardClass16 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1963 + "'", int12 == 1963);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5084 + "'", int15 == 5084);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3122");
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
        int int45 = sumWithoutArithmeticOperators0.getSum(3502, 1971);
        int int48 = sumWithoutArithmeticOperators0.getSum(221, 8338);
        java.lang.Class<?> wildcardClass49 = sumWithoutArithmeticOperators0.getClass();
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
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 5473 + "'", int45 == 5473);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 8559 + "'", int48 == 8559);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test3123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3123");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (short) 100, 34);
        int int12 = sumWithoutArithmeticOperators0.getSum(289, 269);
        int int15 = sumWithoutArithmeticOperators0.getSum(504, 3550);
        int int18 = sumWithoutArithmeticOperators0.getSum(7523, 200);
        int int21 = sumWithoutArithmeticOperators0.getSum(2619, 4131);
        java.lang.Class<?> wildcardClass22 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 134 + "'", int9 == 134);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 558 + "'", int12 == 558);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4054 + "'", int15 == 4054);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 7723 + "'", int18 == 7723);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 6750 + "'", int21 == 6750);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3124");
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
    }

    @Test
    public void test3125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3125");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 1, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(18, (int) (byte) -1);
        int int15 = sumWithoutArithmeticOperators0.getSum(9, 217);
        int int18 = sumWithoutArithmeticOperators0.getSum(934, 766);
        int int21 = sumWithoutArithmeticOperators0.getSum(216, 215);
        int int24 = sumWithoutArithmeticOperators0.getSum(620, 565);
        int int27 = sumWithoutArithmeticOperators0.getSum(14964, 29600);
        int int30 = sumWithoutArithmeticOperators0.getSum(6109, 11227);
        int int33 = sumWithoutArithmeticOperators0.getSum(302, 1519);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 17 + "'", int12 == 17);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 226 + "'", int15 == 226);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1700 + "'", int18 == 1700);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 431 + "'", int21 == 431);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1185 + "'", int24 == 1185);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 44564 + "'", int27 == 44564);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 17336 + "'", int30 == 17336);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1821 + "'", int33 == 1821);
    }

    @Test
    public void test3126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3126");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) ' ', 9);
        int int15 = sumWithoutArithmeticOperators0.getSum(253, 483);
        int int18 = sumWithoutArithmeticOperators0.getSum(243, 125);
        int int21 = sumWithoutArithmeticOperators0.getSum(302, 6357);
        int int24 = sumWithoutArithmeticOperators0.getSum(863, 2492);
        int int27 = sumWithoutArithmeticOperators0.getSum(2443, 1451);
        java.lang.Class<?> wildcardClass28 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 41 + "'", int12 == 41);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 736 + "'", int15 == 736);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 368 + "'", int18 == 368);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 6659 + "'", int21 == 6659);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3355 + "'", int24 == 3355);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3894 + "'", int27 == 3894);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3127");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(0, 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(9, (int) '#');
        int int12 = sumWithoutArithmeticOperators0.getSum(163, 52);
        int int15 = sumWithoutArithmeticOperators0.getSum(0, 200);
        int int18 = sumWithoutArithmeticOperators0.getSum(885, 876);
        int int21 = sumWithoutArithmeticOperators0.getSum(0, 16471);
        int int24 = sumWithoutArithmeticOperators0.getSum(9117, 15815);
        java.lang.Class<?> wildcardClass25 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 152 + "'", int6 == 152);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 44 + "'", int9 == 44);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 215 + "'", int12 == 215);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 200 + "'", int15 == 200);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1761 + "'", int18 == 1761);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 16471 + "'", int21 == 16471);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 24932 + "'", int24 == 24932);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3128");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(19, 21);
        int int9 = sumWithoutArithmeticOperators0.getSum(8373, 1498);
        int int12 = sumWithoutArithmeticOperators0.getSum(5566, 2589);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 40 + "'", int6 == 40);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9871 + "'", int9 == 9871);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8155 + "'", int12 == 8155);
    }

    @Test
    public void test3129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3129");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) 'a', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum(196, (int) ' ');
        int int15 = sumWithoutArithmeticOperators0.getSum(2544, 1762);
        java.lang.Class<?> wildcardClass16 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 98 + "'", int9 == 98);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 228 + "'", int12 == 228);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4306 + "'", int15 == 4306);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3130");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) 'a', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum(4773, 0);
        java.lang.Class<?> wildcardClass13 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 98 + "'", int9 == 98);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4773 + "'", int12 == 4773);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3131");
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3322 + "'", int30 == 3322);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2508 + "'", int33 == 2508);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test3132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3132");
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
        java.lang.Class<?> wildcardClass28 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 727 + "'", int15 == 727);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1449 + "'", int18 == 1449);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2190 + "'", int21 == 2190);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3192 + "'", int24 == 3192);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 944 + "'", int27 == 944);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3133");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) 0, (int) (short) -1);
        int int15 = sumWithoutArithmeticOperators0.getSum(465, 324);
        int int18 = sumWithoutArithmeticOperators0.getSum(209, 811);
        int int21 = sumWithoutArithmeticOperators0.getSum(14633, 29674);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 789 + "'", int15 == 789);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1020 + "'", int18 == 1020);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 44307 + "'", int21 == 44307);
    }

    @Test
    public void test3134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3134");
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
        int int33 = sumWithoutArithmeticOperators0.getSum(0, 1661);
        int int36 = sumWithoutArithmeticOperators0.getSum(4476, 6784);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1661 + "'", int33 == 1661);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 11260 + "'", int36 == 11260);
    }

    @Test
    public void test3135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3135");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) ' ', 35);
        int int6 = sumWithoutArithmeticOperators0.getSum(1253, 1133);
        int int9 = sumWithoutArithmeticOperators0.getSum(524, 166);
        int int12 = sumWithoutArithmeticOperators0.getSum(824, 4193);
        int int15 = sumWithoutArithmeticOperators0.getSum(5978, 1405);
        int int18 = sumWithoutArithmeticOperators0.getSum(10793, 1374);
        java.lang.Class<?> wildcardClass19 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 67 + "'", int3 == 67);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2386 + "'", int6 == 2386);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 690 + "'", int9 == 690);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5017 + "'", int12 == 5017);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7383 + "'", int15 == 7383);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 12167 + "'", int18 == 12167);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3136");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (short) 100, 34);
        int int12 = sumWithoutArithmeticOperators0.getSum(144, 21);
        int int15 = sumWithoutArithmeticOperators0.getSum(0, 35);
        int int18 = sumWithoutArithmeticOperators0.getSum(210, 36);
        int int21 = sumWithoutArithmeticOperators0.getSum(766, 1168);
        int int24 = sumWithoutArithmeticOperators0.getSum(142, 2933);
        int int27 = sumWithoutArithmeticOperators0.getSum(3192, 6059);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 134 + "'", int9 == 134);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 165 + "'", int12 == 165);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 246 + "'", int18 == 246);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1934 + "'", int21 == 1934);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3075 + "'", int24 == 3075);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 9251 + "'", int27 == 9251);
    }

    @Test
    public void test3137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3137");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(0, 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, (int) (short) 10);
        int int12 = sumWithoutArithmeticOperators0.getSum(0, 202);
        int int15 = sumWithoutArithmeticOperators0.getSum(853, 1574);
        int int18 = sumWithoutArithmeticOperators0.getSum(1050, 7227);
        java.lang.Class<?> wildcardClass19 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 152 + "'", int6 == 152);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 202 + "'", int12 == 202);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2427 + "'", int15 == 2427);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8277 + "'", int18 == 8277);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3138");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(163, 36);
        int int12 = sumWithoutArithmeticOperators0.getSum(11872, 1294);
        java.lang.Class<?> wildcardClass13 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 199 + "'", int9 == 199);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 13166 + "'", int12 == 13166);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3139");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(110, 376);
        int int12 = sumWithoutArithmeticOperators0.getSum(1172, 3707);
        int int15 = sumWithoutArithmeticOperators0.getSum(1688, 3319);
        int int18 = sumWithoutArithmeticOperators0.getSum(217, 592);
        int int21 = sumWithoutArithmeticOperators0.getSum(4975, 101);
        java.lang.Class<?> wildcardClass22 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 486 + "'", int9 == 486);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4879 + "'", int12 == 4879);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5007 + "'", int15 == 5007);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 809 + "'", int18 == 809);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5076 + "'", int21 == 5076);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3140");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (short) 100, 34);
        int int12 = sumWithoutArithmeticOperators0.getSum(144, 21);
        int int15 = sumWithoutArithmeticOperators0.getSum(0, 35);
        int int18 = sumWithoutArithmeticOperators0.getSum(210, 36);
        int int21 = sumWithoutArithmeticOperators0.getSum(154, 574);
        int int24 = sumWithoutArithmeticOperators0.getSum(2619, 0);
        int int27 = sumWithoutArithmeticOperators0.getSum(6417, 2559);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 134 + "'", int9 == 134);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 165 + "'", int12 == 165);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 246 + "'", int18 == 246);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 728 + "'", int21 == 728);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2619 + "'", int24 == 2619);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 8976 + "'", int27 == 8976);
    }

    @Test
    public void test3141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3141");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(32, (int) '4');
        int int15 = sumWithoutArithmeticOperators0.getSum(44, 100);
        int int18 = sumWithoutArithmeticOperators0.getSum(217, 238);
        int int21 = sumWithoutArithmeticOperators0.getSum(199, 427);
        int int24 = sumWithoutArithmeticOperators0.getSum(3564, 11110);
        java.lang.Class<?> wildcardClass25 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 84 + "'", int12 == 84);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 144 + "'", int15 == 144);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 455 + "'", int18 == 455);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 626 + "'", int21 == 626);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 14674 + "'", int24 == 14674);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3142");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(343, 1574);
        int int9 = sumWithoutArithmeticOperators0.getSum(3302, 2343);
        int int12 = sumWithoutArithmeticOperators0.getSum(1664, 14209);
        int int15 = sumWithoutArithmeticOperators0.getSum(104, 3629);
        int int18 = sumWithoutArithmeticOperators0.getSum(865, 7370);
        java.lang.Class<?> wildcardClass19 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1917 + "'", int6 == 1917);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5645 + "'", int9 == 5645);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15873 + "'", int12 == 15873);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3733 + "'", int15 == 3733);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8235 + "'", int18 == 8235);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3143");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(32, (int) '4');
        int int15 = sumWithoutArithmeticOperators0.getSum(1291, 1384);
        int int18 = sumWithoutArithmeticOperators0.getSum(1245, 34346);
        java.lang.Class<?> wildcardClass19 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 84 + "'", int12 == 84);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2675 + "'", int15 == 2675);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35591 + "'", int18 == 35591);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3144");
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
        int int33 = sumWithoutArithmeticOperators0.getSum(2414, 345);
        int int36 = sumWithoutArithmeticOperators0.getSum(7044, 616);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2759 + "'", int33 == 2759);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 7660 + "'", int36 == 7660);
    }

    @Test
    public void test3145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3145");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, (int) (short) 10);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) '4', 134);
        int int15 = sumWithoutArithmeticOperators0.getSum(18, 1);
        int int18 = sumWithoutArithmeticOperators0.getSum(0, (int) (short) 100);
        int int21 = sumWithoutArithmeticOperators0.getSum(416, 44);
        int int24 = sumWithoutArithmeticOperators0.getSum(1424, 1074);
        int int27 = sumWithoutArithmeticOperators0.getSum(10505, 488);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 186 + "'", int12 == 186);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 19 + "'", int15 == 19);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 460 + "'", int21 == 460);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2498 + "'", int24 == 2498);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10993 + "'", int27 == 10993);
    }

    @Test
    public void test3146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3146");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (short) 100, 34);
        int int12 = sumWithoutArithmeticOperators0.getSum(289, 269);
        int int15 = sumWithoutArithmeticOperators0.getSum(0, 343);
        int int18 = sumWithoutArithmeticOperators0.getSum(6059, 2810);
        int int21 = sumWithoutArithmeticOperators0.getSum(3618, 15575);
        java.lang.Class<?> wildcardClass22 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 134 + "'", int9 == 134);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 558 + "'", int12 == 558);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 343 + "'", int15 == 343);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8869 + "'", int18 == 8869);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 19193 + "'", int21 == 19193);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3147");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(21, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(0, 10);
        int int15 = sumWithoutArithmeticOperators0.getSum(488, 1236);
        int int18 = sumWithoutArithmeticOperators0.getSum(546, 853);
        int int21 = sumWithoutArithmeticOperators0.getSum(452, 1281);
        int int24 = sumWithoutArithmeticOperators0.getSum(666, 9075);
        int int27 = sumWithoutArithmeticOperators0.getSum(1114, 4318);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 21 + "'", int9 == 21);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1724 + "'", int15 == 1724);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1399 + "'", int18 == 1399);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1733 + "'", int21 == 1733);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 9741 + "'", int24 == 9741);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 5432 + "'", int27 == 5432);
    }

    @Test
    public void test3148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3148");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) 'a', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum(196, (int) ' ');
        int int15 = sumWithoutArithmeticOperators0.getSum(1133, 269);
        int int18 = sumWithoutArithmeticOperators0.getSum(0, 592);
        int int21 = sumWithoutArithmeticOperators0.getSum(3095, 14997);
        java.lang.Class<?> wildcardClass22 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 98 + "'", int9 == 98);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 228 + "'", int12 == 228);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1402 + "'", int15 == 1402);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 592 + "'", int18 == 592);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 18092 + "'", int21 == 18092);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3149");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(0, 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(1174, 2363);
        int int9 = sumWithoutArithmeticOperators0.getSum(184, 3406);
        int int12 = sumWithoutArithmeticOperators0.getSum(5283, 3652);
        int int15 = sumWithoutArithmeticOperators0.getSum(0, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3537 + "'", int6 == 3537);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3590 + "'", int9 == 3590);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8935 + "'", int12 == 8935);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test3150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3150");
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
        int int30 = sumWithoutArithmeticOperators0.getSum(576, 197);
        int int33 = sumWithoutArithmeticOperators0.getSum(1764, 4859);
        int int36 = sumWithoutArithmeticOperators0.getSum(9741, 16199);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 36 + "'", int15 == 36);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 53 + "'", int18 == 53);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 546 + "'", int21 == 546);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1046 + "'", int24 == 1046);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2778 + "'", int27 == 2778);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 773 + "'", int30 == 773);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 6623 + "'", int33 == 6623);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 25940 + "'", int36 == 25940);
    }

    @Test
    public void test3151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3151");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(391, 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(728, 0);
        java.lang.Class<?> wildcardClass13 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 391 + "'", int9 == 391);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 728 + "'", int12 == 728);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3152");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(0, 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(10, (int) (byte) 100);
        int int12 = sumWithoutArithmeticOperators0.getSum(251, 210);
        int int15 = sumWithoutArithmeticOperators0.getSum(246, 9);
        int int18 = sumWithoutArithmeticOperators0.getSum(1168, 216);
        int int21 = sumWithoutArithmeticOperators0.getSum(18309, 5583);
        java.lang.Class<?> wildcardClass22 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 152 + "'", int6 == 152);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 461 + "'", int12 == 461);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 255 + "'", int15 == 255);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1384 + "'", int18 == 1384);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 23892 + "'", int21 == 23892);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3153");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) -1, 19);
        int int6 = sumWithoutArithmeticOperators0.getSum(21, 35);
        int int9 = sumWithoutArithmeticOperators0.getSum(859, 454);
        int int12 = sumWithoutArithmeticOperators0.getSum(149, 188);
        int int15 = sumWithoutArithmeticOperators0.getSum(736, 983);
        int int18 = sumWithoutArithmeticOperators0.getSum(12199, 19954);
        java.lang.Class<?> wildcardClass19 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 18 + "'", int3 == 18);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 56 + "'", int6 == 56);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1313 + "'", int9 == 1313);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 337 + "'", int12 == 337);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1719 + "'", int15 == 1719);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32153 + "'", int18 == 32153);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3154");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(0, 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, (int) (short) 10);
        int int12 = sumWithoutArithmeticOperators0.getSum(107, 460);
        int int15 = sumWithoutArithmeticOperators0.getSum(1310, 3130);
        int int18 = sumWithoutArithmeticOperators0.getSum(7387, 2847);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 152 + "'", int6 == 152);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 567 + "'", int12 == 567);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4440 + "'", int15 == 4440);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10234 + "'", int18 == 10234);
    }

    @Test
    public void test3155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3155");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(21, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(107, 0);
        int int15 = sumWithoutArithmeticOperators0.getSum(289, 555);
        int int18 = sumWithoutArithmeticOperators0.getSum(9185, 3409);
        java.lang.Class<?> wildcardClass19 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 21 + "'", int9 == 21);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 107 + "'", int12 == 107);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 844 + "'", int15 == 844);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 12594 + "'", int18 == 12594);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3156");
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
        java.lang.Class<?> wildcardClass28 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 98 + "'", int9 == 98);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 228 + "'", int12 == 228);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1236 + "'", int15 == 1236);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 942 + "'", int18 == 942);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2231 + "'", int21 == 2231);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 7873 + "'", int24 == 7873);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 12238 + "'", int27 == 12238);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3157");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 1, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(21, 11);
        int int15 = sumWithoutArithmeticOperators0.getSum((int) '#', (int) (short) 1);
        int int18 = sumWithoutArithmeticOperators0.getSum(52, (int) (short) 1);
        int int21 = sumWithoutArithmeticOperators0.getSum(257, 289);
        int int24 = sumWithoutArithmeticOperators0.getSum(375, 671);
        int int27 = sumWithoutArithmeticOperators0.getSum(363, 6549);
        java.lang.Class<?> wildcardClass28 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 36 + "'", int15 == 36);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 53 + "'", int18 == 53);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 546 + "'", int21 == 546);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1046 + "'", int24 == 1046);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 6912 + "'", int27 == 6912);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3158");
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
        int int36 = sumWithoutArithmeticOperators0.getSum(3412, 2696);
        int int39 = sumWithoutArithmeticOperators0.getSum(18837, 552);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 6108 + "'", int36 == 6108);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 19389 + "'", int39 == 19389);
    }

    @Test
    public void test3159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3159");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 1, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(21, 11);
        int int15 = sumWithoutArithmeticOperators0.getSum((int) '#', (int) (short) 1);
        int int18 = sumWithoutArithmeticOperators0.getSum(101, 42);
        int int21 = sumWithoutArithmeticOperators0.getSum(885, 3452);
        int int24 = sumWithoutArithmeticOperators0.getSum(181, 1068);
        int int27 = sumWithoutArithmeticOperators0.getSum(0, 3329);
        java.lang.Class<?> wildcardClass28 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 36 + "'", int15 == 36);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 143 + "'", int18 == 143);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4337 + "'", int21 == 4337);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1249 + "'", int24 == 1249);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3329 + "'", int27 == 3329);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3160");
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
        int int39 = sumWithoutArithmeticOperators0.getSum(11960, 243);
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 12203 + "'", int39 == 12203);
    }

    @Test
    public void test3161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3161");
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
        int int30 = sumWithoutArithmeticOperators0.getSum(3517, 30646);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 36 + "'", int15 == 36);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 53 + "'", int18 == 53);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1579 + "'", int21 == 1579);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 12403 + "'", int24 == 12403);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 19223 + "'", int27 == 19223);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 34163 + "'", int30 == 34163);
    }

    @Test
    public void test3162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3162");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 1, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(21, 11);
        int int15 = sumWithoutArithmeticOperators0.getSum((int) '#', (int) (short) 1);
        int int18 = sumWithoutArithmeticOperators0.getSum(52, (int) (short) 1);
        int int21 = sumWithoutArithmeticOperators0.getSum(1067, 512);
        int int24 = sumWithoutArithmeticOperators0.getSum(2251, 491);
        java.lang.Class<?> wildcardClass25 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 36 + "'", int15 == 36);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 53 + "'", int18 == 53);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1579 + "'", int21 == 1579);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2742 + "'", int24 == 2742);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3163");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(260, 1327);
        int int12 = sumWithoutArithmeticOperators0.getSum(0, 7981);
        int int15 = sumWithoutArithmeticOperators0.getSum(5865, 18574);
        java.lang.Class<?> wildcardClass16 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1587 + "'", int9 == 1587);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 7981 + "'", int12 == 7981);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 24439 + "'", int15 == 24439);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3164");
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
        int int36 = sumWithoutArithmeticOperators0.getSum(2535, 0);
        java.lang.Class<?> wildcardClass37 = sumWithoutArithmeticOperators0.getClass();
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2535 + "'", int36 == 2535);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test3165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3165");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(10, (int) (byte) 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(306, 180);
        int int9 = sumWithoutArithmeticOperators0.getSum(736, 1241);
        int int12 = sumWithoutArithmeticOperators0.getSum(108, 683);
        java.lang.Class<?> wildcardClass13 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 486 + "'", int6 == 486);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1977 + "'", int9 == 1977);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 791 + "'", int12 == 791);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3166");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, (int) (short) 10);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) '4', 134);
        int int15 = sumWithoutArithmeticOperators0.getSum(162, 162);
        int int18 = sumWithoutArithmeticOperators0.getSum(156, 491);
        int int21 = sumWithoutArithmeticOperators0.getSum(5534, 2492);
        int int24 = sumWithoutArithmeticOperators0.getSum(18, 9649);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 186 + "'", int12 == 186);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 324 + "'", int15 == 324);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 647 + "'", int18 == 647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8026 + "'", int21 == 8026);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 9667 + "'", int24 == 9667);
    }

    @Test
    public void test3167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3167");
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
        int int30 = sumWithoutArithmeticOperators0.getSum(30646, 13259);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 33 + "'", int15 == 33);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 107 + "'", int21 == 107);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 911 + "'", int24 == 911);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 27882 + "'", int27 == 27882);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 43905 + "'", int30 == 43905);
    }

    @Test
    public void test3168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3168");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 1, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(21, 11);
        int int15 = sumWithoutArithmeticOperators0.getSum((int) '#', (int) (short) 1);
        int int18 = sumWithoutArithmeticOperators0.getSum(101, 42);
        int int21 = sumWithoutArithmeticOperators0.getSum(151, 696);
        int int24 = sumWithoutArithmeticOperators0.getSum(635, 2202);
        int int27 = sumWithoutArithmeticOperators0.getSum(3319, 812);
        int int30 = sumWithoutArithmeticOperators0.getSum(5520, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 36 + "'", int15 == 36);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 143 + "'", int18 == 143);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 847 + "'", int21 == 847);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2837 + "'", int24 == 2837);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4131 + "'", int27 == 4131);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 5520 + "'", int30 == 5520);
    }

    @Test
    public void test3169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3169");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 1, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(21, 11);
        int int15 = sumWithoutArithmeticOperators0.getSum(0, 34);
        int int18 = sumWithoutArithmeticOperators0.getSum(2254, 9647);
        int int21 = sumWithoutArithmeticOperators0.getSum(9265, 816);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 34 + "'", int15 == 34);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 11901 + "'", int18 == 11901);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10081 + "'", int21 == 10081);
    }

    @Test
    public void test3170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3170");
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
        int int36 = sumWithoutArithmeticOperators0.getSum(200, 4270);
        int int39 = sumWithoutArithmeticOperators0.getSum(840, 7141);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 4470 + "'", int36 == 4470);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 7981 + "'", int39 == 7981);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test3171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3171");
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
        int int42 = sumWithoutArithmeticOperators0.getSum(18515, 10014);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 105 + "'", int30 == 105);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 13923 + "'", int33 == 13923);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 10203 + "'", int36 == 10203);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 4487 + "'", int39 == 4487);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 28529 + "'", int42 == 28529);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test3172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3172");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(21, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (short) 100);
        int int15 = sumWithoutArithmeticOperators0.getSum(0, 499);
        int int18 = sumWithoutArithmeticOperators0.getSum(6050, 2805);
        int int21 = sumWithoutArithmeticOperators0.getSum(1169, 0);
        int int24 = sumWithoutArithmeticOperators0.getSum(8331, 3733);
        int int27 = sumWithoutArithmeticOperators0.getSum(1807, 240);
        java.lang.Class<?> wildcardClass28 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 21 + "'", int9 == 21);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 200 + "'", int12 == 200);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 499 + "'", int15 == 499);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8855 + "'", int18 == 8855);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1169 + "'", int21 == 1169);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 12064 + "'", int24 == 12064);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2047 + "'", int27 == 2047);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3173");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(129, 109);
        int int12 = sumWithoutArithmeticOperators0.getSum(390, 109);
        int int15 = sumWithoutArithmeticOperators0.getSum(523, (int) ' ');
        int int18 = sumWithoutArithmeticOperators0.getSum(486, 107);
        int int21 = sumWithoutArithmeticOperators0.getSum(309, 803);
        int int24 = sumWithoutArithmeticOperators0.getSum(558, 1029);
        int int27 = sumWithoutArithmeticOperators0.getSum(6410, 2223);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 238 + "'", int9 == 238);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 499 + "'", int12 == 499);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 555 + "'", int15 == 555);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 593 + "'", int18 == 593);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1112 + "'", int21 == 1112);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1587 + "'", int24 == 1587);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 8633 + "'", int27 == 8633);
    }

    @Test
    public void test3174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3174");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int15 = sumWithoutArithmeticOperators0.getSum(122, 67);
        int int18 = sumWithoutArithmeticOperators0.getSum(473, 360);
        int int21 = sumWithoutArithmeticOperators0.getSum(2512, 615);
        int int24 = sumWithoutArithmeticOperators0.getSum(2817, 1105);
        int int27 = sumWithoutArithmeticOperators0.getSum(816, 5343);
        int int30 = sumWithoutArithmeticOperators0.getSum(11, 3049);
        int int33 = sumWithoutArithmeticOperators0.getSum(11110, 16995);
        java.lang.Class<?> wildcardClass34 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 189 + "'", int15 == 189);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 833 + "'", int18 == 833);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3127 + "'", int21 == 3127);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3922 + "'", int24 == 3922);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 6159 + "'", int27 == 6159);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3060 + "'", int30 == 3060);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 28105 + "'", int33 == 28105);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test3175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3175");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (short) 100, 34);
        int int12 = sumWithoutArithmeticOperators0.getSum(144, 21);
        int int15 = sumWithoutArithmeticOperators0.getSum(52, 104);
        int int18 = sumWithoutArithmeticOperators0.getSum(590, 0);
        int int21 = sumWithoutArithmeticOperators0.getSum(132, 108);
        int int24 = sumWithoutArithmeticOperators0.getSum(1278, 101);
        int int27 = sumWithoutArithmeticOperators0.getSum(11110, 2932);
        java.lang.Class<?> wildcardClass28 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 134 + "'", int9 == 134);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 165 + "'", int12 == 165);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 156 + "'", int15 == 156);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 590 + "'", int18 == 590);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 240 + "'", int21 == 240);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1379 + "'", int24 == 1379);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 14042 + "'", int27 == 14042);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3176");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 0, 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(2279, 615);
        int int15 = sumWithoutArithmeticOperators0.getSum(3726, 132);
        int int18 = sumWithoutArithmeticOperators0.getSum(5889, 25788);
        int int21 = sumWithoutArithmeticOperators0.getSum(26272, 10154);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2894 + "'", int12 == 2894);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3858 + "'", int15 == 3858);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 31677 + "'", int18 == 31677);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 36426 + "'", int21 == 36426);
    }

    @Test
    public void test3177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3177");
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
        int int45 = sumWithoutArithmeticOperators0.getSum(2932, 810);
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
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 3742 + "'", int45 == 3742);
    }

    @Test
    public void test3178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3178");
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
        int int30 = sumWithoutArithmeticOperators0.getSum(5096, 15795);
        int int33 = sumWithoutArithmeticOperators0.getSum(3478, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 36 + "'", int15 == 36);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 53 + "'", int18 == 53);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 463 + "'", int24 == 463);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1291 + "'", int27 == 1291);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 20891 + "'", int30 == 20891);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 3478 + "'", int33 == 3478);
    }

    @Test
    public void test3179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3179");
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
        int int45 = sumWithoutArithmeticOperators0.getSum(8869, 3908);
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 6903 + "'", int39 == 6903);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 32785 + "'", int42 == 32785);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 12777 + "'", int45 == 12777);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test3180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3180");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) 'a', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum(1668, 3617);
        java.lang.Class<?> wildcardClass13 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 98 + "'", int9 == 98);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5285 + "'", int12 == 5285);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3181");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(40, 269);
        int int6 = sumWithoutArithmeticOperators0.getSum(152, 465);
        int int9 = sumWithoutArithmeticOperators0.getSum(9307, 15667);
        int int12 = sumWithoutArithmeticOperators0.getSum(11552, 4274);
        java.lang.Class<?> wildcardClass13 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 309 + "'", int3 == 309);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 617 + "'", int6 == 617);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 24974 + "'", int9 == 24974);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15826 + "'", int12 == 15826);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3182");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 1, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(21, 11);
        int int15 = sumWithoutArithmeticOperators0.getSum((int) '#', (int) (short) 1);
        int int18 = sumWithoutArithmeticOperators0.getSum(465, 9520);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 36 + "'", int15 == 36);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9985 + "'", int18 == 9985);
    }

    @Test
    public void test3183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3183");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(21, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (short) 100);
        int int15 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 18);
        int int18 = sumWithoutArithmeticOperators0.getSum(196, 1236);
        int int21 = sumWithoutArithmeticOperators0.getSum(1352, 727);
        int int24 = sumWithoutArithmeticOperators0.getSum(4046, 8518);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 21 + "'", int9 == 21);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 200 + "'", int12 == 200);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 18 + "'", int15 == 18);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1432 + "'", int18 == 1432);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2079 + "'", int21 == 2079);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 12564 + "'", int24 == 12564);
    }

    @Test
    public void test3184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3184");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(40, 269);
        int int6 = sumWithoutArithmeticOperators0.getSum(202, 523);
        int int9 = sumWithoutArithmeticOperators0.getSum(286, 1337);
        int int12 = sumWithoutArithmeticOperators0.getSum(89, 1268);
        int int15 = sumWithoutArithmeticOperators0.getSum(1012, 786);
        int int18 = sumWithoutArithmeticOperators0.getSum(8413, 6422);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 309 + "'", int3 == 309);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 725 + "'", int6 == 725);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1623 + "'", int9 == 1623);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1357 + "'", int12 == 1357);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1798 + "'", int15 == 1798);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 14835 + "'", int18 == 14835);
    }

    @Test
    public void test3185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3185");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum(129, 165);
        int int12 = sumWithoutArithmeticOperators0.getSum(152, 108);
        int int15 = sumWithoutArithmeticOperators0.getSum(117, 0);
        int int18 = sumWithoutArithmeticOperators0.getSum(1428, 4263);
        int int21 = sumWithoutArithmeticOperators0.getSum(8829, 1432);
        int int24 = sumWithoutArithmeticOperators0.getSum(5660, 2060);
        int int27 = sumWithoutArithmeticOperators0.getSum(4469, 125);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 294 + "'", int9 == 294);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 260 + "'", int12 == 260);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 117 + "'", int15 == 117);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5691 + "'", int18 == 5691);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10261 + "'", int21 == 10261);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 7720 + "'", int24 == 7720);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4594 + "'", int27 == 4594);
    }

    @Test
    public void test3186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3186");
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
        int int33 = sumWithoutArithmeticOperators0.getSum(14303, 1574);
        int int36 = sumWithoutArithmeticOperators0.getSum(2035, 2847);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3419 + "'", int30 == 3419);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 15877 + "'", int33 == 15877);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 4882 + "'", int36 == 4882);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test3187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3187");
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
        int int36 = sumWithoutArithmeticOperators0.getSum(1762, 863);
        int int39 = sumWithoutArithmeticOperators0.getSum(6074, 2590);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2625 + "'", int36 == 2625);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 8664 + "'", int39 == 8664);
    }

    @Test
    public void test3188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3188");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) -1, 19);
        int int6 = sumWithoutArithmeticOperators0.getSum(21, 35);
        int int9 = sumWithoutArithmeticOperators0.getSum(859, 454);
        int int12 = sumWithoutArithmeticOperators0.getSum(1253, 461);
        int int15 = sumWithoutArithmeticOperators0.getSum(3492, 4374);
        int int18 = sumWithoutArithmeticOperators0.getSum(10261, 32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 18 + "'", int3 == 18);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 56 + "'", int6 == 56);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1313 + "'", int9 == 1313);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1714 + "'", int12 == 1714);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7866 + "'", int15 == 7866);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10293 + "'", int18 == 10293);
    }

    @Test
    public void test3189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3189");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(257, 250);
        int int12 = sumWithoutArithmeticOperators0.getSum(221, 360);
        int int15 = sumWithoutArithmeticOperators0.getSum(885, (int) '#');
        int int18 = sumWithoutArithmeticOperators0.getSum(13806, 0);
        int int21 = sumWithoutArithmeticOperators0.getSum(11552, 822);
        int int24 = sumWithoutArithmeticOperators0.getSum(671, 11566);
        java.lang.Class<?> wildcardClass25 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 507 + "'", int9 == 507);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 581 + "'", int12 == 581);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 920 + "'", int15 == 920);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 13806 + "'", int18 == 13806);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 12374 + "'", int21 == 12374);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 12237 + "'", int24 == 12237);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3190");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(129, 109);
        int int12 = sumWithoutArithmeticOperators0.getSum(390, 109);
        int int15 = sumWithoutArithmeticOperators0.getSum(11, (int) (short) 0);
        int int18 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 35);
        int int21 = sumWithoutArithmeticOperators0.getSum(727, 460);
        int int24 = sumWithoutArithmeticOperators0.getSum(1556, 2767);
        int int27 = sumWithoutArithmeticOperators0.getSum(3341, 141);
        java.lang.Class<?> wildcardClass28 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 238 + "'", int9 == 238);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 499 + "'", int12 == 499);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 11 + "'", int15 == 11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 34 + "'", int18 == 34);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1187 + "'", int21 == 1187);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4323 + "'", int24 == 4323);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3482 + "'", int27 == 3482);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3191");
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
        int int30 = sumWithoutArithmeticOperators0.getSum(9342, 7020);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 84 + "'", int12 == 84);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 144 + "'", int15 == 144);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 163 + "'", int18 == 163);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 7 + "'", int21 == 7);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 724 + "'", int24 == 724);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 830 + "'", int27 == 830);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 16362 + "'", int30 == 16362);
    }

    @Test
    public void test3192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3192");
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
        int int42 = sumWithoutArithmeticOperators0.getSum(6114, 16842);
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
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 22956 + "'", int42 == 22956);
    }

    @Test
    public void test3193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3193");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, (int) (short) 10);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) '4', 134);
        int int15 = sumWithoutArithmeticOperators0.getSum(162, 162);
        int int18 = sumWithoutArithmeticOperators0.getSum(156, 491);
        int int21 = sumWithoutArithmeticOperators0.getSum(1291, 352);
        int int24 = sumWithoutArithmeticOperators0.getSum(2251, 1373);
        int int27 = sumWithoutArithmeticOperators0.getSum(4975, 5978);
        int int30 = sumWithoutArithmeticOperators0.getSum(0, 8235);
        int int33 = sumWithoutArithmeticOperators0.getSum(17291, 265);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 186 + "'", int12 == 186);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 324 + "'", int15 == 324);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 647 + "'", int18 == 647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1643 + "'", int21 == 1643);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3624 + "'", int24 == 3624);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10953 + "'", int27 == 10953);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 8235 + "'", int30 == 8235);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 17556 + "'", int33 == 17556);
    }

    @Test
    public void test3194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3194");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(129, 109);
        int int12 = sumWithoutArithmeticOperators0.getSum(390, 109);
        int int15 = sumWithoutArithmeticOperators0.getSum(11, (int) (short) 0);
        int int18 = sumWithoutArithmeticOperators0.getSum(245, 56);
        int int21 = sumWithoutArithmeticOperators0.getSum(7171, 1384);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 238 + "'", int9 == 238);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 499 + "'", int12 == 499);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 11 + "'", int15 == 11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 301 + "'", int18 == 301);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8555 + "'", int21 == 8555);
    }

    @Test
    public void test3195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3195");
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
        int int30 = sumWithoutArithmeticOperators0.getSum(5084, 8916);
        java.lang.Class<?> wildcardClass31 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 104 + "'", int12 == 104);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 290 + "'", int15 == 290);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 455 + "'", int18 == 455);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 16007 + "'", int21 == 16007);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2728 + "'", int24 == 2728);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4318 + "'", int27 == 4318);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 14000 + "'", int30 == 14000);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test3196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3196");
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
        int int45 = sumWithoutArithmeticOperators0.getSum(780, 23643);
        java.lang.Class<?> wildcardClass46 = sumWithoutArithmeticOperators0.getClass();
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
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 24423 + "'", int45 == 24423);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test3197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3197");
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
        java.lang.Class<?> wildcardClass34 = sumWithoutArithmeticOperators0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test3198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3198");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(257, 250);
        int int12 = sumWithoutArithmeticOperators0.getSum(278, 2115);
        int int15 = sumWithoutArithmeticOperators0.getSum(5508, 18977);
        int int18 = sumWithoutArithmeticOperators0.getSum((int) (short) 100, 1398);
        int int21 = sumWithoutArithmeticOperators0.getSum(23440, 3176);
        java.lang.Class<?> wildcardClass22 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 507 + "'", int9 == 507);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2393 + "'", int12 == 2393);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 24485 + "'", int15 == 24485);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1498 + "'", int18 == 1498);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 26616 + "'", int21 == 26616);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3199");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(40, 269);
        int int6 = sumWithoutArithmeticOperators0.getSum(202, 523);
        int int9 = sumWithoutArithmeticOperators0.getSum(5103, 1310);
        int int12 = sumWithoutArithmeticOperators0.getSum(1272, 3164);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 309 + "'", int3 == 309);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 725 + "'", int6 == 725);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 6413 + "'", int9 == 6413);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4436 + "'", int12 == 4436);
    }

    @Test
    public void test3200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3200");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(35, (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 35);
        int int15 = sumWithoutArithmeticOperators0.getSum(352, 375);
        int int18 = sumWithoutArithmeticOperators0.getSum(122, 1327);
        int int21 = sumWithoutArithmeticOperators0.getSum(1171, 1019);
        int int24 = sumWithoutArithmeticOperators0.getSum(1241, 199);
        int int27 = sumWithoutArithmeticOperators0.getSum(1574, 28456);
        int int30 = sumWithoutArithmeticOperators0.getSum(18103, 7800);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 727 + "'", int15 == 727);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1449 + "'", int18 == 1449);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2190 + "'", int21 == 2190);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1440 + "'", int24 == 1440);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 30030 + "'", int27 == 30030);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 25903 + "'", int30 == 25903);
    }

    @Test
    public void test3201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3201");
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
        int int33 = sumWithoutArithmeticOperators0.getSum(5566, 1937);
        int int36 = sumWithoutArithmeticOperators0.getSum(9805, 7545);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 7503 + "'", int33 == 7503);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 17350 + "'", int36 == 17350);
    }

    @Test
    public void test3202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3202");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(51, 53);
        int int15 = sumWithoutArithmeticOperators0.getSum(238, (int) '4');
        int int18 = sumWithoutArithmeticOperators0.getSum(1044, 84);
        int int21 = sumWithoutArithmeticOperators0.getSum(379, 246);
        int int24 = sumWithoutArithmeticOperators0.getSum(816, 7715);
        int int27 = sumWithoutArithmeticOperators0.getSum(3360, 14624);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 104 + "'", int12 == 104);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 290 + "'", int15 == 290);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1128 + "'", int18 == 1128);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 625 + "'", int21 == 625);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 8531 + "'", int24 == 8531);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 17984 + "'", int27 == 17984);
    }

    @Test
    public void test3203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3203");
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
        java.lang.Class<?> wildcardClass31 = sumWithoutArithmeticOperators0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test3204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3204");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(40, 269);
        int int6 = sumWithoutArithmeticOperators0.getSum(202, 523);
        int int9 = sumWithoutArithmeticOperators0.getSum(286, 1337);
        int int12 = sumWithoutArithmeticOperators0.getSum(8301, 390);
        int int15 = sumWithoutArithmeticOperators0.getSum(15282, 987);
        java.lang.Class<?> wildcardClass16 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 309 + "'", int3 == 309);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 725 + "'", int6 == 725);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1623 + "'", int9 == 1623);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8691 + "'", int12 == 8691);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 16269 + "'", int15 == 16269);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3205");
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
        int int30 = sumWithoutArithmeticOperators0.getSum(13132, 10257);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 186 + "'", int12 == 186);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 19 + "'", int15 == 19);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 42 + "'", int18 == 42);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 17 + "'", int21 == 17);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4755 + "'", int24 == 4755);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2472 + "'", int27 == 2472);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 23389 + "'", int30 == 23389);
    }

    @Test
    public void test3206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3206");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(391, 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(1448, 2449);
        int int15 = sumWithoutArithmeticOperators0.getSum(1698, 955);
        int int18 = sumWithoutArithmeticOperators0.getSum(9557, 2696);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 391 + "'", int9 == 391);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3897 + "'", int12 == 3897);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2653 + "'", int15 == 2653);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 12253 + "'", int18 == 12253);
    }

    @Test
    public void test3207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3207");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(391, 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(4383, 576);
        int int15 = sumWithoutArithmeticOperators0.getSum(15667, 14352);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 391 + "'", int9 == 391);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4959 + "'", int12 == 4959);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 30019 + "'", int15 == 30019);
    }

    @Test
    public void test3208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3208");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) 'a', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum(196, (int) ' ');
        int int15 = sumWithoutArithmeticOperators0.getSum(266, 853);
        int int18 = sumWithoutArithmeticOperators0.getSum(46, 101);
        int int21 = sumWithoutArithmeticOperators0.getSum(52, 696);
        int int24 = sumWithoutArithmeticOperators0.getSum(134, 242);
        int int27 = sumWithoutArithmeticOperators0.getSum(4146, 17054);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 98 + "'", int9 == 98);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 228 + "'", int12 == 228);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1119 + "'", int15 == 1119);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 147 + "'", int18 == 147);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 748 + "'", int21 == 748);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 376 + "'", int24 == 376);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 21200 + "'", int27 == 21200);
    }

    @Test
    public void test3209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3209");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, (int) (short) 10);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) '4', 134);
        int int15 = sumWithoutArithmeticOperators0.getSum(209, 154);
        int int18 = sumWithoutArithmeticOperators0.getSum(19, 283);
        int int21 = sumWithoutArithmeticOperators0.getSum(7477, 3060);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 186 + "'", int12 == 186);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 363 + "'", int15 == 363);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 302 + "'", int18 == 302);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10537 + "'", int21 == 10537);
    }

    @Test
    public void test3210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3210");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, (int) (short) 10);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) '4', 134);
        int int15 = sumWithoutArithmeticOperators0.getSum(18, 1);
        int int18 = sumWithoutArithmeticOperators0.getSum(0, (int) (short) 100);
        int int21 = sumWithoutArithmeticOperators0.getSum(1180, 601);
        int int24 = sumWithoutArithmeticOperators0.getSum(1582, 1261);
        int int27 = sumWithoutArithmeticOperators0.getSum(1807, 5764);
        int int30 = sumWithoutArithmeticOperators0.getSum(2759, 2707);
        java.lang.Class<?> wildcardClass31 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 186 + "'", int12 == 186);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 19 + "'", int15 == 19);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1781 + "'", int21 == 1781);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2843 + "'", int24 == 2843);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 7571 + "'", int27 == 7571);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 5466 + "'", int30 == 5466);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test3211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3211");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(32, (int) '4');
        int int15 = sumWithoutArithmeticOperators0.getSum(44, 100);
        int int18 = sumWithoutArithmeticOperators0.getSum(17, 19);
        int int21 = sumWithoutArithmeticOperators0.getSum(1376, 54);
        int int24 = sumWithoutArithmeticOperators0.getSum(18033, 5224);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 84 + "'", int12 == 84);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 144 + "'", int15 == 144);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 36 + "'", int18 == 36);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1430 + "'", int21 == 1430);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 23257 + "'", int24 == 23257);
    }

    @Test
    public void test3212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3212");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 1, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(18, (int) (byte) -1);
        int int15 = sumWithoutArithmeticOperators0.getSum(526, 727);
        int int18 = sumWithoutArithmeticOperators0.getSum(1967, 810);
        int int21 = sumWithoutArithmeticOperators0.getSum(321, 376);
        int int24 = sumWithoutArithmeticOperators0.getSum(181, 1099);
        int int27 = sumWithoutArithmeticOperators0.getSum(569, 53);
        int int30 = sumWithoutArithmeticOperators0.getSum(6076, 4562);
        java.lang.Class<?> wildcardClass31 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 17 + "'", int12 == 17);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1253 + "'", int15 == 1253);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2777 + "'", int18 == 2777);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 697 + "'", int21 == 697);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1280 + "'", int24 == 1280);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 622 + "'", int27 == 622);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10638 + "'", int30 == 10638);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test3213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3213");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(51, 53);
        int int15 = sumWithoutArithmeticOperators0.getSum(238, (int) '4');
        int int18 = sumWithoutArithmeticOperators0.getSum(1044, 84);
        int int21 = sumWithoutArithmeticOperators0.getSum(859, 9);
        int int24 = sumWithoutArithmeticOperators0.getSum(11901, 6301);
        java.lang.Class<?> wildcardClass25 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 104 + "'", int12 == 104);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 290 + "'", int15 == 290);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1128 + "'", int18 == 1128);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 868 + "'", int21 == 868);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 18202 + "'", int24 == 18202);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3214");
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
        int int30 = sumWithoutArithmeticOperators0.getSum(683, 711);
        int int33 = sumWithoutArithmeticOperators0.getSum(3196, 3341);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 134 + "'", int9 == 134);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 165 + "'", int12 == 165);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 246 + "'", int18 == 246);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1934 + "'", int21 == 1934);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 692 + "'", int24 == 692);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2924 + "'", int27 == 2924);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1394 + "'", int30 == 1394);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 6537 + "'", int33 == 6537);
    }

    @Test
    public void test3215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3215");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(0, 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(162, 35);
        int int9 = sumWithoutArithmeticOperators0.getSum(596, 1623);
        int int12 = sumWithoutArithmeticOperators0.getSum(4456, 4739);
        int int15 = sumWithoutArithmeticOperators0.getSum(5408, 3218);
        int int18 = sumWithoutArithmeticOperators0.getSum(8619, 2491);
        int int21 = sumWithoutArithmeticOperators0.getSum(6951, 4890);
        int int24 = sumWithoutArithmeticOperators0.getSum(5172, 4311);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 197 + "'", int6 == 197);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2219 + "'", int9 == 2219);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9195 + "'", int12 == 9195);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8626 + "'", int15 == 8626);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 11110 + "'", int18 == 11110);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 11841 + "'", int21 == 11841);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 9483 + "'", int24 == 9483);
    }

    @Test
    public void test3216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3216");
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
        int int30 = sumWithoutArithmeticOperators0.getSum(7629, 672);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 238 + "'", int9 == 238);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 499 + "'", int12 == 499);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 55 + "'", int15 == 55);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 243 + "'", int18 == 243);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2535 + "'", int21 == 2535);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 11202 + "'", int24 == 11202);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1166 + "'", int27 == 1166);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 8301 + "'", int30 == 8301);
    }

    @Test
    public void test3217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3217");
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
        int int33 = sumWithoutArithmeticOperators0.getSum(1447, 2435);
        int int36 = sumWithoutArithmeticOperators0.getSum(9016, 2417);
        java.lang.Class<?> wildcardClass37 = sumWithoutArithmeticOperators0.getClass();
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 3882 + "'", int33 == 3882);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 11433 + "'", int36 == 11433);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test3218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3218");
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
        int int30 = sumWithoutArithmeticOperators0.getSum(2855, 1121);
        java.lang.Class<?> wildcardClass31 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 122 + "'", int15 == 122);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 162 + "'", int18 == 162);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 623 + "'", int21 == 623);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4380 + "'", int24 == 4380);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 6993 + "'", int27 == 6993);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3976 + "'", int30 == 3976);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test3219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3219");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(0, 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(10, (int) (byte) 100);
        int int12 = sumWithoutArithmeticOperators0.getSum(725, 42);
        int int15 = sumWithoutArithmeticOperators0.getSum(269, 368);
        int int18 = sumWithoutArithmeticOperators0.getSum(414, 5208);
        int int21 = sumWithoutArithmeticOperators0.getSum(33872, 20701);
        java.lang.Class<?> wildcardClass22 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 152 + "'", int6 == 152);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 767 + "'", int12 == 767);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 637 + "'", int15 == 637);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5622 + "'", int18 == 5622);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 54573 + "'", int21 == 54573);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3220");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((-1), 35);
        int int15 = sumWithoutArithmeticOperators0.getSum(163, 17);
        int int18 = sumWithoutArithmeticOperators0.getSum(19, 195);
        int int21 = sumWithoutArithmeticOperators0.getSum(2741, 2956);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 180 + "'", int15 == 180);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 214 + "'", int18 == 214);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5697 + "'", int21 == 5697);
    }

    @Test
    public void test3221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3221");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(35, (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 35);
        int int15 = sumWithoutArithmeticOperators0.getSum(352, 375);
        int int18 = sumWithoutArithmeticOperators0.getSum(122, 1327);
        int int21 = sumWithoutArithmeticOperators0.getSum(1171, 1019);
        int int24 = sumWithoutArithmeticOperators0.getSum(7137, 0);
        java.lang.Class<?> wildcardClass25 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 727 + "'", int15 == 727);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1449 + "'", int18 == 1449);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2190 + "'", int21 == 2190);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 7137 + "'", int24 == 7137);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3222");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((-1), 35);
        int int15 = sumWithoutArithmeticOperators0.getSum(100, 0);
        int int18 = sumWithoutArithmeticOperators0.getSum(722, 789);
        int int21 = sumWithoutArithmeticOperators0.getSum(567, 1171);
        int int24 = sumWithoutArithmeticOperators0.getSum(888, 1511);
        int int27 = sumWithoutArithmeticOperators0.getSum(9361, 7400);
        int int30 = sumWithoutArithmeticOperators0.getSum(8803, 4278);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1511 + "'", int18 == 1511);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1738 + "'", int21 == 1738);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2399 + "'", int24 == 2399);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 16761 + "'", int27 == 16761);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 13081 + "'", int30 == 13081);
    }

    @Test
    public void test3223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3223");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(125, 245);
        int int9 = sumWithoutArithmeticOperators0.getSum(4433, 2339);
        int int12 = sumWithoutArithmeticOperators0.getSum(3536, 5983);
        int int15 = sumWithoutArithmeticOperators0.getSum(7353, 19644);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 370 + "'", int6 == 370);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 6772 + "'", int9 == 6772);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9519 + "'", int12 == 9519);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 26997 + "'", int15 == 26997);
    }

    @Test
    public void test3224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3224");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, (int) (short) 10);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) '4', 134);
        int int15 = sumWithoutArithmeticOperators0.getSum(209, 154);
        int int18 = sumWithoutArithmeticOperators0.getSum(1759, 422);
        int int21 = sumWithoutArithmeticOperators0.getSum(1709, 3266);
        int int24 = sumWithoutArithmeticOperators0.getSum(2079, 33872);
        java.lang.Class<?> wildcardClass25 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 186 + "'", int12 == 186);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 363 + "'", int15 == 363);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2181 + "'", int18 == 2181);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4975 + "'", int21 == 4975);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35951 + "'", int24 == 35951);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3225");
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
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 17 + "'", int12 == 17);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 226 + "'", int15 == 226);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 631 + "'", int18 == 631);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 7195 + "'", int21 == 7195);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1197 + "'", int24 == 1197);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 12410 + "'", int27 == 12410);
    }

    @Test
    public void test3226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3226");
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
        int int30 = sumWithoutArithmeticOperators0.getSum(237, 160);
        int int33 = sumWithoutArithmeticOperators0.getSum(1163, 11577);
        java.lang.Class<?> wildcardClass34 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 33 + "'", int15 == 33);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 163 + "'", int18 == 163);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 295 + "'", int21 == 295);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 376 + "'", int24 == 376);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 144 + "'", int27 == 144);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 397 + "'", int30 == 397);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 12740 + "'", int33 == 12740);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test3227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3227");
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
        int int30 = sumWithoutArithmeticOperators0.getSum(228, 260);
        int int33 = sumWithoutArithmeticOperators0.getSum(1187, 213);
        int int36 = sumWithoutArithmeticOperators0.getSum(6443, 1023);
        int int39 = sumWithoutArithmeticOperators0.getSum(9450, 2042);
        int int42 = sumWithoutArithmeticOperators0.getSum(18794, 3237);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 33 + "'", int15 == 33);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 163 + "'", int18 == 163);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 295 + "'", int21 == 295);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 76 + "'", int24 == 76);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 213 + "'", int27 == 213);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 488 + "'", int30 == 488);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1400 + "'", int33 == 1400);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 7466 + "'", int36 == 7466);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 11492 + "'", int39 == 11492);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 22031 + "'", int42 == 22031);
    }

    @Test
    public void test3228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3228");
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
        java.lang.Class<?> wildcardClass28 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 238 + "'", int9 == 238);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 499 + "'", int12 == 499);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 11 + "'", int15 == 11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 34 + "'", int18 == 34);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1448 + "'", int21 == 1448);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2492 + "'", int24 == 2492);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 25820 + "'", int27 == 25820);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3229");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(35, (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 35);
        int int15 = sumWithoutArithmeticOperators0.getSum(53, 36);
        int int18 = sumWithoutArithmeticOperators0.getSum(844, 289);
        int int21 = sumWithoutArithmeticOperators0.getSum((int) (byte) 0, 2476);
        int int24 = sumWithoutArithmeticOperators0.getSum(853, 1398);
        java.lang.Class<?> wildcardClass25 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 89 + "'", int15 == 89);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1133 + "'", int18 == 1133);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2476 + "'", int21 == 2476);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2251 + "'", int24 == 2251);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3230");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum(0, 486);
        int int12 = sumWithoutArithmeticOperators0.getSum(725, 911);
        int int15 = sumWithoutArithmeticOperators0.getSum(4858, 5188);
        int int18 = sumWithoutArithmeticOperators0.getSum(9036, 8266);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 486 + "'", int9 == 486);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1636 + "'", int12 == 1636);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10046 + "'", int15 == 10046);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 17302 + "'", int18 == 17302);
    }

    @Test
    public void test3231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3231");
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
        java.lang.Class<?> wildcardClass31 = sumWithoutArithmeticOperators0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test3232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3232");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(21, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (short) 100);
        int int15 = sumWithoutArithmeticOperators0.getSum(955, 89);
        int int18 = sumWithoutArithmeticOperators0.getSum(278, 725);
        int int21 = sumWithoutArithmeticOperators0.getSum(4619, 2207);
        int int24 = sumWithoutArithmeticOperators0.getSum(622, 6085);
        int int27 = sumWithoutArithmeticOperators0.getSum(4268, 3852);
        java.lang.Class<?> wildcardClass28 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 21 + "'", int9 == 21);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 200 + "'", int12 == 200);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1044 + "'", int15 == 1044);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1003 + "'", int18 == 1003);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 6826 + "'", int21 == 6826);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6707 + "'", int24 == 6707);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 8120 + "'", int27 == 8120);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3233");
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
        int int33 = sumWithoutArithmeticOperators0.getSum(1537, 7267);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 8804 + "'", int33 == 8804);
    }

    @Test
    public void test3234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3234");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(21, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (short) 100);
        int int15 = sumWithoutArithmeticOperators0.getSum(955, 89);
        int int18 = sumWithoutArithmeticOperators0.getSum(278, 725);
        int int21 = sumWithoutArithmeticOperators0.getSum(181, 674);
        int int24 = sumWithoutArithmeticOperators0.getSum(567, 959);
        int int27 = sumWithoutArithmeticOperators0.getSum(959, 288);
        int int30 = sumWithoutArithmeticOperators0.getSum(4704, 5769);
        java.lang.Class<?> wildcardClass31 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 21 + "'", int9 == 21);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 200 + "'", int12 == 200);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1044 + "'", int15 == 1044);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1003 + "'", int18 == 1003);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 855 + "'", int21 == 855);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1526 + "'", int24 == 1526);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1247 + "'", int27 == 1247);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10473 + "'", int30 == 10473);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test3235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3235");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(10, (int) (byte) 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(52, 89);
        int int9 = sumWithoutArithmeticOperators0.getSum(499, 208);
        int int12 = sumWithoutArithmeticOperators0.getSum(9786, 0);
        int int15 = sumWithoutArithmeticOperators0.getSum(5588, 19707);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 141 + "'", int6 == 141);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 707 + "'", int9 == 707);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9786 + "'", int12 == 9786);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 25295 + "'", int15 == 25295);
    }

    @Test
    public void test3236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3236");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum(129, 165);
        int int12 = sumWithoutArithmeticOperators0.getSum(152, 108);
        int int15 = sumWithoutArithmeticOperators0.getSum(788, 360);
        int int18 = sumWithoutArithmeticOperators0.getSum(1180, (int) (short) 0);
        int int21 = sumWithoutArithmeticOperators0.getSum(511, 1143);
        java.lang.Class<?> wildcardClass22 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 294 + "'", int9 == 294);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 260 + "'", int12 == 260);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1148 + "'", int15 == 1148);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1180 + "'", int18 == 1180);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1654 + "'", int21 == 1654);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3237");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, (int) (short) 10);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) '4', 134);
        int int15 = sumWithoutArithmeticOperators0.getSum(162, 162);
        int int18 = sumWithoutArithmeticOperators0.getSum(156, 491);
        int int21 = sumWithoutArithmeticOperators0.getSum(283, 188);
        int int24 = sumWithoutArithmeticOperators0.getSum(16364, 1111);
        int int27 = sumWithoutArithmeticOperators0.getSum(14957, 9265);
        int int30 = sumWithoutArithmeticOperators0.getSum(5665, 2008);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 186 + "'", int12 == 186);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 324 + "'", int15 == 324);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 647 + "'", int18 == 647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 471 + "'", int21 == 471);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 17475 + "'", int24 == 17475);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 24222 + "'", int27 == 24222);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 7673 + "'", int30 == 7673);
    }

    @Test
    public void test3238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3238");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(35, (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 35);
        int int15 = sumWithoutArithmeticOperators0.getSum(53, 36);
        int int18 = sumWithoutArithmeticOperators0.getSum(727, 228);
        int int21 = sumWithoutArithmeticOperators0.getSum(925, 317);
        int int24 = sumWithoutArithmeticOperators0.getSum(3412, 6858);
        java.lang.Class<?> wildcardClass25 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 89 + "'", int15 == 89);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 955 + "'", int18 == 955);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1242 + "'", int21 == 1242);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10270 + "'", int24 == 10270);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3239");
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
        int int30 = sumWithoutArithmeticOperators0.getSum(25636, 1147);
        int int33 = sumWithoutArithmeticOperators0.getSum(10223, 10099);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 33 + "'", int15 == 33);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 163 + "'", int18 == 163);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 295 + "'", int21 == 295);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 376 + "'", int24 == 376);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 463 + "'", int27 == 463);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 26783 + "'", int30 == 26783);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 20322 + "'", int33 == 20322);
    }

    @Test
    public void test3240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3240");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(32, (int) '4');
        int int15 = sumWithoutArithmeticOperators0.getSum(44, 100);
        int int18 = sumWithoutArithmeticOperators0.getSum(17, 19);
        int int21 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 9348);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 84 + "'", int12 == 84);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 144 + "'", int15 == 144);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 36 + "'", int18 == 36);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 9348 + "'", int21 == 9348);
    }

    @Test
    public void test3241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3241");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) 0, (int) (short) -1);
        int int15 = sumWithoutArithmeticOperators0.getSum(416, 110);
        int int18 = sumWithoutArithmeticOperators0.getSum(5952, 458);
        java.lang.Class<?> wildcardClass19 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 526 + "'", int15 == 526);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6410 + "'", int18 == 6410);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3242");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 1, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(18, (int) (byte) -1);
        int int15 = sumWithoutArithmeticOperators0.getSum(51, 422);
        int int18 = sumWithoutArithmeticOperators0.getSum(567, 0);
        int int21 = sumWithoutArithmeticOperators0.getSum(1980, 2383);
        int int24 = sumWithoutArithmeticOperators0.getSum(7916, 0);
        int int27 = sumWithoutArithmeticOperators0.getSum(659, 7724);
        int int30 = sumWithoutArithmeticOperators0.getSum(11582, 10022);
        java.lang.Class<?> wildcardClass31 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 17 + "'", int12 == 17);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 473 + "'", int15 == 473);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 567 + "'", int18 == 567);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4363 + "'", int21 == 4363);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 7916 + "'", int24 == 7916);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 8383 + "'", int27 == 8383);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 21604 + "'", int30 == 21604);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test3243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3243");
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
    }

    @Test
    public void test3244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3244");
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
        int int33 = sumWithoutArithmeticOperators0.getSum(1698, 4739);
        int int36 = sumWithoutArithmeticOperators0.getSum(0, 14209);
        int int39 = sumWithoutArithmeticOperators0.getSum(5753, 5377);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 6437 + "'", int33 == 6437);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 14209 + "'", int36 == 14209);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 11130 + "'", int39 == 11130);
    }

    @Test
    public void test3245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3245");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum(129, 165);
        int int12 = sumWithoutArithmeticOperators0.getSum(152, 108);
        int int15 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 55);
        int int18 = sumWithoutArithmeticOperators0.getSum(52, 108);
        int int21 = sumWithoutArithmeticOperators0.getSum(3595, (int) ' ');
        int int24 = sumWithoutArithmeticOperators0.getSum(2265, 807);
        int int27 = sumWithoutArithmeticOperators0.getSum(11645, 18033);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 294 + "'", int9 == 294);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 260 + "'", int12 == 260);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 54 + "'", int15 == 54);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 160 + "'", int18 == 160);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3627 + "'", int21 == 3627);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3072 + "'", int24 == 3072);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 29678 + "'", int27 == 29678);
    }

    @Test
    public void test3246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3246");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(0, 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(10, (int) (byte) 100);
        int int12 = sumWithoutArithmeticOperators0.getSum(277, 17);
        int int15 = sumWithoutArithmeticOperators0.getSum(812, 735);
        int int18 = sumWithoutArithmeticOperators0.getSum(5402, 6258);
        int int21 = sumWithoutArithmeticOperators0.getSum(7796, 1187);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 152 + "'", int6 == 152);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 294 + "'", int12 == 294);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1547 + "'", int15 == 1547);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 11660 + "'", int18 == 11660);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8983 + "'", int21 == 8983);
    }

    @Test
    public void test3247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3247");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(35, (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 35);
        int int15 = sumWithoutArithmeticOperators0.getSum(53, 36);
        int int18 = sumWithoutArithmeticOperators0.getSum(844, 289);
        int int21 = sumWithoutArithmeticOperators0.getSum((int) (byte) 0, 2476);
        int int24 = sumWithoutArithmeticOperators0.getSum(2935, 99);
        int int27 = sumWithoutArithmeticOperators0.getSum(1846, 12568);
        int int30 = sumWithoutArithmeticOperators0.getSum(3751, 2242);
        java.lang.Class<?> wildcardClass31 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 89 + "'", int15 == 89);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1133 + "'", int18 == 1133);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2476 + "'", int21 == 2476);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3034 + "'", int24 == 3034);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 14414 + "'", int27 == 14414);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 5993 + "'", int30 == 5993);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test3248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3248");
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
        int int30 = sumWithoutArithmeticOperators0.getSum(36924, 3744);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 186 + "'", int12 == 186);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 19 + "'", int15 == 19);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 42 + "'", int18 == 42);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 191 + "'", int21 == 191);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1099 + "'", int24 == 1099);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 9500 + "'", int27 == 9500);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 40668 + "'", int30 == 40668);
    }

    @Test
    public void test3249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3249");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(21, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (short) 100);
        int int15 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 18);
        int int18 = sumWithoutArithmeticOperators0.getSum(13150, 5493);
        int int21 = sumWithoutArithmeticOperators0.getSum(2388, 19528);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 21 + "'", int9 == 21);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 200 + "'", int12 == 200);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 18 + "'", int15 == 18);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 18643 + "'", int18 == 18643);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 21916 + "'", int21 == 21916);
    }

    @Test
    public void test3250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3250");
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
        int int36 = sumWithoutArithmeticOperators0.getSum(12623, 705);
        java.lang.Class<?> wildcardClass37 = sumWithoutArithmeticOperators0.getClass();
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 13328 + "'", int36 == 13328);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test3251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3251");
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
        int int30 = sumWithoutArithmeticOperators0.getSum(356, 2426);
        int int33 = sumWithoutArithmeticOperators0.getSum(5202, 3942);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 196 + "'", int15 == 196);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 197 + "'", int18 == 197);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 498 + "'", int21 == 498);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 453 + "'", int24 == 453);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 835 + "'", int27 == 835);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2782 + "'", int30 == 2782);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 9144 + "'", int33 == 9144);
    }

    @Test
    public void test3252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3252");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(35, (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 35);
        int int15 = sumWithoutArithmeticOperators0.getSum(53, 36);
        int int18 = sumWithoutArithmeticOperators0.getSum(844, 289);
        int int21 = sumWithoutArithmeticOperators0.getSum((int) (byte) 0, 2476);
        int int24 = sumWithoutArithmeticOperators0.getSum(2935, 99);
        int int27 = sumWithoutArithmeticOperators0.getSum(293, 1899);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 89 + "'", int15 == 89);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1133 + "'", int18 == 1133);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2476 + "'", int21 == 2476);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3034 + "'", int24 == 3034);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2192 + "'", int27 == 2192);
    }

    @Test
    public void test3253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3253");
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
    }

    @Test
    public void test3254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3254");
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
        int int30 = sumWithoutArithmeticOperators0.getSum(2708, 7665);
        java.lang.Class<?> wildcardClass31 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 122 + "'", int15 == 122);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 162 + "'", int18 == 162);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 623 + "'", int21 == 623);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4380 + "'", int24 == 4380);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 6993 + "'", int27 == 6993);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10373 + "'", int30 == 10373);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test3255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3255");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(21, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (short) 100);
        int int15 = sumWithoutArithmeticOperators0.getSum(0, 499);
        int int18 = sumWithoutArithmeticOperators0.getSum(6050, 2805);
        int int21 = sumWithoutArithmeticOperators0.getSum(7723, 3536);
        java.lang.Class<?> wildcardClass22 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 21 + "'", int9 == 21);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 200 + "'", int12 == 200);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 499 + "'", int15 == 499);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8855 + "'", int18 == 8855);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 11259 + "'", int21 == 11259);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3256");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum(0, 84);
        int int12 = sumWithoutArithmeticOperators0.getSum(382, 1589);
        int int15 = sumWithoutArithmeticOperators0.getSum(5635, 12355);
        java.lang.Class<?> wildcardClass16 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 84 + "'", int9 == 84);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1971 + "'", int12 == 1971);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 17990 + "'", int15 == 17990);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3257");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 0, 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(2279, 615);
        int int15 = sumWithoutArithmeticOperators0.getSum(3726, 132);
        int int18 = sumWithoutArithmeticOperators0.getSum(2601, 1623);
        int int21 = sumWithoutArithmeticOperators0.getSum(1664, 16935);
        java.lang.Class<?> wildcardClass22 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2894 + "'", int12 == 2894);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3858 + "'", int15 == 3858);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4224 + "'", int18 == 4224);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 18599 + "'", int21 == 18599);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3258");
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
        int int30 = sumWithoutArithmeticOperators0.getSum(5081, 9792);
        int int33 = sumWithoutArithmeticOperators0.getSum(10310, 2372);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 134 + "'", int9 == 134);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 165 + "'", int12 == 165);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 156 + "'", int15 == 156);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 590 + "'", int18 == 590);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 240 + "'", int21 == 240);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1379 + "'", int24 == 1379);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 5487 + "'", int27 == 5487);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 14873 + "'", int30 == 14873);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 12682 + "'", int33 == 12682);
    }

    @Test
    public void test3259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3259");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, (int) (short) 10);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) '4', 134);
        int int15 = sumWithoutArithmeticOperators0.getSum(18, 1);
        int int18 = sumWithoutArithmeticOperators0.getSum(1164, 4959);
        int int21 = sumWithoutArithmeticOperators0.getSum(2464, 4986);
        java.lang.Class<?> wildcardClass22 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 186 + "'", int12 == 186);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 19 + "'", int15 == 19);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6123 + "'", int18 == 6123);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 7450 + "'", int21 == 7450);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3260");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(32, (int) '4');
        int int15 = sumWithoutArithmeticOperators0.getSum((int) (short) 100, 1);
        int int18 = sumWithoutArithmeticOperators0.getSum(161, 84);
        int int21 = sumWithoutArithmeticOperators0.getSum(767, 243);
        int int24 = sumWithoutArithmeticOperators0.getSum(1364, 19);
        java.lang.Class<?> wildcardClass25 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 84 + "'", int12 == 84);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 101 + "'", int15 == 101);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 245 + "'", int18 == 245);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1010 + "'", int21 == 1010);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1383 + "'", int24 == 1383);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3261");
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
        int int36 = sumWithoutArithmeticOperators0.getSum(8867, 990);
        int int39 = sumWithoutArithmeticOperators0.getSum(19515, 8531);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 9857 + "'", int36 == 9857);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 28046 + "'", int39 == 28046);
    }

    @Test
    public void test3262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3262");
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
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 104 + "'", int12 == 104);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 727 + "'", int15 == 727);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 250 + "'", int18 == 250);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 766 + "'", int21 == 766);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 479 + "'", int24 == 479);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10914 + "'", int27 == 10914);
    }

    @Test
    public void test3263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3263");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(32, (int) '4');
        int int15 = sumWithoutArithmeticOperators0.getSum(44, 100);
        int int18 = sumWithoutArithmeticOperators0.getSum(110, 53);
        int int21 = sumWithoutArithmeticOperators0.getSum(51, 215);
        int int24 = sumWithoutArithmeticOperators0.getSum(680, 616);
        int int27 = sumWithoutArithmeticOperators0.getSum(739, 760);
        int int30 = sumWithoutArithmeticOperators0.getSum(2941, 4770);
        java.lang.Class<?> wildcardClass31 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 84 + "'", int12 == 84);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 144 + "'", int15 == 144);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 163 + "'", int18 == 163);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 266 + "'", int21 == 266);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1296 + "'", int24 == 1296);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1499 + "'", int27 == 1499);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 7711 + "'", int30 == 7711);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test3264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3264");
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
        int int36 = sumWithoutArithmeticOperators0.getSum(32600, 162);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 32762 + "'", int36 == 32762);
    }

    @Test
    public void test3265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3265");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(51, 53);
        int int15 = sumWithoutArithmeticOperators0.getSum(375, 352);
        int int18 = sumWithoutArithmeticOperators0.getSum(215, (int) '#');
        int int21 = sumWithoutArithmeticOperators0.getSum(42, 724);
        int int24 = sumWithoutArithmeticOperators0.getSum(19, 460);
        int int27 = sumWithoutArithmeticOperators0.getSum(2165, 1247);
        int int30 = sumWithoutArithmeticOperators0.getSum(235, 4742);
        int int33 = sumWithoutArithmeticOperators0.getSum(2400, 3392);
        java.lang.Class<?> wildcardClass34 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 104 + "'", int12 == 104);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 727 + "'", int15 == 727);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 250 + "'", int18 == 250);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 766 + "'", int21 == 766);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 479 + "'", int24 == 479);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3412 + "'", int27 == 3412);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4977 + "'", int30 == 4977);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 5792 + "'", int33 == 5792);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test3266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3266");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((-1), 35);
        int int15 = sumWithoutArithmeticOperators0.getSum(100, 0);
        int int18 = sumWithoutArithmeticOperators0.getSum(722, 789);
        java.lang.Class<?> wildcardClass19 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1511 + "'", int18 == 1511);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3267");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 1, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(21, 11);
        int int15 = sumWithoutArithmeticOperators0.getSum((int) '#', (int) (short) 1);
        int int18 = sumWithoutArithmeticOperators0.getSum((int) 'a', 156);
        int int21 = sumWithoutArithmeticOperators0.getSum(238, 84);
        int int24 = sumWithoutArithmeticOperators0.getSum(0, 2894);
        int int27 = sumWithoutArithmeticOperators0.getSum(1503, 144);
        int int30 = sumWithoutArithmeticOperators0.getSum(0, 8001);
        int int33 = sumWithoutArithmeticOperators0.getSum(6869, 1294);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 36 + "'", int15 == 36);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 253 + "'", int18 == 253);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 322 + "'", int21 == 322);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2894 + "'", int24 == 2894);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1647 + "'", int27 == 1647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 8001 + "'", int30 == 8001);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 8163 + "'", int33 == 8163);
    }

    @Test
    public void test3268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3268");
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
        int int30 = sumWithoutArithmeticOperators0.getSum(6676, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 122 + "'", int15 == 122);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 269 + "'", int18 == 269);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 251 + "'", int21 == 251);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1168 + "'", int24 == 1168);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3455 + "'", int27 == 3455);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 6676 + "'", int30 == 6676);
    }

    @Test
    public void test3269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3269");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int15 = sumWithoutArithmeticOperators0.getSum(122, 67);
        int int18 = sumWithoutArithmeticOperators0.getSum(473, 360);
        int int21 = sumWithoutArithmeticOperators0.getSum(2512, 615);
        int int24 = sumWithoutArithmeticOperators0.getSum(2817, 1105);
        int int27 = sumWithoutArithmeticOperators0.getSum(816, 5343);
        java.lang.Class<?> wildcardClass28 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 189 + "'", int15 == 189);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 833 + "'", int18 == 833);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3127 + "'", int21 == 3127);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3922 + "'", int24 == 3922);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 6159 + "'", int27 == 6159);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3270");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(0, 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, (int) (short) 10);
        int int12 = sumWithoutArithmeticOperators0.getSum(0, 202);
        int int15 = sumWithoutArithmeticOperators0.getSum(2316, 1793);
        int int18 = sumWithoutArithmeticOperators0.getSum(4105, 8378);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 152 + "'", int6 == 152);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 202 + "'", int12 == 202);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4109 + "'", int15 == 4109);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 12483 + "'", int18 == 12483);
    }

    @Test
    public void test3271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3271");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(0, 199);
        int int12 = sumWithoutArithmeticOperators0.getSum(324, 614);
        int int15 = sumWithoutArithmeticOperators0.getSum(498, 461);
        int int18 = sumWithoutArithmeticOperators0.getSum(4671, 1001);
        int int21 = sumWithoutArithmeticOperators0.getSum(1909, 10223);
        int int24 = sumWithoutArithmeticOperators0.getSum(15506, 41540);
        int int27 = sumWithoutArithmeticOperators0.getSum(7490, 76);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 199 + "'", int9 == 199);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 938 + "'", int12 == 938);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 959 + "'", int15 == 959);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5672 + "'", int18 == 5672);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 12132 + "'", int21 == 12132);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 57046 + "'", int24 == 57046);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 7566 + "'", int27 == 7566);
    }

    @Test
    public void test3272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3272");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) -1, 19);
        int int6 = sumWithoutArithmeticOperators0.getSum(21, 35);
        int int9 = sumWithoutArithmeticOperators0.getSum(1121, 708);
        int int12 = sumWithoutArithmeticOperators0.getSum(3445, 1680);
        int int15 = sumWithoutArithmeticOperators0.getSum(116, 1503);
        int int18 = sumWithoutArithmeticOperators0.getSum(2065, 4152);
        int int21 = sumWithoutArithmeticOperators0.getSum(3509, 3722);
        java.lang.Class<?> wildcardClass22 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 18 + "'", int3 == 18);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 56 + "'", int6 == 56);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1829 + "'", int9 == 1829);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5125 + "'", int12 == 5125);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1619 + "'", int15 == 1619);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6217 + "'", int18 == 6217);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 7231 + "'", int21 == 7231);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3273");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 0, 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(104, 266);
        int int15 = sumWithoutArithmeticOperators0.getSum(454, 9920);
        int int18 = sumWithoutArithmeticOperators0.getSum(24439, 5595);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 370 + "'", int12 == 370);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10374 + "'", int15 == 10374);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 30034 + "'", int18 == 30034);
    }

    @Test
    public void test3274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3274");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 1, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(21, 11);
        int int15 = sumWithoutArithmeticOperators0.getSum((int) '#', (int) (short) 1);
        int int18 = sumWithoutArithmeticOperators0.getSum(101, 42);
        int int21 = sumWithoutArithmeticOperators0.getSum(885, 3452);
        int int24 = sumWithoutArithmeticOperators0.getSum(6020, 10493);
        java.lang.Class<?> wildcardClass25 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 36 + "'", int15 == 36);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 143 + "'", int18 == 143);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4337 + "'", int21 == 4337);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 16513 + "'", int24 == 16513);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3275");
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
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 294 + "'", int9 == 294);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 260 + "'", int12 == 260);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1148 + "'", int15 == 1148);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2391 + "'", int18 == 2391);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5972 + "'", int21 == 5972);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 14740 + "'", int24 == 14740);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 5626 + "'", int27 == 5626);
    }

    @Test
    public void test3276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3276");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int15 = sumWithoutArithmeticOperators0.getSum(859, 321);
        int int18 = sumWithoutArithmeticOperators0.getSum(209, 213);
        int int21 = sumWithoutArithmeticOperators0.getSum(98, 533);
        int int24 = sumWithoutArithmeticOperators0.getSum(8010, 7272);
        int int27 = sumWithoutArithmeticOperators0.getSum(2017, 25195);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1180 + "'", int15 == 1180);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 422 + "'", int18 == 422);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 631 + "'", int21 == 631);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 15282 + "'", int24 == 15282);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 27212 + "'", int27 == 27212);
    }

    @Test
    public void test3277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3277");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 53);
        int int15 = sumWithoutArithmeticOperators0.getSum(53, 101);
        int int18 = sumWithoutArithmeticOperators0.getSum(209, 107);
        int int21 = sumWithoutArithmeticOperators0.getSum(9569, 3455);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 154 + "'", int15 == 154);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 316 + "'", int18 == 316);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 13024 + "'", int21 == 13024);
    }

    @Test
    public void test3278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3278");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum(129, 165);
        int int12 = sumWithoutArithmeticOperators0.getSum(66, 84);
        java.lang.Class<?> wildcardClass13 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 294 + "'", int9 == 294);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 150 + "'", int12 == 150);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3279");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(35, (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum(238, 152);
        int int15 = sumWithoutArithmeticOperators0.getSum(245, 162);
        int int18 = sumWithoutArithmeticOperators0.getSum(2955, 13039);
        int int21 = sumWithoutArithmeticOperators0.getSum(15967, 26859);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 390 + "'", int12 == 390);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 407 + "'", int15 == 407);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 15994 + "'", int18 == 15994);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 42826 + "'", int21 == 42826);
    }

    @Test
    public void test3280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3280");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, (int) (short) 10);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) '4', 134);
        int int15 = sumWithoutArithmeticOperators0.getSum(162, 162);
        int int18 = sumWithoutArithmeticOperators0.getSum(156, 491);
        int int21 = sumWithoutArithmeticOperators0.getSum(1291, 352);
        int int24 = sumWithoutArithmeticOperators0.getSum(2251, 1373);
        int int27 = sumWithoutArithmeticOperators0.getSum(4975, 5978);
        java.lang.Class<?> wildcardClass28 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 186 + "'", int12 == 186);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 324 + "'", int15 == 324);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 647 + "'", int18 == 647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1643 + "'", int21 == 1643);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3624 + "'", int24 == 3624);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10953 + "'", int27 == 10953);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3281");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (short) 100, 34);
        int int12 = sumWithoutArithmeticOperators0.getSum(144, 21);
        int int15 = sumWithoutArithmeticOperators0.getSum(52, 104);
        int int18 = sumWithoutArithmeticOperators0.getSum(0, 194);
        int int21 = sumWithoutArithmeticOperators0.getSum(5311, 5684);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 134 + "'", int9 == 134);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 165 + "'", int12 == 165);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 156 + "'", int15 == 156);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 194 + "'", int18 == 194);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10995 + "'", int21 == 10995);
    }

    @Test
    public void test3282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3282");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) ' ', 35);
        int int6 = sumWithoutArithmeticOperators0.getSum(98, 180);
        int int9 = sumWithoutArithmeticOperators0.getSum(3025, 1245);
        int int12 = sumWithoutArithmeticOperators0.getSum(1327, 100);
        int int15 = sumWithoutArithmeticOperators0.getSum(21, 1310);
        int int18 = sumWithoutArithmeticOperators0.getSum(6357, 16842);
        java.lang.Class<?> wildcardClass19 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 67 + "'", int3 == 67);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 278 + "'", int6 == 278);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4270 + "'", int9 == 4270);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1427 + "'", int12 == 1427);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1331 + "'", int15 == 1331);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 23199 + "'", int18 == 23199);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3283");
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 570 + "'", int30 == 570);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 17291 + "'", int33 == 17291);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 15874 + "'", int36 == 15874);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test3284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3284");
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
        int int36 = sumWithoutArithmeticOperators0.getSum(8496, 4129);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 12625 + "'", int36 == 12625);
    }

    @Test
    public void test3285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3285");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) 0, (int) (short) -1);
        int int15 = sumWithoutArithmeticOperators0.getSum(635, 151);
        int int18 = sumWithoutArithmeticOperators0.getSum(734, 3577);
        int int21 = sumWithoutArithmeticOperators0.getSum(5491, 17002);
        java.lang.Class<?> wildcardClass22 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 786 + "'", int15 == 786);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4311 + "'", int18 == 4311);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 22493 + "'", int21 == 22493);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3286");
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4847 + "'", int30 == 4847);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2262 + "'", int33 == 2262);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 5115 + "'", int36 == 5115);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 3677 + "'", int39 == 3677);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 20495 + "'", int42 == 20495);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test3287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3287");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(129, 109);
        int int12 = sumWithoutArithmeticOperators0.getSum(390, 109);
        int int15 = sumWithoutArithmeticOperators0.getSum(266, 2767);
        java.lang.Class<?> wildcardClass16 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 238 + "'", int9 == 238);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 499 + "'", int12 == 499);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3033 + "'", int15 == 3033);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3288");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(0, 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(1174, 2363);
        int int9 = sumWithoutArithmeticOperators0.getSum(184, 3406);
        int int12 = sumWithoutArithmeticOperators0.getSum(54, 5096);
        int int15 = sumWithoutArithmeticOperators0.getSum(16761, 9703);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3537 + "'", int6 == 3537);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3590 + "'", int9 == 3590);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5150 + "'", int12 == 5150);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 26464 + "'", int15 == 26464);
    }

    @Test
    public void test3289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3289");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(17, 200);
        int int6 = sumWithoutArithmeticOperators0.getSum(377, 210);
        int int9 = sumWithoutArithmeticOperators0.getSum(3501, 117);
        int int12 = sumWithoutArithmeticOperators0.getSum(10046, 0);
        int int15 = sumWithoutArithmeticOperators0.getSum(9703, 11554);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 217 + "'", int3 == 217);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 587 + "'", int6 == 587);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3618 + "'", int9 == 3618);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10046 + "'", int12 == 10046);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 21257 + "'", int15 == 21257);
    }

    @Test
    public void test3290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3290");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(4671, 498);
        int int12 = sumWithoutArithmeticOperators0.getSum(379, 0);
        int int15 = sumWithoutArithmeticOperators0.getSum(3047, 15575);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5169 + "'", int9 == 5169);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 379 + "'", int12 == 379);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 18622 + "'", int15 == 18622);
    }

    @Test
    public void test3291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3291");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(21, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(107, 0);
        int int15 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, 1106);
        int int18 = sumWithoutArithmeticOperators0.getSum(615, 0);
        int int21 = sumWithoutArithmeticOperators0.getSum(7164, 1275);
        java.lang.Class<?> wildcardClass22 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 21 + "'", int9 == 21);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 107 + "'", int12 == 107);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1206 + "'", int15 == 1206);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 615 + "'", int18 == 615);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8439 + "'", int21 == 8439);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3292");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(0, 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(9, (int) '#');
        int int12 = sumWithoutArithmeticOperators0.getSum(211, 245);
        int int15 = sumWithoutArithmeticOperators0.getSum(382, 32);
        int int18 = sumWithoutArithmeticOperators0.getSum(1168, 1);
        int int21 = sumWithoutArithmeticOperators0.getSum(6979, 9242);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 152 + "'", int6 == 152);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 44 + "'", int9 == 44);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 456 + "'", int12 == 456);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 414 + "'", int15 == 414);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1169 + "'", int18 == 1169);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 16221 + "'", int21 == 16221);
    }

    @Test
    public void test3293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3293");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 18);
        int int9 = sumWithoutArithmeticOperators0.getSum(36, 160);
        int int12 = sumWithoutArithmeticOperators0.getSum((-1), 108);
        int int15 = sumWithoutArithmeticOperators0.getSum(170, 7171);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 18 + "'", int6 == 18);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 196 + "'", int9 == 196);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 107 + "'", int12 == 107);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7341 + "'", int15 == 7341);
    }

    @Test
    public void test3294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3294");
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
        int int42 = sumWithoutArithmeticOperators0.getSum(301, 1698);
        int int45 = sumWithoutArithmeticOperators0.getSum(2492, 7137);
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
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1999 + "'", int42 == 1999);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 9629 + "'", int45 == 9629);
    }

    @Test
    public void test3295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3295");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (short) 1, 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(9, (int) (byte) -1);
        int int15 = sumWithoutArithmeticOperators0.getSum(215, 110);
        int int18 = sumWithoutArithmeticOperators0.getSum(766, 44);
        int int21 = sumWithoutArithmeticOperators0.getSum(18869, 21);
        int int24 = sumWithoutArithmeticOperators0.getSum(24822, 8642);
        java.lang.Class<?> wildcardClass25 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 325 + "'", int15 == 325);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 810 + "'", int18 == 810);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 18890 + "'", int21 == 18890);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 33464 + "'", int24 == 33464);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3296");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(0, 199);
        int int12 = sumWithoutArithmeticOperators0.getSum(1010, 3478);
        int int15 = sumWithoutArithmeticOperators0.getSum(9242, 212);
        java.lang.Class<?> wildcardClass16 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 199 + "'", int9 == 199);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4488 + "'", int12 == 4488);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9454 + "'", int15 == 9454);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3297");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(0, 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(9, (int) '#');
        int int12 = sumWithoutArithmeticOperators0.getSum(163, 52);
        int int15 = sumWithoutArithmeticOperators0.getSum(210, 165);
        int int18 = sumWithoutArithmeticOperators0.getSum(2772, 214);
        java.lang.Class<?> wildcardClass19 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 152 + "'", int6 == 152);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 44 + "'", int9 == 44);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 215 + "'", int12 == 215);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 375 + "'", int15 == 375);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2986 + "'", int18 == 2986);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3298");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 1, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(708, 40);
        java.lang.Class<?> wildcardClass13 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 748 + "'", int12 == 748);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3299");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(10, (int) (byte) 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(1514, 1724);
        int int9 = sumWithoutArithmeticOperators0.getSum(5996, 1297);
        java.lang.Class<?> wildcardClass10 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3238 + "'", int6 == 3238);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 7293 + "'", int9 == 7293);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3300");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(21, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(238, 253);
        int int15 = sumWithoutArithmeticOperators0.getSum(683, 1003);
        int int18 = sumWithoutArithmeticOperators0.getSum(974, 2511);
        int int21 = sumWithoutArithmeticOperators0.getSum(314, 1252);
        java.lang.Class<?> wildcardClass22 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 21 + "'", int9 == 21);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 491 + "'", int12 == 491);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1686 + "'", int15 == 1686);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3485 + "'", int18 == 3485);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1566 + "'", int21 == 1566);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3301");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(21, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (short) 100);
        int int15 = sumWithoutArithmeticOperators0.getSum(955, 89);
        int int18 = sumWithoutArithmeticOperators0.getSum((int) (short) 1, 55);
        int int21 = sumWithoutArithmeticOperators0.getSum(3266, 1411);
        int int24 = sumWithoutArithmeticOperators0.getSum(0, 4537);
        int int27 = sumWithoutArithmeticOperators0.getSum(15733, 3249);
        java.lang.Class<?> wildcardClass28 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 21 + "'", int9 == 21);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 200 + "'", int12 == 200);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1044 + "'", int15 == 1044);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 56 + "'", int18 == 56);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4677 + "'", int21 == 4677);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4537 + "'", int24 == 4537);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 18982 + "'", int27 == 18982);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3302");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 18);
        int int9 = sumWithoutArithmeticOperators0.getSum(36, 160);
        int int12 = sumWithoutArithmeticOperators0.getSum((-1), 108);
        int int15 = sumWithoutArithmeticOperators0.getSum(859, 249);
        int int18 = sumWithoutArithmeticOperators0.getSum(0, 0);
        int int21 = sumWithoutArithmeticOperators0.getSum(0, 558);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 18 + "'", int6 == 18);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 196 + "'", int9 == 196);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 107 + "'", int12 == 107);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1108 + "'", int15 == 1108);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 558 + "'", int21 == 558);
    }

    @Test
    public void test3303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3303");
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
        int int33 = sumWithoutArithmeticOperators0.getSum(5583, 10914);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 16497 + "'", int33 == 16497);
    }

    @Test
    public void test3304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3304");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(250, 195);
        int int9 = sumWithoutArithmeticOperators0.getSum(533, 735);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) 'a', 4076);
        int int15 = sumWithoutArithmeticOperators0.getSum(181, 3897);
        java.lang.Class<?> wildcardClass16 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 445 + "'", int6 == 445);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1268 + "'", int9 == 1268);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4173 + "'", int12 == 4173);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4078 + "'", int15 == 4078);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3305");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) -1, 19);
        int int6 = sumWithoutArithmeticOperators0.getSum(21, 35);
        int int9 = sumWithoutArithmeticOperators0.getSum(859, 454);
        int int12 = sumWithoutArithmeticOperators0.getSum(707, 3175);
        java.lang.Class<?> wildcardClass13 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 18 + "'", int3 == 18);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 56 + "'", int6 == 56);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1313 + "'", int9 == 1313);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3882 + "'", int12 == 3882);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3306");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(51, 53);
        int int15 = sumWithoutArithmeticOperators0.getSum(238, (int) '4');
        int int18 = sumWithoutArithmeticOperators0.getSum(1044, 84);
        int int21 = sumWithoutArithmeticOperators0.getSum(13247, 1099);
        java.lang.Class<?> wildcardClass22 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 104 + "'", int12 == 104);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 290 + "'", int15 == 290);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1128 + "'", int18 == 1128);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 14346 + "'", int21 == 14346);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3307");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((-1), 35);
        int int15 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 250);
        int int18 = sumWithoutArithmeticOperators0.getSum(0, 213);
        int int21 = sumWithoutArithmeticOperators0.getSum(1668, 0);
        int int24 = sumWithoutArithmeticOperators0.getSum(597, 186);
        int int27 = sumWithoutArithmeticOperators0.getSum(3958, 2399);
        int int30 = sumWithoutArithmeticOperators0.getSum(975, 144);
        java.lang.Class<?> wildcardClass31 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 249 + "'", int15 == 249);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 213 + "'", int18 == 213);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1668 + "'", int21 == 1668);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 783 + "'", int24 == 783);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 6357 + "'", int27 == 6357);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1119 + "'", int30 == 1119);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test3308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3308");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 1, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(18, (int) (byte) -1);
        int int15 = sumWithoutArithmeticOperators0.getSum(9, 217);
        int int18 = sumWithoutArithmeticOperators0.getSum(132, 499);
        int int21 = sumWithoutArithmeticOperators0.getSum(4879, 2316);
        int int24 = sumWithoutArithmeticOperators0.getSum(1179, 4999);
        int int27 = sumWithoutArithmeticOperators0.getSum(5189, 9608);
        int int30 = sumWithoutArithmeticOperators0.getSum(18398, 4838);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 17 + "'", int12 == 17);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 226 + "'", int15 == 226);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 631 + "'", int18 == 631);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 7195 + "'", int21 == 7195);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6178 + "'", int24 == 6178);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 14797 + "'", int27 == 14797);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 23236 + "'", int30 == 23236);
    }

    @Test
    public void test3309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3309");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 18);
        int int9 = sumWithoutArithmeticOperators0.getSum(36, 160);
        int int12 = sumWithoutArithmeticOperators0.getSum((-1), 108);
        int int15 = sumWithoutArithmeticOperators0.getSum(859, 249);
        int int18 = sumWithoutArithmeticOperators0.getSum(330, 911);
        int int21 = sumWithoutArithmeticOperators0.getSum(2115, 1171);
        int int24 = sumWithoutArithmeticOperators0.getSum(11160, 963);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 18 + "'", int6 == 18);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 196 + "'", int9 == 196);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 107 + "'", int12 == 107);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1108 + "'", int15 == 1108);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1241 + "'", int18 == 1241);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3286 + "'", int21 == 3286);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 12123 + "'", int24 == 12123);
    }

    @Test
    public void test3310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3310");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, (int) (short) 10);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) '4', 134);
        int int15 = sumWithoutArithmeticOperators0.getSum(162, 162);
        int int18 = sumWithoutArithmeticOperators0.getSum(156, 491);
        int int21 = sumWithoutArithmeticOperators0.getSum(41, 1128);
        int int24 = sumWithoutArithmeticOperators0.getSum(1297, 34);
        int int27 = sumWithoutArithmeticOperators0.getSum(4834, 6676);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 186 + "'", int12 == 186);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 324 + "'", int15 == 324);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 647 + "'", int18 == 647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1169 + "'", int21 == 1169);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1331 + "'", int24 == 1331);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 11510 + "'", int27 == 11510);
    }

    @Test
    public void test3311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3311");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(40, 269);
        int int6 = sumWithoutArithmeticOperators0.getSum(6164, 1430);
        int int9 = sumWithoutArithmeticOperators0.getSum(3569, 1512);
        int int12 = sumWithoutArithmeticOperators0.getSum(14633, 2728);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 309 + "'", int3 == 309);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 7594 + "'", int6 == 7594);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5081 + "'", int9 == 5081);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 17361 + "'", int12 == 17361);
    }

    @Test
    public void test3312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3312");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(686, 1579);
        int int12 = sumWithoutArithmeticOperators0.getSum(8, 1244);
        int int15 = sumWithoutArithmeticOperators0.getSum(1133, 727);
        int int18 = sumWithoutArithmeticOperators0.getSum(2933, 6164);
        int int21 = sumWithoutArithmeticOperators0.getSum(8887, 6591);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2265 + "'", int9 == 2265);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1252 + "'", int12 == 1252);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1860 + "'", int15 == 1860);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9097 + "'", int18 == 9097);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 15478 + "'", int21 == 15478);
    }

    @Test
    public void test3313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3313");
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
        int int30 = sumWithoutArithmeticOperators0.getSum(22861, 5274);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 186 + "'", int12 == 186);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 324 + "'", int15 == 324);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 647 + "'", int18 == 647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1169 + "'", int21 == 1169);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1331 + "'", int24 == 1331);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1171 + "'", int27 == 1171);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 28135 + "'", int30 == 28135);
    }

    @Test
    public void test3314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3314");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(129, 109);
        int int12 = sumWithoutArithmeticOperators0.getSum(390, 109);
        int int15 = sumWithoutArithmeticOperators0.getSum(11, (int) (short) 0);
        int int18 = sumWithoutArithmeticOperators0.getSum(1856, 1670);
        int int21 = sumWithoutArithmeticOperators0.getSum(1347, 3340);
        java.lang.Class<?> wildcardClass22 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 238 + "'", int9 == 238);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 499 + "'", int12 == 499);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 11 + "'", int15 == 11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3526 + "'", int18 == 3526);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4687 + "'", int21 == 4687);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3315");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(21, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(0, 10);
        int int15 = sumWithoutArithmeticOperators0.getSum(488, 1236);
        int int18 = sumWithoutArithmeticOperators0.getSum(1364, 364);
        int int21 = sumWithoutArithmeticOperators0.getSum(853, 3922);
        int int24 = sumWithoutArithmeticOperators0.getSum(36161, 9908);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 21 + "'", int9 == 21);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1724 + "'", int15 == 1724);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1728 + "'", int18 == 1728);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4775 + "'", int21 == 4775);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 46069 + "'", int24 == 46069);
    }

    @Test
    public void test3316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3316");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 1, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(21, 11);
        int int15 = sumWithoutArithmeticOperators0.getSum((int) '#', (int) (short) 1);
        int int18 = sumWithoutArithmeticOperators0.getSum(101, 42);
        int int21 = sumWithoutArithmeticOperators0.getSum(99, 289);
        int int24 = sumWithoutArithmeticOperators0.getSum(19, 97);
        int int27 = sumWithoutArithmeticOperators0.getSum(715, 983);
        int int30 = sumWithoutArithmeticOperators0.getSum(7000, 2741);
        java.lang.Class<?> wildcardClass31 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 36 + "'", int15 == 36);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 143 + "'", int18 == 143);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 388 + "'", int21 == 388);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 116 + "'", int24 == 116);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1698 + "'", int27 == 1698);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 9741 + "'", int30 == 9741);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test3317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3317");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(129, 109);
        int int12 = sumWithoutArithmeticOperators0.getSum(390, 109);
        int int15 = sumWithoutArithmeticOperators0.getSum(4847, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 238 + "'", int9 == 238);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 499 + "'", int12 == 499);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4847 + "'", int15 == 4847);
    }

    @Test
    public void test3318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3318");
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
        int int42 = sumWithoutArithmeticOperators0.getSum(694, 316);
        int int45 = sumWithoutArithmeticOperators0.getSum(1059, 12309);
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
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1010 + "'", int42 == 1010);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 13368 + "'", int45 == 13368);
    }

    @Test
    public void test3319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3319");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) ' ', 35);
        int int6 = sumWithoutArithmeticOperators0.getSum(1253, 1133);
        int int9 = sumWithoutArithmeticOperators0.getSum(524, 166);
        int int12 = sumWithoutArithmeticOperators0.getSum(8243, 2140);
        int int15 = sumWithoutArithmeticOperators0.getSum(6137, 7343);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 67 + "'", int3 == 67);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2386 + "'", int6 == 2386);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 690 + "'", int9 == 690);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10383 + "'", int12 == 10383);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 13480 + "'", int15 == 13480);
    }

    @Test
    public void test3320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3320");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(51, 53);
        int int15 = sumWithoutArithmeticOperators0.getSum(375, 352);
        int int18 = sumWithoutArithmeticOperators0.getSum(215, (int) '#');
        int int21 = sumWithoutArithmeticOperators0.getSum(42, 724);
        int int24 = sumWithoutArithmeticOperators0.getSum(19, 460);
        int int27 = sumWithoutArithmeticOperators0.getSum(2165, 1247);
        int int30 = sumWithoutArithmeticOperators0.getSum(2424, 2660);
        int int33 = sumWithoutArithmeticOperators0.getSum(13898, 3757);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 104 + "'", int12 == 104);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 727 + "'", int15 == 727);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 250 + "'", int18 == 250);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 766 + "'", int21 == 766);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 479 + "'", int24 == 479);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3412 + "'", int27 == 3412);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 5084 + "'", int30 == 5084);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 17655 + "'", int33 == 17655);
    }

    @Test
    public void test3321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3321");
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
        int int42 = sumWithoutArithmeticOperators0.getSum(3341, 601);
        int int45 = sumWithoutArithmeticOperators0.getSum(6858, 35591);
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
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 3942 + "'", int42 == 3942);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 42449 + "'", int45 == 42449);
    }

    @Test
    public void test3322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3322");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int15 = sumWithoutArithmeticOperators0.getSum(122, 67);
        int int18 = sumWithoutArithmeticOperators0.getSum(294, 213);
        int int21 = sumWithoutArithmeticOperators0.getSum(0, 364);
        int int24 = sumWithoutArithmeticOperators0.getSum(377, 11347);
        int int27 = sumWithoutArithmeticOperators0.getSum(1268, 1631);
        int int30 = sumWithoutArithmeticOperators0.getSum(3509, 283);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 189 + "'", int15 == 189);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 507 + "'", int18 == 507);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 364 + "'", int21 == 364);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 11724 + "'", int24 == 11724);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2899 + "'", int27 == 2899);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3792 + "'", int30 == 3792);
    }

    @Test
    public void test3323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3323");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(21, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(0, 10);
        int int15 = sumWithoutArithmeticOperators0.getSum(5007, 1398);
        int int18 = sumWithoutArithmeticOperators0.getSum(8026, 11110);
        int int21 = sumWithoutArithmeticOperators0.getSum(3457, 686);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 21 + "'", int9 == 21);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6405 + "'", int15 == 6405);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 19136 + "'", int18 == 19136);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4143 + "'", int21 == 4143);
    }

    @Test
    public void test3324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3324");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(32, (int) '4');
        int int15 = sumWithoutArithmeticOperators0.getSum(44, 100);
        int int18 = sumWithoutArithmeticOperators0.getSum(110, 53);
        int int21 = sumWithoutArithmeticOperators0.getSum(51, 215);
        int int24 = sumWithoutArithmeticOperators0.getSum(680, 616);
        int int27 = sumWithoutArithmeticOperators0.getSum(739, 760);
        java.lang.Class<?> wildcardClass28 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 84 + "'", int12 == 84);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 144 + "'", int15 == 144);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 163 + "'", int18 == 163);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 266 + "'", int21 == 266);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1296 + "'", int24 == 1296);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1499 + "'", int27 == 1499);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3325");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(35, (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 35);
        int int15 = sumWithoutArithmeticOperators0.getSum(53, 36);
        int int18 = sumWithoutArithmeticOperators0.getSum(526, 213);
        int int21 = sumWithoutArithmeticOperators0.getSum(311, 786);
        int int24 = sumWithoutArithmeticOperators0.getSum(456, 9649);
        int int27 = sumWithoutArithmeticOperators0.getSum(5191, 5859);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 89 + "'", int15 == 89);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 739 + "'", int18 == 739);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1097 + "'", int21 == 1097);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10105 + "'", int24 == 10105);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 11050 + "'", int27 == 11050);
    }

    @Test
    public void test3326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3326");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(250, 195);
        int int9 = sumWithoutArithmeticOperators0.getSum(805, 1200);
        int int12 = sumWithoutArithmeticOperators0.getSum(5025, 20008);
        int int15 = sumWithoutArithmeticOperators0.getSum(4910, 5341);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 445 + "'", int6 == 445);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2005 + "'", int9 == 2005);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25033 + "'", int12 == 25033);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10251 + "'", int15 == 10251);
    }

    @Test
    public void test3327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3327");
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
        int int33 = sumWithoutArithmeticOperators0.getSum(8356, 19136);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 27492 + "'", int33 == 27492);
    }

    @Test
    public void test3328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3328");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (short) 100, 34);
        int int12 = sumWithoutArithmeticOperators0.getSum(144, 21);
        int int15 = sumWithoutArithmeticOperators0.getSum(0, 35);
        int int18 = sumWithoutArithmeticOperators0.getSum(210, 36);
        int int21 = sumWithoutArithmeticOperators0.getSum(766, 1168);
        int int24 = sumWithoutArithmeticOperators0.getSum(142, 2933);
        int int27 = sumWithoutArithmeticOperators0.getSum(4667, 14997);
        java.lang.Class<?> wildcardClass28 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 134 + "'", int9 == 134);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 165 + "'", int12 == 165);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 246 + "'", int18 == 246);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1934 + "'", int21 == 1934);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3075 + "'", int24 == 3075);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 19664 + "'", int27 == 19664);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3329");
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
        int int30 = sumWithoutArithmeticOperators0.getSum(1096, 14010);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 15106 + "'", int30 == 15106);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test3330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3330");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(260, 1327);
        int int12 = sumWithoutArithmeticOperators0.getSum(0, 7981);
        int int15 = sumWithoutArithmeticOperators0.getSum(1636, 1467);
        int int18 = sumWithoutArithmeticOperators0.getSum(1690, 13490);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1587 + "'", int9 == 1587);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 7981 + "'", int12 == 7981);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3103 + "'", int15 == 3103);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 15180 + "'", int18 == 15180);
    }

    @Test
    public void test3331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3331");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(0, 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(9, (int) '#');
        int int12 = sumWithoutArithmeticOperators0.getSum(163, 52);
        int int15 = sumWithoutArithmeticOperators0.getSum(107, 210);
        int int18 = sumWithoutArithmeticOperators0.getSum(21, 975);
        int int21 = sumWithoutArithmeticOperators0.getSum(272, 76);
        int int24 = sumWithoutArithmeticOperators0.getSum(5877, 0);
        int int27 = sumWithoutArithmeticOperators0.getSum(5491, 3885);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 152 + "'", int6 == 152);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 44 + "'", int9 == 44);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 215 + "'", int12 == 215);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 317 + "'", int15 == 317);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 996 + "'", int18 == 996);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 348 + "'", int21 == 348);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5877 + "'", int24 == 5877);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 9376 + "'", int27 == 9376);
    }

    @Test
    public void test3332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3332");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum(44, 671);
        int int12 = sumWithoutArithmeticOperators0.getSum(629, 397);
        int int15 = sumWithoutArithmeticOperators0.getSum(15130, 4975);
        int int18 = sumWithoutArithmeticOperators0.getSum(1427, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 715 + "'", int9 == 715);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1026 + "'", int12 == 1026);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 20105 + "'", int15 == 20105);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1427 + "'", int18 == 1427);
    }

    @Test
    public void test3333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3333");
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
        int int30 = sumWithoutArithmeticOperators0.getSum(13148, 3283);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 84 + "'", int12 == 84);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 144 + "'", int15 == 144);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 455 + "'", int18 == 455);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 156 + "'", int21 == 156);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3716 + "'", int24 == 3716);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 838 + "'", int27 == 838);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 16431 + "'", int30 == 16431);
    }

    @Test
    public void test3334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3334");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 53);
        int int15 = sumWithoutArithmeticOperators0.getSum(53, 101);
        int int18 = sumWithoutArithmeticOperators0.getSum(1087, 2108);
        int int21 = sumWithoutArithmeticOperators0.getSum(1380, 0);
        int int24 = sumWithoutArithmeticOperators0.getSum(7516, 1291);
        int int27 = sumWithoutArithmeticOperators0.getSum(8619, 11018);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 154 + "'", int15 == 154);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3195 + "'", int18 == 3195);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1380 + "'", int21 == 1380);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 8807 + "'", int24 == 8807);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 19637 + "'", int27 == 19637);
    }

    @Test
    public void test3335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3335");
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
        int int30 = sumWithoutArithmeticOperators0.getSum(6537, 6600);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 134 + "'", int9 == 134);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 165 + "'", int12 == 165);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 254 + "'", int15 == 254);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 416 + "'", int18 == 416);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2597 + "'", int21 == 2597);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1490 + "'", int24 == 1490);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 5573 + "'", int27 == 5573);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 13137 + "'", int30 == 13137);
    }

    @Test
    public void test3336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3336");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(129, 109);
        int int12 = sumWithoutArithmeticOperators0.getSum(390, 109);
        int int15 = sumWithoutArithmeticOperators0.getSum(11, (int) (short) 0);
        int int18 = sumWithoutArithmeticOperators0.getSum(1856, 1670);
        int int21 = sumWithoutArithmeticOperators0.getSum(1347, 3340);
        int int24 = sumWithoutArithmeticOperators0.getSum(161, 1796);
        int int27 = sumWithoutArithmeticOperators0.getSum(5311, 16719);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 238 + "'", int9 == 238);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 499 + "'", int12 == 499);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 11 + "'", int15 == 11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3526 + "'", int18 == 3526);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4687 + "'", int21 == 4687);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1957 + "'", int24 == 1957);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 22030 + "'", int27 == 22030);
    }

    @Test
    public void test3337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3337");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 1, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(21, 11);
        int int15 = sumWithoutArithmeticOperators0.getSum((int) '#', (int) (short) 1);
        int int18 = sumWithoutArithmeticOperators0.getSum((int) 'a', 156);
        int int21 = sumWithoutArithmeticOperators0.getSum(15733, 2517);
        int int24 = sumWithoutArithmeticOperators0.getSum(12747, 38455);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 36 + "'", int15 == 36);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 253 + "'", int18 == 253);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 18250 + "'", int21 == 18250);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 51202 + "'", int24 == 51202);
    }

    @Test
    public void test3338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3338");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((-1), 35);
        int int15 = sumWithoutArithmeticOperators0.getSum(195, 317);
        int int18 = sumWithoutArithmeticOperators0.getSum(76, 499);
        int int21 = sumWithoutArithmeticOperators0.getSum(844, 555);
        int int24 = sumWithoutArithmeticOperators0.getSum(3949, 4164);
        int int27 = sumWithoutArithmeticOperators0.getSum(2682, 811);
        java.lang.Class<?> wildcardClass28 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 512 + "'", int15 == 512);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 575 + "'", int18 == 575);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1399 + "'", int21 == 1399);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 8113 + "'", int24 == 8113);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3493 + "'", int27 == 3493);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3339");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(18, 345);
        int int12 = sumWithoutArithmeticOperators0.getSum(246, 35);
        int int15 = sumWithoutArithmeticOperators0.getSum(20567, 0);
        int int18 = sumWithoutArithmeticOperators0.getSum(575, 2512);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 363 + "'", int9 == 363);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 281 + "'", int12 == 281);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 20567 + "'", int15 == 20567);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3087 + "'", int18 == 3087);
    }

    @Test
    public void test3340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3340");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 1, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(18, (int) (byte) -1);
        int int15 = sumWithoutArithmeticOperators0.getSum(526, 727);
        int int18 = sumWithoutArithmeticOperators0.getSum(1967, 810);
        int int21 = sumWithoutArithmeticOperators0.getSum(1480, 1636);
        int int24 = sumWithoutArithmeticOperators0.getSum(3025, 199);
        int int27 = sumWithoutArithmeticOperators0.getSum(604, 2645);
        java.lang.Class<?> wildcardClass28 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 17 + "'", int12 == 17);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1253 + "'", int15 == 1253);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2777 + "'", int18 == 2777);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3116 + "'", int21 == 3116);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3224 + "'", int24 == 3224);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3249 + "'", int27 == 3249);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3341");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(250, 195);
        int int9 = sumWithoutArithmeticOperators0.getSum(134, 151);
        int int12 = sumWithoutArithmeticOperators0.getSum(1842, 3652);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 445 + "'", int6 == 445);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 285 + "'", int9 == 285);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5494 + "'", int12 == 5494);
    }

    @Test
    public void test3342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3342");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(747, 1764);
        int int9 = sumWithoutArithmeticOperators0.getSum(0, 983);
        int int12 = sumWithoutArithmeticOperators0.getSum(0, 15137);
        int int15 = sumWithoutArithmeticOperators0.getSum(2903, 3047);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2511 + "'", int6 == 2511);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 983 + "'", int9 == 983);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15137 + "'", int12 == 15137);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5950 + "'", int15 == 5950);
    }

    @Test
    public void test3343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3343");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(10, (int) (byte) 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(34, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum(5312, 51);
        java.lang.Class<?> wildcardClass10 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 34 + "'", int6 == 34);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5363 + "'", int9 == 5363);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3344");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 1, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(21, 11);
        int int15 = sumWithoutArithmeticOperators0.getSum(0, 34);
        int int18 = sumWithoutArithmeticOperators0.getSum(254, 269);
        int int21 = sumWithoutArithmeticOperators0.getSum(942, 33);
        int int24 = sumWithoutArithmeticOperators0.getSum(6869, 2924);
        int int27 = sumWithoutArithmeticOperators0.getSum(14401, 8693);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 34 + "'", int15 == 34);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 523 + "'", int18 == 523);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 975 + "'", int21 == 975);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 9793 + "'", int24 == 9793);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 23094 + "'", int27 == 23094);
    }

    @Test
    public void test3345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3345");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) 'a', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum(266, 295);
        int int15 = sumWithoutArithmeticOperators0.getSum(390, 289);
        int int18 = sumWithoutArithmeticOperators0.getSum(491, 623);
        int int21 = sumWithoutArithmeticOperators0.getSum(73, 2713);
        java.lang.Class<?> wildcardClass22 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 98 + "'", int9 == 98);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 561 + "'", int12 == 561);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 679 + "'", int15 == 679);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1114 + "'", int18 == 1114);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2786 + "'", int21 == 2786);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3346");
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
        int int42 = sumWithoutArithmeticOperators0.getSum(150, 12404);
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
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 12554 + "'", int42 == 12554);
    }

    @Test
    public void test3347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3347");
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
        int int30 = sumWithoutArithmeticOperators0.getSum(3485, 44);
        int int33 = sumWithoutArithmeticOperators0.getSum(1119, 0);
        int int36 = sumWithoutArithmeticOperators0.getSum(0, 21200);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 33 + "'", int15 == 33);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 163 + "'", int18 == 163);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 295 + "'", int21 == 295);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 76 + "'", int24 == 76);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 213 + "'", int27 == 213);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3529 + "'", int30 == 3529);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1119 + "'", int33 == 1119);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 21200 + "'", int36 == 21200);
    }

    @Test
    public void test3348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3348");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(32, (int) '4');
        int int15 = sumWithoutArithmeticOperators0.getSum(44, 100);
        int int18 = sumWithoutArithmeticOperators0.getSum(217, 238);
        int int21 = sumWithoutArithmeticOperators0.getSum(2512, 6681);
        java.lang.Class<?> wildcardClass22 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 84 + "'", int12 == 84);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 144 + "'", int15 == 144);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 455 + "'", int18 == 455);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 9193 + "'", int21 == 9193);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3349");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(51, 53);
        int int15 = sumWithoutArithmeticOperators0.getSum(375, 352);
        int int18 = sumWithoutArithmeticOperators0.getSum(0, 165);
        int int21 = sumWithoutArithmeticOperators0.getSum(109, 52);
        int int24 = sumWithoutArithmeticOperators0.getSum(555, 4506);
        java.lang.Class<?> wildcardClass25 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 104 + "'", int12 == 104);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 727 + "'", int15 == 727);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 165 + "'", int18 == 165);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 161 + "'", int21 == 161);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5061 + "'", int24 == 5061);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3350");
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
        int int33 = sumWithoutArithmeticOperators0.getSum(141, 463);
        int int36 = sumWithoutArithmeticOperators0.getSum(2008, 0);
        java.lang.Class<?> wildcardClass37 = sumWithoutArithmeticOperators0.getClass();
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 604 + "'", int33 == 604);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2008 + "'", int36 == 2008);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test3351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3351");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 1, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(21, 11);
        int int15 = sumWithoutArithmeticOperators0.getSum(101, 21);
        int int18 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 152);
        int int21 = sumWithoutArithmeticOperators0.getSum(486, 552);
        int int24 = sumWithoutArithmeticOperators0.getSum(14588, 1099);
        int int27 = sumWithoutArithmeticOperators0.getSum(12748, 5734);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 122 + "'", int15 == 122);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 162 + "'", int18 == 162);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1038 + "'", int21 == 1038);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 15687 + "'", int24 == 15687);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 18482 + "'", int27 == 18482);
    }

    @Test
    public void test3352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3352");
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
        int int36 = sumWithoutArithmeticOperators0.getSum(407, 410);
        int int39 = sumWithoutArithmeticOperators0.getSum(0, 1179);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 817 + "'", int36 == 817);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1179 + "'", int39 == 1179);
    }

    @Test
    public void test3353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3353");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(21, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (short) 100);
        int int15 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 18);
        int int18 = sumWithoutArithmeticOperators0.getSum(1380, (int) (short) 100);
        int int21 = sumWithoutArithmeticOperators0.getSum(1112, 3627);
        int int24 = sumWithoutArithmeticOperators0.getSum(2889, 2541);
        int int27 = sumWithoutArithmeticOperators0.getSum(6989, 17644);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 21 + "'", int9 == 21);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 200 + "'", int12 == 200);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 18 + "'", int15 == 18);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1480 + "'", int18 == 1480);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4739 + "'", int21 == 4739);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5430 + "'", int24 == 5430);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 24633 + "'", int27 == 24633);
    }

    @Test
    public void test3354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3354");
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
        int int30 = sumWithoutArithmeticOperators0.getSum(54, 4143);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 98 + "'", int9 == 98);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 228 + "'", int12 == 228);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1236 + "'", int15 == 1236);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 942 + "'", int18 == 942);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2231 + "'", int21 == 2231);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 7873 + "'", int24 == 7873);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 12238 + "'", int27 == 12238);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4197 + "'", int30 == 4197);
    }

    @Test
    public void test3355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3355");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, (int) (short) 10);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) '4', 134);
        int int15 = sumWithoutArithmeticOperators0.getSum(162, 162);
        int int18 = sumWithoutArithmeticOperators0.getSum(24222, 924);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 186 + "'", int12 == 186);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 324 + "'", int15 == 324);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 25146 + "'", int18 == 25146);
    }

    @Test
    public void test3356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3356");
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
    }

    @Test
    public void test3357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3357");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum(44, 671);
        int int12 = sumWithoutArithmeticOperators0.getSum(629, 397);
        int int15 = sumWithoutArithmeticOperators0.getSum(920, 507);
        int int18 = sumWithoutArithmeticOperators0.getSum(2941, 4079);
        java.lang.Class<?> wildcardClass19 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 715 + "'", int9 == 715);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1026 + "'", int12 == 1026);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1427 + "'", int15 == 1427);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 7020 + "'", int18 == 7020);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3358");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum(129, 165);
        int int12 = sumWithoutArithmeticOperators0.getSum(152, 108);
        int int15 = sumWithoutArithmeticOperators0.getSum(117, 0);
        int int18 = sumWithoutArithmeticOperators0.getSum(1428, 4263);
        int int21 = sumWithoutArithmeticOperators0.getSum(8829, 1432);
        int int24 = sumWithoutArithmeticOperators0.getSum(3355, 30710);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 294 + "'", int9 == 294);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 260 + "'", int12 == 260);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 117 + "'", int15 == 117);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5691 + "'", int18 == 5691);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10261 + "'", int21 == 10261);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 34065 + "'", int24 == 34065);
    }

    @Test
    public void test3359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3359");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(0, 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(9, (int) '#');
        int int12 = sumWithoutArithmeticOperators0.getSum(97, 168);
        int int15 = sumWithoutArithmeticOperators0.getSum(590, 2512);
        int int18 = sumWithoutArithmeticOperators0.getSum(455, 2837);
        int int21 = sumWithoutArithmeticOperators0.getSum(2456, 2965);
        int int24 = sumWithoutArithmeticOperators0.getSum(242, 12374);
        int int27 = sumWithoutArithmeticOperators0.getSum(11947, 1329);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 152 + "'", int6 == 152);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 44 + "'", int9 == 44);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 265 + "'", int12 == 265);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3102 + "'", int15 == 3102);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3292 + "'", int18 == 3292);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5421 + "'", int21 == 5421);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 12616 + "'", int24 == 12616);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 13276 + "'", int27 == 13276);
    }

    @Test
    public void test3360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3360");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(0, 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(1174, 2363);
        int int9 = sumWithoutArithmeticOperators0.getSum(184, 3406);
        int int12 = sumWithoutArithmeticOperators0.getSum(5283, 3652);
        int int15 = sumWithoutArithmeticOperators0.getSum(6784, 6109);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3537 + "'", int6 == 3537);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3590 + "'", int9 == 3590);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8935 + "'", int12 == 8935);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 12893 + "'", int15 == 12893);
    }

    @Test
    public void test3361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3361");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 18);
        int int9 = sumWithoutArithmeticOperators0.getSum(2339, 5977);
        int int12 = sumWithoutArithmeticOperators0.getSum(3249, 243);
        int int15 = sumWithoutArithmeticOperators0.getSum(5176, 521);
        java.lang.Class<?> wildcardClass16 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 18 + "'", int6 == 18);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8316 + "'", int9 == 8316);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3492 + "'", int12 == 3492);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5697 + "'", int15 == 5697);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3362");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(129, 109);
        int int12 = sumWithoutArithmeticOperators0.getSum(390, 109);
        int int15 = sumWithoutArithmeticOperators0.getSum(1829, 635);
        int int18 = sumWithoutArithmeticOperators0.getSum(2075, 3716);
        int int21 = sumWithoutArithmeticOperators0.getSum(635, 1272);
        java.lang.Class<?> wildcardClass22 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 238 + "'", int9 == 238);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 499 + "'", int12 == 499);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2464 + "'", int15 == 2464);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5791 + "'", int18 == 5791);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1907 + "'", int21 == 1907);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3363");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(32, (int) '4');
        int int15 = sumWithoutArithmeticOperators0.getSum(44, 100);
        int int18 = sumWithoutArithmeticOperators0.getSum(110, 53);
        int int21 = sumWithoutArithmeticOperators0.getSum(2597, 6372);
        int int24 = sumWithoutArithmeticOperators0.getSum(8817, 12775);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 84 + "'", int12 == 84);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 144 + "'", int15 == 144);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 163 + "'", int18 == 163);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8969 + "'", int21 == 8969);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 21592 + "'", int24 == 21592);
    }

    @Test
    public void test3364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3364");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 1, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(21, 11);
        int int15 = sumWithoutArithmeticOperators0.getSum(101, 21);
        int int18 = sumWithoutArithmeticOperators0.getSum(89, 180);
        int int21 = sumWithoutArithmeticOperators0.getSum(4506, 6674);
        int int24 = sumWithoutArithmeticOperators0.getSum(20788, 1743);
        int int27 = sumWithoutArithmeticOperators0.getSum(4503, 4082);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 122 + "'", int15 == 122);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 269 + "'", int18 == 269);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 11180 + "'", int21 == 11180);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 22531 + "'", int24 == 22531);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 8585 + "'", int27 == 8585);
    }

    @Test
    public void test3365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3365");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(250, 195);
        int int9 = sumWithoutArithmeticOperators0.getSum(0, 16077);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 445 + "'", int6 == 445);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 16077 + "'", int9 == 16077);
    }

    @Test
    public void test3366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3366");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(21, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (short) 100);
        int int15 = sumWithoutArithmeticOperators0.getSum(955, 89);
        int int18 = sumWithoutArithmeticOperators0.getSum(278, 725);
        int int21 = sumWithoutArithmeticOperators0.getSum(181, 674);
        int int24 = sumWithoutArithmeticOperators0.getSum(8003, 7410);
        int int27 = sumWithoutArithmeticOperators0.getSum(1320, 7307);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 21 + "'", int9 == 21);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 200 + "'", int12 == 200);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1044 + "'", int15 == 1044);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1003 + "'", int18 == 1003);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 855 + "'", int21 == 855);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 15413 + "'", int24 == 15413);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 8627 + "'", int27 == 8627);
    }

    @Test
    public void test3367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3367");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(21, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(0, 10);
        int int15 = sumWithoutArithmeticOperators0.getSum(488, 1236);
        int int18 = sumWithoutArithmeticOperators0.getSum(546, 853);
        int int21 = sumWithoutArithmeticOperators0.getSum(452, 1281);
        int int24 = sumWithoutArithmeticOperators0.getSum(666, 9075);
        int int27 = sumWithoutArithmeticOperators0.getSum(817, 823);
        java.lang.Class<?> wildcardClass28 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 21 + "'", int9 == 21);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1724 + "'", int15 == 1724);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1399 + "'", int18 == 1399);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1733 + "'", int21 == 1733);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 9741 + "'", int24 == 9741);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1640 + "'", int27 == 1640);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3368");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(10, 352);
        int int15 = sumWithoutArithmeticOperators0.getSum(0, 21723);
        int int18 = sumWithoutArithmeticOperators0.getSum(8371, 1114);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 362 + "'", int12 == 362);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 21723 + "'", int15 == 21723);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9485 + "'", int18 == 9485);
    }

    @Test
    public void test3369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3369");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum(129, 165);
        int int12 = sumWithoutArithmeticOperators0.getSum(152, 108);
        int int15 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 55);
        int int18 = sumWithoutArithmeticOperators0.getSum(52, 108);
        int int21 = sumWithoutArithmeticOperators0.getSum(593, 945);
        java.lang.Class<?> wildcardClass22 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 294 + "'", int9 == 294);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 260 + "'", int12 == 260);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 54 + "'", int15 == 54);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 160 + "'", int18 == 160);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1538 + "'", int21 == 1538);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3370");
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
        int int30 = sumWithoutArithmeticOperators0.getSum(17002, 1903);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 98 + "'", int9 == 98);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 561 + "'", int12 == 561);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1164 + "'", int15 == 1164);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4950 + "'", int18 == 4950);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 6909 + "'", int21 == 6909);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 9415 + "'", int24 == 9415);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 8343 + "'", int27 == 8343);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 18905 + "'", int30 == 18905);
    }

    @Test
    public void test3371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3371");
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
        int int36 = sumWithoutArithmeticOperators0.getSum(596, 6271);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 6867 + "'", int36 == 6867);
    }

    @Test
    public void test3372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3372");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) 0, (int) (short) -1);
        int int15 = sumWithoutArithmeticOperators0.getSum(635, 151);
        int int18 = sumWithoutArithmeticOperators0.getSum(734, 3577);
        int int21 = sumWithoutArithmeticOperators0.getSum(3291, 110);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 786 + "'", int15 == 786);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4311 + "'", int18 == 4311);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3401 + "'", int21 == 3401);
    }

    @Test
    public void test3373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3373");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(35, (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 35);
        int int15 = sumWithoutArithmeticOperators0.getSum(651, 938);
        int int18 = sumWithoutArithmeticOperators0.getSum(265, 671);
        int int21 = sumWithoutArithmeticOperators0.getSum(3406, 1748);
        int int24 = sumWithoutArithmeticOperators0.getSum(1278, 2223);
        int int27 = sumWithoutArithmeticOperators0.getSum(2123, 179);
        int int30 = sumWithoutArithmeticOperators0.getSum(1430, 3100);
        int int33 = sumWithoutArithmeticOperators0.getSum(0, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1589 + "'", int15 == 1589);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 936 + "'", int18 == 936);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5154 + "'", int21 == 5154);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3501 + "'", int24 == 3501);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2302 + "'", int27 == 2302);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4530 + "'", int30 == 4530);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test3374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3374");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((-1), 35);
        int int15 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 250);
        int int18 = sumWithoutArithmeticOperators0.getSum(469, 665);
        int int21 = sumWithoutArithmeticOperators0.getSum(593, 1507);
        java.lang.Class<?> wildcardClass22 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 249 + "'", int15 == 249);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1134 + "'", int18 == 1134);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2100 + "'", int21 == 2100);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3375");
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
        int int30 = sumWithoutArithmeticOperators0.getSum(1296, 1881);
        int int33 = sumWithoutArithmeticOperators0.getSum(7066, 2139);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 36 + "'", int15 == 36);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 253 + "'", int18 == 253);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 322 + "'", int21 == 322);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 674 + "'", int24 == 674);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2536 + "'", int27 == 2536);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3177 + "'", int30 == 3177);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 9205 + "'", int33 == 9205);
    }

    @Test
    public void test3376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3376");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 1, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(21, 11);
        int int15 = sumWithoutArithmeticOperators0.getSum(101, 21);
        int int18 = sumWithoutArithmeticOperators0.getSum(17, 983);
        int int21 = sumWithoutArithmeticOperators0.getSum(7723, 11510);
        int int24 = sumWithoutArithmeticOperators0.getSum(1242, 32018);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 122 + "'", int15 == 122);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1000 + "'", int18 == 1000);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 19233 + "'", int21 == 19233);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 33260 + "'", int24 == 33260);
    }

    @Test
    public void test3377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3377");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(129, 109);
        int int12 = sumWithoutArithmeticOperators0.getSum(390, 109);
        int int15 = sumWithoutArithmeticOperators0.getSum(11, (int) (short) 0);
        int int18 = sumWithoutArithmeticOperators0.getSum(411, 683);
        java.lang.Class<?> wildcardClass19 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 238 + "'", int9 == 238);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 499 + "'", int12 == 499);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 11 + "'", int15 == 11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1094 + "'", int18 == 1094);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3378");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 53);
        int int15 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 35);
        int int18 = sumWithoutArithmeticOperators0.getSum(294, (int) (short) -1);
        int int21 = sumWithoutArithmeticOperators0.getSum(614, 734);
        int int24 = sumWithoutArithmeticOperators0.getSum(17464, 3224);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 34 + "'", int15 == 34);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 293 + "'", int18 == 293);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1348 + "'", int21 == 1348);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 20688 + "'", int24 == 20688);
    }

    @Test
    public void test3379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3379");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(35, (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 35);
        int int15 = sumWithoutArithmeticOperators0.getSum(53, 36);
        int int18 = sumWithoutArithmeticOperators0.getSum(576, 1327);
        int int21 = sumWithoutArithmeticOperators0.getSum(6866, 507);
        int int24 = sumWithoutArithmeticOperators0.getSum(5812, 3831);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 89 + "'", int15 == 89);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1903 + "'", int18 == 1903);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 7373 + "'", int21 == 7373);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 9643 + "'", int24 == 9643);
    }

    @Test
    public void test3380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3380");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, (int) (short) 10);
        int int12 = sumWithoutArithmeticOperators0.getSum(330, 1206);
        int int15 = sumWithoutArithmeticOperators0.getSum(0, 2471);
        java.lang.Class<?> wildcardClass16 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1536 + "'", int12 == 1536);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2471 + "'", int15 == 2471);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3381");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(257, 250);
        int int12 = sumWithoutArithmeticOperators0.getSum(221, 360);
        int int15 = sumWithoutArithmeticOperators0.getSum(885, (int) '#');
        int int18 = sumWithoutArithmeticOperators0.getSum(1236, 3597);
        java.lang.Class<?> wildcardClass19 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 507 + "'", int9 == 507);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 581 + "'", int12 == 581);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 920 + "'", int15 == 920);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4833 + "'", int18 == 4833);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3382");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) 0, (int) (short) -1);
        int int15 = sumWithoutArithmeticOperators0.getSum((int) ' ', 1);
        int int18 = sumWithoutArithmeticOperators0.getSum(11, 152);
        int int21 = sumWithoutArithmeticOperators0.getSum(19, 238);
        int int24 = sumWithoutArithmeticOperators0.getSum(1425, 251);
        java.lang.Class<?> wildcardClass25 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 33 + "'", int15 == 33);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 163 + "'", int18 == 163);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 257 + "'", int21 == 257);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1676 + "'", int24 == 1676);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3383");
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
        int int30 = sumWithoutArithmeticOperators0.getSum(1972, 46);
        int int33 = sumWithoutArithmeticOperators0.getSum(13381, 9);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2018 + "'", int30 == 2018);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 13390 + "'", int33 == 13390);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test3384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3384");
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
        int int30 = sumWithoutArithmeticOperators0.getSum(16630, 4833);
        java.lang.Class<?> wildcardClass31 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 122 + "'", int15 == 122);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 269 + "'", int18 == 269);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 251 + "'", int21 == 251);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 122 + "'", int24 == 122);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4420 + "'", int27 == 4420);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 21463 + "'", int30 == 21463);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test3385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3385");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 1, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(21, 11);
        int int15 = sumWithoutArithmeticOperators0.getSum(101, 21);
        int int18 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 152);
        int int21 = sumWithoutArithmeticOperators0.getSum(210, 0);
        int int24 = sumWithoutArithmeticOperators0.getSum(15030, 6818);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 122 + "'", int15 == 122);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 162 + "'", int18 == 162);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 210 + "'", int21 == 210);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 21848 + "'", int24 == 21848);
    }

    @Test
    public void test3386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3386");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((-1), 35);
        int int15 = sumWithoutArithmeticOperators0.getSum(195, 317);
        int int18 = sumWithoutArithmeticOperators0.getSum(76, 499);
        int int21 = sumWithoutArithmeticOperators0.getSum(844, 555);
        int int24 = sumWithoutArithmeticOperators0.getSum(2529, 8743);
        java.lang.Class<?> wildcardClass25 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 512 + "'", int15 == 512);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 575 + "'", int18 == 575);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1399 + "'", int21 == 1399);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 11272 + "'", int24 == 11272);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3387");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(911, 432);
        int int12 = sumWithoutArithmeticOperators0.getSum(0, 34);
        int int15 = sumWithoutArithmeticOperators0.getSum(1241, 1352);
        int int18 = sumWithoutArithmeticOperators0.getSum(3451, 211);
        java.lang.Class<?> wildcardClass19 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1343 + "'", int9 == 1343);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2593 + "'", int15 == 2593);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3662 + "'", int18 == 3662);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3388");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, (int) (short) 10);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) '4', 134);
        int int15 = sumWithoutArithmeticOperators0.getSum(18, 1);
        int int18 = sumWithoutArithmeticOperators0.getSum((int) '#', 286);
        int int21 = sumWithoutArithmeticOperators0.getSum(0, 469);
        int int24 = sumWithoutArithmeticOperators0.getSum(7272, 2805);
        int int27 = sumWithoutArithmeticOperators0.getSum(1164, 284);
        int int30 = sumWithoutArithmeticOperators0.getSum(453, 4385);
        int int33 = sumWithoutArithmeticOperators0.getSum(15562, 533);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 186 + "'", int12 == 186);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 19 + "'", int15 == 19);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 321 + "'", int18 == 321);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 469 + "'", int21 == 469);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10077 + "'", int24 == 10077);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1448 + "'", int27 == 1448);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4838 + "'", int30 == 4838);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 16095 + "'", int33 == 16095);
    }

    @Test
    public void test3389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3389");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(129, 109);
        int int12 = sumWithoutArithmeticOperators0.getSum(390, 109);
        int int15 = sumWithoutArithmeticOperators0.getSum(523, (int) ' ');
        int int18 = sumWithoutArithmeticOperators0.getSum(486, 107);
        int int21 = sumWithoutArithmeticOperators0.getSum(76, 11419);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 238 + "'", int9 == 238);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 499 + "'", int12 == 499);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 555 + "'", int15 == 555);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 593 + "'", int18 == 593);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 11495 + "'", int21 == 11495);
    }

    @Test
    public void test3390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3390");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(129, 109);
        int int12 = sumWithoutArithmeticOperators0.getSum(390, 109);
        int int15 = sumWithoutArithmeticOperators0.getSum(523, (int) ' ');
        int int18 = sumWithoutArithmeticOperators0.getSum(486, 107);
        int int21 = sumWithoutArithmeticOperators0.getSum(309, 803);
        int int24 = sumWithoutArithmeticOperators0.getSum(3433, 7227);
        int int27 = sumWithoutArithmeticOperators0.getSum(738, 7753);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 238 + "'", int9 == 238);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 499 + "'", int12 == 499);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 555 + "'", int15 == 555);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 593 + "'", int18 == 593);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1112 + "'", int21 == 1112);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10660 + "'", int24 == 10660);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 8491 + "'", int27 == 8491);
    }

    @Test
    public void test3391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3391");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(40, 269);
        int int6 = sumWithoutArithmeticOperators0.getSum(202, 523);
        int int9 = sumWithoutArithmeticOperators0.getSum(362, 1680);
        int int12 = sumWithoutArithmeticOperators0.getSum(3364, 715);
        int int15 = sumWithoutArithmeticOperators0.getSum(1971, 11882);
        int int18 = sumWithoutArithmeticOperators0.getSum(5125, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 309 + "'", int3 == 309);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 725 + "'", int6 == 725);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2042 + "'", int9 == 2042);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4079 + "'", int12 == 4079);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 13853 + "'", int15 == 13853);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5125 + "'", int18 == 5125);
    }

    @Test
    public void test3392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3392");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(0, 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(9, (int) '#');
        int int12 = sumWithoutArithmeticOperators0.getSum(211, 245);
        int int15 = sumWithoutArithmeticOperators0.getSum(697, 290);
        int int18 = sumWithoutArithmeticOperators0.getSum(5691, 201);
        java.lang.Class<?> wildcardClass19 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 152 + "'", int6 == 152);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 44 + "'", int9 == 44);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 456 + "'", int12 == 456);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 987 + "'", int15 == 987);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5892 + "'", int18 == 5892);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3393");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(10, 352);
        int int15 = sumWithoutArithmeticOperators0.getSum(8371, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 362 + "'", int12 == 362);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8371 + "'", int15 == 8371);
    }

    @Test
    public void test3394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3394");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 0, 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(104, 266);
        int int15 = sumWithoutArithmeticOperators0.getSum(454, 9920);
        int int18 = sumWithoutArithmeticOperators0.getSum(315, 5734);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 370 + "'", int12 == 370);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10374 + "'", int15 == 10374);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6049 + "'", int18 == 6049);
    }

    @Test
    public void test3395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3395");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(911, 432);
        int int12 = sumWithoutArithmeticOperators0.getSum(955, 382);
        int int15 = sumWithoutArithmeticOperators0.getSum(1723, 7852);
        int int18 = sumWithoutArithmeticOperators0.getSum(3025, 5154);
        int int21 = sumWithoutArithmeticOperators0.getSum(16535, 13480);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1343 + "'", int9 == 1343);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1337 + "'", int12 == 1337);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9575 + "'", int15 == 9575);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8179 + "'", int18 == 8179);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 30015 + "'", int21 == 30015);
    }

    @Test
    public void test3396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3396");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (short) 1, 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(9, (int) (byte) -1);
        int int15 = sumWithoutArithmeticOperators0.getSum(215, 110);
        int int18 = sumWithoutArithmeticOperators0.getSum(766, 44);
        int int21 = sumWithoutArithmeticOperators0.getSum(2229, 3946);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 325 + "'", int15 == 325);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 810 + "'", int18 == 810);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 6175 + "'", int21 == 6175);
    }

    @Test
    public void test3397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3397");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(2590, 66);
        int int6 = sumWithoutArithmeticOperators0.getSum(471, 4810);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2656 + "'", int3 == 2656);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5281 + "'", int6 == 5281);
    }

    @Test
    public void test3398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3398");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum(129, 165);
        int int12 = sumWithoutArithmeticOperators0.getSum(66, 84);
        int int15 = sumWithoutArithmeticOperators0.getSum(1352, 1187);
        java.lang.Class<?> wildcardClass16 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 294 + "'", int9 == 294);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 150 + "'", int12 == 150);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2539 + "'", int15 == 2539);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3399");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 53);
        int int15 = sumWithoutArithmeticOperators0.getSum(53, 101);
        int int18 = sumWithoutArithmeticOperators0.getSum(209, 107);
        int int21 = sumWithoutArithmeticOperators0.getSum(1112, 2645);
        int int24 = sumWithoutArithmeticOperators0.getSum(360, 2986);
        int int27 = sumWithoutArithmeticOperators0.getSum(4535, 2136);
        java.lang.Class<?> wildcardClass28 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 154 + "'", int15 == 154);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 316 + "'", int18 == 316);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3757 + "'", int21 == 3757);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3346 + "'", int24 == 3346);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 6671 + "'", int27 == 6671);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3400");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 1, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(21, 11);
        int int15 = sumWithoutArithmeticOperators0.getSum((int) '#', (int) (short) 1);
        int int18 = sumWithoutArithmeticOperators0.getSum(0, 253);
        int int21 = sumWithoutArithmeticOperators0.getSum(1128, 552);
        int int24 = sumWithoutArithmeticOperators0.getSum(1449, 3863);
        int int27 = sumWithoutArithmeticOperators0.getSum(13890, 314);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 36 + "'", int15 == 36);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 253 + "'", int18 == 253);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1680 + "'", int21 == 1680);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5312 + "'", int24 == 5312);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 14204 + "'", int27 == 14204);
    }

    @Test
    public void test3401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3401");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(21, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (short) 100);
        int int15 = sumWithoutArithmeticOperators0.getSum(955, 89);
        int int18 = sumWithoutArithmeticOperators0.getSum(278, 725);
        int int21 = sumWithoutArithmeticOperators0.getSum(601, 0);
        int int24 = sumWithoutArithmeticOperators0.getSum(865, 1724);
        int int27 = sumWithoutArithmeticOperators0.getSum(695, 236);
        int int30 = sumWithoutArithmeticOperators0.getSum(12738, 16834);
        int int33 = sumWithoutArithmeticOperators0.getSum(3024, 6586);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 21 + "'", int9 == 21);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 200 + "'", int12 == 200);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1044 + "'", int15 == 1044);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1003 + "'", int18 == 1003);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 601 + "'", int21 == 601);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2589 + "'", int24 == 2589);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 931 + "'", int27 == 931);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 29572 + "'", int30 == 29572);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 9610 + "'", int33 == 9610);
    }

    @Test
    public void test3402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3402");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(257, 250);
        int int12 = sumWithoutArithmeticOperators0.getSum(278, 2115);
        int int15 = sumWithoutArithmeticOperators0.getSum(2460, 3949);
        int int18 = sumWithoutArithmeticOperators0.getSum(31223, 5719);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 507 + "'", int9 == 507);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2393 + "'", int12 == 2393);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6409 + "'", int15 == 6409);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 36942 + "'", int18 == 36942);
    }

    @Test
    public void test3403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3403");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(345, 269);
        int int9 = sumWithoutArithmeticOperators0.getSum(2456, 3564);
        int int12 = sumWithoutArithmeticOperators0.getSum(798, 275);
        int int15 = sumWithoutArithmeticOperators0.getSum(13081, 411);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 614 + "'", int6 == 614);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 6020 + "'", int9 == 6020);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1073 + "'", int12 == 1073);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 13492 + "'", int15 == 13492);
    }

    @Test
    public void test3404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3404");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(21, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(238, 253);
        int int15 = sumWithoutArithmeticOperators0.getSum(683, 1003);
        int int18 = sumWithoutArithmeticOperators0.getSum(125, 4706);
        int int21 = sumWithoutArithmeticOperators0.getSum(7231, 13798);
        java.lang.Class<?> wildcardClass22 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 21 + "'", int9 == 21);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 491 + "'", int12 == 491);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1686 + "'", int15 == 1686);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4831 + "'", int18 == 4831);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 21029 + "'", int21 == 21029);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3405");
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
        java.lang.Class<?> wildcardClass28 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 17 + "'", int12 == 17);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 226 + "'", int15 == 226);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1700 + "'", int18 == 1700);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 431 + "'", int21 == 431);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1777 + "'", int24 == 1777);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10014 + "'", int27 == 10014);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3406");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 1, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(18, (int) (byte) -1);
        int int15 = sumWithoutArithmeticOperators0.getSum(9, 217);
        int int18 = sumWithoutArithmeticOperators0.getSum(132, 499);
        int int21 = sumWithoutArithmeticOperators0.getSum(5343, 3355);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 17 + "'", int12 == 17);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 226 + "'", int15 == 226);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 631 + "'", int18 == 631);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8698 + "'", int21 == 8698);
    }

    @Test
    public void test3407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3407");
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
        int int36 = sumWithoutArithmeticOperators0.getSum(1670, 1005);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2675 + "'", int36 == 2675);
    }

    @Test
    public void test3408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3408");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) 'a', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum(196, (int) ' ');
        int int15 = sumWithoutArithmeticOperators0.getSum(1133, 269);
        int int18 = sumWithoutArithmeticOperators0.getSum(2339, 285);
        int int21 = sumWithoutArithmeticOperators0.getSum(2449, 2207);
        java.lang.Class<?> wildcardClass22 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 98 + "'", int9 == 98);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 228 + "'", int12 == 228);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1402 + "'", int15 == 1402);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2624 + "'", int18 == 2624);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4656 + "'", int21 == 4656);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3409");
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
    }

    @Test
    public void test3410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3410");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(40, 269);
        int int6 = sumWithoutArithmeticOperators0.getSum(152, 465);
        int int9 = sumWithoutArithmeticOperators0.getSum(652, 162);
        int int12 = sumWithoutArithmeticOperators0.getSum(2456, 9238);
        int int15 = sumWithoutArithmeticOperators0.getSum(10535, 4089);
        int int18 = sumWithoutArithmeticOperators0.getSum(7798, 1164);
        int int21 = sumWithoutArithmeticOperators0.getSum(13081, 9166);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 309 + "'", int3 == 309);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 617 + "'", int6 == 617);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 814 + "'", int9 == 814);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 11694 + "'", int12 == 11694);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 14624 + "'", int15 == 14624);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8962 + "'", int18 == 8962);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 22247 + "'", int21 == 22247);
    }

    @Test
    public void test3411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3411");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 1, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(21, 11);
        int int15 = sumWithoutArithmeticOperators0.getSum((int) '#', (int) (short) 1);
        int int18 = sumWithoutArithmeticOperators0.getSum(101, 42);
        int int21 = sumWithoutArithmeticOperators0.getSum(99, 289);
        int int24 = sumWithoutArithmeticOperators0.getSum(19, 97);
        int int27 = sumWithoutArithmeticOperators0.getSum(1623, 2778);
        int int30 = sumWithoutArithmeticOperators0.getSum(2414, 8263);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 36 + "'", int15 == 36);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 143 + "'", int18 == 143);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 388 + "'", int21 == 388);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 116 + "'", int24 == 116);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4401 + "'", int27 == 4401);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10677 + "'", int30 == 10677);
    }

    @Test
    public void test3412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3412");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 18);
        int int9 = sumWithoutArithmeticOperators0.getSum(36, 160);
        int int12 = sumWithoutArithmeticOperators0.getSum((-1), 108);
        int int15 = sumWithoutArithmeticOperators0.getSum(9570, 1777);
        java.lang.Class<?> wildcardClass16 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 18 + "'", int6 == 18);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 196 + "'", int9 == 196);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 107 + "'", int12 == 107);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 11347 + "'", int15 == 11347);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3413");
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
        java.lang.Class<?> wildcardClass28 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 134 + "'", int9 == 134);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 165 + "'", int12 == 165);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 246 + "'", int18 == 246);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 352 + "'", int21 == 352);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10745 + "'", int24 == 10745);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 5220 + "'", int27 == 5220);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3414");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, (int) (short) 10);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) '4', 134);
        int int15 = sumWithoutArithmeticOperators0.getSum(162, 162);
        int int18 = sumWithoutArithmeticOperators0.getSum(6020, 278);
        int int21 = sumWithoutArithmeticOperators0.getSum(13170, 10261);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 186 + "'", int12 == 186);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 324 + "'", int15 == 324);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6298 + "'", int18 == 6298);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 23431 + "'", int21 == 23431);
    }

    @Test
    public void test3415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3415");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (short) 1, 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(9, (int) (byte) -1);
        int int15 = sumWithoutArithmeticOperators0.getSum(614, 1541);
        int int18 = sumWithoutArithmeticOperators0.getSum(1643, 1530);
        java.lang.Class<?> wildcardClass19 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2155 + "'", int15 == 2155);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3173 + "'", int18 == 3173);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3416");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 53);
        int int15 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 35);
        int int18 = sumWithoutArithmeticOperators0.getSum(1112, (-1));
        int int21 = sumWithoutArithmeticOperators0.getSum(1222, 269);
        int int24 = sumWithoutArithmeticOperators0.getSum(810, 2123);
        int int27 = sumWithoutArithmeticOperators0.getSum(1059, 1148);
        java.lang.Class<?> wildcardClass28 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 34 + "'", int15 == 34);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1111 + "'", int18 == 1111);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1491 + "'", int21 == 1491);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2933 + "'", int24 == 2933);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2207 + "'", int27 == 2207);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3417");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(0, 199);
        int int12 = sumWithoutArithmeticOperators0.getSum(156, 460);
        int int15 = sumWithoutArithmeticOperators0.getSum(1449, 983);
        int int18 = sumWithoutArithmeticOperators0.getSum(294, 486);
        int int21 = sumWithoutArithmeticOperators0.getSum(1602, 0);
        int int24 = sumWithoutArithmeticOperators0.getSum(0, 14251);
        java.lang.Class<?> wildcardClass25 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 199 + "'", int9 == 199);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 616 + "'", int12 == 616);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2432 + "'", int15 == 2432);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 780 + "'", int18 == 780);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1602 + "'", int21 == 1602);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 14251 + "'", int24 == 14251);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3418");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (short) 1, 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(9, (int) (byte) -1);
        int int15 = sumWithoutArithmeticOperators0.getSum(835, 13390);
        int int18 = sumWithoutArithmeticOperators0.getSum(20489, 10032);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 14225 + "'", int15 == 14225);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 30521 + "'", int18 == 30521);
    }

    @Test
    public void test3419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3419");
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
        java.lang.Class<?> wildcardClass31 = sumWithoutArithmeticOperators0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test3420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3420");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(10, (int) (byte) 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(1514, 1724);
        int int9 = sumWithoutArithmeticOperators0.getSum(4311, 12537);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3238 + "'", int6 == 3238);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 16848 + "'", int9 == 16848);
    }

    @Test
    public void test3421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3421");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(250, 195);
        int int9 = sumWithoutArithmeticOperators0.getSum(805, 1200);
        int int12 = sumWithoutArithmeticOperators0.getSum(7034, 1536);
        java.lang.Class<?> wildcardClass13 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 445 + "'", int6 == 445);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2005 + "'", int9 == 2005);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8570 + "'", int12 == 8570);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3422");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(21, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(107, 0);
        int int15 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, 1106);
        int int18 = sumWithoutArithmeticOperators0.getSum(615, 0);
        int int21 = sumWithoutArithmeticOperators0.getSum(8449, 3526);
        int int24 = sumWithoutArithmeticOperators0.getSum((int) '4', 4113);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 21 + "'", int9 == 21);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 107 + "'", int12 == 107);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1206 + "'", int15 == 1206);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 615 + "'", int18 == 615);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 11975 + "'", int21 == 11975);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4165 + "'", int24 == 4165);
    }

    @Test
    public void test3423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3423");
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
        int int36 = sumWithoutArithmeticOperators0.getSum(1701, 5341);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 7042 + "'", int36 == 7042);
    }

    @Test
    public void test3424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3424");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(35, (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 35);
        int int15 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 162);
        int int18 = sumWithoutArithmeticOperators0.getSum(574, 1268);
        int int21 = sumWithoutArithmeticOperators0.getSum(265, 734);
        int int24 = sumWithoutArithmeticOperators0.getSum(28340, 4980);
        int int27 = sumWithoutArithmeticOperators0.getSum(3473, 2519);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 161 + "'", int15 == 161);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1842 + "'", int18 == 1842);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 999 + "'", int21 == 999);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 33320 + "'", int24 == 33320);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 5992 + "'", int27 == 5992);
    }

    @Test
    public void test3425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3425");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 1, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(21, 11);
        int int15 = sumWithoutArithmeticOperators0.getSum((int) '#', (int) (short) 1);
        int int18 = sumWithoutArithmeticOperators0.getSum(0, 253);
        int int21 = sumWithoutArithmeticOperators0.getSum(1432, 5588);
        java.lang.Class<?> wildcardClass22 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 36 + "'", int15 == 36);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 253 + "'", int18 == 253);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 7020 + "'", int21 == 7020);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3426");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(0, 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(9, (int) '#');
        int int12 = sumWithoutArithmeticOperators0.getSum(163, 52);
        int int15 = sumWithoutArithmeticOperators0.getSum(107, 210);
        int int18 = sumWithoutArithmeticOperators0.getSum(21, 975);
        int int21 = sumWithoutArithmeticOperators0.getSum(151, 315);
        int int24 = sumWithoutArithmeticOperators0.getSum(2071, 5812);
        int int27 = sumWithoutArithmeticOperators0.getSum(15585, 812);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 152 + "'", int6 == 152);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 44 + "'", int9 == 44);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 215 + "'", int12 == 215);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 317 + "'", int15 == 317);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 996 + "'", int18 == 996);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 466 + "'", int21 == 466);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 7883 + "'", int24 == 7883);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 16397 + "'", int27 == 16397);
    }

    @Test
    public void test3427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3427");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(345, 269);
        int int9 = sumWithoutArithmeticOperators0.getSum(2456, 3564);
        int int12 = sumWithoutArithmeticOperators0.getSum(483, 14209);
        int int15 = sumWithoutArithmeticOperators0.getSum(0, 7044);
        java.lang.Class<?> wildcardClass16 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 614 + "'", int6 == 614);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 6020 + "'", int9 == 6020);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 14692 + "'", int12 == 14692);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7044 + "'", int15 == 7044);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3428");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(10, (int) (byte) 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(2310, 2123);
        int int9 = sumWithoutArithmeticOperators0.getSum(7875, 2884);
        java.lang.Class<?> wildcardClass10 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4433 + "'", int6 == 4433);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10759 + "'", int9 == 10759);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3429");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 53);
        int int15 = sumWithoutArithmeticOperators0.getSum(708, 23135);
        int int18 = sumWithoutArithmeticOperators0.getSum(0, 4323);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 23843 + "'", int15 == 23843);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4323 + "'", int18 == 4323);
    }

    @Test
    public void test3430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3430");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(51, 53);
        int int15 = sumWithoutArithmeticOperators0.getSum(238, (int) '4');
        int int18 = sumWithoutArithmeticOperators0.getSum(455, (int) (short) 0);
        int int21 = sumWithoutArithmeticOperators0.getSum(370, 15637);
        int int24 = sumWithoutArithmeticOperators0.getSum(13285, 6422);
        java.lang.Class<?> wildcardClass25 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 104 + "'", int12 == 104);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 290 + "'", int15 == 290);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 455 + "'", int18 == 455);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 16007 + "'", int21 == 16007);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 19707 + "'", int24 == 19707);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3431");
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
        java.lang.Class<?> wildcardClass28 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 21 + "'", int9 == 21);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 200 + "'", int12 == 200);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 499 + "'", int15 == 499);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8855 + "'", int18 == 8855);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1169 + "'", int21 == 1169);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4197 + "'", int24 == 4197);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 12027 + "'", int27 == 12027);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3432");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 1, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(18, (int) (byte) -1);
        int int15 = sumWithoutArithmeticOperators0.getSum(9, 217);
        int int18 = sumWithoutArithmeticOperators0.getSum(132, 499);
        int int21 = sumWithoutArithmeticOperators0.getSum(4879, 2316);
        int int24 = sumWithoutArithmeticOperators0.getSum(1179, 4999);
        java.lang.Class<?> wildcardClass25 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 17 + "'", int12 == 17);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 226 + "'", int15 == 226);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 631 + "'", int18 == 631);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 7195 + "'", int21 == 7195);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6178 + "'", int24 == 6178);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3433");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(911, 432);
        int int12 = sumWithoutArithmeticOperators0.getSum(526, 184);
        int int15 = sumWithoutArithmeticOperators0.getSum(0, 29401);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1343 + "'", int9 == 1343);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 710 + "'", int12 == 710);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 29401 + "'", int15 == 29401);
    }

    @Test
    public void test3434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3434");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 53);
        int int15 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 35);
        int int18 = sumWithoutArithmeticOperators0.getSum(1112, (-1));
        int int21 = sumWithoutArithmeticOperators0.getSum(1222, 269);
        int int24 = sumWithoutArithmeticOperators0.getSum(3949, 243);
        int int27 = sumWithoutArithmeticOperators0.getSum(11431, 4215);
        java.lang.Class<?> wildcardClass28 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 34 + "'", int15 == 34);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1111 + "'", int18 == 1111);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1491 + "'", int21 == 1491);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4192 + "'", int24 == 4192);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 15646 + "'", int27 == 15646);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3435");
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
        int int39 = sumWithoutArithmeticOperators0.getSum(22131, 5028);
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 27159 + "'", int39 == 27159);
    }

    @Test
    public void test3436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3436");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(0, 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(9, (int) '#');
        int int12 = sumWithoutArithmeticOperators0.getSum(51, 66);
        int int15 = sumWithoutArithmeticOperators0.getSum(6660, 1899);
        int int18 = sumWithoutArithmeticOperators0.getSum(900, 7016);
        int int21 = sumWithoutArithmeticOperators0.getSum(9136, 16482);
        java.lang.Class<?> wildcardClass22 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 152 + "'", int6 == 152);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 44 + "'", int9 == 44);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 117 + "'", int12 == 117);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8559 + "'", int15 == 8559);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 7916 + "'", int18 == 7916);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 25618 + "'", int21 == 25618);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3437");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(129, 109);
        int int12 = sumWithoutArithmeticOperators0.getSum(390, 109);
        int int15 = sumWithoutArithmeticOperators0.getSum(781, 555);
        java.lang.Class<?> wildcardClass16 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 238 + "'", int9 == 238);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 499 + "'", int12 == 499);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1336 + "'", int15 == 1336);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3438");
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
        java.lang.Class<?> wildcardClass46 = sumWithoutArithmeticOperators0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test3439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3439");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 1, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(18, (int) (byte) -1);
        int int15 = sumWithoutArithmeticOperators0.getSum(51, 422);
        int int18 = sumWithoutArithmeticOperators0.getSum(567, 0);
        int int21 = sumWithoutArithmeticOperators0.getSum(1980, 2383);
        int int24 = sumWithoutArithmeticOperators0.getSum(7916, 0);
        int int27 = sumWithoutArithmeticOperators0.getSum(1040, 692);
        int int30 = sumWithoutArithmeticOperators0.getSum(11721, 10410);
        java.lang.Class<?> wildcardClass31 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 17 + "'", int12 == 17);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 473 + "'", int15 == 473);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 567 + "'", int18 == 567);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4363 + "'", int21 == 4363);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 7916 + "'", int24 == 7916);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1732 + "'", int27 == 1732);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 22131 + "'", int30 == 22131);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test3440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3440");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) ' ', 9);
        int int15 = sumWithoutArithmeticOperators0.getSum(253, 483);
        int int18 = sumWithoutArithmeticOperators0.getSum(243, 125);
        int int21 = sumWithoutArithmeticOperators0.getSum(3997, 2085);
        int int24 = sumWithoutArithmeticOperators0.getSum(2778, 3571);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 41 + "'", int12 == 41);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 736 + "'", int15 == 736);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 368 + "'", int18 == 368);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 6082 + "'", int21 == 6082);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6349 + "'", int24 == 6349);
    }

    @Test
    public void test3441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3441");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(200, (int) (byte) 0);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (short) -1, 129);
        int int12 = sumWithoutArithmeticOperators0.getSum(11898, 6828);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 200 + "'", int6 == 200);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 128 + "'", int9 == 128);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 18726 + "'", int12 == 18726);
    }

    @Test
    public void test3442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3442");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(4671, 498);
        int int12 = sumWithoutArithmeticOperators0.getSum(379, 0);
        int int15 = sumWithoutArithmeticOperators0.getSum(6074, 1710);
        java.lang.Class<?> wildcardClass16 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5169 + "'", int9 == 5169);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 379 + "'", int12 == 379);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7784 + "'", int15 == 7784);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3443");
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
        int int30 = sumWithoutArithmeticOperators0.getSum(9346, 51202);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 84 + "'", int12 == 84);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 101 + "'", int15 == 101);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 245 + "'", int18 == 245);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1010 + "'", int21 == 1010);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 15511 + "'", int24 == 15511);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 8817 + "'", int27 == 8817);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 60548 + "'", int30 == 60548);
    }

    @Test
    public void test3444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3444");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((-1), 35);
        int int15 = sumWithoutArithmeticOperators0.getSum(195, 317);
        int int18 = sumWithoutArithmeticOperators0.getSum(196, 1099);
        int int21 = sumWithoutArithmeticOperators0.getSum(2882, 15500);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 512 + "'", int15 == 512);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1295 + "'", int18 == 1295);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 18382 + "'", int21 == 18382);
    }

    @Test
    public void test3445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3445");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(10, (int) (byte) 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(306, 180);
        int int9 = sumWithoutArithmeticOperators0.getSum(10458, 375);
        int int12 = sumWithoutArithmeticOperators0.getSum(16904, 1080);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 486 + "'", int6 == 486);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10833 + "'", int9 == 10833);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 17984 + "'", int12 == 17984);
    }

    @Test
    public void test3446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3446");
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
        int int48 = sumWithoutArithmeticOperators0.getSum(10628, 6549);
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
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 17177 + "'", int48 == 17177);
    }

    @Test
    public void test3447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3447");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(0, 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(9, (int) '#');
        int int12 = sumWithoutArithmeticOperators0.getSum(163, 52);
        int int15 = sumWithoutArithmeticOperators0.getSum(107, 210);
        int int18 = sumWithoutArithmeticOperators0.getSum(21, 975);
        int int21 = sumWithoutArithmeticOperators0.getSum(27492, 5408);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 152 + "'", int6 == 152);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 44 + "'", int9 == 44);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 215 + "'", int12 == 215);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 317 + "'", int15 == 317);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 996 + "'", int18 == 996);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 32900 + "'", int21 == 32900);
    }

    @Test
    public void test3448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3448");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(911, 432);
        int int12 = sumWithoutArithmeticOperators0.getSum(955, 382);
        int int15 = sumWithoutArithmeticOperators0.getSum(1723, 7852);
        int int18 = sumWithoutArithmeticOperators0.getSum(0, (int) '4');
        java.lang.Class<?> wildcardClass19 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1343 + "'", int9 == 1343);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1337 + "'", int12 == 1337);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9575 + "'", int15 == 9575);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3449");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(0, 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(10, (int) (byte) 100);
        int int12 = sumWithoutArithmeticOperators0.getSum(260, 195);
        int int15 = sumWithoutArithmeticOperators0.getSum(316, 1491);
        int int18 = sumWithoutArithmeticOperators0.getSum(998, 542);
        int int21 = sumWithoutArithmeticOperators0.getSum(8807, 3502);
        int int24 = sumWithoutArithmeticOperators0.getSum(17237, 12812);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 152 + "'", int6 == 152);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 455 + "'", int12 == 455);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1807 + "'", int15 == 1807);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1540 + "'", int18 == 1540);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 12309 + "'", int21 == 12309);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 30049 + "'", int24 == 30049);
    }

    @Test
    public void test3450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3450");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(35, (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 35);
        int int15 = sumWithoutArithmeticOperators0.getSum(3550, 1829);
        int int18 = sumWithoutArithmeticOperators0.getSum(2535, 9395);
        int int21 = sumWithoutArithmeticOperators0.getSum(11930, 1424);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5379 + "'", int15 == 5379);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 11930 + "'", int18 == 11930);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 13354 + "'", int21 == 13354);
    }

    @Test
    public void test3451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3451");
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
        int int36 = sumWithoutArithmeticOperators0.getSum(6908, 277);
        java.lang.Class<?> wildcardClass37 = sumWithoutArithmeticOperators0.getClass();
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 7185 + "'", int36 == 7185);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test3452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3452");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(32, (int) '4');
        int int15 = sumWithoutArithmeticOperators0.getSum(44, 100);
        int int18 = sumWithoutArithmeticOperators0.getSum(110, 53);
        int int21 = sumWithoutArithmeticOperators0.getSum(51, 215);
        int int24 = sumWithoutArithmeticOperators0.getSum(680, 616);
        int int27 = sumWithoutArithmeticOperators0.getSum(739, 760);
        int int30 = sumWithoutArithmeticOperators0.getSum(3526, 2518);
        java.lang.Class<?> wildcardClass31 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 84 + "'", int12 == 84);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 144 + "'", int15 == 144);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 163 + "'", int18 == 163);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 266 + "'", int21 == 266);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1296 + "'", int24 == 1296);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1499 + "'", int27 == 1499);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 6044 + "'", int30 == 6044);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test3453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3453");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(257, 250);
        int int12 = sumWithoutArithmeticOperators0.getSum(13677, 1029);
        int int15 = sumWithoutArithmeticOperators0.getSum(1134, 555);
        int int18 = sumWithoutArithmeticOperators0.getSum(1654, 35424);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 507 + "'", int9 == 507);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 14706 + "'", int12 == 14706);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1689 + "'", int15 == 1689);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 37078 + "'", int18 == 37078);
    }

    @Test
    public void test3454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3454");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(5007, 7136);
        java.lang.Class<?> wildcardClass10 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 12143 + "'", int9 == 12143);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3455");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (short) 100, 34);
        int int12 = sumWithoutArithmeticOperators0.getSum(144, 21);
        int int15 = sumWithoutArithmeticOperators0.getSum(0, 35);
        int int18 = sumWithoutArithmeticOperators0.getSum(210, 36);
        int int21 = sumWithoutArithmeticOperators0.getSum(317, 110);
        int int24 = sumWithoutArithmeticOperators0.getSum(388, 240);
        int int27 = sumWithoutArithmeticOperators0.getSum(8345, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 134 + "'", int9 == 134);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 165 + "'", int12 == 165);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 246 + "'", int18 == 246);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 427 + "'", int21 == 427);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 628 + "'", int24 == 628);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 8345 + "'", int27 == 8345);
    }

    @Test
    public void test3456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3456");
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
        int int30 = sumWithoutArithmeticOperators0.getSum(3482, 4985);
        int int33 = sumWithoutArithmeticOperators0.getSum(5889, 18574);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 33 + "'", int15 == 33);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 163 + "'", int18 == 163);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 295 + "'", int21 == 295);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 166 + "'", int24 == 166);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4171 + "'", int27 == 4171);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 8467 + "'", int30 == 8467);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 24463 + "'", int33 == 24463);
    }

    @Test
    public void test3457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3457");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) -1, 19);
        int int6 = sumWithoutArithmeticOperators0.getSum(21, 35);
        int int9 = sumWithoutArithmeticOperators0.getSum(13871, 9458);
        java.lang.Class<?> wildcardClass10 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 18 + "'", int3 == 18);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 56 + "'", int6 == 56);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 23329 + "'", int9 == 23329);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3458");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 18);
        int int9 = sumWithoutArithmeticOperators0.getSum(36, 160);
        int int12 = sumWithoutArithmeticOperators0.getSum((-1), 108);
        int int15 = sumWithoutArithmeticOperators0.getSum(9570, 1777);
        int int18 = sumWithoutArithmeticOperators0.getSum(6567, 6567);
        int int21 = sumWithoutArithmeticOperators0.getSum(13614, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 18 + "'", int6 == 18);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 196 + "'", int9 == 196);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 107 + "'", int12 == 107);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 11347 + "'", int15 == 11347);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 13134 + "'", int18 == 13134);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 13614 + "'", int21 == 13614);
    }

    @Test
    public void test3459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3459");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(51, 53);
        int int15 = sumWithoutArithmeticOperators0.getSum(375, 352);
        int int18 = sumWithoutArithmeticOperators0.getSum(215, (int) '#');
        int int21 = sumWithoutArithmeticOperators0.getSum(42, 724);
        int int24 = sumWithoutArithmeticOperators0.getSum(19, 460);
        int int27 = sumWithoutArithmeticOperators0.getSum(2165, 1247);
        int int30 = sumWithoutArithmeticOperators0.getSum(1562, (int) (byte) 100);
        int int33 = sumWithoutArithmeticOperators0.getSum(2070, 19413);
        int int36 = sumWithoutArithmeticOperators0.getSum(9155, 7769);
        java.lang.Class<?> wildcardClass37 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 104 + "'", int12 == 104);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 727 + "'", int15 == 727);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 250 + "'", int18 == 250);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 766 + "'", int21 == 766);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 479 + "'", int24 == 479);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3412 + "'", int27 == 3412);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1662 + "'", int30 == 1662);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 21483 + "'", int33 == 21483);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 16924 + "'", int36 == 16924);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test3460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3460");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(21, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(210, 1);
        int int15 = sumWithoutArithmeticOperators0.getSum(226, 17);
        int int18 = sumWithoutArithmeticOperators0.getSum(275, 337);
        int int21 = sumWithoutArithmeticOperators0.getSum(22030, 5626);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 21 + "'", int9 == 21);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 211 + "'", int12 == 211);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 243 + "'", int15 == 243);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 612 + "'", int18 == 612);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 27656 + "'", int21 == 27656);
    }

    @Test
    public void test3461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3461");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(35, (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 35);
        int int15 = sumWithoutArithmeticOperators0.getSum(33, 163);
        int int18 = sumWithoutArithmeticOperators0.getSum((int) 'a', (int) (byte) 100);
        int int21 = sumWithoutArithmeticOperators0.getSum(499, (int) (byte) -1);
        int int24 = sumWithoutArithmeticOperators0.getSum(725, (int) (short) 10);
        int int27 = sumWithoutArithmeticOperators0.getSum(2432, 1187);
        java.lang.Class<?> wildcardClass28 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 196 + "'", int15 == 196);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 197 + "'", int18 == 197);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 498 + "'", int21 == 498);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 735 + "'", int24 == 735);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3619 + "'", int27 == 3619);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3462");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(0, 199);
        int int12 = sumWithoutArithmeticOperators0.getSum(324, 614);
        int int15 = sumWithoutArithmeticOperators0.getSum(1238, 1072);
        int int18 = sumWithoutArithmeticOperators0.getSum(180, 2748);
        java.lang.Class<?> wildcardClass19 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 199 + "'", int9 == 199);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 938 + "'", int12 == 938);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2310 + "'", int15 == 2310);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2928 + "'", int18 == 2928);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3463");
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
        int int39 = sumWithoutArithmeticOperators0.getSum(376, 674);
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1050 + "'", int39 == 1050);
    }

    @Test
    public void test3464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3464");
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
        java.lang.Class<?> wildcardClass31 = sumWithoutArithmeticOperators0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test3465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3465");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(35, (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 35);
        int int15 = sumWithoutArithmeticOperators0.getSum(53, 36);
        int int18 = sumWithoutArithmeticOperators0.getSum(526, 213);
        int int21 = sumWithoutArithmeticOperators0.getSum(311, 786);
        int int24 = sumWithoutArithmeticOperators0.getSum(456, 9649);
        int int27 = sumWithoutArithmeticOperators0.getSum(14228, 9649);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 89 + "'", int15 == 89);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 739 + "'", int18 == 739);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1097 + "'", int21 == 1097);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10105 + "'", int24 == 10105);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 23877 + "'", int27 == 23877);
    }

    @Test
    public void test3466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3466");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(21, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (short) 100);
        int int15 = sumWithoutArithmeticOperators0.getSum(955, 89);
        int int18 = sumWithoutArithmeticOperators0.getSum(278, 725);
        int int21 = sumWithoutArithmeticOperators0.getSum(191, 421);
        int int24 = sumWithoutArithmeticOperators0.getSum(3841, 753);
        int int27 = sumWithoutArithmeticOperators0.getSum(1399, 15536);
        java.lang.Class<?> wildcardClass28 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 21 + "'", int9 == 21);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 200 + "'", int12 == 200);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1044 + "'", int15 == 1044);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1003 + "'", int18 == 1003);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 612 + "'", int21 == 612);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4594 + "'", int24 == 4594);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 16935 + "'", int27 == 16935);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3467");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(129, 109);
        int int12 = sumWithoutArithmeticOperators0.getSum(390, 109);
        int int15 = sumWithoutArithmeticOperators0.getSum(11, (int) (short) 0);
        int int18 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 35);
        int int21 = sumWithoutArithmeticOperators0.getSum(15086, 7683);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 238 + "'", int9 == 238);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 499 + "'", int12 == 499);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 11 + "'", int15 == 11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 34 + "'", int18 == 34);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 22769 + "'", int21 == 22769);
    }

    @Test
    public void test3468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3468");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, 98);
        int int9 = sumWithoutArithmeticOperators0.getSum(1281, 246);
        int int12 = sumWithoutArithmeticOperators0.getSum(1762, 1690);
        int int15 = sumWithoutArithmeticOperators0.getSum(2400, 195);
        java.lang.Class<?> wildcardClass16 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 108 + "'", int6 == 108);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1527 + "'", int9 == 1527);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3452 + "'", int12 == 3452);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2595 + "'", int15 == 2595);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3469");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 18);
        int int9 = sumWithoutArithmeticOperators0.getSum(36, 160);
        int int12 = sumWithoutArithmeticOperators0.getSum(1623, 760);
        int int15 = sumWithoutArithmeticOperators0.getSum(848, 18794);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 18 + "'", int6 == 18);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 196 + "'", int9 == 196);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2383 + "'", int12 == 2383);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 19642 + "'", int15 == 19642);
    }

    @Test
    public void test3470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3470");
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
    }

    @Test
    public void test3471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3471");
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
        int int30 = sumWithoutArithmeticOperators0.getSum(1491, 628);
        int int33 = sumWithoutArithmeticOperators0.getSum(2460, 14835);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 84 + "'", int12 == 84);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 144 + "'", int15 == 144);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 163 + "'", int18 == 163);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 7 + "'", int21 == 7);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 724 + "'", int24 == 724);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 627 + "'", int27 == 627);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2119 + "'", int30 == 2119);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 17295 + "'", int33 == 17295);
    }

    @Test
    public void test3472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3472");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(10, (int) (byte) 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(306, 180);
        int int9 = sumWithoutArithmeticOperators0.getSum(736, 1241);
        int int12 = sumWithoutArithmeticOperators0.getSum(1379, 2394);
        int int15 = sumWithoutArithmeticOperators0.getSum(35, 2617);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 486 + "'", int6 == 486);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1977 + "'", int9 == 1977);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3773 + "'", int12 == 3773);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2652 + "'", int15 == 2652);
    }

    @Test
    public void test3473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3473");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(257, 250);
        int int12 = sumWithoutArithmeticOperators0.getSum(221, 360);
        int int15 = sumWithoutArithmeticOperators0.getSum(885, (int) '#');
        int int18 = sumWithoutArithmeticOperators0.getSum(6951, 0);
        int int21 = sumWithoutArithmeticOperators0.getSum(10161, 3517);
        java.lang.Class<?> wildcardClass22 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 507 + "'", int9 == 507);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 581 + "'", int12 == 581);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 920 + "'", int15 == 920);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6951 + "'", int18 == 6951);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 13678 + "'", int21 == 13678);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3474");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(129, 109);
        int int12 = sumWithoutArithmeticOperators0.getSum(390, 109);
        int int15 = sumWithoutArithmeticOperators0.getSum(325, 240);
        int int18 = sumWithoutArithmeticOperators0.getSum(5645, 12497);
        int int21 = sumWithoutArithmeticOperators0.getSum(10378, 6617);
        java.lang.Class<?> wildcardClass22 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 238 + "'", int9 == 238);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 499 + "'", int12 == 499);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 565 + "'", int15 == 565);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 18142 + "'", int18 == 18142);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 16995 + "'", int21 == 16995);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3475");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) 0, (int) (short) -1);
        int int15 = sumWithoutArithmeticOperators0.getSum(635, 151);
        int int18 = sumWithoutArithmeticOperators0.getSum(1105, 1121);
        int int21 = sumWithoutArithmeticOperators0.getSum(2049, 975);
        int int24 = sumWithoutArithmeticOperators0.getSum(166, 1375);
        int int27 = sumWithoutArithmeticOperators0.getSum(16007, 9920);
        int int30 = sumWithoutArithmeticOperators0.getSum(48629, 16390);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 786 + "'", int15 == 786);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2226 + "'", int18 == 2226);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3024 + "'", int21 == 3024);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1541 + "'", int24 == 1541);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 25927 + "'", int27 == 25927);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 65019 + "'", int30 == 65019);
    }

    @Test
    public void test3476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3476");
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
        int int33 = sumWithoutArithmeticOperators0.getSum(1283, 10914);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 12197 + "'", int33 == 12197);
    }

    @Test
    public void test3477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3477");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(250, 195);
        int int9 = sumWithoutArithmeticOperators0.getSum(533, 735);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) 'a', 4076);
        int int15 = sumWithoutArithmeticOperators0.getSum(181, 3897);
        int int18 = sumWithoutArithmeticOperators0.getSum(2841, 2036);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 445 + "'", int6 == 445);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1268 + "'", int9 == 1268);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4173 + "'", int12 == 4173);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4078 + "'", int15 == 4078);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4877 + "'", int18 == 4877);
    }

    @Test
    public void test3478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3478");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (short) 1, 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(9, (int) (byte) -1);
        int int15 = sumWithoutArithmeticOperators0.getSum(614, 1541);
        int int18 = sumWithoutArithmeticOperators0.getSum(1643, 1530);
        int int21 = sumWithoutArithmeticOperators0.getSum(0, 254);
        int int24 = sumWithoutArithmeticOperators0.getSum(179, 15874);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2155 + "'", int15 == 2155);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3173 + "'", int18 == 3173);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 254 + "'", int21 == 254);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 16053 + "'", int24 == 16053);
    }

    @Test
    public void test3479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3479");
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
        int int30 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1527);
        java.lang.Class<?> wildcardClass31 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 134 + "'", int9 == 134);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 165 + "'", int12 == 165);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 246 + "'", int18 == 246);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 427 + "'", int21 == 427);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 628 + "'", int24 == 628);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 8010 + "'", int27 == 8010);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1537 + "'", int30 == 1537);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test3480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3480");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(129, 109);
        int int12 = sumWithoutArithmeticOperators0.getSum(390, 109);
        int int15 = sumWithoutArithmeticOperators0.getSum(266, 2767);
        int int18 = sumWithoutArithmeticOperators0.getSum(42449, 9483);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 238 + "'", int9 == 238);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 499 + "'", int12 == 499);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3033 + "'", int15 == 3033);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 51932 + "'", int18 == 51932);
    }

    @Test
    public void test3481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3481");
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
        int int36 = sumWithoutArithmeticOperators0.getSum(9980, 9454);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 19434 + "'", int36 == 19434);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test3482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3482");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, (int) (short) 10);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) '4', 134);
        int int15 = sumWithoutArithmeticOperators0.getSum(18, 1);
        int int18 = sumWithoutArithmeticOperators0.getSum((int) '#', 286);
        int int21 = sumWithoutArithmeticOperators0.getSum(202, 0);
        int int24 = sumWithoutArithmeticOperators0.getSum(7825, 7776);
        java.lang.Class<?> wildcardClass25 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 186 + "'", int12 == 186);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 19 + "'", int15 == 19);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 321 + "'", int18 == 321);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 202 + "'", int21 == 202);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 15601 + "'", int24 == 15601);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3483");
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
        int int30 = sumWithoutArithmeticOperators0.getSum(285, 11892);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 345 + "'", int18 == 345);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2520 + "'", int21 == 2520);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1364 + "'", int24 == 1364);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2863 + "'", int27 == 2863);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 12177 + "'", int30 == 12177);
    }

    @Test
    public void test3484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3484");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(35, (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 35);
        int int15 = sumWithoutArithmeticOperators0.getSum(53, 36);
        int int18 = sumWithoutArithmeticOperators0.getSum(526, 213);
        int int21 = sumWithoutArithmeticOperators0.getSum(271, 253);
        int int24 = sumWithoutArithmeticOperators0.getSum(2887, 3371);
        int int27 = sumWithoutArithmeticOperators0.getSum(9483, 2353);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 89 + "'", int15 == 89);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 739 + "'", int18 == 739);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 524 + "'", int21 == 524);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6258 + "'", int24 == 6258);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 11836 + "'", int27 == 11836);
    }

    @Test
    public void test3485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3485");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) 'a', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum(196, (int) ' ');
        int int15 = sumWithoutArithmeticOperators0.getSum(1128, 108);
        int int18 = sumWithoutArithmeticOperators0.getSum(123, 309);
        int int21 = sumWithoutArithmeticOperators0.getSum(9909, 4374);
        int int24 = sumWithoutArithmeticOperators0.getSum(41, 1511);
        java.lang.Class<?> wildcardClass25 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 98 + "'", int9 == 98);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 228 + "'", int12 == 228);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1236 + "'", int15 == 1236);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 432 + "'", int18 == 432);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 14283 + "'", int21 == 14283);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1552 + "'", int24 == 1552);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3486");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(21, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (short) 100);
        int int15 = sumWithoutArithmeticOperators0.getSum(0, 499);
        int int18 = sumWithoutArithmeticOperators0.getSum(6050, 2805);
        int int21 = sumWithoutArithmeticOperators0.getSum(1169, 0);
        int int24 = sumWithoutArithmeticOperators0.getSum(8331, 3733);
        int int27 = sumWithoutArithmeticOperators0.getSum(1807, 240);
        int int30 = sumWithoutArithmeticOperators0.getSum(32013, 1725);
        java.lang.Class<?> wildcardClass31 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 21 + "'", int9 == 21);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 200 + "'", int12 == 200);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 499 + "'", int15 == 499);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8855 + "'", int18 == 8855);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1169 + "'", int21 == 1169);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 12064 + "'", int24 == 12064);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2047 + "'", int27 == 2047);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 33738 + "'", int30 == 33738);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test3487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3487");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((-1), 35);
        int int15 = sumWithoutArithmeticOperators0.getSum(163, 17);
        int int18 = sumWithoutArithmeticOperators0.getSum(284, 271);
        int int21 = sumWithoutArithmeticOperators0.getSum(53, (int) (short) -1);
        int int24 = sumWithoutArithmeticOperators0.getSum(3292, 14292);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 180 + "'", int15 == 180);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 555 + "'", int18 == 555);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 52 + "'", int21 == 52);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 17584 + "'", int24 == 17584);
    }

    @Test
    public void test3488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3488");
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
        int int33 = sumWithoutArithmeticOperators0.getSum(0, 8916);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 8916 + "'", int33 == 8916);
    }

    @Test
    public void test3489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3489");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(345, 269);
        int int9 = sumWithoutArithmeticOperators0.getSum(2456, 3564);
        int int12 = sumWithoutArithmeticOperators0.getSum(483, 14209);
        int int15 = sumWithoutArithmeticOperators0.getSum(1280, 7883);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 614 + "'", int6 == 614);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 6020 + "'", int9 == 6020);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 14692 + "'", int12 == 14692);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9163 + "'", int15 == 9163);
    }

    @Test
    public void test3490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3490");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(21, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(0, 10);
        int int15 = sumWithoutArithmeticOperators0.getSum(488, 1236);
        int int18 = sumWithoutArithmeticOperators0.getSum(452, 152);
        int int21 = sumWithoutArithmeticOperators0.getSum(498, 645);
        int int24 = sumWithoutArithmeticOperators0.getSum(14971, 396);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 21 + "'", int9 == 21);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1724 + "'", int15 == 1724);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 604 + "'", int18 == 604);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1143 + "'", int21 == 1143);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 15367 + "'", int24 == 15367);
    }

    @Test
    public void test3491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3491");
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
        int int30 = sumWithoutArithmeticOperators0.getSum(12123, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 134 + "'", int9 == 134);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 165 + "'", int12 == 165);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 246 + "'", int18 == 246);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 278 + "'", int21 == 278);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 725 + "'", int24 == 725);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4671 + "'", int27 == 4671);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 12123 + "'", int30 == 12123);
    }

    @Test
    public void test3492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3492");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) ' ', 35);
        int int6 = sumWithoutArithmeticOperators0.getSum(1253, 1133);
        int int9 = sumWithoutArithmeticOperators0.getSum(524, 166);
        int int12 = sumWithoutArithmeticOperators0.getSum(824, 4193);
        int int15 = sumWithoutArithmeticOperators0.getSum(14833, 5408);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 67 + "'", int3 == 67);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2386 + "'", int6 == 2386);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 690 + "'", int9 == 690);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5017 + "'", int12 == 5017);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 20241 + "'", int15 == 20241);
    }

    @Test
    public void test3493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3493");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(32, (int) '4');
        int int15 = sumWithoutArithmeticOperators0.getSum((int) (short) 100, 1);
        int int18 = sumWithoutArithmeticOperators0.getSum(2432, 76);
        int int21 = sumWithoutArithmeticOperators0.getSum(3757, 19846);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 84 + "'", int12 == 84);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 101 + "'", int15 == 101);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2508 + "'", int18 == 2508);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 23603 + "'", int21 == 23603);
    }

    @Test
    public void test3494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3494");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 1, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(21, 11);
        int int15 = sumWithoutArithmeticOperators0.getSum(101, 21);
        int int18 = sumWithoutArithmeticOperators0.getSum(89, 180);
        int int21 = sumWithoutArithmeticOperators0.getSum(4506, 6674);
        int int24 = sumWithoutArithmeticOperators0.getSum(2953, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 122 + "'", int15 == 122);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 269 + "'", int18 == 269);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 11180 + "'", int21 == 11180);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2953 + "'", int24 == 2953);
    }

    @Test
    public void test3495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3495");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 53);
        int int15 = sumWithoutArithmeticOperators0.getSum(53, 101);
        int int18 = sumWithoutArithmeticOperators0.getSum(1087, 2108);
        int int21 = sumWithoutArithmeticOperators0.getSum(1380, 0);
        int int24 = sumWithoutArithmeticOperators0.getSum(7516, 1291);
        java.lang.Class<?> wildcardClass25 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 154 + "'", int15 == 154);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3195 + "'", int18 == 3195);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1380 + "'", int21 == 1380);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 8807 + "'", int24 == 8807);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3496");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 1, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(21, 11);
        int int15 = sumWithoutArithmeticOperators0.getSum(101, 21);
        int int18 = sumWithoutArithmeticOperators0.getSum(89, 180);
        int int21 = sumWithoutArithmeticOperators0.getSum(199, (int) '4');
        int int24 = sumWithoutArithmeticOperators0.getSum(122, 0);
        int int27 = sumWithoutArithmeticOperators0.getSum(6878, 4859);
        int int30 = sumWithoutArithmeticOperators0.getSum(3733, 4274);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 122 + "'", int15 == 122);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 269 + "'", int18 == 269);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 251 + "'", int21 == 251);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 122 + "'", int24 == 122);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 11737 + "'", int27 == 11737);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 8007 + "'", int30 == 8007);
    }

    @Test
    public void test3497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3497");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum(129, 165);
        int int12 = sumWithoutArithmeticOperators0.getSum(66, 0);
        int int15 = sumWithoutArithmeticOperators0.getSum(9307, 1922);
        int int18 = sumWithoutArithmeticOperators0.getSum(202, 1331);
        int int21 = sumWithoutArithmeticOperators0.getSum(1684, 9078);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 294 + "'", int9 == 294);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 66 + "'", int12 == 66);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 11229 + "'", int15 == 11229);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1533 + "'", int18 == 1533);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10762 + "'", int21 == 10762);
    }

    @Test
    public void test3498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3498");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(35, (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 35);
        int int15 = sumWithoutArithmeticOperators0.getSum(651, 938);
        int int18 = sumWithoutArithmeticOperators0.getSum(265, 671);
        int int21 = sumWithoutArithmeticOperators0.getSum(3406, 1748);
        int int24 = sumWithoutArithmeticOperators0.getSum(160, 0);
        int int27 = sumWithoutArithmeticOperators0.getSum(388, 7073);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1589 + "'", int15 == 1589);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 936 + "'", int18 == 936);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5154 + "'", int21 == 5154);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 160 + "'", int24 == 160);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 7461 + "'", int27 == 7461);
    }

    @Test
    public void test3499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3499");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(110, 376);
        int int12 = sumWithoutArithmeticOperators0.getSum(84, 200);
        int int15 = sumWithoutArithmeticOperators0.getSum(1292, 1391);
        int int18 = sumWithoutArithmeticOperators0.getSum(3410, 3573);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 486 + "'", int9 == 486);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 284 + "'", int12 == 284);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2683 + "'", int15 == 2683);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6983 + "'", int18 == 6983);
    }

    @Test
    public void test3500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3500");
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
        int int30 = sumWithoutArithmeticOperators0.getSum(9348, 8552);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 17900 + "'", int30 == 17900);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }
}

