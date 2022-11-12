package maths.LeastCommonMultiple;

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
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(6790, 1008800);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3002");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(176540, 201760);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1412320 + "'", int2 == 1412320);
    }

    @Test
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3003");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1412320, 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1412320 + "'", int2 == 1412320);
    }

    @Test
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3004");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) 1, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3005");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) '4', 126100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 126100 + "'", int2 == 126100);
    }

    @Test
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3006");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(800, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 800 + "'", int2 == 800);
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3007");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) '4', 201760);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 201760 + "'", int2 == 201760);
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3008");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(3104, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3104 + "'", int2 == 3104);
    }

    @Test
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3009");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) '4', 14560);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 14560 + "'", int2 == 14560);
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3010");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(9100, 1008800);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3011");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(5044, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5044 + "'", int2 == 5044);
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3012");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(201760, 3104);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 201760 + "'", int2 == 201760);
    }

    @Test
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3013");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(52, 416);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 416 + "'", int2 == 416);
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3014");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) 100, 3104);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 77600 + "'", int2 == 77600);
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3015");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(25220, 25220);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 25220 + "'", int2 == 25220);
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3016");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((-1), 176540);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 176540 + "'", int2 == 176540);
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3017");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1300, 800);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10400 + "'", int2 == 10400);
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3018");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(5044, 260);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 25220 + "'", int2 == 25220);
    }

    @Test
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3019");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) 0, 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3020");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) -1, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3021");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(700, 6790);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 67900 + "'", int2 == 67900);
    }

    @Test
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3022");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) 10, (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 70 + "'", int2 == 70);
    }

    @Test
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3023");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1, 201760);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 201760 + "'", int2 == 201760);
    }

    @Test
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3024");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(108640, 5044);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1412320 + "'", int2 == 1412320);
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3025");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(160, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 160 + "'", int2 == 160);
    }

    @Test
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3026");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(201760, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 201760 + "'", int2 == 201760);
    }

    @Test
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3027");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(700, 1120);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5600 + "'", int2 == 5600);
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3028");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(40352, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 40352 + "'", int2 == 40352);
    }

    @Test
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3029");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(97, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3030");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) 10, 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 160 + "'", int2 == 160);
    }

    @Test
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3031");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(67900, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 882700 + "'", int2 == 882700);
    }

    @Test
    public void test3032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3032");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(77600, 67900);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 543200 + "'", int2 == 543200);
    }

    @Test
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3033");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((-1), 67900);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 67900 + "'", int2 == 67900);
    }

    @Test
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3034");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(970, 5600);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 543200 + "'", int2 == 543200);
    }

    @Test
    public void test3035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3035");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(260, 9100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9100 + "'", int2 == 9100);
    }

    @Test
    public void test3036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3036");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(9100, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9100 + "'", int2 == 9100);
    }

    @Test
    public void test3037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3037");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) 'a', 6790);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6790 + "'", int2 == 6790);
    }

    @Test
    public void test3038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3038");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(201760, 72800);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3039");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(416, 40352);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 40352 + "'", int2 == 40352);
    }

    @Test
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3040");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(176540, 108640);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1412320 + "'", int2 == 1412320);
    }

    @Test
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3041");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(108640, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 108640 + "'", int2 == 108640);
    }

    @Test
    public void test3042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3042");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(40352, 1300);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1008800 + "'", int2 == 1008800);
    }

    @Test
    public void test3043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3043");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(32, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test3044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3044");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1820, 160);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 14560 + "'", int2 == 14560);
    }

    @Test
    public void test3045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3045");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(32, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test3046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3046");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(100, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test3047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3047");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(40352, 5600);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test3048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3048");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) -1, 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test3049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3049");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) 1, 543200);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 543200 + "'", int2 == 543200);
    }

    @Test
    public void test3050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3050");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(6790, 40352);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1412320 + "'", int2 == 1412320);
    }

    @Test
    public void test3051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3051");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(9700, 3395);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 67900 + "'", int2 == 67900);
    }

    @Test
    public void test3052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3052");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) '4', 70);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1820 + "'", int2 == 1820);
    }

    @Test
    public void test3053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3053");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(176540, 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 176540 + "'", int2 == 176540);
    }

    @Test
    public void test3054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3054");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) '#', 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test3055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3055");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((-1), 3395);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3395 + "'", int2 == 3395);
    }

    @Test
    public void test3056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3056");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(201760, 1008800);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1008800 + "'", int2 == 1008800);
    }

    @Test
    public void test3057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3057");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) 1, 14560);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 14560 + "'", int2 == 14560);
    }

    @Test
    public void test3058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3058");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(970, 77600);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 77600 + "'", int2 == 77600);
    }

    @Test
    public void test3059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3059");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(126100, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 126100 + "'", int2 == 126100);
    }

    @Test
    public void test3060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3060");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) 10, 108640);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 108640 + "'", int2 == 108640);
    }

    @Test
    public void test3061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3061");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) 0, 1008800);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3062");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(2080, 700);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 72800 + "'", int2 == 72800);
    }

    @Test
    public void test3063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3063");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(7061600, 160);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test3064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3064");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(176540, 970);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 176540 + "'", int2 == 176540);
    }

    @Test
    public void test3065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3065");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(7061600, 176540);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test3066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3066");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(800, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 800 + "'", int2 == 800);
    }

    @Test
    public void test3067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3067");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(67900, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 67900 + "'", int2 == 67900);
    }

    @Test
    public void test3068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3068");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(72800, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3069");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(800, 5044);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1008800 + "'", int2 == 1008800);
    }

    @Test
    public void test3070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3070");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(882700, (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 882700 + "'", int2 == 882700);
    }

    @Test
    public void test3071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3071");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) 10, 9100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9100 + "'", int2 == 9100);
    }

    @Test
    public void test3072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3072");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(70, 2080);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 14560 + "'", int2 == 14560);
    }

    @Test
    public void test3073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3073");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) 0, 800);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3074");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(40352, 15520);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 201760 + "'", int2 == 201760);
    }

    @Test
    public void test3075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3075");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(2080, 9100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 72800 + "'", int2 == 72800);
    }

    @Test
    public void test3076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3076");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(70, 7061600);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test3077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3077");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(5600, (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5600 + "'", int2 == 5600);
    }

    @Test
    public void test3078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3078");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) 'a', 9100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 882700 + "'", int2 == 882700);
    }

    @Test
    public void test3079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3079");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(5600, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 543200 + "'", int2 == 543200);
    }

    @Test
    public void test3080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3080");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) '4', (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1820 + "'", int2 == 1820);
    }

    @Test
    public void test3081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3081");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1300, 1820);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9100 + "'", int2 == 9100);
    }

    @Test
    public void test3082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3082");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1120, 3395);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 108640 + "'", int2 == 108640);
    }

    @Test
    public void test3083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3083");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(3395, 108640);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 108640 + "'", int2 == 108640);
    }

    @Test
    public void test3084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3084");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(970, 1820);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 176540 + "'", int2 == 176540);
    }

    @Test
    public void test3085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3085");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1, 9700);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9700 + "'", int2 == 9700);
    }

    @Test
    public void test3086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3086");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(10, 201760);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 201760 + "'", int2 == 201760);
    }

    @Test
    public void test3087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3087");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1412320, 70);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1412320 + "'", int2 == 1412320);
    }

    @Test
    public void test3088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3088");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(35, 9700);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 67900 + "'", int2 == 67900);
    }

    @Test
    public void test3089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3089");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(5600, 3395);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 543200 + "'", int2 == 543200);
    }

    @Test
    public void test3090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3090");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1412320, 40352);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1412320 + "'", int2 == 1412320);
    }

    @Test
    public void test3091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3091");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(882700, 70);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 882700 + "'", int2 == 882700);
    }

    @Test
    public void test3092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3092");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(77600, 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1008800 + "'", int2 == 1008800);
    }

    @Test
    public void test3093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3093");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1008800, 800);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1008800 + "'", int2 == 1008800);
    }

    @Test
    public void test3094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3094");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(970, 3104);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15520 + "'", int2 == 15520);
    }

    @Test
    public void test3095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3095");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(800, 1300);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10400 + "'", int2 == 10400);
    }

    @Test
    public void test3096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3096");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1008800, 108640);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test3097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3097");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(126100, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 126100 + "'", int2 == 126100);
    }

    @Test
    public void test3098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3098");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) 0, 14560);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3099");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(970, (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6790 + "'", int2 == 6790);
    }

    @Test
    public void test3100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3100");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(35, 40352);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1412320 + "'", int2 == 1412320);
    }

    @Test
    public void test3101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3101");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) 0, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3102");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) 100, 15520);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 77600 + "'", int2 == 77600);
    }

    @Test
    public void test3103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3103");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(160, 260);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2080 + "'", int2 == 2080);
    }

    @Test
    public void test3104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3104");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(176540, 260);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 176540 + "'", int2 == 176540);
    }

    @Test
    public void test3105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3105");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(100, 3395);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 67900 + "'", int2 == 67900);
    }

    @Test
    public void test3106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3106");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(70, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 70 + "'", int2 == 70);
    }

    @Test
    public void test3107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3107");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(201760, 25220);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 201760 + "'", int2 == 201760);
    }

    @Test
    public void test3108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3108");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1008800, 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1008800 + "'", int2 == 1008800);
    }

    @Test
    public void test3109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3109");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) -1, 9100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9100 + "'", int2 == 9100);
    }

    @Test
    public void test3110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3110");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) 1, 3104);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3104 + "'", int2 == 3104);
    }

    @Test
    public void test3111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3111");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) 0, 1120);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3112");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) 0, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3113");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1412320, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test3114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3114");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(72800, 2080);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 72800 + "'", int2 == 72800);
    }

    @Test
    public void test3115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3115");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(9100, 9700);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 882700 + "'", int2 == 882700);
    }

    @Test
    public void test3116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3116");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(35, 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1120 + "'", int2 == 1120);
    }

    @Test
    public void test3117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3117");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) 10, 882700);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 882700 + "'", int2 == 882700);
    }

    @Test
    public void test3118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3118");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1820, 543200);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test3119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3119");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1120, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1120 + "'", int2 == 1120);
    }

    @Test
    public void test3120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3120");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(5600, 70);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5600 + "'", int2 == 5600);
    }

    @Test
    public void test3121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3121");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(25220, 126100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 126100 + "'", int2 == 126100);
    }

    @Test
    public void test3122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3122");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) -1, 1120);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1120 + "'", int2 == 1120);
    }

    @Test
    public void test3123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3123");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(7061600, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test3124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3124");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(260, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 260 + "'", int2 == 260);
    }

    @Test
    public void test3125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3125");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(70, 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 70 + "'", int2 == 70);
    }

    @Test
    public void test3126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3126");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(126100, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 126100 + "'", int2 == 126100);
    }

    @Test
    public void test3127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3127");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(72800, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 72800 + "'", int2 == 72800);
    }

    @Test
    public void test3128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3128");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(260, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2080 + "'", int2 == 2080);
    }

    @Test
    public void test3129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3129");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(6790, 1412320);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1412320 + "'", int2 == 1412320);
    }

    @Test
    public void test3130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3130");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) -1, 1300);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1300 + "'", int2 == 1300);
    }

    @Test
    public void test3131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3131");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(25220, 2080);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 201760 + "'", int2 == 201760);
    }

    @Test
    public void test3132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3132");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(3395, 70);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6790 + "'", int2 == 6790);
    }

    @Test
    public void test3133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3133");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(6790, 416);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1412320 + "'", int2 == 1412320);
    }

    @Test
    public void test3134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3134");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(9700, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9700 + "'", int2 == 9700);
    }

    @Test
    public void test3135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3135");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(108640, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 543200 + "'", int2 == 543200);
    }

    @Test
    public void test3136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3136");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1008800, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1008800 + "'", int2 == 1008800);
    }

    @Test
    public void test3137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3137");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(10400, 1008800);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1008800 + "'", int2 == 1008800);
    }

    @Test
    public void test3138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3138");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(15520, 14560);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1412320 + "'", int2 == 1412320);
    }

    @Test
    public void test3139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3139");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) 0, 10400);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3140");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(5044, 108640);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1412320 + "'", int2 == 1412320);
    }

    @Test
    public void test3141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3141");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) '4', (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test3142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3142");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) -1, 6790);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6790 + "'", int2 == 6790);
    }

    @Test
    public void test3143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3143");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(14560, 160);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 14560 + "'", int2 == 14560);
    }

    @Test
    public void test3144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3144");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(9700, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9700 + "'", int2 == 9700);
    }

    @Test
    public void test3145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3145");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(882700, 2080);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test3146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3146");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(2080, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2080 + "'", int2 == 2080);
    }

    @Test
    public void test3147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3147");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) -1, 2080);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2080 + "'", int2 == 2080);
    }

    @Test
    public void test3148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3148");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(260, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1300 + "'", int2 == 1300);
    }

    @Test
    public void test3149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3149");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1412320, 67900);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test3150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3150");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(5044, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 25220 + "'", int2 == 25220);
    }

    @Test
    public void test3151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3151");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) 'a', 416);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 40352 + "'", int2 == 40352);
    }

    @Test
    public void test3152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3152");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(882700, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 882700 + "'", int2 == 882700);
    }

    @Test
    public void test3153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3153");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(160, (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1120 + "'", int2 == 1120);
    }

    @Test
    public void test3154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3154");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((-1), (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test3155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3155");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(176540, 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 176540 + "'", int2 == 176540);
    }

    @Test
    public void test3156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3156");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) 0, 970);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3157");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) 0, 5044);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3158");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(52, 15520);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 201760 + "'", int2 == 201760);
    }

    @Test
    public void test3159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3159");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(5600, 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5600 + "'", int2 == 5600);
    }

    @Test
    public void test3160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3160");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(543200, 160);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 543200 + "'", int2 == 543200);
    }

    @Test
    public void test3161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3161");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) '4', 7061600);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test3162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3162");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(10, 1008800);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1008800 + "'", int2 == 1008800);
    }

    @Test
    public void test3163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3163");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(77600, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 77600 + "'", int2 == 77600);
    }

    @Test
    public void test3164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3164");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) 'a', (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5044 + "'", int2 == 5044);
    }

    @Test
    public void test3165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3165");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(5600, 25220);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test3166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3166");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(5044, 3104);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 40352 + "'", int2 == 40352);
    }

    @Test
    public void test3167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3167");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(25220, 10400);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1008800 + "'", int2 == 1008800);
    }

    @Test
    public void test3168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3168");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1120, 6790);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 108640 + "'", int2 == 108640);
    }

    @Test
    public void test3169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3169");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(9100, 77600);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test3170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3170");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(72800, 416);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 72800 + "'", int2 == 72800);
    }

    @Test
    public void test3171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3171");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(2080, 1820);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 14560 + "'", int2 == 14560);
    }

    @Test
    public void test3172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3172");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(416, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2080 + "'", int2 == 2080);
    }

    @Test
    public void test3173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3173");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(40352, 1008800);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1008800 + "'", int2 == 1008800);
    }

    @Test
    public void test3174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3174");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) 0, 77600);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3175");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(7061600, 40352);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test3176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3176");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(9100, 25220);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 882700 + "'", int2 == 882700);
    }

    @Test
    public void test3177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3177");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(70, 10400);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 72800 + "'", int2 == 72800);
    }

    @Test
    public void test3178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3178");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(15520, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15520 + "'", int2 == 15520);
    }

    @Test
    public void test3179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3179");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(72800, 9100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 72800 + "'", int2 == 72800);
    }

    @Test
    public void test3180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3180");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(10, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test3181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3181");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1300, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1300 + "'", int2 == 1300);
    }

    @Test
    public void test3182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3182");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(40352, 6790);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1412320 + "'", int2 == 1412320);
    }

    @Test
    public void test3183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3183");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(160, 800);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 800 + "'", int2 == 800);
    }

    @Test
    public void test3184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3184");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(35, 700);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 700 + "'", int2 == 700);
    }

    @Test
    public void test3185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3185");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) ' ', 800);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 800 + "'", int2 == 800);
    }

    @Test
    public void test3186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3186");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1, 1008800);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1008800 + "'", int2 == 1008800);
    }

    @Test
    public void test3187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3187");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(14560, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 14560 + "'", int2 == 14560);
    }

    @Test
    public void test3188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3188");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) 'a', 14560);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1412320 + "'", int2 == 1412320);
    }

    @Test
    public void test3189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3189");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) '4', 1412320);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1412320 + "'", int2 == 1412320);
    }

    @Test
    public void test3190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3190");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1300, 1120);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 72800 + "'", int2 == 72800);
    }

    @Test
    public void test3191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3191");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) 0, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3192");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) 10, 25220);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 25220 + "'", int2 == 25220);
    }

    @Test
    public void test3193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3193");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) 100, 25220);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 126100 + "'", int2 == 126100);
    }

    @Test
    public void test3194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3194");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(700, 416);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 72800 + "'", int2 == 72800);
    }

    @Test
    public void test3195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3195");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(15520, 72800);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test3196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3196");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) ' ', (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test3197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3197");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1008800, 70);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test3198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3198");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1008800, 416);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1008800 + "'", int2 == 1008800);
    }

    @Test
    public void test3199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3199");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(9700, 5044);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 126100 + "'", int2 == 126100);
    }

    @Test
    public void test3200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3200");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(100, 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 800 + "'", int2 == 800);
    }

    @Test
    public void test3201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3201");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1120, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5600 + "'", int2 == 5600);
    }

    @Test
    public void test3202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3202");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(160, 1300);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10400 + "'", int2 == 10400);
    }

    @Test
    public void test3203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3203");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1120, 77600);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 543200 + "'", int2 == 543200);
    }

    @Test
    public void test3204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3204");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(97, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9700 + "'", int2 == 9700);
    }

    @Test
    public void test3205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3205");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) ' ', (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 160 + "'", int2 == 160);
    }

    @Test
    public void test3206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3206");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(126100, 7061600);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test3207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3207");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(108640, 1412320);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1412320 + "'", int2 == 1412320);
    }

    @Test
    public void test3208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3208");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(9700, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9700 + "'", int2 == 9700);
    }

    @Test
    public void test3209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3209");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(67900, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 67900 + "'", int2 == 67900);
    }

    @Test
    public void test3210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3210");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(543200, 7061600);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test3211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3211");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) 1, 15520);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15520 + "'", int2 == 15520);
    }

    @Test
    public void test3212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3212");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) 100, 160);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 800 + "'", int2 == 800);
    }

    @Test
    public void test3213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3213");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(35, 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3395 + "'", int2 == 3395);
    }

    @Test
    public void test3214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3214");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(32, 2080);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2080 + "'", int2 == 2080);
    }

    @Test
    public void test3215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3215");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(10, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test3216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3216");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) 100, 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 800 + "'", int2 == 800);
    }

    @Test
    public void test3217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3217");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(700, 1412320);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test3218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3218");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) 100, 700);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 700 + "'", int2 == 700);
    }

    @Test
    public void test3219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3219");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(882700, 260);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 882700 + "'", int2 == 882700);
    }

    @Test
    public void test3220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3220");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(700, 800);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5600 + "'", int2 == 5600);
    }

    @Test
    public void test3221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3221");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(70, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1120 + "'", int2 == 1120);
    }

    @Test
    public void test3222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3222");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(77600, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 77600 + "'", int2 == 77600);
    }

    @Test
    public void test3223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3223");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(7061600, 70);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test3224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3224");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(67900, 77600);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 543200 + "'", int2 == 543200);
    }

    @Test
    public void test3225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3225");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(108640, 2080);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1412320 + "'", int2 == 1412320);
    }

    @Test
    public void test3226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3226");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) 0, 7061600);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3227");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) 100, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test3228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3228");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(970, 882700);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 882700 + "'", int2 == 882700);
    }

    @Test
    public void test3229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3229");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(970, 416);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 201760 + "'", int2 == 201760);
    }

    @Test
    public void test3230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3230");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(7061600, 77600);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test3231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3231");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(5600, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5600 + "'", int2 == 5600);
    }

    @Test
    public void test3232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3232");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(6790, 800);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 543200 + "'", int2 == 543200);
    }

    @Test
    public void test3233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3233");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(70, 72800);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 72800 + "'", int2 == 72800);
    }

    @Test
    public void test3234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3234");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) 0, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3235");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) 100, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test3236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3236");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(416, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 416 + "'", int2 == 416);
    }

    @Test
    public void test3237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3237");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(72800, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 72800 + "'", int2 == 72800);
    }

    @Test
    public void test3238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3238");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) 0, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3239");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(3104, 416);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 40352 + "'", int2 == 40352);
    }

    @Test
    public void test3240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3240");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((-1), 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test3241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3241");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1820, 5600);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 72800 + "'", int2 == 72800);
    }

    @Test
    public void test3242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3242");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) 1, 126100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 126100 + "'", int2 == 126100);
    }

    @Test
    public void test3243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3243");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) '4', (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5044 + "'", int2 == 5044);
    }

    @Test
    public void test3244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3244");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(10, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 970 + "'", int2 == 970);
    }

    @Test
    public void test3245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3245");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(97, 5600);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 543200 + "'", int2 == 543200);
    }

    @Test
    public void test3246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3246");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(97, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test3247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3247");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(260, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 260 + "'", int2 == 260);
    }

    @Test
    public void test3248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3248");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(100, 882700);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 882700 + "'", int2 == 882700);
    }

    @Test
    public void test3249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3249");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(160, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 160 + "'", int2 == 160);
    }

    @Test
    public void test3250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3250");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(52, 77600);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1008800 + "'", int2 == 1008800);
    }

    @Test
    public void test3251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3251");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) '#', 10400);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 72800 + "'", int2 == 72800);
    }

    @Test
    public void test3252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3252");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(52, 970);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 25220 + "'", int2 == 25220);
    }

    @Test
    public void test3253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3253");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(32, 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 416 + "'", int2 == 416);
    }

    @Test
    public void test3254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3254");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1412320, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test3255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3255");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(5044, 70);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 176540 + "'", int2 == 176540);
    }

    @Test
    public void test3256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3256");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(5600, 1412320);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test3257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3257");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) 10, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test3258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3258");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1820, 1300);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9100 + "'", int2 == 9100);
    }

    @Test
    public void test3259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3259");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1008800, 1008800);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1008800 + "'", int2 == 1008800);
    }

    @Test
    public void test3260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3260");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(35, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3261");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) '4', (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 260 + "'", int2 == 260);
    }

    @Test
    public void test3262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3262");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) 0, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3263");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) 100, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test3264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3264");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(6790, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 67900 + "'", int2 == 67900);
    }

    @Test
    public void test3265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3265");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(700, 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5600 + "'", int2 == 5600);
    }

    @Test
    public void test3266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3266");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(70, 882700);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 882700 + "'", int2 == 882700);
    }

    @Test
    public void test3267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3267");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(543200, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 543200 + "'", int2 == 543200);
    }

    @Test
    public void test3268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3268");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) -1, 72800);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 72800 + "'", int2 == 72800);
    }

    @Test
    public void test3269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3269");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(5600, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5600 + "'", int2 == 5600);
    }

    @Test
    public void test3270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3270");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(882700, 3104);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test3271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3271");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) 0, 15520);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3272");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) '#', 72800);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 72800 + "'", int2 == 72800);
    }

    @Test
    public void test3273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3273");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(72800, 1820);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 72800 + "'", int2 == 72800);
    }

    @Test
    public void test3274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3274");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(201760, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 201760 + "'", int2 == 201760);
    }

    @Test
    public void test3275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3275");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) -1, 10400);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10400 + "'", int2 == 10400);
    }

    @Test
    public void test3276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3276");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(15520, 67900);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 543200 + "'", int2 == 543200);
    }

    @Test
    public void test3277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3277");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) -1, 6790);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6790 + "'", int2 == 6790);
    }

    @Test
    public void test3278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3278");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(100, 2080);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10400 + "'", int2 == 10400);
    }

    @Test
    public void test3279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3279");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(6790, 9700);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 67900 + "'", int2 == 67900);
    }

    @Test
    public void test3280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3280");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) 1, 10400);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10400 + "'", int2 == 10400);
    }

    @Test
    public void test3281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3281");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(100, 1120);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5600 + "'", int2 == 5600);
    }

    @Test
    public void test3282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3282");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(100, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test3283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3283");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(10400, 14560);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 72800 + "'", int2 == 72800);
    }

    @Test
    public void test3284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3284");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(126100, 67900);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 882700 + "'", int2 == 882700);
    }

    @Test
    public void test3285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3285");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) 100, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test3286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3286");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(9700, 3104);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 77600 + "'", int2 == 77600);
    }

    @Test
    public void test3287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3287");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(543200, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 543200 + "'", int2 == 543200);
    }

    @Test
    public void test3288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3288");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(10400, 1412320);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test3289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3289");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(15520, 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15520 + "'", int2 == 15520);
    }

    @Test
    public void test3290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3290");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(70, 14560);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 14560 + "'", int2 == 14560);
    }

    @Test
    public void test3291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3291");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(260, 1820);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1820 + "'", int2 == 1820);
    }

    @Test
    public void test3292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3292");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) ' ', (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 800 + "'", int2 == 800);
    }

    @Test
    public void test3293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3293");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) 0, (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3294");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(260, (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1820 + "'", int2 == 1820);
    }

    @Test
    public void test3295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3295");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(882700, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 882700 + "'", int2 == 882700);
    }

    @Test
    public void test3296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3296");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) 10, 201760);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 201760 + "'", int2 == 201760);
    }

    @Test
    public void test3297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3297");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(2080, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2080 + "'", int2 == 2080);
    }

    @Test
    public void test3298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3298");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) 100, 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 700 + "'", int2 == 700);
    }

    @Test
    public void test3299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3299");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) 'a', (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 970 + "'", int2 == 970);
    }

    @Test
    public void test3300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3300");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) 0, 67900);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3301");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(9100, 15520);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test3302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3302");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) 10, 416);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2080 + "'", int2 == 2080);
    }

    @Test
    public void test3303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3303");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) 'a', (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 970 + "'", int2 == 970);
    }

    @Test
    public void test3304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3304");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) ' ', 5044);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 40352 + "'", int2 == 40352);
    }

    @Test
    public void test3305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3305");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1120, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3306");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(108640, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 108640 + "'", int2 == 108640);
    }

    @Test
    public void test3307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3307");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(32, 67900);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 543200 + "'", int2 == 543200);
    }

    @Test
    public void test3308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3308");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(160, 2080);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2080 + "'", int2 == 2080);
    }

    @Test
    public void test3309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3309");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(9700, 1820);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 882700 + "'", int2 == 882700);
    }

    @Test
    public void test3310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3310");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) -1, 201760);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 201760 + "'", int2 == 201760);
    }

    @Test
    public void test3311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3311");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(10400, 5600);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 72800 + "'", int2 == 72800);
    }

    @Test
    public void test3312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3312");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(126100, 1820);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 882700 + "'", int2 == 882700);
    }

    @Test
    public void test3313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3313");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(2080, (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 14560 + "'", int2 == 14560);
    }

    @Test
    public void test3314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3314");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1008800, 1820);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test3315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3315");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(970, 108640);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 108640 + "'", int2 == 108640);
    }

    @Test
    public void test3316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3316");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(9700, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9700 + "'", int2 == 9700);
    }

    @Test
    public void test3317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3317");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) 'a', 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test3318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3318");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(100, 1412320);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test3319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3319");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(260, 5600);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 72800 + "'", int2 == 72800);
    }

    @Test
    public void test3320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3320");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(108640, 5600);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 543200 + "'", int2 == 543200);
    }

    @Test
    public void test3321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3321");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(5600, 260);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 72800 + "'", int2 == 72800);
    }

    @Test
    public void test3322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3322");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(126100, 72800);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test3323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3323");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1300, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1300 + "'", int2 == 1300);
    }

    @Test
    public void test3324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3324");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1008800, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1008800 + "'", int2 == 1008800);
    }

    @Test
    public void test3325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3325");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(67900, 1412320);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test3326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3326");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(5044, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5044 + "'", int2 == 5044);
    }

    @Test
    public void test3327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3327");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) -1, 9100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9100 + "'", int2 == 9100);
    }

    @Test
    public void test3328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3328");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) 1, 72800);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 72800 + "'", int2 == 72800);
    }

    @Test
    public void test3329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3329");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) 0, 1300);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3330");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) 'a', (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test3331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3331");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(3104, 10400);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1008800 + "'", int2 == 1008800);
    }

    @Test
    public void test3332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3332");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(40352, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3333");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(7061600, 5600);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test3334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3334");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(52, 176540);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 176540 + "'", int2 == 176540);
    }

    @Test
    public void test3335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3335");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(543200, 1412320);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test3336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3336");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) -1, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test3337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3337");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((-1), (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3338");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(3104, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3104 + "'", int2 == 3104);
    }

    @Test
    public void test3339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3339");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(67900, 40352);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test3340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3340");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(800, 201760);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1008800 + "'", int2 == 1008800);
    }

    @Test
    public void test3341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3341");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) -1, 108640);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 108640 + "'", int2 == 108640);
    }

    @Test
    public void test3342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3342");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) -1, 5600);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5600 + "'", int2 == 5600);
    }

    @Test
    public void test3343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3343");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1820, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 14560 + "'", int2 == 14560);
    }

    @Test
    public void test3344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3344");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1120, 15520);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 108640 + "'", int2 == 108640);
    }

    @Test
    public void test3345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3345");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(260, 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 260 + "'", int2 == 260);
    }

    @Test
    public void test3346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3346");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(10, 126100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 126100 + "'", int2 == 126100);
    }

    @Test
    public void test3347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3347");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(52, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 260 + "'", int2 == 260);
    }

    @Test
    public void test3348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3348");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(700, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3349");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(72800, 543200);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test3350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3350");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(52, 2080);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2080 + "'", int2 == 2080);
    }

    @Test
    public void test3351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3351");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) 'a', 126100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 126100 + "'", int2 == 126100);
    }

    @Test
    public void test3352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3352");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(260, 25220);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 25220 + "'", int2 == 25220);
    }

    @Test
    public void test3353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3353");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(543200, 970);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 543200 + "'", int2 == 543200);
    }

    @Test
    public void test3354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3354");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(52, 72800);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 72800 + "'", int2 == 72800);
    }

    @Test
    public void test3355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3355");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1820, 70);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1820 + "'", int2 == 1820);
    }

    @Test
    public void test3356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3356");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1300, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3357");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(9100, 1412320);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test3358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3358");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(40352, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 40352 + "'", int2 == 40352);
    }

    @Test
    public void test3359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3359");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(14560, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 14560 + "'", int2 == 14560);
    }

    @Test
    public void test3360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3360");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1300, 1008800);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1008800 + "'", int2 == 1008800);
    }

    @Test
    public void test3361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3361");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(9100, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 882700 + "'", int2 == 882700);
    }

    @Test
    public void test3362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3362");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) -1, 10400);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10400 + "'", int2 == 10400);
    }

    @Test
    public void test3363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3363");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) 1, 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test3364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3364");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(5044, 1412320);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1412320 + "'", int2 == 1412320);
    }

    @Test
    public void test3365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3365");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(6790, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 67900 + "'", int2 == 67900);
    }

    @Test
    public void test3366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3366");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(100, 201760);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1008800 + "'", int2 == 1008800);
    }
}

