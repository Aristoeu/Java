package JosephusProblem;

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
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(7, 78);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(44, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(73, 12);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(78, 48);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 63 + "'", int2 == 63);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(60, 71);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 54 + "'", int2 == 54);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(28, (-40));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-5) + "'", int2 == (-5));
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(15, 87);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(50, 40);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 42 + "'", int2 == 42);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(26, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(88, (-47));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-29) + "'", int2 == (-29));
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(78, (-34));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-58) + "'", int2 == (-58));
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(41, (-41));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-11) + "'", int2 == (-11));
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(46, 50);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 39 + "'", int2 == 39);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(29, 19);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(45, (-5));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-39) + "'", int2 == (-39));
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(87, 12);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 18 + "'", int2 == 18);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) (short) 10, 29);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner((int) (byte) 10, 22);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(25, 48);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 11 + "'", int2 == 11);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(8, (-28));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-6) + "'", int2 == (-6));
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(45, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 45 + "'", int2 == 45);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(73, 46);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 47 + "'", int2 == 47);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(65, 30);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 34 + "'", int2 == 34);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(75, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-73) + "'", int2 == (-73));
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(14, (-37));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-9) + "'", int2 == (-9));
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(96, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 95 + "'", int2 == 95);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(8, 23);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(48, (-66));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2) + "'", int2 == (-2));
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(63, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 55 + "'", int2 == 55);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(1, 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(57, (-66));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-10) + "'", int2 == (-10));
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(95, (-13));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(65, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 65 + "'", int2 == 65);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(53, 94);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) (short) 100, (-22));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-44) + "'", int2 == (-44));
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(80, 73);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 62 + "'", int2 == 62);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(7, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(80, (-14));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-73) + "'", int2 == (-73));
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(51, (-52));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-39) + "'", int2 == (-39));
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(16, 54);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(52, 66);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 12 + "'", int2 == 12);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(80, (-2));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-31) + "'", int2 == (-31));
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(71, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(34, 98);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 11 + "'", int2 == 11);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(81, (-54));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-52) + "'", int2 == (-52));
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(49, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 38 + "'", int2 == 38);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(91, (-57));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-61) + "'", int2 == (-61));
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(9, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(53, (-81));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-31) + "'", int2 == (-31));
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(81, 29);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 66 + "'", int2 == 66);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) (short) 1, (-66));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(19, 58);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 17 + "'", int2 == 17);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(28, (-47));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-16) + "'", int2 == (-16));
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(31, (-9));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-28) + "'", int2 == (-28));
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(21, (-40));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner((int) ' ', (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 26 + "'", int2 == 26);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(81, (-3));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-32) + "'", int2 == (-32));
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(52, (-44));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-25) + "'", int2 == (-25));
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(72, 63);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 55 + "'", int2 == 55);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(65, 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 13 + "'", int2 == 13);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(44, 95);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(33, (-27));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(65, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(7, 44);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(55, (-66));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-48) + "'", int2 == (-48));
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(99, (-44));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-32) + "'", int2 == (-32));
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(7, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(4, 40);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(70, 51);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(44, (-12));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-20) + "'", int2 == (-20));
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(12, (-55));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(42, 39);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 23 + "'", int2 == 23);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(87, (-52));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-6) + "'", int2 == (-6));
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(2, 60);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(38, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 36 + "'", int2 == 36);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(8, 3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(9, (-83));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(73, 60);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 31 + "'", int2 == 31);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(18, 95);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(25, 59);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(92, 43);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 57 + "'", int2 == 57);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(4, (-29));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(53, 89);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 18 + "'", int2 == 18);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(32, (-47));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-22) + "'", int2 == (-22));
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(98, (-30));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-54) + "'", int2 == (-54));
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(12, 58);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(45, (-60));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-43) + "'", int2 == (-43));
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(50, (-95));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-5) + "'", int2 == (-5));
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner((int) ' ', 85);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 21 + "'", int2 == 21);
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(38, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 38 + "'", int2 == 38);
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(15, (-55));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-13) + "'", int2 == (-13));
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner((int) 'a', (-24));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-54) + "'", int2 == (-54));
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(78, 55);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 29 + "'", int2 == 29);
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) (short) 10, 56);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(81, (-52));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-33) + "'", int2 == (-33));
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(35, (-24));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-26) + "'", int2 == (-26));
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(57, 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 39 + "'", int2 == 39);
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(6, (-59));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(18, (-31));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-4) + "'", int2 == (-4));
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(60, (-13));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-20) + "'", int2 == (-20));
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(6, (-52));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(65, 93);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 13 + "'", int2 == 13);
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(39, (-41));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-11) + "'", int2 == (-11));
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(3, (-89));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(32, (-2));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(20, 34);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 14 + "'", int2 == 14);
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(52, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-50) + "'", int2 == (-50));
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(48, (-8));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-24) + "'", int2 == (-24));
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(15, (-47));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-4) + "'", int2 == (-4));
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) (byte) 100, 45);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 78 + "'", int2 == 78);
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(75, (-6));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-6) + "'", int2 == (-6));
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(71, (-48));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-24) + "'", int2 == (-24));
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(54, 59);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 33 + "'", int2 == 33);
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(37, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(36, 43);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(55, 3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 26 + "'", int2 == 26);
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(3, (-82));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(71, 98);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 29 + "'", int2 == 29);
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(53, (-84));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-41) + "'", int2 == (-41));
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(59, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(59, (-45));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-25) + "'", int2 == (-25));
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(51, 78);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 23 + "'", int2 == 23);
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(38, (-5));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-4) + "'", int2 == (-4));
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(20, 13);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 16 + "'", int2 == 16);
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(73, 96);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 45 + "'", int2 == 45);
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(37, 60);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 16 + "'", int2 == 16);
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(28, (-4));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-25) + "'", int2 == (-25));
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(27, (-60));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-26) + "'", int2 == (-26));
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) '#', (-89));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) (short) 100, (-74));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-18) + "'", int2 == (-18));
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(92, (-55));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-28) + "'", int2 == (-28));
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(38, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(46, (-44));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-9) + "'", int2 == (-9));
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(54, 55);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 25 + "'", int2 == 25);
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(49, 39);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20 + "'", int2 == 20);
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(90, (-20));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(95, (-67));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-44) + "'", int2 == (-44));
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(98, 16);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 43 + "'", int2 == 43);
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(88, (-62));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-25) + "'", int2 == (-25));
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(87, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 87 + "'", int2 == 87);
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(53, (-5));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-33) + "'", int2 == (-33));
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(95, (-77));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-87) + "'", int2 == (-87));
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(30, (-3));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-27) + "'", int2 == (-27));
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(33, 49);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(93, (-35));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-29) + "'", int2 == (-29));
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(87, (-89));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-72) + "'", int2 == (-72));
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(67, 2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(32, 31);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 16 + "'", int2 == 16);
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(57, (-11));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-31) + "'", int2 == (-31));
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(54, 45);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 29 + "'", int2 == 29);
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(34, 39);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 18 + "'", int2 == 18);
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(71, 6);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 56 + "'", int2 == 56);
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(85, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(99, (-17));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-34) + "'", int2 == (-34));
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(70, (-96));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-44) + "'", int2 == (-44));
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(13, (-35));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-7) + "'", int2 == (-7));
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(11, (-60));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(51, (-5));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-22) + "'", int2 == (-22));
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(81, (-54));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-51) + "'", int2 == (-51));
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(78, 39);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 14 + "'", int2 == 14);
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(46, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 43 + "'", int2 == 43);
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(91, (-70));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-77) + "'", int2 == (-77));
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(20, 60);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(35, (-47));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-27) + "'", int2 == (-27));
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(65, (-28));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) (short) 10, 46);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(78, (-21));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-14) + "'", int2 == (-14));
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(24, 44);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(49, 23);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 33 + "'", int2 == 33);
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner((int) '4', 8);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(95, (-22));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-33) + "'", int2 == (-33));
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(2, (-39));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2173");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(10, (-42));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-5) + "'", int2 == (-5));
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(7, 87);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(49, 78);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 19 + "'", int2 == 19);
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(32, (-34));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-5) + "'", int2 == (-5));
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(17, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 17 + "'", int2 == 17);
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2178");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(69, 57);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(42, 95);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 34 + "'", int2 == 34);
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2180");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(47, 53);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 45 + "'", int2 == 45);
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(75, 22);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 24 + "'", int2 == 24);
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(19, 65);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2183");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(43, (-14));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-26) + "'", int2 == (-26));
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2184");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(5, (-40));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2185");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(25, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2186");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(22, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 21 + "'", int2 == 21);
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2187");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(55, (-15));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-43) + "'", int2 == (-43));
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2188");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(89, 81);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2189");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) (short) 100, (-42));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-23) + "'", int2 == (-23));
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2190");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(45, (-26));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-11) + "'", int2 == (-11));
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2191");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(27, (-24));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-20) + "'", int2 == (-20));
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2192");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner((int) (byte) 1, 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2193");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(61, 17);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 25 + "'", int2 == 25);
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2194");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(17, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-16) + "'", int2 == (-16));
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2195");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(59, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2196");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(78, 70);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2197");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(17, (-10));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-9) + "'", int2 == (-9));
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2198");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(7, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2199");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(81, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2200");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(22, (-36));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-8) + "'", int2 == (-8));
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2201");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(31, (-65));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-30) + "'", int2 == (-30));
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2202");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(58, 59);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 44 + "'", int2 == 44);
    }

    @Test
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2203");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(91, (-15));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2204");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(24, 67);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 23 + "'", int2 == 23);
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2205");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(23, (-16));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2) + "'", int2 == (-2));
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2206");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(81, (-17));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2207");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) ' ', (-7));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2208");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(65, 29);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 37 + "'", int2 == 37);
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2209");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(40, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 25 + "'", int2 == 25);
    }

    @Test
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2210");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(14, 50);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2211");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(49, 69);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 31 + "'", int2 == 31);
    }

    @Test
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2212");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(9, (-8));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2213");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(81, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 80 + "'", int2 == 80);
    }

    @Test
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2214");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) 'a', (-9));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-53) + "'", int2 == (-53));
    }

    @Test
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2215");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(12, (-45));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-11) + "'", int2 == (-11));
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2216");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) (short) 10, 99);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2217");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(85, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2218");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner((int) ' ', (-94));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-17) + "'", int2 == (-17));
    }

    @Test
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2219");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(35, (-36));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-19) + "'", int2 == (-19));
    }

    @Test
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2220");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(14, (-57));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-8) + "'", int2 == (-8));
    }

    @Test
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2221");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(85, (-8));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-63) + "'", int2 == (-63));
    }

    @Test
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2222");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(1, (-16));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2223");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(18, (-49));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2) + "'", int2 == (-2));
    }

    @Test
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2224");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(57, 93);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
    }

    @Test
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2225");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(49, (-22));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-10) + "'", int2 == (-10));
    }

    @Test
    public void test2226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2226");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(56, (-73));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
    }

    @Test
    public void test2227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2227");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(56, 36);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test2228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2228");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(92, (-52));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-85) + "'", int2 == (-85));
    }

    @Test
    public void test2229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2229");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(12, (-34));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2230");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(52, 6);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test2231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2231");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(70, (-37));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-33) + "'", int2 == (-33));
    }

    @Test
    public void test2232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2232");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(37, (-14));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-23) + "'", int2 == (-23));
    }

    @Test
    public void test2233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2233");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(12, 95);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test2234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2234");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(28, (-8));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-14) + "'", int2 == (-14));
    }

    @Test
    public void test2235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2235");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(13, (-48));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2) + "'", int2 == (-2));
    }

    @Test
    public void test2236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2236");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner((int) ' ', 42);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 11 + "'", int2 == 11);
    }

    @Test
    public void test2237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2237");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(67, (-59));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-6) + "'", int2 == (-6));
    }

    @Test
    public void test2238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2238");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner((int) (short) 10, 6);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test2239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2239");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(67, 8);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 65 + "'", int2 == 65);
    }

    @Test
    public void test2240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2240");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(15, 14);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 11 + "'", int2 == 11);
    }

    @Test
    public void test2241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2241");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(2, (-71));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2242");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(36, (-8));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-12) + "'", int2 == (-12));
    }

    @Test
    public void test2243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2243");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(91, 7);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
    }

    @Test
    public void test2244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2244");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(40, (-24));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-34) + "'", int2 == (-34));
    }

    @Test
    public void test2245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2245");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) (short) 1, 20);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test2246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2246");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(33, 88);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 24 + "'", int2 == 24);
    }

    @Test
    public void test2247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2247");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(33, 8);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 25 + "'", int2 == 25);
    }

    @Test
    public void test2248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2248");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(79, 7);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 75 + "'", int2 == 75);
    }

    @Test
    public void test2249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2249");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner((int) '4', (-99));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-49) + "'", int2 == (-49));
    }

    @Test
    public void test2250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2250");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(80, (-38));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-17) + "'", int2 == (-17));
    }

    @Test
    public void test2251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2251");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(44, (-81));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-33) + "'", int2 == (-33));
    }

    @Test
    public void test2252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2252");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(28, (-48));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-21) + "'", int2 == (-21));
    }

    @Test
    public void test2253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2253");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(72, 92);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test2254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2254");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(3, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test2255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2255");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(54, 90);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 40 + "'", int2 == 40);
    }

    @Test
    public void test2256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2256");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(62, 90);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 61 + "'", int2 == 61);
    }

    @Test
    public void test2257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2257");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(21, (-37));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2258");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) '#', (-50));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-16) + "'", int2 == (-16));
    }

    @Test
    public void test2259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2259");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(10, 37);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
    }

    @Test
    public void test2260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2260");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) ' ', (-68));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2261");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(6, (-34));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2262");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) (short) 1, (-62));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test2263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2263");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(96, (-62));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-57) + "'", int2 == (-57));
    }

    @Test
    public void test2264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2264");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(37, (-44));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-31) + "'", int2 == (-31));
    }

    @Test
    public void test2265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2265");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(97, (-47));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-80) + "'", int2 == (-80));
    }

    @Test
    public void test2266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2266");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(80, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2267");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(19, (-74));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-12) + "'", int2 == (-12));
    }

    @Test
    public void test2268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2268");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(32, 12);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 28 + "'", int2 == 28);
    }

    @Test
    public void test2269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2269");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(38, 30);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 30 + "'", int2 == 30);
    }

    @Test
    public void test2270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2270");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(67, (-49));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-58) + "'", int2 == (-58));
    }

    @Test
    public void test2271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2271");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(98, (-57));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-83) + "'", int2 == (-83));
    }

    @Test
    public void test2272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2272");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(85, (-84));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-75) + "'", int2 == (-75));
    }

    @Test
    public void test2273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2273");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(25, (-70));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2274");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) 'a', (-26));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-66) + "'", int2 == (-66));
    }

    @Test
    public void test2275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2275");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(93, 7);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2276");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(62, 59);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 38 + "'", int2 == 38);
    }

    @Test
    public void test2277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2277");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(10, 64);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2278");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(15, (-71));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-11) + "'", int2 == (-11));
    }

    @Test
    public void test2279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2279");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(59, 53);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 48 + "'", int2 == 48);
    }

    @Test
    public void test2280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2280");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(78, (-84));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-61) + "'", int2 == (-61));
    }

    @Test
    public void test2281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2281");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(92, 61);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 48 + "'", int2 == 48);
    }

    @Test
    public void test2282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2282");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(34, (-77));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2283");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(3, (-20));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2) + "'", int2 == (-2));
    }

    @Test
    public void test2284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2284");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(93, (-62));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-61) + "'", int2 == (-61));
    }

    @Test
    public void test2285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2285");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(15, (-17));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-9) + "'", int2 == (-9));
    }

    @Test
    public void test2286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2286");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(71, (-19));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-45) + "'", int2 == (-45));
    }

    @Test
    public void test2287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2287");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(64, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 63 + "'", int2 == 63);
    }

    @Test
    public void test2288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2288");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(37, 78);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 33 + "'", int2 == 33);
    }

    @Test
    public void test2289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2289");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(3, (-71));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2290");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(16, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2291");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(13, (-30));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-11) + "'", int2 == (-11));
    }

    @Test
    public void test2292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2292");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(61, 42);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 54 + "'", int2 == 54);
    }

    @Test
    public void test2293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2293");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(29, 41);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 13 + "'", int2 == 13);
    }

    @Test
    public void test2294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2294");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(13, 7);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test2295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2295");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner((int) ' ', (-32));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-26) + "'", int2 == (-26));
    }

    @Test
    public void test2296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2296");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(16, 98);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
    }

    @Test
    public void test2297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2297");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(55, 59);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 38 + "'", int2 == 38);
    }

    @Test
    public void test2298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2298");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(16, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test2299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2299");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(24, (-13));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test2300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2300");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(19, 56);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 14 + "'", int2 == 14);
    }

    @Test
    public void test2301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2301");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(62, (-18));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-47) + "'", int2 == (-47));
    }

    @Test
    public void test2302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2302");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(10, (-57));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2) + "'", int2 == (-2));
    }

    @Test
    public void test2303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2303");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(57, (-40));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-54) + "'", int2 == (-54));
    }

    @Test
    public void test2304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2304");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(35, 33);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 22 + "'", int2 == 22);
    }

    @Test
    public void test2305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2305");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(4, 38);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test2306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2306");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(70, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 69 + "'", int2 == 69);
    }

    @Test
    public void test2307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2307");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(29, 58);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 21 + "'", int2 == 21);
    }

    @Test
    public void test2308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2308");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(25, (-37));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-7) + "'", int2 == (-7));
    }

    @Test
    public void test2309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2309");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(20, (-43));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-10) + "'", int2 == (-10));
    }

    @Test
    public void test2310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2310");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(89, (-55));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-46) + "'", int2 == (-46));
    }

    @Test
    public void test2311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2311");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(89, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test2312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2312");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) (byte) 10, (-44));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
    }

    @Test
    public void test2313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2313");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(5, 17);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test2314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2314");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(59, (-50));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test2315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2315");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(8, (-70));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-7) + "'", int2 == (-7));
    }

    @Test
    public void test2316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2316");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(99, 14);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 77 + "'", int2 == 77);
    }

    @Test
    public void test2317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2317");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(27, 26);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 12 + "'", int2 == 12);
    }

    @Test
    public void test2318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2318");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(42, (-26));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-21) + "'", int2 == (-21));
    }

    @Test
    public void test2319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2319");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) (byte) 10, (-38));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-7) + "'", int2 == (-7));
    }

    @Test
    public void test2320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2320");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner((int) (byte) 10, 96);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
    }

    @Test
    public void test2321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2321");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(77, (-83));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-34) + "'", int2 == (-34));
    }

    @Test
    public void test2322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2322");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(30, (-13));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-23) + "'", int2 == (-23));
    }

    @Test
    public void test2323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2323");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(50, (-78));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-45) + "'", int2 == (-45));
    }

    @Test
    public void test2324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2324");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(32, 6);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
    }

    @Test
    public void test2325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2325");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(63, (-68));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-18) + "'", int2 == (-18));
    }

    @Test
    public void test2326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2326");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(6, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2327");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(80, 44);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
    }

    @Test
    public void test2328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2328");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(58, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test2329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2329");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(59, 67);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 58 + "'", int2 == 58);
    }

    @Test
    public void test2330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2330");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(91, (-66));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-56) + "'", int2 == (-56));
    }

    @Test
    public void test2331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2331");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(14, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
    }

    @Test
    public void test2332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2332");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(16, 48);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 12 + "'", int2 == 12);
    }

    @Test
    public void test2333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2333");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner((int) 'a', 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2334");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(90, (-77));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-71) + "'", int2 == (-71));
    }

    @Test
    public void test2335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2335");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(93, (-47));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-81) + "'", int2 == (-81));
    }

    @Test
    public void test2336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2336");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(81, (-64));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-17) + "'", int2 == (-17));
    }

    @Test
    public void test2337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2337");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(23, (-65));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2338");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(72, (-39));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-7) + "'", int2 == (-7));
    }

    @Test
    public void test2339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2339");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(67, 7);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 61 + "'", int2 == 61);
    }

    @Test
    public void test2340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2340");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(100, (-40));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-98) + "'", int2 == (-98));
    }

    @Test
    public void test2341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2341");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(53, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2342");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(99, 31);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 59 + "'", int2 == 59);
    }

    @Test
    public void test2343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2343");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(12, 26);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test2344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2344");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(39, 6);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 22 + "'", int2 == 22);
    }

    @Test
    public void test2345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2345");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(75, 62);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 40 + "'", int2 == 40);
    }

    @Test
    public void test2346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2346");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(100, 69);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
    }

    @Test
    public void test2347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2347");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(54, 89);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test2348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2348");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) '4', 17);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 42 + "'", int2 == 42);
    }

    @Test
    public void test2349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2349");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(91, 55);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 67 + "'", int2 == 67);
    }

    @Test
    public void test2350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2350");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(75, 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 71 + "'", int2 == 71);
    }

    @Test
    public void test2351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2351");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(1, (-71));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2352");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(46, (-76));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-32) + "'", int2 == (-32));
    }

    @Test
    public void test2353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2353");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(3, 64);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test2354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2354");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(37, 18);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 31 + "'", int2 == 31);
    }

    @Test
    public void test2355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2355");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(41, 34);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 16 + "'", int2 == 16);
    }

    @Test
    public void test2356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2356");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(66, (-27));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-21) + "'", int2 == (-21));
    }

    @Test
    public void test2357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2357");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(13, 11);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test2358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2358");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(60, 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test2359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2359");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(78, 9);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 55 + "'", int2 == 55);
    }

    @Test
    public void test2360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2360");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(39, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 11 + "'", int2 == 11);
    }

    @Test
    public void test2361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2361");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(65, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 56 + "'", int2 == 56);
    }

    @Test
    public void test2362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2362");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(33, 36);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 17 + "'", int2 == 17);
    }

    @Test
    public void test2363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2363");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(37, 79);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 34 + "'", int2 == 34);
    }

    @Test
    public void test2364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2364");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(96, 28);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
    }

    @Test
    public void test2365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2365");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(21, 75);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 16 + "'", int2 == 16);
    }

    @Test
    public void test2366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2366");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(96, 24);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 31 + "'", int2 == 31);
    }

    @Test
    public void test2367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2367");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(65, 60);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 37 + "'", int2 == 37);
    }

    @Test
    public void test2368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2368");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(25, (-63));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-9) + "'", int2 == (-9));
    }

    @Test
    public void test2369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2369");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(54, 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 37 + "'", int2 == 37);
    }

    @Test
    public void test2370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2370");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(48, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 34 + "'", int2 == 34);
    }

    @Test
    public void test2371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2371");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) ' ', (-22));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-6) + "'", int2 == (-6));
    }

    @Test
    public void test2372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2372");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(80, 55);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 59 + "'", int2 == 59);
    }

    @Test
    public void test2373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2373");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(71, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2374");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(16, 75);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test2375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2375");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(48, (-39));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-30) + "'", int2 == (-30));
    }

    @Test
    public void test2376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2376");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(2, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2377");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(1, (-49));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test2378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2378");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(22, (-72));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2379");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(35, (-58));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-11) + "'", int2 == (-11));
    }

    @Test
    public void test2380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2380");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(92, 69);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 37 + "'", int2 == 37);
    }

    @Test
    public void test2381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2381");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) ' ', 22);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
    }

    @Test
    public void test2382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2382");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) (short) 100, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test2383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2383");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) ' ', 51);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 30 + "'", int2 == 30);
    }

    @Test
    public void test2384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2384");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(65, 13);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 22 + "'", int2 == 22);
    }

    @Test
    public void test2385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2385");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(65, 7);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 47 + "'", int2 == 47);
    }

    @Test
    public void test2386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2386");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(41, 3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 31 + "'", int2 == 31);
    }

    @Test
    public void test2387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2387");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(96, 46);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test2388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2388");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(48, 96);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 43 + "'", int2 == 43);
    }

    @Test
    public void test2389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2389");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(35, 81);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20 + "'", int2 == 20);
    }

    @Test
    public void test2390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2390");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(9, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test2391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2391");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) (byte) 100, (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 83 + "'", int2 == 83);
    }

    @Test
    public void test2392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2392");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(25, (-73));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-10) + "'", int2 == (-10));
    }

    @Test
    public void test2393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2393");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(41, (-80));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2394");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(2, (-77));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2395");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(28, (-11));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-4) + "'", int2 == (-4));
    }

    @Test
    public void test2396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2396");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(7, 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test2397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2397");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(100, 93);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 80 + "'", int2 == 80);
    }

    @Test
    public void test2398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2398");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(97, 18);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 55 + "'", int2 == 55);
    }

    @Test
    public void test2399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2399");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(18, (-65));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-10) + "'", int2 == (-10));
    }

    @Test
    public void test2400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2400");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(26, (-94));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-11) + "'", int2 == (-11));
    }

    @Test
    public void test2401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2401");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(63, 55);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test2402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2402");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(63, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2403");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(83, (-65));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-71) + "'", int2 == (-71));
    }

    @Test
    public void test2404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2404");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(97, (-36));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-39) + "'", int2 == (-39));
    }

    @Test
    public void test2405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2405");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(72, (-94));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-38) + "'", int2 == (-38));
    }

    @Test
    public void test2406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2406");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(57, 41);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 31 + "'", int2 == 31);
    }

    @Test
    public void test2407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2407");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(81, (-42));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-44) + "'", int2 == (-44));
    }

    @Test
    public void test2408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2408");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(24, (-81));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-16) + "'", int2 == (-16));
    }

    @Test
    public void test2409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2409");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(38, (-98));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2410");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(70, 12);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test2411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2411");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner((int) ' ', 95);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 14 + "'", int2 == 14);
    }

    @Test
    public void test2412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2412");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(51, 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 37 + "'", int2 == 37);
    }

    @Test
    public void test2413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2413");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(25, 62);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 21 + "'", int2 == 21);
    }

    @Test
    public void test2414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2414");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(46, 29);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 37 + "'", int2 == 37);
    }

    @Test
    public void test2415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2415");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(2, 36);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test2416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2416");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(21, 64);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 12 + "'", int2 == 12);
    }

    @Test
    public void test2417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2417");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(51, (-41));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
    }

    @Test
    public void test2418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2418");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(98, 61);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 33 + "'", int2 == 33);
    }

    @Test
    public void test2419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2419");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(8, (-34));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test2420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2420");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(67, 94);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 58 + "'", int2 == 58);
    }

    @Test
    public void test2421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2421");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(79, 30);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 18 + "'", int2 == 18);
    }

    @Test
    public void test2422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2422");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(26, (-18));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-18) + "'", int2 == (-18));
    }

    @Test
    public void test2423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2423");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(33, (-69));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-30) + "'", int2 == (-30));
    }

    @Test
    public void test2424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2424");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(8, (-77));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-6) + "'", int2 == (-6));
    }

    @Test
    public void test2425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2425");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(58, 83);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 14 + "'", int2 == 14);
    }

    @Test
    public void test2426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2426");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(45, (-39));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-7) + "'", int2 == (-7));
    }

    @Test
    public void test2427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2427");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(36, 16);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2428");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(80, (-84));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-69) + "'", int2 == (-69));
    }

    @Test
    public void test2429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2429");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(43, (-54));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2430");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(93, 54);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 93 + "'", int2 == 93);
    }

    @Test
    public void test2431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2431");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(56, 62);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 43 + "'", int2 == 43);
    }

    @Test
    public void test2432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2432");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(6, (-85));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
    }

    @Test
    public void test2433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2433");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) (short) 1, 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test2434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2434");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(72, (-19));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-64) + "'", int2 == (-64));
    }

    @Test
    public void test2435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2435");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(80, (-99));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
    }

    @Test
    public void test2436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2436");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(17, (-96));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-10) + "'", int2 == (-10));
    }

    @Test
    public void test2437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2437");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(92, (-94));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-29) + "'", int2 == (-29));
    }

    @Test
    public void test2438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2438");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(56, 6);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 29 + "'", int2 == 29);
    }

    @Test
    public void test2439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2439");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(7, 60);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test2440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2440");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(51, 63);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 17 + "'", int2 == 17);
    }

    @Test
    public void test2441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2441");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(73, 50);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test2442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2442");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(17, (-67));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-8) + "'", int2 == (-8));
    }

    @Test
    public void test2443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2443");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(11, 26);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test2444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2444");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(67, 5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 46 + "'", int2 == 46);
    }

    @Test
    public void test2445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2445");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(35, (-66));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-22) + "'", int2 == (-22));
    }

    @Test
    public void test2446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2446");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(88, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2447");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(30, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 30 + "'", int2 == 30);
    }

    @Test
    public void test2448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2448");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(12, 34);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2449");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(75, 2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 23 + "'", int2 == 23);
    }

    @Test
    public void test2450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2450");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(70, (-45));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-68) + "'", int2 == (-68));
    }

    @Test
    public void test2451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2451");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(1, (-31));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test2452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2452");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(3, 98);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test2453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2453");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(80, (-68));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-26) + "'", int2 == (-26));
    }

    @Test
    public void test2454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2454");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(8, 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test2455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2455");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(91, 63);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 27 + "'", int2 == 27);
    }

    @Test
    public void test2456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2456");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(85, 39);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 41 + "'", int2 == 41);
    }

    @Test
    public void test2457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2457");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(97, (-40));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-77) + "'", int2 == (-77));
    }

    @Test
    public void test2458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2458");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(13, (-85));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
    }

    @Test
    public void test2459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2459");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(49, (-81));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-16) + "'", int2 == (-16));
    }

    @Test
    public void test2460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2460");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(59, (-87));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-30) + "'", int2 == (-30));
    }

    @Test
    public void test2461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2461");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(91, (-63));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-27) + "'", int2 == (-27));
    }

    @Test
    public void test2462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2462");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner((int) (byte) 100, (-68));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-31) + "'", int2 == (-31));
    }

    @Test
    public void test2463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2463");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(89, (-46));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-53) + "'", int2 == (-53));
    }

    @Test
    public void test2464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2464");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(38, (-90));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-23) + "'", int2 == (-23));
    }

    @Test
    public void test2465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2465");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(24, 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 23 + "'", int2 == 23);
    }

    @Test
    public void test2466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2466");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(40, (-29));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-35) + "'", int2 == (-35));
    }

    @Test
    public void test2467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2467");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) (short) 1, (-52));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test2468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2468");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(100, 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 33 + "'", int2 == 33);
    }

    @Test
    public void test2469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2469");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(64, 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 48 + "'", int2 == 48);
    }

    @Test
    public void test2470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2470");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(62, 67);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 17 + "'", int2 == 17);
    }

    @Test
    public void test2471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2471");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner((int) (short) 10, (-30));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-5) + "'", int2 == (-5));
    }

    @Test
    public void test2472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2472");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(72, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 51 + "'", int2 == 51);
    }

    @Test
    public void test2473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2473");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(1, 43);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2474");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(72, (-82));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-15) + "'", int2 == (-15));
    }

    @Test
    public void test2475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2475");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(95, 94);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 30 + "'", int2 == 30);
    }

    @Test
    public void test2476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2476");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(28, (-48));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-20) + "'", int2 == (-20));
    }

    @Test
    public void test2477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2477");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(77, (-82));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-50) + "'", int2 == (-50));
    }

    @Test
    public void test2478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2478");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(47, (-56));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-4) + "'", int2 == (-4));
    }

    @Test
    public void test2479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2479");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(96, 47);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 33 + "'", int2 == 33);
    }

    @Test
    public void test2480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2480");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(67, 92);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 12 + "'", int2 == 12);
    }

    @Test
    public void test2481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2481");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(7, 31);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
    }

    @Test
    public void test2482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2482");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(4, 50);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test2483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2483");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(7, (-63));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test2484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2484");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(40, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2485");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(95, 92);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 83 + "'", int2 == 83);
    }

    @Test
    public void test2486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2486");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(59, (-15));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-47) + "'", int2 == (-47));
    }

    @Test
    public void test2487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2487");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(25, 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test2488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2488");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(28, 62);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 19 + "'", int2 == 19);
    }

    @Test
    public void test2489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2489");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(79, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 70 + "'", int2 == 70);
    }

    @Test
    public void test2490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2490");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(25, (-42));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-6) + "'", int2 == (-6));
    }

    @Test
    public void test2491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2491");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(99, (-62));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-47) + "'", int2 == (-47));
    }

    @Test
    public void test2492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2492");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(95, (-47));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-81) + "'", int2 == (-81));
    }

    @Test
    public void test2493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2493");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner((int) (short) 10, 85);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test2494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2494");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(36, (-16));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test2495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2495");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(21, (-25));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2496");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(1, (-19));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2497");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(64, (-13));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-9) + "'", int2 == (-9));
    }

    @Test
    public void test2498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2498");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(71, (-37));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test2499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2499");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(72, 72);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 56 + "'", int2 == 56);
    }

    @Test
    public void test2500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2500");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(83, (-96));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-65) + "'", int2 == (-65));
    }
}

