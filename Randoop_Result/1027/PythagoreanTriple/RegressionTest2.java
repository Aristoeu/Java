package PythagoreanTriple;

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
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 1, (int) (byte) 1, (int) '4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) -1, (int) '#', (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((-1), (int) (short) 1, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) '4', (int) ' ', (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) 'a', 1, 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 1, (int) (byte) -1, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) -1, (int) (short) -1, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 10, (int) (short) 100, 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 0, (int) (short) 100, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) '4', (int) 'a', (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) -1, (int) 'a', 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 100, (int) (short) 10, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) ' ', (int) (short) 100, (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 0, 10, 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) -1, (int) (byte) 0, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(100, (int) (short) -1, 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(10, (int) '#', 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) '4', (int) (byte) -1, (int) '4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(10, (int) (byte) 1, (int) '#');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) '#', (-1), (int) '4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) '4', (int) (short) -1, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(0, (int) (byte) 10, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) -1, (int) (byte) 0, (int) '4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 0, (int) (short) 100, (int) '4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(0, 1, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(0, (int) (short) 1, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(10, (int) (short) 0, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(0, (int) (short) 100, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 10, (int) ' ', (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 1, (int) (byte) -1, (int) '#');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) ' ', 10, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 10, (int) ' ', 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(10, (int) (short) 0, (int) '4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 1, 0, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 0, 0, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 1, (int) (byte) 1, (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(0, 0, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) -1, (int) (short) 0, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((-1), (int) (short) 0, 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) '4', (int) 'a', (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) -1, (int) (byte) 0, 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 1, (int) (byte) 100, 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 1, (int) (short) 1, 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) '#', (int) (short) 100, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(10, (int) (short) -1, 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(100, 100, (int) '4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(0, 0, (int) '4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(100, (int) (byte) 1, (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((-1), (int) ' ', (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 1, (int) (short) 0, (int) '#');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) -1, (int) '4', (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 0, (int) '4', (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(100, 1, 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(10, (int) (short) 100, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(0, 100, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 0, (-1), (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 100, (int) (byte) 10, (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((-1), 10, (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) ' ', (int) (short) 1, 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) '4', (int) (byte) 1, 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 100, (int) (short) 0, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 10, (int) ' ', (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 10, (int) (byte) 100, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((-1), (int) ' ', 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) ' ', (int) (byte) 100, (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 0, (int) (byte) 1, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(0, (int) '4', (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(0, (int) (short) -1, (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 1, (int) 'a', 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 100, (int) (byte) 100, (int) '#');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) -1, (int) '#', (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 1, (int) '#', (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) ' ', (int) '#', (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 0, (int) (byte) 1, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 1, (int) (byte) 0, (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(1, (int) (short) 10, (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 1, (int) (short) -1, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((-1), (int) (short) 0, (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(100, (int) '#', (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 1, (int) (short) 100, (int) '#');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) ' ', (int) (short) -1, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 1, 1, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) ' ', (int) (short) 1, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) '#', (int) (byte) 10, (int) '#');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) -1, 100, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 0, 1, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 0, 0, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) ' ', (int) (byte) 0, 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(0, 0, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) '#', (int) (byte) 10, 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) ' ', 0, 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 10, (int) '4', (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(0, (int) (short) 0, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 1, (int) (byte) -1, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 0, (int) (short) 100, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) '#', (int) ' ', 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(10, (int) ' ', (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) '#', (-1), (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 0, (int) (byte) 10, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(1, (int) (short) 10, 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) -1, (int) (byte) 100, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 0, (int) '#', (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 1, (int) 'a', (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 1, (int) (byte) -1, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) -1, 1, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 0, 100, 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 100, (int) '4', (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) '#', (int) 'a', 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 100, (int) (short) 10, 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) '4', 1, (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 10, (int) '4', (int) '4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 1, 1, 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) -1, (int) (byte) 1, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 1, (int) (short) 0, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 1, (int) (short) 100, (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 10, (int) (short) -1, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) '#', (int) ' ', (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(10, 10, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 1, (int) (short) 10, (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 0, (int) ' ', (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(100, (int) (byte) 10, (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(1, 100, 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(10, (int) (byte) -1, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 100, (int) (byte) 1, (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 10, (int) '4', 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) 'a', (int) (short) -1, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) -1, (-1), (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(100, 0, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(10, (int) (short) 10, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) -1, (int) (short) 100, (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(0, 0, (int) '#');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(1, 10, (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(0, (int) (short) 0, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) '4', (int) (short) 0, (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) '#', (int) (short) -1, (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 1, (int) ' ', 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 10, 100, (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 10, (int) (short) 1, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 1, (int) ' ', 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 0, 0, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) -1, (int) (byte) 100, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 10, (int) '4', (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(10, (int) 'a', (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) '4', 10, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(0, (int) (byte) -1, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) 'a', 1, (int) '4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) ' ', (-1), (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 10, (int) 'a', 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(100, (int) '#', 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 100, (int) (short) 1, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) -1, (int) (byte) 100, 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 0, 1, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 0, (-1), (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) -1, (int) (short) 1, (int) '#');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) '#', (int) (short) 0, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(1, (int) (byte) 0, 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(10, 10, (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(0, (int) (short) -1, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 1, 0, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 1, (int) (byte) 100, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) -1, (int) (byte) 100, (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(100, (int) 'a', 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((-1), (int) (byte) 0, (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((-1), 1, (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) '#', (int) '#', (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(10, (int) (short) 0, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(1, 1, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 100, (int) (short) 1, (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(1, (int) (short) 0, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 100, (int) (short) -1, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(1, (int) 'a', 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 0, (int) (short) 1, (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 100, (int) (byte) 100, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) -1, (int) (short) 1, (int) '4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 100, (int) (short) 100, (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 100, (int) (short) 10, 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) '4', 0, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 10, 0, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) '4', 0, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 0, (int) (byte) -1, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) '#', (-1), (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 100, (int) (short) 100, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 0, (int) (byte) 10, (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 1, 100, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(1, (int) (byte) -1, (int) '4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 10, (int) '#', (int) '4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) 'a', (int) (short) -1, 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 0, (int) '#', (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 0, (int) (byte) 10, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) -1, (int) (short) -1, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) '#', 10, 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) 'a', (int) (short) 10, (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 100, (int) (byte) -1, (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 10, (int) (short) 0, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(10, (int) (byte) 1, 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((-1), (int) (short) -1, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) -1, (int) ' ', (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(1, (int) (byte) -1, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) 'a', (int) (short) 10, (int) '4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) ' ', (int) (byte) 100, 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(1, (int) (short) 1, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 10, (int) '#', (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 1, (int) (short) 1, 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) '#', (int) (short) 10, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) -1, (int) '4', (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 0, (int) (short) 100, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(1, (int) (byte) 10, (int) '4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) -1, 10, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) -1, (int) (byte) 10, 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 1, (int) '4', (int) '4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) 'a', 10, (int) '4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) '4', 10, (int) '4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) -1, (int) '#', 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) 'a', 1, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) 'a', (int) (short) -1, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 10, (int) (byte) 10, 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(0, (int) '4', 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(100, (int) '#', (int) '4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) ' ', (int) ' ', (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(100, (int) '4', (int) '#');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(10, (int) (short) -1, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 0, (int) (byte) 1, 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 100, (int) '#', (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) -1, 0, (int) '4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) '4', (int) (short) -1, 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 0, (int) (byte) 100, 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) '#', (int) (short) 10, 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) '#', 0, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(10, (int) '#', (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 0, (int) (short) 1, 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) ' ', 1, 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 100, (int) '#', (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 10, (int) (byte) 100, (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 1, (int) (short) 0, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(100, 0, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((-1), (int) '#', (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 10, 0, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(0, (int) '4', (int) '4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) ' ', (int) (byte) 1, 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 100, (int) (byte) 10, 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(10, 10, 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 100, (int) (short) 0, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 100, 0, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 0, (int) (byte) 1, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((-1), (int) ' ', (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(0, (-1), 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((-1), (int) (byte) -1, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) -1, 1, 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 10, (int) '4', (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 0, (int) '4', (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 10, 1, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) -1, (int) (short) 0, 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 1, (int) (byte) 1, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 0, 100, (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(0, (int) (byte) 0, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((-1), (int) (short) 1, 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 0, (-1), (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) 'a', (int) (byte) 0, (int) '#');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 100, (int) (byte) 100, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 0, (int) (byte) 100, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 1, (int) (short) 100, (int) '#');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(0, 1, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) 'a', (int) '#', 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(10, (int) (short) 10, (int) '#');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 1, (int) (short) -1, 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) '#', 1, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) -1, (int) ' ', 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) 'a', (int) (short) 100, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 100, 0, (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 1, (int) (short) 10, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(10, (int) (short) 1, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) -1, (-1), (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(10, (int) '4', (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 0, 100, 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(10, 100, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 0, (-1), 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((-1), (-1), (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) '4', (int) (byte) 0, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) -1, (int) (short) 1, 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 100, 0, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 100, (int) (short) 0, (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) -1, (int) (short) -1, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) 'a', (int) (short) 10, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 1, 100, 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 1, 0, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 10, (int) (byte) -1, 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) 'a', (int) '4', (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1288");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) -1, (int) '#', (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1289");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) -1, (int) (short) 1, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1290");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 1, (int) (short) 10, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1291");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) '#', (int) (byte) -1, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1292");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) -1, (-1), (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1293");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(10, (int) (byte) 10, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1294");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 1, 0, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1295");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 1, 1, 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1296");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 10, (int) (short) 100, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1297");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 1, 1, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) '#', 1, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1299");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) '4', 10, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1300");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(10, (int) '4', (int) '#');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1301");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 0, 1, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1302");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 100, (-1), (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1303");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(0, 0, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1304");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 1, (int) (byte) 1, 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1305");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(1, (int) (short) 10, 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1306");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 100, (int) (byte) 100, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1307");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 10, (int) (short) 10, 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1308");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(100, (int) (byte) 0, (int) '#');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1309");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) ' ', (int) 'a', (int) '#');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1310");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) -1, (int) 'a', (int) '4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1311");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) -1, (int) '4', (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1312");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((-1), (int) 'a', 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1313");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) '#', (int) (byte) 0, (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1314");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) '4', (int) (short) 100, 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1315");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 1, 10, (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1316");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) 'a', (int) (short) 100, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1317");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((-1), (int) '#', 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1318");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((-1), 10, 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1319");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((-1), (int) (short) 1, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1320");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((-1), (int) (byte) 10, (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1321");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) '#', (-1), (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1322");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) -1, (int) (short) -1, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1323");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) '4', (int) (short) -1, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1324");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(100, (int) (byte) 0, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1325");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 100, (-1), 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1326");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 0, (int) '#', (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1327");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(1, (int) (byte) 10, (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1328");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 0, (int) (byte) 10, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1329");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) 'a', (int) '#', (int) '#');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1330");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) ' ', (int) (byte) -1, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1331");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(1, (int) '#', 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1332");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 100, (-1), (int) '#');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1333");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) '#', (int) '#', 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1334");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 0, 100, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1335");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) '#', (int) (byte) 100, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1336");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(10, 0, 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1337");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 10, (int) (byte) 0, 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1338");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(1, (-1), (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1339");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 0, (int) (short) 100, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1340");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) -1, 1, (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1341");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) '4', 0, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1342");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((-1), (int) (byte) 100, (int) '4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1343");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) 'a', (int) (byte) -1, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1344");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 0, (int) (byte) 0, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1345");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(0, (int) (short) 10, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1346");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) -1, (int) (short) 0, (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1347");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) -1, (int) (short) 1, (int) '#');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1348");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) '4', (int) 'a', (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1349");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(10, 0, 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1350");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) -1, (int) (byte) 100, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1351");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 10, (int) '4', (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1352");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(100, (int) ' ', (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1353");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 100, (int) (short) 10, (int) '#');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1354");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((-1), (int) (short) -1, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1355");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 1, (int) (short) 1, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1356");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(100, (-1), (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1357");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 10, (int) (byte) 1, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1358");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 100, (int) (short) 100, (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1359");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 10, (int) (short) -1, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1360");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(1, (int) (short) 0, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1361");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 10, (int) (short) 0, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1362");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) '#', (int) 'a', (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1363");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 10, (int) (short) 0, (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1364");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 1, (int) (short) 1, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1365");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 10, (int) (short) 10, 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1366");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(10, (int) (short) 100, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1367");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 10, 0, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1368");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 100, (int) '#', (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1369");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) -1, (int) (short) -1, (int) '#');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1370");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 100, (int) ' ', (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1371");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 10, 1, 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1372");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(10, (int) '#', 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1373");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(1, (int) (byte) 100, 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1374");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) -1, 10, (int) '#');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1375");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 10, (int) (byte) 10, 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1376");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((-1), 0, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1377");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(100, (int) (short) 1, 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1378");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) '4', (int) (short) 0, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1379");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 10, (int) (byte) 100, (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1380");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 100, (int) (byte) 0, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1381");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 0, (int) (short) 10, 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1382");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(0, (int) 'a', (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1383");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) -1, 10, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1384");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 1, 1, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1385");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) ' ', (int) 'a', (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1386");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) ' ', (int) '4', (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1387");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 100, (int) (short) 0, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1388");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) '#', (int) (short) 10, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1389");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(10, 100, (int) '#');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1390");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 10, (int) (byte) -1, (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1391");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(1, (int) (byte) 10, 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1392");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) -1, (int) '4', (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1393");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) ' ', (int) (byte) 10, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1394");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(0, (int) (short) 1, (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1395");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) -1, (int) (byte) 0, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1396");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) -1, (int) (byte) 0, (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1397");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 1, 0, 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1398");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) '#', (int) (short) 10, (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1399");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(10, (int) (short) 100, 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1400");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) ' ', (int) (byte) -1, 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1401");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(10, (int) '#', (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1402");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) ' ', (int) (byte) -1, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1403");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 100, 0, (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1404");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(0, (int) (byte) 100, (int) '#');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1405");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 100, (int) 'a', (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1406");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(100, (int) '#', (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1407");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 1, (int) (byte) 10, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1408");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 100, (int) (short) 1, (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1409");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(10, (int) (byte) 100, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1410");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 10, (int) (byte) 100, 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1411");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 100, (int) 'a', (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1412");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 0, 0, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1413");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(100, 10, (int) '#');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1414");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 0, (int) (byte) 10, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1415");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 0, 10, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1416");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) '4', (int) (short) 10, (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1417");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) '#', 10, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1418");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 10, (int) (byte) 1, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1419");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(10, (int) ' ', (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1420");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(0, 0, 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1421");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((-1), (int) (short) 100, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1422");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) -1, (int) 'a', 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1423");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(1, 1, 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1424");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 0, (int) 'a', 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1425");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((-1), (int) '4', (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1426");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) ' ', (int) (byte) 100, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1427");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(0, (int) (byte) 1, (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1428");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 1, (int) (byte) -1, 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1429");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) '#', 0, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1430");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) '4', (int) (short) 1, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1431");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) 'a', 10, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1432");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 10, (int) '4', 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1433");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(10, 1, (int) '#');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1434");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((-1), (int) (short) 10, (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1435");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) '4', (int) (short) 100, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1436");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 100, (int) (short) 100, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1437");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 10, (-1), (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1438");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 100, 100, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1439");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 10, (int) (byte) 0, (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1440");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 10, (int) (short) 0, (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1441");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) 'a', (int) (short) 0, (int) '#');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1442");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(0, (-1), (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1443");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 0, (int) (byte) 100, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1444");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((-1), (int) (byte) 100, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1445");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) '4', (int) (short) 0, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1446");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) '#', 0, 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1447");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(0, (int) (byte) 100, 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1448");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(0, (int) (byte) 10, (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1449");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 1, (int) (short) 100, 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1450");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 1, 10, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1451");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 1, (int) (short) 10, 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1452");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(1, (int) '#', 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1453");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) '4', (int) (byte) 10, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1454");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(1, (int) (byte) 10, 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1455");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 10, (int) 'a', 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1456");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((-1), (int) ' ', (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1457");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 10, 0, 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1458");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 10, (int) ' ', (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1459");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 10, 10, (int) '4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1460");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 1, (int) (short) -1, 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1461");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 100, (int) (byte) -1, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1462");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 100, 1, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1463");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) 'a', 0, (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1464");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 100, 100, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1465");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 10, 100, 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1466");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((-1), (int) (byte) 0, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1467");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) '4', (int) (short) 10, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1468");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) '#', (int) ' ', (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1469");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) 'a', 0, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1470");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) -1, (-1), (int) '4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1471");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 1, 100, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1472");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(0, (int) (byte) -1, (int) '4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1473");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) ' ', 100, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1474");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 1, 0, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1475");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) '#', (int) (byte) 10, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1476");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 10, (int) (byte) 100, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1477");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 10, (int) (byte) 0, (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1478");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 10, (int) (short) 100, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1479");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 10, 10, 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1480");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) '#', (int) (short) -1, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1481");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(1, (int) 'a', 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1482");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 100, (int) (short) 100, (int) '#');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1483");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 1, (int) 'a', (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1484");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 0, (int) (short) -1, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1485");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(0, (int) (byte) 0, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1486");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((-1), (int) '#', (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1487");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) -1, (int) (short) 10, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1488");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 0, 1, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1489");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(10, (int) '#', (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1490");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 100, (int) (byte) -1, 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1491");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 10, 10, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1492");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 100, (int) 'a', (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1493");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) '4', (int) (byte) -1, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1494");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((-1), (int) '#', (int) '4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1495");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(100, (int) (byte) 1, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1496");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(1, 100, (int) '4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1497");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) -1, (int) (byte) -1, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1498");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) ' ', (int) (byte) 10, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1499");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) '4', (int) ' ', (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1500");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 100, (int) '#', (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }
}

