package LeastCommonMultiple;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

    public static boolean debug = false;

    @Test
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1001");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(2080, 25220);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 201760 + "'", int2 == 201760);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1300, 126100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 126100 + "'", int2 == 126100);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(32, 201760);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 201760 + "'", int2 == 201760);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(10400, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1008800 + "'", int2 == 1008800);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) 100, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1300 + "'", int2 == 1300);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(97, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3104 + "'", int2 == 3104);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1412320, 882700);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) '#', 800);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5600 + "'", int2 == 5600);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) '4', 9700);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 126100 + "'", int2 == 126100);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) -1, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((-1), 70);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 70 + "'", int2 == 70);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(160, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1120, 67900);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 543200 + "'", int2 == 543200);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) '4', (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) '#', 2080);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 14560 + "'", int2 == 14560);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) 0, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(9100, 416);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 72800 + "'", int2 == 72800);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(2080, 1120);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 14560 + "'", int2 == 14560);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) -1, 40352);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 40352 + "'", int2 == 40352);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(970, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 970 + "'", int2 == 970);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) '#', 160);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1120 + "'", int2 == 1120);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(52, 108640);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1412320 + "'", int2 == 1412320);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(3395, 9700);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 67900 + "'", int2 == 67900);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1300, 77600);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1008800 + "'", int2 == 1008800);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(0, 5600);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) 'a', 5044);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5044 + "'", int2 == 5044);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(126100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(800, 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10400 + "'", int2 == 10400);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(160, 700);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5600 + "'", int2 == 5600);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(2080, 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 201760 + "'", int2 == 201760);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(160, 126100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1008800 + "'", int2 == 1008800);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(40352, 543200);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) 1, 6790);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6790 + "'", int2 == 6790);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) 1, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) 0, 72800);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1120, 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 14560 + "'", int2 == 14560);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1820, 15520);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1412320 + "'", int2 == 1412320);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) 0, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(800, 882700);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) 'a', 2080);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 201760 + "'", int2 == 201760);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) ' ', (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 416 + "'", int2 == 416);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((-1), (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(35, 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(800, 67900);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 543200 + "'", int2 == 543200);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) 'a', 108640);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 108640 + "'", int2 == 108640);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(0, 1120);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(543200, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 543200 + "'", int2 == 543200);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(2080, 416);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2080 + "'", int2 == 2080);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1300, 14560);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 72800 + "'", int2 == 72800);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) '#', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(40352, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 40352 + "'", int2 == 40352);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(70, 5600);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5600 + "'", int2 == 5600);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(3395, 201760);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1412320 + "'", int2 == 1412320);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1412320, 1820);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1412320 + "'", int2 == 1412320);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(970, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 970 + "'", int2 == 970);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(9700, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(0, 1820);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(543200, 126100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) 'a', 7061600);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(32, 70);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1120 + "'", int2 == 1120);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(67900, (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 67900 + "'", int2 == 67900);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1008800, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1008800 + "'", int2 == 1008800);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(32, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(800, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10400 + "'", int2 == 10400);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(6790, 108640);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 108640 + "'", int2 == 108640);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(201760, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 201760 + "'", int2 == 201760);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(416, 882700);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1300, 970);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 126100 + "'", int2 == 126100);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(2080, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10400 + "'", int2 == 10400);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1120, 40352);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1412320 + "'", int2 == 1412320);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) 1, 67900);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 67900 + "'", int2 == 67900);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(14560, 25220);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1412320 + "'", int2 == 1412320);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) 1, 201760);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 201760 + "'", int2 == 201760);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) 0, 15520);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(0, 25220);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(6790, 126100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 882700 + "'", int2 == 882700);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(10400, 70);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 72800 + "'", int2 == 72800);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(32, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 800 + "'", int2 == 800);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(7061600, 2080);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(100, 160);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 800 + "'", int2 == 800);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) 10, 1008800);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1008800 + "'", int2 == 1008800);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(10400, 25220);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1008800 + "'", int2 == 1008800);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) ' ', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(970, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 970 + "'", int2 == 970);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(543200, 9700);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 543200 + "'", int2 == 543200);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(15520, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15520 + "'", int2 == 15520);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(176540, 1820);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 176540 + "'", int2 == 176540);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(9100, 67900);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 882700 + "'", int2 == 882700);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(15520, 10400);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1008800 + "'", int2 == 1008800);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(5044, 72800);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) 0, 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(970, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9700 + "'", int2 == 9700);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) 0, 9100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(70, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 70 + "'", int2 == 70);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(2080, 14560);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 14560 + "'", int2 == 14560);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(32, 800);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 800 + "'", int2 == 800);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1, 67900);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 67900 + "'", int2 == 67900);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(10400, 9100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 72800 + "'", int2 == 72800);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(160, 543200);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 543200 + "'", int2 == 543200);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(72800, 14560);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 72800 + "'", int2 == 72800);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(5044, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5044 + "'", int2 == 5044);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(108640, 7061600);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(160, 3395);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 108640 + "'", int2 == 108640);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(160, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 160 + "'", int2 == 160);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(100, 543200);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 543200 + "'", int2 == 543200);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(77600, 201760);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1008800 + "'", int2 == 1008800);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) 10, 260);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 260 + "'", int2 == 260);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) ' ', 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 160 + "'", int2 == 160);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(77600, 25220);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1008800 + "'", int2 == 1008800);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(9700, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9700 + "'", int2 == 9700);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1, 3104);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3104 + "'", int2 == 3104);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1412320, 970);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1412320 + "'", int2 == 1412320);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(32, 160);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 160 + "'", int2 == 160);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) 0, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(126100, 25220);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 126100 + "'", int2 == 126100);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) '#', 67900);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 67900 + "'", int2 == 67900);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1300, 543200);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(72800, 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1300, 67900);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 882700 + "'", int2 == 882700);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1008800, 7061600);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) 0, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) 100, 15520);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 77600 + "'", int2 == 77600);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(5044, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5044 + "'", int2 == 5044);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1120, 5600);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5600 + "'", int2 == 5600);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(3395, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6790 + "'", int2 == 6790);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(201760, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1008800 + "'", int2 == 1008800);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) -1, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(25220, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 201760 + "'", int2 == 201760);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) 100, 2080);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10400 + "'", int2 == 10400);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(5600, 1300);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 72800 + "'", int2 == 72800);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1120, 201760);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1412320 + "'", int2 == 1412320);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(70, 77600);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 543200 + "'", int2 == 543200);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1008800, 970);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1008800 + "'", int2 == 1008800);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) -1, 3104);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3104 + "'", int2 == 3104);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(126100, 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 126100 + "'", int2 == 126100);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(0, 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(201760, 970);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 201760 + "'", int2 == 201760);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(126100, 882700);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 882700 + "'", int2 == 882700);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1, 10400);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10400 + "'", int2 == 10400);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1120, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5600 + "'", int2 == 5600);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) 0, 416);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(3395, 40352);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1412320 + "'", int2 == 1412320);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) 0, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) 'a', 882700);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 882700 + "'", int2 == 882700);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) 0, 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(160, 882700);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) 0, 1008800);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) '4', 25220);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 25220 + "'", int2 == 25220);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) 1, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(5044, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5044 + "'", int2 == 5044);
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(25220, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 25220 + "'", int2 == 25220);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(10, 176540);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 176540 + "'", int2 == 176540);
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(126100, 9100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 882700 + "'", int2 == 882700);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(3395, 3104);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 108640 + "'", int2 == 108640);
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) 100, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((-1), 1008800);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1008800 + "'", int2 == 1008800);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(700, 5600);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5600 + "'", int2 == 5600);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) 1, 700);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 700 + "'", int2 == 700);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(10400, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10400 + "'", int2 == 10400);
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(40352, 5044);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 40352 + "'", int2 == 40352);
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(543200, 108640);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 543200 + "'", int2 == 543200);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(176540, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(6790, 6790);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6790 + "'", int2 == 6790);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(160, 416);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2080 + "'", int2 == 2080);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(25220, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 126100 + "'", int2 == 126100);
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(126100, 201760);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1008800 + "'", int2 == 1008800);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(2080, 10400);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10400 + "'", int2 == 10400);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(9700, 176540);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 882700 + "'", int2 == 882700);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(0, 7061600);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(416, 1120);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 14560 + "'", int2 == 14560);
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1120, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1120 + "'", int2 == 1120);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(0, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1, 2080);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2080 + "'", int2 == 2080);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(5600, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5600 + "'", int2 == 5600);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(700, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 700 + "'", int2 == 700);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(2080, 72800);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 72800 + "'", int2 == 72800);
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) 100, 70);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 700 + "'", int2 == 700);
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(40352, 1120);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1412320 + "'", int2 == 1412320);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(97, 67900);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 67900 + "'", int2 == 67900);
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(201760, 40352);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 201760 + "'", int2 == 201760);
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1820, 416);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 14560 + "'", int2 == 14560);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1820, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1820 + "'", int2 == 1820);
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(7061600, 15520);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(52, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) 1, 2080);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2080 + "'", int2 == 2080);
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(2080, 1300);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10400 + "'", int2 == 10400);
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) 10, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(32, 14560);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 14560 + "'", int2 == 14560);
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1412320, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1412320 + "'", int2 == 1412320);
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(9700, 108640);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 543200 + "'", int2 == 543200);
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) -1, 800);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 800 + "'", int2 == 800);
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(32, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) ' ', 67900);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 543200 + "'", int2 == 543200);
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(6790, 970);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6790 + "'", int2 == 6790);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(700, 543200);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 543200 + "'", int2 == 543200);
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(160, 15520);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15520 + "'", int2 == 15520);
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(126100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(5600, 543200);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 543200 + "'", int2 == 543200);
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(67900, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 67900 + "'", int2 == 67900);
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(5600, 15520);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 543200 + "'", int2 == 543200);
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) 1, 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(970, 9100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 882700 + "'", int2 == 882700);
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(40352, 77600);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1008800 + "'", int2 == 1008800);
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(70, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(25220, 1008800);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1008800 + "'", int2 == 1008800);
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(32, 1120);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1120 + "'", int2 == 1120);
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(14560, 14560);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 14560 + "'", int2 == 14560);
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(800, 1008800);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1008800 + "'", int2 == 1008800);
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(9700, 77600);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 77600 + "'", int2 == 77600);
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) 0, 3104);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(52, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1300 + "'", int2 == 1300);
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(700, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 700 + "'", int2 == 700);
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(416, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10400 + "'", int2 == 10400);
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(176540, 6790);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 176540 + "'", int2 == 176540);
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(10, 72800);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 72800 + "'", int2 == 72800);
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(3104, 1412320);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1412320 + "'", int2 == 1412320);
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(5600, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) 10, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1412320, 9700);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(14560, 416);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 14560 + "'", int2 == 14560);
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(10400, 800);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10400 + "'", int2 == 10400);
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) 'a', 3104);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3104 + "'", int2 == 3104);
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(70, 1120);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1120 + "'", int2 == 1120);
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(52, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1300 + "'", int2 == 1300);
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(9700, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9700 + "'", int2 == 9700);
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(5044, 3395);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 176540 + "'", int2 == 176540);
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(15520, 15520);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15520 + "'", int2 == 15520);
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1820, 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 14560 + "'", int2 == 14560);
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(260, 700);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9100 + "'", int2 == 9100);
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1120, 1412320);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1412320 + "'", int2 == 1412320);
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(700, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5600 + "'", int2 == 5600);
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(52, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) '#', (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(176540, 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1412320 + "'", int2 == 1412320);
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(52, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(52, 7061600);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(3104, 176540);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1412320 + "'", int2 == 1412320);
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(10, 260);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 260 + "'", int2 == 260);
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(3104, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 77600 + "'", int2 == 77600);
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) 0, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(5600, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5600 + "'", int2 == 5600);
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(77600, 1300);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1008800 + "'", int2 == 1008800);
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(7061600, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) -1, 260);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 260 + "'", int2 == 260);
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(800, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 800 + "'", int2 == 800);
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(160, 70);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1120 + "'", int2 == 1120);
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) ' ', 108640);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 108640 + "'", int2 == 108640);
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) 'a', 77600);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 77600 + "'", int2 == 77600);
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(72800, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 72800 + "'", int2 == 72800);
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(9700, 260);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 126100 + "'", int2 == 126100);
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(40352, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 201760 + "'", int2 == 201760);
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(10, 9100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9100 + "'", int2 == 9100);
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) ' ', 700);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5600 + "'", int2 == 5600);
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1008800, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(126100, 2080);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1008800 + "'", int2 == 1008800);
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) 0, 3395);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(15520, 1412320);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1412320 + "'", int2 == 1412320);
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(201760, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 201760 + "'", int2 == 201760);
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(70, 1008800);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(72800, 882700);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1412320, 72800);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(970, 72800);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(5044, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 40352 + "'", int2 == 40352);
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(176540, 25220);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 176540 + "'", int2 == 176540);
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(97, 1120);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 108640 + "'", int2 == 108640);
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) ' ', (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(9700, 970);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9700 + "'", int2 == 9700);
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(32, 77600);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 77600 + "'", int2 == 77600);
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1300, 416);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10400 + "'", int2 == 10400);
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(5600, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5600 + "'", int2 == 5600);
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) ' ', (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) 1, 260);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 260 + "'", int2 == 260);
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(0, 543200);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(416, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 416 + "'", int2 == 416);
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) '4', (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(5600, 5044);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(9100, 176540);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 882700 + "'", int2 == 882700);
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(25220, 6790);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 176540 + "'", int2 == 176540);
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(97, 15520);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15520 + "'", int2 == 15520);
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(32, 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1120 + "'", int2 == 1120);
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(25220, 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 176540 + "'", int2 == 176540);
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(2080, 7061600);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) 0, 882700);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(970, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 970 + "'", int2 == 970);
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1288");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(52, 9700);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 126100 + "'", int2 == 126100);
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1289");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(25220, 9100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 882700 + "'", int2 == 882700);
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1290");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) '#', 1820);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1820 + "'", int2 == 1820);
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1291");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(800, 416);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10400 + "'", int2 == 10400);
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1292");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) ' ', 176540);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1412320 + "'", int2 == 1412320);
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1293");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(25220, 67900);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 882700 + "'", int2 == 882700);
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1294");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(100, 970);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9700 + "'", int2 == 9700);
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1295");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) 1, 15520);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15520 + "'", int2 == 15520);
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1296");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(9100, 7061600);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1297");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) ' ', 882700);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(5600, 176540);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1299");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) '#', 1300);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9100 + "'", int2 == 9100);
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1300");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(201760, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 201760 + "'", int2 == 201760);
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1301");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) 1, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1302");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(9700, 6790);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 67900 + "'", int2 == 67900);
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1303");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) 100, 25220);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 126100 + "'", int2 == 126100);
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1304");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) 10, 67900);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 67900 + "'", int2 == 67900);
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1305");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(201760, 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 201760 + "'", int2 == 201760);
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1306");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(52, 1412320);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1412320 + "'", int2 == 1412320);
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1307");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(970, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1308");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(9100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1309");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) 10, 15520);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15520 + "'", int2 == 15520);
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1310");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1820, 201760);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1412320 + "'", int2 == 1412320);
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1311");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) 1, 14560);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 14560 + "'", int2 == 14560);
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1312");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(2080, 1412320);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1412320 + "'", int2 == 1412320);
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1313");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(108640, 67900);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 543200 + "'", int2 == 543200);
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1314");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) -1, 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1315");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) 0, 970);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1316");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1820, 1120);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 14560 + "'", int2 == 14560);
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1317");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(108640, 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 108640 + "'", int2 == 108640);
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1318");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) 10, 882700);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 882700 + "'", int2 == 882700);
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1319");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1300, 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9100 + "'", int2 == 9100);
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1320");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(108640, 9100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1321");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(3104, 9700);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 77600 + "'", int2 == 77600);
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1322");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(0, 1300);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1323");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(40352, 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 40352 + "'", int2 == 40352);
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1324");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(416, 2080);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2080 + "'", int2 == 2080);
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1325");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) 10, 543200);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 543200 + "'", int2 == 543200);
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1326");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(882700, 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 882700 + "'", int2 == 882700);
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1327");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) 1, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1328");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(700, (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 700 + "'", int2 == 700);
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1329");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) -1, 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1330");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(543200, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 543200 + "'", int2 == 543200);
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1331");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(52, 6790);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 176540 + "'", int2 == 176540);
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1332");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) 0, 9700);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1333");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(9100, 72800);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 72800 + "'", int2 == 72800);
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1334");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(3104, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 40352 + "'", int2 == 40352);
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1335");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(800, 15520);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 77600 + "'", int2 == 77600);
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1336");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) 0, 10400);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1337");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(6790, 1300);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 882700 + "'", int2 == 882700);
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1338");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) 100, 1008800);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1008800 + "'", int2 == 1008800);
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1339");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) '#', (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 70 + "'", int2 == 70);
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1340");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) 10, 1300);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1300 + "'", int2 == 1300);
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1341");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(35, 1008800);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1342");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(32, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1343");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(7061600, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1344");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) '4', 3104);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 40352 + "'", int2 == 40352);
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1345");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) '#', 5600);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5600 + "'", int2 == 5600);
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1346");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(100, 3104);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 77600 + "'", int2 == 77600);
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1347");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) ' ', 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 416 + "'", int2 == 416);
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1348");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1120, 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 108640 + "'", int2 == 108640);
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1349");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(15520, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 201760 + "'", int2 == 201760);
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1350");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(2080, 3104);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 201760 + "'", int2 == 201760);
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1351");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(260, 176540);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 176540 + "'", int2 == 176540);
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1352");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) 100, 1412320);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1353");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(32, 1008800);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1008800 + "'", int2 == 1008800);
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1354");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) -1, 67900);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 67900 + "'", int2 == 67900);
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1355");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(5600, 77600);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 543200 + "'", int2 == 543200);
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1356");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(108640, 108640);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 108640 + "'", int2 == 108640);
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1357");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) '#', 9700);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 67900 + "'", int2 == 67900);
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1358");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(6790, 14560);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1412320 + "'", int2 == 1412320);
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1359");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(6790, 72800);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1360");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1120, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1120 + "'", int2 == 1120);
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1361");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(3395, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3395 + "'", int2 == 3395);
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1362");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(201760, 1120);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1412320 + "'", int2 == 1412320);
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1363");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(160, 72800);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 72800 + "'", int2 == 72800);
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1364");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(800, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1365");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(35, 1412320);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1412320 + "'", int2 == 1412320);
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1366");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(97, 40352);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 40352 + "'", int2 == 40352);
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1367");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(0, 77600);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1368");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) 0, 67900);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1369");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) '#', (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1120 + "'", int2 == 1120);
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1370");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(800, 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 800 + "'", int2 == 800);
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1371");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(882700, 970);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 882700 + "'", int2 == 882700);
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1372");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(3395, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1373");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(800, 9100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 72800 + "'", int2 == 72800);
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1374");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(40352, 1820);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1412320 + "'", int2 == 1412320);
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1375");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((-1), 800);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 800 + "'", int2 == 800);
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1376");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) -1, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1377");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(32, 416);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 416 + "'", int2 == 416);
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1378");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) 10, 6790);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6790 + "'", int2 == 6790);
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1379");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) 10, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1380");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) -1, 3104);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3104 + "'", int2 == 3104);
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1381");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) -1, 14560);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 14560 + "'", int2 == 14560);
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1382");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(97, 160);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15520 + "'", int2 == 15520);
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1383");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) 100, 260);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1300 + "'", int2 == 1300);
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1384");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(416, 9100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 72800 + "'", int2 == 72800);
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1385");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1, 108640);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 108640 + "'", int2 == 108640);
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1386");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(0, 882700);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1387");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(10400, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1388");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(100, 700);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 700 + "'", int2 == 700);
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1389");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(0, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1390");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(10, 970);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 970 + "'", int2 == 970);
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1391");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1008800, 160);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1008800 + "'", int2 == 1008800);
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1392");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(72800, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 72800 + "'", int2 == 72800);
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1393");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(126100, 70);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 882700 + "'", int2 == 882700);
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1394");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(9100, 970);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 882700 + "'", int2 == 882700);
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1395");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(10400, 543200);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1396");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(70, 6790);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6790 + "'", int2 == 6790);
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1397");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(201760, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 201760 + "'", int2 == 201760);
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1398");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(201760, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1399");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(10, 3104);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15520 + "'", int2 == 15520);
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1400");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(5044, 77600);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1008800 + "'", int2 == 1008800);
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1401");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(3104, 9100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1402");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) '#', 1008800);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1403");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(10400, 260);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10400 + "'", int2 == 10400);
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1404");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(52, 1300);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1300 + "'", int2 == 1300);
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1405");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) 0, 176540);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1406");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) 'a', (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9700 + "'", int2 == 9700);
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1407");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) ' ', 14560);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 14560 + "'", int2 == 14560);
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1408");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(3104, 2080);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 201760 + "'", int2 == 201760);
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1409");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(6790, 3395);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6790 + "'", int2 == 6790);
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1410");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(970, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9700 + "'", int2 == 9700);
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1411");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(3395, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3395 + "'", int2 == 3395);
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1412");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(6790, 25220);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 176540 + "'", int2 == 176540);
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1413");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) '#', 3104);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 108640 + "'", int2 == 108640);
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1414");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(70, 543200);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 543200 + "'", int2 == 543200);
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1415");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(3104, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3104 + "'", int2 == 3104);
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1416");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(260, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 260 + "'", int2 == 260);
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1417");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(108640, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 108640 + "'", int2 == 108640);
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1418");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(126100, 5600);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1419");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) 10, 10400);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10400 + "'", int2 == 10400);
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1420");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) -1, 176540);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 176540 + "'", int2 == 176540);
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1421");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(72800, (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 72800 + "'", int2 == 72800);
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1422");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(5044, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 126100 + "'", int2 == 126100);
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1423");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(67900, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 67900 + "'", int2 == 67900);
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1424");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(77600, 15520);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 77600 + "'", int2 == 77600);
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1425");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(160, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 160 + "'", int2 == 160);
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1426");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) 100, 882700);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 882700 + "'", int2 == 882700);
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1427");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) '4', 543200);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1428");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(882700, 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 882700 + "'", int2 == 882700);
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1429");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) 1, 72800);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 72800 + "'", int2 == 72800);
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1430");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) 'a', 1820);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 176540 + "'", int2 == 176540);
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1431");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1300, 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1300 + "'", int2 == 1300);
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1432");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(126100, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 126100 + "'", int2 == 126100);
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1433");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(201760, 201760);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 201760 + "'", int2 == 201760);
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1434");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(416, 108640);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1412320 + "'", int2 == 1412320);
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1435");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(52, 126100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 126100 + "'", int2 == 126100);
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1436");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(160, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1437");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1412320, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1438");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(32, 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1439");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(25220, 14560);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1412320 + "'", int2 == 1412320);
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1440");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(3395, 67900);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 67900 + "'", int2 == 67900);
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1441");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(7061600, 14560);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1442");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(126100, 416);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1008800 + "'", int2 == 1008800);
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1443");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(126100, 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1008800 + "'", int2 == 1008800);
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1444");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) 100, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1445");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) 1, 1120);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1120 + "'", int2 == 1120);
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1446");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(260, 7061600);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1447");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(543200, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 543200 + "'", int2 == 543200);
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1448");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1820, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 176540 + "'", int2 == 176540);
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1449");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1120, 1300);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 72800 + "'", int2 == 72800);
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1450");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(10400, 72800);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 72800 + "'", int2 == 72800);
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1451");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(108640, 882700);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1452");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) 0, 700);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1453");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(5600, 970);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 543200 + "'", int2 == 543200);
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1454");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(25220, 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 201760 + "'", int2 == 201760);
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1455");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (byte) 0, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1456");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(9100, 2080);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 72800 + "'", int2 == 72800);
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1457");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(108640, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1458");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) -1, 1008800);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1008800 + "'", int2 == 1008800);
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1459");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(10400, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10400 + "'", int2 == 10400);
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1460");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(40352, 67900);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1461");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(800, 72800);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 72800 + "'", int2 == 72800);
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1462");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(176540, 543200);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1463");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((-1), 14560);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 14560 + "'", int2 == 14560);
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1464");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(416, 25220);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 201760 + "'", int2 == 201760);
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1465");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(882700, 1120);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1466");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) ' ', 9700);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 77600 + "'", int2 == 77600);
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1467");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) 10, 1412320);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1412320 + "'", int2 == 1412320);
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1468");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) -1, 25220);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 25220 + "'", int2 == 25220);
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1469");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(97, 1008800);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1008800 + "'", int2 == 1008800);
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1470");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(543200, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 543200 + "'", int2 == 543200);
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1471");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(100, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1300 + "'", int2 == 1300);
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1472");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(970, 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15520 + "'", int2 == 15520);
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1473");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) 1, 5600);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5600 + "'", int2 == 5600);
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1474");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(10400, 700);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 72800 + "'", int2 == 72800);
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1475");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(260, 416);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2080 + "'", int2 == 2080);
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1476");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(882700, 176540);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 882700 + "'", int2 == 882700);
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1477");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1, 1300);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1300 + "'", int2 == 1300);
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1478");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) '4', 5600);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 72800 + "'", int2 == 72800);
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1479");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) '4', 6790);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 176540 + "'", int2 == 176540);
    }

    @Test
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1480");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) -1, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1481");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(77600, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1008800 + "'", int2 == 1008800);
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1482");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(700, 72800);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 72800 + "'", int2 == 72800);
    }

    @Test
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1483");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(72800, 3104);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1484");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(15520, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15520 + "'", int2 == 15520);
    }

    @Test
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1485");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(160, 7061600);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1486");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm((int) (short) 100, 77600);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 77600 + "'", int2 == 77600);
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1487");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1, (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1488");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(970, 176540);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 176540 + "'", int2 == 176540);
    }

    @Test
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1489");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(201760, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 201760 + "'", int2 == 201760);
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1490");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(970, 5044);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 25220 + "'", int2 == 25220);
    }

    @Test
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1491");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(5600, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5600 + "'", int2 == 5600);
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1492");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(15520, 160);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15520 + "'", int2 == 15520);
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1493");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(126100, 108640);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1494");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(0, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1495");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(32, 260);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2080 + "'", int2 == 2080);
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1496");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(201760, 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 201760 + "'", int2 == 201760);
    }

    @Test
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1497");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(72800, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 72800 + "'", int2 == 72800);
    }

    @Test
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1498");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(1008800, 14560);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7061600 + "'", int2 == 7061600);
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1499");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(126100, 3104);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1008800 + "'", int2 == 1008800);
    }

    @Test
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1500");
        int int2 = com.thealgorithms.maths.LeastCommonMultiple.lcm(416, 3395);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1412320 + "'", int2 == 1412320);
    }
}
