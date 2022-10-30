package LeastCommonMultiple;

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
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(970, 543200);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 543200 + "'", int2 == 543200);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) 100, 10400);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10400 + "'", int2 == 10400);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1300, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1300 + "'", int2 == 1300);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1, 800);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 800 + "'", int2 == 800);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) 0, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) -1, 416);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 416 + "'", int2 == 416);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(800, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 800 + "'", int2 == 800);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) 10, 1008800);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1008800 + "'", int2 == 1008800);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1300, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10400 + "'", int2 == 10400);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(3104, 3104);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3104 + "'", int2 == 3104);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(9100, 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9100 + "'", int2 == 9100);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(10400, 1120);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 72800 + "'", int2 == 72800);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(9100, 5600);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 72800 + "'", int2 == 72800);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(2080, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(3104, 14560);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1412320 + "'", int2 == 1412320);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(5044, 10400);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1008800 + "'", int2 == 1008800);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(3395, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3395 + "'", int2 == 3395);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(77600, 14560);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(14560, 67900);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(108640, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1412320 + "'", int2 == 1412320);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1300, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1300 + "'", int2 == 1300);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1300, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1300 + "'", int2 == 1300);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(126100, 10400);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1008800 + "'", int2 == 1008800);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(108640, 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 108640 + "'", int2 == 108640);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1120, 25220);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1412320 + "'", int2 == 1412320);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(0, 1008800);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) 'a', 1412320);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1412320 + "'", int2 == 1412320);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((-1), 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(100, 77600);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 77600 + "'", int2 == 77600);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(800, 3395);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 543200 + "'", int2 == 543200);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(176540, 67900);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 882700 + "'", int2 == 882700);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(9100, 108640);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(260, 1300);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1300 + "'", int2 == 1300);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(108640, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 108640 + "'", int2 == 108640);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1820, 176540);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 176540 + "'", int2 == 176540);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) 1, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1120, 70);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1120 + "'", int2 == 1120);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(700, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 700 + "'", int2 == 700);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(7061600, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) 10, 5600);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5600 + "'", int2 == 5600);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(9100, 10400);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 72800 + "'", int2 == 72800);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(0, 3104);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(10, 1300);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1300 + "'", int2 == 1300);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(25220, 176540);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 176540 + "'", int2 == 176540);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) 1, 77600);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 77600 + "'", int2 == 77600);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(25220, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 25220 + "'", int2 == 25220);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(3395, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3395 + "'", int2 == 3395);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(543200, 5600);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 543200 + "'", int2 == 543200);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(35, 3395);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3395 + "'", int2 == 3395);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1120, 1820);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 14560 + "'", int2 == 14560);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) 1, 3395);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3395 + "'", int2 == 3395);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(70, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 70 + "'", int2 == 70);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) 10, 3104);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15520 + "'", int2 == 15520);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(6790, 201760);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1412320 + "'", int2 == 1412320);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(9700, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9700 + "'", int2 == 9700);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(201760, 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 201760 + "'", int2 == 201760);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(160, 201760);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 201760 + "'", int2 == 201760);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(543200, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 543200 + "'", int2 == 543200);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(77600, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 77600 + "'", int2 == 77600);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) 'a', 1008800);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1008800 + "'", int2 == 1008800);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(52, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(3395, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 176540 + "'", int2 == 176540);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(14560, 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 14560 + "'", int2 == 14560);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(14560, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 14560 + "'", int2 == 14560);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(15520, 25220);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 201760 + "'", int2 == 201760);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(800, 9700);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 77600 + "'", int2 == 77600);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(7061600, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(52, 882700);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 882700 + "'", int2 == 882700);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(52, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(7061600, 260);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) '4', 5044);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5044 + "'", int2 == 5044);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(416, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 416 + "'", int2 == 416);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(9100, 1120);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 72800 + "'", int2 == 72800);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(100, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(5600, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5600 + "'", int2 == 5600);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) ' ', 126100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1008800 + "'", int2 == 1008800);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(77600, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 77600 + "'", int2 == 77600);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) 1, 9100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9100 + "'", int2 == 9100);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(126100, 260);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 126100 + "'", int2 == 126100);
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(77600, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 77600 + "'", int2 == 77600);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(160, 9100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 72800 + "'", int2 == 72800);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(77600, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(77600, 10400);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1008800 + "'", int2 == 1008800);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(416, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10400 + "'", int2 == 10400);
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(9100, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9100 + "'", int2 == 9100);
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(32, 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3104 + "'", int2 == 3104);
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((-1), 77600);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 77600 + "'", int2 == 77600);
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(5044, 67900);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 882700 + "'", int2 == 882700);
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(10400, 77600);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1008800 + "'", int2 == 1008800);
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(35, 800);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5600 + "'", int2 == 5600);
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) 0, 2080);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(5600, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5600 + "'", int2 == 5600);
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1, 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(2080, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10400 + "'", int2 == 10400);
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) -1, 40352);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 40352 + "'", int2 == 40352);
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(5600, 67900);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 543200 + "'", int2 == 543200);
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(108640, (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 108640 + "'", int2 == 108640);
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1412320, 6790);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1412320 + "'", int2 == 1412320);
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1820, 10400);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 72800 + "'", int2 == 72800);
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(52, 3104);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 40352 + "'", int2 == 40352);
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(52, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) '4', 67900);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 882700 + "'", int2 == 882700);
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) 10, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(2080, 126100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1008800 + "'", int2 == 1008800);
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) 1, 9700);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9700 + "'", int2 == 9700);
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(10, (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 70 + "'", int2 == 70);
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) 1, 1412320);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1412320 + "'", int2 == 1412320);
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(0, 10400);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(77600, 9100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) 10, 40352);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 201760 + "'", int2 == 201760);
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(2080, 67900);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(77600, 700);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 543200 + "'", int2 == 543200);
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(882700, 9700);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 882700 + "'", int2 == 882700);
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(72800, 1008800);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) 10, 1300);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1300 + "'", int2 == 1300);
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) 100, 14560);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 72800 + "'", int2 == 72800);
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1300, 3395);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 882700 + "'", int2 == 882700);
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(15520, 1120);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 108640 + "'", int2 == 108640);
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(970, 260);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 25220 + "'", int2 == 25220);
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(201760, 5600);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(52, 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 416 + "'", int2 == 416);
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(97, 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3104 + "'", int2 == 3104);
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(7061600, 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(126100, 1300);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 126100 + "'", int2 == 126100);
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(10400, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10400 + "'", int2 == 10400);
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(7061600, 126100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(67900, 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 882700 + "'", int2 == 882700);
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(9700, 416);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1008800 + "'", int2 == 1008800);
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(72800, 10400);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 72800 + "'", int2 == 72800);
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(67900, 25220);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 882700 + "'", int2 == 882700);
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(32, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(3104, 25220);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 201760 + "'", int2 == 201760);
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1412320, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1412320 + "'", int2 == 1412320);
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(176540, 10400);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(700, 7061600);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(6790, 5600);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 543200 + "'", int2 == 543200);
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((-1), (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(201760, 67900);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(108640, 3104);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 108640 + "'", int2 == 108640);
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(40352, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 40352 + "'", int2 == 40352);
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(97, 416);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 40352 + "'", int2 == 40352);
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(543200, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 543200 + "'", int2 == 543200);
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(3104, 1820);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1412320 + "'", int2 == 1412320);
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(5600, 9100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 72800 + "'", int2 == 72800);
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(6790, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(67900, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 67900 + "'", int2 == 67900);
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(800, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 77600 + "'", int2 == 77600);
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(7061600, 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(72800, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 72800 + "'", int2 == 72800);
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1300, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1300 + "'", int2 == 1300);
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(72800, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 72800 + "'", int2 == 72800);
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(32, 40352);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 40352 + "'", int2 == 40352);
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(3104, 72800);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(6790, 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6790 + "'", int2 == 6790);
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1820, 1412320);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1412320 + "'", int2 == 1412320);
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(126100, 6790);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 882700 + "'", int2 == 882700);
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1300, 70);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9100 + "'", int2 == 9100);
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(5600, 7061600);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(9700, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9700 + "'", int2 == 9700);
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(25220, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(7061600, 72800);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(416, 970);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 201760 + "'", int2 == 201760);
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) 100, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 800 + "'", int2 == 800);
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(3395, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3395 + "'", int2 == 3395);
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(160, 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1120 + "'", int2 == 1120);
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(126100, 970);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 126100 + "'", int2 == 126100);
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) 10, 15520);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15520 + "'", int2 == 15520);
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(67900, 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 67900 + "'", int2 == 67900);
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(9700, 1300);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 126100 + "'", int2 == 126100);
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(700, 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 67900 + "'", int2 == 67900);
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1820, 970);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 176540 + "'", int2 == 176540);
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1300, 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 126100 + "'", int2 == 126100);
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2173");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(14560, 70);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 14560 + "'", int2 == 14560);
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(5044, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) 1, 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(126100, 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 126100 + "'", int2 == 126100);
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(15520, 2080);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 201760 + "'", int2 == 201760);
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2178");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(416, 67900);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(800, 7061600);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2180");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(35, 260);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1820 + "'", int2 == 1820);
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(70, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 700 + "'", int2 == 700);
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) -1, 72800);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 72800 + "'", int2 == 72800);
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2183");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(126100, 77600);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1008800 + "'", int2 == 1008800);
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2184");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1300, 882700);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 882700 + "'", int2 == 882700);
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2185");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(97, 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3395 + "'", int2 == 3395);
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2186");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(15520, 3395);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 108640 + "'", int2 == 108640);
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2187");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) 100, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2188");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) ' ', 416);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 416 + "'", int2 == 416);
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2189");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(52, 14560);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 14560 + "'", int2 == 14560);
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2190");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(201760, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 201760 + "'", int2 == 201760);
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2191");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(2080, 6790);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1412320 + "'", int2 == 1412320);
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2192");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(32, 15520);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15520 + "'", int2 == 15520);
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2193");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(800, 2080);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10400 + "'", int2 == 10400);
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2194");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) 100, 9700);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9700 + "'", int2 == 9700);
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2195");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(543200, 72800);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2196");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(3395, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6790 + "'", int2 == 6790);
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2197");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(25220, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 126100 + "'", int2 == 126100);
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2198");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) 1, 70);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 70 + "'", int2 == 70);
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2199");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(700, 70);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 700 + "'", int2 == 700);
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2200");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1820, 67900);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 882700 + "'", int2 == 882700);
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2201");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1, 14560);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 14560 + "'", int2 == 14560);
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2202");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) '4', 1120);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 14560 + "'", int2 == 14560);
    }

    @Test
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2203");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(3395, 543200);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 543200 + "'", int2 == 543200);
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2204");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) 1, 970);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 970 + "'", int2 == 970);
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2205");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(25220, (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 176540 + "'", int2 == 176540);
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2206");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(108640, 1820);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1412320 + "'", int2 == 1412320);
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2207");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1008800, 1120);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2208");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(97, 1820);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 176540 + "'", int2 == 176540);
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2209");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(10400, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10400 + "'", int2 == 10400);
    }

    @Test
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2210");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(25220, 70);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 176540 + "'", int2 == 176540);
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2211");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(108640, 1008800);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2212");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(2080, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2080 + "'", int2 == 2080);
    }

    @Test
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2213");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(9100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2214");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) 0, 9700);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2215");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(70, 201760);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1412320 + "'", int2 == 1412320);
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2216");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1, 5600);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5600 + "'", int2 == 5600);
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2217");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) -1, 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2218");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(3104, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3104 + "'", int2 == 3104);
    }

    @Test
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2219");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1820, 126100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 882700 + "'", int2 == 882700);
    }

    @Test
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2220");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(67900, 5044);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 882700 + "'", int2 == 882700);
    }

    @Test
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2221");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1412320, 3104);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1412320 + "'", int2 == 1412320);
    }

    @Test
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2222");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) '#', 6790);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6790 + "'", int2 == 6790);
    }

    @Test
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2223");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(160, 25220);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 201760 + "'", int2 == 201760);
    }

    @Test
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2224");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) -1, 1120);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1120 + "'", int2 == 1120);
    }

    @Test
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2225");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(700, 882700);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 882700 + "'", int2 == 882700);
    }

    @Test
    public void test2226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2226");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) 100, 72800);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 72800 + "'", int2 == 72800);
    }

    @Test
    public void test2227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2227");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) -1, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test2228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2228");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(10400, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10400 + "'", int2 == 10400);
    }

    @Test
    public void test2229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2229");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) 1, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test2230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2230");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(176540, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 882700 + "'", int2 == 882700);
    }

    @Test
    public void test2231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2231");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) 1, 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test2232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2232");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1008800, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1008800 + "'", int2 == 1008800);
    }

    @Test
    public void test2233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2233");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(15520, 6790);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 108640 + "'", int2 == 108640);
    }

    @Test
    public void test2234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2234");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(882700, 543200);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test2235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2235");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(126100, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 126100 + "'", int2 == 126100);
    }

    @Test
    public void test2236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2236");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(108640, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 543200 + "'", int2 == 543200);
    }

    @Test
    public void test2237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2237");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(3104, 882700);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test2238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2238");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(700, 201760);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test2239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2239");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(108640, 416);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1412320 + "'", int2 == 1412320);
    }

    @Test
    public void test2240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2240");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(800, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 800 + "'", int2 == 800);
    }

    @Test
    public void test2241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2241");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) 100, 1820);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9100 + "'", int2 == 9100);
    }

    @Test
    public void test2242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2242");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(201760, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 201760 + "'", int2 == 201760);
    }

    @Test
    public void test2243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2243");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1008800, 77600);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1008800 + "'", int2 == 1008800);
    }

    @Test
    public void test2244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2244");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(35, 77600);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 543200 + "'", int2 == 543200);
    }

    @Test
    public void test2245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2245");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1412320, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1412320 + "'", int2 == 1412320);
    }

    @Test
    public void test2246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2246");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1820, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9100 + "'", int2 == 9100);
    }

    @Test
    public void test2247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2247");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1820, 6790);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 176540 + "'", int2 == 176540);
    }

    @Test
    public void test2248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2248");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(14560, 2080);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 14560 + "'", int2 == 14560);
    }

    @Test
    public void test2249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2249");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(77600, 72800);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test2250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2250");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1820, 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 176540 + "'", int2 == 176540);
    }

    @Test
    public void test2251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2251");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) 0, 5600);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2252");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) 100, 77600);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 77600 + "'", int2 == 77600);
    }

    @Test
    public void test2253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2253");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(97, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test2254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2254");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(35, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 70 + "'", int2 == 70);
    }

    @Test
    public void test2255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2255");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((-1), 1300);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1300 + "'", int2 == 1300);
    }

    @Test
    public void test2256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2256");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(7061600, 9700);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test2257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2257");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(3104, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3104 + "'", int2 == 3104);
    }

    @Test
    public void test2258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2258");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(700, 1008800);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test2259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2259");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(3395, 25220);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 176540 + "'", int2 == 176540);
    }

    @Test
    public void test2260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2260");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) '#', 3395);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3395 + "'", int2 == 3395);
    }

    @Test
    public void test2261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2261");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) 100, 882700);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 882700 + "'", int2 == 882700);
    }

    @Test
    public void test2262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2262");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(25220, 882700);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 882700 + "'", int2 == 882700);
    }

    @Test
    public void test2263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2263");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(260, 201760);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 201760 + "'", int2 == 201760);
    }

    @Test
    public void test2264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2264");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(5044, 1008800);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1008800 + "'", int2 == 1008800);
    }

    @Test
    public void test2265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2265");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((-1), (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test2266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2266");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1820, 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1820 + "'", int2 == 1820);
    }

    @Test
    public void test2267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2267");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(882700, 1300);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 882700 + "'", int2 == 882700);
    }

    @Test
    public void test2268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2268");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(543200, 1300);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test2269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2269");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) 1, 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test2270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2270");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) 10, 9700);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9700 + "'", int2 == 9700);
    }

    @Test
    public void test2271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2271");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(970, 25220);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 25220 + "'", int2 == 25220);
    }

    @Test
    public void test2272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2272");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(882700, 1412320);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test2273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2273");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) '#', 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 700 + "'", int2 == 700);
    }

    @Test
    public void test2274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2274");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(77600, 70);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 543200 + "'", int2 == 543200);
    }

    @Test
    public void test2275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2275");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(10400, 416);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10400 + "'", int2 == 10400);
    }

    @Test
    public void test2276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2276");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(35, 15520);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 108640 + "'", int2 == 108640);
    }

    @Test
    public void test2277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2277");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(32, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 416 + "'", int2 == 416);
    }

    @Test
    public void test2278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2278");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1412320, 9100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test2279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2279");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(40352, 700);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test2280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2280");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) '4', 1300);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1300 + "'", int2 == 1300);
    }

    @Test
    public void test2281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2281");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(126100, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 126100 + "'", int2 == 126100);
    }

    @Test
    public void test2282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2282");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) -1, 5044);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5044 + "'", int2 == 5044);
    }

    @Test
    public void test2283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2283");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) 1, 800);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 800 + "'", int2 == 800);
    }

    @Test
    public void test2284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2284");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(9700, 1412320);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test2285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2285");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(416, 70);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 14560 + "'", int2 == 14560);
    }

    @Test
    public void test2286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2286");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(32, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 160 + "'", int2 == 160);
    }

    @Test
    public void test2287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2287");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(800, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 800 + "'", int2 == 800);
    }

    @Test
    public void test2288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2288");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1, 176540);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 176540 + "'", int2 == 176540);
    }

    @Test
    public void test2289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2289");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) -1, 1820);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1820 + "'", int2 == 1820);
    }

    @Test
    public void test2290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2290");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1820, 108640);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1412320 + "'", int2 == 1412320);
    }

    @Test
    public void test2291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2291");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(416, (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 14560 + "'", int2 == 14560);
    }

    @Test
    public void test2292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2292");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) 100, 9700);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9700 + "'", int2 == 9700);
    }

    @Test
    public void test2293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2293");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(9700, 9100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 882700 + "'", int2 == 882700);
    }

    @Test
    public void test2294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2294");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) 1, 9700);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9700 + "'", int2 == 9700);
    }

    @Test
    public void test2295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2295");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(260, 14560);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 14560 + "'", int2 == 14560);
    }

    @Test
    public void test2296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2296");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) 100, 9100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9100 + "'", int2 == 9100);
    }

    @Test
    public void test2297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2297");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(77600, 800);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 77600 + "'", int2 == 77600);
    }

    @Test
    public void test2298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2298");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(15520, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 77600 + "'", int2 == 77600);
    }

    @Test
    public void test2299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2299");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(5044, 14560);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1412320 + "'", int2 == 1412320);
    }

    @Test
    public void test2300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2300");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(25220, 1820);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 176540 + "'", int2 == 176540);
    }

    @Test
    public void test2301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2301");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(9100, 9100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9100 + "'", int2 == 9100);
    }

    @Test
    public void test2302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2302");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1, 700);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 700 + "'", int2 == 700);
    }

    @Test
    public void test2303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2303");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(108640, 14560);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1412320 + "'", int2 == 1412320);
    }

    @Test
    public void test2304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2304");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) 0, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2305");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(77600, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 77600 + "'", int2 == 77600);
    }

    @Test
    public void test2306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2306");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(700, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 700 + "'", int2 == 700);
    }

    @Test
    public void test2307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2307");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(201760, 160);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 201760 + "'", int2 == 201760);
    }

    @Test
    public void test2308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2308");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(3395, 77600);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 543200 + "'", int2 == 543200);
    }

    @Test
    public void test2309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2309");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) 10, 2080);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2080 + "'", int2 == 2080);
    }

    @Test
    public void test2310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2310");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(52, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 260 + "'", int2 == 260);
    }

    @Test
    public void test2311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2311");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(176540, 1300);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 882700 + "'", int2 == 882700);
    }

    @Test
    public void test2312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2312");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1820, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9100 + "'", int2 == 9100);
    }

    @Test
    public void test2313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2313");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2314");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) -1, 14560);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 14560 + "'", int2 == 14560);
    }

    @Test
    public void test2315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2315");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(35, 5600);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5600 + "'", int2 == 5600);
    }

    @Test
    public void test2316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2316");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(882700, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 882700 + "'", int2 == 882700);
    }

    @Test
    public void test2317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2317");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) 10, 700);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 700 + "'", int2 == 700);
    }

    @Test
    public void test2318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2318");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) 0, 201760);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2319");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) 1, 160);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 160 + "'", int2 == 160);
    }

    @Test
    public void test2320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2320");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) 0, 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2321");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test2322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2322");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(9700, 40352);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1008800 + "'", int2 == 1008800);
    }

    @Test
    public void test2323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2323");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1008800, 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1008800 + "'", int2 == 1008800);
    }

    @Test
    public void test2324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2324");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(6790, 3104);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 108640 + "'", int2 == 108640);
    }

    @Test
    public void test2325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2325");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(5600, 6790);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 543200 + "'", int2 == 543200);
    }

    @Test
    public void test2326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2326");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(800, 160);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 800 + "'", int2 == 800);
    }

    @Test
    public void test2327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2327");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(100, 5044);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 126100 + "'", int2 == 126100);
    }

    @Test
    public void test2328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2328");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2329");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(201760, 3395);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1412320 + "'", int2 == 1412320);
    }

    @Test
    public void test2330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2330");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(700, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 67900 + "'", int2 == 67900);
    }

    @Test
    public void test2331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2331");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(201760, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1008800 + "'", int2 == 1008800);
    }

    @Test
    public void test2332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2332");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) 'a', 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3395 + "'", int2 == 3395);
    }

    @Test
    public void test2333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2333");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(77600, 1412320);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test2334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2334");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(14560, 1120);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 14560 + "'", int2 == 14560);
    }

    @Test
    public void test2335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2335");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) 10, 70);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 70 + "'", int2 == 70);
    }

    @Test
    public void test2336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2336");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) 0, 126100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2337");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) 100, 176540);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 882700 + "'", int2 == 882700);
    }

    @Test
    public void test2338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2338");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(32, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test2339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2339");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1412320, 160);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1412320 + "'", int2 == 1412320);
    }

    @Test
    public void test2340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2340");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(100, 1300);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1300 + "'", int2 == 1300);
    }

    @Test
    public void test2341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2341");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(9100, (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9100 + "'", int2 == 9100);
    }

    @Test
    public void test2342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2342");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(543200, 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 543200 + "'", int2 == 543200);
    }

    @Test
    public void test2343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2343");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(77600, 160);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 77600 + "'", int2 == 77600);
    }

    @Test
    public void test2344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2344");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) 10, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 970 + "'", int2 == 970);
    }

    @Test
    public void test2345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2345");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) 0, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2346");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(70, 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6790 + "'", int2 == 6790);
    }

    @Test
    public void test2347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2347");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) 100, 1300);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1300 + "'", int2 == 1300);
    }

    @Test
    public void test2348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2348");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(9100, 1820);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9100 + "'", int2 == 9100);
    }

    @Test
    public void test2349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2349");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(9100, 800);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 72800 + "'", int2 == 72800);
    }

    @Test
    public void test2350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2350");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) 100, 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9700 + "'", int2 == 9700);
    }

    @Test
    public void test2351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2351");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(10400, 108640);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test2352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2352");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(2080, 260);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2080 + "'", int2 == 2080);
    }

    @Test
    public void test2353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2353");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(416, 77600);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1008800 + "'", int2 == 1008800);
    }

    @Test
    public void test2354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2354");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((-1), (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test2355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2355");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(5600, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 72800 + "'", int2 == 72800);
    }

    @Test
    public void test2356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2356");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(160, 1120);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1120 + "'", int2 == 1120);
    }

    @Test
    public void test2357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2357");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(77600, 5044);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1008800 + "'", int2 == 1008800);
    }

    @Test
    public void test2358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2358");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1412320, 10400);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test2359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2359");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(3395, 15520);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 108640 + "'", int2 == 108640);
    }

    @Test
    public void test2360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2360");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(52, 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1820 + "'", int2 == 1820);
    }

    @Test
    public void test2361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2361");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(35, 10400);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 72800 + "'", int2 == 72800);
    }

    @Test
    public void test2362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2362");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) '#', 201760);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1412320 + "'", int2 == 1412320);
    }

    @Test
    public void test2363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2363");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(10, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test2364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2364");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) -1, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2365");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(5600, 1008800);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test2366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2366");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(2080, 882700);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test2367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2367");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) '4', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2368");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(14560, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 72800 + "'", int2 == 72800);
    }

    @Test
    public void test2369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2369");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(52, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test2370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2370");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) 100, 970);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9700 + "'", int2 == 9700);
    }

    @Test
    public void test2371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2371");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(10, 40352);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 201760 + "'", int2 == 201760);
    }

    @Test
    public void test2372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2372");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(3395, 700);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 67900 + "'", int2 == 67900);
    }

    @Test
    public void test2373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2373");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(32, 108640);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 108640 + "'", int2 == 108640);
    }

    @Test
    public void test2374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2374");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(52, 10400);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10400 + "'", int2 == 10400);
    }

    @Test
    public void test2375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2375");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((-1), (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2376");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(14560, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 14560 + "'", int2 == 14560);
    }

    @Test
    public void test2377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2377");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(77600, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 77600 + "'", int2 == 77600);
    }

    @Test
    public void test2378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2378");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(882700, 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 882700 + "'", int2 == 882700);
    }

    @Test
    public void test2379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2379");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1120, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 108640 + "'", int2 == 108640);
    }

    @Test
    public void test2380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2380");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(32, 3104);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3104 + "'", int2 == 3104);
    }

    @Test
    public void test2381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2381");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(416, 5600);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 72800 + "'", int2 == 72800);
    }

    @Test
    public void test2382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2382");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(126100, 9700);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 126100 + "'", int2 == 126100);
    }

    @Test
    public void test2383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2383");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) 0, 6790);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2384");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) ' ', 1008800);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1008800 + "'", int2 == 1008800);
    }

    @Test
    public void test2385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2385");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(3104, 70);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 108640 + "'", int2 == 108640);
    }

    @Test
    public void test2386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2386");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(15520, 1300);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1008800 + "'", int2 == 1008800);
    }

    @Test
    public void test2387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2387");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(5044, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 25220 + "'", int2 == 25220);
    }

    @Test
    public void test2388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2388");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(10400, 9700);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1008800 + "'", int2 == 1008800);
    }

    @Test
    public void test2389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2389");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) 1, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test2390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2390");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(5600, 1820);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 72800 + "'", int2 == 72800);
    }

    @Test
    public void test2391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2391");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) 1, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test2392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2392");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(9700, 5600);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 543200 + "'", int2 == 543200);
    }

    @Test
    public void test2393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2393");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(77600, 3104);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 77600 + "'", int2 == 77600);
    }

    @Test
    public void test2394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2394");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(882700, 9100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 882700 + "'", int2 == 882700);
    }

    @Test
    public void test2395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2395");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) 100, 1120);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5600 + "'", int2 == 5600);
    }

    @Test
    public void test2396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2396");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((-1), 7061600);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test2397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2397");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(67900, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 67900 + "'", int2 == 67900);
    }

    @Test
    public void test2398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2398");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(67900, 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 543200 + "'", int2 == 543200);
    }

    @Test
    public void test2399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2399");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(25220, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 25220 + "'", int2 == 25220);
    }

    @Test
    public void test2400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2400");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) '4', 970);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 25220 + "'", int2 == 25220);
    }

    @Test
    public void test2401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2401");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(9700, 2080);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1008800 + "'", int2 == 1008800);
    }

    @Test
    public void test2402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2402");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) '4', 800);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10400 + "'", int2 == 10400);
    }

    @Test
    public void test2403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2403");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) 1, 201760);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 201760 + "'", int2 == 201760);
    }

    @Test
    public void test2404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2404");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(40352, 25220);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 201760 + "'", int2 == 201760);
    }

    @Test
    public void test2405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2405");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(52, 9100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9100 + "'", int2 == 9100);
    }

    @Test
    public void test2406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2406");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(543200, 3395);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 543200 + "'", int2 == 543200);
    }

    @Test
    public void test2407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2407");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) ' ', 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1120 + "'", int2 == 1120);
    }

    @Test
    public void test2408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2408");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(416, 700);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 72800 + "'", int2 == 72800);
    }

    @Test
    public void test2409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2409");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(543200, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 543200 + "'", int2 == 543200);
    }

    @Test
    public void test2410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2410");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) 100, 3104);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 77600 + "'", int2 == 77600);
    }

    @Test
    public void test2411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2411");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(40352, 1412320);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1412320 + "'", int2 == 1412320);
    }

    @Test
    public void test2412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2412");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test2413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2413");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(25220, 160);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 201760 + "'", int2 == 201760);
    }

    @Test
    public void test2414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2414");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(7061600, 1300);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test2415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2415");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(416, 543200);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test2416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2416");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(67900, 10400);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test2417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2417");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(9700, 67900);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 67900 + "'", int2 == 67900);
    }

    @Test
    public void test2418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2418");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(25220, 800);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1008800 + "'", int2 == 1008800);
    }

    @Test
    public void test2419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2419");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(882700, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 882700 + "'", int2 == 882700);
    }

    @Test
    public void test2420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2420");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) 100, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test2421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2421");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(800, 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5600 + "'", int2 == 5600);
    }

    @Test
    public void test2422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2422");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(97, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 970 + "'", int2 == 970);
    }

    @Test
    public void test2423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2423");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) 100, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test2424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2424");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((-1), 108640);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 108640 + "'", int2 == 108640);
    }

    @Test
    public void test2425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2425");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(100, 5600);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5600 + "'", int2 == 5600);
    }

    @Test
    public void test2426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2426");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(77600, 260);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1008800 + "'", int2 == 1008800);
    }

    @Test
    public void test2427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2427");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((-1), 160);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 160 + "'", int2 == 160);
    }

    @Test
    public void test2428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2428");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1008800, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1008800 + "'", int2 == 1008800);
    }

    @Test
    public void test2429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2429");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(700, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2430");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(176540, 5600);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test2431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2431");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(15520, 800);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 77600 + "'", int2 == 77600);
    }

    @Test
    public void test2432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2432");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(77600, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 77600 + "'", int2 == 77600);
    }

    @Test
    public void test2433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2433");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) 100, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 800 + "'", int2 == 800);
    }

    @Test
    public void test2434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2434");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(543200, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 543200 + "'", int2 == 543200);
    }

    @Test
    public void test2435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2435");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1300, 700);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9100 + "'", int2 == 9100);
    }

    @Test
    public void test2436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2436");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(800, 6790);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 543200 + "'", int2 == 543200);
    }

    @Test
    public void test2437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2437");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(40352, 9100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test2438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2438");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(15520, 1008800);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1008800 + "'", int2 == 1008800);
    }

    @Test
    public void test2439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2439");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) -1, 67900);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 67900 + "'", int2 == 67900);
    }

    @Test
    public void test2440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2440");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(176540, 77600);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test2441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2441");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1820, 40352);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1412320 + "'", int2 == 1412320);
    }

    @Test
    public void test2442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2442");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(6790, 7061600);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test2443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2443");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(67900, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 67900 + "'", int2 == 67900);
    }

    @Test
    public void test2444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2444");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) -1, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2445");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) -1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2446");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1120, 1008800);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test2447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2447");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1412320, 416);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1412320 + "'", int2 == 1412320);
    }

    @Test
    public void test2448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2448");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(3104, 7061600);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test2449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2449");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) -1, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test2450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2450");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(40352, 70);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1412320 + "'", int2 == 1412320);
    }

    @Test
    public void test2451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2451");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(35, 882700);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 882700 + "'", int2 == 882700);
    }

    @Test
    public void test2452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2452");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1008800, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1008800 + "'", int2 == 1008800);
    }

    @Test
    public void test2453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2453");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1120, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5600 + "'", int2 == 5600);
    }

    @Test
    public void test2454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2454");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(700, 25220);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 882700 + "'", int2 == 882700);
    }

    @Test
    public void test2455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2455");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) 100, 5044);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 126100 + "'", int2 == 126100);
    }

    @Test
    public void test2456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2456");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1120, 3104);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 108640 + "'", int2 == 108640);
    }

    @Test
    public void test2457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2457");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(9100, 700);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9100 + "'", int2 == 9100);
    }

    @Test
    public void test2458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2458");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(72800, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 72800 + "'", int2 == 72800);
    }

    @Test
    public void test2459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2459");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(970, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 970 + "'", int2 == 970);
    }

    @Test
    public void test2460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2460");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(7061600, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2461");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) 'a', (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test2462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2462");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(700, 970);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 67900 + "'", int2 == 67900);
    }

    @Test
    public void test2463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2463");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(40352, 260);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 201760 + "'", int2 == 201760);
    }

    @Test
    public void test2464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2464");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) 10, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test2465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2465");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(6790, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6790 + "'", int2 == 6790);
    }

    @Test
    public void test2466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2466");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(25220, 201760);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 201760 + "'", int2 == 201760);
    }

    @Test
    public void test2467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2467");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(543200, 77600);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 543200 + "'", int2 == 543200);
    }

    @Test
    public void test2468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2468");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(67900, 70);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 67900 + "'", int2 == 67900);
    }

    @Test
    public void test2469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2469");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(9700, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9700 + "'", int2 == 9700);
    }

    @Test
    public void test2470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2470");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(2080, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2080 + "'", int2 == 2080);
    }

    @Test
    public void test2471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2471");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) 1, 176540);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 176540 + "'", int2 == 176540);
    }

    @Test
    public void test2472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2472");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(72800, 6790);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test2473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2473");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(100, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test2474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2474");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(14560, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 14560 + "'", int2 == 14560);
    }

    @Test
    public void test2475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2475");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(70, 970);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6790 + "'", int2 == 6790);
    }

    @Test
    public void test2476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2476");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(9100, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9100 + "'", int2 == 9100);
    }

    @Test
    public void test2477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2477");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(3104, 970);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15520 + "'", int2 == 15520);
    }

    @Test
    public void test2478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2478");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(70, 9700);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 67900 + "'", int2 == 67900);
    }

    @Test
    public void test2479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2479");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) 10, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test2480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2480");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((-1), 40352);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 40352 + "'", int2 == 40352);
    }

    @Test
    public void test2481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2481");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(201760, 9100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test2482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2482");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(260, 3104);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 201760 + "'", int2 == 201760);
    }

    @Test
    public void test2483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2483");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) '4', 2080);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2080 + "'", int2 == 2080);
    }

    @Test
    public void test2484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2484");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(3395, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 108640 + "'", int2 == 108640);
    }

    @Test
    public void test2485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2485");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(100, 9700);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9700 + "'", int2 == 9700);
    }

    @Test
    public void test2486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2486");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(160, 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2080 + "'", int2 == 2080);
    }

    @Test
    public void test2487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2487");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(10, 15520);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15520 + "'", int2 == 15520);
    }

    @Test
    public void test2488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2488");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(176540, 3395);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 176540 + "'", int2 == 176540);
    }

    @Test
    public void test2489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2489");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(2080, 3395);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1412320 + "'", int2 == 1412320);
    }

    @Test
    public void test2490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2490");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) -1, 416);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 416 + "'", int2 == 416);
    }

    @Test
    public void test2491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2491");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(416, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 416 + "'", int2 == 416);
    }

    @Test
    public void test2492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2492");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) 1, 1008800);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1008800 + "'", int2 == 1008800);
    }

    @Test
    public void test2493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2493");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1008800, 15520);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1008800 + "'", int2 == 1008800);
    }

    @Test
    public void test2494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2494");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(9700, 7061600);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test2495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2495");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(72800, 176540);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test2496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2496");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(176540, 416);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1412320 + "'", int2 == 1412320);
    }

    @Test
    public void test2497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2497");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(14560, 40352);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1412320 + "'", int2 == 1412320);
    }

    @Test
    public void test2498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2498");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(32, 72800);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 72800 + "'", int2 == 72800);
    }

    @Test
    public void test2499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2499");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(9100, 543200);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test2500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2500");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(126100, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 126100 + "'", int2 == 126100);
    }
}

