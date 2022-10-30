package LeastCommonMultiple;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest5 {

    public static boolean debug = false;

    @Test
    public void test2501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2501");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(100, 260);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1300 + "'", int2 == 1300);
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(9700, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9700 + "'", int2 == 9700);
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(2080, 9700);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1008800 + "'", int2 == 1008800);
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(2080, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(0, 9100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(77600, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 77600 + "'", int2 == 77600);
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(15520, 970);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15520 + "'", int2 == 15520);
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(77600, (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 543200 + "'", int2 == 543200);
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(5600, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5600 + "'", int2 == 5600);
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(40352, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 201760 + "'", int2 == 201760);
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(25220, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 25220 + "'", int2 == 25220);
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(3395, 7061600);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) 0, 543200);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(970, 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 970 + "'", int2 == 970);
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(52, 800);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10400 + "'", int2 == 10400);
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2516");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(97, 2080);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 201760 + "'", int2 == 201760);
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(5600, 416);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 72800 + "'", int2 == 72800);
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) 100, 72800);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 72800 + "'", int2 == 72800);
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2519");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(260, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 260 + "'", int2 == 260);
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2520");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(416, 260);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2080 + "'", int2 == 2080);
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2521");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(2080, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2080 + "'", int2 == 2080);
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2522");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) 1, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) 0, 7061600);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(700, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9100 + "'", int2 == 9100);
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2525");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) -1, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2526");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(7061600, 970);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2527");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) 100, 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1300 + "'", int2 == 1300);
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2528");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(52, 1008800);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1008800 + "'", int2 == 1008800);
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) ' ', 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2530");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(416, 160);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2080 + "'", int2 == 2080);
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2531");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(25220, 77600);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1008800 + "'", int2 == 1008800);
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2532");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) 'a', (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3395 + "'", int2 == 3395);
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2533");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(67900, 9100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 882700 + "'", int2 == 882700);
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2534");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(176540, 14560);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1412320 + "'", int2 == 1412320);
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2535");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1, 416);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 416 + "'", int2 == 416);
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2536");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(35, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 70 + "'", int2 == 70);
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2537");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(70, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1820 + "'", int2 == 1820);
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2538");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) -1, 9700);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9700 + "'", int2 == 9700);
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2539");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(70, 700);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 700 + "'", int2 == 700);
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2540");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(35, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 70 + "'", int2 == 70);
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2541");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(100, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2542");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(32, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2543");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(100, 176540);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 882700 + "'", int2 == 882700);
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2544");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2545");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) 1, 5044);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5044 + "'", int2 == 5044);
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2546");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1120, 2080);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 14560 + "'", int2 == 14560);
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2547");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(3104, 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 40352 + "'", int2 == 40352);
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2548");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) ' ', (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 160 + "'", int2 == 160);
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2549");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1412320, 3395);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1412320 + "'", int2 == 1412320);
    }

    @Test
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2550");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(882700, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 882700 + "'", int2 == 882700);
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2551");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) 100, 800);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 800 + "'", int2 == 800);
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2552");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1120, 9700);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 543200 + "'", int2 == 543200);
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2553");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(40352, 160);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 201760 + "'", int2 == 201760);
    }

    @Test
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2554");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(176540, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 176540 + "'", int2 == 176540);
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2555");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(6790, (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6790 + "'", int2 == 6790);
    }

    @Test
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2556");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(9700, 700);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 67900 + "'", int2 == 67900);
    }

    @Test
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2557");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(416, 201760);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 201760 + "'", int2 == 201760);
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2558");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(72800, 70);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 72800 + "'", int2 == 72800);
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2559");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(970, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 970 + "'", int2 == 970);
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2560");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(126100, 5044);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 126100 + "'", int2 == 126100);
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2561");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(70, 416);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 14560 + "'", int2 == 14560);
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2562");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1820, 800);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 72800 + "'", int2 == 72800);
    }

    @Test
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2563");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(700, 67900);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 67900 + "'", int2 == 67900);
    }

    @Test
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2564");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) '4', 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 260 + "'", int2 == 260);
    }

    @Test
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2565");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(176540, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 882700 + "'", int2 == 882700);
    }

    @Test
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2566");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(52, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 416 + "'", int2 == 416);
    }

    @Test
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2567");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(700, 10400);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 72800 + "'", int2 == 72800);
    }

    @Test
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2568");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) '#', (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2569");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) 1, 260);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 260 + "'", int2 == 260);
    }

    @Test
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2570");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(14560, 108640);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1412320 + "'", int2 == 1412320);
    }

    @Test
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2571");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1, 970);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 970 + "'", int2 == 970);
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2572");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(9100, 201760);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2573");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1412320, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2574");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(2080, 970);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 201760 + "'", int2 == 201760);
    }

    @Test
    public void test2575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2575");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1008800, 72800);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2576");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(6790, 10400);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2577");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(6790, 1820);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 176540 + "'", int2 == 176540);
    }

    @Test
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2578");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(72800, 77600);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test2579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2579");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(7061600, 7061600);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2580");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(10400, 2080);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10400 + "'", int2 == 10400);
    }

    @Test
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2581");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1, 1820);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1820 + "'", int2 == 1820);
    }

    @Test
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2582");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(126100, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 126100 + "'", int2 == 126100);
    }

    @Test
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2583");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(100, 14560);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 72800 + "'", int2 == 72800);
    }

    @Test
    public void test2584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2584");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(67900, 176540);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 882700 + "'", int2 == 882700);
    }

    @Test
    public void test2585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2585");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(3395, 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3395 + "'", int2 == 3395);
    }

    @Test
    public void test2586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2586");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) 10, 1820);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1820 + "'", int2 == 1820);
    }

    @Test
    public void test2587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2587");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1, 72800);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 72800 + "'", int2 == 72800);
    }

    @Test
    public void test2588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2588");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1, 5044);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5044 + "'", int2 == 5044);
    }

    @Test
    public void test2589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2589");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2590");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(15520, 700);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 543200 + "'", int2 == 543200);
    }

    @Test
    public void test2591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2591");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(72800, 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 72800 + "'", int2 == 72800);
    }

    @Test
    public void test2592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2592");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) 0, 40352);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2593");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) 10, 5044);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 25220 + "'", int2 == 25220);
    }

    @Test
    public void test2594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2594");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(72800, 1300);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 72800 + "'", int2 == 72800);
    }

    @Test
    public void test2595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2595");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(25220, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 25220 + "'", int2 == 25220);
    }

    @Test
    public void test2596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2596");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(882700, 5600);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test2597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2597");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(32, 1300);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10400 + "'", int2 == 10400);
    }

    @Test
    public void test2598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2598");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(52, 700);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9100 + "'", int2 == 9100);
    }

    @Test
    public void test2599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2599");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) 1, 416);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 416 + "'", int2 == 416);
    }

    @Test
    public void test2600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2600");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(7061600, 25220);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test2601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2601");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(882700, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 882700 + "'", int2 == 882700);
    }

    @Test
    public void test2602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2602");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1412320, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1412320 + "'", int2 == 1412320);
    }

    @Test
    public void test2603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2603");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(67900, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 67900 + "'", int2 == 67900);
    }

    @Test
    public void test2604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2604");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(100, 6790);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 67900 + "'", int2 == 67900);
    }

    @Test
    public void test2605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2605");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) 100, 543200);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 543200 + "'", int2 == 543200);
    }

    @Test
    public void test2606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2606");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(77600, 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 543200 + "'", int2 == 543200);
    }

    @Test
    public void test2607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2607");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(32, 1412320);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1412320 + "'", int2 == 1412320);
    }

    @Test
    public void test2608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2608");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(70, 800);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5600 + "'", int2 == 5600);
    }

    @Test
    public void test2609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2609");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(201760, 800);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1008800 + "'", int2 == 1008800);
    }

    @Test
    public void test2610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2610");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) ' ', (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test2611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2611");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1820, 9700);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 882700 + "'", int2 == 882700);
    }

    @Test
    public void test2612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2612");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(100, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test2613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2613");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1008800, 9700);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1008800 + "'", int2 == 1008800);
    }

    @Test
    public void test2614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2614");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(14560, 201760);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1412320 + "'", int2 == 1412320);
    }

    @Test
    public void test2615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2615");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) 1, 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test2616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2616");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1120, 10400);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 72800 + "'", int2 == 72800);
    }

    @Test
    public void test2617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2617");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(15520, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15520 + "'", int2 == 15520);
    }

    @Test
    public void test2618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2618");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(9100, 6790);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 882700 + "'", int2 == 882700);
    }

    @Test
    public void test2619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2619");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) 1, 2080);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2080 + "'", int2 == 2080);
    }

    @Test
    public void test2620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2620");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) -1, 882700);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 882700 + "'", int2 == 882700);
    }

    @Test
    public void test2621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2621");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(100, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9700 + "'", int2 == 9700);
    }

    @Test
    public void test2622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2622");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(70, 40352);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1412320 + "'", int2 == 1412320);
    }

    @Test
    public void test2623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2623");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(3395, 3395);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3395 + "'", int2 == 3395);
    }

    @Test
    public void test2624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2624");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(7061600, 1412320);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test2625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2625");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) 0, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2626");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(543200, 67900);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 543200 + "'", int2 == 543200);
    }

    @Test
    public void test2627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2627");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(176540, 2080);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1412320 + "'", int2 == 1412320);
    }

    @Test
    public void test2628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2628");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(882700, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 882700 + "'", int2 == 882700);
    }

    @Test
    public void test2629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2629");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) 0, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2630");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) ' ', 70);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1120 + "'", int2 == 1120);
    }

    @Test
    public void test2631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2631");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(97, 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test2632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2632");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(700, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 700 + "'", int2 == 700);
    }

    @Test
    public void test2633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2633");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1412320, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1412320 + "'", int2 == 1412320);
    }

    @Test
    public void test2634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2634");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) '#', 70);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 70 + "'", int2 == 70);
    }

    @Test
    public void test2635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2635");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1, 6790);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6790 + "'", int2 == 6790);
    }

    @Test
    public void test2636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2636");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) 0, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2637");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(5600, 9700);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 543200 + "'", int2 == 543200);
    }

    @Test
    public void test2638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2638");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(15520, 5044);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 201760 + "'", int2 == 201760);
    }

    @Test
    public void test2639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2639");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(7061600, 1120);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test2640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2640");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(176540, 700);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 882700 + "'", int2 == 882700);
    }

    @Test
    public void test2641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2641");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1, 25220);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 25220 + "'", int2 == 25220);
    }

    @Test
    public void test2642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2642");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(25220, 1412320);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1412320 + "'", int2 == 1412320);
    }

    @Test
    public void test2643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2643");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(543200, 1008800);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test2644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2644");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(160, 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15520 + "'", int2 == 15520);
    }

    @Test
    public void test2645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2645");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(201760, 108640);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1412320 + "'", int2 == 1412320);
    }

    @Test
    public void test2646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2646");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) ' ', 25220);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 201760 + "'", int2 == 201760);
    }

    @Test
    public void test2647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2647");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) 0, 1120);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2648");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(9100, 40352);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test2649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2649");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(72800, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 72800 + "'", int2 == 72800);
    }

    @Test
    public void test2650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2650");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(35, 416);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 14560 + "'", int2 == 14560);
    }

    @Test
    public void test2651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2651");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(72800, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 72800 + "'", int2 == 72800);
    }

    @Test
    public void test2652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2652");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(9700, 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 67900 + "'", int2 == 67900);
    }

    @Test
    public void test2653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2653");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(108640, 160);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 108640 + "'", int2 == 108640);
    }

    @Test
    public void test2654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2654");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(14560, 1412320);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1412320 + "'", int2 == 1412320);
    }

    @Test
    public void test2655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2655");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1008800, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1008800 + "'", int2 == 1008800);
    }

    @Test
    public void test2656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2656");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(10, 800);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 800 + "'", int2 == 800);
    }

    @Test
    public void test2657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2657");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) 1, (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test2658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2658");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(9700, 10400);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1008800 + "'", int2 == 1008800);
    }

    @Test
    public void test2659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2659");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(800, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 800 + "'", int2 == 800);
    }

    @Test
    public void test2660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2660");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(25220, 1120);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1412320 + "'", int2 == 1412320);
    }

    @Test
    public void test2661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2661");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) 10, 3395);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6790 + "'", int2 == 6790);
    }

    @Test
    public void test2662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2662");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) 0, 5044);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2663");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(40352, 14560);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1412320 + "'", int2 == 1412320);
    }

    @Test
    public void test2664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2664");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1412320, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1412320 + "'", int2 == 1412320);
    }

    @Test
    public void test2665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2665");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(97, 126100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 126100 + "'", int2 == 126100);
    }

    @Test
    public void test2666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2666");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(201760, 1820);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1412320 + "'", int2 == 1412320);
    }

    @Test
    public void test2667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2667");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(100, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test2668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2668");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(3395, 6790);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6790 + "'", int2 == 6790);
    }

    @Test
    public void test2669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2669");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(6790, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6790 + "'", int2 == 6790);
    }

    @Test
    public void test2670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2670");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(800, 108640);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 543200 + "'", int2 == 543200);
    }

    @Test
    public void test2671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2671");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((-1), 1820);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1820 + "'", int2 == 1820);
    }

    @Test
    public void test2672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2672");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) 100, 2080);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10400 + "'", int2 == 10400);
    }

    @Test
    public void test2673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2673");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) ' ', (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3104 + "'", int2 == 3104);
    }

    @Test
    public void test2674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2674");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(3104, 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 108640 + "'", int2 == 108640);
    }

    @Test
    public void test2675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2675");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1412320, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1412320 + "'", int2 == 1412320);
    }

    @Test
    public void test2676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2676");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) 0, 160);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2677");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(7061600, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test2678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2678");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) 10, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test2679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2679");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(52, 5600);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 72800 + "'", int2 == 72800);
    }

    @Test
    public void test2680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2680");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(543200, 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test2681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2681");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(52, 3395);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 176540 + "'", int2 == 176540);
    }

    @Test
    public void test2682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2682");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(100, 25220);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 126100 + "'", int2 == 126100);
    }

    @Test
    public void test2683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2683");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1820, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1820 + "'", int2 == 1820);
    }

    @Test
    public void test2684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2684");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(6790, 176540);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 176540 + "'", int2 == 176540);
    }

    @Test
    public void test2685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2685");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) '4', (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test2686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2686");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((-1), 5044);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5044 + "'", int2 == 5044);
    }

    @Test
    public void test2687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2687");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(35, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test2688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2688");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) 0, (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2689");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) '4', 416);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 416 + "'", int2 == 416);
    }

    @Test
    public void test2690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2690");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(9100, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9100 + "'", int2 == 9100);
    }

    @Test
    public void test2691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2691");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1412320, 176540);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1412320 + "'", int2 == 1412320);
    }

    @Test
    public void test2692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2692");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(108640, 70);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 108640 + "'", int2 == 108640);
    }

    @Test
    public void test2693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2693");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(25220, 5044);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 25220 + "'", int2 == 25220);
    }

    @Test
    public void test2694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2694");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) 0, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2695");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(176540, 126100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 882700 + "'", int2 == 882700);
    }

    @Test
    public void test2696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2696");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(970, 7061600);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test2697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2697");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) 1, 7061600);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test2698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2698");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(800, 700);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5600 + "'", int2 == 5600);
    }

    @Test
    public void test2699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2699");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(543200, 1120);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 543200 + "'", int2 == 543200);
    }

    @Test
    public void test2700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2700");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1120, 14560);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 14560 + "'", int2 == 14560);
    }

    @Test
    public void test2701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2701");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) 1, 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test2702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2702");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(201760, 9700);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1008800 + "'", int2 == 1008800);
    }

    @Test
    public void test2703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2703");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) 100, 970);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9700 + "'", int2 == 9700);
    }

    @Test
    public void test2704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2704");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(35, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 700 + "'", int2 == 700);
    }

    @Test
    public void test2705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2705");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(10, 5600);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5600 + "'", int2 == 5600);
    }

    @Test
    public void test2706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2706");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) '#', 15520);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 108640 + "'", int2 == 108640);
    }

    @Test
    public void test2707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2707");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(416, 3104);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 40352 + "'", int2 == 40352);
    }

    @Test
    public void test2708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2708");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test2709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2709");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) -1, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test2710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2710");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(6790, 15520);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 108640 + "'", int2 == 108640);
    }

    @Test
    public void test2711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2711");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(10, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test2712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2712");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(10, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test2713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2713");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(25220, 416);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 201760 + "'", int2 == 201760);
    }

    @Test
    public void test2714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2714");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(970, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 970 + "'", int2 == 970);
    }

    @Test
    public void test2715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2715");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(97, 201760);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 201760 + "'", int2 == 201760);
    }

    @Test
    public void test2716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2716");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(72800, 108640);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test2717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2717");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(3395, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 67900 + "'", int2 == 67900);
    }

    @Test
    public void test2718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2718");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1120, 176540);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1412320 + "'", int2 == 1412320);
    }

    @Test
    public void test2719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2719");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(10, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test2720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2720");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(5044, 2080);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 201760 + "'", int2 == 201760);
    }

    @Test
    public void test2721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2721");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(100, 1820);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9100 + "'", int2 == 9100);
    }

    @Test
    public void test2722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2722");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1820, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1820 + "'", int2 == 1820);
    }

    @Test
    public void test2723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2723");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(67900, 3104);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 543200 + "'", int2 == 543200);
    }

    @Test
    public void test2724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2724");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) '4', 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 416 + "'", int2 == 416);
    }

    @Test
    public void test2725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2725");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) ' ', 72800);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 72800 + "'", int2 == 72800);
    }

    @Test
    public void test2726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2726");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(70, 1412320);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1412320 + "'", int2 == 1412320);
    }

    @Test
    public void test2727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2727");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(108640, 1120);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 108640 + "'", int2 == 108640);
    }

    @Test
    public void test2728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2728");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) 100, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test2729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2729");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1120, 126100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test2730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2730");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) -1, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test2731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2731");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) 10, 7061600);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test2732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2732");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(800, 1120);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5600 + "'", int2 == 5600);
    }

    @Test
    public void test2733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2733");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(5044, 7061600);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test2734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2734");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1008800, 260);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1008800 + "'", int2 == 1008800);
    }

    @Test
    public void test2735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2735");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(882700, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 882700 + "'", int2 == 882700);
    }

    @Test
    public void test2736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2736");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(97, 543200);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 543200 + "'", int2 == 543200);
    }

    @Test
    public void test2737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2737");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(10400, 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 72800 + "'", int2 == 72800);
    }

    @Test
    public void test2738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2738");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(70, 70);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 70 + "'", int2 == 70);
    }

    @Test
    public void test2739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2739");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(260, 800);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10400 + "'", int2 == 10400);
    }

    @Test
    public void test2740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2740");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(15520, 126100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1008800 + "'", int2 == 1008800);
    }

    @Test
    public void test2741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2741");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(25220, 260);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 25220 + "'", int2 == 25220);
    }

    @Test
    public void test2742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2742");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(40352, 126100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1008800 + "'", int2 == 1008800);
    }

    @Test
    public void test2743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2743");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1008800, 1412320);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test2744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2744");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) 1, 1120);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1120 + "'", int2 == 1120);
    }

    @Test
    public void test2745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2745");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(70, (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 70 + "'", int2 == 70);
    }

    @Test
    public void test2746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2746");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(72800, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 72800 + "'", int2 == 72800);
    }

    @Test
    public void test2747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2747");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1008800, 126100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1008800 + "'", int2 == 1008800);
    }

    @Test
    public void test2748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2748");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(35, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3395 + "'", int2 == 3395);
    }

    @Test
    public void test2749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2749");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1120, 543200);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 543200 + "'", int2 == 543200);
    }

    @Test
    public void test2750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2750");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(100, 9100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9100 + "'", int2 == 9100);
    }

    @Test
    public void test2751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2751");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(97, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test2752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2752");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(25220, 543200);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test2753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2753");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1412320, 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1412320 + "'", int2 == 1412320);
    }

    @Test
    public void test2754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2754");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(35, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test2755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2755");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) '#', 40352);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1412320 + "'", int2 == 1412320);
    }

    @Test
    public void test2756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2756");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(52, 67900);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 882700 + "'", int2 == 882700);
    }

    @Test
    public void test2757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2757");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(72800, 40352);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test2758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2758");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(32, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 160 + "'", int2 == 160);
    }

    @Test
    public void test2759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2759");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(126100, 800);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1008800 + "'", int2 == 1008800);
    }

    @Test
    public void test2760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2760");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1412320, 5044);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1412320 + "'", int2 == 1412320);
    }

    @Test
    public void test2761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2761");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(9700, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 77600 + "'", int2 == 77600);
    }

    @Test
    public void test2762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2762");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(160, 77600);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 77600 + "'", int2 == 77600);
    }

    @Test
    public void test2763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2763");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) 0, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2764");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(97, 800);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 77600 + "'", int2 == 77600);
    }

    @Test
    public void test2765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2765");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(9100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2766");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(40352, 10400);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1008800 + "'", int2 == 1008800);
    }

    @Test
    public void test2767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2767");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) 0, 543200);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2768");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(25220, 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 25220 + "'", int2 == 25220);
    }

    @Test
    public void test2769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2769");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) 100, 10400);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10400 + "'", int2 == 10400);
    }

    @Test
    public void test2770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2770");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(416, 14560);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 14560 + "'", int2 == 14560);
    }

    @Test
    public void test2771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2771");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(77600, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2772");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(52, 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test2773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2773");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1008800, 9100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test2774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2774");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(77600, 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 77600 + "'", int2 == 77600);
    }

    @Test
    public void test2775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2775");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(35, 9100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9100 + "'", int2 == 9100);
    }

    @Test
    public void test2776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2776");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(700, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 700 + "'", int2 == 700);
    }

    @Test
    public void test2777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2777");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(70, 9100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9100 + "'", int2 == 9100);
    }

    @Test
    public void test2778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2778");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1300, 9100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9100 + "'", int2 == 9100);
    }

    @Test
    public void test2779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2779");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(543200, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2780");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(77600, 3395);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 543200 + "'", int2 == 543200);
    }

    @Test
    public void test2781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2781");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) -1, 3395);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3395 + "'", int2 == 3395);
    }

    @Test
    public void test2782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2782");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1120, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1120 + "'", int2 == 1120);
    }

    @Test
    public void test2783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2783");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(201760, 1412320);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1412320 + "'", int2 == 1412320);
    }

    @Test
    public void test2784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2784");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(100, 108640);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 543200 + "'", int2 == 543200);
    }

    @Test
    public void test2785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2785");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(9100, 126100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 882700 + "'", int2 == 882700);
    }

    @Test
    public void test2786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2786");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(67900, 882700);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 882700 + "'", int2 == 882700);
    }

    @Test
    public void test2787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2787");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(77600, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 77600 + "'", int2 == 77600);
    }

    @Test
    public void test2788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2788");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(700, 3104);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 543200 + "'", int2 == 543200);
    }

    @Test
    public void test2789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2789");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(970, 10400);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1008800 + "'", int2 == 1008800);
    }

    @Test
    public void test2790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2790");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) 100, 201760);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1008800 + "'", int2 == 1008800);
    }

    @Test
    public void test2791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2791");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(2080, 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2080 + "'", int2 == 2080);
    }

    @Test
    public void test2792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2792");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((-1), 10400);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10400 + "'", int2 == 10400);
    }

    @Test
    public void test2793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2793");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) ' ', 10400);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10400 + "'", int2 == 10400);
    }

    @Test
    public void test2794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2794");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(7061600, 1820);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test2795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2795");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(108640, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 543200 + "'", int2 == 543200);
    }

    @Test
    public void test2796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2796");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(700, 126100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 882700 + "'", int2 == 882700);
    }

    @Test
    public void test2797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2797");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(416, 1008800);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1008800 + "'", int2 == 1008800);
    }

    @Test
    public void test2798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2798");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(176540, 3104);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1412320 + "'", int2 == 1412320);
    }

    @Test
    public void test2799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2799");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(176540, 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 176540 + "'", int2 == 176540);
    }

    @Test
    public void test2800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2800");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(6790, 67900);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 67900 + "'", int2 == 67900);
    }

    @Test
    public void test2801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2801");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) 100, 260);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1300 + "'", int2 == 1300);
    }

    @Test
    public void test2802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2802");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) 0, 72800);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2803");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(15520, 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 201760 + "'", int2 == 201760);
    }

    @Test
    public void test2804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2804");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(32, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3104 + "'", int2 == 3104);
    }

    @Test
    public void test2805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2805");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1300, 1300);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1300 + "'", int2 == 1300);
    }

    @Test
    public void test2806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2806");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) 1, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test2807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2807");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(67900, 1820);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 882700 + "'", int2 == 882700);
    }

    @Test
    public void test2808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2808");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(970, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15520 + "'", int2 == 15520);
    }

    @Test
    public void test2809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2809");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(260, 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 25220 + "'", int2 == 25220);
    }

    @Test
    public void test2810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2810");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(10400, 970);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1008800 + "'", int2 == 1008800);
    }

    @Test
    public void test2811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2811");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) 'a', 70);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6790 + "'", int2 == 6790);
    }

    @Test
    public void test2812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2812");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(10400, 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1008800 + "'", int2 == 1008800);
    }

    @Test
    public void test2813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2813");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(2080, 5044);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 201760 + "'", int2 == 201760);
    }

    @Test
    public void test2814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2814");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(9700, 1008800);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1008800 + "'", int2 == 1008800);
    }

    @Test
    public void test2815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2815");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(416, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 416 + "'", int2 == 416);
    }

    @Test
    public void test2816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2816");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(7061600, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test2817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2817");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(3395, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2818");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test2819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2819");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) ' ', 7061600);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test2820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2820");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test2821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2821");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(5044, 5600);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test2822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2822");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(160, 1008800);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1008800 + "'", int2 == 1008800);
    }

    @Test
    public void test2823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2823");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(67900, 15520);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 543200 + "'", int2 == 543200);
    }

    @Test
    public void test2824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2824");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(14560, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 14560 + "'", int2 == 14560);
    }

    @Test
    public void test2825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2825");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(882700, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 882700 + "'", int2 == 882700);
    }

    @Test
    public void test2826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2826");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1120, 260);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 14560 + "'", int2 == 14560);
    }

    @Test
    public void test2827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2827");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) 0, 260);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2828");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(9700, 70);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 67900 + "'", int2 == 67900);
    }

    @Test
    public void test2829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2829");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(3395, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3395 + "'", int2 == 3395);
    }

    @Test
    public void test2830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2830");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(882700, 40352);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test2831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2831");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(14560, 72800);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 72800 + "'", int2 == 72800);
    }

    @Test
    public void test2832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2832");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(25220, 15520);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 201760 + "'", int2 == 201760);
    }

    @Test
    public void test2833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2833");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(40352, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 40352 + "'", int2 == 40352);
    }

    @Test
    public void test2834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2834");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(543200, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2835");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(201760, 5044);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 201760 + "'", int2 == 201760);
    }

    @Test
    public void test2836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2836");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(160, 14560);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 14560 + "'", int2 == 14560);
    }

    @Test
    public void test2837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2837");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(9100, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9100 + "'", int2 == 9100);
    }

    @Test
    public void test2838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2838");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(800, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 800 + "'", int2 == 800);
    }

    @Test
    public void test2839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2839");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1120, 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1120 + "'", int2 == 1120);
    }

    @Test
    public void test2840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2840");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(416, 72800);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 72800 + "'", int2 == 72800);
    }

    @Test
    public void test2841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2841");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) 0, 416);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2842");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(160, 108640);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 108640 + "'", int2 == 108640);
    }

    @Test
    public void test2843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2843");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) 'a', 5600);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 543200 + "'", int2 == 543200);
    }

    @Test
    public void test2844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2844");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) 100, 176540);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 882700 + "'", int2 == 882700);
    }

    @Test
    public void test2845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2845");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(108640, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 108640 + "'", int2 == 108640);
    }

    @Test
    public void test2846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2846");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) '#', 9100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9100 + "'", int2 == 9100);
    }

    @Test
    public void test2847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2847");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) 'a', (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test2848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2848");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(3104, 201760);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 201760 + "'", int2 == 201760);
    }

    @Test
    public void test2849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2849");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2850");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(32, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2851");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1820, 882700);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 882700 + "'", int2 == 882700);
    }

    @Test
    public void test2852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2852");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(25220, 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 25220 + "'", int2 == 25220);
    }

    @Test
    public void test2853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2853");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(67900, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2854");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(6790, 543200);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 543200 + "'", int2 == 543200);
    }

    @Test
    public void test2855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2855");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) 10, 1820);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1820 + "'", int2 == 1820);
    }

    @Test
    public void test2856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2856");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(10400, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2857");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(40352, 201760);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 201760 + "'", int2 == 201760);
    }

    @Test
    public void test2858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2858");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) -1, 1412320);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1412320 + "'", int2 == 1412320);
    }

    @Test
    public void test2859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2859");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(77600, 108640);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 543200 + "'", int2 == 543200);
    }

    @Test
    public void test2860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2860");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(5044, 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5044 + "'", int2 == 5044);
    }

    @Test
    public void test2861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2861");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(100, 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 700 + "'", int2 == 700);
    }

    @Test
    public void test2862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2862");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(32, 3395);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 108640 + "'", int2 == 108640);
    }

    @Test
    public void test2863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2863");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) -1, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test2864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2864");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(97, 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5044 + "'", int2 == 5044);
    }

    @Test
    public void test2865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2865");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(77600, 6790);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 543200 + "'", int2 == 543200);
    }

    @Test
    public void test2866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2866");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) 10, 126100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 126100 + "'", int2 == 126100);
    }

    @Test
    public void test2867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2867");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(260, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 260 + "'", int2 == 260);
    }

    @Test
    public void test2868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2868");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(176540, 9100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 882700 + "'", int2 == 882700);
    }

    @Test
    public void test2869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2869");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(126100, 1008800);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1008800 + "'", int2 == 1008800);
    }

    @Test
    public void test2870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2870");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(800, 14560);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 72800 + "'", int2 == 72800);
    }

    @Test
    public void test2871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2871");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(25220, 9700);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 126100 + "'", int2 == 126100);
    }

    @Test
    public void test2872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2872");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(201760, 700);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test2873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2873");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) 100, (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 700 + "'", int2 == 700);
    }

    @Test
    public void test2874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2874");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(97, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 970 + "'", int2 == 970);
    }

    @Test
    public void test2875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2875");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(35, 7061600);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test2876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2876");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(126100, 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 882700 + "'", int2 == 882700);
    }

    @Test
    public void test2877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2877");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(7061600, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test2878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2878");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) '4', 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1300 + "'", int2 == 1300);
    }

    @Test
    public void test2879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2879");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(416, 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 14560 + "'", int2 == 14560);
    }

    @Test
    public void test2880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2880");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1300, 3104);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1008800 + "'", int2 == 1008800);
    }

    @Test
    public void test2881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2881");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(5600, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5600 + "'", int2 == 5600);
    }

    @Test
    public void test2882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2882");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(3395, 882700);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 882700 + "'", int2 == 882700);
    }

    @Test
    public void test2883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2883");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(800, 176540);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test2884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2884");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(2080, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10400 + "'", int2 == 10400);
    }

    @Test
    public void test2885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2885");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) -1, 1300);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1300 + "'", int2 == 1300);
    }

    @Test
    public void test2886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2886");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) 1, 67900);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 67900 + "'", int2 == 67900);
    }

    @Test
    public void test2887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2887");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(10, 7061600);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test2888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2888");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(40352, 882700);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test2889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2889");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(260, 9700);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 126100 + "'", int2 == 126100);
    }

    @Test
    public void test2890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2890");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) '#', 543200);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 543200 + "'", int2 == 543200);
    }

    @Test
    public void test2891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2891");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(10400, 126100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1008800 + "'", int2 == 1008800);
    }

    @Test
    public void test2892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2892");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) 0, 3395);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2893");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) '#', (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test2894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2894");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(543200, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 543200 + "'", int2 == 543200);
    }

    @Test
    public void test2895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2895");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(3395, 260);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 176540 + "'", int2 == 176540);
    }

    @Test
    public void test2896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2896");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(67900, 6790);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 67900 + "'", int2 == 67900);
    }

    @Test
    public void test2897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2897");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1120, 108640);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 108640 + "'", int2 == 108640);
    }

    @Test
    public void test2898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2898");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) '4', 700);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9100 + "'", int2 == 9100);
    }

    @Test
    public void test2899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2899");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(5044, 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 176540 + "'", int2 == 176540);
    }

    @Test
    public void test2900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2900");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(70, 1300);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9100 + "'", int2 == 9100);
    }

    @Test
    public void test2901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2901");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(3395, 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3395 + "'", int2 == 3395);
    }

    @Test
    public void test2902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2902");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(260, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2903");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) '#', 970);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6790 + "'", int2 == 6790);
    }

    @Test
    public void test2904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2904");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1300, 40352);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1008800 + "'", int2 == 1008800);
    }

    @Test
    public void test2905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2905");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(9700, 201760);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1008800 + "'", int2 == 1008800);
    }

    @Test
    public void test2906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2906");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(108640, 543200);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 543200 + "'", int2 == 543200);
    }

    @Test
    public void test2907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2907");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(25220, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 25220 + "'", int2 == 25220);
    }

    @Test
    public void test2908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2908");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(5044, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 25220 + "'", int2 == 25220);
    }

    @Test
    public void test2909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2909");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(543200, 6790);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 543200 + "'", int2 == 543200);
    }

    @Test
    public void test2910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2910");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((-1), 25220);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 25220 + "'", int2 == 25220);
    }

    @Test
    public void test2911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2911");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1300, 7061600);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test2912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2912");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1300, 6790);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 882700 + "'", int2 == 882700);
    }

    @Test
    public void test2913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2913");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(15520, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2914");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(126100, 176540);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 882700 + "'", int2 == 882700);
    }

    @Test
    public void test2915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2915");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1008800, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1008800 + "'", int2 == 1008800);
    }

    @Test
    public void test2916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2916");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(52, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2917");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) 0, 108640);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2918");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(800, 970);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 77600 + "'", int2 == 77600);
    }

    @Test
    public void test2919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2919");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(6790, 70);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6790 + "'", int2 == 6790);
    }

    @Test
    public void test2920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2920");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(201760, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2921");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(970, 15520);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15520 + "'", int2 == 15520);
    }

    @Test
    public void test2922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2922");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) '4', 882700);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 882700 + "'", int2 == 882700);
    }

    @Test
    public void test2923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2923");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(108640, 201760);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1412320 + "'", int2 == 1412320);
    }

    @Test
    public void test2924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2924");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(800, 5600);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5600 + "'", int2 == 5600);
    }

    @Test
    public void test2925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2925");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(100, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test2926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2926");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(970, 1300);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 126100 + "'", int2 == 126100);
    }

    @Test
    public void test2927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2927");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(201760, 7061600);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test2928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2928");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(543200, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 543200 + "'", int2 == 543200);
    }

    @Test
    public void test2929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2929");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) 10, 9100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9100 + "'", int2 == 9100);
    }

    @Test
    public void test2930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2930");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) 10, 800);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 800 + "'", int2 == 800);
    }

    @Test
    public void test2931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2931");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(10400, 201760);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1008800 + "'", int2 == 1008800);
    }

    @Test
    public void test2932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2932");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) 1, 700);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 700 + "'", int2 == 700);
    }

    @Test
    public void test2933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2933");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(882700, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test2934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2934");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1300, 10400);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10400 + "'", int2 == 10400);
    }

    @Test
    public void test2935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2935");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) 100, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test2936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2936");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(176540, 160);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1412320 + "'", int2 == 1412320);
    }

    @Test
    public void test2937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2937");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(882700, 25220);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 882700 + "'", int2 == 882700);
    }

    @Test
    public void test2938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2938");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(67900, 201760);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test2939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2939");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(97, 9700);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9700 + "'", int2 == 9700);
    }

    @Test
    public void test2940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2940");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(126100, 126100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 126100 + "'", int2 == 126100);
    }

    @Test
    public void test2941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2941");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(2080, 2080);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2080 + "'", int2 == 2080);
    }

    @Test
    public void test2942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2942");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(7061600, 1008800);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test2943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2943");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) -1, 25220);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 25220 + "'", int2 == 25220);
    }

    @Test
    public void test2944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2944");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) 10, 77600);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 77600 + "'", int2 == 77600);
    }

    @Test
    public void test2945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2945");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1120, 700);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5600 + "'", int2 == 5600);
    }

    @Test
    public void test2946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2946");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) 1, 1820);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1820 + "'", int2 == 1820);
    }

    @Test
    public void test2947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2947");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(970, 700);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 67900 + "'", int2 == 67900);
    }

    @Test
    public void test2948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2948");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) 0, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2949");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) 10, 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 970 + "'", int2 == 970);
    }

    @Test
    public void test2950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2950");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(40352, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 40352 + "'", int2 == 40352);
    }

    @Test
    public void test2951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2951");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) 0, 9100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2952");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(14560, 176540);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1412320 + "'", int2 == 1412320);
    }

    @Test
    public void test2953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2953");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(800, 1412320);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test2954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2954");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(15520, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15520 + "'", int2 == 15520);
    }

    @Test
    public void test2955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2955");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(35, (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test2956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2956");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1820, 77600);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test2957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2957");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1008800, 67900);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test2958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2958");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(260, 1120);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 14560 + "'", int2 == 14560);
    }

    @Test
    public void test2959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2959");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(3104, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3104 + "'", int2 == 3104);
    }

    @Test
    public void test2960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2960");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(77600, 1120);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 543200 + "'", int2 == 543200);
    }

    @Test
    public void test2961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2961");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(40352, 9700);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1008800 + "'", int2 == 1008800);
    }

    @Test
    public void test2962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2962");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(882700, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 882700 + "'", int2 == 882700);
    }

    @Test
    public void test2963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2963");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(9100, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9100 + "'", int2 == 9100);
    }

    @Test
    public void test2964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2964");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(201760, 882700);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test2965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2965");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(72800, 260);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 72800 + "'", int2 == 72800);
    }

    @Test
    public void test2966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2966");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(6790, 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6790 + "'", int2 == 6790);
    }

    @Test
    public void test2967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2967");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(176540, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2968");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) 10, 77600);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 77600 + "'", int2 == 77600);
    }

    @Test
    public void test2969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2969");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1, 882700);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 882700 + "'", int2 == 882700);
    }

    @Test
    public void test2970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2970");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(9100, 5044);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 882700 + "'", int2 == 882700);
    }

    @Test
    public void test2971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2971");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(67900, 970);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 67900 + "'", int2 == 67900);
    }

    @Test
    public void test2972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2972");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(9100, 160);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 72800 + "'", int2 == 72800);
    }

    @Test
    public void test2973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2973");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(108640, 10400);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test2974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2974");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((-1), 126100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 126100 + "'", int2 == 126100);
    }

    @Test
    public void test2975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2975");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(25220, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 25220 + "'", int2 == 25220);
    }

    @Test
    public void test2976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2976");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(32, 882700);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test2977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2977");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) 1, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test2978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2978");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(700, 160);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5600 + "'", int2 == 5600);
    }

    @Test
    public void test2979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2979");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(543200, 10400);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test2980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2980");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(67900, 72800);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test2981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2981");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) '4', 72800);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 72800 + "'", int2 == 72800);
    }

    @Test
    public void test2982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2982");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) 1, 6790);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6790 + "'", int2 == 6790);
    }

    @Test
    public void test2983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2983");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(10400, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10400 + "'", int2 == 10400);
    }

    @Test
    public void test2984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2984");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) 0, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2985");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(70, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2986");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(100, 126100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 126100 + "'", int2 == 126100);
    }

    @Test
    public void test2987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2987");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(70, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 70 + "'", int2 == 70);
    }

    @Test
    public void test2988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2988");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(126100, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 126100 + "'", int2 == 126100);
    }

    @Test
    public void test2989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2989");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(543200, 1820);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test2990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2990");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1412320, 2080);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1412320 + "'", int2 == 1412320);
    }

    @Test
    public void test2991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2991");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(70, 3395);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6790 + "'", int2 == 6790);
    }

    @Test
    public void test2992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2992");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(35, 201760);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1412320 + "'", int2 == 1412320);
    }

    @Test
    public void test2993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2993");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(160, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 160 + "'", int2 == 160);
    }

    @Test
    public void test2994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2994");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) 1, 25220);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 25220 + "'", int2 == 25220);
    }

    @Test
    public void test2995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2995");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(700, 1300);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9100 + "'", int2 == 9100);
    }

    @Test
    public void test2996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2996");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(543200, 201760);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test2997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2997");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) 'a', 160);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15520 + "'", int2 == 15520);
    }

    @Test
    public void test2998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2998");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(201760, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 201760 + "'", int2 == 201760);
    }

    @Test
    public void test2999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2999");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(543200, 9100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test3000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test3000");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(5600, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5600 + "'", int2 == 5600);
    }
}

