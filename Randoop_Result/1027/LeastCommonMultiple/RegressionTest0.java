package LeastCommonMultiple;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((-1), (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) '4', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) -1, (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) 1, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) -1, 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        com.thealgorithms.maths.LeastCommonMultiple leastCommonMultiple0 = new com.thealgorithms.maths.LeastCommonMultiple();
        java.lang.Class<?> wildcardClass1 = leastCommonMultiple0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(0, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) '#', (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) '4', (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 416 + "'", int2 == 416);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) 0, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) 1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) 0, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(0, 416);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) 0, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) -1, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) 100, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) 0, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) 'a', (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) 10, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) '4', (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(0, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) 10, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) 10, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) 100, (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 700 + "'", int2 == 700);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) 10, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) -1, 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) '4', (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 260 + "'", int2 == 260);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) 'a', 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5044 + "'", int2 == 5044);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) ' ', 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3104 + "'", int2 == 3104);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) '#', 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3395 + "'", int2 == 3395);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) -1, 700);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 700 + "'", int2 == 700);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) '#', 260);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1820 + "'", int2 == 1820);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(3104, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3104 + "'", int2 == 3104);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(3395, 5044);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 176540 + "'", int2 == 176540);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) 0, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(10, 5044);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 25220 + "'", int2 == 25220);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(3104, 5044);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 40352 + "'", int2 == 40352);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) 100, 5044);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 126100 + "'", int2 == 126100);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(35, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) ' ', (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(97, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(97, 3395);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3395 + "'", int2 == 3395);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(52, 40352);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 40352 + "'", int2 == 40352);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(260, 3395);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 176540 + "'", int2 == 176540);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(10, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(0, 176540);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(416, 176540);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1412320 + "'", int2 == 1412320);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(32, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) 'a', 176540);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 176540 + "'", int2 == 176540);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(0, 5044);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((-1), (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(176540, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 176540 + "'", int2 == 176540);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(97, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) 100, 126100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 126100 + "'", int2 == 126100);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(97, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) 100, 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 800 + "'", int2 == 800);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(52, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) -1, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(176540, 5044);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 176540 + "'", int2 == 176540);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) ' ', 3395);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 108640 + "'", int2 == 108640);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(0, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(176540, 176540);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 176540 + "'", int2 == 176540);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1, 126100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 126100 + "'", int2 == 126100);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) '4', (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1300 + "'", int2 == 1300);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(5044, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) 1, 1412320);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1412320 + "'", int2 == 1412320);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) -1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(800, 25220);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1008800 + "'", int2 == 1008800);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) '#', 416);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 14560 + "'", int2 == 14560);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1820, 25220);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 176540 + "'", int2 == 176540);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) 1, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(40352, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(0, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(10, 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 970 + "'", int2 == 970);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1300, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1300 + "'", int2 == 1300);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(260, 1008800);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1008800 + "'", int2 == 1008800);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(176540, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 176540 + "'", int2 == 176540);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(0, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(0, 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) 0, 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) -1, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(108640, 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1412320 + "'", int2 == 1412320);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1820, 14560);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 14560 + "'", int2 == 14560);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1820, (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1820 + "'", int2 == 1820);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(32, 25220);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 201760 + "'", int2 == 201760);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(201760, 1300);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1008800 + "'", int2 == 1008800);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1300, 176540);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 882700 + "'", int2 == 882700);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(3104, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(10, 3395);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6790 + "'", int2 == 6790);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) 10, 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 160 + "'", int2 == 160);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(0, 160);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) 10, 14560);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 14560 + "'", int2 == 14560);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(0, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) ' ', 970);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15520 + "'", int2 == 15520);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(6790, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 176540 + "'", int2 == 176540);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) 0, 25220);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) 10, 416);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2080 + "'", int2 == 2080);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(5044, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5044 + "'", int2 == 5044);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) 1, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(6790, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) 10, 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 970 + "'", int2 == 970);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(35, 2080);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 14560 + "'", int2 == 14560);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) '#', (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(800, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 800 + "'", int2 == 800);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) '4', 176540);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 176540 + "'", int2 == 176540);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1008800, 40352);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1008800 + "'", int2 == 1008800);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(10, 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 70 + "'", int2 == 70);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) '4', 15520);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 201760 + "'", int2 == 201760);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(14560, 126100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(416, 15520);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 201760 + "'", int2 == 201760);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(40352, 3395);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1412320 + "'", int2 == 1412320);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(70, 260);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1820 + "'", int2 == 1820);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) 1, 1300);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1300 + "'", int2 == 1300);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(40352, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(100, 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1300 + "'", int2 == 1300);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) -1, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(32, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 800 + "'", int2 == 800);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(416, 6790);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1412320 + "'", int2 == 1412320);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(260, 1412320);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1412320 + "'", int2 == 1412320);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(126100, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 126100 + "'", int2 == 126100);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(882700, 3395);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 882700 + "'", int2 == 882700);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(70, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 700 + "'", int2 == 700);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(176540, 1008800);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) '#', (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1820 + "'", int2 == 1820);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1008800, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1008800 + "'", int2 == 1008800);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(176540, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 176540 + "'", int2 == 176540);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) '#', 7061600);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((-1), (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(176540, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1412320 + "'", int2 == 1412320);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) ' ', 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 800 + "'", int2 == 800);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(15520, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1820, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1820 + "'", int2 == 1820);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((-1), 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) 0, 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) 'a', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) 0, 882700);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(108640, 3395);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 108640 + "'", int2 == 108640);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(70, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 70 + "'", int2 == 70);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) 100, 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 700 + "'", int2 == 700);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1300, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1300 + "'", int2 == 1300);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(2080, 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2080 + "'", int2 == 2080);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) -1, 15520);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15520 + "'", int2 == 15520);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) 1, 882700);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 882700 + "'", int2 == 882700);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(970, 70);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6790 + "'", int2 == 6790);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(35, 108640);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 108640 + "'", int2 == 108640);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) 100, 108640);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 543200 + "'", int2 == 543200);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) 100, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) 1, 882700);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 882700 + "'", int2 == 882700);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) -1, 160);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 160 + "'", int2 == 160);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1412320, 1412320);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1412320 + "'", int2 == 1412320);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(543200, 5044);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) 0, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) 10, 2080);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2080 + "'", int2 == 2080);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(15520, 260);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 201760 + "'", int2 == 201760);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1820, 1008800);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(970, 1412320);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1412320 + "'", int2 == 1412320);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(882700, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((-1), 700);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 700 + "'", int2 == 700);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) 100, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(14560, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 72800 + "'", int2 == 72800);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(35, 970);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6790 + "'", int2 == 6790);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(543200, 800);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 543200 + "'", int2 == 543200);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(100, 1008800);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1008800 + "'", int2 == 1008800);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(5044, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 126100 + "'", int2 == 126100);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) 10, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 260 + "'", int2 == 260);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) 100, 201760);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1008800 + "'", int2 == 1008800);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(543200, 2080);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) '4', 1008800);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1008800 + "'", int2 == 1008800);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(0, 126100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(25220, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 25220 + "'", int2 == 25220);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) ' ', 15520);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15520 + "'", int2 == 15520);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(100, 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9700 + "'", int2 == 9700);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(882700, 108640);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) 'a', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(126100, 700);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 882700 + "'", int2 == 882700);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(970, 1008800);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1008800 + "'", int2 == 1008800);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) ' ', (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(5044, 1820);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 176540 + "'", int2 == 176540);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(5044, 40352);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 40352 + "'", int2 == 40352);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(201760, 176540);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1412320 + "'", int2 == 1412320);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(0, 14560);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(52, (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1820 + "'", int2 == 1820);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(3104, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(543200, 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 543200 + "'", int2 == 543200);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1412320, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(543200, 416);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(15520, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 77600 + "'", int2 == 77600);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(0, 40352);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) -1, 970);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 970 + "'", int2 == 970);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(0, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(800, 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 77600 + "'", int2 == 77600);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(35, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1008800, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1008800 + "'", int2 == 1008800);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) 0, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(800, 40352);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1008800 + "'", int2 == 1008800);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) '#', (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3395 + "'", int2 == 3395);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(176540, 72800);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(100, 15520);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 77600 + "'", int2 == 77600);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) 0, 70);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(700, 700);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 700 + "'", int2 == 700);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(14560, 970);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1412320 + "'", int2 == 1412320);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(10, 25220);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 25220 + "'", int2 == 25220);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(160, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 800 + "'", int2 == 800);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(543200, 70);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 543200 + "'", int2 == 543200);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) -1, 1008800);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1008800 + "'", int2 == 1008800);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(6790, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6790 + "'", int2 == 6790);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) 0, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(0, 15520);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) '4', 40352);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 40352 + "'", int2 == 40352);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(0, 2080);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(416, 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 416 + "'", int2 == 416);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(700, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 700 + "'", int2 == 700);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1, 7061600);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(72800, 700);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 72800 + "'", int2 == 72800);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1008800, 882700);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(97, 108640);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 108640 + "'", int2 == 108640);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((-1), 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(77600, 176540);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1300, 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10400 + "'", int2 == 10400);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(100, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) 10, 3104);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15520 + "'", int2 == 15520);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(10400, 40352);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1008800 + "'", int2 == 1008800);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) -1, 800);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 800 + "'", int2 == 800);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) ' ', (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 800 + "'", int2 == 800);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(3104, 126100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1008800 + "'", int2 == 1008800);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(176540, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 176540 + "'", int2 == 176540);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((-1), 260);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 260 + "'", int2 == 260);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1412320, 700);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(25220, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(201760, 10400);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1008800 + "'", int2 == 1008800);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(416, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 416 + "'", int2 == 416);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(35, 1300);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9100 + "'", int2 == 9100);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(416, 1412320);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1412320 + "'", int2 == 1412320);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(35, 3104);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 108640 + "'", int2 == 108640);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(77600, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 77600 + "'", int2 == 77600);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(970, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 970 + "'", int2 == 970);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(9700, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 126100 + "'", int2 == 126100);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(543200, 882700);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(97, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1008800, 2080);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1008800 + "'", int2 == 1008800);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1412320, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1412320 + "'", int2 == 1412320);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(0, 970);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1300, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1300 + "'", int2 == 1300);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(72800, 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 72800 + "'", int2 == 72800);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(260, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 260 + "'", int2 == 260);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(108640, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 108640 + "'", int2 == 108640);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(160, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 160 + "'", int2 == 160);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) 1, 9100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9100 + "'", int2 == 9100);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(126100, (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 882700 + "'", int2 == 882700);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(5044, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5044 + "'", int2 == 5044);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((-1), 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) 10, 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 260 + "'", int2 == 260);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) '#', 1412320);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1412320 + "'", int2 == 1412320);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) 0, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) 100, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) 1, 5044);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5044 + "'", int2 == 5044);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(5044, 416);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 40352 + "'", int2 == 40352);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(10400, 1300);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10400 + "'", int2 == 10400);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(25220, 3395);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 176540 + "'", int2 == 176540);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(35, 14560);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 14560 + "'", int2 == 14560);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(72800, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 72800 + "'", int2 == 72800);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(52, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1300 + "'", int2 == 1300);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(2080, 160);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2080 + "'", int2 == 2080);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(2080, 70);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 14560 + "'", int2 == 14560);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) 0, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(72800, 7061600);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(10400, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10400 + "'", int2 == 10400);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(260, 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2080 + "'", int2 == 2080);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(5044, 126100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 126100 + "'", int2 == 126100);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(2080, 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 14560 + "'", int2 == 14560);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) 100, 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9700 + "'", int2 == 9700);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(3104, 1008800);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1008800 + "'", int2 == 1008800);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(0, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) 'a', 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9700 + "'", int2 == 9700);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(40352, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 40352 + "'", int2 == 40352);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) 1, 543200);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 543200 + "'", int2 == 543200);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(100, 40352);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1008800 + "'", int2 == 1008800);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(3104, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 77600 + "'", int2 == 77600);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(10400, 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10400 + "'", int2 == 10400);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1412320, 260);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1412320 + "'", int2 == 1412320);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(70, 25220);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 176540 + "'", int2 == 176540);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(15520, 882700);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) 'a', 800);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 77600 + "'", int2 == 77600);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) 100, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1300 + "'", int2 == 1300);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(800, 77600);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 77600 + "'", int2 == 77600);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(416, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2080 + "'", int2 == 2080);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) 'a', (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(6790, 160);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 108640 + "'", int2 == 108640);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(10, 543200);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 543200 + "'", int2 == 543200);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(160, 3104);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15520 + "'", int2 == 15520);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(9700, 9700);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9700 + "'", int2 == 9700);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(35, 25220);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 176540 + "'", int2 == 176540);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(160, 176540);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1412320 + "'", int2 == 1412320);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(14560, 3104);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1412320 + "'", int2 == 1412320);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(3395, 1300);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 882700 + "'", int2 == 882700);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(35, 5044);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 176540 + "'", int2 == 176540);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) 10, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(416, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(70, 160);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1120 + "'", int2 == 1120);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) '4', 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(97, 970);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 970 + "'", int2 == 970);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(32, 176540);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1412320 + "'", int2 == 1412320);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(77600, 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 77600 + "'", int2 == 77600);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(77600, 416);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1008800 + "'", int2 == 1008800);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) 1, 3395);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3395 + "'", int2 == 3395);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(160, 1820);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 14560 + "'", int2 == 14560);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(543200, 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 543200 + "'", int2 == 543200);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(543200, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(9700, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9700 + "'", int2 == 9700);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1820, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1820 + "'", int2 == 1820);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(160, 10400);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10400 + "'", int2 == 10400);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(0, 800);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) 100, 7061600);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1412320, 108640);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1412320 + "'", int2 == 1412320);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(32, 543200);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 543200 + "'", int2 == 543200);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(14560, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 14560 + "'", int2 == 14560);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) 100, 1008800);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1008800 + "'", int2 == 1008800);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) '#', 5044);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 176540 + "'", int2 == 176540);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(6790, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6790 + "'", int2 == 6790);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(10, 14560);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 14560 + "'", int2 == 14560);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(70, 126100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 882700 + "'", int2 == 882700);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(0, 108640);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(201760, 416);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 201760 + "'", int2 == 201760);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1820, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(882700, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 882700 + "'", int2 == 882700);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) 10, 970);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 970 + "'", int2 == 970);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(25220, 40352);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 201760 + "'", int2 == 201760);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(0, 9700);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(2080, 1008800);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1008800 + "'", int2 == 1008800);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(0, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(72800, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 72800 + "'", int2 == 72800);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(201760, (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1412320 + "'", int2 == 1412320);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(52, 1820);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1820 + "'", int2 == 1820);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(5044, 882700);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 882700 + "'", int2 == 882700);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(3104, 77600);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 77600 + "'", int2 == 77600);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) 'a', 201760);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 201760 + "'", int2 == 201760);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1300, 2080);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10400 + "'", int2 == 10400);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(15520, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 77600 + "'", int2 == 77600);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1820, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1820 + "'", int2 == 1820);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(0, 72800);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(70, 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1120 + "'", int2 == 1120);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(970, 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 25220 + "'", int2 == 25220);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(14560, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 72800 + "'", int2 == 72800);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(10, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(882700, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(3104, 700);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 543200 + "'", int2 == 543200);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(416, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10400 + "'", int2 == 10400);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(52, 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5044 + "'", int2 == 5044);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(6790, 1120);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 108640 + "'", int2 == 108640);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(0, (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1820, 7061600);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(260, 77600);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1008800 + "'", int2 == 1008800);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(52, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5044 + "'", int2 == 5044);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(800, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 800 + "'", int2 == 800);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(97, 7061600);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(260, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1300 + "'", int2 == 1300);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(0, 3395);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(72800, 72800);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 72800 + "'", int2 == 72800);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(0, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(201760, 70);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1412320 + "'", int2 == 1412320);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(416, 5044);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 40352 + "'", int2 == 40352);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(5044, 5044);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5044 + "'", int2 == 5044);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) 1, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(260, 882700);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 882700 + "'", int2 == 882700);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(700, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 700 + "'", int2 == 700);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(3104, 3395);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 108640 + "'", int2 == 108640);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) 0, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(10, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(970, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 970 + "'", int2 == 970);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(543200, 260);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(0, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(6790, 882700);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 882700 + "'", int2 == 882700);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(9100, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9100 + "'", int2 == 9100);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(14560, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(6790, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6790 + "'", int2 == 6790);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(108640, 970);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 108640 + "'", int2 == 108640);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(32, 1820);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 14560 + "'", int2 == 14560);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(40352, 40352);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 40352 + "'", int2 == 40352);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(35, 70);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 70 + "'", int2 == 70);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(416, 800);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10400 + "'", int2 == 10400);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(416, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 416 + "'", int2 == 416);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(6790, 700);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 67900 + "'", int2 == 67900);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(700, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 700 + "'", int2 == 700);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(35, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1300, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) 10, 7061600);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(126100, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1008800 + "'", int2 == 1008800);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(9100, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9100 + "'", int2 == 9100);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1300, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1300 + "'", int2 == 1300);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(67900, 1008800);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(126100, 1120);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(7061600, 5044);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(416, 10400);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10400 + "'", int2 == 10400);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) 10, 176540);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 176540 + "'", int2 == 176540);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(72800, 126100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(10400, 67900);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1120, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1120 + "'", int2 == 1120);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(9700, 25220);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 126100 + "'", int2 == 126100);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(5044, 15520);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 201760 + "'", int2 == 201760);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(10400, (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 72800 + "'", int2 == 72800);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(25220, 700);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 882700 + "'", int2 == 882700);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(2080, 77600);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1008800 + "'", int2 == 1008800);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(15520, 9100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1412320, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1412320 + "'", int2 == 1412320);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1412320, 1120);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1412320 + "'", int2 == 1412320);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(416, 7061600);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) 10, 67900);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 67900 + "'", int2 == 67900);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) '4', 9100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9100 + "'", int2 == 9100);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(32, (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1120 + "'", int2 == 1120);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(10400, 3104);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1008800 + "'", int2 == 1008800);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) 10, 6790);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6790 + "'", int2 == 6790);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) 10, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 970 + "'", int2 == 970);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(25220, 7061600);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(9700, 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 77600 + "'", int2 == 77600);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) 'a', 25220);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 25220 + "'", int2 == 25220);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(800, 70);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5600 + "'", int2 == 5600);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1820, 1820);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1820 + "'", int2 == 1820);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(5600, 108640);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 543200 + "'", int2 == 543200);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(108640, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) 100, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9700 + "'", int2 == 9700);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(3395, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(10400, 6790);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(176540, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 176540 + "'", int2 == 176540);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(6790, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6790 + "'", int2 == 6790);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(3104, 5600);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 543200 + "'", int2 == 543200);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(260, 67900);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 882700 + "'", int2 == 882700);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1008800, 5600);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) 100, 6790);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 67900 + "'", int2 == 67900);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(260, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 25220 + "'", int2 == 25220);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(700, 1820);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9100 + "'", int2 == 9100);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(970, 1120);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 108640 + "'", int2 == 108640);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(3104, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(176540, (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 176540 + "'", int2 == 176540);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(260, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1300 + "'", int2 == 1300);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(3395, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 67900 + "'", int2 == 67900);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(882700, 416);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) -1, 260);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 260 + "'", int2 == 260);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(52, 70);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1820 + "'", int2 == 1820);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) 100, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) 1, (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(6790, 5044);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 176540 + "'", int2 == 176540);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(126100, 3395);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 882700 + "'", int2 == 882700);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(7061600, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1, 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(52, 1120);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 14560 + "'", int2 == 14560);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(9700, 126100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 126100 + "'", int2 == 126100);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1300, 260);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1300 + "'", int2 == 1300);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) 1, 126100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 126100 + "'", int2 == 126100);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) ' ', 40352);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 40352 + "'", int2 == 40352);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) -1, 70);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 70 + "'", int2 == 70);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(7061600, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(201760, 260);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 201760 + "'", int2 == 201760);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(416, 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 416 + "'", int2 == 416);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(2080, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2080 + "'", int2 == 2080);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(14560, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) 1, 176540);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 176540 + "'", int2 == 176540);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(0, 1412320);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(970, 201760);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 201760 + "'", int2 == 201760);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(15520, 7061600);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(176540, 1120);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1412320 + "'", int2 == 1412320);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1820, 9100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9100 + "'", int2 == 9100);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(108640, 40352);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1412320 + "'", int2 == 1412320);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) '4', (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1300 + "'", int2 == 1300);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(40352, (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1412320 + "'", int2 == 1412320);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1, 160);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 160 + "'", int2 == 160);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) 1, 10400);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10400 + "'", int2 == 10400);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) 10, 800);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 800 + "'", int2 == 800);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(5600, 14560);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 72800 + "'", int2 == 72800);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(201760, 543200);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) 0, 1820);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(14560, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1412320 + "'", int2 == 1412320);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(10, 77600);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 77600 + "'", int2 == 77600);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1120, 882700);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(260, 72800);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 72800 + "'", int2 == 72800);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) 10, 1120);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1120 + "'", int2 == 1120);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(260, 40352);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 201760 + "'", int2 == 201760);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(260, 2080);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2080 + "'", int2 == 2080);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(3395, 72800);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) 10, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(882700, 10400);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(14560, 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 14560 + "'", int2 == 14560);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(970, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9700 + "'", int2 == 9700);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(970, 6790);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6790 + "'", int2 == 6790);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(260, 970);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 25220 + "'", int2 == 25220);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) 10, 3395);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6790 + "'", int2 == 6790);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(9100, 3395);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 882700 + "'", int2 == 882700);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(97, 1412320);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1412320 + "'", int2 == 1412320);
    }
}

