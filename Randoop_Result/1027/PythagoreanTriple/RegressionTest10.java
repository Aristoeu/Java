package PythagoreanTriple;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest10 {

    public static boolean debug = false;

    @Test
    public void test5001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5001");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 10, (int) (byte) 1, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5002");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) -1, (int) 'a', (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5003");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) ' ', (int) (short) 10, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5004");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 0, (int) '4', (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5005");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 0, (int) ' ', (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5006");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 0, (int) (byte) 1, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5007");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 1, (int) (byte) 100, 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5008");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 100, (int) ' ', (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5009");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 100, 10, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5010");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 10, (int) (short) 100, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5011");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(0, (int) (byte) 10, (int) '4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5012");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(100, 10, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5013");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) -1, (int) (short) 10, (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5014");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 0, (int) (short) 10, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5015");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 0, (int) (short) -1, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5016");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) -1, (int) (short) 0, (int) '4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5017");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) ' ', 100, (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5018");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 1, 100, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5019");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((-1), (int) (byte) 1, (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5020");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) -1, (int) '#', (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5021");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((-1), (int) ' ', (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5022");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(0, (int) '#', (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5023");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(1, (-1), 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5024");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(10, 0, (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5025");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(0, (int) (byte) 0, 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5026");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) -1, (int) (byte) 100, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5027");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(1, 10, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5028");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(10, (-1), (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5029");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 10, (int) (short) 10, 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5030");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((-1), 0, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5031");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(100, (int) 'a', (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5032");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) -1, (int) (short) 1, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5033");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 1, 10, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5034");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) -1, (int) (byte) 100, (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5035");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) 'a', 1, (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5036");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) -1, (int) (byte) -1, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5037");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) '#', (int) (short) 100, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5038");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 0, (int) (byte) 100, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5039");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) '4', (int) (short) -1, 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5040");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 10, (int) (short) -1, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5041");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 1, 10, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5042");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 0, 100, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5043");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) ' ', (int) (short) 1, 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5044");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) ' ', (int) (byte) 0, (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5045");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 0, (int) '#', (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5046");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) -1, 1, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5047");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(100, (int) 'a', (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5048");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 10, (int) (short) 1, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5049");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) '4', (int) (byte) -1, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5050");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(0, (int) (byte) 1, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5051");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) -1, (int) '#', (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5052");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) ' ', (int) (byte) 1, (int) '#');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5053");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((-1), 1, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5054");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) 'a', (-1), (int) '4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5055");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 0, (-1), (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5056");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((-1), 10, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5057");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 100, (int) (byte) -1, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5058");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 0, (int) '#', (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5059");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) 'a', (int) (byte) 1, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5060");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 100, (int) 'a', (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5061");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(1, (int) (byte) 0, (int) '4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5062");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 100, (int) (byte) 1, (int) '4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5063");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) -1, (int) 'a', (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5064");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) '4', (int) (byte) 0, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5065");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) '4', (int) (short) -1, (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5066");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 0, 10, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5067");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(1, 100, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5068");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(10, (int) (byte) 0, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5069");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) -1, (int) (short) 0, (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5070");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 100, (int) '#', (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5071");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) -1, (int) (short) 1, 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5072");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 0, (int) (short) 100, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5073");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) -1, 0, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5074");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(0, (int) 'a', (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5075");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) ' ', (int) (byte) 10, 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5076");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 0, (int) ' ', (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5077");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 10, (-1), (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5078");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(0, (int) (byte) 100, 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5079");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 0, (int) (short) 10, 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5080");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 1, (int) (short) 0, (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5081");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((-1), (int) (byte) 1, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5082");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 10, (int) '4', (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5083");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 1, (int) (short) 100, (int) '4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5084");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(10, (int) (short) 1, 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5085");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(0, (int) (short) 1, (int) '4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5086");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 10, (int) (short) 10, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5087");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) ' ', (int) ' ', (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5088");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 10, 10, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5089");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) -1, (int) '4', 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5090");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) '4', 10, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5091");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 10, 10, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5092");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) '#', (int) (short) 100, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5093");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) -1, (int) (byte) 0, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5094");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(10, (int) (short) 100, (int) '4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5095");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 10, (int) (byte) 10, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5096");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 0, 0, 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5097");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) ' ', (int) (byte) 10, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5098");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 10, (int) '#', (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5099");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) 'a', (int) ' ', 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5100");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(0, (int) 'a', (int) '#');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5101");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) 'a', (int) (short) 1, (int) '4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5102");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(10, (int) (byte) 100, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5103");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 1, (int) 'a', (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5104");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) ' ', (int) (byte) -1, (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5105");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 1, (int) (short) 1, (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5106");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 0, (int) (byte) -1, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5107");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) -1, (int) (short) 10, 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5108");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(0, (int) (short) 10, (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5109");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) '4', (int) (short) 0, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5110");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 100, 100, (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5111");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 100, 100, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5112");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(1, 1, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5113");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(1, (int) '#', (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5114");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 0, (int) (short) 1, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5115");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 0, 10, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5116");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 0, (-1), (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5117");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 0, (-1), (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5118");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 100, (int) (byte) -1, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5119");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(10, (int) (byte) -1, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5120");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 10, (int) (byte) -1, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5121");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) -1, (int) (short) -1, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5122");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 100, (int) (byte) 0, 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5123");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 1, (int) (short) 100, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5124");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 10, (int) (byte) 100, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5125");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) ' ', 1, 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5126");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 1, (int) (byte) 0, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5127");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) '#', (int) (short) 1, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5128");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) -1, 0, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5129");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(10, (int) (byte) 0, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5130");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 10, (int) 'a', (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5131");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) -1, (int) (short) -1, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5132");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 0, (int) '#', (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5133");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(100, (int) (short) 1, (int) '#');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5134");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 100, (int) (short) 100, (int) '4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5135");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(10, 10, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5136");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 1, (int) (byte) 0, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5137");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(1, (int) (byte) -1, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5138");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 0, 100, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5139");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(10, (int) (short) 1, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5140");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) 'a', (int) (short) -1, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5141");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(0, (int) (short) 10, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5142");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) -1, (int) (byte) 100, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5143");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 100, (int) '4', (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5144");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) 'a', (int) (short) 100, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5145");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) '4', (int) 'a', (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5146");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) '#', (int) (byte) 10, 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5147");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(10, (int) (short) 100, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5148");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) '4', (int) (short) 10, (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5149");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) ' ', (int) '4', 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5150");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 100, (int) (short) 1, 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5151");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(100, (int) (short) 0, (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5152");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 0, (int) (byte) 100, (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5153");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) 'a', (int) (short) 0, (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5154");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 100, (int) ' ', (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5155");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) 'a', (int) (byte) -1, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5156");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((-1), (int) (short) -1, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5157");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(1, (int) (short) -1, (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5158");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 10, (int) (short) 10, (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5159");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 0, (int) '#', (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5160");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 10, (-1), (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5161");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) -1, (int) (short) 100, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5162");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(100, (int) 'a', (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5163");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((-1), (int) '4', (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5164");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 0, (int) '#', (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5165");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(10, (int) (short) 0, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5166");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 100, (int) (byte) 100, (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5167");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 10, (int) (short) -1, (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5168");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 10, (int) (byte) 10, (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5169");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 0, (int) (byte) 100, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5170");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) ' ', (int) (short) -1, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5171");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) -1, (int) (short) 1, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5172");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(1, (-1), (int) '4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5173");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) '#', (int) (byte) -1, (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5174");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(1, (int) (byte) 0, (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5175");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) '#', 100, 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5176");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 100, (int) (short) 0, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5177");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(1, (int) (short) 0, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5178");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) '#', (-1), (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5179");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) -1, (int) (short) 0, (int) '#');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5180");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 1, (int) ' ', (int) '4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5181");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 100, (int) (short) 10, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5182");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(10, (int) (byte) 1, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5183");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) -1, (int) (short) 0, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5184");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(10, (int) (short) -1, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5185");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) '4', (int) (byte) 100, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5186");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(10, 100, (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5187");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 100, (int) (byte) 0, 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5188");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) 'a', (int) ' ', (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5189");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(1, 1, 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5190");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 1, (int) '#', (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5191");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) '4', (int) '4', 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5192");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(0, (int) (short) -1, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5193");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 10, 1, (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5194");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(100, (int) (short) 10, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5195");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) ' ', (int) '4', (int) '4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5196");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 10, 0, (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5197");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) -1, 10, 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5198");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 0, (int) (short) 100, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5199");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 10, (int) '#', (int) '#');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5200");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 10, (int) (short) 1, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5201");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) -1, (int) (byte) -1, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5202");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((-1), (int) '#', (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5203");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) '4', (int) (byte) 0, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5204");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(100, (-1), 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5205");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 10, 100, (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5206");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(1, 100, (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5207");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 1, 100, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5208");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 1, (int) '#', (int) '4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5209");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(10, (int) '#', (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5210");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 1, (int) (short) 0, (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5211");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((-1), (int) '#', (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5212");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 1, 10, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5213");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(0, (int) (byte) 1, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5214");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) ' ', 100, 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5215");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 100, (-1), 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5216");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 10, 10, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5217");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(1, (int) 'a', 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5218");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((-1), (int) (short) 100, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5219");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) '#', (int) (short) 1, (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5220");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(1, (int) ' ', (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5221");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) 'a', (int) (byte) 10, (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5222");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(1, (int) 'a', (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5223");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 1, (int) (byte) 100, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5224");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) 'a', (int) (byte) 1, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5225");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(10, (int) (byte) 1, (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5226");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) -1, (int) (byte) 10, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5227");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) ' ', (int) (byte) -1, (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5228");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) -1, 10, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5229");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 10, (int) '4', (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5230");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) '4', (int) 'a', 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5231");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 10, (-1), (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5232");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 1, (-1), (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5233");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(100, (int) (short) 1, (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5234");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 100, (int) (byte) 1, (int) '4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5235");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 100, (int) (short) 10, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5236");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 1, (int) (byte) -1, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5237");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 100, (-1), 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5238");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 10, 100, 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5239");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 0, (int) (byte) 10, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5240");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 100, (int) (byte) 0, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5241");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 1, (int) (byte) 1, 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5242");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 100, (int) '#', 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5243");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) '#', 0, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5244");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 10, 1, (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5245");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) 'a', (int) (byte) 100, 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5246");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) ' ', (int) (byte) 10, (int) '#');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5247");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 0, (int) (byte) 100, (int) '4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5248");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) '4', (int) (byte) 10, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5249");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) '4', (int) (byte) 1, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5250");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 1, (int) (byte) -1, (int) '#');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5251");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 100, (int) (short) 0, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5252");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 10, (int) ' ', (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5253");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 10, 1, (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5254");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 100, (int) (short) 0, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5255");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 0, (int) 'a', (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5256");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(10, (int) (short) 100, (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5257");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) '#', (int) (short) 0, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5258");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((-1), (int) (short) 0, 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5259");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 0, (int) (byte) 10, 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5260");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) '#', (int) (short) 1, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5261");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 100, (int) (byte) 1, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5262");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 10, 100, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5263");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 1, (-1), 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5264");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 10, (int) (short) -1, (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5265");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) ' ', (int) '4', (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5266");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) '#', (int) (byte) 0, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5267");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 100, 10, 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5268");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 100, (int) ' ', (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5269");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) -1, (int) (short) 10, 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5270");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 0, (int) (short) -1, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5271");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) '#', (int) (byte) -1, 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5272");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 100, 100, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5273");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 0, 0, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5274");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 100, (int) (short) 10, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5275");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 100, (int) '4', (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5276");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 100, (int) ' ', (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5277");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 100, (int) (short) 0, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5278");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 100, (int) (short) 10, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5279");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(10, (int) (short) 10, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5280");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 0, (int) (short) 10, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5281");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 0, (int) '4', (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5282");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(10, (int) (byte) 0, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5283");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(100, (int) '#', 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5284");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 100, (int) (short) 100, 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5285");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(1, 100, (int) '#');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5286");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(1, (int) (byte) 10, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5287");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 100, (int) (short) 1, 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5288");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 10, (-1), (int) '#');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5289");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 1, (int) (byte) 100, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5290");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) -1, (int) (short) -1, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5291");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) 'a', 100, 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5292");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 1, (int) (byte) -1, (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5293");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 0, 10, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5294");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) ' ', (int) (byte) 1, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5295");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 10, (int) (byte) 0, 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5296");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(1, (int) (byte) 1, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5297");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 1, (int) (short) 1, 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5298");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 10, (int) (short) 100, (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5299");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(100, (int) (short) 10, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5300");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(10, (int) (byte) 1, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5301");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(1, (int) '#', (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5302");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 100, (int) (byte) 1, 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5303");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 100, 1, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5304");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) ' ', (int) (byte) 0, (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5305");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 10, (int) (short) -1, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5306");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(0, (int) (short) 1, 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5307");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 1, (int) (short) 100, 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5308");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) '4', (int) (byte) 1, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5309");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) '#', (int) '4', 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5310");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) ' ', (int) (short) 100, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5311");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 100, (int) (byte) -1, (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5312");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(0, (int) ' ', 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5313");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 10, (int) (short) 100, (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5314");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 1, (int) (short) -1, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5315");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) 'a', (int) (byte) 1, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5316");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) '#', (int) 'a', (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5317");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) -1, (int) (byte) 100, 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5318");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((-1), (int) (byte) -1, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5319");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 0, 1, (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5320");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 10, (int) (byte) -1, 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5321");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 100, (int) (byte) 0, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5322");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(1, (int) '#', 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5323");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 100, (int) (short) 10, (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5324");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(1, 10, (int) '#');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5325");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 0, (int) (short) -1, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5326");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((-1), (int) (byte) 1, 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5327");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) '4', (int) (byte) -1, 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5328");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((-1), (int) (short) -1, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5329");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 10, (int) (short) -1, 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5330");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) 'a', (int) (short) 10, 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5331");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 100, (int) (short) 1, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5332");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(10, (int) '#', 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5333");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) ' ', 100, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5334");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) 'a', 100, 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5335");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 100, 100, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5336");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(1, 10, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5337");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) 'a', (-1), (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5338");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(100, 100, 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5339");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(100, (int) '#', (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5340");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 1, (int) '4', (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5341");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(1, 10, (int) '4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5342");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 100, 1, 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5343");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(100, (int) (byte) 100, (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5344");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 100, (int) (short) 100, 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5345");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) '#', (int) (short) 10, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5346");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 100, (int) (short) 100, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5347");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 10, (-1), (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5348");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) ' ', (int) (byte) 1, (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5349");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(10, (int) (byte) 0, (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5350");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 1, (int) (short) 100, (int) '4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5351");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) '4', 1, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5352");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) 'a', 10, (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5353");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 10, (int) 'a', (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5354");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 1, 1, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5355");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 10, (int) '#', (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5356");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) ' ', (int) (byte) 1, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5357");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 1, (int) (short) 100, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5358");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(1, (int) (byte) 1, 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5359");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) 'a', 100, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5360");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 1, (int) '4', (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5361");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 1, (int) '#', (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5362");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 10, 10, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5363");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) '4', (int) (byte) 100, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5364");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 100, (int) (short) 10, (int) '4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5365");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) ' ', (int) (byte) -1, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5366");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(1, (int) '4', (int) '4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5367");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 100, (int) (byte) 1, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5368");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) -1, 10, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5369");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 10, (int) (short) 1, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5370");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) -1, 10, 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5371");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) '4', (int) (short) 100, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5372");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(100, (int) (short) -1, (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5373");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 0, 1, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5374");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 10, (int) ' ', (int) '#');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5375");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) -1, (int) ' ', (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5376");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) -1, (int) '#', (int) '#');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5377");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 1, 10, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5378");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 1, (int) (byte) -1, (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5379");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) -1, 1, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5380");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((-1), (int) '#', (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5381");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 100, 1, (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5382");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 1, (int) (short) 100, 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5383");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) -1, (int) (byte) 100, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5384");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) -1, (int) (byte) 10, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5385");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((-1), (int) 'a', (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5386");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 1, (int) '#', (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5387");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((-1), (int) (byte) 10, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5388");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(10, (int) (byte) 100, (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5389");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) '4', (int) (short) 100, (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5390");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 1, (int) (byte) 0, 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5391");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(1, (int) '#', (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5392");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(0, (int) 'a', (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5393");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 1, (int) (byte) -1, (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5394");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 100, (int) (short) 10, 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5395");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 0, (int) (short) 10, (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5396");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 10, (int) (short) 1, (int) '4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5397");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 1, (int) (byte) 10, 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5398");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) '4', (int) (byte) 1, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5399");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 0, (int) (short) -1, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5400");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((-1), (int) 'a', 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5401");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 100, (int) (short) 10, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5402");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 1, (int) (byte) 10, 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5403");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((-1), (int) 'a', (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5404");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 10, (int) (byte) -1, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5405");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 100, (int) '4', (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5406");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 1, (int) (byte) -1, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5407");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 1, 1, (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5408");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 0, 10, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5409");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) ' ', (int) (short) 10, 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5410");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(1, (int) (short) 1, 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5411");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 100, (int) (byte) 100, (int) '4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5412");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 1, 10, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5413");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 100, (int) (short) 10, (int) '4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5414");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 100, (int) (byte) 0, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5415");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 0, (int) (byte) 1, (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5416");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 1, (int) (short) 0, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5417");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 10, (int) (short) 1, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5418");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) 'a', (int) (short) 1, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5419");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 1, (int) '#', (int) '4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5420");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(0, (int) ' ', (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5421");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(0, (int) (byte) 100, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5422");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(10, (int) (byte) 100, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5423");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 0, (int) '4', (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5424");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(1, (int) (short) 10, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5425");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) '#', (int) (byte) -1, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5426");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) 'a', (int) (short) 1, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5427");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 1, (int) ' ', (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5428");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 0, (int) (byte) 1, (int) '4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5429");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(100, 0, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5430");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 100, (int) (byte) 0, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5431");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 0, (int) (byte) -1, 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5432");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(100, 100, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5433");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) -1, (int) (short) -1, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5434");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 1, 100, (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5435");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) '4', (int) (byte) 0, 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5436");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) -1, (int) (short) 100, 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5437");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 0, (int) (short) 0, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5438");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 100, (int) (short) 0, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5439");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 100, 1, (int) '4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5440");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 0, (int) 'a', (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5441");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(100, (int) (short) 1, (int) '4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5442");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 10, (int) (short) 1, 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5443");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) -1, (int) (byte) 100, (int) '#');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5444");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 10, 10, 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5445");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(100, (-1), (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5446");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 1, 10, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5447");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 100, (int) ' ', (int) '#');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5448");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(10, (int) (byte) -1, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5449");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 10, 100, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5450");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 0, 0, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5451");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 1, (int) (short) 0, 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5452");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) 'a', (int) ' ', (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5453");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 10, 100, (int) '4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5454");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 10, (int) 'a', (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5455");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) ' ', 1, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5456");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 10, (int) (short) 1, (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5457");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) '#', (int) (short) -1, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5458");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((-1), (int) (byte) 10, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5459");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) '#', (int) (short) -1, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5460");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) -1, (int) '#', 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5461");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(100, (int) 'a', 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5462");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((-1), (int) (short) 10, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5463");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) ' ', 10, 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5464");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) -1, (int) 'a', (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5465");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 10, (int) (short) 1, (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5466");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 100, (int) '4', (int) '#');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5467");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) '4', (int) (short) 1, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5468");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 0, (int) (byte) 100, (int) '4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5469");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) '4', (int) (byte) 10, (int) '4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5470");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) '#', (int) (short) -1, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5471");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) -1, (int) (short) 1, (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5472");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) 'a', (int) (short) 100, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5473");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 100, (int) (byte) -1, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5474");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) '4', 1, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5475");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 100, (int) '4', (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5476");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) -1, (int) 'a', 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5477");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 1, (int) ' ', (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5478");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) -1, (int) (byte) 1, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5479");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) ' ', 100, 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5480");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) '#', (int) '#', (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5481");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 0, 1, 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5482");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 100, (int) (byte) 100, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5483");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 100, 0, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5484");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) ' ', (int) (short) 0, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5485");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) 'a', (int) 'a', (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5486");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(10, (int) (short) -1, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5487");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 10, (int) (byte) 10, (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5488");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 1, (int) '4', 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5489");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) '#', 10, (int) '4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5490");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 1, (int) (short) 100, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5491");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 100, (int) (byte) 100, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5492");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(1, (int) (byte) 1, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5493");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) -1, (int) (byte) 10, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5494");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 0, (int) (byte) -1, 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5495");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 1, (int) '#', (int) '#');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5496");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) 'a', (-1), (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5497");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(1, (int) (byte) 100, 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5498");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((-1), (int) ' ', 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5499");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) ' ', (int) (byte) 0, (int) '#');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5500");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) 'a', (int) (byte) 10, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }
}

