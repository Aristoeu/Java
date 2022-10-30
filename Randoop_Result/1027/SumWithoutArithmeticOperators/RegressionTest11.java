package SumWithoutArithmeticOperators;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest11 {

    public static boolean debug = false;

    @Test
    public void test5501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5501");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(110, 376);
        int int12 = sumWithoutArithmeticOperators0.getSum(1172, 3707);
        int int15 = sumWithoutArithmeticOperators0.getSum(1291, 5369);
        int int18 = sumWithoutArithmeticOperators0.getSum(15571, 524);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 486 + "'", int9 == 486);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4879 + "'", int12 == 4879);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6660 + "'", int15 == 6660);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 16095 + "'", int18 == 16095);
    }

    @Test
    public void test5502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5502");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 1, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(21, 11);
        int int15 = sumWithoutArithmeticOperators0.getSum(101, 21);
        int int18 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 152);
        int int21 = sumWithoutArithmeticOperators0.getSum(728, 151);
        int int24 = sumWithoutArithmeticOperators0.getSum(683, 11885);
        java.lang.Class<?> wildcardClass25 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 122 + "'", int15 == 122);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 162 + "'", int18 == 162);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 879 + "'", int21 == 879);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 12568 + "'", int24 == 12568);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test5503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5503");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 53);
        int int15 = sumWithoutArithmeticOperators0.getSum(255, 4075);
        int int18 = sumWithoutArithmeticOperators0.getSum(521, 1073);
        int int21 = sumWithoutArithmeticOperators0.getSum(2190, 4323);
        int int24 = sumWithoutArithmeticOperators0.getSum(322, 13476);
        int int27 = sumWithoutArithmeticOperators0.getSum(865, 29829);
        int int30 = sumWithoutArithmeticOperators0.getSum(0, 486);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4330 + "'", int15 == 4330);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1594 + "'", int18 == 1594);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 6513 + "'", int21 == 6513);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 13798 + "'", int24 == 13798);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 30694 + "'", int27 == 30694);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 486 + "'", int30 == 486);
    }

    @Test
    public void test5504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5504");
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
        int int30 = sumWithoutArithmeticOperators0.getSum(29678, 28644);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 33 + "'", int15 == 33);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 163 + "'", int18 == 163);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 295 + "'", int21 == 295);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 166 + "'", int24 == 166);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4171 + "'", int27 == 4171);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 58322 + "'", int30 == 58322);
    }

    @Test
    public void test5505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5505");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(129, 109);
        int int12 = sumWithoutArithmeticOperators0.getSum(390, 109);
        int int15 = sumWithoutArithmeticOperators0.getSum(1829, 635);
        int int18 = sumWithoutArithmeticOperators0.getSum(5363, 0);
        int int21 = sumWithoutArithmeticOperators0.getSum(29088, 7839);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 238 + "'", int9 == 238);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 499 + "'", int12 == 499);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2464 + "'", int15 == 2464);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5363 + "'", int18 == 5363);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 36927 + "'", int21 == 36927);
    }

    @Test
    public void test5506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5506");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, (int) (short) 10);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) '4', 134);
        int int15 = sumWithoutArithmeticOperators0.getSum(209, 154);
        int int18 = sumWithoutArithmeticOperators0.getSum(179, 1530);
        int int21 = sumWithoutArithmeticOperators0.getSum(20141, 10505);
        int int24 = sumWithoutArithmeticOperators0.getSum(9955, 8853);
        java.lang.Class<?> wildcardClass25 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 186 + "'", int12 == 186);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 363 + "'", int15 == 363);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1709 + "'", int18 == 1709);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 30646 + "'", int21 == 30646);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 18808 + "'", int24 == 18808);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test5507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5507");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (short) 1, 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(9, (int) (byte) -1);
        int int15 = sumWithoutArithmeticOperators0.getSum(614, 1541);
        int int18 = sumWithoutArithmeticOperators0.getSum(1643, 1530);
        int int21 = sumWithoutArithmeticOperators0.getSum(227, 5191);
        int int24 = sumWithoutArithmeticOperators0.getSum(19164, 24414);
        int int27 = sumWithoutArithmeticOperators0.getSum(23804, 7231);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2155 + "'", int15 == 2155);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3173 + "'", int18 == 3173);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5418 + "'", int21 == 5418);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 43578 + "'", int24 == 43578);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 31035 + "'", int27 == 31035);
    }

    @Test
    public void test5508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5508");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(0, 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(9, (int) '#');
        int int12 = sumWithoutArithmeticOperators0.getSum(97, 168);
        int int15 = sumWithoutArithmeticOperators0.getSum(590, 2512);
        int int18 = sumWithoutArithmeticOperators0.getSum(507, 785);
        int int21 = sumWithoutArithmeticOperators0.getSum(221, 19846);
        int int24 = sumWithoutArithmeticOperators0.getSum(1749, 293);
        int int27 = sumWithoutArithmeticOperators0.getSum(8838, 7846);
        int int30 = sumWithoutArithmeticOperators0.getSum(11, 12881);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 152 + "'", int6 == 152);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 44 + "'", int9 == 44);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 265 + "'", int12 == 265);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3102 + "'", int15 == 3102);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1292 + "'", int18 == 1292);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 20067 + "'", int21 == 20067);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2042 + "'", int24 == 2042);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 16684 + "'", int27 == 16684);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 12892 + "'", int30 == 12892);
    }

    @Test
    public void test5509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5509");
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
        int int30 = sumWithoutArithmeticOperators0.getSum(4070, 3637);
        int int33 = sumWithoutArithmeticOperators0.getSum(0, 13002);
        int int36 = sumWithoutArithmeticOperators0.getSum(32040, 12126);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 134 + "'", int9 == 134);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 165 + "'", int12 == 165);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 156 + "'", int15 == 156);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 590 + "'", int18 == 590);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 240 + "'", int21 == 240);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1379 + "'", int24 == 1379);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 5487 + "'", int27 == 5487);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 7707 + "'", int30 == 7707);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 13002 + "'", int33 == 13002);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 44166 + "'", int36 == 44166);
    }

    @Test
    public void test5510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5510");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 1, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(18, (int) (byte) -1);
        int int15 = sumWithoutArithmeticOperators0.getSum(9, 217);
        int int18 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 41);
        int int21 = sumWithoutArithmeticOperators0.getSum(290, 1121);
        int int24 = sumWithoutArithmeticOperators0.getSum(166, 597);
        int int27 = sumWithoutArithmeticOperators0.getSum(16426, 5224);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 17 + "'", int12 == 17);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 226 + "'", int15 == 226);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 51 + "'", int18 == 51);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1411 + "'", int21 == 1411);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 763 + "'", int24 == 763);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 21650 + "'", int27 == 21650);
    }

    @Test
    public void test5511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5511");
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
        int int39 = sumWithoutArithmeticOperators0.getSum(13671, 0);
        int int42 = sumWithoutArithmeticOperators0.getSum(1681, 30335);
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 13671 + "'", int39 == 13671);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 32016 + "'", int42 == 32016);
    }

    @Test
    public void test5512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5512");
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
        int int33 = sumWithoutArithmeticOperators0.getSum(6717, 3737);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 10454 + "'", int33 == 10454);
    }

    @Test
    public void test5513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5513");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 18);
        int int9 = sumWithoutArithmeticOperators0.getSum(2339, 5977);
        int int12 = sumWithoutArithmeticOperators0.getSum(3249, 243);
        int int15 = sumWithoutArithmeticOperators0.getSum(1108, 785);
        int int18 = sumWithoutArithmeticOperators0.getSum(10261, 9458);
        java.lang.Class<?> wildcardClass19 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 18 + "'", int6 == 18);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8316 + "'", int9 == 8316);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3492 + "'", int12 == 3492);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1893 + "'", int15 == 1893);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 19719 + "'", int18 == 19719);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test5514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5514");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(40, 269);
        int int6 = sumWithoutArithmeticOperators0.getSum(202, 523);
        int int9 = sumWithoutArithmeticOperators0.getSum(362, 1680);
        int int12 = sumWithoutArithmeticOperators0.getSum(47510, 12132);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 309 + "'", int3 == 309);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 725 + "'", int6 == 725);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2042 + "'", int9 == 2042);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 59642 + "'", int12 == 59642);
    }

    @Test
    public void test5515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5515");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 53);
        int int15 = sumWithoutArithmeticOperators0.getSum(53, 101);
        int int18 = sumWithoutArithmeticOperators0.getSum(1087, 2108);
        int int21 = sumWithoutArithmeticOperators0.getSum(1380, 0);
        int int24 = sumWithoutArithmeticOperators0.getSum(7516, 1291);
        int int27 = sumWithoutArithmeticOperators0.getSum(1967, 3025);
        int int30 = sumWithoutArithmeticOperators0.getSum(7571, 15536);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 154 + "'", int15 == 154);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3195 + "'", int18 == 3195);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1380 + "'", int21 == 1380);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 8807 + "'", int24 == 8807);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4992 + "'", int27 == 4992);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 23107 + "'", int30 == 23107);
    }

    @Test
    public void test5516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5516");
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
        int int33 = sumWithoutArithmeticOperators0.getSum(20344, 3085);
        int int36 = sumWithoutArithmeticOperators0.getSum(9562, 17795);
        int int39 = sumWithoutArithmeticOperators0.getSum(3138, 1074);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 23429 + "'", int33 == 23429);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 27357 + "'", int36 == 27357);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 4212 + "'", int39 == 4212);
    }

    @Test
    public void test5517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5517");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 18);
        int int9 = sumWithoutArithmeticOperators0.getSum(36, 160);
        int int12 = sumWithoutArithmeticOperators0.getSum((-1), 108);
        int int15 = sumWithoutArithmeticOperators0.getSum(859, 249);
        int int18 = sumWithoutArithmeticOperators0.getSum(330, 911);
        int int21 = sumWithoutArithmeticOperators0.getSum(2115, 1171);
        int int24 = sumWithoutArithmeticOperators0.getSum(830, 736);
        int int27 = sumWithoutArithmeticOperators0.getSum(5029, 2625);
        int int30 = sumWithoutArithmeticOperators0.getSum(0, 12664);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 18 + "'", int6 == 18);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 196 + "'", int9 == 196);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 107 + "'", int12 == 107);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1108 + "'", int15 == 1108);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1241 + "'", int18 == 1241);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3286 + "'", int21 == 3286);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1566 + "'", int24 == 1566);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 7654 + "'", int27 == 7654);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 12664 + "'", int30 == 12664);
    }

    @Test
    public void test5518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5518");
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
        java.lang.Class<?> wildcardClass37 = sumWithoutArithmeticOperators0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test5519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5519");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int15 = sumWithoutArithmeticOperators0.getSum(122, 67);
        int int18 = sumWithoutArithmeticOperators0.getSum(294, 213);
        int int21 = sumWithoutArithmeticOperators0.getSum(3455, 1922);
        int int24 = sumWithoutArithmeticOperators0.getSum(2372, 1511);
        java.lang.Class<?> wildcardClass25 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 189 + "'", int15 == 189);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 507 + "'", int18 == 507);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5377 + "'", int21 == 5377);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3883 + "'", int24 == 3883);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test5520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5520");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 1, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(18, (int) (byte) -1);
        int int15 = sumWithoutArithmeticOperators0.getSum(51, 422);
        int int18 = sumWithoutArithmeticOperators0.getSum(238, 614);
        int int21 = sumWithoutArithmeticOperators0.getSum(427, 149);
        int int24 = sumWithoutArithmeticOperators0.getSum(21374, 9815);
        int int27 = sumWithoutArithmeticOperators0.getSum(1910, 1054);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 17 + "'", int12 == 17);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 473 + "'", int15 == 473);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 852 + "'", int18 == 852);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 576 + "'", int21 == 576);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 31189 + "'", int24 == 31189);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2964 + "'", int27 == 2964);
    }

    @Test
    public void test5521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5521");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum(129, 165);
        int int12 = sumWithoutArithmeticOperators0.getSum(152, 108);
        int int15 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 55);
        int int18 = sumWithoutArithmeticOperators0.getSum(52, 108);
        int int21 = sumWithoutArithmeticOperators0.getSum(3595, (int) ' ');
        int int24 = sumWithoutArithmeticOperators0.getSum(558, 1859);
        int int27 = sumWithoutArithmeticOperators0.getSum(14251, 1097);
        int int30 = sumWithoutArithmeticOperators0.getSum(4105, 14446);
        int int33 = sumWithoutArithmeticOperators0.getSum(17282, 22885);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 294 + "'", int9 == 294);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 260 + "'", int12 == 260);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 54 + "'", int15 == 54);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 160 + "'", int18 == 160);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3627 + "'", int21 == 3627);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2417 + "'", int24 == 2417);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 15348 + "'", int27 == 15348);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 18551 + "'", int30 == 18551);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 40167 + "'", int33 == 40167);
    }

    @Test
    public void test5522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5522");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (short) 100, 34);
        int int12 = sumWithoutArithmeticOperators0.getSum(289, 269);
        int int15 = sumWithoutArithmeticOperators0.getSum(504, 3550);
        int int18 = sumWithoutArithmeticOperators0.getSum(533, 1540);
        int int21 = sumWithoutArithmeticOperators0.getSum(2996, 11992);
        int int24 = sumWithoutArithmeticOperators0.getSum(8803, 22685);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 134 + "'", int9 == 134);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 558 + "'", int12 == 558);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4054 + "'", int15 == 4054);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2073 + "'", int18 == 2073);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 14988 + "'", int21 == 14988);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 31488 + "'", int24 == 31488);
    }

    @Test
    public void test5523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5523");
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
        java.lang.Class<?> wildcardClass31 = sumWithoutArithmeticOperators0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test5524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5524");
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
        int int30 = sumWithoutArithmeticOperators0.getSum(5649, 22423);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 238 + "'", int9 == 238);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 499 + "'", int12 == 499);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 11 + "'", int15 == 11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3526 + "'", int18 == 3526);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4687 + "'", int21 == 4687);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1957 + "'", int24 == 1957);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 22030 + "'", int27 == 22030);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 28072 + "'", int30 == 28072);
    }

    @Test
    public void test5525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5525");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) -1, 19);
        int int6 = sumWithoutArithmeticOperators0.getSum(21, 35);
        int int9 = sumWithoutArithmeticOperators0.getSum(859, 454);
        int int12 = sumWithoutArithmeticOperators0.getSum(1253, 461);
        int int15 = sumWithoutArithmeticOperators0.getSum(288, 309);
        int int18 = sumWithoutArithmeticOperators0.getSum(582, 271);
        int int21 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 51);
        int int24 = sumWithoutArithmeticOperators0.getSum(309, 0);
        int int27 = sumWithoutArithmeticOperators0.getSum(22793, 2123);
        java.lang.Class<?> wildcardClass28 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 18 + "'", int3 == 18);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 56 + "'", int6 == 56);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1313 + "'", int9 == 1313);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1714 + "'", int12 == 1714);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 597 + "'", int15 == 597);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 853 + "'", int18 == 853);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 51 + "'", int21 == 51);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 309 + "'", int24 == 309);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 24916 + "'", int27 == 24916);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test5526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5526");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(0, 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(9, (int) '#');
        int int12 = sumWithoutArithmeticOperators0.getSum(163, 52);
        int int15 = sumWithoutArithmeticOperators0.getSum(107, 210);
        int int18 = sumWithoutArithmeticOperators0.getSum(11552, 2863);
        int int21 = sumWithoutArithmeticOperators0.getSum(0, 11892);
        java.lang.Class<?> wildcardClass22 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 152 + "'", int6 == 152);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 44 + "'", int9 == 44);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 215 + "'", int12 == 215);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 317 + "'", int15 == 317);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 14415 + "'", int18 == 14415);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 11892 + "'", int21 == 11892);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test5527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5527");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(21, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(210, 1);
        int int15 = sumWithoutArithmeticOperators0.getSum(0, 134);
        int int18 = sumWithoutArithmeticOperators0.getSum(1427, 12753);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 21 + "'", int9 == 21);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 211 + "'", int12 == 211);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 134 + "'", int15 == 134);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 14180 + "'", int18 == 14180);
    }

    @Test
    public void test5528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5528");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(35, (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum(238, 152);
        int int15 = sumWithoutArithmeticOperators0.getSum(245, 162);
        int int18 = sumWithoutArithmeticOperators0.getSum(134, 36);
        int int21 = sumWithoutArithmeticOperators0.getSum(0, 2219);
        java.lang.Class<?> wildcardClass22 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 390 + "'", int12 == 390);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 407 + "'", int15 == 407);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 170 + "'", int18 == 170);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2219 + "'", int21 == 2219);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test5529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5529");
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
        int int36 = sumWithoutArithmeticOperators0.getSum(2673, 8095);
        java.lang.Class<?> wildcardClass37 = sumWithoutArithmeticOperators0.getClass();
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 10768 + "'", int36 == 10768);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test5530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5530");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 1, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(21, 11);
        int int15 = sumWithoutArithmeticOperators0.getSum(0, 34);
        int int18 = sumWithoutArithmeticOperators0.getSum(254, 269);
        int int21 = sumWithoutArithmeticOperators0.getSum(377, 306);
        int int24 = sumWithoutArithmeticOperators0.getSum(679, 1848);
        int int27 = sumWithoutArithmeticOperators0.getSum(1415, 28974);
        int int30 = sumWithoutArithmeticOperators0.getSum(10759, 3316);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 34 + "'", int15 == 34);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 523 + "'", int18 == 523);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 683 + "'", int21 == 683);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2527 + "'", int24 == 2527);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 30389 + "'", int27 == 30389);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 14075 + "'", int30 == 14075);
    }

    @Test
    public void test5531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5531");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(35, (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 35);
        int int15 = sumWithoutArithmeticOperators0.getSum(352, 375);
        int int18 = sumWithoutArithmeticOperators0.getSum(9920, 1511);
        int int21 = sumWithoutArithmeticOperators0.getSum(1451, 14282);
        int int24 = sumWithoutArithmeticOperators0.getSum(25295, 18329);
        int int27 = sumWithoutArithmeticOperators0.getSum(6300, 457);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 727 + "'", int15 == 727);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 11431 + "'", int18 == 11431);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 15733 + "'", int21 == 15733);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 43624 + "'", int24 == 43624);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 6757 + "'", int27 == 6757);
    }

    @Test
    public void test5532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5532");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (short) 100, 34);
        int int12 = sumWithoutArithmeticOperators0.getSum(144, 21);
        int int15 = sumWithoutArithmeticOperators0.getSum(44, 210);
        int int18 = sumWithoutArithmeticOperators0.getSum(1238, 116);
        int int21 = sumWithoutArithmeticOperators0.getSum(840, 2042);
        int int24 = sumWithoutArithmeticOperators0.getSum(10833, 4323);
        int int27 = sumWithoutArithmeticOperators0.getSum(12893, 23236);
        java.lang.Class<?> wildcardClass28 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 134 + "'", int9 == 134);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 165 + "'", int12 == 165);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 254 + "'", int15 == 254);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1354 + "'", int18 == 1354);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2882 + "'", int21 == 2882);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 15156 + "'", int24 == 15156);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 36129 + "'", int27 == 36129);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test5533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5533");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(10, (int) (byte) 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(321, 56);
        int int9 = sumWithoutArithmeticOperators0.getSum(277, 100);
        int int12 = sumWithoutArithmeticOperators0.getSum(625, 55);
        int int15 = sumWithoutArithmeticOperators0.getSum(165, 199);
        int int18 = sumWithoutArithmeticOperators0.getSum(2426, 1281);
        int int21 = sumWithoutArithmeticOperators0.getSum(453, 109);
        java.lang.Class<?> wildcardClass22 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 377 + "'", int6 == 377);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 377 + "'", int9 == 377);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 680 + "'", int12 == 680);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 364 + "'", int15 == 364);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3707 + "'", int18 == 3707);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 562 + "'", int21 == 562);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test5534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5534");
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
        java.lang.Class<?> wildcardClass40 = sumWithoutArithmeticOperators0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test5535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5535");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) -1, 19);
        int int6 = sumWithoutArithmeticOperators0.getSum(21, 35);
        int int9 = sumWithoutArithmeticOperators0.getSum(859, 454);
        int int12 = sumWithoutArithmeticOperators0.getSum(149, 188);
        int int15 = sumWithoutArithmeticOperators0.getSum(10582, 2250);
        int int18 = sumWithoutArithmeticOperators0.getSum(30598, 20305);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 18 + "'", int3 == 18);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 56 + "'", int6 == 56);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1313 + "'", int9 == 1313);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 337 + "'", int12 == 337);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 12832 + "'", int15 == 12832);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 50903 + "'", int18 == 50903);
    }

    @Test
    public void test5536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5536");
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
        int int30 = sumWithoutArithmeticOperators0.getSum(16834, 7007);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 238 + "'", int9 == 238);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 499 + "'", int12 == 499);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 11 + "'", int15 == 11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2805 + "'", int18 == 2805);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 9835 + "'", int21 == 9835);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 18574 + "'", int24 == 18574);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3654 + "'", int27 == 3654);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 23841 + "'", int30 == 23841);
    }

    @Test
    public void test5537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5537");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum(0, 486);
        int int12 = sumWithoutArithmeticOperators0.getSum(725, 911);
        int int15 = sumWithoutArithmeticOperators0.getSum(724, 1074);
        int int18 = sumWithoutArithmeticOperators0.getSum(6167, 628);
        int int21 = sumWithoutArithmeticOperators0.getSum(2071, 7400);
        int int24 = sumWithoutArithmeticOperators0.getSum(23194, 499);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 486 + "'", int9 == 486);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1636 + "'", int12 == 1636);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1798 + "'", int15 == 1798);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6795 + "'", int18 == 6795);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 9471 + "'", int21 == 9471);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 23693 + "'", int24 == 23693);
    }

    @Test
    public void test5538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5538");
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
        int int30 = sumWithoutArithmeticOperators0.getSum(8010, 10565);
        int int33 = sumWithoutArithmeticOperators0.getSum(7624, 4270);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 21 + "'", int9 == 21);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 200 + "'", int12 == 200);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 18 + "'", int15 == 18);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 91 + "'", int18 == 91);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3665 + "'", int21 == 3665);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1179 + "'", int24 == 1179);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 15062 + "'", int27 == 15062);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 18575 + "'", int30 == 18575);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 11894 + "'", int33 == 11894);
    }

    @Test
    public void test5539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5539");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(21, 2250);
        int int9 = sumWithoutArithmeticOperators0.getSum(760, 6076);
        int int12 = sumWithoutArithmeticOperators0.getSum(911, 7272);
        int int15 = sumWithoutArithmeticOperators0.getSum(7501, 9751);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2271 + "'", int6 == 2271);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 6836 + "'", int9 == 6836);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8183 + "'", int12 == 8183);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 17252 + "'", int15 == 17252);
    }

    @Test
    public void test5540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5540");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) 0, (int) (short) -1);
        int int15 = sumWithoutArithmeticOperators0.getSum((int) ' ', 1);
        int int18 = sumWithoutArithmeticOperators0.getSum(1373, 186);
        int int21 = sumWithoutArithmeticOperators0.getSum(7395, 1573);
        int int24 = sumWithoutArithmeticOperators0.getSum(6866, 6402);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 33 + "'", int15 == 33);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1559 + "'", int18 == 1559);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8968 + "'", int21 == 8968);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 13268 + "'", int24 == 13268);
    }

    @Test
    public void test5541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5541");
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
        int int30 = sumWithoutArithmeticOperators0.getSum(13166, 30373);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 152 + "'", int6 == 152);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 44 + "'", int9 == 44);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 215 + "'", int12 == 215);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 200 + "'", int15 == 200);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 942 + "'", int18 == 942);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2639 + "'", int21 == 2639);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4555 + "'", int24 == 4555);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10566 + "'", int27 == 10566);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 43539 + "'", int30 == 43539);
    }

    @Test
    public void test5542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5542");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(129, 109);
        int int12 = sumWithoutArithmeticOperators0.getSum(390, 109);
        int int15 = sumWithoutArithmeticOperators0.getSum(1829, 635);
        int int18 = sumWithoutArithmeticOperators0.getSum(2075, 3716);
        int int21 = sumWithoutArithmeticOperators0.getSum(635, 1272);
        int int24 = sumWithoutArithmeticOperators0.getSum(6866, 7661);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 238 + "'", int9 == 238);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 499 + "'", int12 == 499);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2464 + "'", int15 == 2464);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5791 + "'", int18 == 5791);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1907 + "'", int21 == 1907);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 14527 + "'", int24 == 14527);
    }

    @Test
    public void test5543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5543");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(110, 376);
        int int12 = sumWithoutArithmeticOperators0.getSum(1172, 3707);
        int int15 = sumWithoutArithmeticOperators0.getSum(647, 2778);
        int int18 = sumWithoutArithmeticOperators0.getSum(6103, 477);
        int int21 = sumWithoutArithmeticOperators0.getSum(19643, 17512);
        int int24 = sumWithoutArithmeticOperators0.getSum(0, 4755);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 486 + "'", int9 == 486);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4879 + "'", int12 == 4879);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3425 + "'", int15 == 3425);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6580 + "'", int18 == 6580);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 37155 + "'", int21 == 37155);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4755 + "'", int24 == 4755);
    }

    @Test
    public void test5544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5544");
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
        int int30 = sumWithoutArithmeticOperators0.getSum(35364, 18978);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 978 + "'", int18 == 978);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 708 + "'", int21 == 708);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1473 + "'", int24 == 1473);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1377 + "'", int27 == 1377);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 54342 + "'", int30 == 54342);
    }

    @Test
    public void test5545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5545");
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
        int int30 = sumWithoutArithmeticOperators0.getSum(911, 272);
        int int33 = sumWithoutArithmeticOperators0.getSum(27755, 9205);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 238 + "'", int9 == 238);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 590 + "'", int12 == 590);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 122 + "'", int15 == 122);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 46 + "'", int18 == 46);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 816 + "'", int21 == 816);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 11698 + "'", int24 == 11698);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 5267 + "'", int27 == 5267);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1183 + "'", int30 == 1183);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 36960 + "'", int33 == 36960);
    }

    @Test
    public void test5546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5546");
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
        int int33 = sumWithoutArithmeticOperators0.getSum(3698, 11280);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 14978 + "'", int33 == 14978);
    }

    @Test
    public void test5547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5547");
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
        java.lang.Class<?> wildcardClass34 = sumWithoutArithmeticOperators0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test5548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5548");
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
        int int30 = sumWithoutArithmeticOperators0.getSum(5118, 3809);
        int int33 = sumWithoutArithmeticOperators0.getSum(32417, 9476);
        int int36 = sumWithoutArithmeticOperators0.getSum(802, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 34 + "'", int15 == 34);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 807 + "'", int18 == 807);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 522 + "'", int21 == 522);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4054 + "'", int24 == 4054);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 17858 + "'", int27 == 17858);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 8927 + "'", int30 == 8927);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 41893 + "'", int33 == 41893);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 802 + "'", int36 == 802);
    }

    @Test
    public void test5549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5549");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(35, (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 35);
        int int15 = sumWithoutArithmeticOperators0.getSum(53, 36);
        int int18 = sumWithoutArithmeticOperators0.getSum(844, 289);
        int int21 = sumWithoutArithmeticOperators0.getSum((int) (byte) 0, 2476);
        int int24 = sumWithoutArithmeticOperators0.getSum(2935, 99);
        int int27 = sumWithoutArithmeticOperators0.getSum(202, 24620);
        int int30 = sumWithoutArithmeticOperators0.getSum(26305, 6280);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 89 + "'", int15 == 89);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1133 + "'", int18 == 1133);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2476 + "'", int21 == 2476);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3034 + "'", int24 == 3034);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 24822 + "'", int27 == 24822);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 32585 + "'", int30 == 32585);
    }

    @Test
    public void test5550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5550");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) 0, (int) (short) -1);
        int int15 = sumWithoutArithmeticOperators0.getSum(635, 151);
        int int18 = sumWithoutArithmeticOperators0.getSum(1105, 1121);
        int int21 = sumWithoutArithmeticOperators0.getSum(2049, 975);
        int int24 = sumWithoutArithmeticOperators0.getSum(166, 1375);
        java.lang.Class<?> wildcardClass25 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 786 + "'", int15 == 786);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2226 + "'", int18 == 2226);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3024 + "'", int21 == 3024);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1541 + "'", int24 == 1541);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test5551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5551");
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
        int int33 = sumWithoutArithmeticOperators0.getSum(43912, 40668);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 84580 + "'", int33 == 84580);
    }

    @Test
    public void test5552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5552");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(110, 376);
        int int12 = sumWithoutArithmeticOperators0.getSum(1172, 3707);
        int int15 = sumWithoutArithmeticOperators0.getSum(1688, 3319);
        int int18 = sumWithoutArithmeticOperators0.getSum(217, 592);
        int int21 = sumWithoutArithmeticOperators0.getSum(8052, 0);
        int int24 = sumWithoutArithmeticOperators0.getSum(23094, 4254);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 486 + "'", int9 == 486);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4879 + "'", int12 == 4879);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5007 + "'", int15 == 5007);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 809 + "'", int18 == 809);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8052 + "'", int21 == 8052);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 27348 + "'", int24 == 27348);
    }

    @Test
    public void test5553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5553");
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
        int int30 = sumWithoutArithmeticOperators0.getSum(12682, 19235);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 84 + "'", int12 == 84);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 144 + "'", int15 == 144);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 455 + "'", int18 == 455);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 978 + "'", int21 == 978);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 13255 + "'", int24 == 13255);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4619 + "'", int27 == 4619);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 31917 + "'", int30 == 31917);
    }

    @Test
    public void test5554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5554");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 53);
        int int15 = sumWithoutArithmeticOperators0.getSum(53, 101);
        int int18 = sumWithoutArithmeticOperators0.getSum(209, 107);
        int int21 = sumWithoutArithmeticOperators0.getSum(15759, 40575);
        java.lang.Class<?> wildcardClass22 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 154 + "'", int15 == 154);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 316 + "'", int18 == 316);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 56334 + "'", int21 == 56334);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test5555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5555");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 53);
        int int15 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 35);
        int int18 = sumWithoutArithmeticOperators0.getSum(1112, (-1));
        int int21 = sumWithoutArithmeticOperators0.getSum(1222, 269);
        int int24 = sumWithoutArithmeticOperators0.getSum(4231, 201);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 34 + "'", int15 == 34);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1111 + "'", int18 == 1111);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1491 + "'", int21 == 1491);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4432 + "'", int24 == 4432);
    }

    @Test
    public void test5556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5556");
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
        int int33 = sumWithoutArithmeticOperators0.getSum(60343, 33679);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 94022 + "'", int33 == 94022);
    }

    @Test
    public void test5557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5557");
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
        int int30 = sumWithoutArithmeticOperators0.getSum(12698, 12666);
        int int33 = sumWithoutArithmeticOperators0.getSum(46313, 41159);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 129 + "'", int15 == 129);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 160 + "'", int18 == 160);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 51 + "'", int21 == 51);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 782 + "'", int24 == 782);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 16746 + "'", int27 == 16746);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 25364 + "'", int30 == 25364);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 87472 + "'", int33 == 87472);
    }

    @Test
    public void test5558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5558");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(35, (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 35);
        int int15 = sumWithoutArithmeticOperators0.getSum(352, 375);
        int int18 = sumWithoutArithmeticOperators0.getSum(1793, 979);
        int int21 = sumWithoutArithmeticOperators0.getSum(9009, 10519);
        java.lang.Class<?> wildcardClass22 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 727 + "'", int15 == 727);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2772 + "'", int18 == 2772);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 19528 + "'", int21 == 19528);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test5559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5559");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) 0, (int) (short) -1);
        int int15 = sumWithoutArithmeticOperators0.getSum((int) ' ', 1);
        int int18 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (short) -1);
        int int21 = sumWithoutArithmeticOperators0.getSum(9931, 9337);
        int int24 = sumWithoutArithmeticOperators0.getSum(10833, 6993);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 33 + "'", int15 == 33);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 19268 + "'", int21 == 19268);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 17826 + "'", int24 == 17826);
    }

    @Test
    public void test5560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5560");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(21, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (short) 100);
        int int15 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 18);
        int int18 = sumWithoutArithmeticOperators0.getSum(1380, (int) (short) 100);
        int int21 = sumWithoutArithmeticOperators0.getSum(9704, 189);
        int int24 = sumWithoutArithmeticOperators0.getSum(11339, 2913);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 21 + "'", int9 == 21);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 200 + "'", int12 == 200);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 18 + "'", int15 == 18);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1480 + "'", int18 == 1480);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 9893 + "'", int21 == 9893);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 14252 + "'", int24 == 14252);
    }

    @Test
    public void test5561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5561");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, (int) (short) 10);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) '4', 134);
        int int15 = sumWithoutArithmeticOperators0.getSum(162, 162);
        int int18 = sumWithoutArithmeticOperators0.getSum(100, 32);
        int int21 = sumWithoutArithmeticOperators0.getSum((int) 'a', 555);
        int int24 = sumWithoutArithmeticOperators0.getSum(0, 1440);
        int int27 = sumWithoutArithmeticOperators0.getSum(616, 5471);
        java.lang.Class<?> wildcardClass28 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 186 + "'", int12 == 186);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 324 + "'", int15 == 324);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 132 + "'", int18 == 132);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 652 + "'", int21 == 652);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1440 + "'", int24 == 1440);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 6087 + "'", int27 == 6087);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test5562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5562");
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
        int int33 = sumWithoutArithmeticOperators0.getSum(6600, 43662);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 50262 + "'", int33 == 50262);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test5563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5563");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (short) 1, 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(9, (int) (byte) -1);
        int int15 = sumWithoutArithmeticOperators0.getSum(614, 1541);
        int int18 = sumWithoutArithmeticOperators0.getSum(1643, 1530);
        int int21 = sumWithoutArithmeticOperators0.getSum(188, 12812);
        int int24 = sumWithoutArithmeticOperators0.getSum(5167, 1980);
        java.lang.Class<?> wildcardClass25 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2155 + "'", int15 == 2155);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3173 + "'", int18 == 3173);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 13000 + "'", int21 == 13000);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 7147 + "'", int24 == 7147);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test5564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5564");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(10, (int) (byte) 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(306, 180);
        int int9 = sumWithoutArithmeticOperators0.getSum(736, 1241);
        int int12 = sumWithoutArithmeticOperators0.getSum(1379, 2394);
        int int15 = sumWithoutArithmeticOperators0.getSum(35, 2617);
        java.lang.Class<?> wildcardClass16 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 486 + "'", int6 == 486);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1977 + "'", int9 == 1977);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3773 + "'", int12 == 3773);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2652 + "'", int15 == 2652);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test5565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5565");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, (int) (short) 10);
        int int12 = sumWithoutArithmeticOperators0.getSum(54, 680);
        int int15 = sumWithoutArithmeticOperators0.getSum(978, 165);
        int int18 = sumWithoutArithmeticOperators0.getSum(7558, 3024);
        int int21 = sumWithoutArithmeticOperators0.getSum(2841, 6549);
        int int24 = sumWithoutArithmeticOperators0.getSum(17994, 10556);
        java.lang.Class<?> wildcardClass25 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 734 + "'", int12 == 734);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1143 + "'", int15 == 1143);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10582 + "'", int18 == 10582);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 9390 + "'", int21 == 9390);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 28550 + "'", int24 == 28550);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test5566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5566");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(0, 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(9, (int) '#');
        int int12 = sumWithoutArithmeticOperators0.getSum(163, 52);
        int int15 = sumWithoutArithmeticOperators0.getSum(210, 165);
        int int18 = sumWithoutArithmeticOperators0.getSum(2772, 214);
        int int21 = sumWithoutArithmeticOperators0.getSum(180, 27567);
        int int24 = sumWithoutArithmeticOperators0.getSum(67228, 7875);
        int int27 = sumWithoutArithmeticOperators0.getSum(0, 12374);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 152 + "'", int6 == 152);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 44 + "'", int9 == 44);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 215 + "'", int12 == 215);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 375 + "'", int15 == 375);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2986 + "'", int18 == 2986);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 27747 + "'", int21 == 27747);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 75103 + "'", int24 == 75103);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 12374 + "'", int27 == 12374);
    }

    @Test
    public void test5567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5567");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((-1), 35);
        int int15 = sumWithoutArithmeticOperators0.getSum(163, 17);
        int int18 = sumWithoutArithmeticOperators0.getSum(150, 416);
        int int21 = sumWithoutArithmeticOperators0.getSum(12410, 143);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 180 + "'", int15 == 180);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 566 + "'", int18 == 566);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 12553 + "'", int21 == 12553);
    }

    @Test
    public void test5568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5568");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(0, 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, (int) (short) 10);
        int int12 = sumWithoutArithmeticOperators0.getSum(1245, 708);
        int int15 = sumWithoutArithmeticOperators0.getSum(0, 3409);
        int int18 = sumWithoutArithmeticOperators0.getSum(17962, 6804);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 152 + "'", int6 == 152);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1953 + "'", int12 == 1953);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3409 + "'", int15 == 3409);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 24766 + "'", int18 == 24766);
    }

    @Test
    public void test5569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5569");
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
        int int30 = sumWithoutArithmeticOperators0.getSum(12236, 6942);
        int int33 = sumWithoutArithmeticOperators0.getSum(16221, 4113);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 84 + "'", int12 == 84);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 144 + "'", int15 == 144);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 163 + "'", int18 == 163);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 266 + "'", int21 == 266);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1296 + "'", int24 == 1296);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 13150 + "'", int27 == 13150);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 19178 + "'", int30 == 19178);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 20334 + "'", int33 == 20334);
    }

    @Test
    public void test5570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5570");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) -1, 19);
        int int6 = sumWithoutArithmeticOperators0.getSum(21, 35);
        int int9 = sumWithoutArithmeticOperators0.getSum(1121, 708);
        int int12 = sumWithoutArithmeticOperators0.getSum(3445, 1680);
        int int15 = sumWithoutArithmeticOperators0.getSum(2262, 788);
        int int18 = sumWithoutArithmeticOperators0.getSum(695, 2955);
        int int21 = sumWithoutArithmeticOperators0.getSum(10146, 7776);
        int int24 = sumWithoutArithmeticOperators0.getSum(6909, 5139);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 18 + "'", int3 == 18);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 56 + "'", int6 == 56);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1829 + "'", int9 == 1829);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5125 + "'", int12 == 5125);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3050 + "'", int15 == 3050);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3650 + "'", int18 == 3650);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 17922 + "'", int21 == 17922);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 12048 + "'", int24 == 12048);
    }

    @Test
    public void test5571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5571");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(35, (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 35);
        int int15 = sumWithoutArithmeticOperators0.getSum(352, 375);
        int int18 = sumWithoutArithmeticOperators0.getSum(122, 1327);
        int int21 = sumWithoutArithmeticOperators0.getSum(1171, 1019);
        int int24 = sumWithoutArithmeticOperators0.getSum(2464, 728);
        int int27 = sumWithoutArithmeticOperators0.getSum(3467, 5983);
        int int30 = sumWithoutArithmeticOperators0.getSum(17984, 5635);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 727 + "'", int15 == 727);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1449 + "'", int18 == 1449);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2190 + "'", int21 == 2190);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3192 + "'", int24 == 3192);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 9450 + "'", int27 == 9450);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 23619 + "'", int30 == 23619);
    }

    @Test
    public void test5572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5572");
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
        int int30 = sumWithoutArithmeticOperators0.getSum(51, 2767);
        int int33 = sumWithoutArithmeticOperators0.getSum(3900, 1402);
        int int36 = sumWithoutArithmeticOperators0.getSum(3537, 1293);
        int int39 = sumWithoutArithmeticOperators0.getSum(3259, 1283);
        java.lang.Class<?> wildcardClass40 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 33 + "'", int15 == 33);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 163 + "'", int18 == 163);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 236 + "'", int21 == 236);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1261 + "'", int24 == 1261);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2948 + "'", int27 == 2948);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2818 + "'", int30 == 2818);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 5302 + "'", int33 == 5302);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 4830 + "'", int36 == 4830);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 4542 + "'", int39 == 4542);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test5573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5573");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(747, 1764);
        int int9 = sumWithoutArithmeticOperators0.getSum(8916, 3400);
        int int12 = sumWithoutArithmeticOperators0.getSum(45330, 18255);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2511 + "'", int6 == 2511);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 12316 + "'", int9 == 12316);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63585 + "'", int12 == 63585);
    }

    @Test
    public void test5574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5574");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(345, 269);
        int int9 = sumWithoutArithmeticOperators0.getSum(3283, 2732);
        int int12 = sumWithoutArithmeticOperators0.getSum(3649, 27492);
        int int15 = sumWithoutArithmeticOperators0.getSum(2767, 20495);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 614 + "'", int6 == 614);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 6015 + "'", int9 == 6015);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 31141 + "'", int12 == 31141);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 23262 + "'", int15 == 23262);
    }

    @Test
    public void test5575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5575");
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
        int int36 = sumWithoutArithmeticOperators0.getSum(245, 1261);
        int int39 = sumWithoutArithmeticOperators0.getSum(16135, 2079);
        int int42 = sumWithoutArithmeticOperators0.getSum(7071, 25148);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1506 + "'", int36 == 1506);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 18214 + "'", int39 == 18214);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 32219 + "'", int42 == 32219);
    }

    @Test
    public void test5576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5576");
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
        int int33 = sumWithoutArithmeticOperators0.getSum(838, 72779);
        int int36 = sumWithoutArithmeticOperators0.getSum(11674, 876);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 73617 + "'", int33 == 73617);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 12550 + "'", int36 == 12550);
    }

    @Test
    public void test5577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5577");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((-1), 35);
        int int15 = sumWithoutArithmeticOperators0.getSum(163, 17);
        int int18 = sumWithoutArithmeticOperators0.getSum(284, 271);
        int int21 = sumWithoutArithmeticOperators0.getSum(1241, 1106);
        int int24 = sumWithoutArithmeticOperators0.getSum(195, 40);
        int int27 = sumWithoutArithmeticOperators0.getSum(53829, 6159);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 180 + "'", int15 == 180);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 555 + "'", int18 == 555);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2347 + "'", int21 == 2347);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 235 + "'", int24 == 235);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 59988 + "'", int27 == 59988);
    }

    @Test
    public void test5578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5578");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 0, 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(104, 266);
        int int15 = sumWithoutArithmeticOperators0.getSum(454, 9920);
        int int18 = sumWithoutArithmeticOperators0.getSum(2265, 13588);
        java.lang.Class<?> wildcardClass19 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 370 + "'", int12 == 370);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10374 + "'", int15 == 10374);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 15853 + "'", int18 == 15853);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test5579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5579");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(35, (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 35);
        int int15 = sumWithoutArithmeticOperators0.getSum(53, 36);
        int int18 = sumWithoutArithmeticOperators0.getSum(844, 289);
        int int21 = sumWithoutArithmeticOperators0.getSum(35, 90);
        int int24 = sumWithoutArithmeticOperators0.getSum(151, 1108);
        int int27 = sumWithoutArithmeticOperators0.getSum(647, 2060);
        int int30 = sumWithoutArithmeticOperators0.getSum(1788, 1101);
        java.lang.Class<?> wildcardClass31 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 89 + "'", int15 == 89);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1133 + "'", int18 == 1133);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 125 + "'", int21 == 125);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1259 + "'", int24 == 1259);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2707 + "'", int27 == 2707);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2889 + "'", int30 == 2889);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test5580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5580");
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
        int int30 = sumWithoutArithmeticOperators0.getSum(21398, 30260);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 249 + "'", int15 == 249);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 213 + "'", int18 == 213);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1668 + "'", int21 == 1668);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 783 + "'", int24 == 783);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 6357 + "'", int27 == 6357);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 51658 + "'", int30 == 51658);
    }

    @Test
    public void test5581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5581");
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
        int int33 = sumWithoutArithmeticOperators0.getSum(11259, 5794);
        int int36 = sumWithoutArithmeticOperators0.getSum(4576, 41626);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 17053 + "'", int33 == 17053);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 46202 + "'", int36 == 46202);
    }

    @Test
    public void test5582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5582");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 18);
        int int9 = sumWithoutArithmeticOperators0.getSum(36, 160);
        int int12 = sumWithoutArithmeticOperators0.getSum((-1), 108);
        int int15 = sumWithoutArithmeticOperators0.getSum(859, 249);
        int int18 = sumWithoutArithmeticOperators0.getSum(14530, 27220);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 18 + "'", int6 == 18);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 196 + "'", int9 == 196);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 107 + "'", int12 == 107);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1108 + "'", int15 == 1108);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 41750 + "'", int18 == 41750);
    }

    @Test
    public void test5583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5583");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(129, 109);
        int int12 = sumWithoutArithmeticOperators0.getSum(390, 109);
        int int15 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 56);
        int int18 = sumWithoutArithmeticOperators0.getSum(2240, 10864);
        int int21 = sumWithoutArithmeticOperators0.getSum(2372, 1788);
        java.lang.Class<?> wildcardClass22 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 238 + "'", int9 == 238);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 499 + "'", int12 == 499);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 55 + "'", int15 == 55);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 13104 + "'", int18 == 13104);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4160 + "'", int21 == 4160);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test5584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5584");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(10, (int) (byte) 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(321, 56);
        int int9 = sumWithoutArithmeticOperators0.getSum(277, 100);
        int int12 = sumWithoutArithmeticOperators0.getSum(625, 55);
        int int15 = sumWithoutArithmeticOperators0.getSum(165, 199);
        int int18 = sumWithoutArithmeticOperators0.getSum(2426, 1281);
        int int21 = sumWithoutArithmeticOperators0.getSum(18890, 9450);
        int int24 = sumWithoutArithmeticOperators0.getSum(16139, 18599);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 377 + "'", int6 == 377);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 377 + "'", int9 == 377);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 680 + "'", int12 == 680);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 364 + "'", int15 == 364);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3707 + "'", int18 == 3707);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 28340 + "'", int21 == 28340);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 34738 + "'", int24 == 34738);
    }

    @Test
    public void test5585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5585");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, (int) (short) 10);
        int int12 = sumWithoutArithmeticOperators0.getSum(54, 680);
        int int15 = sumWithoutArithmeticOperators0.getSum(978, 165);
        int int18 = sumWithoutArithmeticOperators0.getSum(7558, 3024);
        int int21 = sumWithoutArithmeticOperators0.getSum(2841, 6549);
        int int24 = sumWithoutArithmeticOperators0.getSum(22290, 13871);
        int int27 = sumWithoutArithmeticOperators0.getSum(1383, 17747);
        int int30 = sumWithoutArithmeticOperators0.getSum(36514, 2193);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 734 + "'", int12 == 734);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1143 + "'", int15 == 1143);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10582 + "'", int18 == 10582);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 9390 + "'", int21 == 9390);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 36161 + "'", int24 == 36161);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 19130 + "'", int27 == 19130);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 38707 + "'", int30 == 38707);
    }

    @Test
    public void test5586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5586");
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
        int int36 = sumWithoutArithmeticOperators0.getSum(5965, 7835);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 13800 + "'", int36 == 13800);
    }

    @Test
    public void test5587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5587");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int15 = sumWithoutArithmeticOperators0.getSum(122, 67);
        int int18 = sumWithoutArithmeticOperators0.getSum(294, 213);
        int int21 = sumWithoutArithmeticOperators0.getSum(1329, 10223);
        int int24 = sumWithoutArithmeticOperators0.getSum(2750, 1447);
        int int27 = sumWithoutArithmeticOperators0.getSum(1143, 6071);
        java.lang.Class<?> wildcardClass28 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 189 + "'", int15 == 189);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 507 + "'", int18 == 507);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 11552 + "'", int21 == 11552);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4197 + "'", int24 == 4197);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 7214 + "'", int27 == 7214);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test5588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5588");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, (int) (short) 10);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) '4', 134);
        int int15 = sumWithoutArithmeticOperators0.getSum(162, 162);
        int int18 = sumWithoutArithmeticOperators0.getSum(100, 32);
        int int21 = sumWithoutArithmeticOperators0.getSum(0, 84);
        int int24 = sumWithoutArithmeticOperators0.getSum(150, 161);
        int int27 = sumWithoutArithmeticOperators0.getSum(209, 343);
        int int30 = sumWithoutArithmeticOperators0.getSum(853, (int) ' ');
        int int33 = sumWithoutArithmeticOperators0.getSum(1313, 0);
        int int36 = sumWithoutArithmeticOperators0.getSum(996, 1357);
        int int39 = sumWithoutArithmeticOperators0.getSum(5312, 13248);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 186 + "'", int12 == 186);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 324 + "'", int15 == 324);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 132 + "'", int18 == 132);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 84 + "'", int21 == 84);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 311 + "'", int24 == 311);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 552 + "'", int27 == 552);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 885 + "'", int30 == 885);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1313 + "'", int33 == 1313);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2353 + "'", int36 == 2353);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 18560 + "'", int39 == 18560);
    }

    @Test
    public void test5589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5589");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(0, 199);
        int int12 = sumWithoutArithmeticOperators0.getSum(324, 614);
        int int15 = sumWithoutArithmeticOperators0.getSum(533, (int) (short) 10);
        int int18 = sumWithoutArithmeticOperators0.getSum(1376, 1080);
        int int21 = sumWithoutArithmeticOperators0.getSum(19415, 19857);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 199 + "'", int9 == 199);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 938 + "'", int12 == 938);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 543 + "'", int15 == 543);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2456 + "'", int18 == 2456);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 39272 + "'", int21 == 39272);
    }

    @Test
    public void test5590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5590");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(21, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(210, 1);
        int int15 = sumWithoutArithmeticOperators0.getSum(226, 17);
        int int18 = sumWithoutArithmeticOperators0.getSum(275, 337);
        int int21 = sumWithoutArithmeticOperators0.getSum((int) (short) 1, 3882);
        java.lang.Class<?> wildcardClass22 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 21 + "'", int9 == 21);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 211 + "'", int12 == 211);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 243 + "'", int15 == 243);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 612 + "'", int18 == 612);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3883 + "'", int21 == 3883);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test5591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5591");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum(0, 168);
        int int12 = sumWithoutArithmeticOperators0.getSum(2219, 1278);
        int int15 = sumWithoutArithmeticOperators0.getSum(10387, 3632);
        int int18 = sumWithoutArithmeticOperators0.getSum(15870, 18837);
        int int21 = sumWithoutArithmeticOperators0.getSum(0, 6388);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 168 + "'", int9 == 168);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3497 + "'", int12 == 3497);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 14019 + "'", int15 == 14019);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 34707 + "'", int18 == 34707);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 6388 + "'", int21 == 6388);
    }

    @Test
    public void test5592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5592");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 53);
        int int15 = sumWithoutArithmeticOperators0.getSum(53, 101);
        int int18 = sumWithoutArithmeticOperators0.getSum(416, 911);
        int int21 = sumWithoutArithmeticOperators0.getSum(1623, 1187);
        int int24 = sumWithoutArithmeticOperators0.getSum(1285, 5396);
        int int27 = sumWithoutArithmeticOperators0.getSum(36243, 3299);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 154 + "'", int15 == 154);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1327 + "'", int18 == 1327);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2810 + "'", int21 == 2810);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6681 + "'", int24 == 6681);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 39542 + "'", int27 == 39542);
    }

    @Test
    public void test5593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5593");
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
        int int36 = sumWithoutArithmeticOperators0.getSum(8899, 0);
        java.lang.Class<?> wildcardClass37 = sumWithoutArithmeticOperators0.getClass();
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 8899 + "'", int36 == 8899);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test5594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5594");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(911, 432);
        int int12 = sumWithoutArithmeticOperators0.getSum(955, 382);
        int int15 = sumWithoutArithmeticOperators0.getSum(1723, 7852);
        int int18 = sumWithoutArithmeticOperators0.getSum(3025, 5154);
        int int21 = sumWithoutArithmeticOperators0.getSum(47761, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1343 + "'", int9 == 1343);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1337 + "'", int12 == 1337);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9575 + "'", int15 == 9575);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8179 + "'", int18 == 8179);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 47761 + "'", int21 == 47761);
    }

    @Test
    public void test5595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5595");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, 98);
        int int9 = sumWithoutArithmeticOperators0.getSum(3744, 507);
        int int12 = sumWithoutArithmeticOperators0.getSum(786, 1407);
        int int15 = sumWithoutArithmeticOperators0.getSum(15604, 4829);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 108 + "'", int6 == 108);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4251 + "'", int9 == 4251);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2193 + "'", int12 == 2193);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 20433 + "'", int15 == 20433);
    }

    @Test
    public void test5596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5596");
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
        int int30 = sumWithoutArithmeticOperators0.getSum(10700, 20294);
        int int33 = sumWithoutArithmeticOperators0.getSum(28374, 12026);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 189 + "'", int15 == 189);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 833 + "'", int18 == 833);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3127 + "'", int21 == 3127);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3922 + "'", int24 == 3922);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 6159 + "'", int27 == 6159);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 30994 + "'", int30 == 30994);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 40400 + "'", int33 == 40400);
    }

    @Test
    public void test5597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5597");
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
        int int30 = sumWithoutArithmeticOperators0.getSum(7594, 1903);
        int int33 = sumWithoutArithmeticOperators0.getSum(6410, 1187);
        int int36 = sumWithoutArithmeticOperators0.getSum(1455, 41941);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 36 + "'", int15 == 36);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 53 + "'", int18 == 53);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 546 + "'", int21 == 546);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1046 + "'", int24 == 1046);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2778 + "'", int27 == 2778);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 9497 + "'", int30 == 9497);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 7597 + "'", int33 == 7597);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 43396 + "'", int36 == 43396);
    }

    @Test
    public void test5598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5598");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 53);
        int int15 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 35);
        int int18 = sumWithoutArithmeticOperators0.getSum(294, (int) (short) -1);
        int int21 = sumWithoutArithmeticOperators0.getSum(5311, 4440);
        int int24 = sumWithoutArithmeticOperators0.getSum(15006, 24429);
        java.lang.Class<?> wildcardClass25 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 34 + "'", int15 == 34);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 293 + "'", int18 == 293);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 9751 + "'", int21 == 9751);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 39435 + "'", int24 == 39435);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test5599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5599");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(35, (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 35);
        int int15 = sumWithoutArithmeticOperators0.getSum(53, 36);
        int int18 = sumWithoutArithmeticOperators0.getSum(526, 213);
        int int21 = sumWithoutArithmeticOperators0.getSum(271, 253);
        int int24 = sumWithoutArithmeticOperators0.getSum(11002, 5206);
        java.lang.Class<?> wildcardClass25 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 89 + "'", int15 == 89);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 739 + "'", int18 == 739);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 524 + "'", int21 == 524);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 16208 + "'", int24 == 16208);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test5600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5600");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(35, (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum(238, 152);
        int int15 = sumWithoutArithmeticOperators0.getSum(245, 162);
        int int18 = sumWithoutArithmeticOperators0.getSum(134, 36);
        int int21 = sumWithoutArithmeticOperators0.getSum(18, 558);
        int int24 = sumWithoutArithmeticOperators0.getSum(6651, 4212);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 390 + "'", int12 == 390);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 407 + "'", int15 == 407);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 170 + "'", int18 == 170);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 576 + "'", int21 == 576);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10863 + "'", int24 == 10863);
    }

    @Test
    public void test5601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5601");
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
        int int33 = sumWithoutArithmeticOperators0.getSum(499, 3166);
        int int36 = sumWithoutArithmeticOperators0.getSum(16526, 3201);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 711 + "'", int30 == 711);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 3665 + "'", int33 == 3665);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 19727 + "'", int36 == 19727);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test5602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5602");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int15 = sumWithoutArithmeticOperators0.getSum(859, 321);
        int int18 = sumWithoutArithmeticOperators0.getSum(209, 213);
        int int21 = sumWithoutArithmeticOperators0.getSum(8216, 8824);
        int int24 = sumWithoutArithmeticOperators0.getSum(18490, 24118);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1180 + "'", int15 == 1180);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 422 + "'", int18 == 422);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 17040 + "'", int21 == 17040);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 42608 + "'", int24 == 42608);
    }

    @Test
    public void test5603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5603");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(129, 109);
        int int12 = sumWithoutArithmeticOperators0.getSum(390, 109);
        int int15 = sumWithoutArithmeticOperators0.getSum(11, (int) (short) 0);
        int int18 = sumWithoutArithmeticOperators0.getSum(1856, 1670);
        int int21 = sumWithoutArithmeticOperators0.getSum(90, 4631);
        int int24 = sumWithoutArithmeticOperators0.getSum(10568, 0);
        java.lang.Class<?> wildcardClass25 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 238 + "'", int9 == 238);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 499 + "'", int12 == 499);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 11 + "'", int15 == 11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3526 + "'", int18 == 3526);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4721 + "'", int21 == 4721);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10568 + "'", int24 == 10568);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test5604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5604");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (short) 1, 89);
        int int12 = sumWithoutArithmeticOperators0.getSum(1023, 665);
        int int15 = sumWithoutArithmeticOperators0.getSum(202, 9193);
        int int18 = sumWithoutArithmeticOperators0.getSum(486, 14708);
        int int21 = sumWithoutArithmeticOperators0.getSum(8651, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 90 + "'", int9 == 90);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1688 + "'", int12 == 1688);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9395 + "'", int15 == 9395);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 15194 + "'", int18 == 15194);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8651 + "'", int21 == 8651);
    }

    @Test
    public void test5605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5605");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(21, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(0, 10);
        int int15 = sumWithoutArithmeticOperators0.getSum(3668, 5341);
        int int18 = sumWithoutArithmeticOperators0.getSum(5651, 8373);
        int int21 = sumWithoutArithmeticOperators0.getSum(16969, 33679);
        java.lang.Class<?> wildcardClass22 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 21 + "'", int9 == 21);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9009 + "'", int15 == 9009);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 14024 + "'", int18 == 14024);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 50648 + "'", int21 == 50648);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test5606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5606");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(911, 432);
        int int12 = sumWithoutArithmeticOperators0.getSum(0, 34);
        int int15 = sumWithoutArithmeticOperators0.getSum(1241, 1352);
        int int18 = sumWithoutArithmeticOperators0.getSum(13151, 6164);
        int int21 = sumWithoutArithmeticOperators0.getSum(16535, 69867);
        int int24 = sumWithoutArithmeticOperators0.getSum(11263, 574);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1343 + "'", int9 == 1343);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2593 + "'", int15 == 2593);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 19315 + "'", int18 == 19315);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 86402 + "'", int21 == 86402);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 11837 + "'", int24 == 11837);
    }

    @Test
    public void test5607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5607");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(345, 269);
        int int9 = sumWithoutArithmeticOperators0.getSum(2456, 3564);
        int int12 = sumWithoutArithmeticOperators0.getSum(483, 14209);
        int int15 = sumWithoutArithmeticOperators0.getSum(0, 7044);
        int int18 = sumWithoutArithmeticOperators0.getSum(33498, 277);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 614 + "'", int6 == 614);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 6020 + "'", int9 == 6020);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 14692 + "'", int12 == 14692);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7044 + "'", int15 == 7044);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 33775 + "'", int18 == 33775);
    }

    @Test
    public void test5608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5608");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(35, (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 35);
        int int15 = sumWithoutArithmeticOperators0.getSum(19, 110);
        int int18 = sumWithoutArithmeticOperators0.getSum(51, 109);
        int int21 = sumWithoutArithmeticOperators0.getSum(390, 152);
        int int24 = sumWithoutArithmeticOperators0.getSum(0, 36924);
        java.lang.Class<?> wildcardClass25 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 129 + "'", int15 == 129);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 160 + "'", int18 == 160);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 542 + "'", int21 == 542);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 36924 + "'", int24 == 36924);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test5609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5609");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(0, 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(10, (int) (byte) 100);
        int int12 = sumWithoutArithmeticOperators0.getSum(251, 210);
        int int15 = sumWithoutArithmeticOperators0.getSum(246, 9);
        int int18 = sumWithoutArithmeticOperators0.getSum(3340, 12374);
        int int21 = sumWithoutArithmeticOperators0.getSum(66540, 4198);
        int int24 = sumWithoutArithmeticOperators0.getSum(1751, 18048);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 152 + "'", int6 == 152);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 461 + "'", int12 == 461);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 255 + "'", int15 == 255);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 15714 + "'", int18 == 15714);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 70738 + "'", int21 == 70738);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 19799 + "'", int24 == 19799);
    }

    @Test
    public void test5610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5610");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 1, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(21, 11);
        int int15 = sumWithoutArithmeticOperators0.getSum((int) '#', (int) (short) 1);
        int int18 = sumWithoutArithmeticOperators0.getSum(52, (int) (short) 1);
        int int21 = sumWithoutArithmeticOperators0.getSum(35, 0);
        int int24 = sumWithoutArithmeticOperators0.getSum(0, 463);
        int int27 = sumWithoutArithmeticOperators0.getSum(11553, 5127);
        int int30 = sumWithoutArithmeticOperators0.getSum(12026, 1946);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 36 + "'", int15 == 36);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 53 + "'", int18 == 53);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 463 + "'", int24 == 463);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 16680 + "'", int27 == 16680);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 13972 + "'", int30 == 13972);
    }

    @Test
    public void test5611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5611");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(63, 868);
        int int12 = sumWithoutArithmeticOperators0.getSum(9075, 9144);
        int int15 = sumWithoutArithmeticOperators0.getSum(16832, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 931 + "'", int9 == 931);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 18219 + "'", int12 == 18219);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 16832 + "'", int15 == 16832);
    }

    @Test
    public void test5612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5612");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) -1, 19);
        int int6 = sumWithoutArithmeticOperators0.getSum(21, 35);
        int int9 = sumWithoutArithmeticOperators0.getSum(859, 454);
        int int12 = sumWithoutArithmeticOperators0.getSum(1253, 461);
        int int15 = sumWithoutArithmeticOperators0.getSum(288, 309);
        java.lang.Class<?> wildcardClass16 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 18 + "'", int3 == 18);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 56 + "'", int6 == 56);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1313 + "'", int9 == 1313);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1714 + "'", int12 == 1714);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 597 + "'", int15 == 597);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test5613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5613");
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
        int int36 = sumWithoutArithmeticOperators0.getSum(4215, 256);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1202 + "'", int33 == 1202);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 4471 + "'", int36 == 4471);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test5614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5614");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (short) 100, 34);
        int int12 = sumWithoutArithmeticOperators0.getSum(144, 21);
        int int15 = sumWithoutArithmeticOperators0.getSum(52, 104);
        int int18 = sumWithoutArithmeticOperators0.getSum(590, 0);
        int int21 = sumWithoutArithmeticOperators0.getSum(3517, 868);
        int int24 = sumWithoutArithmeticOperators0.getSum(293, 13390);
        java.lang.Class<?> wildcardClass25 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 134 + "'", int9 == 134);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 165 + "'", int12 == 165);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 156 + "'", int15 == 156);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 590 + "'", int18 == 590);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4385 + "'", int21 == 4385);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 13683 + "'", int24 == 13683);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test5615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5615");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(51, 53);
        int int15 = sumWithoutArithmeticOperators0.getSum(44, 144);
        int int18 = sumWithoutArithmeticOperators0.getSum(4337, 330);
        int int21 = sumWithoutArithmeticOperators0.getSum(1381, 6076);
        int int24 = sumWithoutArithmeticOperators0.getSum(8301, 5792);
        int int27 = sumWithoutArithmeticOperators0.getSum(5493, 55222);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 104 + "'", int12 == 104);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 188 + "'", int15 == 188);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4667 + "'", int18 == 4667);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 7457 + "'", int21 == 7457);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 14093 + "'", int24 == 14093);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 60715 + "'", int27 == 60715);
    }

    @Test
    public void test5616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5616");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) -1, 19);
        int int6 = sumWithoutArithmeticOperators0.getSum(21, 35);
        int int9 = sumWithoutArithmeticOperators0.getSum(1121, 708);
        int int12 = sumWithoutArithmeticOperators0.getSum(3445, 1680);
        int int15 = sumWithoutArithmeticOperators0.getSum(116, 1503);
        int int18 = sumWithoutArithmeticOperators0.getSum(257, 2389);
        int int21 = sumWithoutArithmeticOperators0.getSum(2438, 37803);
        int int24 = sumWithoutArithmeticOperators0.getSum(17169, 314);
        java.lang.Class<?> wildcardClass25 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 18 + "'", int3 == 18);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 56 + "'", int6 == 56);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1829 + "'", int9 == 1829);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5125 + "'", int12 == 5125);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1619 + "'", int15 == 1619);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2646 + "'", int18 == 2646);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 40241 + "'", int21 == 40241);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 17483 + "'", int24 == 17483);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test5617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5617");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(19, 21);
        int int9 = sumWithoutArithmeticOperators0.getSum(53, 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(286, 125);
        int int15 = sumWithoutArithmeticOperators0.getSum(295, 325);
        int int18 = sumWithoutArithmeticOperators0.getSum(905, 407);
        int int21 = sumWithoutArithmeticOperators0.getSum(1685, 2251);
        int int24 = sumWithoutArithmeticOperators0.getSum(90, 122);
        int int27 = sumWithoutArithmeticOperators0.getSum(13006, 3792);
        int int30 = sumWithoutArithmeticOperators0.getSum(1252, 20120);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 40 + "'", int6 == 40);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 411 + "'", int12 == 411);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 620 + "'", int15 == 620);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1312 + "'", int18 == 1312);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3936 + "'", int21 == 3936);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 212 + "'", int24 == 212);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 16798 + "'", int27 == 16798);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 21372 + "'", int30 == 21372);
    }

    @Test
    public void test5618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5618");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (short) 100, 34);
        int int12 = sumWithoutArithmeticOperators0.getSum(144, 21);
        int int15 = sumWithoutArithmeticOperators0.getSum(0, 35);
        int int18 = sumWithoutArithmeticOperators0.getSum(210, 36);
        int int21 = sumWithoutArithmeticOperators0.getSum(317, 110);
        int int24 = sumWithoutArithmeticOperators0.getSum(109, 166);
        int int27 = sumWithoutArithmeticOperators0.getSum(2924, 2810);
        int int30 = sumWithoutArithmeticOperators0.getSum(9559, 5475);
        int int33 = sumWithoutArithmeticOperators0.getSum(14228, 3345);
        int int36 = sumWithoutArithmeticOperators0.getSum(1394, 638);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 134 + "'", int9 == 134);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 165 + "'", int12 == 165);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 246 + "'", int18 == 246);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 427 + "'", int21 == 427);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 275 + "'", int24 == 275);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 5734 + "'", int27 == 5734);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 15034 + "'", int30 == 15034);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 17573 + "'", int33 == 17573);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2032 + "'", int36 == 2032);
    }

    @Test
    public void test5619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5619");
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
        java.lang.Class<?> wildcardClass31 = sumWithoutArithmeticOperators0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test5620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5620");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(129, 109);
        int int12 = sumWithoutArithmeticOperators0.getSum(390, 109);
        int int15 = sumWithoutArithmeticOperators0.getSum(1829, 635);
        int int18 = sumWithoutArithmeticOperators0.getSum(5363, 0);
        int int21 = sumWithoutArithmeticOperators0.getSum(23770, 15853);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 238 + "'", int9 == 238);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 499 + "'", int12 == 499);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2464 + "'", int15 == 2464);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5363 + "'", int18 == 5363);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 39623 + "'", int21 == 39623);
    }

    @Test
    public void test5621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5621");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 0, 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(192, 4374);
        int int15 = sumWithoutArithmeticOperators0.getSum(17404, 9337);
        int int18 = sumWithoutArithmeticOperators0.getSum(3084, 5851);
        java.lang.Class<?> wildcardClass19 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4566 + "'", int12 == 4566);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 26741 + "'", int15 == 26741);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8935 + "'", int18 == 8935);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test5622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5622");
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
        int int33 = sumWithoutArithmeticOperators0.getSum(35981, 6085);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 42066 + "'", int33 == 42066);
    }

    @Test
    public void test5623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5623");
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
        int int30 = sumWithoutArithmeticOperators0.getSum(18181, 7029);
        int int33 = sumWithoutArithmeticOperators0.getSum(16848, 22032);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 186 + "'", int12 == 186);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 19 + "'", int15 == 19);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1781 + "'", int21 == 1781);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2843 + "'", int24 == 2843);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 7571 + "'", int27 == 7571);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 25210 + "'", int30 == 25210);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 38880 + "'", int33 == 38880);
    }

    @Test
    public void test5624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5624");
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 32772 + "'", int36 == 32772);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test5625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5625");
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
        int int30 = sumWithoutArithmeticOperators0.getSum(22378, 6828);
        int int33 = sumWithoutArithmeticOperators0.getSum(4024, 13480);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 186 + "'", int12 == 186);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 363 + "'", int15 == 363);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 302 + "'", int18 == 302);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 452 + "'", int21 == 452);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2847 + "'", int24 == 2847);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 5529 + "'", int27 == 5529);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 29206 + "'", int30 == 29206);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 17504 + "'", int33 == 17504);
    }

    @Test
    public void test5626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5626");
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
        int int42 = sumWithoutArithmeticOperators0.getSum(5675, 2187);
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
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 7862 + "'", int42 == 7862);
    }

    @Test
    public void test5627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5627");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int15 = sumWithoutArithmeticOperators0.getSum(859, 321);
        int int18 = sumWithoutArithmeticOperators0.getSum(886, 19);
        int int21 = sumWithoutArithmeticOperators0.getSum(16397, 2430);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1180 + "'", int15 == 1180);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 905 + "'", int18 == 905);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 18827 + "'", int21 == 18827);
    }

    @Test
    public void test5628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5628");
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
        java.lang.Class<?> wildcardClass34 = sumWithoutArithmeticOperators0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test5629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5629");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) ' ', 35);
        int int6 = sumWithoutArithmeticOperators0.getSum(98, 180);
        int int9 = sumWithoutArithmeticOperators0.getSum(3025, 1245);
        int int12 = sumWithoutArithmeticOperators0.getSum(1327, 100);
        int int15 = sumWithoutArithmeticOperators0.getSum(21, 1310);
        int int18 = sumWithoutArithmeticOperators0.getSum(4089, 780);
        int int21 = sumWithoutArithmeticOperators0.getSum(22574, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 67 + "'", int3 == 67);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 278 + "'", int6 == 278);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4270 + "'", int9 == 4270);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1427 + "'", int12 == 1427);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1331 + "'", int15 == 1331);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4869 + "'", int18 == 4869);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 22574 + "'", int21 == 22574);
    }

    @Test
    public void test5630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5630");
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
        int int33 = sumWithoutArithmeticOperators0.getSum(499, 3166);
        int int36 = sumWithoutArithmeticOperators0.getSum(16526, 3201);
        int int39 = sumWithoutArithmeticOperators0.getSum(0, 29205);
        java.lang.Class<?> wildcardClass40 = sumWithoutArithmeticOperators0.getClass();
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 3665 + "'", int33 == 3665);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 19727 + "'", int36 == 19727);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 29205 + "'", int39 == 29205);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test5631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5631");
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
        int int33 = sumWithoutArithmeticOperators0.getSum(28317, 3975);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 32292 + "'", int33 == 32292);
    }

    @Test
    public void test5632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5632");
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
        int int33 = sumWithoutArithmeticOperators0.getSum(1163, 6676);
        int int36 = sumWithoutArithmeticOperators0.getSum(27311, 0);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 7839 + "'", int33 == 7839);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 27311 + "'", int36 == 27311);
    }

    @Test
    public void test5633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5633");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(10, (int) (byte) 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(306, 180);
        int int9 = sumWithoutArithmeticOperators0.getSum(736, 1241);
        int int12 = sumWithoutArithmeticOperators0.getSum(1379, 2394);
        int int15 = sumWithoutArithmeticOperators0.getSum(35, 2617);
        int int18 = sumWithoutArithmeticOperators0.getSum(33745, 2742);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 486 + "'", int6 == 486);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1977 + "'", int9 == 1977);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3773 + "'", int12 == 3773);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2652 + "'", int15 == 2652);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 36487 + "'", int18 == 36487);
    }

    @Test
    public void test5634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5634");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int15 = sumWithoutArithmeticOperators0.getSum(122, 67);
        int int18 = sumWithoutArithmeticOperators0.getSum(294, 213);
        int int21 = sumWithoutArithmeticOperators0.getSum(3455, 1922);
        int int24 = sumWithoutArithmeticOperators0.getSum(2372, 1511);
        int int27 = sumWithoutArithmeticOperators0.getSum(7185, 39713);
        java.lang.Class<?> wildcardClass28 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 189 + "'", int15 == 189);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 507 + "'", int18 == 507);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5377 + "'", int21 == 5377);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3883 + "'", int24 == 3883);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 46898 + "'", int27 == 46898);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test5635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5635");
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
        int int30 = sumWithoutArithmeticOperators0.getSum(10355, 26859);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 129 + "'", int15 == 129);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 160 + "'", int18 == 160);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 983 + "'", int21 == 983);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3309 + "'", int24 == 3309);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 380 + "'", int27 == 380);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 37214 + "'", int30 == 37214);
    }

    @Test
    public void test5636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5636");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) -1, 19);
        int int6 = sumWithoutArithmeticOperators0.getSum(21, 35);
        int int9 = sumWithoutArithmeticOperators0.getSum(1121, 708);
        int int12 = sumWithoutArithmeticOperators0.getSum(1688, 1337);
        int int15 = sumWithoutArithmeticOperators0.getSum(2251, 879);
        int int18 = sumWithoutArithmeticOperators0.getSum(847, 1281);
        int int21 = sumWithoutArithmeticOperators0.getSum(1265, 1568);
        int int24 = sumWithoutArithmeticOperators0.getSum(8517, 562);
        int int27 = sumWithoutArithmeticOperators0.getSum(13490, 50266);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 18 + "'", int3 == 18);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 56 + "'", int6 == 56);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1829 + "'", int9 == 1829);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3025 + "'", int12 == 3025);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3130 + "'", int15 == 3130);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2128 + "'", int18 == 2128);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2833 + "'", int21 == 2833);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 9079 + "'", int24 == 9079);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 63756 + "'", int27 == 63756);
    }

    @Test
    public void test5637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5637");
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
        int int36 = sumWithoutArithmeticOperators0.getSum(0, 2279);
        int int39 = sumWithoutArithmeticOperators0.getSum(12064, 4687);
        int int42 = sumWithoutArithmeticOperators0.getSum(5691, 166);
        int int45 = sumWithoutArithmeticOperators0.getSum(811, 2008);
        int int48 = sumWithoutArithmeticOperators0.getSum(11631, 12485);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2279 + "'", int36 == 2279);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 16751 + "'", int39 == 16751);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 5857 + "'", int42 == 5857);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 2819 + "'", int45 == 2819);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 24116 + "'", int48 == 24116);
    }

    @Test
    public void test5638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5638");
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
        int int36 = sumWithoutArithmeticOperators0.getSum(6177, 23468);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 17282 + "'", int33 == 17282);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 29645 + "'", int36 == 29645);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test5639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5639");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(110, 376);
        int int12 = sumWithoutArithmeticOperators0.getSum(1172, 3707);
        int int15 = sumWithoutArithmeticOperators0.getSum(1688, 3319);
        int int18 = sumWithoutArithmeticOperators0.getSum(4739, 3133);
        int int21 = sumWithoutArithmeticOperators0.getSum(7753, 628);
        int int24 = sumWithoutArithmeticOperators0.getSum(6903, 5387);
        java.lang.Class<?> wildcardClass25 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 486 + "'", int9 == 486);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4879 + "'", int12 == 4879);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5007 + "'", int15 == 5007);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 7872 + "'", int18 == 7872);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8381 + "'", int21 == 8381);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 12290 + "'", int24 == 12290);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test5640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5640");
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
        int int33 = sumWithoutArithmeticOperators0.getSum(8783, 8345);
        int int36 = sumWithoutArithmeticOperators0.getSum(23062, 21891);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 17128 + "'", int33 == 17128);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 44953 + "'", int36 == 44953);
    }

    @Test
    public void test5641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5641");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(21, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(0, 10);
        int int15 = sumWithoutArithmeticOperators0.getSum(1366, 21592);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 21 + "'", int9 == 21);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 22958 + "'", int15 == 22958);
    }

    @Test
    public void test5642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5642");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(618, 302);
        int int12 = sumWithoutArithmeticOperators0.getSum(4412, 498);
        int int15 = sumWithoutArithmeticOperators0.getSum(3840, 13806);
        java.lang.Class<?> wildcardClass16 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 920 + "'", int9 == 920);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4910 + "'", int12 == 4910);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 17646 + "'", int15 == 17646);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test5643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5643");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (short) 100, 34);
        int int12 = sumWithoutArithmeticOperators0.getSum(289, 269);
        int int15 = sumWithoutArithmeticOperators0.getSum(0, 343);
        int int18 = sumWithoutArithmeticOperators0.getSum(6059, 2810);
        int int21 = sumWithoutArithmeticOperators0.getSum(3618, 15575);
        int int24 = sumWithoutArithmeticOperators0.getSum(3100, 265);
        int int27 = sumWithoutArithmeticOperators0.getSum(2814, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 134 + "'", int9 == 134);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 558 + "'", int12 == 558);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 343 + "'", int15 == 343);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8869 + "'", int18 == 8869);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 19193 + "'", int21 == 19193);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3365 + "'", int24 == 3365);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2814 + "'", int27 == 2814);
    }

    @Test
    public void test5644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5644");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(40, 269);
        int int6 = sumWithoutArithmeticOperators0.getSum(202, 523);
        int int9 = sumWithoutArithmeticOperators0.getSum(1455, 9650);
        int int12 = sumWithoutArithmeticOperators0.getSum(9749, 15076);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 309 + "'", int3 == 309);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 725 + "'", int6 == 725);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 11105 + "'", int9 == 11105);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 24825 + "'", int12 == 24825);
    }

    @Test
    public void test5645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5645");
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
        int int33 = sumWithoutArithmeticOperators0.getSum(12142, 58222);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 70364 + "'", int33 == 70364);
    }

    @Test
    public void test5646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5646");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(35, (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 35);
        int int15 = sumWithoutArithmeticOperators0.getSum(352, 375);
        int int18 = sumWithoutArithmeticOperators0.getSum(9920, 1511);
        int int21 = sumWithoutArithmeticOperators0.getSum(1451, 14282);
        int int24 = sumWithoutArithmeticOperators0.getSum(12236, 5341);
        int int27 = sumWithoutArithmeticOperators0.getSum(1689, 5542);
        int int30 = sumWithoutArithmeticOperators0.getSum(4149, 11097);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 727 + "'", int15 == 727);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 11431 + "'", int18 == 11431);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 15733 + "'", int21 == 15733);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 17577 + "'", int24 == 17577);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 7231 + "'", int27 == 7231);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 15246 + "'", int30 == 15246);
    }

    @Test
    public void test5647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5647");
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
        java.lang.Class<?> wildcardClass28 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 134 + "'", int9 == 134);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 165 + "'", int12 == 165);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 254 + "'", int15 == 254);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 416 + "'", int18 == 416);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2597 + "'", int21 == 2597);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1490 + "'", int24 == 1490);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3095 + "'", int27 == 3095);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test5648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5648");
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
        int int33 = sumWithoutArithmeticOperators0.getSum(0, 0);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test5649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5649");
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
        int int30 = sumWithoutArithmeticOperators0.getSum(16719, 17291);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 34010 + "'", int30 == 34010);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test5650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5650");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(129, 109);
        int int12 = sumWithoutArithmeticOperators0.getSum(390, 109);
        int int15 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 56);
        int int18 = sumWithoutArithmeticOperators0.getSum(34, 209);
        int int21 = sumWithoutArithmeticOperators0.getSum(149, 2386);
        int int24 = sumWithoutArithmeticOperators0.getSum(10886, 316);
        int int27 = sumWithoutArithmeticOperators0.getSum(11323, 3509);
        int int30 = sumWithoutArithmeticOperators0.getSum(0, 43989);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 238 + "'", int9 == 238);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 499 + "'", int12 == 499);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 55 + "'", int15 == 55);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 243 + "'", int18 == 243);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2535 + "'", int21 == 2535);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 11202 + "'", int24 == 11202);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 14832 + "'", int27 == 14832);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 43989 + "'", int30 == 43989);
    }

    @Test
    public void test5651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5651");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 1, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(21, 11);
        int int15 = sumWithoutArithmeticOperators0.getSum((int) '#', (int) (short) 1);
        int int18 = sumWithoutArithmeticOperators0.getSum(0, 253);
        int int21 = sumWithoutArithmeticOperators0.getSum(1128, 552);
        int int24 = sumWithoutArithmeticOperators0.getSum(1449, 3863);
        int int27 = sumWithoutArithmeticOperators0.getSum(746, 3485);
        int int30 = sumWithoutArithmeticOperators0.getSum(3741, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 36 + "'", int15 == 36);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 253 + "'", int18 == 253);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1680 + "'", int21 == 1680);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5312 + "'", int24 == 5312);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4231 + "'", int27 == 4231);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3741 + "'", int30 == 3741);
    }

    @Test
    public void test5652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5652");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (short) 100, 34);
        int int12 = sumWithoutArithmeticOperators0.getSum(18, 109);
        int int15 = sumWithoutArithmeticOperators0.getSum(631, 1278);
        int int18 = sumWithoutArithmeticOperators0.getSum(375, 7366);
        int int21 = sumWithoutArithmeticOperators0.getSum(6083, 8652);
        int int24 = sumWithoutArithmeticOperators0.getSum(12115, 2028);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 134 + "'", int9 == 134);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 127 + "'", int12 == 127);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1909 + "'", int15 == 1909);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 7741 + "'", int18 == 7741);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 14735 + "'", int21 == 14735);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 14143 + "'", int24 == 14143);
    }

    @Test
    public void test5653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5653");
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
        int int36 = sumWithoutArithmeticOperators0.getSum(6177, 23468);
        int int39 = sumWithoutArithmeticOperators0.getSum(246, 9502);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 29645 + "'", int36 == 29645);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 9748 + "'", int39 == 9748);
    }

    @Test
    public void test5654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5654");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (short) 100, 34);
        int int12 = sumWithoutArithmeticOperators0.getSum(144, 21);
        int int15 = sumWithoutArithmeticOperators0.getSum(0, 35);
        int int18 = sumWithoutArithmeticOperators0.getSum((-1), 290);
        int int21 = sumWithoutArithmeticOperators0.getSum(456, 0);
        int int24 = sumWithoutArithmeticOperators0.getSum(9153, 5895);
        int int27 = sumWithoutArithmeticOperators0.getSum(0, 16867);
        int int30 = sumWithoutArithmeticOperators0.getSum(2751, 8609);
        int int33 = sumWithoutArithmeticOperators0.getSum(7480, 18092);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 134 + "'", int9 == 134);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 165 + "'", int12 == 165);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 289 + "'", int18 == 289);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 456 + "'", int21 == 456);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 15048 + "'", int24 == 15048);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 16867 + "'", int27 == 16867);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 11360 + "'", int30 == 11360);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 25572 + "'", int33 == 25572);
    }

    @Test
    public void test5655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5655");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(0, 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(9, (int) '#');
        int int12 = sumWithoutArithmeticOperators0.getSum(211, 245);
        int int15 = sumWithoutArithmeticOperators0.getSum(697, 290);
        int int18 = sumWithoutArithmeticOperators0.getSum(5691, 201);
        int int21 = sumWithoutArithmeticOperators0.getSum(1121, 1133);
        int int24 = sumWithoutArithmeticOperators0.getSum(8816, 8019);
        int int27 = sumWithoutArithmeticOperators0.getSum(390, 19888);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 152 + "'", int6 == 152);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 44 + "'", int9 == 44);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 456 + "'", int12 == 456);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 987 + "'", int15 == 987);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5892 + "'", int18 == 5892);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2254 + "'", int21 == 2254);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 16835 + "'", int24 == 16835);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 20278 + "'", int27 == 20278);
    }

    @Test
    public void test5656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5656");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((-1), 35);
        int int15 = sumWithoutArithmeticOperators0.getSum(100, 0);
        int int18 = sumWithoutArithmeticOperators0.getSum(722, 789);
        int int21 = sumWithoutArithmeticOperators0.getSum(567, 1171);
        int int24 = sumWithoutArithmeticOperators0.getSum(5154, 2392);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1511 + "'", int18 == 1511);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1738 + "'", int21 == 1738);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 7546 + "'", int24 == 7546);
    }

    @Test
    public void test5657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5657");
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
        int int36 = sumWithoutArithmeticOperators0.getSum(34794, 20792);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 55586 + "'", int36 == 55586);
    }

    @Test
    public void test5658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5658");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(35, (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 35);
        int int15 = sumWithoutArithmeticOperators0.getSum(33, 163);
        int int18 = sumWithoutArithmeticOperators0.getSum(788, 1555);
        int int21 = sumWithoutArithmeticOperators0.getSum(905, 6250);
        java.lang.Class<?> wildcardClass22 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 196 + "'", int15 == 196);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2343 + "'", int18 == 2343);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 7155 + "'", int21 == 7155);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test5659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5659");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(35, (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 35);
        int int15 = sumWithoutArithmeticOperators0.getSum(53, 36);
        int int18 = sumWithoutArithmeticOperators0.getSum(844, 289);
        int int21 = sumWithoutArithmeticOperators0.getSum(1555, 1101);
        int int24 = sumWithoutArithmeticOperators0.getSum(3218, 13039);
        int int27 = sumWithoutArithmeticOperators0.getSum(26565, 45106);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 89 + "'", int15 == 89);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1133 + "'", int18 == 1133);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2656 + "'", int21 == 2656);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 16257 + "'", int24 == 16257);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 71671 + "'", int27 == 71671);
    }

    @Test
    public void test5660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5660");
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
        int int42 = sumWithoutArithmeticOperators0.getSum(23199, 16680);
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
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 39879 + "'", int42 == 39879);
    }

    @Test
    public void test5661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5661");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 1, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(18, (int) (byte) -1);
        int int15 = sumWithoutArithmeticOperators0.getSum(526, 727);
        int int18 = sumWithoutArithmeticOperators0.getSum(0, 1511);
        int int21 = sumWithoutArithmeticOperators0.getSum(236, 2642);
        java.lang.Class<?> wildcardClass22 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 17 + "'", int12 == 17);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1253 + "'", int15 == 1253);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1511 + "'", int18 == 1511);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2878 + "'", int21 == 2878);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test5662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5662");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((-1), 35);
        int int15 = sumWithoutArithmeticOperators0.getSum(163, 17);
        int int18 = sumWithoutArithmeticOperators0.getSum(284, 271);
        int int21 = sumWithoutArithmeticOperators0.getSum(998, 766);
        int int24 = sumWithoutArithmeticOperators0.getSum(983, 1133);
        int int27 = sumWithoutArithmeticOperators0.getSum(0, 10045);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 180 + "'", int15 == 180);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 555 + "'", int18 == 555);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1764 + "'", int21 == 1764);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2116 + "'", int24 == 2116);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10045 + "'", int27 == 10045);
    }

    @Test
    public void test5663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5663");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(21, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(107, 0);
        int int15 = sumWithoutArithmeticOperators0.getSum(289, 555);
        int int18 = sumWithoutArithmeticOperators0.getSum(1926, 4985);
        int int21 = sumWithoutArithmeticOperators0.getSum(15949, 1044);
        int int24 = sumWithoutArithmeticOperators0.getSum(39752, 25820);
        int int27 = sumWithoutArithmeticOperators0.getSum(7429, 17795);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 21 + "'", int9 == 21);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 107 + "'", int12 == 107);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 844 + "'", int15 == 844);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6911 + "'", int18 == 6911);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 16993 + "'", int21 == 16993);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 65572 + "'", int24 == 65572);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 25224 + "'", int27 == 25224);
    }

    @Test
    public void test5664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5664");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (short) 100, 34);
        int int12 = sumWithoutArithmeticOperators0.getSum(144, 21);
        int int15 = sumWithoutArithmeticOperators0.getSum(52, 104);
        int int18 = sumWithoutArithmeticOperators0.getSum(590, 0);
        int int21 = sumWithoutArithmeticOperators0.getSum(3517, 868);
        int int24 = sumWithoutArithmeticOperators0.getSum(293, 13390);
        int int27 = sumWithoutArithmeticOperators0.getSum(5287, 3735);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 134 + "'", int9 == 134);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 165 + "'", int12 == 165);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 156 + "'", int15 == 156);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 590 + "'", int18 == 590);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4385 + "'", int21 == 4385);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 13683 + "'", int24 == 13683);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 9022 + "'", int27 == 9022);
    }

    @Test
    public void test5665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5665");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((-1), 35);
        int int15 = sumWithoutArithmeticOperators0.getSum(163, 17);
        int int18 = sumWithoutArithmeticOperators0.getSum(284, 271);
        int int21 = sumWithoutArithmeticOperators0.getSum(1241, 1106);
        int int24 = sumWithoutArithmeticOperators0.getSum(195, 40);
        int int27 = sumWithoutArithmeticOperators0.getSum(7193, 19133);
        java.lang.Class<?> wildcardClass28 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 180 + "'", int15 == 180);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 555 + "'", int18 == 555);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2347 + "'", int21 == 2347);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 235 + "'", int24 == 235);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 26326 + "'", int27 == 26326);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test5666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5666");
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
        int int30 = sumWithoutArithmeticOperators0.getSum(4869, 2316);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 21 + "'", int9 == 21);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 200 + "'", int12 == 200);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1044 + "'", int15 == 1044);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 56 + "'", int18 == 56);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4677 + "'", int21 == 4677);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6167 + "'", int24 == 6167);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 16526 + "'", int27 == 16526);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 7185 + "'", int30 == 7185);
    }

    @Test
    public void test5667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5667");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(21, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(107, 0);
        int int15 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, 1106);
        int int18 = sumWithoutArithmeticOperators0.getSum(615, 0);
        int int21 = sumWithoutArithmeticOperators0.getSum(8449, 3526);
        int int24 = sumWithoutArithmeticOperators0.getSum(15053, 4890);
        int int27 = sumWithoutArithmeticOperators0.getSum(5351, 181);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 21 + "'", int9 == 21);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 107 + "'", int12 == 107);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1206 + "'", int15 == 1206);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 615 + "'", int18 == 615);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 11975 + "'", int21 == 11975);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 19943 + "'", int24 == 19943);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 5532 + "'", int27 == 5532);
    }

    @Test
    public void test5668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5668");
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
        int int39 = sumWithoutArithmeticOperators0.getSum(17728, 3080);
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 20808 + "'", int39 == 20808);
    }

    @Test
    public void test5669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5669");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(35, (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 35);
        int int15 = sumWithoutArithmeticOperators0.getSum(53, 36);
        int int18 = sumWithoutArithmeticOperators0.getSum(844, 289);
        int int21 = sumWithoutArithmeticOperators0.getSum(35, 90);
        int int24 = sumWithoutArithmeticOperators0.getSum(7769, 4434);
        int int27 = sumWithoutArithmeticOperators0.getSum(0, 2759);
        int int30 = sumWithoutArithmeticOperators0.getSum(9476, 0);
        int int33 = sumWithoutArithmeticOperators0.getSum(6005, 15240);
        int int36 = sumWithoutArithmeticOperators0.getSum(14408, 13841);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 89 + "'", int15 == 89);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1133 + "'", int18 == 1133);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 125 + "'", int21 == 125);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 12203 + "'", int24 == 12203);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2759 + "'", int27 == 2759);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 9476 + "'", int30 == 9476);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 21245 + "'", int33 == 21245);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 28249 + "'", int36 == 28249);
    }

    @Test
    public void test5670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5670");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(51, 53);
        int int15 = sumWithoutArithmeticOperators0.getSum(238, (int) '4');
        int int18 = sumWithoutArithmeticOperators0.getSum(455, (int) (short) 0);
        int int21 = sumWithoutArithmeticOperators0.getSum(5169, 575);
        int int24 = sumWithoutArithmeticOperators0.getSum(7392, 10970);
        java.lang.Class<?> wildcardClass25 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 104 + "'", int12 == 104);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 290 + "'", int15 == 290);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 455 + "'", int18 == 455);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5744 + "'", int21 == 5744);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 18362 + "'", int24 == 18362);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test5671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5671");
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
        int int48 = sumWithoutArithmeticOperators0.getSum(3254, 29485);
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
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 32739 + "'", int48 == 32739);
    }

    @Test
    public void test5672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5672");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) -1, 19);
        int int6 = sumWithoutArithmeticOperators0.getSum(21, 35);
        int int9 = sumWithoutArithmeticOperators0.getSum(859, 454);
        int int12 = sumWithoutArithmeticOperators0.getSum(1253, 461);
        int int15 = sumWithoutArithmeticOperators0.getSum(288, 309);
        int int18 = sumWithoutArithmeticOperators0.getSum(582, 271);
        int int21 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 51);
        int int24 = sumWithoutArithmeticOperators0.getSum(1405, 1675);
        int int27 = sumWithoutArithmeticOperators0.getSum(5238, 1439);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 18 + "'", int3 == 18);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 56 + "'", int6 == 56);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1313 + "'", int9 == 1313);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1714 + "'", int12 == 1714);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 597 + "'", int15 == 597);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 853 + "'", int18 == 853);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 51 + "'", int21 == 51);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3080 + "'", int24 == 3080);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 6677 + "'", int27 == 6677);
    }

    @Test
    public void test5673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5673");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(0, 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(9, (int) '#');
        int int12 = sumWithoutArithmeticOperators0.getSum(163, 52);
        int int15 = sumWithoutArithmeticOperators0.getSum(107, 210);
        int int18 = sumWithoutArithmeticOperators0.getSum(21, 975);
        int int21 = sumWithoutArithmeticOperators0.getSum(151, 315);
        int int24 = sumWithoutArithmeticOperators0.getSum(5402, 6616);
        int int27 = sumWithoutArithmeticOperators0.getSum(60623, 13329);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 152 + "'", int6 == 152);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 44 + "'", int9 == 44);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 215 + "'", int12 == 215);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 317 + "'", int15 == 317);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 996 + "'", int18 == 996);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 466 + "'", int21 == 466);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 12018 + "'", int24 == 12018);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 73952 + "'", int27 == 73952);
    }

    @Test
    public void test5674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5674");
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
        int int33 = sumWithoutArithmeticOperators0.getSum(13492, 15088);
        java.lang.Class<?> wildcardClass34 = sumWithoutArithmeticOperators0.getClass();
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 28580 + "'", int33 == 28580);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test5675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5675");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(0, 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(9, (int) '#');
        int int12 = sumWithoutArithmeticOperators0.getSum(163, 52);
        int int15 = sumWithoutArithmeticOperators0.getSum(107, 210);
        int int18 = sumWithoutArithmeticOperators0.getSum(11552, 2863);
        int int21 = sumWithoutArithmeticOperators0.getSum(0, 11892);
        int int24 = sumWithoutArithmeticOperators0.getSum(35507, 29674);
        java.lang.Class<?> wildcardClass25 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 152 + "'", int6 == 152);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 44 + "'", int9 == 44);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 215 + "'", int12 == 215);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 317 + "'", int15 == 317);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 14415 + "'", int18 == 14415);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 11892 + "'", int21 == 11892);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 65181 + "'", int24 == 65181);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test5676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5676");
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
        int int30 = sumWithoutArithmeticOperators0.getSum(479, 0);
        int int33 = sumWithoutArithmeticOperators0.getSum(19369, 23914);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 122 + "'", int15 == 122);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 162 + "'", int18 == 162);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 623 + "'", int21 == 623);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1172 + "'", int24 == 1172);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 574 + "'", int27 == 574);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 479 + "'", int30 == 479);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 43283 + "'", int33 == 43283);
    }

    @Test
    public void test5677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5677");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(0, 199);
        int int12 = sumWithoutArithmeticOperators0.getSum(1010, 3478);
        int int15 = sumWithoutArithmeticOperators0.getSum(14630, 0);
        int int18 = sumWithoutArithmeticOperators0.getSum(1856, 2660);
        int int21 = sumWithoutArithmeticOperators0.getSum(28340, 16761);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 199 + "'", int9 == 199);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4488 + "'", int12 == 4488);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 14630 + "'", int15 == 14630);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4516 + "'", int18 == 4516);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 45101 + "'", int21 == 45101);
    }

    @Test
    public void test5678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5678");
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
        java.lang.Class<?> wildcardClass34 = sumWithoutArithmeticOperators0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test5679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5679");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(110, 376);
        int int12 = sumWithoutArithmeticOperators0.getSum(1172, 3707);
        int int15 = sumWithoutArithmeticOperators0.getSum(647, 2778);
        int int18 = sumWithoutArithmeticOperators0.getSum(6103, 477);
        int int21 = sumWithoutArithmeticOperators0.getSum(0, 2190);
        java.lang.Class<?> wildcardClass22 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 486 + "'", int9 == 486);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4879 + "'", int12 == 4879);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3425 + "'", int15 == 3425);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6580 + "'", int18 == 6580);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2190 + "'", int21 == 2190);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test5680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5680");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(129, 109);
        int int12 = sumWithoutArithmeticOperators0.getSum(2520, 4846);
        int int15 = sumWithoutArithmeticOperators0.getSum(7315, 3005);
        int int18 = sumWithoutArithmeticOperators0.getSum(6858, 1670);
        int int21 = sumWithoutArithmeticOperators0.getSum(36658, 4619);
        int int24 = sumWithoutArithmeticOperators0.getSum(460, 7103);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 238 + "'", int9 == 238);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 7366 + "'", int12 == 7366);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10320 + "'", int15 == 10320);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8528 + "'", int18 == 8528);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 41277 + "'", int21 == 41277);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 7563 + "'", int24 == 7563);
    }

    @Test
    public void test5681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5681");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, (int) (short) 10);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) '4', 134);
        int int15 = sumWithoutArithmeticOperators0.getSum(18, 1);
        int int18 = sumWithoutArithmeticOperators0.getSum((int) ' ', (int) (byte) 10);
        int int21 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 217);
        int int24 = sumWithoutArithmeticOperators0.getSum(2168, 5311);
        java.lang.Class<?> wildcardClass25 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 186 + "'", int12 == 186);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 19 + "'", int15 == 19);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 42 + "'", int18 == 42);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 227 + "'", int21 == 227);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 7479 + "'", int24 == 7479);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test5682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5682");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, (int) (short) 10);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) '4', 134);
        int int15 = sumWithoutArithmeticOperators0.getSum(162, 162);
        int int18 = sumWithoutArithmeticOperators0.getSum(100, 32);
        int int21 = sumWithoutArithmeticOperators0.getSum(0, 84);
        int int24 = sumWithoutArithmeticOperators0.getSum(289, 376);
        int int27 = sumWithoutArithmeticOperators0.getSum(3497, 343);
        int int30 = sumWithoutArithmeticOperators0.getSum(8163, 0);
        java.lang.Class<?> wildcardClass31 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 186 + "'", int12 == 186);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 324 + "'", int15 == 324);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 132 + "'", int18 == 132);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 84 + "'", int21 == 84);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 665 + "'", int24 == 665);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3840 + "'", int27 == 3840);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 8163 + "'", int30 == 8163);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test5683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5683");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((-1), 35);
        int int15 = sumWithoutArithmeticOperators0.getSum(195, 317);
        int int18 = sumWithoutArithmeticOperators0.getSum(76, 499);
        int int21 = sumWithoutArithmeticOperators0.getSum(844, 555);
        int int24 = sumWithoutArithmeticOperators0.getSum(1473, 275);
        int int27 = sumWithoutArithmeticOperators0.getSum(42567, 22873);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 512 + "'", int15 == 512);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 575 + "'", int18 == 575);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1399 + "'", int21 == 1399);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1748 + "'", int24 == 1748);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 65440 + "'", int27 == 65440);
    }

    @Test
    public void test5684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5684");
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
        int int30 = sumWithoutArithmeticOperators0.getSum(9417, 315);
        int int33 = sumWithoutArithmeticOperators0.getSum(7503, 51778);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 249 + "'", int15 == 249);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1134 + "'", int18 == 1134);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3597 + "'", int21 == 3597);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3629 + "'", int24 == 3629);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 23944 + "'", int27 == 23944);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 9732 + "'", int30 == 9732);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 59281 + "'", int33 == 59281);
    }

    @Test
    public void test5685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5685");
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
        int int30 = sumWithoutArithmeticOperators0.getSum(8983, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 345 + "'", int18 == 345);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2520 + "'", int21 == 2520);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1364 + "'", int24 == 1364);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2863 + "'", int27 == 2863);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 8983 + "'", int30 == 8983);
    }

    @Test
    public void test5686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5686");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(129, 109);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) '#', 555);
        int int15 = sumWithoutArithmeticOperators0.getSum(593, 3946);
        int int18 = sumWithoutArithmeticOperators0.getSum(2519, 12016);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 238 + "'", int9 == 238);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 590 + "'", int12 == 590);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4539 + "'", int15 == 4539);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 14535 + "'", int18 == 14535);
    }

    @Test
    public void test5687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5687");
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
        java.lang.Class<?> wildcardClass37 = sumWithoutArithmeticOperators0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test5688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5688");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) -1, 19);
        int int6 = sumWithoutArithmeticOperators0.getSum(21, 35);
        int int9 = sumWithoutArithmeticOperators0.getSum(859, 454);
        int int12 = sumWithoutArithmeticOperators0.getSum(1253, 461);
        int int15 = sumWithoutArithmeticOperators0.getSum(3492, 4374);
        int int18 = sumWithoutArithmeticOperators0.getSum(9458, 3299);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 18 + "'", int3 == 18);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 56 + "'", int6 == 56);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1313 + "'", int9 == 1313);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1714 + "'", int12 == 1714);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7866 + "'", int15 == 7866);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 12757 + "'", int18 == 12757);
    }

    @Test
    public void test5689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5689");
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
        int int36 = sumWithoutArithmeticOperators0.getSum(18076, 15714);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 33790 + "'", int36 == 33790);
    }

    @Test
    public void test5690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5690");
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
        int int30 = sumWithoutArithmeticOperators0.getSum(7052, 17368);
        int int33 = sumWithoutArithmeticOperators0.getSum(20572, 7193);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 134 + "'", int9 == 134);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 165 + "'", int12 == 165);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 254 + "'", int15 == 254);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 416 + "'", int18 == 416);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2597 + "'", int21 == 2597);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3997 + "'", int24 == 3997);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 6761 + "'", int27 == 6761);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 24420 + "'", int30 == 24420);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 27765 + "'", int33 == 27765);
    }

    @Test
    public void test5691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5691");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 1, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(21, 11);
        int int15 = sumWithoutArithmeticOperators0.getSum((int) '#', (int) (short) 1);
        int int18 = sumWithoutArithmeticOperators0.getSum(101, 42);
        int int21 = sumWithoutArithmeticOperators0.getSum(151, 696);
        int int24 = sumWithoutArithmeticOperators0.getSum(3890, 288);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 36 + "'", int15 == 36);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 143 + "'", int18 == 143);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 847 + "'", int21 == 847);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4178 + "'", int24 == 4178);
    }

    @Test
    public void test5692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5692");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(110, 376);
        int int12 = sumWithoutArithmeticOperators0.getSum(84, 200);
        int int15 = sumWithoutArithmeticOperators0.getSum(1292, 1391);
        int int18 = sumWithoutArithmeticOperators0.getSum(3410, 3573);
        int int21 = sumWithoutArithmeticOperators0.getSum(33738, 4619);
        int int24 = sumWithoutArithmeticOperators0.getSum(12812, 972);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 486 + "'", int9 == 486);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 284 + "'", int12 == 284);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2683 + "'", int15 == 2683);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6983 + "'", int18 == 6983);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 38357 + "'", int21 == 38357);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 13784 + "'", int24 == 13784);
    }

    @Test
    public void test5693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5693");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 200);
        int int9 = sumWithoutArithmeticOperators0.getSum(156, 36);
        int int12 = sumWithoutArithmeticOperators0.getSum(1987, 0);
        int int15 = sumWithoutArithmeticOperators0.getSum(2518, 0);
        int int18 = sumWithoutArithmeticOperators0.getSum(14990, 16746);
        int int21 = sumWithoutArithmeticOperators0.getSum(1200, 822);
        int int24 = sumWithoutArithmeticOperators0.getSum(19719, 15854);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 210 + "'", int6 == 210);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 192 + "'", int9 == 192);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1987 + "'", int12 == 1987);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2518 + "'", int15 == 2518);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 31736 + "'", int18 == 31736);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2022 + "'", int21 == 2022);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35573 + "'", int24 == 35573);
    }

    @Test
    public void test5694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5694");
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
        int int36 = sumWithoutArithmeticOperators0.getSum(1568, 1761);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 711 + "'", int30 == 711);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1661 + "'", int33 == 1661);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 3329 + "'", int36 == 3329);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test5695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5695");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(0, 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(1174, 2363);
        int int9 = sumWithoutArithmeticOperators0.getSum(184, 3406);
        int int12 = sumWithoutArithmeticOperators0.getSum(5283, 3652);
        int int15 = sumWithoutArithmeticOperators0.getSum(70229, 15714);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3537 + "'", int6 == 3537);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3590 + "'", int9 == 3590);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8935 + "'", int12 == 8935);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 85943 + "'", int15 == 85943);
    }

    @Test
    public void test5696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5696");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(21, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(107, 0);
        int int15 = sumWithoutArithmeticOperators0.getSum(289, 555);
        int int18 = sumWithoutArithmeticOperators0.getSum(1926, 4985);
        int int21 = sumWithoutArithmeticOperators0.getSum(7180, 4415);
        int int24 = sumWithoutArithmeticOperators0.getSum(11595, 4882);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 21 + "'", int9 == 21);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 107 + "'", int12 == 107);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 844 + "'", int15 == 844);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6911 + "'", int18 == 6911);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 11595 + "'", int21 == 11595);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 16477 + "'", int24 == 16477);
    }

    @Test
    public void test5697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5697");
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
        int int30 = sumWithoutArithmeticOperators0.getSum(8985, 27656);
        int int33 = sumWithoutArithmeticOperators0.getSum(19752, 10749);
        java.lang.Class<?> wildcardClass34 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 21 + "'", int9 == 21);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1724 + "'", int15 == 1724);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1399 + "'", int18 == 1399);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1733 + "'", int21 == 1733);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 9741 + "'", int24 == 9741);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 5432 + "'", int27 == 5432);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 36641 + "'", int30 == 36641);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 30501 + "'", int33 == 30501);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test5698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5698");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(35, (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 35);
        int int15 = sumWithoutArithmeticOperators0.getSum(19, 110);
        int int18 = sumWithoutArithmeticOperators0.getSum(51, 109);
        int int21 = sumWithoutArithmeticOperators0.getSum(390, 152);
        int int24 = sumWithoutArithmeticOperators0.getSum(12625, 25903);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 129 + "'", int15 == 129);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 160 + "'", int18 == 160);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 542 + "'", int21 == 542);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 38528 + "'", int24 == 38528);
    }

    @Test
    public void test5699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5699");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 1, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(18, (int) (byte) -1);
        int int15 = sumWithoutArithmeticOperators0.getSum(9, 217);
        int int18 = sumWithoutArithmeticOperators0.getSum(132, 499);
        int int21 = sumWithoutArithmeticOperators0.getSum(5188, 24313);
        int int24 = sumWithoutArithmeticOperators0.getSum(1171, 33115);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 17 + "'", int12 == 17);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 226 + "'", int15 == 226);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 631 + "'", int18 == 631);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 29501 + "'", int21 == 29501);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 34286 + "'", int24 == 34286);
    }

    @Test
    public void test5700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5700");
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
        int int42 = sumWithoutArithmeticOperators0.getSum(15751, 11230);
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
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 26981 + "'", int42 == 26981);
    }

    @Test
    public void test5701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5701");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(0, 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(9, (int) '#');
        int int12 = sumWithoutArithmeticOperators0.getSum(163, 52);
        int int15 = sumWithoutArithmeticOperators0.getSum(210, 165);
        int int18 = sumWithoutArithmeticOperators0.getSum(2772, 214);
        int int21 = sumWithoutArithmeticOperators0.getSum(180, 27567);
        java.lang.Class<?> wildcardClass22 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 152 + "'", int6 == 152);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 44 + "'", int9 == 44);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 215 + "'", int12 == 215);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 375 + "'", int15 == 375);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2986 + "'", int18 == 2986);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 27747 + "'", int21 == 27747);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test5702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5702");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) 0, (int) (short) -1);
        int int15 = sumWithoutArithmeticOperators0.getSum((int) ' ', 1);
        int int18 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (short) -1);
        int int21 = sumWithoutArithmeticOperators0.getSum(266, 11);
        int int24 = sumWithoutArithmeticOperators0.getSum(52, 998);
        int int27 = sumWithoutArithmeticOperators0.getSum(32289, 20549);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 33 + "'", int15 == 33);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 277 + "'", int21 == 277);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1050 + "'", int24 == 1050);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 52838 + "'", int27 == 52838);
    }

    @Test
    public void test5703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5703");
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
        int int33 = sumWithoutArithmeticOperators0.getSum(16581, 14797);
        java.lang.Class<?> wildcardClass34 = sumWithoutArithmeticOperators0.getClass();
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 31378 + "'", int33 == 31378);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test5704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5704");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 18);
        int int9 = sumWithoutArithmeticOperators0.getSum(36, 160);
        int int12 = sumWithoutArithmeticOperators0.getSum((-1), 108);
        int int15 = sumWithoutArithmeticOperators0.getSum(859, 249);
        int int18 = sumWithoutArithmeticOperators0.getSum(555, 473);
        int int21 = sumWithoutArithmeticOperators0.getSum(0, 863);
        int int24 = sumWithoutArithmeticOperators0.getSum(40575, 22801);
        java.lang.Class<?> wildcardClass25 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 18 + "'", int6 == 18);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 196 + "'", int9 == 196);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 107 + "'", int12 == 107);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1108 + "'", int15 == 1108);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1028 + "'", int18 == 1028);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 863 + "'", int21 == 863);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 63376 + "'", int24 == 63376);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test5705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5705");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(200, (int) (byte) 0);
        int int9 = sumWithoutArithmeticOperators0.getSum(19940, 1320);
        java.lang.Class<?> wildcardClass10 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 200 + "'", int6 == 200);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 21260 + "'", int9 == 21260);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test5706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5706");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) -1, 19);
        int int6 = sumWithoutArithmeticOperators0.getSum(21, 35);
        int int9 = sumWithoutArithmeticOperators0.getSum(1121, 708);
        int int12 = sumWithoutArithmeticOperators0.getSum(3445, 1680);
        int int15 = sumWithoutArithmeticOperators0.getSum(2262, 788);
        int int18 = sumWithoutArithmeticOperators0.getSum(9649, 852);
        int int21 = sumWithoutArithmeticOperators0.getSum(3662, 10638);
        int int24 = sumWithoutArithmeticOperators0.getSum(2399, 2090);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 18 + "'", int3 == 18);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 56 + "'", int6 == 56);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1829 + "'", int9 == 1829);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5125 + "'", int12 == 5125);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3050 + "'", int15 == 3050);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10501 + "'", int18 == 10501);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 14300 + "'", int21 == 14300);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4489 + "'", int24 == 4489);
    }

    @Test
    public void test5707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5707");
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
        int int30 = sumWithoutArithmeticOperators0.getSum(210, 1044);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1254 + "'", int30 == 1254);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test5708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5708");
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
        int int30 = sumWithoutArithmeticOperators0.getSum(54661, 41656);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 526 + "'", int15 == 526);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1238 + "'", int18 == 1238);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 466 + "'", int21 == 466);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10940 + "'", int24 == 10940);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 20794 + "'", int27 == 20794);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 96317 + "'", int30 == 96317);
    }

    @Test
    public void test5709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5709");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((-1), 35);
        int int15 = sumWithoutArithmeticOperators0.getSum(163, 17);
        int int18 = sumWithoutArithmeticOperators0.getSum(284, 271);
        int int21 = sumWithoutArithmeticOperators0.getSum(1241, 1106);
        int int24 = sumWithoutArithmeticOperators0.getSum(195, 40);
        int int27 = sumWithoutArithmeticOperators0.getSum(7193, 19133);
        int int30 = sumWithoutArithmeticOperators0.getSum(6627, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 180 + "'", int15 == 180);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 555 + "'", int18 == 555);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2347 + "'", int21 == 2347);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 235 + "'", int24 == 235);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 26326 + "'", int27 == 26326);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 6627 + "'", int30 == 6627);
    }

    @Test
    public void test5710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5710");
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
        int int30 = sumWithoutArithmeticOperators0.getSum(4910, 13776);
        java.lang.Class<?> wildcardClass31 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 84 + "'", int12 == 84);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 144 + "'", int15 == 144);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 163 + "'", int18 == 163);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 7 + "'", int21 == 7);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 724 + "'", int24 == 724);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 431 + "'", int27 == 431);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 18686 + "'", int30 == 18686);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test5711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5711");
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
        int int45 = sumWithoutArithmeticOperators0.getSum(1247, 8255);
        int int48 = sumWithoutArithmeticOperators0.getSum(16842, 16269);
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
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 9502 + "'", int45 == 9502);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 33111 + "'", int48 == 33111);
    }

    @Test
    public void test5712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5712");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 1, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(18, (int) (byte) -1);
        int int15 = sumWithoutArithmeticOperators0.getSum(0, 180);
        int int18 = sumWithoutArithmeticOperators0.getSum(1080, 974);
        int int21 = sumWithoutArithmeticOperators0.getSum(1296, 260);
        int int24 = sumWithoutArithmeticOperators0.getSum(30354, 7784);
        java.lang.Class<?> wildcardClass25 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 17 + "'", int12 == 17);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 180 + "'", int15 == 180);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2054 + "'", int18 == 2054);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1556 + "'", int21 == 1556);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 38138 + "'", int24 == 38138);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test5713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5713");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 53);
        int int15 = sumWithoutArithmeticOperators0.getSum(255, 4075);
        int int18 = sumWithoutArithmeticOperators0.getSum(521, 1073);
        int int21 = sumWithoutArithmeticOperators0.getSum(2190, 4323);
        int int24 = sumWithoutArithmeticOperators0.getSum(1128, 11621);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4330 + "'", int15 == 4330);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1594 + "'", int18 == 1594);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 6513 + "'", int21 == 6513);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 12749 + "'", int24 == 12749);
    }

    @Test
    public void test5714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5714");
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
        int int30 = sumWithoutArithmeticOperators0.getSum(15506, 8264);
        int int33 = sumWithoutArithmeticOperators0.getSum(23812, 12775);
        int int36 = sumWithoutArithmeticOperators0.getSum(8005, 17354);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 134 + "'", int9 == 134);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 165 + "'", int12 == 165);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 246 + "'", int18 == 246);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 352 + "'", int21 == 352);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10745 + "'", int24 == 10745);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 5220 + "'", int27 == 5220);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 23770 + "'", int30 == 23770);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 36587 + "'", int33 == 36587);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 25359 + "'", int36 == 25359);
    }

    @Test
    public void test5715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5715");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(35, (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum(238, 152);
        int int15 = sumWithoutArithmeticOperators0.getSum(254, 98);
        int int18 = sumWithoutArithmeticOperators0.getSum(3932, 0);
        int int21 = sumWithoutArithmeticOperators0.getSum(10501, 55);
        java.lang.Class<?> wildcardClass22 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 390 + "'", int12 == 390);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 352 + "'", int15 == 352);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3932 + "'", int18 == 3932);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10556 + "'", int21 == 10556);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test5716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5716");
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
        int int39 = sumWithoutArithmeticOperators0.getSum(5224, 6173);
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 11397 + "'", int39 == 11397);
    }

    @Test
    public void test5717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5717");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(19, 21);
        int int9 = sumWithoutArithmeticOperators0.getSum(53, 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(286, 125);
        int int15 = sumWithoutArithmeticOperators0.getSum(295, 325);
        int int18 = sumWithoutArithmeticOperators0.getSum(905, 407);
        int int21 = sumWithoutArithmeticOperators0.getSum(1685, 2251);
        int int24 = sumWithoutArithmeticOperators0.getSum(90, 122);
        int int27 = sumWithoutArithmeticOperators0.getSum(924, 4075);
        int int30 = sumWithoutArithmeticOperators0.getSum(4395, 3150);
        int int33 = sumWithoutArithmeticOperators0.getSum(26694, 11555);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 40 + "'", int6 == 40);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 411 + "'", int12 == 411);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 620 + "'", int15 == 620);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1312 + "'", int18 == 1312);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3936 + "'", int21 == 3936);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 212 + "'", int24 == 212);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4999 + "'", int27 == 4999);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 7545 + "'", int30 == 7545);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 38249 + "'", int33 == 38249);
    }

    @Test
    public void test5718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5718");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum(129, 165);
        int int12 = sumWithoutArithmeticOperators0.getSum(152, 108);
        int int15 = sumWithoutArithmeticOperators0.getSum(345, 9);
        int int18 = sumWithoutArithmeticOperators0.getSum(1684, 7332);
        int int21 = sumWithoutArithmeticOperators0.getSum(809, 824);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 294 + "'", int9 == 294);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 260 + "'", int12 == 260);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 354 + "'", int15 == 354);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9016 + "'", int18 == 9016);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1633 + "'", int21 == 1633);
    }

    @Test
    public void test5719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5719");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(129, 109);
        int int12 = sumWithoutArithmeticOperators0.getSum(390, 109);
        int int15 = sumWithoutArithmeticOperators0.getSum(11, (int) (short) 0);
        int int18 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 35);
        int int21 = sumWithoutArithmeticOperators0.getSum(727, 460);
        int int24 = sumWithoutArithmeticOperators0.getSum(746, 705);
        int int27 = sumWithoutArithmeticOperators0.getSum(1643, 0);
        int int30 = sumWithoutArithmeticOperators0.getSum(455, 781);
        int int33 = sumWithoutArithmeticOperators0.getSum(7400, 10929);
        int int36 = sumWithoutArithmeticOperators0.getSum(9312, 70364);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 238 + "'", int9 == 238);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 499 + "'", int12 == 499);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 11 + "'", int15 == 11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 34 + "'", int18 == 34);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1187 + "'", int21 == 1187);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1451 + "'", int24 == 1451);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1643 + "'", int27 == 1643);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1236 + "'", int30 == 1236);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 18329 + "'", int33 == 18329);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 79676 + "'", int36 == 79676);
    }

    @Test
    public void test5720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5720");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(10, (int) (byte) 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(321, 56);
        int int9 = sumWithoutArithmeticOperators0.getSum(189, 766);
        int int12 = sumWithoutArithmeticOperators0.getSum(290, 21);
        int int15 = sumWithoutArithmeticOperators0.getSum(1108, 725);
        int int18 = sumWithoutArithmeticOperators0.getSum(6362, 6003);
        int int21 = sumWithoutArithmeticOperators0.getSum(6732, 4530);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 377 + "'", int6 == 377);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 955 + "'", int9 == 955);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 311 + "'", int12 == 311);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1833 + "'", int15 == 1833);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 12365 + "'", int18 == 12365);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 11262 + "'", int21 == 11262);
    }

    @Test
    public void test5721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5721");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(0, 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(9, (int) '#');
        int int12 = sumWithoutArithmeticOperators0.getSum(163, 52);
        int int15 = sumWithoutArithmeticOperators0.getSum(0, 200);
        int int18 = sumWithoutArithmeticOperators0.getSum(885, 876);
        int int21 = sumWithoutArithmeticOperators0.getSum(0, 16471);
        int int24 = sumWithoutArithmeticOperators0.getSum(12166, 9671);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 152 + "'", int6 == 152);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 44 + "'", int9 == 44);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 215 + "'", int12 == 215);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 200 + "'", int15 == 200);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1761 + "'", int18 == 1761);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 16471 + "'", int21 == 16471);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 21837 + "'", int24 == 21837);
    }

    @Test
    public void test5722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5722");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(163, 36);
        int int12 = sumWithoutArithmeticOperators0.getSum(8, (int) (byte) -1);
        int int15 = sumWithoutArithmeticOperators0.getSum(4076, 1685);
        int int18 = sumWithoutArithmeticOperators0.getSum(12379, 41424);
        int int21 = sumWithoutArithmeticOperators0.getSum(0, 10265);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 199 + "'", int9 == 199);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 7 + "'", int12 == 7);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5761 + "'", int15 == 5761);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 53803 + "'", int18 == 53803);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10265 + "'", int21 == 10265);
    }

    @Test
    public void test5723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5723");
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
        int int33 = sumWithoutArithmeticOperators0.getSum(6993, 4755);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 11748 + "'", int33 == 11748);
    }

    @Test
    public void test5724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5724");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, (int) (short) 10);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) '4', 134);
        int int15 = sumWithoutArithmeticOperators0.getSum(162, 162);
        int int18 = sumWithoutArithmeticOperators0.getSum(156, 491);
        int int21 = sumWithoutArithmeticOperators0.getSum(5534, 2492);
        int int24 = sumWithoutArithmeticOperators0.getSum(18, 9649);
        java.lang.Class<?> wildcardClass25 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 186 + "'", int12 == 186);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 324 + "'", int15 == 324);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 647 + "'", int18 == 647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8026 + "'", int21 == 8026);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 9667 + "'", int24 == 9667);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test5725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5725");
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
        int int30 = sumWithoutArithmeticOperators0.getSum(3744, 5675);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 134 + "'", int9 == 134);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 165 + "'", int12 == 165);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 289 + "'", int18 == 289);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 180 + "'", int21 == 180);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 9524 + "'", int24 == 9524);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2377 + "'", int27 == 2377);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 9419 + "'", int30 == 9419);
    }

    @Test
    public void test5726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5726");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(19, 21);
        int int9 = sumWithoutArithmeticOperators0.getSum(53, 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(286, 125);
        int int15 = sumWithoutArithmeticOperators0.getSum(295, 325);
        int int18 = sumWithoutArithmeticOperators0.getSum(905, 407);
        int int21 = sumWithoutArithmeticOperators0.getSum(1685, 2251);
        int int24 = sumWithoutArithmeticOperators0.getSum(6409, 1592);
        int int27 = sumWithoutArithmeticOperators0.getSum(11397, 3614);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 40 + "'", int6 == 40);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 411 + "'", int12 == 411);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 620 + "'", int15 == 620);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1312 + "'", int18 == 1312);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3936 + "'", int21 == 3936);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 8001 + "'", int24 == 8001);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 15011 + "'", int27 == 15011);
    }

    @Test
    public void test5727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5727");
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
        int int45 = sumWithoutArithmeticOperators0.getSum(272, 5961);
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
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 6233 + "'", int45 == 6233);
    }

    @Test
    public void test5728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5728");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) 0, (int) (short) -1);
        int int15 = sumWithoutArithmeticOperators0.getSum((int) ' ', 1);
        int int18 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (short) -1);
        int int21 = sumWithoutArithmeticOperators0.getSum(7, (int) (short) 100);
        int int24 = sumWithoutArithmeticOperators0.getSum(9, 0);
        java.lang.Class<?> wildcardClass25 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 33 + "'", int15 == 33);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 107 + "'", int21 == 107);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 9 + "'", int24 == 9);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test5729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5729");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(129, 109);
        int int12 = sumWithoutArithmeticOperators0.getSum(390, 109);
        int int15 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 56);
        int int18 = sumWithoutArithmeticOperators0.getSum(34, 209);
        int int21 = sumWithoutArithmeticOperators0.getSum(931, 170);
        int int24 = sumWithoutArithmeticOperators0.getSum(11492, 1807);
        java.lang.Class<?> wildcardClass25 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 238 + "'", int9 == 238);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 499 + "'", int12 == 499);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 55 + "'", int15 == 55);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 243 + "'", int18 == 243);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1101 + "'", int21 == 1101);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 13299 + "'", int24 == 13299);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test5730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5730");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(35, (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 35);
        int int15 = sumWithoutArithmeticOperators0.getSum(53, 36);
        int int18 = sumWithoutArithmeticOperators0.getSum(526, 213);
        int int21 = sumWithoutArithmeticOperators0.getSum(271, 253);
        int int24 = sumWithoutArithmeticOperators0.getSum(2219, 3733);
        java.lang.Class<?> wildcardClass25 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 89 + "'", int15 == 89);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 739 + "'", int18 == 739);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 524 + "'", int21 == 524);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5952 + "'", int24 == 5952);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test5731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5731");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(21, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(210, 1);
        int int15 = sumWithoutArithmeticOperators0.getSum(226, 17);
        int int18 = sumWithoutArithmeticOperators0.getSum(275, 337);
        int int21 = sumWithoutArithmeticOperators0.getSum(143, 542);
        int int24 = sumWithoutArithmeticOperators0.getSum(1491, 1050);
        java.lang.Class<?> wildcardClass25 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 21 + "'", int9 == 21);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 211 + "'", int12 == 211);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 243 + "'", int15 == 243);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 612 + "'", int18 == 612);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 685 + "'", int21 == 685);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2541 + "'", int24 == 2541);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test5732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5732");
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
        int int36 = sumWithoutArithmeticOperators0.getSum(10218, 10262);
        java.lang.Class<?> wildcardClass37 = sumWithoutArithmeticOperators0.getClass();
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 20480 + "'", int36 == 20480);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test5733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5733");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) -1, 19);
        int int6 = sumWithoutArithmeticOperators0.getSum(21, 35);
        int int9 = sumWithoutArithmeticOperators0.getSum(1121, 708);
        int int12 = sumWithoutArithmeticOperators0.getSum(3445, 1680);
        int int15 = sumWithoutArithmeticOperators0.getSum(116, 1503);
        int int18 = sumWithoutArithmeticOperators0.getSum(1148, 6455);
        int int21 = sumWithoutArithmeticOperators0.getSum(1044, 2228);
        int int24 = sumWithoutArithmeticOperators0.getSum(9036, 12893);
        java.lang.Class<?> wildcardClass25 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 18 + "'", int3 == 18);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 56 + "'", int6 == 56);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1829 + "'", int9 == 1829);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5125 + "'", int12 == 5125);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1619 + "'", int15 == 1619);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 7603 + "'", int18 == 7603);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3272 + "'", int21 == 3272);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 21929 + "'", int24 == 21929);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test5734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5734");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 1, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(18, (int) (byte) -1);
        int int15 = sumWithoutArithmeticOperators0.getSum(526, 727);
        int int18 = sumWithoutArithmeticOperators0.getSum(1967, 810);
        int int21 = sumWithoutArithmeticOperators0.getSum(1480, 1636);
        int int24 = sumWithoutArithmeticOperators0.getSum(170, 1373);
        int int27 = sumWithoutArithmeticOperators0.getSum(2621, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 17 + "'", int12 == 17);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1253 + "'", int15 == 1253);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2777 + "'", int18 == 2777);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3116 + "'", int21 == 3116);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1543 + "'", int24 == 1543);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2621 + "'", int27 == 2621);
    }

    @Test
    public void test5735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5735");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 1, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(21, 11);
        int int15 = sumWithoutArithmeticOperators0.getSum(101, 21);
        int int18 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 152);
        int int21 = sumWithoutArithmeticOperators0.getSum(728, 151);
        int int24 = sumWithoutArithmeticOperators0.getSum(345, 1394);
        int int27 = sumWithoutArithmeticOperators0.getSum(3746, 17567);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 122 + "'", int15 == 122);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 162 + "'", int18 == 162);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 879 + "'", int21 == 879);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1739 + "'", int24 == 1739);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 21313 + "'", int27 == 21313);
    }

    @Test
    public void test5736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5736");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(40, 269);
        int int6 = sumWithoutArithmeticOperators0.getSum(202, 523);
        int int9 = sumWithoutArithmeticOperators0.getSum(286, 1337);
        int int12 = sumWithoutArithmeticOperators0.getSum(89, 1268);
        int int15 = sumWithoutArithmeticOperators0.getSum(1012, 786);
        int int18 = sumWithoutArithmeticOperators0.getSum(421, 3512);
        int int21 = sumWithoutArithmeticOperators0.getSum(724, 4659);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 309 + "'", int3 == 309);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 725 + "'", int6 == 725);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1623 + "'", int9 == 1623);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1357 + "'", int12 == 1357);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1798 + "'", int15 == 1798);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3933 + "'", int18 == 3933);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5383 + "'", int21 == 5383);
    }

    @Test
    public void test5737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5737");
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
        int int30 = sumWithoutArithmeticOperators0.getSum(3463, 42239);
        java.lang.Class<?> wildcardClass31 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 238 + "'", int9 == 238);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 499 + "'", int12 == 499);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 11 + "'", int15 == 11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 34 + "'", int18 == 34);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1448 + "'", int21 == 1448);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2492 + "'", int24 == 2492);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 23794 + "'", int27 == 23794);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 45702 + "'", int30 == 45702);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test5738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5738");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, (int) (short) 10);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) '4', 134);
        int int15 = sumWithoutArithmeticOperators0.getSum(162, 162);
        int int18 = sumWithoutArithmeticOperators0.getSum(100, 32);
        int int21 = sumWithoutArithmeticOperators0.getSum(0, 84);
        int int24 = sumWithoutArithmeticOperators0.getSum(150, 161);
        int int27 = sumWithoutArithmeticOperators0.getSum(209, 343);
        int int30 = sumWithoutArithmeticOperators0.getSum(853, (int) ' ');
        int int33 = sumWithoutArithmeticOperators0.getSum(1313, 0);
        int int36 = sumWithoutArithmeticOperators0.getSum(996, 1357);
        int int39 = sumWithoutArithmeticOperators0.getSum(3433, 1384);
        int int42 = sumWithoutArithmeticOperators0.getSum(23257, 26783);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 186 + "'", int12 == 186);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 324 + "'", int15 == 324);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 132 + "'", int18 == 132);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 84 + "'", int21 == 84);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 311 + "'", int24 == 311);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 552 + "'", int27 == 552);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 885 + "'", int30 == 885);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1313 + "'", int33 == 1313);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2353 + "'", int36 == 2353);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 4817 + "'", int39 == 4817);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 50040 + "'", int42 == 50040);
    }

    @Test
    public void test5739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5739");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(35, (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 35);
        int int15 = sumWithoutArithmeticOperators0.getSum(19, 110);
        int int18 = sumWithoutArithmeticOperators0.getSum(51, 109);
        int int21 = sumWithoutArithmeticOperators0.getSum(256, 727);
        int int24 = sumWithoutArithmeticOperators0.getSum(454, 0);
        int int27 = sumWithoutArithmeticOperators0.getSum(0, 356);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 129 + "'", int15 == 129);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 160 + "'", int18 == 160);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 983 + "'", int21 == 983);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 454 + "'", int24 == 454);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 356 + "'", int27 == 356);
    }

    @Test
    public void test5740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5740");
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
        int int36 = sumWithoutArithmeticOperators0.getSum(7675, 4948);
        java.lang.Class<?> wildcardClass37 = sumWithoutArithmeticOperators0.getClass();
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 12623 + "'", int36 == 12623);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test5741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5741");
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
        int int33 = sumWithoutArithmeticOperators0.getSum(11153, 29415);
        int int36 = sumWithoutArithmeticOperators0.getSum(7784, 814);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 40568 + "'", int33 == 40568);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 8598 + "'", int36 == 8598);
    }

    @Test
    public void test5742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5742");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(250, 195);
        int int9 = sumWithoutArithmeticOperators0.getSum(805, 1200);
        int int12 = sumWithoutArithmeticOperators0.getSum(7034, 1536);
        int int15 = sumWithoutArithmeticOperators0.getSum(1294, 21129);
        int int18 = sumWithoutArithmeticOperators0.getSum(27133, 2353);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 445 + "'", int6 == 445);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2005 + "'", int9 == 2005);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8570 + "'", int12 == 8570);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 22423 + "'", int15 == 22423);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 29486 + "'", int18 == 29486);
    }

    @Test
    public void test5743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5743");
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
        int int30 = sumWithoutArithmeticOperators0.getSum(7268, 33970);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 390 + "'", int12 == 390);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 407 + "'", int15 == 407);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 170 + "'", int18 == 170);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 237 + "'", int21 == 237);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5208 + "'", int24 == 5208);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4189 + "'", int27 == 4189);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 41238 + "'", int30 == 41238);
    }

    @Test
    public void test5744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5744");
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
        int int30 = sumWithoutArithmeticOperators0.getSum(2917, 2430);
        int int33 = sumWithoutArithmeticOperators0.getSum(0, 3465);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 84 + "'", int12 == 84);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 144 + "'", int15 == 144);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 455 + "'", int18 == 455);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 156 + "'", int21 == 156);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3716 + "'", int24 == 3716);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3456 + "'", int27 == 3456);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 5347 + "'", int30 == 5347);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 3465 + "'", int33 == 3465);
    }

    @Test
    public void test5745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5745");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(200, (int) (byte) 0);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (short) -1, 129);
        int int12 = sumWithoutArithmeticOperators0.getSum(317, 4215);
        java.lang.Class<?> wildcardClass13 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 200 + "'", int6 == 200);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 128 + "'", int9 == 128);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4532 + "'", int12 == 4532);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test5746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5746");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (short) 1, 89);
        int int12 = sumWithoutArithmeticOperators0.getSum(1023, 665);
        int int15 = sumWithoutArithmeticOperators0.getSum(202, 9193);
        int int18 = sumWithoutArithmeticOperators0.getSum(16013, 22037);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 90 + "'", int9 == 90);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1688 + "'", int12 == 1688);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9395 + "'", int15 == 9395);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 38050 + "'", int18 == 38050);
    }

    @Test
    public void test5747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5747");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 1, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(21, 11);
        int int15 = sumWithoutArithmeticOperators0.getSum((int) '#', (int) (short) 1);
        int int18 = sumWithoutArithmeticOperators0.getSum((int) 'a', 156);
        int int21 = sumWithoutArithmeticOperators0.getSum(15733, 2517);
        int int24 = sumWithoutArithmeticOperators0.getSum(12747, 38455);
        java.lang.Class<?> wildcardClass25 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 36 + "'", int15 == 36);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 253 + "'", int18 == 253);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 18250 + "'", int21 == 18250);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 51202 + "'", int24 == 51202);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test5748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5748");
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
        int int30 = sumWithoutArithmeticOperators0.getSum(28550, 5024);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 789 + "'", int15 == 789);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 570 + "'", int21 == 570);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 11174 + "'", int24 == 11174);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 36922 + "'", int27 == 36922);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 33574 + "'", int30 == 33574);
    }

    @Test
    public void test5749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5749");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 200);
        int int9 = sumWithoutArithmeticOperators0.getSum(1305, 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(48208, 13070);
        int int15 = sumWithoutArithmeticOperators0.getSum(1073, 8163);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 210 + "'", int6 == 210);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1305 + "'", int9 == 1305);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 61278 + "'", int12 == 61278);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9236 + "'", int15 == 9236);
    }

    @Test
    public void test5750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5750");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(0, 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(9, (int) '#');
        int int12 = sumWithoutArithmeticOperators0.getSum(51, 66);
        int int15 = sumWithoutArithmeticOperators0.getSum(211, 488);
        int int18 = sumWithoutArithmeticOperators0.getSum(266, 1111);
        int int21 = sumWithoutArithmeticOperators0.getSum(12630, 1681);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 152 + "'", int6 == 152);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 44 + "'", int9 == 44);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 117 + "'", int12 == 117);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 699 + "'", int15 == 699);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1377 + "'", int18 == 1377);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 14311 + "'", int21 == 14311);
    }

    @Test
    public void test5751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5751");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(10, (int) (byte) 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(34, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum(5312, 51);
        int int12 = sumWithoutArithmeticOperators0.getSum(601, 9608);
        java.lang.Class<?> wildcardClass13 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 34 + "'", int6 == 34);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5363 + "'", int9 == 5363);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10209 + "'", int12 == 10209);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test5752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5752");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 1, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(18, (int) (byte) -1);
        int int15 = sumWithoutArithmeticOperators0.getSum(9, 217);
        int int18 = sumWithoutArithmeticOperators0.getSum(934, 766);
        int int21 = sumWithoutArithmeticOperators0.getSum(1241, 3707);
        int int24 = sumWithoutArithmeticOperators0.getSum(10210, 5201);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 17 + "'", int12 == 17);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 226 + "'", int15 == 226);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1700 + "'", int18 == 1700);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4948 + "'", int21 == 4948);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 15411 + "'", int24 == 15411);
    }

    @Test
    public void test5753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5753");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) 0, (int) (short) -1);
        int int15 = sumWithoutArithmeticOperators0.getSum((int) ' ', 1);
        int int18 = sumWithoutArithmeticOperators0.getSum(1373, 186);
        int int21 = sumWithoutArithmeticOperators0.getSum(3152, 316);
        int int24 = sumWithoutArithmeticOperators0.getSum(22873, 13777);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 33 + "'", int15 == 33);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1559 + "'", int18 == 1559);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3468 + "'", int21 == 3468);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 36650 + "'", int24 == 36650);
    }

    @Test
    public void test5754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5754");
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
        int int36 = sumWithoutArithmeticOperators0.getSum(9671, 23262);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 32933 + "'", int36 == 32933);
    }

    @Test
    public void test5755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5755");
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
        int int39 = sumWithoutArithmeticOperators0.getSum(4433, 170);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 16013 + "'", int36 == 16013);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 4603 + "'", int39 == 4603);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test5756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5756");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(35, (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 35);
        int int15 = sumWithoutArithmeticOperators0.getSum(5577, 217);
        int int18 = sumWithoutArithmeticOperators0.getSum(26859, 5604);
        int int21 = sumWithoutArithmeticOperators0.getSum(30201, 12435);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5794 + "'", int15 == 5794);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32463 + "'", int18 == 32463);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 42636 + "'", int21 == 42636);
    }

    @Test
    public void test5757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5757");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) 0, (int) (short) -1);
        int int15 = sumWithoutArithmeticOperators0.getSum((int) ' ', 1);
        int int18 = sumWithoutArithmeticOperators0.getSum(11, 152);
        int int21 = sumWithoutArithmeticOperators0.getSum(683, 523);
        int int24 = sumWithoutArithmeticOperators0.getSum(1788, 266);
        int int27 = sumWithoutArithmeticOperators0.getSum(3724, 23135);
        int int30 = sumWithoutArithmeticOperators0.getSum(6298, 20125);
        java.lang.Class<?> wildcardClass31 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 33 + "'", int15 == 33);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 163 + "'", int18 == 163);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1206 + "'", int21 == 1206);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2054 + "'", int24 == 2054);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 26859 + "'", int27 == 26859);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 26423 + "'", int30 == 26423);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test5758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5758");
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
        int int30 = sumWithoutArithmeticOperators0.getSum(17306, 33750);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 84 + "'", int12 == 84);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 144 + "'", int15 == 144);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 163 + "'", int18 == 163);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 266 + "'", int21 == 266);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1200 + "'", int24 == 1200);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 5096 + "'", int27 == 5096);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 51056 + "'", int30 == 51056);
    }

    @Test
    public void test5759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5759");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) 'a', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum(196, (int) ' ');
        int int15 = sumWithoutArithmeticOperators0.getSum(1128, 108);
        int int18 = sumWithoutArithmeticOperators0.getSum(844, 98);
        int int21 = sumWithoutArithmeticOperators0.getSum(2231, 0);
        int int24 = sumWithoutArithmeticOperators0.getSum(24941, 5596);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 98 + "'", int9 == 98);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 228 + "'", int12 == 228);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1236 + "'", int15 == 1236);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 942 + "'", int18 == 942);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2231 + "'", int21 == 2231);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 30537 + "'", int24 == 30537);
    }

    @Test
    public void test5760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5760");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 1, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(18, (int) (byte) -1);
        int int15 = sumWithoutArithmeticOperators0.getSum(9, 217);
        int int18 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 41);
        int int21 = sumWithoutArithmeticOperators0.getSum(290, 1121);
        int int24 = sumWithoutArithmeticOperators0.getSum(699, 1097);
        int int27 = sumWithoutArithmeticOperators0.getSum(988, 725);
        int int30 = sumWithoutArithmeticOperators0.getSum(2887, 42016);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 17 + "'", int12 == 17);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 226 + "'", int15 == 226);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 51 + "'", int18 == 51);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1411 + "'", int21 == 1411);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1796 + "'", int24 == 1796);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1713 + "'", int27 == 1713);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 44903 + "'", int30 == 44903);
    }

    @Test
    public void test5761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5761");
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
        java.lang.Class<?> wildcardClass37 = sumWithoutArithmeticOperators0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test5762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5762");
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
        int int33 = sumWithoutArithmeticOperators0.getSum(1664, 726);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2390 + "'", int33 == 2390);
    }

    @Test
    public void test5763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5763");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(10, (int) (byte) 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(321, 56);
        int int9 = sumWithoutArithmeticOperators0.getSum(277, 100);
        int int12 = sumWithoutArithmeticOperators0.getSum(625, 55);
        int int15 = sumWithoutArithmeticOperators0.getSum(165, 199);
        int int18 = sumWithoutArithmeticOperators0.getSum(215, 0);
        int int21 = sumWithoutArithmeticOperators0.getSum(416, 6812);
        int int24 = sumWithoutArithmeticOperators0.getSum(6914, 7161);
        int int27 = sumWithoutArithmeticOperators0.getSum(8074, 23194);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 377 + "'", int6 == 377);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 377 + "'", int9 == 377);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 680 + "'", int12 == 680);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 364 + "'", int15 == 364);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 215 + "'", int18 == 215);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 7228 + "'", int21 == 7228);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 14075 + "'", int24 == 14075);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 31268 + "'", int27 == 31268);
    }

    @Test
    public void test5764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5764");
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
        int int30 = sumWithoutArithmeticOperators0.getSum(13445, 1685);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 186 + "'", int12 == 186);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 363 + "'", int15 == 363);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 302 + "'", int18 == 302);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2123 + "'", int21 == 2123);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 289 + "'", int24 == 289);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10514 + "'", int27 == 10514);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 15130 + "'", int30 == 15130);
    }

    @Test
    public void test5765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5765");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (short) 100, 34);
        int int12 = sumWithoutArithmeticOperators0.getSum(144, 21);
        int int15 = sumWithoutArithmeticOperators0.getSum(0, 35);
        int int18 = sumWithoutArithmeticOperators0.getSum(210, 36);
        int int21 = sumWithoutArithmeticOperators0.getSum(317, 110);
        int int24 = sumWithoutArithmeticOperators0.getSum(109, 166);
        int int27 = sumWithoutArithmeticOperators0.getSum(0, 15788);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 134 + "'", int9 == 134);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 165 + "'", int12 == 165);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 246 + "'", int18 == 246);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 427 + "'", int21 == 427);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 275 + "'", int24 == 275);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 15788 + "'", int27 == 15788);
    }

    @Test
    public void test5766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5766");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(0, 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(10, (int) (byte) 100);
        int int12 = sumWithoutArithmeticOperators0.getSum(277, 17);
        int int15 = sumWithoutArithmeticOperators0.getSum(0, 1026);
        int int18 = sumWithoutArithmeticOperators0.getSum(2767, 3397);
        int int21 = sumWithoutArithmeticOperators0.getSum(1473, 791);
        int int24 = sumWithoutArithmeticOperators0.getSum(1383, 84);
        int int27 = sumWithoutArithmeticOperators0.getSum(8983, 18979);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 152 + "'", int6 == 152);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 294 + "'", int12 == 294);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1026 + "'", int15 == 1026);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6164 + "'", int18 == 6164);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2264 + "'", int21 == 2264);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1467 + "'", int24 == 1467);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 27962 + "'", int27 == 27962);
    }

    @Test
    public void test5767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5767");
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
        int int30 = sumWithoutArithmeticOperators0.getSum(51, 2767);
        int int33 = sumWithoutArithmeticOperators0.getSum(1701, 5125);
        int int36 = sumWithoutArithmeticOperators0.getSum(1056, 19301);
        int int39 = sumWithoutArithmeticOperators0.getSum(1439, 23877);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 33 + "'", int15 == 33);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 163 + "'", int18 == 163);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 236 + "'", int21 == 236);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1261 + "'", int24 == 1261);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2948 + "'", int27 == 2948);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2818 + "'", int30 == 2818);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 6826 + "'", int33 == 6826);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 20357 + "'", int36 == 20357);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 25316 + "'", int39 == 25316);
    }

    @Test
    public void test5768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5768");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(200, (int) (byte) 0);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (short) -1, 129);
        int int12 = sumWithoutArithmeticOperators0.getSum(6942, 32585);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 200 + "'", int6 == 200);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 128 + "'", int9 == 128);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 39527 + "'", int12 == 39527);
    }

    @Test
    public void test5769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5769");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (short) 100, 34);
        int int12 = sumWithoutArithmeticOperators0.getSum(144, 21);
        int int15 = sumWithoutArithmeticOperators0.getSum(3196, (int) (byte) -1);
        java.lang.Class<?> wildcardClass16 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 134 + "'", int9 == 134);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 165 + "'", int12 == 165);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3195 + "'", int15 == 3195);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test5770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5770");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(10, 352);
        int int15 = sumWithoutArithmeticOperators0.getSum(2631, 5029);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 362 + "'", int12 == 362);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7660 + "'", int15 == 7660);
    }

    @Test
    public void test5771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5771");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (short) 100, 34);
        int int12 = sumWithoutArithmeticOperators0.getSum(144, 21);
        int int15 = sumWithoutArithmeticOperators0.getSum(0, 35);
        int int18 = sumWithoutArithmeticOperators0.getSum(210, 36);
        int int21 = sumWithoutArithmeticOperators0.getSum(766, 1168);
        int int24 = sumWithoutArithmeticOperators0.getSum(2136, 697);
        int int27 = sumWithoutArithmeticOperators0.getSum(1725, 5624);
        java.lang.Class<?> wildcardClass28 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 134 + "'", int9 == 134);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 165 + "'", int12 == 165);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 246 + "'", int18 == 246);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1934 + "'", int21 == 1934);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2833 + "'", int24 == 2833);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 7349 + "'", int27 == 7349);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test5772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5772");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(129, 109);
        int int12 = sumWithoutArithmeticOperators0.getSum(390, 109);
        int int15 = sumWithoutArithmeticOperators0.getSum(1829, 635);
        int int18 = sumWithoutArithmeticOperators0.getSum(5363, 0);
        int int21 = sumWithoutArithmeticOperators0.getSum(1268, 0);
        int int24 = sumWithoutArithmeticOperators0.getSum(3501, 310);
        int int27 = sumWithoutArithmeticOperators0.getSum(766, 0);
        java.lang.Class<?> wildcardClass28 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 238 + "'", int9 == 238);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 499 + "'", int12 == 499);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2464 + "'", int15 == 2464);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5363 + "'", int18 == 5363);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1268 + "'", int21 == 1268);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3811 + "'", int24 == 3811);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 766 + "'", int27 == 766);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test5773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5773");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 1, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(21, 11);
        int int15 = sumWithoutArithmeticOperators0.getSum((int) '#', (int) (short) 1);
        int int18 = sumWithoutArithmeticOperators0.getSum(0, 253);
        int int21 = sumWithoutArithmeticOperators0.getSum(16789, 1320);
        java.lang.Class<?> wildcardClass22 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 36 + "'", int15 == 36);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 253 + "'", int18 == 253);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 18109 + "'", int21 == 18109);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test5774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5774");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(21, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(0, 10);
        int int15 = sumWithoutArithmeticOperators0.getSum(488, 1236);
        int int18 = sumWithoutArithmeticOperators0.getSum(546, 853);
        int int21 = sumWithoutArithmeticOperators0.getSum(376, 2889);
        java.lang.Class<?> wildcardClass22 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 21 + "'", int9 == 21);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1724 + "'", int15 == 1724);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1399 + "'", int18 == 1399);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3265 + "'", int21 == 3265);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test5775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5775");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, (int) (short) 10);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) '4', 134);
        int int15 = sumWithoutArithmeticOperators0.getSum(162, 162);
        int int18 = sumWithoutArithmeticOperators0.getSum(100, 32);
        int int21 = sumWithoutArithmeticOperators0.getSum(2108, 1067);
        java.lang.Class<?> wildcardClass22 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 186 + "'", int12 == 186);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 324 + "'", int15 == 324);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 132 + "'", int18 == 132);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3175 + "'", int21 == 3175);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test5776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5776");
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
        int int30 = sumWithoutArithmeticOperators0.getSum(17855, 60894);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 186 + "'", int12 == 186);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 19 + "'", int15 == 19);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 42 + "'", int18 == 42);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3231 + "'", int21 == 3231);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4024 + "'", int24 == 4024);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 14136 + "'", int27 == 14136);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 78749 + "'", int30 == 78749);
    }

    @Test
    public void test5777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5777");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(345, 269);
        int int9 = sumWithoutArithmeticOperators0.getSum(2456, 3564);
        int int12 = sumWithoutArithmeticOperators0.getSum(483, 14209);
        int int15 = sumWithoutArithmeticOperators0.getSum(14228, 1367);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 614 + "'", int6 == 614);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 6020 + "'", int9 == 6020);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 14692 + "'", int12 == 14692);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 15595 + "'", int15 == 15595);
    }

    @Test
    public void test5778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5778");
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
        int int30 = sumWithoutArithmeticOperators0.getSum(2596, 14957);
        int int33 = sumWithoutArithmeticOperators0.getSum(2575, 6003);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 186 + "'", int12 == 186);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 19 + "'", int15 == 19);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 109 + "'", int18 == 109);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 283 + "'", int21 == 283);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 377 + "'", int24 == 377);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 9265 + "'", int27 == 9265);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 17553 + "'", int30 == 17553);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 8578 + "'", int33 == 8578);
    }

    @Test
    public void test5779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5779");
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
        int int30 = sumWithoutArithmeticOperators0.getSum(566, 11947);
        java.lang.Class<?> wildcardClass31 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 18 + "'", int3 == 18);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 56 + "'", int6 == 56);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1313 + "'", int9 == 1313);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1714 + "'", int12 == 1714);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 597 + "'", int15 == 597);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 853 + "'", int18 == 853);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 51 + "'", int21 == 51);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2426 + "'", int24 == 2426);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 24049 + "'", int27 == 24049);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 12513 + "'", int30 == 12513);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test5780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5780");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum(129, 165);
        int int12 = sumWithoutArithmeticOperators0.getSum(152, 108);
        int int15 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 55);
        int int18 = sumWithoutArithmeticOperators0.getSum((int) (byte) 1, 785);
        int int21 = sumWithoutArithmeticOperators0.getSum(0, 8554);
        int int24 = sumWithoutArithmeticOperators0.getSum(19629, 3890);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 294 + "'", int9 == 294);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 260 + "'", int12 == 260);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 54 + "'", int15 == 54);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 786 + "'", int18 == 786);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8554 + "'", int21 == 8554);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 23519 + "'", int24 == 23519);
    }

    @Test
    public void test5781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5781");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (short) 100, 34);
        int int12 = sumWithoutArithmeticOperators0.getSum(289, 269);
        int int15 = sumWithoutArithmeticOperators0.getSum(766, 978);
        int int18 = sumWithoutArithmeticOperators0.getSum(925, 360);
        int int21 = sumWithoutArithmeticOperators0.getSum(1206, 199);
        int int24 = sumWithoutArithmeticOperators0.getSum(562, 128);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 134 + "'", int9 == 134);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 558 + "'", int12 == 558);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1744 + "'", int15 == 1744);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1285 + "'", int18 == 1285);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1405 + "'", int21 == 1405);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 690 + "'", int24 == 690);
    }

    @Test
    public void test5782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5782");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, (int) (short) 10);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) '4', 134);
        int int15 = sumWithoutArithmeticOperators0.getSum(162, 162);
        int int18 = sumWithoutArithmeticOperators0.getSum(100, 32);
        int int21 = sumWithoutArithmeticOperators0.getSum(0, 84);
        int int24 = sumWithoutArithmeticOperators0.getSum(150, 161);
        int int27 = sumWithoutArithmeticOperators0.getSum(209, 343);
        int int30 = sumWithoutArithmeticOperators0.getSum(853, (int) ' ');
        int int33 = sumWithoutArithmeticOperators0.getSum(1313, 0);
        int int36 = sumWithoutArithmeticOperators0.getSum(996, 1357);
        int int39 = sumWithoutArithmeticOperators0.getSum(3773, 107);
        int int42 = sumWithoutArithmeticOperators0.getSum(4051, 950);
        int int45 = sumWithoutArithmeticOperators0.getSum(6634, 8496);
        java.lang.Class<?> wildcardClass46 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 186 + "'", int12 == 186);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 324 + "'", int15 == 324);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 132 + "'", int18 == 132);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 84 + "'", int21 == 84);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 311 + "'", int24 == 311);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 552 + "'", int27 == 552);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 885 + "'", int30 == 885);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1313 + "'", int33 == 1313);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2353 + "'", int36 == 2353);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 3880 + "'", int39 == 3880);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 5001 + "'", int42 == 5001);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 15130 + "'", int45 == 15130);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test5783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5783");
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
        int int30 = sumWithoutArithmeticOperators0.getSum(122, 2596);
        int int33 = sumWithoutArithmeticOperators0.getSum(33872, 974);
        int int36 = sumWithoutArithmeticOperators0.getSum(6814, 11115);
        int int39 = sumWithoutArithmeticOperators0.getSum(13139, 23236);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 186 + "'", int12 == 186);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 19 + "'", int15 == 19);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 460 + "'", int21 == 460);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 490 + "'", int24 == 490);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 6812 + "'", int27 == 6812);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2718 + "'", int30 == 2718);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 34846 + "'", int33 == 34846);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 17929 + "'", int36 == 17929);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 36375 + "'", int39 == 36375);
    }

    @Test
    public void test5784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5784");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(110, 376);
        int int12 = sumWithoutArithmeticOperators0.getSum(1172, 3707);
        int int15 = sumWithoutArithmeticOperators0.getSum(739, 9967);
        int int18 = sumWithoutArithmeticOperators0.getSum(7382, 1059);
        int int21 = sumWithoutArithmeticOperators0.getSum(3299, 3858);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 486 + "'", int9 == 486);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4879 + "'", int12 == 4879);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10706 + "'", int15 == 10706);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8441 + "'", int18 == 8441);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 7157 + "'", int21 == 7157);
    }

    @Test
    public void test5785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5785");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 18);
        int int9 = sumWithoutArithmeticOperators0.getSum(36, 160);
        int int12 = sumWithoutArithmeticOperators0.getSum((-1), 108);
        int int15 = sumWithoutArithmeticOperators0.getSum(859, 249);
        int int18 = sumWithoutArithmeticOperators0.getSum(785, 0);
        int int21 = sumWithoutArithmeticOperators0.getSum(49444, 19413);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 18 + "'", int6 == 18);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 196 + "'", int9 == 196);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 107 + "'", int12 == 107);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1108 + "'", int15 == 1108);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 785 + "'", int18 == 785);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 68857 + "'", int21 == 68857);
    }

    @Test
    public void test5786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5786");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(0, 199);
        int int12 = sumWithoutArithmeticOperators0.getSum(324, 614);
        int int15 = sumWithoutArithmeticOperators0.getSum(533, (int) (short) 10);
        int int18 = sumWithoutArithmeticOperators0.getSum(1748, 1807);
        int int21 = sumWithoutArithmeticOperators0.getSum(1119, 210);
        int int24 = sumWithoutArithmeticOperators0.getSum(10355, 3322);
        int int27 = sumWithoutArithmeticOperators0.getSum(431, 2727);
        java.lang.Class<?> wildcardClass28 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 199 + "'", int9 == 199);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 938 + "'", int12 == 938);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 543 + "'", int15 == 543);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3555 + "'", int18 == 3555);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1329 + "'", int21 == 1329);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 13677 + "'", int24 == 13677);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3158 + "'", int27 == 3158);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test5787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5787");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, (int) (short) 10);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) '4', 134);
        int int15 = sumWithoutArithmeticOperators0.getSum(162, 162);
        int int18 = sumWithoutArithmeticOperators0.getSum(100, 32);
        int int21 = sumWithoutArithmeticOperators0.getSum(0, 84);
        int int24 = sumWithoutArithmeticOperators0.getSum(289, 376);
        int int27 = sumWithoutArithmeticOperators0.getSum(3529, 7798);
        int int30 = sumWithoutArithmeticOperators0.getSum(35477, 2538);
        java.lang.Class<?> wildcardClass31 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 186 + "'", int12 == 186);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 324 + "'", int15 == 324);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 132 + "'", int18 == 132);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 84 + "'", int21 == 84);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 665 + "'", int24 == 665);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 11327 + "'", int27 == 11327);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 38015 + "'", int30 == 38015);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test5788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5788");
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
        int int36 = sumWithoutArithmeticOperators0.getSum(0, 2279);
        java.lang.Class<?> wildcardClass37 = sumWithoutArithmeticOperators0.getClass();
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2279 + "'", int36 == 2279);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test5789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5789");
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
        int int30 = sumWithoutArithmeticOperators0.getSum(3452, 16269);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 238 + "'", int9 == 238);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 499 + "'", int12 == 499);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 555 + "'", int15 == 555);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 593 + "'", int18 == 593);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1112 + "'", int21 == 1112);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1587 + "'", int24 == 1587);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 8633 + "'", int27 == 8633);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 19721 + "'", int30 == 19721);
    }

    @Test
    public void test5790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5790");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, (int) (short) 10);
        int int12 = sumWithoutArithmeticOperators0.getSum(54, 680);
        int int15 = sumWithoutArithmeticOperators0.getSum(23482, 21891);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 734 + "'", int12 == 734);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 45373 + "'", int15 == 45373);
    }

    @Test
    public void test5791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5791");
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
        int int30 = sumWithoutArithmeticOperators0.getSum(3091, 7563);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 84 + "'", int12 == 84);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 144 + "'", int15 == 144);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 163 + "'", int18 == 163);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 7 + "'", int21 == 7);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1186 + "'", int24 == 1186);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 763 + "'", int27 == 763);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10654 + "'", int30 == 10654);
    }

    @Test
    public void test5792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5792");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 53);
        int int15 = sumWithoutArithmeticOperators0.getSum(1972, 1294);
        int int18 = sumWithoutArithmeticOperators0.getSum(10077, 16228);
        int int21 = sumWithoutArithmeticOperators0.getSum(2035, 9548);
        int int24 = sumWithoutArithmeticOperators0.getSum(2847, 10927);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3266 + "'", int15 == 3266);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 26305 + "'", int18 == 26305);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 11583 + "'", int21 == 11583);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 13774 + "'", int24 == 13774);
    }

    @Test
    public void test5793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5793");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) ' ', 35);
        int int6 = sumWithoutArithmeticOperators0.getSum(1253, 1133);
        int int9 = sumWithoutArithmeticOperators0.getSum(524, 166);
        int int12 = sumWithoutArithmeticOperators0.getSum(824, 4193);
        int int15 = sumWithoutArithmeticOperators0.getSum(44307, 5137);
        java.lang.Class<?> wildcardClass16 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 67 + "'", int3 == 67);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2386 + "'", int6 == 2386);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 690 + "'", int9 == 690);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5017 + "'", int12 == 5017);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 49444 + "'", int15 == 49444);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test5794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5794");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum(9415, 994);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10409 + "'", int9 == 10409);
    }

    @Test
    public void test5795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5795");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(35, (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 35);
        int int15 = sumWithoutArithmeticOperators0.getSum(33, 163);
        int int18 = sumWithoutArithmeticOperators0.getSum(788, 1555);
        int int21 = sumWithoutArithmeticOperators0.getSum(54, 325);
        int int24 = sumWithoutArithmeticOperators0.getSum(47862, 25878);
        int int27 = sumWithoutArithmeticOperators0.getSum(19834, 22160);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 196 + "'", int15 == 196);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2343 + "'", int18 == 2343);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 379 + "'", int21 == 379);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 73740 + "'", int24 == 73740);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 41994 + "'", int27 == 41994);
    }

    @Test
    public void test5796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5796");
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
        java.lang.Class<?> wildcardClass34 = sumWithoutArithmeticOperators0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test5797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5797");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(35, (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum(238, 152);
        int int15 = sumWithoutArithmeticOperators0.getSum(245, 162);
        int int18 = sumWithoutArithmeticOperators0.getSum(134, 36);
        int int21 = sumWithoutArithmeticOperators0.getSum(90, 844);
        int int24 = sumWithoutArithmeticOperators0.getSum(15436, 352);
        java.lang.Class<?> wildcardClass25 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 390 + "'", int12 == 390);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 407 + "'", int15 == 407);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 170 + "'", int18 == 170);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 934 + "'", int21 == 934);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 15788 + "'", int24 == 15788);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test5798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5798");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (short) 100, 34);
        int int12 = sumWithoutArithmeticOperators0.getSum(144, 21);
        int int15 = sumWithoutArithmeticOperators0.getSum(0, 35);
        int int18 = sumWithoutArithmeticOperators0.getSum((-1), 290);
        int int21 = sumWithoutArithmeticOperators0.getSum(3564, 5352);
        int int24 = sumWithoutArithmeticOperators0.getSum(16180, 3986);
        java.lang.Class<?> wildcardClass25 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 134 + "'", int9 == 134);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 165 + "'", int12 == 165);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 289 + "'", int18 == 289);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8916 + "'", int21 == 8916);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 20166 + "'", int24 == 20166);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test5799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5799");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, (int) (short) 10);
        int int12 = sumWithoutArithmeticOperators0.getSum(54, 680);
        int int15 = sumWithoutArithmeticOperators0.getSum(978, 165);
        int int18 = sumWithoutArithmeticOperators0.getSum(7558, 3024);
        int int21 = sumWithoutArithmeticOperators0.getSum(2070, 12316);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 734 + "'", int12 == 734);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1143 + "'", int15 == 1143);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10582 + "'", int18 == 10582);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 14386 + "'", int21 == 14386);
    }

    @Test
    public void test5800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5800");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(0, 199);
        int int12 = sumWithoutArithmeticOperators0.getSum(324, 614);
        int int15 = sumWithoutArithmeticOperators0.getSum(533, (int) (short) 10);
        int int18 = sumWithoutArithmeticOperators0.getSum(2230, 1934);
        int int21 = sumWithoutArithmeticOperators0.getSum(15077, 16091);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 199 + "'", int9 == 199);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 938 + "'", int12 == 938);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 543 + "'", int15 == 543);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4164 + "'", int18 == 4164);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 31168 + "'", int21 == 31168);
    }

    @Test
    public void test5801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5801");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(911, 432);
        int int12 = sumWithoutArithmeticOperators0.getSum(955, 382);
        int int15 = sumWithoutArithmeticOperators0.getSum(30363, 36338);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1343 + "'", int9 == 1343);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1337 + "'", int12 == 1337);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 66701 + "'", int15 == 66701);
    }

    @Test
    public void test5802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5802");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum(0, 486);
        int int12 = sumWithoutArithmeticOperators0.getSum(763, 240);
        int int15 = sumWithoutArithmeticOperators0.getSum(1724, 163);
        int int18 = sumWithoutArithmeticOperators0.getSum(2986, 524);
        java.lang.Class<?> wildcardClass19 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 486 + "'", int9 == 486);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1003 + "'", int12 == 1003);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1887 + "'", int15 == 1887);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3510 + "'", int18 == 3510);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test5803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5803");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(129, 109);
        int int12 = sumWithoutArithmeticOperators0.getSum(2924, 1846);
        int int15 = sumWithoutArithmeticOperators0.getSum(1907, 15604);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 238 + "'", int9 == 238);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4770 + "'", int12 == 4770);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 17511 + "'", int15 == 17511);
    }

    @Test
    public void test5804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5804");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(18643, 2483);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21126 + "'", int6 == 21126);
    }

    @Test
    public void test5805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5805");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(21, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(210, 1);
        int int15 = sumWithoutArithmeticOperators0.getSum(226, 17);
        int int18 = sumWithoutArithmeticOperators0.getSum(650, 5595);
        java.lang.Class<?> wildcardClass19 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 21 + "'", int9 == 21);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 211 + "'", int12 == 211);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 243 + "'", int15 == 243);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6245 + "'", int18 == 6245);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test5806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5806");
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
        int int30 = sumWithoutArithmeticOperators0.getSum(8243, 9877);
        int int33 = sumWithoutArithmeticOperators0.getSum(15491, 9078);
        int int36 = sumWithoutArithmeticOperators0.getSum(27890, 19642);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 122 + "'", int15 == 122);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 269 + "'", int18 == 269);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 251 + "'", int21 == 251);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3095 + "'", int24 == 3095);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2472 + "'", int27 == 2472);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 18120 + "'", int30 == 18120);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 24569 + "'", int33 == 24569);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 47532 + "'", int36 == 47532);
    }

    @Test
    public void test5807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5807");
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
        int int39 = sumWithoutArithmeticOperators0.getSum(8619, 40554);
        int int42 = sumWithoutArithmeticOperators0.getSum(5903, 10356);
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 49173 + "'", int39 == 49173);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 16259 + "'", int42 == 16259);
    }

    @Test
    public void test5808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5808");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(32, (int) '4');
        int int15 = sumWithoutArithmeticOperators0.getSum(44, 100);
        int int18 = sumWithoutArithmeticOperators0.getSum(17475, 11261);
        int int21 = sumWithoutArithmeticOperators0.getSum(4046, 2028);
        int int24 = sumWithoutArithmeticOperators0.getSum(20972, 7136);
        int int27 = sumWithoutArithmeticOperators0.getSum(25657, 10762);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 84 + "'", int12 == 84);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 144 + "'", int15 == 144);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 28736 + "'", int18 == 28736);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 6074 + "'", int21 == 6074);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 28108 + "'", int24 == 28108);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 36419 + "'", int27 == 36419);
    }

    @Test
    public void test5809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5809");
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
        int int33 = sumWithoutArithmeticOperators0.getSum(8642, 7312);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 15954 + "'", int33 == 15954);
    }

    @Test
    public void test5810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5810");
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
        int int30 = sumWithoutArithmeticOperators0.getSum(5309, 2463);
        int int33 = sumWithoutArithmeticOperators0.getSum(4131, 2090);
        int int36 = sumWithoutArithmeticOperators0.getSum(7675, 33941);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 134 + "'", int9 == 134);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 165 + "'", int12 == 165);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 254 + "'", int15 == 254);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 416 + "'", int18 == 416);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2597 + "'", int21 == 2597);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1490 + "'", int24 == 1490);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 5573 + "'", int27 == 5573);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 7772 + "'", int30 == 7772);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 6221 + "'", int33 == 6221);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 41616 + "'", int36 == 41616);
    }

    @Test
    public void test5811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5811");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(21, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(210, 1);
        int int15 = sumWithoutArithmeticOperators0.getSum(226, 17);
        int int18 = sumWithoutArithmeticOperators0.getSum(275, 337);
        int int21 = sumWithoutArithmeticOperators0.getSum(0, 9559);
        int int24 = sumWithoutArithmeticOperators0.getSum(11258, 93533);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 21 + "'", int9 == 21);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 211 + "'", int12 == 211);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 243 + "'", int15 == 243);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 612 + "'", int18 == 612);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 9559 + "'", int21 == 9559);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 104791 + "'", int24 == 104791);
    }

    @Test
    public void test5812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5812");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (short) 100, 34);
        int int12 = sumWithoutArithmeticOperators0.getSum(144, 21);
        int int15 = sumWithoutArithmeticOperators0.getSum(0, 35);
        int int18 = sumWithoutArithmeticOperators0.getSum((-1), 290);
        int int21 = sumWithoutArithmeticOperators0.getSum(715, (int) (byte) 0);
        int int24 = sumWithoutArithmeticOperators0.getSum(11431, 1292);
        int int27 = sumWithoutArithmeticOperators0.getSum(11031, 542);
        java.lang.Class<?> wildcardClass28 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 134 + "'", int9 == 134);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 165 + "'", int12 == 165);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 289 + "'", int18 == 289);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 715 + "'", int21 == 715);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 12723 + "'", int24 == 12723);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 11573 + "'", int27 == 11573);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test5813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5813");
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
        int int36 = sumWithoutArithmeticOperators0.getSum(2601, 19098);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 21699 + "'", int36 == 21699);
    }

    @Test
    public void test5814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5814");
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
        int int33 = sumWithoutArithmeticOperators0.getSum(24383, 16308);
        int int36 = sumWithoutArithmeticOperators0.getSum(1360, 13390);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 40691 + "'", int33 == 40691);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 14750 + "'", int36 == 14750);
    }

    @Test
    public void test5815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5815");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(35, (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 35);
        int int15 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 162);
        int int18 = sumWithoutArithmeticOperators0.getSum(574, 1268);
        int int21 = sumWithoutArithmeticOperators0.getSum(265, 734);
        int int24 = sumWithoutArithmeticOperators0.getSum(24022, 37204);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 161 + "'", int15 == 161);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1842 + "'", int18 == 1842);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 999 + "'", int21 == 999);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 61226 + "'", int24 == 61226);
    }

    @Test
    public void test5816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5816");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 1, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(201, 11);
        int int15 = sumWithoutArithmeticOperators0.getSum(638, 1574);
        int int18 = sumWithoutArithmeticOperators0.getSum(1180, 2581);
        int int21 = sumWithoutArithmeticOperators0.getSum(24514, 1050);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 212 + "'", int12 == 212);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2212 + "'", int15 == 2212);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3761 + "'", int18 == 3761);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 25564 + "'", int21 == 25564);
    }

    @Test
    public void test5817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5817");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(0, 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(9, (int) '#');
        int int12 = sumWithoutArithmeticOperators0.getSum(354, 1848);
        int int15 = sumWithoutArithmeticOperators0.getSum(32, 110);
        int int18 = sumWithoutArithmeticOperators0.getSum(2495, 6580);
        int int21 = sumWithoutArithmeticOperators0.getSum(12265, 105);
        int int24 = sumWithoutArithmeticOperators0.getSum(324, 0);
        java.lang.Class<?> wildcardClass25 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 152 + "'", int6 == 152);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 44 + "'", int9 == 44);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2202 + "'", int12 == 2202);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 142 + "'", int15 == 142);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9075 + "'", int18 == 9075);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 12370 + "'", int21 == 12370);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 324 + "'", int24 == 324);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test5818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5818");
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
        int int30 = sumWithoutArithmeticOperators0.getSum(2884, 979);
        int int33 = sumWithoutArithmeticOperators0.getSum(11413, 30243);
        java.lang.Class<?> wildcardClass34 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 152 + "'", int6 == 152);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 44 + "'", int9 == 44);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 215 + "'", int12 == 215);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 317 + "'", int15 == 317);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 996 + "'", int18 == 996);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 466 + "'", int21 == 466);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5190 + "'", int24 == 5190);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 9520 + "'", int27 == 9520);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3863 + "'", int30 == 3863);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 41656 + "'", int33 == 41656);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test5819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5819");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(21, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (short) 100);
        int int15 = sumWithoutArithmeticOperators0.getSum(0, 499);
        int int18 = sumWithoutArithmeticOperators0.getSum(156, 100);
        int int21 = sumWithoutArithmeticOperators0.getSum((int) ' ', 2887);
        int int24 = sumWithoutArithmeticOperators0.getSum(17451, 8927);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 21 + "'", int9 == 21);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 200 + "'", int12 == 200);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 499 + "'", int15 == 499);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 256 + "'", int18 == 256);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2919 + "'", int21 == 2919);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 26378 + "'", int24 == 26378);
    }

    @Test
    public void test5820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5820");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 1, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(18, (int) (byte) -1);
        int int15 = sumWithoutArithmeticOperators0.getSum(51, 422);
        int int18 = sumWithoutArithmeticOperators0.getSum(360, 526);
        int int21 = sumWithoutArithmeticOperators0.getSum(2219, 1376);
        int int24 = sumWithoutArithmeticOperators0.getSum(1044, 2498);
        int int27 = sumWithoutArithmeticOperators0.getSum(679, 1180);
        int int30 = sumWithoutArithmeticOperators0.getSum(5965, 3328);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 17 + "'", int12 == 17);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 473 + "'", int15 == 473);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 886 + "'", int18 == 886);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3595 + "'", int21 == 3595);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3542 + "'", int24 == 3542);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1859 + "'", int27 == 1859);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 9293 + "'", int30 == 9293);
    }

    @Test
    public void test5821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5821");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(911, 432);
        int int12 = sumWithoutArithmeticOperators0.getSum(955, 382);
        int int15 = sumWithoutArithmeticOperators0.getSum(2223, 422);
        int int18 = sumWithoutArithmeticOperators0.getSum(2224, 15714);
        int int21 = sumWithoutArithmeticOperators0.getSum(4721, 28736);
        int int24 = sumWithoutArithmeticOperators0.getSum(0, 23634);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1343 + "'", int9 == 1343);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1337 + "'", int12 == 1337);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2645 + "'", int15 == 2645);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 17938 + "'", int18 == 17938);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 33457 + "'", int21 == 33457);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 23634 + "'", int24 == 23634);
    }

    @Test
    public void test5822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5822");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(10, (int) (byte) 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(306, 180);
        int int9 = sumWithoutArithmeticOperators0.getSum(736, 1241);
        int int12 = sumWithoutArithmeticOperators0.getSum(293, 938);
        int int15 = sumWithoutArithmeticOperators0.getSum(2684, 1291);
        int int18 = sumWithoutArithmeticOperators0.getSum(785, 859);
        int int21 = sumWithoutArithmeticOperators0.getSum(4193, 16993);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 486 + "'", int6 == 486);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1977 + "'", int9 == 1977);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1231 + "'", int12 == 1231);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3975 + "'", int15 == 3975);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1644 + "'", int18 == 1644);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 21186 + "'", int21 == 21186);
    }

    @Test
    public void test5823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5823");
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
        int int36 = sumWithoutArithmeticOperators0.getSum(17654, 10889);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 28543 + "'", int36 == 28543);
    }

    @Test
    public void test5824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5824");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (short) 100, 34);
        int int12 = sumWithoutArithmeticOperators0.getSum(18, 109);
        int int15 = sumWithoutArithmeticOperators0.getSum(631, 1278);
        int int18 = sumWithoutArithmeticOperators0.getSum(375, 7366);
        int int21 = sumWithoutArithmeticOperators0.getSum(45456, 3525);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 134 + "'", int9 == 134);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 127 + "'", int12 == 127);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1909 + "'", int15 == 1909);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 7741 + "'", int18 == 7741);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 48981 + "'", int21 == 48981);
    }

    @Test
    public void test5825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5825");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(51, 53);
        int int15 = sumWithoutArithmeticOperators0.getSum(238, (int) '4');
        int int18 = sumWithoutArithmeticOperators0.getSum(1044, 84);
        int int21 = sumWithoutArithmeticOperators0.getSum(859, 9);
        int int24 = sumWithoutArithmeticOperators0.getSum(56, (int) (short) 100);
        java.lang.Class<?> wildcardClass25 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 104 + "'", int12 == 104);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 290 + "'", int15 == 290);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1128 + "'", int18 == 1128);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 868 + "'", int21 == 868);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 156 + "'", int24 == 156);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test5826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5826");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 1, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(21, 11);
        int int15 = sumWithoutArithmeticOperators0.getSum(101, 21);
        int int18 = sumWithoutArithmeticOperators0.getSum(89, 180);
        int int21 = sumWithoutArithmeticOperators0.getSum(199, (int) '4');
        int int24 = sumWithoutArithmeticOperators0.getSum((int) '#', 1133);
        int int27 = sumWithoutArithmeticOperators0.getSum(1169, 6812);
        int int30 = sumWithoutArithmeticOperators0.getSum(4562, 763);
        java.lang.Class<?> wildcardClass31 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 122 + "'", int15 == 122);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 269 + "'", int18 == 269);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 251 + "'", int21 == 251);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1168 + "'", int24 == 1168);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 7981 + "'", int27 == 7981);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 5325 + "'", int30 == 5325);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test5827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5827");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(32, (int) '4');
        int int15 = sumWithoutArithmeticOperators0.getSum(44, 100);
        int int18 = sumWithoutArithmeticOperators0.getSum(110, 53);
        int int21 = sumWithoutArithmeticOperators0.getSum(0, 7);
        int int24 = sumWithoutArithmeticOperators0.getSum(3559, 2415);
        java.lang.Class<?> wildcardClass25 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 84 + "'", int12 == 84);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 144 + "'", int15 == 144);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 163 + "'", int18 == 163);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 7 + "'", int21 == 7);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5974 + "'", int24 == 5974);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test5828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5828");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(51, 53);
        int int15 = sumWithoutArithmeticOperators0.getSum(375, 352);
        int int18 = sumWithoutArithmeticOperators0.getSum(195, 226);
        int int21 = sumWithoutArithmeticOperators0.getSum(1096, 5978);
        int int24 = sumWithoutArithmeticOperators0.getSum(3103, 5113);
        int int27 = sumWithoutArithmeticOperators0.getSum(4687, 9079);
        java.lang.Class<?> wildcardClass28 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 104 + "'", int12 == 104);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 727 + "'", int15 == 727);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 421 + "'", int18 == 421);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 7074 + "'", int21 == 7074);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 8216 + "'", int24 == 8216);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 13766 + "'", int27 == 13766);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test5829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5829");
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
        int int30 = sumWithoutArithmeticOperators0.getSum(8940, 27962);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 21 + "'", int9 == 21);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 211 + "'", int12 == 211);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 243 + "'", int15 == 243);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 612 + "'", int18 == 612);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 685 + "'", int21 == 685);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5417 + "'", int24 == 5417);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 343 + "'", int27 == 343);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 36902 + "'", int30 == 36902);
    }

    @Test
    public void test5830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5830");
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
        java.lang.Class<?> wildcardClass31 = sumWithoutArithmeticOperators0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test5831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5831");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(32, (int) '4');
        int int15 = sumWithoutArithmeticOperators0.getSum((int) (short) 100, 1);
        int int18 = sumWithoutArithmeticOperators0.getSum(2432, 76);
        int int21 = sumWithoutArithmeticOperators0.getSum(3757, 19846);
        java.lang.Class<?> wildcardClass22 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 84 + "'", int12 == 84);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 101 + "'", int15 == 101);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2508 + "'", int18 == 2508);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 23603 + "'", int21 == 23603);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test5832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5832");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(0, 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(10, (int) (byte) 100);
        int int12 = sumWithoutArithmeticOperators0.getSum(277, 17);
        int int15 = sumWithoutArithmeticOperators0.getSum(0, 1026);
        int int18 = sumWithoutArithmeticOperators0.getSum(2767, 3397);
        int int21 = sumWithoutArithmeticOperators0.getSum(8356, 16904);
        int int24 = sumWithoutArithmeticOperators0.getSum(11329, 1560);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 152 + "'", int6 == 152);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 294 + "'", int12 == 294);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1026 + "'", int15 == 1026);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6164 + "'", int18 == 6164);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 25260 + "'", int21 == 25260);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 12889 + "'", int24 == 12889);
    }

    @Test
    public void test5833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5833");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) 0, (int) (short) -1);
        int int15 = sumWithoutArithmeticOperators0.getSum((int) ' ', 1);
        int int18 = sumWithoutArithmeticOperators0.getSum(11, 152);
        int int21 = sumWithoutArithmeticOperators0.getSum(286, 9);
        int int24 = sumWithoutArithmeticOperators0.getSum(2290, 1281);
        int int27 = sumWithoutArithmeticOperators0.getSum(9547, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 33 + "'", int15 == 33);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 163 + "'", int18 == 163);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 295 + "'", int21 == 295);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3571 + "'", int24 == 3571);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 9547 + "'", int27 == 9547);
    }

    @Test
    public void test5834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5834");
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
        int int30 = sumWithoutArithmeticOperators0.getSum(1238, 2955);
        int int33 = sumWithoutArithmeticOperators0.getSum(0, 0);
        int int36 = sumWithoutArithmeticOperators0.getSum(25903, 27894);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 84 + "'", int12 == 84);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 144 + "'", int15 == 144);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 163 + "'", int18 == 163);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 483 + "'", int21 == 483);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 635 + "'", int24 == 635);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 606 + "'", int27 == 606);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4193 + "'", int30 == 4193);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 53797 + "'", int36 == 53797);
    }

    @Test
    public void test5835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5835");
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
        int int33 = sumWithoutArithmeticOperators0.getSum(1526, 746);
        int int36 = sumWithoutArithmeticOperators0.getSum(14722, 11002);
        int int39 = sumWithoutArithmeticOperators0.getSum(5738, 30019);
        java.lang.Class<?> wildcardClass40 = sumWithoutArithmeticOperators0.getClass();
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2272 + "'", int33 == 2272);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 25724 + "'", int36 == 25724);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 35757 + "'", int39 == 35757);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test5836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5836");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(370, 1133);
        int int12 = sumWithoutArithmeticOperators0.getSum(2810, 596);
        int int15 = sumWithoutArithmeticOperators0.getSum(179, 3266);
        int int18 = sumWithoutArithmeticOperators0.getSum(1428, 469);
        int int21 = sumWithoutArithmeticOperators0.getSum(17054, 583);
        int int24 = sumWithoutArithmeticOperators0.getSum(3088, 2005);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1503 + "'", int9 == 1503);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3406 + "'", int12 == 3406);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3445 + "'", int15 == 3445);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1897 + "'", int18 == 1897);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 17637 + "'", int21 == 17637);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5093 + "'", int24 == 5093);
    }

    @Test
    public void test5837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5837");
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
        int int30 = sumWithoutArithmeticOperators0.getSum(16139, 22835);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 34 + "'", int15 == 34);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1111 + "'", int18 == 1111);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1491 + "'", int21 == 1491);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4192 + "'", int24 == 4192);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 15646 + "'", int27 == 15646);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 38974 + "'", int30 == 38974);
    }

    @Test
    public void test5838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5838");
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
        int int36 = sumWithoutArithmeticOperators0.getSum(2302, 0);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2233 + "'", int30 == 2233);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 3509 + "'", int33 == 3509);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2302 + "'", int36 == 2302);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test5839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5839");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(17, 200);
        int int6 = sumWithoutArithmeticOperators0.getSum(853, 427);
        int int9 = sumWithoutArithmeticOperators0.getSum(1171, 254);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, 1430);
        int int15 = sumWithoutArithmeticOperators0.getSum(3322, 767);
        int int18 = sumWithoutArithmeticOperators0.getSum(7170, 458);
        java.lang.Class<?> wildcardClass19 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 217 + "'", int3 == 217);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1280 + "'", int6 == 1280);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1425 + "'", int9 == 1425);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1440 + "'", int12 == 1440);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4089 + "'", int15 == 4089);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 7628 + "'", int18 == 7628);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test5840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5840");
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
        int int30 = sumWithoutArithmeticOperators0.getSum(5708, 12566);
        int int33 = sumWithoutArithmeticOperators0.getSum(1169, 35694);
        int int36 = sumWithoutArithmeticOperators0.getSum(4829, 604);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 134 + "'", int9 == 134);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 165 + "'", int12 == 165);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 254 + "'", int15 == 254);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 416 + "'", int18 == 416);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2597 + "'", int21 == 2597);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1490 + "'", int24 == 1490);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3095 + "'", int27 == 3095);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 18274 + "'", int30 == 18274);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 36863 + "'", int33 == 36863);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 5433 + "'", int36 == 5433);
    }

    @Test
    public void test5841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5841");
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
        java.lang.Class<?> wildcardClass31 = sumWithoutArithmeticOperators0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test5842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5842");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(21, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(0, 10);
        int int15 = sumWithoutArithmeticOperators0.getSum(3668, 5341);
        int int18 = sumWithoutArithmeticOperators0.getSum(9220, 7986);
        java.lang.Class<?> wildcardClass19 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 21 + "'", int9 == 21);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9009 + "'", int15 == 9009);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 17206 + "'", int18 == 17206);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test5843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5843");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, (int) (short) 10);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) '4', 134);
        int int15 = sumWithoutArithmeticOperators0.getSum(162, 162);
        int int18 = sumWithoutArithmeticOperators0.getSum(736, 360);
        int int21 = sumWithoutArithmeticOperators0.getSum(150, 601);
        int int24 = sumWithoutArithmeticOperators0.getSum(5190, 285);
        int int27 = sumWithoutArithmeticOperators0.getSum(1869, 3005);
        java.lang.Class<?> wildcardClass28 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 186 + "'", int12 == 186);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 324 + "'", int15 == 324);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1096 + "'", int18 == 1096);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 751 + "'", int21 == 751);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5475 + "'", int24 == 5475);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4874 + "'", int27 == 4874);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test5844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5844");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(35, (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 35);
        int int15 = sumWithoutArithmeticOperators0.getSum(19, 110);
        int int18 = sumWithoutArithmeticOperators0.getSum(51, 109);
        int int21 = sumWithoutArithmeticOperators0.getSum(390, 152);
        int int24 = sumWithoutArithmeticOperators0.getSum(5952, 2824);
        int int27 = sumWithoutArithmeticOperators0.getSum(30994, 5993);
        int int30 = sumWithoutArithmeticOperators0.getSum(27447, 2254);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 129 + "'", int15 == 129);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 160 + "'", int18 == 160);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 542 + "'", int21 == 542);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 8776 + "'", int24 == 8776);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 36987 + "'", int27 == 36987);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 29701 + "'", int30 == 29701);
    }

    @Test
    public void test5845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5845");
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
        java.lang.Class<?> wildcardClass31 = sumWithoutArithmeticOperators0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test5846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5846");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, (int) (short) 10);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) '4', 134);
        int int15 = sumWithoutArithmeticOperators0.getSum(162, 162);
        int int18 = sumWithoutArithmeticOperators0.getSum(623, 483);
        int int21 = sumWithoutArithmeticOperators0.getSum(844, 696);
        int int24 = sumWithoutArithmeticOperators0.getSum(7798, 7729);
        int int27 = sumWithoutArithmeticOperators0.getSum(20891, 19268);
        java.lang.Class<?> wildcardClass28 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 186 + "'", int12 == 186);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 324 + "'", int15 == 324);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1106 + "'", int18 == 1106);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1540 + "'", int21 == 1540);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 15527 + "'", int24 == 15527);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 40159 + "'", int27 == 40159);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test5847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5847");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(257, 250);
        int int12 = sumWithoutArithmeticOperators0.getSum(221, 360);
        int int15 = sumWithoutArithmeticOperators0.getSum(885, (int) '#');
        int int18 = sumWithoutArithmeticOperators0.getSum(17534, 35989);
        java.lang.Class<?> wildcardClass19 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 507 + "'", int9 == 507);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 581 + "'", int12 == 581);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 920 + "'", int15 == 920);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 53523 + "'", int18 == 53523);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test5848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5848");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(0, 199);
        int int12 = sumWithoutArithmeticOperators0.getSum(156, 460);
        int int15 = sumWithoutArithmeticOperators0.getSum(1449, 983);
        int int18 = sumWithoutArithmeticOperators0.getSum(294, 486);
        int int21 = sumWithoutArithmeticOperators0.getSum(780, 2814);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 199 + "'", int9 == 199);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 616 + "'", int12 == 616);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2432 + "'", int15 == 2432);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 780 + "'", int18 == 780);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3594 + "'", int21 == 3594);
    }

    @Test
    public void test5849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5849");
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
        java.lang.Class<?> wildcardClass28 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 186 + "'", int12 == 186);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 19 + "'", int15 == 19);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 109 + "'", int18 == 109);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 824 + "'", int21 == 824);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 11525 + "'", int24 == 11525);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 41626 + "'", int27 == 41626);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test5850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5850");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(110, 376);
        int int12 = sumWithoutArithmeticOperators0.getSum(1172, 3707);
        int int15 = sumWithoutArithmeticOperators0.getSum(647, 2778);
        int int18 = sumWithoutArithmeticOperators0.getSum(2417, 2935);
        int int21 = sumWithoutArithmeticOperators0.getSum(1544, 5243);
        java.lang.Class<?> wildcardClass22 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 486 + "'", int9 == 486);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4879 + "'", int12 == 4879);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3425 + "'", int15 == 3425);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5352 + "'", int18 == 5352);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 6787 + "'", int21 == 6787);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test5851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5851");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(40, 269);
        int int6 = sumWithoutArithmeticOperators0.getSum(202, 523);
        int int9 = sumWithoutArithmeticOperators0.getSum(362, 1680);
        int int12 = sumWithoutArithmeticOperators0.getSum(9017, 5215);
        int int15 = sumWithoutArithmeticOperators0.getSum(13588, 2079);
        java.lang.Class<?> wildcardClass16 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 309 + "'", int3 == 309);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 725 + "'", int6 == 725);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2042 + "'", int9 == 2042);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 14232 + "'", int12 == 14232);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 15667 + "'", int15 == 15667);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test5852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5852");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(129, 109);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) '#', 555);
        int int15 = sumWithoutArithmeticOperators0.getSum(593, 3946);
        int int18 = sumWithoutArithmeticOperators0.getSum(9500, 2054);
        int int21 = sumWithoutArithmeticOperators0.getSum(20743, 24713);
        java.lang.Class<?> wildcardClass22 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 238 + "'", int9 == 238);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 590 + "'", int12 == 590);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4539 + "'", int15 == 4539);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 11554 + "'", int18 == 11554);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 45456 + "'", int21 == 45456);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test5853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5853");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(129, 109);
        int int12 = sumWithoutArithmeticOperators0.getSum(390, 109);
        int int15 = sumWithoutArithmeticOperators0.getSum(11, (int) (short) 0);
        int int18 = sumWithoutArithmeticOperators0.getSum(1856, 1670);
        int int21 = sumWithoutArithmeticOperators0.getSum(1347, 3340);
        int int24 = sumWithoutArithmeticOperators0.getSum(7410, 1367);
        int int27 = sumWithoutArithmeticOperators0.getSum(0, 18919);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 238 + "'", int9 == 238);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 499 + "'", int12 == 499);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 11 + "'", int15 == 11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3526 + "'", int18 == 3526);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4687 + "'", int21 == 4687);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 8777 + "'", int24 == 8777);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 18919 + "'", int27 == 18919);
    }

    @Test
    public void test5854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5854");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 1, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(201, 11);
        int int15 = sumWithoutArithmeticOperators0.getSum(638, 1574);
        int int18 = sumWithoutArithmeticOperators0.getSum(5561, 1856);
        int int21 = sumWithoutArithmeticOperators0.getSum(11416, 13656);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 212 + "'", int12 == 212);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2212 + "'", int15 == 2212);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 7417 + "'", int18 == 7417);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 25072 + "'", int21 == 25072);
    }

    @Test
    public void test5855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5855");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) -1, 19);
        int int6 = sumWithoutArithmeticOperators0.getSum(21, 35);
        int int9 = sumWithoutArithmeticOperators0.getSum(859, 454);
        int int12 = sumWithoutArithmeticOperators0.getSum(1253, 461);
        int int15 = sumWithoutArithmeticOperators0.getSum(288, 309);
        int int18 = sumWithoutArithmeticOperators0.getSum(582, 271);
        int int21 = sumWithoutArithmeticOperators0.getSum(8511, 272);
        java.lang.Class<?> wildcardClass22 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 18 + "'", int3 == 18);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 56 + "'", int6 == 56);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1313 + "'", int9 == 1313);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1714 + "'", int12 == 1714);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 597 + "'", int15 == 597);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 853 + "'", int18 == 853);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8783 + "'", int21 == 8783);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test5856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5856");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(129, 109);
        int int12 = sumWithoutArithmeticOperators0.getSum(390, 109);
        int int15 = sumWithoutArithmeticOperators0.getSum(11, (int) (short) 0);
        int int18 = sumWithoutArithmeticOperators0.getSum(245, 56);
        int int21 = sumWithoutArithmeticOperators0.getSum(3678, 472);
        int int24 = sumWithoutArithmeticOperators0.getSum(0, 10493);
        int int27 = sumWithoutArithmeticOperators0.getSum(7007, 17475);
        int int30 = sumWithoutArithmeticOperators0.getSum(2716, 3025);
        java.lang.Class<?> wildcardClass31 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 238 + "'", int9 == 238);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 499 + "'", int12 == 499);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 11 + "'", int15 == 11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 301 + "'", int18 == 301);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4150 + "'", int21 == 4150);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10493 + "'", int24 == 10493);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 24482 + "'", int27 == 24482);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 5741 + "'", int30 == 5741);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test5857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5857");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(35, (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 35);
        int int15 = sumWithoutArithmeticOperators0.getSum(352, 375);
        int int18 = sumWithoutArithmeticOperators0.getSum(122, 1327);
        int int21 = sumWithoutArithmeticOperators0.getSum(1376, 1337);
        int int24 = sumWithoutArithmeticOperators0.getSum(1759, 240);
        int int27 = sumWithoutArithmeticOperators0.getSum(6668, 19828);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 727 + "'", int15 == 727);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1449 + "'", int18 == 1449);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2713 + "'", int21 == 2713);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1999 + "'", int24 == 1999);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 26496 + "'", int27 == 26496);
    }

    @Test
    public void test5858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5858");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(10, (int) (byte) 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(2310, 2123);
        int int9 = sumWithoutArithmeticOperators0.getSum(43624, 28374);
        int int12 = sumWithoutArithmeticOperators0.getSum(0, 1763);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4433 + "'", int6 == 4433);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 71998 + "'", int9 == 71998);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1763 + "'", int12 == 1763);
    }

    @Test
    public void test5859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5859");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(110, 376);
        int int12 = sumWithoutArithmeticOperators0.getSum(1172, 3707);
        int int15 = sumWithoutArithmeticOperators0.getSum(1688, 3319);
        int int18 = sumWithoutArithmeticOperators0.getSum(4739, 3133);
        int int21 = sumWithoutArithmeticOperators0.getSum(9710, 0);
        int int24 = sumWithoutArithmeticOperators0.getSum(12564, 13170);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 486 + "'", int9 == 486);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4879 + "'", int12 == 4879);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5007 + "'", int15 == 5007);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 7872 + "'", int18 == 7872);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 9710 + "'", int21 == 9710);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 25734 + "'", int24 == 25734);
    }

    @Test
    public void test5860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5860");
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
        java.lang.Class<?> wildcardClass28 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 17 + "'", int12 == 17);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 226 + "'", int15 == 226);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 51 + "'", int18 == 51);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1411 + "'", int21 == 1411);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1796 + "'", int24 == 1796);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 15491 + "'", int27 == 15491);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test5861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5861");
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
        int int30 = sumWithoutArithmeticOperators0.getSum(8614, 472);
        int int33 = sumWithoutArithmeticOperators0.getSum(650, 0);
        int int36 = sumWithoutArithmeticOperators0.getSum(9795, 3382);
        int int39 = sumWithoutArithmeticOperators0.getSum(955, 11139);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 196 + "'", int15 == 196);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 197 + "'", int18 == 197);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 498 + "'", int21 == 498);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 735 + "'", int24 == 735);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 600 + "'", int27 == 600);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 9086 + "'", int30 == 9086);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 650 + "'", int33 == 650);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 13177 + "'", int36 == 13177);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 12094 + "'", int39 == 12094);
    }

    @Test
    public void test5862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5862");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (short) 100, 34);
        int int12 = sumWithoutArithmeticOperators0.getSum(144, 21);
        int int15 = sumWithoutArithmeticOperators0.getSum(0, 35);
        int int18 = sumWithoutArithmeticOperators0.getSum(210, 36);
        int int21 = sumWithoutArithmeticOperators0.getSum(766, 1168);
        int int24 = sumWithoutArithmeticOperators0.getSum(2136, 697);
        int int27 = sumWithoutArithmeticOperators0.getSum(1725, 5624);
        int int30 = sumWithoutArithmeticOperators0.getSum(3261, 6076);
        int int33 = sumWithoutArithmeticOperators0.getSum(3932, 9139);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 134 + "'", int9 == 134);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 165 + "'", int12 == 165);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 246 + "'", int18 == 246);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1934 + "'", int21 == 1934);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2833 + "'", int24 == 2833);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 7349 + "'", int27 == 7349);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 9337 + "'", int30 == 9337);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 13071 + "'", int33 == 13071);
    }

    @Test
    public void test5863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5863");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 18);
        int int9 = sumWithoutArithmeticOperators0.getSum(36, 160);
        int int12 = sumWithoutArithmeticOperators0.getSum((-1), 108);
        int int15 = sumWithoutArithmeticOperators0.getSum(859, 249);
        int int18 = sumWithoutArithmeticOperators0.getSum(555, 473);
        int int21 = sumWithoutArithmeticOperators0.getSum(0, 863);
        int int24 = sumWithoutArithmeticOperators0.getSum(40575, 22801);
        int int27 = sumWithoutArithmeticOperators0.getSum(29867, 19888);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 18 + "'", int6 == 18);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 196 + "'", int9 == 196);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 107 + "'", int12 == 107);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1108 + "'", int15 == 1108);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1028 + "'", int18 == 1028);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 863 + "'", int21 == 863);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 63376 + "'", int24 == 63376);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 49755 + "'", int27 == 49755);
    }

    @Test
    public void test5864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5864");
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1257 + "'", int33 == 1257);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 6822 + "'", int36 == 6822);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test5865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5865");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 53);
        int int15 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 35);
        int int18 = sumWithoutArithmeticOperators0.getSum(201, 1252);
        int int21 = sumWithoutArithmeticOperators0.getSum(189, 3537);
        java.lang.Class<?> wildcardClass22 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 34 + "'", int15 == 34);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1453 + "'", int18 == 1453);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3726 + "'", int21 == 3726);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test5866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5866");
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
        int int36 = sumWithoutArithmeticOperators0.getSum(2053, 5892);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 7945 + "'", int36 == 7945);
    }

    @Test
    public void test5867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5867");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(686, 1579);
        int int12 = sumWithoutArithmeticOperators0.getSum(8, 1244);
        int int15 = sumWithoutArithmeticOperators0.getSum(597, 9656);
        int int18 = sumWithoutArithmeticOperators0.getSum(10196, 25268);
        java.lang.Class<?> wildcardClass19 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2265 + "'", int9 == 2265);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1252 + "'", int12 == 1252);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10253 + "'", int15 == 10253);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35464 + "'", int18 == 35464);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test5868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5868");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(35, (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 35);
        int int15 = sumWithoutArithmeticOperators0.getSum(53, 36);
        int int18 = sumWithoutArithmeticOperators0.getSum(647, 325);
        int int21 = sumWithoutArithmeticOperators0.getSum(1072, 1761);
        int int24 = sumWithoutArithmeticOperators0.getSum(504, 1056);
        int int27 = sumWithoutArithmeticOperators0.getSum(1384, 10261);
        int int30 = sumWithoutArithmeticOperators0.getSum(0, 14738);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 89 + "'", int15 == 89);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 972 + "'", int18 == 972);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2833 + "'", int21 == 2833);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1560 + "'", int24 == 1560);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 11645 + "'", int27 == 11645);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 14738 + "'", int30 == 14738);
    }

    @Test
    public void test5869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5869");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (short) 1, 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(9, (int) (byte) -1);
        int int15 = sumWithoutArithmeticOperators0.getSum(215, 110);
        int int18 = sumWithoutArithmeticOperators0.getSum(3915, 0);
        int int21 = sumWithoutArithmeticOperators0.getSum(13871, 1245);
        int int24 = sumWithoutArithmeticOperators0.getSum(2647, 13843);
        int int27 = sumWithoutArithmeticOperators0.getSum(20166, 12167);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 325 + "'", int15 == 325);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3915 + "'", int18 == 3915);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 15116 + "'", int21 == 15116);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 16490 + "'", int24 == 16490);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 32333 + "'", int27 == 32333);
    }

    @Test
    public void test5870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5870");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 18);
        int int9 = sumWithoutArithmeticOperators0.getSum(36, 160);
        int int12 = sumWithoutArithmeticOperators0.getSum((-1), 108);
        int int15 = sumWithoutArithmeticOperators0.getSum(9570, 1777);
        int int18 = sumWithoutArithmeticOperators0.getSum(6567, 6567);
        java.lang.Class<?> wildcardClass19 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 18 + "'", int6 == 18);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 196 + "'", int9 == 196);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 107 + "'", int12 == 107);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 11347 + "'", int15 == 11347);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 13134 + "'", int18 == 13134);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test5871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5871");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(163, 36);
        int int12 = sumWithoutArithmeticOperators0.getSum(0, 4208);
        int int15 = sumWithoutArithmeticOperators0.getSum(15514, 2460);
        java.lang.Class<?> wildcardClass16 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 199 + "'", int9 == 199);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4208 + "'", int12 == 4208);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 17974 + "'", int15 == 17974);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test5872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5872");
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
        int int30 = sumWithoutArithmeticOperators0.getSum(19284, 11859);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 84 + "'", int12 == 84);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 144 + "'", int15 == 144);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 163 + "'", int18 == 163);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 7 + "'", int21 == 7);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1653 + "'", int24 == 1653);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2324 + "'", int27 == 2324);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 31143 + "'", int30 == 31143);
    }

    @Test
    public void test5873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5873");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(51, 53);
        int int15 = sumWithoutArithmeticOperators0.getSum(238, (int) '4');
        int int18 = sumWithoutArithmeticOperators0.getSum(455, (int) (short) 0);
        int int21 = sumWithoutArithmeticOperators0.getSum(5169, 575);
        int int24 = sumWithoutArithmeticOperators0.getSum(7392, 10970);
        int int27 = sumWithoutArithmeticOperators0.getSum(791, 18956);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 104 + "'", int12 == 104);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 290 + "'", int15 == 290);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 455 + "'", int18 == 455);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5744 + "'", int21 == 5744);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 18362 + "'", int24 == 18362);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 19747 + "'", int27 == 19747);
    }

    @Test
    public void test5874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5874");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 1, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(21, 11);
        int int15 = sumWithoutArithmeticOperators0.getSum(101, 21);
        int int18 = sumWithoutArithmeticOperators0.getSum(89, 180);
        int int21 = sumWithoutArithmeticOperators0.getSum(199, (int) '4');
        int int24 = sumWithoutArithmeticOperators0.getSum((int) '#', 1133);
        int int27 = sumWithoutArithmeticOperators0.getSum(1169, 6812);
        int int30 = sumWithoutArithmeticOperators0.getSum(4562, 763);
        int int33 = sumWithoutArithmeticOperators0.getSum(22493, 6993);
        int int36 = sumWithoutArithmeticOperators0.getSum(15488, 2595);
        int int39 = sumWithoutArithmeticOperators0.getSum(6756, 3752);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 122 + "'", int15 == 122);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 269 + "'", int18 == 269);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 251 + "'", int21 == 251);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1168 + "'", int24 == 1168);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 7981 + "'", int27 == 7981);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 5325 + "'", int30 == 5325);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 29486 + "'", int33 == 29486);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 18083 + "'", int36 == 18083);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 10508 + "'", int39 == 10508);
    }

    @Test
    public void test5875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5875");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) 0, (int) (short) -1);
        int int15 = sumWithoutArithmeticOperators0.getSum(416, 110);
        int int18 = sumWithoutArithmeticOperators0.getSum(785, 453);
        int int21 = sumWithoutArithmeticOperators0.getSum(2833, 2631);
        java.lang.Class<?> wildcardClass22 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 526 + "'", int15 == 526);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1238 + "'", int18 == 1238);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5464 + "'", int21 == 5464);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test5876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5876");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(0, 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(9, (int) '#');
        int int12 = sumWithoutArithmeticOperators0.getSum(211, 245);
        int int15 = sumWithoutArithmeticOperators0.getSum(382, 32);
        int int18 = sumWithoutArithmeticOperators0.getSum(1168, 1);
        int int21 = sumWithoutArithmeticOperators0.getSum(4323, 3461);
        int int24 = sumWithoutArithmeticOperators0.getSum(2039, 107);
        int int27 = sumWithoutArithmeticOperators0.getSum(3104, 4831);
        int int30 = sumWithoutArithmeticOperators0.getSum(596, 2325);
        int int33 = sumWithoutArithmeticOperators0.getSum(0, 17427);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 152 + "'", int6 == 152);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 44 + "'", int9 == 44);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 456 + "'", int12 == 456);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 414 + "'", int15 == 414);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1169 + "'", int18 == 1169);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 7784 + "'", int21 == 7784);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2146 + "'", int24 == 2146);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 7935 + "'", int27 == 7935);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2921 + "'", int30 == 2921);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 17427 + "'", int33 == 17427);
    }

    @Test
    public void test5877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5877");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 0, 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(104, 266);
        int int15 = sumWithoutArithmeticOperators0.getSum(454, 9920);
        int int18 = sumWithoutArithmeticOperators0.getSum(315, 5734);
        int int21 = sumWithoutArithmeticOperators0.getSum(311, 382);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 370 + "'", int12 == 370);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10374 + "'", int15 == 10374);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6049 + "'", int18 == 6049);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 693 + "'", int21 == 693);
    }

    @Test
    public void test5878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5878");
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
        int int30 = sumWithoutArithmeticOperators0.getSum(122, 2596);
        int int33 = sumWithoutArithmeticOperators0.getSum(11992, 34554);
        int int36 = sumWithoutArithmeticOperators0.getSum(13407, 20449);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 186 + "'", int12 == 186);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 19 + "'", int15 == 19);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 460 + "'", int21 == 460);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 490 + "'", int24 == 490);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 6812 + "'", int27 == 6812);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2718 + "'", int30 == 2718);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 46546 + "'", int33 == 46546);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 33856 + "'", int36 == 33856);
    }

    @Test
    public void test5879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5879");
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
        int int30 = sumWithoutArithmeticOperators0.getSum(461, 5996);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 186 + "'", int12 == 186);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 324 + "'", int15 == 324);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 647 + "'", int18 == 647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1643 + "'", int21 == 1643);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3624 + "'", int24 == 3624);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 7315 + "'", int27 == 7315);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 6457 + "'", int30 == 6457);
    }

    @Test
    public void test5880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5880");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum(1315, 2170);
        int int12 = sumWithoutArithmeticOperators0.getSum(29773, 9900);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3485 + "'", int9 == 3485);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 39673 + "'", int12 == 39673);
    }

    @Test
    public void test5881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5881");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(200, (int) (byte) 0);
        int int9 = sumWithoutArithmeticOperators0.getSum(19940, 1320);
        int int12 = sumWithoutArithmeticOperators0.getSum(39317, 80809);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 200 + "'", int6 == 200);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 21260 + "'", int9 == 21260);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 120126 + "'", int12 == 120126);
    }

    @Test
    public void test5882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5882");
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
        int int30 = sumWithoutArithmeticOperators0.getSum(6167, 22138);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 36 + "'", int15 == 36);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 253 + "'", int18 == 253);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 322 + "'", int21 == 322);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 674 + "'", int24 == 674);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 6436 + "'", int27 == 6436);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 28305 + "'", int30 == 28305);
    }

    @Test
    public void test5883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5883");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(32, (int) '4');
        int int15 = sumWithoutArithmeticOperators0.getSum(1291, 1384);
        int int18 = sumWithoutArithmeticOperators0.getSum(1245, 34346);
        int int21 = sumWithoutArithmeticOperators0.getSum(40568, 15402);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 84 + "'", int12 == 84);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2675 + "'", int15 == 2675);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35591 + "'", int18 == 35591);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 55970 + "'", int21 == 55970);
    }

    @Test
    public void test5884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5884");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) -1, 19);
        int int6 = sumWithoutArithmeticOperators0.getSum(21, 35);
        int int9 = sumWithoutArithmeticOperators0.getSum(859, 454);
        int int12 = sumWithoutArithmeticOperators0.getSum(460, 823);
        int int15 = sumWithoutArithmeticOperators0.getSum(2139, 5334);
        int int18 = sumWithoutArithmeticOperators0.getSum(27867, 21071);
        java.lang.Class<?> wildcardClass19 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 18 + "'", int3 == 18);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 56 + "'", int6 == 56);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1313 + "'", int9 == 1313);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1283 + "'", int12 == 1283);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7473 + "'", int15 == 7473);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 48938 + "'", int18 == 48938);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test5885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5885");
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
        java.lang.Class<?> wildcardClass28 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 294 + "'", int9 == 294);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 260 + "'", int12 == 260);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 117 + "'", int15 == 117);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5691 + "'", int18 == 5691);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10261 + "'", int21 == 10261);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2036 + "'", int24 == 2036);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 39327 + "'", int27 == 39327);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test5886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5886");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(40, 269);
        int int6 = sumWithoutArithmeticOperators0.getSum(202, 523);
        int int9 = sumWithoutArithmeticOperators0.getSum(362, 1680);
        int int12 = sumWithoutArithmeticOperators0.getSum(31514, 1097);
        java.lang.Class<?> wildcardClass13 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 309 + "'", int3 == 309);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 725 + "'", int6 == 725);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2042 + "'", int9 == 2042);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32611 + "'", int12 == 32611);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test5887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5887");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(32, (int) '4');
        int int15 = sumWithoutArithmeticOperators0.getSum(44, 100);
        int int18 = sumWithoutArithmeticOperators0.getSum(217, 238);
        int int21 = sumWithoutArithmeticOperators0.getSum(238, 295);
        int int24 = sumWithoutArithmeticOperators0.getSum(1511, 265);
        int int27 = sumWithoutArithmeticOperators0.getSum(3087, 9222);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 84 + "'", int12 == 84);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 144 + "'", int15 == 144);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 455 + "'", int18 == 455);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 533 + "'", int21 == 533);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1776 + "'", int24 == 1776);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 12309 + "'", int27 == 12309);
    }

    @Test
    public void test5888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5888");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(0, 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(9, (int) '#');
        int int12 = sumWithoutArithmeticOperators0.getSum(211, 245);
        int int15 = sumWithoutArithmeticOperators0.getSum(382, 32);
        int int18 = sumWithoutArithmeticOperators0.getSum(1168, 1);
        int int21 = sumWithoutArithmeticOperators0.getSum(4323, 3461);
        int int24 = sumWithoutArithmeticOperators0.getSum(2039, 107);
        int int27 = sumWithoutArithmeticOperators0.getSum(3104, 4831);
        java.lang.Class<?> wildcardClass28 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 152 + "'", int6 == 152);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 44 + "'", int9 == 44);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 456 + "'", int12 == 456);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 414 + "'", int15 == 414);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1169 + "'", int18 == 1169);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 7784 + "'", int21 == 7784);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2146 + "'", int24 == 2146);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 7935 + "'", int27 == 7935);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test5889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5889");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) -1, 19);
        int int6 = sumWithoutArithmeticOperators0.getSum(21, 35);
        int int9 = sumWithoutArithmeticOperators0.getSum(1121, 708);
        int int12 = sumWithoutArithmeticOperators0.getSum(3445, 1680);
        int int15 = sumWithoutArithmeticOperators0.getSum(116, 1503);
        int int18 = sumWithoutArithmeticOperators0.getSum(2065, 4152);
        int int21 = sumWithoutArithmeticOperators0.getSum(3509, 3722);
        int int24 = sumWithoutArithmeticOperators0.getSum(666, 6732);
        int int27 = sumWithoutArithmeticOperators0.getSum(5007, 18977);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 18 + "'", int3 == 18);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 56 + "'", int6 == 56);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1829 + "'", int9 == 1829);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5125 + "'", int12 == 5125);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1619 + "'", int15 == 1619);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6217 + "'", int18 == 6217);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 7231 + "'", int21 == 7231);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 7398 + "'", int24 == 7398);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 23984 + "'", int27 == 23984);
    }

    @Test
    public void test5890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5890");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) ' ', 35);
        int int6 = sumWithoutArithmeticOperators0.getSum(98, 180);
        int int9 = sumWithoutArithmeticOperators0.getSum(955, 317);
        int int12 = sumWithoutArithmeticOperators0.getSum(1186, 0);
        int int15 = sumWithoutArithmeticOperators0.getSum(612, 7070);
        int int18 = sumWithoutArithmeticOperators0.getSum(3340, 40996);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 67 + "'", int3 == 67);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 278 + "'", int6 == 278);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1272 + "'", int9 == 1272);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1186 + "'", int12 == 1186);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7682 + "'", int15 == 7682);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 44336 + "'", int18 == 44336);
    }

    @Test
    public void test5891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5891");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(21, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(107, 0);
        int int15 = sumWithoutArithmeticOperators0.getSum(289, 555);
        int int18 = sumWithoutArithmeticOperators0.getSum(1926, 4985);
        int int21 = sumWithoutArithmeticOperators0.getSum(29485, 11680);
        int int24 = sumWithoutArithmeticOperators0.getSum(72779, 12664);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 21 + "'", int9 == 21);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 107 + "'", int12 == 107);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 844 + "'", int15 == 844);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6911 + "'", int18 == 6911);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 41165 + "'", int21 == 41165);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 85443 + "'", int24 == 85443);
    }

    @Test
    public void test5892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5892");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int15 = sumWithoutArithmeticOperators0.getSum(859, 321);
        int int18 = sumWithoutArithmeticOperators0.getSum(576, 2810);
        int int21 = sumWithoutArithmeticOperators0.getSum(1231, 1241);
        int int24 = sumWithoutArithmeticOperators0.getSum(53803, 27862);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1180 + "'", int15 == 1180);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3386 + "'", int18 == 3386);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2472 + "'", int21 == 2472);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 81665 + "'", int24 == 81665);
    }

    @Test
    public void test5893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5893");
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
        int int30 = sumWithoutArithmeticOperators0.getSum(0, 4541);
        int int33 = sumWithoutArithmeticOperators0.getSum(9815, 4950);
        int int36 = sumWithoutArithmeticOperators0.getSum(25475, 14213);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 196 + "'", int15 == 196);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 197 + "'", int18 == 197);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 498 + "'", int21 == 498);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 245 + "'", int24 == 245);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 7769 + "'", int27 == 7769);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4541 + "'", int30 == 4541);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 14765 + "'", int33 == 14765);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 39688 + "'", int36 == 39688);
    }

    @Test
    public void test5894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5894");
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
        int int30 = sumWithoutArithmeticOperators0.getSum(2120, 14067);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 152 + "'", int6 == 152);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 44 + "'", int9 == 44);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 215 + "'", int12 == 215);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 200 + "'", int15 == 200);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 942 + "'", int18 == 942);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2639 + "'", int21 == 2639);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4555 + "'", int24 == 4555);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10566 + "'", int27 == 10566);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 16187 + "'", int30 == 16187);
    }

    @Test
    public void test5895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5895");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 1, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(21, 11);
        int int15 = sumWithoutArithmeticOperators0.getSum((int) '#', (int) (short) 1);
        int int18 = sumWithoutArithmeticOperators0.getSum(52, (int) (short) 1);
        int int21 = sumWithoutArithmeticOperators0.getSum(3297, 168);
        int int24 = sumWithoutArithmeticOperators0.getSum(9835, 575);
        int int27 = sumWithoutArithmeticOperators0.getSum(4013, 2094);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 36 + "'", int15 == 36);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 53 + "'", int18 == 53);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3465 + "'", int21 == 3465);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10410 + "'", int24 == 10410);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 6107 + "'", int27 == 6107);
    }

    @Test
    public void test5896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5896");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (short) 100, 34);
        int int12 = sumWithoutArithmeticOperators0.getSum(144, 21);
        int int15 = sumWithoutArithmeticOperators0.getSum(0, 35);
        int int18 = sumWithoutArithmeticOperators0.getSum(210, 36);
        int int21 = sumWithoutArithmeticOperators0.getSum(317, 110);
        int int24 = sumWithoutArithmeticOperators0.getSum(555, 41);
        int int27 = sumWithoutArithmeticOperators0.getSum(5310, 727);
        java.lang.Class<?> wildcardClass28 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 134 + "'", int9 == 134);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 165 + "'", int12 == 165);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 246 + "'", int18 == 246);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 427 + "'", int21 == 427);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 596 + "'", int24 == 596);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 6037 + "'", int27 == 6037);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test5897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5897");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(2590, 66);
        int int6 = sumWithoutArithmeticOperators0.getSum(12566, 2260);
        int int9 = sumWithoutArithmeticOperators0.getSum(7972, 18255);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2656 + "'", int3 == 2656);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 14826 + "'", int6 == 14826);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 26227 + "'", int9 == 26227);
    }

    @Test
    public void test5898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5898");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(32, (int) '4');
        int int15 = sumWithoutArithmeticOperators0.getSum(44, 100);
        int int18 = sumWithoutArithmeticOperators0.getSum(217, 238);
        int int21 = sumWithoutArithmeticOperators0.getSum(199, 427);
        int int24 = sumWithoutArithmeticOperators0.getSum(3564, 11110);
        int int27 = sumWithoutArithmeticOperators0.getSum(4704, 9710);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 84 + "'", int12 == 84);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 144 + "'", int15 == 144);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 455 + "'", int18 == 455);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 626 + "'", int21 == 626);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 14674 + "'", int24 == 14674);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 14414 + "'", int27 == 14414);
    }

    @Test
    public void test5899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5899");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(257, 250);
        int int12 = sumWithoutArithmeticOperators0.getSum(221, 360);
        int int15 = sumWithoutArithmeticOperators0.getSum(885, (int) '#');
        int int18 = sumWithoutArithmeticOperators0.getSum(1236, 3597);
        int int21 = sumWithoutArithmeticOperators0.getSum(8528, 2100);
        int int24 = sumWithoutArithmeticOperators0.getSum(3821, 17943);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 507 + "'", int9 == 507);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 581 + "'", int12 == 581);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 920 + "'", int15 == 920);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4833 + "'", int18 == 4833);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10628 + "'", int21 == 10628);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 21764 + "'", int24 == 21764);
    }

    @Test
    public void test5900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5900");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(10, (int) (byte) 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(321, 56);
        int int9 = sumWithoutArithmeticOperators0.getSum(2824, 7193);
        int int12 = sumWithoutArithmeticOperators0.getSum(5190, 11236);
        java.lang.Class<?> wildcardClass13 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 377 + "'", int6 == 377);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10017 + "'", int9 == 10017);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 16426 + "'", int12 == 16426);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test5901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5901");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(129, 109);
        int int12 = sumWithoutArithmeticOperators0.getSum(390, 109);
        int int15 = sumWithoutArithmeticOperators0.getSum(11, (int) (short) 0);
        int int18 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 35);
        int int21 = sumWithoutArithmeticOperators0.getSum(727, 460);
        int int24 = sumWithoutArithmeticOperators0.getSum(1556, 2767);
        int int27 = sumWithoutArithmeticOperators0.getSum(2743, 3150);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 238 + "'", int9 == 238);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 499 + "'", int12 == 499);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 11 + "'", int15 == 11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 34 + "'", int18 == 34);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1187 + "'", int21 == 1187);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4323 + "'", int24 == 4323);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 5893 + "'", int27 == 5893);
    }

    @Test
    public void test5902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5902");
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
        int int33 = sumWithoutArithmeticOperators0.getSum(10540, 1391);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 11931 + "'", int33 == 11931);
    }

    @Test
    public void test5903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5903");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(250, 195);
        int int9 = sumWithoutArithmeticOperators0.getSum(12513, 1231);
        java.lang.Class<?> wildcardClass10 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 445 + "'", int6 == 445);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 13744 + "'", int9 == 13744);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test5904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5904");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) 0, (int) (short) -1);
        int int15 = sumWithoutArithmeticOperators0.getSum(635, 151);
        int int18 = sumWithoutArithmeticOperators0.getSum(1105, 1121);
        int int21 = sumWithoutArithmeticOperators0.getSum(2049, 975);
        int int24 = sumWithoutArithmeticOperators0.getSum(166, 1375);
        int int27 = sumWithoutArithmeticOperators0.getSum(13070, 8776);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 786 + "'", int15 == 786);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2226 + "'", int18 == 2226);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3024 + "'", int21 == 3024);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1541 + "'", int24 == 1541);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 21846 + "'", int27 == 21846);
    }

    @Test
    public void test5905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5905");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(32, (int) '4');
        int int15 = sumWithoutArithmeticOperators0.getSum(44, 100);
        int int18 = sumWithoutArithmeticOperators0.getSum(110, 53);
        int int21 = sumWithoutArithmeticOperators0.getSum(2597, 6372);
        int int24 = sumWithoutArithmeticOperators0.getSum(8817, 12775);
        int int27 = sumWithoutArithmeticOperators0.getSum(73617, 18109);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 84 + "'", int12 == 84);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 144 + "'", int15 == 144);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 163 + "'", int18 == 163);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8969 + "'", int21 == 8969);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 21592 + "'", int24 == 21592);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 91726 + "'", int27 == 91726);
    }

    @Test
    public void test5906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5906");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(35, (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 35);
        int int15 = sumWithoutArithmeticOperators0.getSum(53, 36);
        int int18 = sumWithoutArithmeticOperators0.getSum(727, 228);
        int int21 = sumWithoutArithmeticOperators0.getSum(416, 5761);
        int int24 = sumWithoutArithmeticOperators0.getSum(0, 695);
        java.lang.Class<?> wildcardClass25 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 89 + "'", int15 == 89);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 955 + "'", int18 == 955);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 6177 + "'", int21 == 6177);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 695 + "'", int24 == 695);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test5907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5907");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) ' ', 35);
        int int6 = sumWithoutArithmeticOperators0.getSum(98, 180);
        int int9 = sumWithoutArithmeticOperators0.getSum(3025, 1245);
        int int12 = sumWithoutArithmeticOperators0.getSum(3412, 246);
        int int15 = sumWithoutArithmeticOperators0.getSum(2229, 101);
        int int18 = sumWithoutArithmeticOperators0.getSum(0, 710);
        int int21 = sumWithoutArithmeticOperators0.getSum(637, 18647);
        int int24 = sumWithoutArithmeticOperators0.getSum(23236, 7545);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 67 + "'", int3 == 67);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 278 + "'", int6 == 278);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4270 + "'", int9 == 4270);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3658 + "'", int12 == 3658);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2330 + "'", int15 == 2330);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 710 + "'", int18 == 710);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 19284 + "'", int21 == 19284);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 30781 + "'", int24 == 30781);
    }

    @Test
    public void test5908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5908");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(32, (int) '4');
        int int15 = sumWithoutArithmeticOperators0.getSum(44, 100);
        int int18 = sumWithoutArithmeticOperators0.getSum(217, 238);
        int int21 = sumWithoutArithmeticOperators0.getSum(0, 978);
        int int24 = sumWithoutArithmeticOperators0.getSum(7962, 1514);
        int int27 = sumWithoutArithmeticOperators0.getSum(20607, 24091);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 84 + "'", int12 == 84);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 144 + "'", int15 == 144);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 455 + "'", int18 == 455);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 978 + "'", int21 == 978);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 9476 + "'", int24 == 9476);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 44698 + "'", int27 == 44698);
    }

    @Test
    public void test5909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5909");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) 0, (int) (short) -1);
        int int15 = sumWithoutArithmeticOperators0.getSum(465, 324);
        int int18 = sumWithoutArithmeticOperators0.getSum(0, 1526);
        int int21 = sumWithoutArithmeticOperators0.getSum(28556, 3614);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 789 + "'", int15 == 789);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1526 + "'", int18 == 1526);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 32170 + "'", int21 == 32170);
    }

    @Test
    public void test5910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5910");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(257, 250);
        int int12 = sumWithoutArithmeticOperators0.getSum(278, 2115);
        int int15 = sumWithoutArithmeticOperators0.getSum(2460, 3949);
        int int18 = sumWithoutArithmeticOperators0.getSum(11329, 20901);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 507 + "'", int9 == 507);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2393 + "'", int12 == 2393);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6409 + "'", int15 == 6409);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32230 + "'", int18 == 32230);
    }

    @Test
    public void test5911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5911");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (short) 100, 34);
        int int12 = sumWithoutArithmeticOperators0.getSum(144, 21);
        int int15 = sumWithoutArithmeticOperators0.getSum(0, 35);
        int int18 = sumWithoutArithmeticOperators0.getSum((-1), 290);
        int int21 = sumWithoutArithmeticOperators0.getSum(170, (int) (byte) 10);
        int int24 = sumWithoutArithmeticOperators0.getSum(8343, 672);
        java.lang.Class<?> wildcardClass25 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 134 + "'", int9 == 134);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 165 + "'", int12 == 165);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 289 + "'", int18 == 289);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 180 + "'", int21 == 180);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 9015 + "'", int24 == 9015);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test5912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5912");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 1, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(18, (int) (byte) -1);
        int int15 = sumWithoutArithmeticOperators0.getSum(9, 217);
        int int18 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 41);
        int int21 = sumWithoutArithmeticOperators0.getSum(290, 1121);
        int int24 = sumWithoutArithmeticOperators0.getSum(699, 1097);
        int int27 = sumWithoutArithmeticOperators0.getSum(988, 725);
        int int30 = sumWithoutArithmeticOperators0.getSum(15478, 3786);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 17 + "'", int12 == 17);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 226 + "'", int15 == 226);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 51 + "'", int18 == 51);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1411 + "'", int21 == 1411);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1796 + "'", int24 == 1796);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1713 + "'", int27 == 1713);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 19264 + "'", int30 == 19264);
    }

    @Test
    public void test5913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5913");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(0, 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(9, (int) '#');
        int int12 = sumWithoutArithmeticOperators0.getSum(211, 245);
        int int15 = sumWithoutArithmeticOperators0.getSum(382, 32);
        int int18 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 1781);
        int int21 = sumWithoutArithmeticOperators0.getSum(3735, 10891);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 152 + "'", int6 == 152);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 44 + "'", int9 == 44);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 456 + "'", int12 == 456);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 414 + "'", int15 == 414);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1781 + "'", int18 == 1781);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 14626 + "'", int21 == 14626);
    }

    @Test
    public void test5914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5914");
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
        int int33 = sumWithoutArithmeticOperators0.getSum(1179, 14213);
        java.lang.Class<?> wildcardClass34 = sumWithoutArithmeticOperators0.getClass();
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 15392 + "'", int33 == 15392);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test5915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5915");
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
        int int36 = sumWithoutArithmeticOperators0.getSum(32417, 3158);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 35575 + "'", int36 == 35575);
    }

    @Test
    public void test5916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5916");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) ' ', 35);
        int int6 = sumWithoutArithmeticOperators0.getSum(98, 180);
        int int9 = sumWithoutArithmeticOperators0.getSum(955, 317);
        int int12 = sumWithoutArithmeticOperators0.getSum(587, 216);
        int int15 = sumWithoutArithmeticOperators0.getSum(3371, 1073);
        int int18 = sumWithoutArithmeticOperators0.getSum(699, 1686);
        java.lang.Class<?> wildcardClass19 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 67 + "'", int3 == 67);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 278 + "'", int6 == 278);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1272 + "'", int9 == 1272);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 803 + "'", int12 == 803);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4444 + "'", int15 == 4444);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2385 + "'", int18 == 2385);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test5917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5917");
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
        int int33 = sumWithoutArithmeticOperators0.getSum(6545, 24463);
        int int36 = sumWithoutArithmeticOperators0.getSum(664, 3758);
        java.lang.Class<?> wildcardClass37 = sumWithoutArithmeticOperators0.getClass();
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 31008 + "'", int33 == 31008);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 4422 + "'", int36 == 4422);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test5918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5918");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (short) 100, 34);
        int int12 = sumWithoutArithmeticOperators0.getSum(144, 21);
        int int15 = sumWithoutArithmeticOperators0.getSum(0, 35);
        int int18 = sumWithoutArithmeticOperators0.getSum((-1), 290);
        int int21 = sumWithoutArithmeticOperators0.getSum(3564, 5352);
        int int24 = sumWithoutArithmeticOperators0.getSum(7277, 1172);
        int int27 = sumWithoutArithmeticOperators0.getSum(1303, 13022);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 134 + "'", int9 == 134);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 165 + "'", int12 == 165);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 289 + "'", int18 == 289);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8916 + "'", int21 == 8916);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 8449 + "'", int24 == 8449);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 14325 + "'", int27 == 14325);
    }

    @Test
    public void test5919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5919");
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
        int int39 = sumWithoutArithmeticOperators0.getSum(17020, 6812);
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 23832 + "'", int39 == 23832);
    }

    @Test
    public void test5920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5920");
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
        int int39 = sumWithoutArithmeticOperators0.getSum(99, 824);
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 923 + "'", int39 == 923);
    }

    @Test
    public void test5921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5921");
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
        int int39 = sumWithoutArithmeticOperators0.getSum(6674, 7429);
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 14103 + "'", int39 == 14103);
    }

    @Test
    public void test5922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5922");
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
        int int36 = sumWithoutArithmeticOperators0.getSum(3741, 19727);
        int int39 = sumWithoutArithmeticOperators0.getSum(13319, 781);
        java.lang.Class<?> wildcardClass40 = sumWithoutArithmeticOperators0.getClass();
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 23468 + "'", int36 == 23468);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 14100 + "'", int39 == 14100);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test5923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5923");
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
        int int30 = sumWithoutArithmeticOperators0.getSum(4859, 6301);
        java.lang.Class<?> wildcardClass31 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 21 + "'", int9 == 21);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 200 + "'", int12 == 200);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1044 + "'", int15 == 1044);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1003 + "'", int18 == 1003);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 612 + "'", int21 == 612);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4152 + "'", int24 == 4152);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 16708 + "'", int27 == 16708);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 11160 + "'", int30 == 11160);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test5924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5924");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(257, 250);
        int int12 = sumWithoutArithmeticOperators0.getSum(221, 360);
        int int15 = sumWithoutArithmeticOperators0.getSum(885, (int) '#');
        int int18 = sumWithoutArithmeticOperators0.getSum(6951, 0);
        int int21 = sumWithoutArithmeticOperators0.getSum(38357, 6993);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 507 + "'", int9 == 507);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 581 + "'", int12 == 581);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 920 + "'", int15 == 920);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6951 + "'", int18 == 6951);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 45350 + "'", int21 == 45350);
    }

    @Test
    public void test5925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5925");
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
        java.lang.Class<?> wildcardClass34 = sumWithoutArithmeticOperators0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test5926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5926");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(21, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(238, 253);
        int int15 = sumWithoutArithmeticOperators0.getSum(683, 1003);
        int int18 = sumWithoutArithmeticOperators0.getSum(974, 2511);
        int int21 = sumWithoutArithmeticOperators0.getSum(2707, 17884);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 21 + "'", int9 == 21);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 491 + "'", int12 == 491);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1686 + "'", int15 == 1686);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3485 + "'", int18 == 3485);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 20591 + "'", int21 == 20591);
    }

    @Test
    public void test5927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5927");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 1, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(21, 11);
        int int15 = sumWithoutArithmeticOperators0.getSum((int) '#', (int) (short) 1);
        int int18 = sumWithoutArithmeticOperators0.getSum(101, 42);
        int int21 = sumWithoutArithmeticOperators0.getSum(885, 3452);
        int int24 = sumWithoutArithmeticOperators0.getSum(6020, 10493);
        int int27 = sumWithoutArithmeticOperators0.getSum(14209, 10914);
        java.lang.Class<?> wildcardClass28 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 36 + "'", int15 == 36);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 143 + "'", int18 == 143);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4337 + "'", int21 == 4337);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 16513 + "'", int24 == 16513);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 25123 + "'", int27 == 25123);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test5928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5928");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(129, 109);
        int int12 = sumWithoutArithmeticOperators0.getSum(390, 109);
        int int15 = sumWithoutArithmeticOperators0.getSum(11, (int) (short) 0);
        int int18 = sumWithoutArithmeticOperators0.getSum(245, 56);
        int int21 = sumWithoutArithmeticOperators0.getSum(3678, 472);
        int int24 = sumWithoutArithmeticOperators0.getSum(0, 10493);
        int int27 = sumWithoutArithmeticOperators0.getSum(7007, 17475);
        int int30 = sumWithoutArithmeticOperators0.getSum(14529, 36256);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 238 + "'", int9 == 238);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 499 + "'", int12 == 499);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 11 + "'", int15 == 11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 301 + "'", int18 == 301);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4150 + "'", int21 == 4150);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10493 + "'", int24 == 10493);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 24482 + "'", int27 == 24482);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 50785 + "'", int30 == 50785);
    }

    @Test
    public void test5929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5929");
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
        int int30 = sumWithoutArithmeticOperators0.getSum(2998, 9985);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 33 + "'", int15 == 33);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 163 + "'", int18 == 163);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 295 + "'", int21 == 295);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 376 + "'", int24 == 376);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 144 + "'", int27 == 144);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 12983 + "'", int30 == 12983);
    }

    @Test
    public void test5930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5930");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 1, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(21, 11);
        int int15 = sumWithoutArithmeticOperators0.getSum(101, 21);
        int int18 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 152);
        int int21 = sumWithoutArithmeticOperators0.getSum(0, 623);
        int int24 = sumWithoutArithmeticOperators0.getSum(1010, 162);
        int int27 = sumWithoutArithmeticOperators0.getSum(2767, 2544);
        int int30 = sumWithoutArithmeticOperators0.getSum(11160, 13683);
        int int33 = sumWithoutArithmeticOperators0.getSum(2750, 9961);
        int int36 = sumWithoutArithmeticOperators0.getSum(18829, 35575);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 122 + "'", int15 == 122);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 162 + "'", int18 == 162);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 623 + "'", int21 == 623);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1172 + "'", int24 == 1172);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 5311 + "'", int27 == 5311);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 24843 + "'", int30 == 24843);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 12711 + "'", int33 == 12711);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 54404 + "'", int36 == 54404);
    }

    @Test
    public void test5931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5931");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (short) 100, 34);
        int int12 = sumWithoutArithmeticOperators0.getSum(144, 21);
        int int15 = sumWithoutArithmeticOperators0.getSum(0, 35);
        int int18 = sumWithoutArithmeticOperators0.getSum(210, 36);
        int int21 = sumWithoutArithmeticOperators0.getSum((int) (short) 1, 6108);
        int int24 = sumWithoutArithmeticOperators0.getSum(15034, 0);
        java.lang.Class<?> wildcardClass25 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 134 + "'", int9 == 134);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 165 + "'", int12 == 165);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 246 + "'", int18 == 246);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 6109 + "'", int21 == 6109);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 15034 + "'", int24 == 15034);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test5932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5932");
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
        int int36 = sumWithoutArithmeticOperators0.getSum(5761, 15853);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 21614 + "'", int36 == 21614);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test5933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5933");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(10, (int) (byte) 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(306, 180);
        int int9 = sumWithoutArithmeticOperators0.getSum(736, 1241);
        int int12 = sumWithoutArithmeticOperators0.getSum(293, 938);
        int int15 = sumWithoutArithmeticOperators0.getSum(2684, 1291);
        int int18 = sumWithoutArithmeticOperators0.getSum(785, 859);
        int int21 = sumWithoutArithmeticOperators0.getSum(18070, 10775);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 486 + "'", int6 == 486);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1977 + "'", int9 == 1977);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1231 + "'", int12 == 1231);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3975 + "'", int15 == 3975);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1644 + "'", int18 == 1644);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 28845 + "'", int21 == 28845);
    }

    @Test
    public void test5934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5934");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) 'a', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum(196, (int) ' ');
        int int15 = sumWithoutArithmeticOperators0.getSum(1133, 269);
        int int18 = sumWithoutArithmeticOperators0.getSum(2339, 285);
        java.lang.Class<?> wildcardClass19 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 98 + "'", int9 == 98);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 228 + "'", int12 == 228);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1402 + "'", int15 == 1402);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2624 + "'", int18 == 2624);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test5935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5935");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 1, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(21, 11);
        int int15 = sumWithoutArithmeticOperators0.getSum(101, 21);
        int int18 = sumWithoutArithmeticOperators0.getSum(89, 180);
        int int21 = sumWithoutArithmeticOperators0.getSum(4506, 6674);
        int int24 = sumWithoutArithmeticOperators0.getSum(20788, 1743);
        int int27 = sumWithoutArithmeticOperators0.getSum(19301, 39688);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 122 + "'", int15 == 122);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 269 + "'", int18 == 269);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 11180 + "'", int21 == 11180);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 22531 + "'", int24 == 22531);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 58989 + "'", int27 == 58989);
    }

    @Test
    public void test5936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5936");
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
        java.lang.Class<?> wildcardClass34 = sumWithoutArithmeticOperators0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test5937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5937");
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
        int int42 = sumWithoutArithmeticOperators0.getSum(194, 166);
        int int45 = sumWithoutArithmeticOperators0.getSum(15048, 7594);
        int int48 = sumWithoutArithmeticOperators0.getSum(6108, 703);
        int int51 = sumWithoutArithmeticOperators0.getSum(7546, 13128);
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
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 360 + "'", int42 == 360);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 22642 + "'", int45 == 22642);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 6811 + "'", int48 == 6811);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 20674 + "'", int51 == 20674);
    }

    @Test
    public void test5938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5938");
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
        int int42 = sumWithoutArithmeticOperators0.getSum(2390, 4061);
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
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 6451 + "'", int42 == 6451);
    }

    @Test
    public void test5939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5939");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (short) 100, 34);
        int int12 = sumWithoutArithmeticOperators0.getSum(144, 21);
        int int15 = sumWithoutArithmeticOperators0.getSum(52, 104);
        int int18 = sumWithoutArithmeticOperators0.getSum(590, 0);
        int int21 = sumWithoutArithmeticOperators0.getSum(1934, 5343);
        int int24 = sumWithoutArithmeticOperators0.getSum(5660, 4037);
        int int27 = sumWithoutArithmeticOperators0.getSum(0, 2279);
        java.lang.Class<?> wildcardClass28 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 134 + "'", int9 == 134);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 165 + "'", int12 == 165);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 156 + "'", int15 == 156);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 590 + "'", int18 == 590);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 7277 + "'", int21 == 7277);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 9697 + "'", int24 == 9697);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2279 + "'", int27 == 2279);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test5940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5940");
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
        int int30 = sumWithoutArithmeticOperators0.getSum(0, 45549);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 134 + "'", int9 == 134);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 165 + "'", int12 == 165);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 246 + "'", int18 == 246);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 427 + "'", int21 == 427);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1814 + "'", int24 == 1814);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4830 + "'", int27 == 4830);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 45549 + "'", int30 == 45549);
    }

    @Test
    public void test5941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5941");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 53);
        int int15 = sumWithoutArithmeticOperators0.getSum(53, 101);
        int int18 = sumWithoutArithmeticOperators0.getSum(416, 911);
        int int21 = sumWithoutArithmeticOperators0.getSum(1748, 1253);
        int int24 = sumWithoutArithmeticOperators0.getSum(25926, 181);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 154 + "'", int15 == 154);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1327 + "'", int18 == 1327);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3001 + "'", int21 == 3001);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 26107 + "'", int24 == 26107);
    }

    @Test
    public void test5942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5942");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 1, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(18, (int) (byte) -1);
        int int15 = sumWithoutArithmeticOperators0.getSum(9, 217);
        int int18 = sumWithoutArithmeticOperators0.getSum(132, 499);
        int int21 = sumWithoutArithmeticOperators0.getSum(0, 179);
        int int24 = sumWithoutArithmeticOperators0.getSum(4562, 7020);
        int int27 = sumWithoutArithmeticOperators0.getSum(19032, 4218);
        int int30 = sumWithoutArithmeticOperators0.getSum(13492, 43285);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 17 + "'", int12 == 17);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 226 + "'", int15 == 226);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 631 + "'", int18 == 631);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 179 + "'", int21 == 179);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 11582 + "'", int24 == 11582);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 23250 + "'", int27 == 23250);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 56777 + "'", int30 == 56777);
    }

    @Test
    public void test5943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5943");
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
        int int30 = sumWithoutArithmeticOperators0.getSum(1555, 1846);
        int int33 = sumWithoutArithmeticOperators0.getSum(453, 8099);
        int int36 = sumWithoutArithmeticOperators0.getSum(5473, 27765);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 84 + "'", int12 == 84);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 144 + "'", int15 == 144);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 163 + "'", int18 == 163);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 7 + "'", int21 == 7);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 724 + "'", int24 == 724);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 627 + "'", int27 == 627);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3401 + "'", int30 == 3401);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 8552 + "'", int33 == 8552);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 33238 + "'", int36 == 33238);
    }

    @Test
    public void test5944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5944");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(32, (int) '4');
        int int15 = sumWithoutArithmeticOperators0.getSum(44, 100);
        int int18 = sumWithoutArithmeticOperators0.getSum(110, 53);
        int int21 = sumWithoutArithmeticOperators0.getSum(162, 321);
        int int24 = sumWithoutArithmeticOperators0.getSum(407, 228);
        int int27 = sumWithoutArithmeticOperators0.getSum(739, (int) (byte) -1);
        int int30 = sumWithoutArithmeticOperators0.getSum(13690, 13390);
        int int33 = sumWithoutArithmeticOperators0.getSum(6750, 12623);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 84 + "'", int12 == 84);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 144 + "'", int15 == 144);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 163 + "'", int18 == 163);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 483 + "'", int21 == 483);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 635 + "'", int24 == 635);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 738 + "'", int27 == 738);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 27080 + "'", int30 == 27080);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 19373 + "'", int33 == 19373);
    }

    @Test
    public void test5945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5945");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 18);
        int int9 = sumWithoutArithmeticOperators0.getSum(36, 160);
        int int12 = sumWithoutArithmeticOperators0.getSum(1623, 760);
        int int15 = sumWithoutArithmeticOperators0.getSum(848, 18794);
        java.lang.Class<?> wildcardClass16 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 18 + "'", int6 == 18);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 196 + "'", int9 == 196);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2383 + "'", int12 == 2383);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 19642 + "'", int15 == 19642);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test5946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5946");
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
        java.lang.Class<?> wildcardClass37 = sumWithoutArithmeticOperators0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test5947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5947");
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
        int int36 = sumWithoutArithmeticOperators0.getSum(1583, 1028);
        int int39 = sumWithoutArithmeticOperators0.getSum(317, 10910);
        int int42 = sumWithoutArithmeticOperators0.getSum(4476, 4690);
        int int45 = sumWithoutArithmeticOperators0.getSum(5677, 33706);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2611 + "'", int36 == 2611);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 11227 + "'", int39 == 11227);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 9166 + "'", int42 == 9166);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 39383 + "'", int45 == 39383);
    }

    @Test
    public void test5948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5948");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, (int) (short) 10);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) '4', 134);
        int int15 = sumWithoutArithmeticOperators0.getSum(162, 162);
        int int18 = sumWithoutArithmeticOperators0.getSum(156, 491);
        int int21 = sumWithoutArithmeticOperators0.getSum(2146, 20035);
        java.lang.Class<?> wildcardClass22 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 186 + "'", int12 == 186);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 324 + "'", int15 == 324);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 647 + "'", int18 == 647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 22181 + "'", int21 == 22181);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test5949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5949");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(35, (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 35);
        int int15 = sumWithoutArithmeticOperators0.getSum(352, 375);
        int int18 = sumWithoutArithmeticOperators0.getSum(122, 1327);
        int int21 = sumWithoutArithmeticOperators0.getSum(1376, 1337);
        int int24 = sumWithoutArithmeticOperators0.getSum(763, 2762);
        int int27 = sumWithoutArithmeticOperators0.getSum(6681, 4434);
        int int30 = sumWithoutArithmeticOperators0.getSum(5312, 0);
        int int33 = sumWithoutArithmeticOperators0.getSum(29294, 32250);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 727 + "'", int15 == 727);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1449 + "'", int18 == 1449);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2713 + "'", int21 == 2713);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3525 + "'", int24 == 3525);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 11115 + "'", int27 == 11115);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 5312 + "'", int30 == 5312);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 61544 + "'", int33 == 61544);
    }

    @Test
    public void test5950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5950");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 1, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(21, 11);
        int int15 = sumWithoutArithmeticOperators0.getSum((int) '#', (int) (short) 1);
        int int18 = sumWithoutArithmeticOperators0.getSum((int) 'a', 156);
        int int21 = sumWithoutArithmeticOperators0.getSum(15733, 2517);
        int int24 = sumWithoutArithmeticOperators0.getSum(12747, 38455);
        int int27 = sumWithoutArithmeticOperators0.getSum(5165, 11492);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 36 + "'", int15 == 36);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 253 + "'", int18 == 253);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 18250 + "'", int21 == 18250);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 51202 + "'", int24 == 51202);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 16657 + "'", int27 == 16657);
    }

    @Test
    public void test5951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5951");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 110);
        int int6 = sumWithoutArithmeticOperators0.getSum(309, 859);
        int int9 = sumWithoutArithmeticOperators0.getSum(974, 652);
        int int12 = sumWithoutArithmeticOperators0.getSum(2758, 9058);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 109 + "'", int3 == 109);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1168 + "'", int6 == 1168);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1626 + "'", int9 == 1626);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 11816 + "'", int12 == 11816);
    }

    @Test
    public void test5952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5952");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(343, 1574);
        int int9 = sumWithoutArithmeticOperators0.getSum(3302, 2343);
        int int12 = sumWithoutArithmeticOperators0.getSum(3292, 8277);
        java.lang.Class<?> wildcardClass13 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1917 + "'", int6 == 1917);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5645 + "'", int9 == 5645);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 11569 + "'", int12 == 11569);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test5953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5953");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum(0, 486);
        int int12 = sumWithoutArithmeticOperators0.getSum(725, 911);
        int int15 = sumWithoutArithmeticOperators0.getSum(724, 1074);
        int int18 = sumWithoutArithmeticOperators0.getSum(6167, 628);
        int int21 = sumWithoutArithmeticOperators0.getSum(18837, 2368);
        int int24 = sumWithoutArithmeticOperators0.getSum(4977, 2284);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 486 + "'", int9 == 486);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1636 + "'", int12 == 1636);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1798 + "'", int15 == 1798);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6795 + "'", int18 == 6795);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 21205 + "'", int21 == 21205);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 7261 + "'", int24 == 7261);
    }

    @Test
    public void test5954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5954");
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
        int int30 = sumWithoutArithmeticOperators0.getSum(0, 34558);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 89 + "'", int15 == 89);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 739 + "'", int18 == 739);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 524 + "'", int21 == 524);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6258 + "'", int24 == 6258);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 11836 + "'", int27 == 11836);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 34558 + "'", int30 == 34558);
    }

    @Test
    public void test5955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5955");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(35, (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 35);
        int int15 = sumWithoutArithmeticOperators0.getSum(53, 36);
        int int18 = sumWithoutArithmeticOperators0.getSum(134, 725);
        int int21 = sumWithoutArithmeticOperators0.getSum(1025, 8855);
        int int24 = sumWithoutArithmeticOperators0.getSum(27132, 5351);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 89 + "'", int15 == 89);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 859 + "'", int18 == 859);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 9880 + "'", int21 == 9880);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 32483 + "'", int24 == 32483);
    }

    @Test
    public void test5956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5956");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (short) 100, 34);
        int int12 = sumWithoutArithmeticOperators0.getSum(144, 21);
        int int15 = sumWithoutArithmeticOperators0.getSum(52, 104);
        int int18 = sumWithoutArithmeticOperators0.getSum(590, 0);
        int int21 = sumWithoutArithmeticOperators0.getSum(942, (int) (short) 100);
        int int24 = sumWithoutArithmeticOperators0.getSum(2713, 974);
        java.lang.Class<?> wildcardClass25 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 134 + "'", int9 == 134);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 165 + "'", int12 == 165);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 156 + "'", int15 == 156);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 590 + "'", int18 == 590);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1042 + "'", int21 == 1042);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3687 + "'", int24 == 3687);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test5957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5957");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(35, (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum(238, 152);
        int int15 = sumWithoutArithmeticOperators0.getSum(245, 162);
        int int18 = sumWithoutArithmeticOperators0.getSum(134, 36);
        int int21 = sumWithoutArithmeticOperators0.getSum(170, 67);
        int int24 = sumWithoutArithmeticOperators0.getSum(2136, 3072);
        int int27 = sumWithoutArithmeticOperators0.getSum(8515, 3528);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 390 + "'", int12 == 390);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 407 + "'", int15 == 407);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 170 + "'", int18 == 170);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 237 + "'", int21 == 237);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5208 + "'", int24 == 5208);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 12043 + "'", int27 == 12043);
    }

    @Test
    public void test5958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5958");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 200);
        int int9 = sumWithoutArithmeticOperators0.getSum(4563, 2426);
        java.lang.Class<?> wildcardClass10 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 210 + "'", int6 == 210);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 6989 + "'", int9 == 6989);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test5959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5959");
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
        int int33 = sumWithoutArithmeticOperators0.getSum(15258, 0);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 15258 + "'", int33 == 15258);
    }

    @Test
    public void test5960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5960");
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
        int int36 = sumWithoutArithmeticOperators0.getSum(14873, 4775);
        int int39 = sumWithoutArithmeticOperators0.getSum(6284, 0);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 19648 + "'", int36 == 19648);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 6284 + "'", int39 == 6284);
    }

    @Test
    public void test5961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5961");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 53);
        int int15 = sumWithoutArithmeticOperators0.getSum(53, 101);
        int int18 = sumWithoutArithmeticOperators0.getSum(209, 107);
        int int21 = sumWithoutArithmeticOperators0.getSum(9569, 3455);
        int int24 = sumWithoutArithmeticOperators0.getSum(3455, 18382);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 154 + "'", int15 == 154);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 316 + "'", int18 == 316);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 13024 + "'", int21 == 13024);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 21837 + "'", int24 == 21837);
    }

    @Test
    public void test5962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5962");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(10, (int) (byte) 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(321, 56);
        int int9 = sumWithoutArithmeticOperators0.getSum(189, 766);
        int int12 = sumWithoutArithmeticOperators0.getSum(290, 21);
        int int15 = sumWithoutArithmeticOperators0.getSum(407, 847);
        int int18 = sumWithoutArithmeticOperators0.getSum(453, 2368);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 377 + "'", int6 == 377);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 955 + "'", int9 == 955);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 311 + "'", int12 == 311);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1254 + "'", int15 == 1254);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2821 + "'", int18 == 2821);
    }

    @Test
    public void test5963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5963");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(35, (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 35);
        int int15 = sumWithoutArithmeticOperators0.getSum(53, 36);
        int int18 = sumWithoutArithmeticOperators0.getSum(647, 325);
        int int21 = sumWithoutArithmeticOperators0.getSum(2924, 11086);
        int int24 = sumWithoutArithmeticOperators0.getSum(4671, 3329);
        java.lang.Class<?> wildcardClass25 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 89 + "'", int15 == 89);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 972 + "'", int18 == 972);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 14010 + "'", int21 == 14010);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 8000 + "'", int24 == 8000);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test5964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5964");
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
        java.lang.Class<?> wildcardClass34 = sumWithoutArithmeticOperators0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test5965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5965");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (short) 100, 34);
        int int12 = sumWithoutArithmeticOperators0.getSum(144, 21);
        int int15 = sumWithoutArithmeticOperators0.getSum(52, 104);
        int int18 = sumWithoutArithmeticOperators0.getSum(590, 0);
        int int21 = sumWithoutArithmeticOperators0.getSum(10745, 1148);
        int int24 = sumWithoutArithmeticOperators0.getSum(645, 237);
        java.lang.Class<?> wildcardClass25 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 134 + "'", int9 == 134);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 165 + "'", int12 == 165);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 156 + "'", int15 == 156);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 590 + "'", int18 == 590);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 11893 + "'", int21 == 11893);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 882 + "'", int24 == 882);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test5966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5966");
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
        int int39 = sumWithoutArithmeticOperators0.getSum(3504, 6878);
        int int42 = sumWithoutArithmeticOperators0.getSum(11327, 10833);
        java.lang.Class<?> wildcardClass43 = sumWithoutArithmeticOperators0.getClass();
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 10382 + "'", int39 == 10382);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 22160 + "'", int42 == 22160);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test5967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5967");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(129, 109);
        int int12 = sumWithoutArithmeticOperators0.getSum(390, 109);
        int int15 = sumWithoutArithmeticOperators0.getSum(266, 2767);
        int int18 = sumWithoutArithmeticOperators0.getSum(9931, 0);
        java.lang.Class<?> wildcardClass19 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 238 + "'", int9 == 238);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 499 + "'", int12 == 499);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3033 + "'", int15 == 3033);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9931 + "'", int18 == 9931);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test5968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5968");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 1, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(18, (int) (byte) -1);
        int int15 = sumWithoutArithmeticOperators0.getSum(526, 727);
        int int18 = sumWithoutArithmeticOperators0.getSum(1967, 810);
        int int21 = sumWithoutArithmeticOperators0.getSum(1480, 1636);
        int int24 = sumWithoutArithmeticOperators0.getSum(170, 1373);
        int int27 = sumWithoutArithmeticOperators0.getSum(34846, 1143);
        int int30 = sumWithoutArithmeticOperators0.getSum(8197, 1967);
        java.lang.Class<?> wildcardClass31 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 17 + "'", int12 == 17);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1253 + "'", int15 == 1253);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2777 + "'", int18 == 2777);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3116 + "'", int21 == 3116);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1543 + "'", int24 == 1543);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 35989 + "'", int27 == 35989);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10164 + "'", int30 == 10164);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test5969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5969");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 18);
        int int9 = sumWithoutArithmeticOperators0.getSum(36, 160);
        int int12 = sumWithoutArithmeticOperators0.getSum(686, 2696);
        int int15 = sumWithoutArithmeticOperators0.getSum(2810, 5491);
        int int18 = sumWithoutArithmeticOperators0.getSum(835, 16007);
        int int21 = sumWithoutArithmeticOperators0.getSum(2683, 2596);
        int int24 = sumWithoutArithmeticOperators0.getSum(9415, 1859);
        int int27 = sumWithoutArithmeticOperators0.getSum(56777, 7883);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 18 + "'", int6 == 18);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 196 + "'", int9 == 196);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3382 + "'", int12 == 3382);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8301 + "'", int15 == 8301);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 16842 + "'", int18 == 16842);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5279 + "'", int21 == 5279);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 11274 + "'", int24 == 11274);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 64660 + "'", int27 == 64660);
    }

    @Test
    public void test5970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5970");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, (int) (short) 10);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) '4', 134);
        int int15 = sumWithoutArithmeticOperators0.getSum(162, 162);
        int int18 = sumWithoutArithmeticOperators0.getSum(156, 491);
        int int21 = sumWithoutArithmeticOperators0.getSum(4742, 1097);
        int int24 = sumWithoutArithmeticOperators0.getSum(2762, 5755);
        int int27 = sumWithoutArithmeticOperators0.getSum(38399, 17336);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 186 + "'", int12 == 186);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 324 + "'", int15 == 324);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 647 + "'", int18 == 647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5839 + "'", int21 == 5839);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 8517 + "'", int24 == 8517);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 55735 + "'", int27 == 55735);
    }

    @Test
    public void test5971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5971");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, 98);
        int int9 = sumWithoutArithmeticOperators0.getSum(1281, 246);
        int int12 = sumWithoutArithmeticOperators0.getSum(1762, 1690);
        int int15 = sumWithoutArithmeticOperators0.getSum(98, 2527);
        int int18 = sumWithoutArithmeticOperators0.getSum(3452, 3577);
        int int21 = sumWithoutArithmeticOperators0.getSum(29638, 4079);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 108 + "'", int6 == 108);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1527 + "'", int9 == 1527);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3452 + "'", int12 == 3452);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2625 + "'", int15 == 2625);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 7029 + "'", int18 == 7029);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 33717 + "'", int21 == 33717);
    }

    @Test
    public void test5972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5972");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 1, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(21, 11);
        int int15 = sumWithoutArithmeticOperators0.getSum(0, 34);
        int int18 = sumWithoutArithmeticOperators0.getSum(254, 269);
        int int21 = sumWithoutArithmeticOperators0.getSum(942, 33);
        int int24 = sumWithoutArithmeticOperators0.getSum(998, 0);
        java.lang.Class<?> wildcardClass25 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 34 + "'", int15 == 34);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 523 + "'", int18 == 523);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 975 + "'", int21 == 975);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 998 + "'", int24 == 998);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test5973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5973");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(0, 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(1174, 2363);
        int int9 = sumWithoutArithmeticOperators0.getSum(184, 3406);
        int int12 = sumWithoutArithmeticOperators0.getSum(54, 5096);
        int int15 = sumWithoutArithmeticOperators0.getSum(16761, 9703);
        java.lang.Class<?> wildcardClass16 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3537 + "'", int6 == 3537);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3590 + "'", int9 == 3590);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5150 + "'", int12 == 5150);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 26464 + "'", int15 == 26464);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test5974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5974");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(345, 269);
        int int9 = sumWithoutArithmeticOperators0.getSum(2456, 3564);
        int int12 = sumWithoutArithmeticOperators0.getSum(483, 14209);
        int int15 = sumWithoutArithmeticOperators0.getSum(12742, 65019);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 614 + "'", int6 == 614);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 6020 + "'", int9 == 6020);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 14692 + "'", int12 == 14692);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 77761 + "'", int15 == 77761);
    }

    @Test
    public void test5975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5975");
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
        int int30 = sumWithoutArithmeticOperators0.getSum(19747, 1503);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 154 + "'", int15 == 154);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 316 + "'", int18 == 316);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3757 + "'", int21 == 3757);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3346 + "'", int24 == 3346);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 6671 + "'", int27 == 6671);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 21250 + "'", int30 == 21250);
    }

    @Test
    public void test5976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5976");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(0, 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(9, (int) '#');
        int int12 = sumWithoutArithmeticOperators0.getSum(211, 245);
        int int15 = sumWithoutArithmeticOperators0.getSum(697, 290);
        int int18 = sumWithoutArithmeticOperators0.getSum(5691, 201);
        int int21 = sumWithoutArithmeticOperators0.getSum(1121, 1133);
        java.lang.Class<?> wildcardClass22 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 152 + "'", int6 == 152);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 44 + "'", int9 == 44);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 456 + "'", int12 == 456);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 987 + "'", int15 == 987);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5892 + "'", int18 == 5892);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2254 + "'", int21 == 2254);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test5977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5977");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(0, 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, (int) (short) 10);
        int int12 = sumWithoutArithmeticOperators0.getSum(6674, 249);
        int int15 = sumWithoutArithmeticOperators0.getSum(6912, 26761);
        java.lang.Class<?> wildcardClass16 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 152 + "'", int6 == 152);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6923 + "'", int12 == 6923);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 33673 + "'", int15 == 33673);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test5978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5978");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(19, 21);
        int int9 = sumWithoutArithmeticOperators0.getSum(53, 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(286, 125);
        int int15 = sumWithoutArithmeticOperators0.getSum(295, 325);
        int int18 = sumWithoutArithmeticOperators0.getSum(905, 407);
        int int21 = sumWithoutArithmeticOperators0.getSum(84, 1536);
        java.lang.Class<?> wildcardClass22 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 40 + "'", int6 == 40);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 411 + "'", int12 == 411);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 620 + "'", int15 == 620);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1312 + "'", int18 == 1312);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1620 + "'", int21 == 1620);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test5979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5979");
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
        java.lang.Class<?> wildcardClass43 = sumWithoutArithmeticOperators0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test5980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5980");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(0, 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(162, 35);
        int int9 = sumWithoutArithmeticOperators0.getSum(905, 302);
        int int12 = sumWithoutArithmeticOperators0.getSum(0, 844);
        int int15 = sumWithoutArithmeticOperators0.getSum(896, 1294);
        int int18 = sumWithoutArithmeticOperators0.getSum(7873, 39713);
        java.lang.Class<?> wildcardClass19 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 197 + "'", int6 == 197);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1207 + "'", int9 == 1207);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 844 + "'", int12 == 844);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2190 + "'", int15 == 2190);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 47586 + "'", int18 == 47586);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test5981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5981");
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
        int int39 = sumWithoutArithmeticOperators0.getSum(211, 0);
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 211 + "'", int39 == 211);
    }

    @Test
    public void test5982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5982");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 1, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(21, 11);
        int int15 = sumWithoutArithmeticOperators0.getSum(101, 21);
        int int18 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 152);
        int int21 = sumWithoutArithmeticOperators0.getSum(210, 0);
        int int24 = sumWithoutArithmeticOperators0.getSum(2563, 539);
        int int27 = sumWithoutArithmeticOperators0.getSum(33498, 20747);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 122 + "'", int15 == 122);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 162 + "'", int18 == 162);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 210 + "'", int21 == 210);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3102 + "'", int24 == 3102);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 54245 + "'", int27 == 54245);
    }

    @Test
    public void test5983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5983");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum(14300, 101);
        int int15 = sumWithoutArithmeticOperators0.getSum(15751, 9762);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 14401 + "'", int12 == 14401);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 25513 + "'", int15 == 25513);
    }

    @Test
    public void test5984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5984");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) 0, (int) (short) -1);
        int int15 = sumWithoutArithmeticOperators0.getSum(635, 151);
        int int18 = sumWithoutArithmeticOperators0.getSum(734, 3577);
        int int21 = sumWithoutArithmeticOperators0.getSum(3291, 110);
        int int24 = sumWithoutArithmeticOperators0.getSum(0, 22181);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 786 + "'", int15 == 786);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4311 + "'", int18 == 4311);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3401 + "'", int21 == 3401);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 22181 + "'", int24 == 22181);
    }

    @Test
    public void test5985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5985");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(0, 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(162, 35);
        int int9 = sumWithoutArithmeticOperators0.getSum(905, 302);
        int int12 = sumWithoutArithmeticOperators0.getSum(0, 844);
        int int15 = sumWithoutArithmeticOperators0.getSum(12283, 18599);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 197 + "'", int6 == 197);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1207 + "'", int9 == 1207);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 844 + "'", int12 == 844);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 30882 + "'", int15 == 30882);
    }

    @Test
    public void test5986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5986");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (short) 100, 34);
        int int12 = sumWithoutArithmeticOperators0.getSum(144, 21);
        int int15 = sumWithoutArithmeticOperators0.getSum(44, 210);
        int int18 = sumWithoutArithmeticOperators0.getSum(199, (int) (byte) 10);
        int int21 = sumWithoutArithmeticOperators0.getSum(9337, 8766);
        int int24 = sumWithoutArithmeticOperators0.getSum(30352, 3537);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 134 + "'", int9 == 134);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 165 + "'", int12 == 165);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 254 + "'", int15 == 254);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 209 + "'", int18 == 209);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 18103 + "'", int21 == 18103);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 33889 + "'", int24 == 33889);
    }

    @Test
    public void test5987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5987");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(0, 199);
        int int12 = sumWithoutArithmeticOperators0.getSum(324, 614);
        int int15 = sumWithoutArithmeticOperators0.getSum(1238, 1072);
        int int18 = sumWithoutArithmeticOperators0.getSum(1840, 2119);
        int int21 = sumWithoutArithmeticOperators0.getSum(0, 5622);
        int int24 = sumWithoutArithmeticOperators0.getSum(830, 3733);
        int int27 = sumWithoutArithmeticOperators0.getSum(12726, 23677);
        java.lang.Class<?> wildcardClass28 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 199 + "'", int9 == 199);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 938 + "'", int12 == 938);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2310 + "'", int15 == 2310);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3959 + "'", int18 == 3959);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5622 + "'", int21 == 5622);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4563 + "'", int24 == 4563);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 36403 + "'", int27 == 36403);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test5988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5988");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (short) 100, 34);
        int int12 = sumWithoutArithmeticOperators0.getSum(144, 21);
        int int15 = sumWithoutArithmeticOperators0.getSum(0, 35);
        int int18 = sumWithoutArithmeticOperators0.getSum(210, 36);
        int int21 = sumWithoutArithmeticOperators0.getSum(766, 1168);
        int int24 = sumWithoutArithmeticOperators0.getSum(2464, 620);
        int int27 = sumWithoutArithmeticOperators0.getSum(1206, 7981);
        int int30 = sumWithoutArithmeticOperators0.getSum(28108, 9961);
        int int33 = sumWithoutArithmeticOperators0.getSum(9078, 13247);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 134 + "'", int9 == 134);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 165 + "'", int12 == 165);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 246 + "'", int18 == 246);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1934 + "'", int21 == 1934);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3084 + "'", int24 == 3084);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 9187 + "'", int27 == 9187);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 38069 + "'", int30 == 38069);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 22325 + "'", int33 == 22325);
    }

    @Test
    public void test5989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5989");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int15 = sumWithoutArithmeticOperators0.getSum(859, 321);
        int int18 = sumWithoutArithmeticOperators0.getSum(209, 213);
        int int21 = sumWithoutArithmeticOperators0.getSum(98, 533);
        int int24 = sumWithoutArithmeticOperators0.getSum(4075, 9608);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1180 + "'", int15 == 1180);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 422 + "'", int18 == 422);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 631 + "'", int21 == 631);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 13683 + "'", int24 == 13683);
    }

    @Test
    public void test5990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5990");
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
        int int30 = sumWithoutArithmeticOperators0.getSum(14699, 2060);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 16759 + "'", int30 == 16759);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test5991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5991");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((-1), 35);
        int int15 = sumWithoutArithmeticOperators0.getSum(163, 17);
        int int18 = sumWithoutArithmeticOperators0.getSum(150, 416);
        int int21 = sumWithoutArithmeticOperators0.getSum(7, 465);
        int int24 = sumWithoutArithmeticOperators0.getSum(22858, 4157);
        int int27 = sumWithoutArithmeticOperators0.getSum(13870, 10470);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 180 + "'", int15 == 180);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 566 + "'", int18 == 566);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 472 + "'", int21 == 472);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 27015 + "'", int24 == 27015);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 24340 + "'", int27 == 24340);
    }

    @Test
    public void test5992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5992");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(0, 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(10, (int) (byte) 100);
        int int12 = sumWithoutArithmeticOperators0.getSum(260, 195);
        int int15 = sumWithoutArithmeticOperators0.getSum(316, 1491);
        int int18 = sumWithoutArithmeticOperators0.getSum(998, 542);
        int int21 = sumWithoutArithmeticOperators0.getSum(959, 473);
        int int24 = sumWithoutArithmeticOperators0.getSum(28664, 31092);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 152 + "'", int6 == 152);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 455 + "'", int12 == 455);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1807 + "'", int15 == 1807);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1540 + "'", int18 == 1540);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1432 + "'", int21 == 1432);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 59756 + "'", int24 == 59756);
    }

    @Test
    public void test5993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5993");
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
        int int30 = sumWithoutArithmeticOperators0.getSum(19846, 10864);
        java.lang.Class<?> wildcardClass31 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 98 + "'", int9 == 98);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 561 + "'", int12 == 561);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1164 + "'", int15 == 1164);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4950 + "'", int18 == 4950);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 6909 + "'", int21 == 6909);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 9415 + "'", int24 == 9415);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4750 + "'", int27 == 4750);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 30710 + "'", int30 == 30710);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test5994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5994");
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 8467 + "'", int30 == 8467);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 24463 + "'", int33 == 24463);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test5995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5995");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum(0, 486);
        int int12 = sumWithoutArithmeticOperators0.getSum(1343, 0);
        int int15 = sumWithoutArithmeticOperators0.getSum(938, 266);
        int int18 = sumWithoutArithmeticOperators0.getSum(76, 316);
        int int21 = sumWithoutArithmeticOperators0.getSum(13480, 983);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 486 + "'", int9 == 486);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1343 + "'", int12 == 1343);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1204 + "'", int15 == 1204);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 392 + "'", int18 == 392);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 14463 + "'", int21 == 14463);
    }

    @Test
    public void test5996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5996");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(35, (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum(238, 152);
        int int15 = sumWithoutArithmeticOperators0.getSum(245, 162);
        int int18 = sumWithoutArithmeticOperators0.getSum(134, 36);
        int int21 = sumWithoutArithmeticOperators0.getSum(180, 421);
        int int24 = sumWithoutArithmeticOperators0.getSum(4879, 0);
        int int27 = sumWithoutArithmeticOperators0.getSum(54573, 4562);
        java.lang.Class<?> wildcardClass28 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 390 + "'", int12 == 390);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 407 + "'", int15 == 407);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 170 + "'", int18 == 170);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 601 + "'", int21 == 601);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4879 + "'", int24 == 4879);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 59135 + "'", int27 == 59135);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test5997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5997");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum(0, 168);
        int int12 = sumWithoutArithmeticOperators0.getSum(617, 0);
        int int15 = sumWithoutArithmeticOperators0.getSum(18214, 2053);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 168 + "'", int9 == 168);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 617 + "'", int12 == 617);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 20267 + "'", int15 == 20267);
    }

    @Test
    public void test5998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5998");
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
        int int39 = sumWithoutArithmeticOperators0.getSum(18069, 22531);
        int int42 = sumWithoutArithmeticOperators0.getSum(34595, 25657);
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 40600 + "'", int39 == 40600);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 60252 + "'", int42 == 60252);
    }

    @Test
    public void test5999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5999");
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
        int int30 = sumWithoutArithmeticOperators0.getSum(4077, 4838);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3889 + "'", int18 == 3889);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4647 + "'", int21 == 4647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3555 + "'", int24 == 3555);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 11009 + "'", int27 == 11009);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 8915 + "'", int30 == 8915);
    }

    @Test
    public void test6000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test6000");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (short) 1, 89);
        int int12 = sumWithoutArithmeticOperators0.getSum(1023, 665);
        int int15 = sumWithoutArithmeticOperators0.getSum(202, 9193);
        int int18 = sumWithoutArithmeticOperators0.getSum(7029, 600);
        int int21 = sumWithoutArithmeticOperators0.getSum(14476, 4171);
        java.lang.Class<?> wildcardClass22 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 90 + "'", int9 == 90);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1688 + "'", int12 == 1688);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9395 + "'", int15 == 9395);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 7629 + "'", int18 == 7629);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 18647 + "'", int21 == 18647);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }
}

