package HeronsFormula;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest12 {

    public static boolean debug = false;

    @Test
    public void test6001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6001");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '#', (int) '#', (int) (short) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test6002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6002");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 10, (int) ' ', (int) (short) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6003");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(10, (int) (short) 10, (int) 'a');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6004");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 10, (int) '4', (int) (byte) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6005");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 0, (int) (byte) 0, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test6006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6006");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) -1, (int) (short) 1, (-1));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.4330127018922193d + "'", double3 == 0.4330127018922193d);
    }

    @Test
    public void test6007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6007");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) -1, (int) (byte) 0, 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.0d) + "'", double3 == (-0.0d));
    }

    @Test
    public void test6008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6008");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 0, (int) (byte) 1, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test6009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6009");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(1, 1, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test6010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6010");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) -1, (int) (byte) 0, (int) (short) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6011");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 0, (int) (short) -1, (int) '#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6012");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 1, (int) (short) 1, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test6013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6013");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(1, (int) (short) 1, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.4330127018922193d + "'", double3 == 0.4330127018922193d);
    }

    @Test
    public void test6014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6014");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '4', (int) (byte) 1, (int) (byte) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6015");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) ' ', 100, (int) (short) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6016");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(10, (int) (byte) 1, (int) (short) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6017");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(100, (int) (short) 0, (int) (byte) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6018");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(1, (int) (short) 10, (int) '4');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6019");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) 'a', (int) (byte) -1, (int) (byte) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6020");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(100, (-1), (int) (byte) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6021");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) -1, (int) (short) 10, (int) (short) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6022");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '4', 10, (int) (byte) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6023");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 10, (int) (short) 10, (int) '#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6024");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(1, (int) ' ', (int) '#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6025");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(1, 100, (int) (byte) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6026");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 1, 1, (int) '4');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6027");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) 'a', (int) 'a', (int) (short) -1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 48.499355665823025d + "'", double3 == 48.499355665823025d);
    }

    @Test
    public void test6028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6028");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '#', (int) '4', (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6029");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 0, (int) (byte) 10, 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test6030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6030");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '4', (int) (byte) -1, (int) (byte) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6031");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) -1, (int) (short) 100, (int) '#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6032");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) -1, (int) (byte) 1, (int) '#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6033");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 0, (int) ' ', (int) (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6034");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 100, (-1), (int) (short) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6035");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(1, (int) (byte) 0, (int) (short) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6036");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) 'a', (int) (short) 10, (int) (byte) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6037");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '4', (int) (short) 1, (int) '4');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 25.998798049140657d + "'", double3 == 25.998798049140657d);
    }

    @Test
    public void test6038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6038");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 100, (int) (short) 10, (int) (short) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6039");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(100, 1, (int) '#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6040");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(10, (int) (byte) 1, (int) (byte) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6041");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) 'a', (int) (short) 100, (int) (short) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6042");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) -1, (int) '4', 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6043");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 10, (int) (short) 0, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test6044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6044");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) -1, (int) (byte) -1, (int) 'a');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6045");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 10, 100, (int) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6046");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) -1, 10, (int) '4');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6047");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(1, (int) (byte) 100, (int) (short) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6048");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 10, 0, (int) '#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6049");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) ' ', (int) (byte) 100, (int) (byte) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6050");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(10, (int) (byte) -1, (int) '4');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6051");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((-1), (int) ' ', (int) (byte) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6052");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '4', (int) (short) 10, (int) (byte) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6053");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) 'a', (-1), (int) (short) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6054");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(0, 100, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test6055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6055");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((-1), (int) '4', (int) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6056");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 0, (int) ' ', (int) (short) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6057");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 0, (int) '4', (int) (byte) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6058");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 100, (int) (byte) 10, (int) (short) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6059");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(10, (int) (byte) 0, (int) 'a');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6060");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) -1, (int) '4', (int) (byte) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6061");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) 'a', (int) (byte) 10, (int) (short) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6062");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) ' ', (int) (short) 0, 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6063");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 10, (int) 'a', 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 469.2093749063418d + "'", double3 == 469.2093749063418d);
    }

    @Test
    public void test6064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6064");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 100, 100, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4330.127018922193d + "'", double3 == 4330.127018922193d);
    }

    @Test
    public void test6065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6065");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 100, (int) (byte) 1, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 49.9993749960937d + "'", double3 == 49.9993749960937d);
    }

    @Test
    public void test6066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6066");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 1, (int) (short) 100, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 49.9993749960937d + "'", double3 == 49.9993749960937d);
    }

    @Test
    public void test6067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6067");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 0, (int) (short) 100, (int) (byte) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6068");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 10, 1, (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6069");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((-1), (int) (short) 0, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.0d) + "'", double3 == (-0.0d));
    }

    @Test
    public void test6070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6070");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '#', (int) (short) 10, (int) (short) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6071");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '4', (int) (byte) -1, (int) (short) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6072");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 10, (int) (short) 0, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test6073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6073");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((-1), (int) (short) 10, (int) (byte) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6074");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) ' ', (int) (short) 0, (int) (short) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6075");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 100, 1, (int) 'a');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6076");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) ' ', (int) ' ', (int) (short) -1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 15.998046755776157d + "'", double3 == 15.998046755776157d);
    }

    @Test
    public void test6077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6077");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 100, 1, (int) '4');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6078");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 10, 10, (int) (short) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6079");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 100, (int) '4', (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2510.582402551249d + "'", double3 == 2510.582402551249d);
    }

    @Test
    public void test6080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6080");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 0, (int) '4', 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6081");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) -1, 10, (int) '4');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6082");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 0, (int) '4', (int) (byte) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6083");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(100, (int) '#', (int) (short) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6084");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((-1), 1, (int) '#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6085");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) 'a', (int) (short) 0, 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6086");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 0, (int) (byte) 0, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test6087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6087");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((-1), (int) (byte) 0, 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.0d) + "'", double3 == (-0.0d));
    }

    @Test
    public void test6088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6088");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) -1, (int) ' ', (int) (byte) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6089");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 10, 10, (int) '#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6090");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 1, (int) (byte) 100, (int) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6091");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) -1, (int) '#', (int) (byte) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6092");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 0, (int) 'a', (int) (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6093");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(100, 10, 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6094");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '#', (int) (byte) -1, (int) '#');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 17.498214194597114d + "'", double3 == 17.498214194597114d);
    }

    @Test
    public void test6095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6095");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '4', 0, 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6096");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) -1, (int) (byte) 10, (int) '4');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6097");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 0, (int) (byte) 100, 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6098");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 0, (int) (short) 10, (int) '#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6099");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(1, 100, 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6100");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) -1, (int) (short) 100, (int) (byte) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6101");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 10, (int) (byte) -1, (int) (byte) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6102");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 0, (int) (byte) 10, (int) 'a');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6103");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 10, (int) (short) 0, (int) (byte) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6104");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((-1), (int) 'a', 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6105");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 10, (int) '#', (int) (short) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6106");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) 'a', (int) ' ', (int) (byte) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6107");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) -1, (int) ' ', (int) (byte) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6108");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(10, (int) ' ', (int) (short) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6109");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) -1, (int) '#', 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6110");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 0, (int) (byte) 10, (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6111");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) -1, (int) (byte) 0, (int) (byte) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6112");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 1, (int) (byte) 1, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test6113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6113");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(100, (-1), (int) (short) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6114");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) 'a', (int) (short) 100, (int) (byte) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6115");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 0, (int) (short) 0, (int) (short) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6116");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 0, (int) (short) 1, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test6117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6117");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) -1, (int) ' ', (int) (byte) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6118");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '4', (-1), 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6119");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '4', (int) (short) 0, (int) '4');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test6120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6120");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 1, (int) (short) 1, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.4330127018922193d + "'", double3 == 0.4330127018922193d);
    }

    @Test
    public void test6121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6121");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) -1, 100, (int) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6122");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) 'a', (int) (byte) 0, (int) (byte) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6123");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) ' ', (int) (short) 0, (int) (byte) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6124");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 10, (int) (byte) 1, (int) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6125");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(100, (-1), (int) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6126");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 100, (int) (short) -1, 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6127");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) -1, (int) '#', (int) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6128");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) 'a', (int) '4', (int) (short) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6129");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 0, (int) ' ', 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6130");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(1, 100, 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6131");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 0, (int) ' ', (int) 'a');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6132");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '4', (int) (short) 1, (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6133");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(10, (-1), (int) (byte) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6134");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 1, 100, (int) (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6135");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(1, (int) (byte) 0, (int) (byte) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6136");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 0, (int) (short) 1, (int) '#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6137");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(1, 100, (int) (short) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6138");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 1, 1, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test6139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6139");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(10, (int) (short) 100, 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6140");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '#', (int) '4', (int) '4');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 856.9194463308672d + "'", double3 == 856.9194463308672d);
    }

    @Test
    public void test6141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6141");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 1, (int) (short) 10, 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6142");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '4', (int) (short) 10, 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6143");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(1, (int) (byte) 0, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.0d) + "'", double3 == (-0.0d));
    }

    @Test
    public void test6144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6144");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 0, 100, (int) (short) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6145");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 10, (int) (byte) 0, (int) '#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6146");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(1, (int) (byte) 0, (int) '#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6147");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(100, (int) ' ', (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1579.3872229443925d + "'", double3 == 1579.3872229443925d);
    }

    @Test
    public void test6148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6148");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) -1, 1, (int) '#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6149");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) -1, (int) (byte) 10, 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6150");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '4', (int) (byte) 1, (int) (short) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6151");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) 'a', (int) (short) 10, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 469.2093749063418d + "'", double3 == 469.2093749063418d);
    }

    @Test
    public void test6152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6152");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 0, 10, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test6153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6153");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '#', (-1), (int) (byte) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6154");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) -1, (int) '4', (int) 'a');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6155");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 10, (-1), (int) (short) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6156");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 10, (int) (byte) -1, 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6157");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 1, (int) (short) 10, (int) (short) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6158");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 1, (int) '#', (int) (byte) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6159");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 100, (int) (short) 0, (int) '4');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6160");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 0, (-1), (int) (short) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.0d) + "'", double3 == (-0.0d));
    }

    @Test
    public void test6161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6161");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(100, (int) (short) -1, (int) (short) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6162");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) -1, (int) (byte) 1, (int) '4');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6163");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '4', 1, (int) (byte) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6164");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 0, (int) (short) 10, 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6165");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 10, (int) (short) -1, (int) (short) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6166");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) ' ', (int) (short) 1, (int) 'a');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6167");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 1, (int) (byte) 1, (int) (short) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6168");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 0, (int) (byte) 10, (int) (byte) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6169");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) -1, (int) '#', (int) (short) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6170");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) 'a', (int) (byte) 0, (int) (byte) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6171");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) -1, (int) '#', (int) 'a');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6172");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 0, (int) (short) -1, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test6173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6173");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) -1, (int) (short) 1, (int) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6174");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(1, (int) (byte) 10, 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6175");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 0, (int) '4', (int) (short) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6176");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 0, 100, (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6177");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 100, (int) ' ', (int) '4');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6178");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 10, (int) (byte) -1, (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6179");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 1, (int) (byte) 100, (int) (byte) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6180");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) -1, (int) '#', (int) (short) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6181");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 100, (int) '4', (int) (short) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2510.582402551249d + "'", double3 == 2510.582402551249d);
    }

    @Test
    public void test6182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6182");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) -1, (int) (short) 1, (int) (byte) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6183");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '#', (int) '#', (int) (short) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 173.20508075688772d + "'", double3 == 173.20508075688772d);
    }

    @Test
    public void test6184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6184");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(0, 1, (int) (short) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6185");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 1, (int) (byte) 1, (int) '#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6186");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 10, (int) ' ', (int) (short) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6187");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) -1, (int) (short) -1, (int) (short) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6188");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) 'a', (int) (short) 1, (int) (byte) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6189");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 1, (-1), (int) (short) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6190");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(10, (int) '#', (int) (short) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6191");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '4', (-1), (int) '4');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 25.998798049140657d + "'", double3 == 25.998798049140657d);
    }

    @Test
    public void test6192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6192");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '#', 10, 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6193");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(1, 10, (int) (short) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6194");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 0, (int) (short) -1, (int) (byte) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6195");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 10, (int) (byte) -1, (int) '#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6196");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 10, (int) 'a', (int) (short) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6197");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) -1, (int) (byte) 1, (int) '#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6198");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) 'a', (int) (short) 1, (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6199");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 0, (int) (short) 1, (int) (byte) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6200");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 1, (int) (byte) 1, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.4330127018922193d + "'", double3 == 0.4330127018922193d);
    }

    @Test
    public void test6201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6201");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) -1, (int) (byte) 1, (int) '4');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6202");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(10, (int) 'a', 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6203");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '4', (int) (byte) -1, (int) (short) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6204");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((-1), (int) (byte) 0, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test6205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6205");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) -1, (int) (byte) 10, (int) (short) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6206");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 0, (int) (byte) 100, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test6207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6207");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((-1), (-1), (-1));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.4330127018922193d + "'", double3 == 0.4330127018922193d);
    }

    @Test
    public void test6208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6208");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) 'a', 1, 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6209");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 0, (int) (byte) 10, (int) '#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6210");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) -1, (int) (byte) 100, (int) (byte) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6211");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 0, (int) (byte) 1, (int) 'a');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6212");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 1, (int) 'a', (int) '4');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6213");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 100, (int) (byte) 10, (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6214");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) ' ', 100, 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1579.3872229443925d + "'", double3 == 1579.3872229443925d);
    }

    @Test
    public void test6215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6215");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 0, (int) (short) 10, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test6216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6216");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 10, (int) (byte) -1, (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6217");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) 'a', (int) (byte) 10, (int) '4');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6218");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 1, (int) (byte) 10, (int) (byte) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6219");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '#', 1, (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6220");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(1, (int) (short) -1, (int) (byte) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6221");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) ' ', (int) (byte) 10, (int) (short) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6222");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) 'a', (int) (short) -1, 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6223");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 10, (int) (byte) -1, (int) (short) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6224");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(0, (int) (short) 10, (int) 'a');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6225");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 10, (int) (byte) 10, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4.993746088859544d + "'", double3 == 4.993746088859544d);
    }

    @Test
    public void test6226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6226");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 100, (int) (byte) 10, (int) (byte) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6227");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 100, (int) (short) 10, (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6228");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 10, 100, (int) (short) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6229");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '#', (int) (short) 100, (int) (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6230");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 10, (int) (byte) 1, (int) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6231");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 10, 1, (int) '#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6232");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '#', (int) (short) 100, (int) (short) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6233");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(0, (int) (byte) 0, (int) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6234");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) 'a', (int) '#', 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6235");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) -1, 1, 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6236");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 1, (int) (byte) 100, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 49.9993749960937d + "'", double3 == 49.9993749960937d);
    }

    @Test
    public void test6237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6237");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 100, (int) (short) -1, 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6238");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 0, (int) (short) 100, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test6239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6239");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((-1), 10, (int) (short) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6240");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(1, 1, (int) '4');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6241");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '#', 10, (int) ' ');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 157.99505530237332d + "'", double3 == 157.99505530237332d);
    }

    @Test
    public void test6242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6242");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '4', (int) (short) 10, (int) (byte) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6243");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 0, (int) 'a', (int) (short) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6244");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 100, (int) (byte) -1, 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6245");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '4', (int) (short) 1, (int) (byte) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6246");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(0, (int) 'a', (int) (byte) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6247");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 10, (int) 'a', 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6248");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 100, (int) (byte) -1, (int) '4');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6249");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 0, (int) '4', (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6250");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 1, (int) (short) 10, (int) '4');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6251");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '#', 100, 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6252");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) ' ', (int) (byte) 100, (int) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6253");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(100, (int) (byte) -1, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 49.9993749960937d + "'", double3 == 49.9993749960937d);
    }

    @Test
    public void test6254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6254");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 0, (int) (byte) 0, 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6255");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '#', (int) 'a', (int) (short) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1690.0840215799924d + "'", double3 == 1690.0840215799924d);
    }

    @Test
    public void test6256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6256");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(100, (int) (byte) -1, (int) (byte) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6257");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 10, 10, (int) '#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6258");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(10, (int) (short) 1, 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4.993746088859544d + "'", double3 == 4.993746088859544d);
    }

    @Test
    public void test6259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6259");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '#', (int) (byte) 1, 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6260");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) 'a', (int) '#', (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1690.0840215799924d + "'", double3 == 1690.0840215799924d);
    }

    @Test
    public void test6261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6261");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 0, (int) (byte) -1, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.0d) + "'", double3 == (-0.0d));
    }

    @Test
    public void test6262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6262");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 0, (-1), (int) (short) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.0d) + "'", double3 == (-0.0d));
    }

    @Test
    public void test6263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6263");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 0, (int) (byte) -1, (int) '#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6264");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((-1), 1, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.4330127018922193d + "'", double3 == 0.4330127018922193d);
    }

    @Test
    public void test6265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6265");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((-1), 10, (int) (byte) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6266");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 1, (int) (short) 10, (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6267");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((-1), (int) '4', 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6268");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) -1, (int) ' ', (int) (byte) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6269");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(1, (int) ' ', (int) (short) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6270");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 0, (int) (byte) 0, (int) '4');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6271");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) 'a', (int) (short) 0, 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6272");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 1, (int) (byte) 100, (int) (short) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6273");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) 'a', (int) (short) 1, (int) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6274");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 0, (int) (short) 1, 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test6275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6275");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(100, (int) (byte) 1, (int) '4');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6276");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(1, (int) (short) 10, (int) '#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6277");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '4', 1, (int) (short) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6278");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) 'a', 100, 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 469.2093749063418d + "'", double3 == 469.2093749063418d);
    }

    @Test
    public void test6279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6279");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 0, (int) (byte) 0, 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6280");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 0, (int) (byte) -1, 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6281");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 0, (int) (byte) -1, (int) (byte) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6282");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 10, (int) (short) 100, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 499.3746088859545d + "'", double3 == 499.3746088859545d);
    }

    @Test
    public void test6283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6283");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 1, (int) '#', (int) (short) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6284");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((-1), (int) (short) 0, 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6285");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 1, (int) (short) 1, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.4330127018922193d + "'", double3 == 0.4330127018922193d);
    }

    @Test
    public void test6286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6286");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((-1), (int) '4', (int) (byte) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6287");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(100, (int) (byte) 100, 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 499.3746088859545d + "'", double3 == 499.3746088859545d);
    }

    @Test
    public void test6288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6288");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 10, (int) (short) 100, 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 499.3746088859545d + "'", double3 == 499.3746088859545d);
    }

    @Test
    public void test6289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6289");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) -1, (int) (short) 100, (int) 'a');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6290");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '#', (int) (byte) 0, (int) (short) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6291");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 100, (int) '4', 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2510.582402551249d + "'", double3 == 2510.582402551249d);
    }

    @Test
    public void test6292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6292");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '#', (int) ' ', (int) (byte) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6293");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(10, (int) (byte) 0, (int) '4');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6294");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 10, (int) '#', (int) 'a');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6295");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) -1, (int) (byte) 10, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4.993746088859544d + "'", double3 == 4.993746088859544d);
    }

    @Test
    public void test6296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6296");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 1, (int) (short) 0, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test6297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6297");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(1, (int) (short) 10, (int) (byte) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6298");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 10, (int) (byte) 0, (int) '4');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6299");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 0, 100, (int) (byte) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6300");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 1, (int) 'a', (int) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6301");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(1, (int) (byte) 1, 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6302");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 1, (int) (byte) 0, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test6303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6303");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 10, (int) '#', (int) (byte) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6304");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 100, (int) (short) -1, 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6305");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '#', 100, (int) 'a');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1690.0840215799924d + "'", double3 == 1690.0840215799924d);
    }

    @Test
    public void test6306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6306");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) ' ', (int) (byte) 10, (int) (byte) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6307");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((-1), 100, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 49.9993749960937d + "'", double3 == 49.9993749960937d);
    }

    @Test
    public void test6308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6308");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 0, (int) (short) 0, (int) (byte) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6309");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(10, (int) '4', (int) 'a');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6310");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '4', (int) (byte) 100, (int) (short) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6311");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 10, (int) ' ', (int) (byte) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6312");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(100, (int) (byte) 0, (int) '4');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6313");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) ' ', 1, (int) ' ');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 15.998046755776157d + "'", double3 == 15.998046755776157d);
    }

    @Test
    public void test6314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6314");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 10, 100, (int) (short) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6315");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((-1), 100, 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6316");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 1, (int) (short) 1, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.4330127018922193d + "'", double3 == 0.4330127018922193d);
    }

    @Test
    public void test6317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6317");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 10, (int) (short) 10, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4.993746088859544d + "'", double3 == 4.993746088859544d);
    }

    @Test
    public void test6318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6318");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 0, (-1), (int) (short) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6319");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 10, (int) (byte) 10, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4.993746088859544d + "'", double3 == 4.993746088859544d);
    }

    @Test
    public void test6320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6320");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 10, (int) (short) 100, (int) (short) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6321");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 0, (int) 'a', (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6322");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) -1, (int) '4', (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6323");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) ' ', (int) (byte) 1, (int) (byte) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6324");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 10, 10, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 43.30127018922193d + "'", double3 == 43.30127018922193d);
    }

    @Test
    public void test6325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6325");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(100, (int) (short) 1, 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6326");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 100, 1, (int) (short) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6327");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) 'a', (int) (short) 10, (int) (short) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6328");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 100, 0, (int) (short) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6329");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 100, (int) (byte) 0, (int) 'a');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6330");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) -1, (-1), (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.4330127018922193d + "'", double3 == 0.4330127018922193d);
    }

    @Test
    public void test6331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6331");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '4', (int) (short) 100, (int) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6332");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 0, 10, (int) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6333");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 10, (int) (byte) -1, (int) (byte) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6334");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 100, (-1), (int) (short) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6335");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) -1, (int) (short) 10, (int) (byte) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6336");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 1, 0, (int) (byte) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6337");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 10, (int) ' ', (int) (byte) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6338");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 10, (int) (byte) -1, (int) (short) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6339");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '4', (int) (byte) 1, 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6340");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 100, (int) ' ', (int) (short) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6341");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((-1), (int) '#', (int) (byte) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6342");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) -1, (-1), (int) '#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6343");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 10, (int) (byte) 10, (int) (byte) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6344");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 10, (int) (byte) -1, (int) (byte) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6345");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(10, (int) 'a', (int) 'a');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 484.3552415324934d + "'", double3 == 484.3552415324934d);
    }

    @Test
    public void test6346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6346");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 100, 1, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 49.9993749960937d + "'", double3 == 49.9993749960937d);
    }

    @Test
    public void test6347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6347");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 1, (int) (byte) 0, (int) 'a');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6348");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) -1, (int) (short) 100, (int) (short) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6349");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 10, (-1), (int) 'a');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6350");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((-1), (int) (byte) 0, (int) (short) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6351");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 10, (int) (byte) 1, (int) (short) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6352");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(1, (int) (short) -1, (int) (short) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6353");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 10, 1, (int) (byte) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6354");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 100, 100, (int) '4');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2510.582402551249d + "'", double3 == 2510.582402551249d);
    }

    @Test
    public void test6355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6355");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 10, (int) (short) 10, (-1));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4.993746088859544d + "'", double3 == 4.993746088859544d);
    }

    @Test
    public void test6356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6356");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 1, (int) (byte) 10, 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6357");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) -1, (int) (byte) 0, (int) '#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6358");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((-1), (int) (short) 0, (int) (byte) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6359");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 1, (int) '4', (int) (short) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6360");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 10, (int) 'a', (int) '#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6361");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(10, (int) 'a', (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6362");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) ' ', (-1), (int) ' ');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 15.998046755776157d + "'", double3 == 15.998046755776157d);
    }

    @Test
    public void test6363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6363");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '4', 10, 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6364");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 1, (int) (byte) 10, (int) '4');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6365");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 100, (int) (short) 10, (int) 'a');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 469.2093749063418d + "'", double3 == 469.2093749063418d);
    }

    @Test
    public void test6366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6366");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 0, 10, 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test6367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6367");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(10, (int) '4', (int) (byte) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6368");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 10, (int) ' ', 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6369");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 1, 100, (int) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6370");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 1, (int) (short) 1, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.4330127018922193d + "'", double3 == 0.4330127018922193d);
    }

    @Test
    public void test6371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6371");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(100, (int) (short) 100, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 499.3746088859545d + "'", double3 == 499.3746088859545d);
    }

    @Test
    public void test6372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6372");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '#', 10, (int) '#');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 173.20508075688772d + "'", double3 == 173.20508075688772d);
    }

    @Test
    public void test6373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6373");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '4', (int) (short) 0, (int) 'a');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6374");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '#', (int) (byte) 0, 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6375");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((-1), (int) '4', (int) (short) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6376");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 0, (int) (byte) 10, (int) (byte) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6377");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 1, 10, (int) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6378");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 1, (int) (short) -1, (int) '#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6379");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) -1, 100, 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 49.9993749960937d + "'", double3 == 49.9993749960937d);
    }

    @Test
    public void test6380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6380");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(10, 10, (int) (short) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6381");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 10, (int) (short) -1, (int) '#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6382");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 100, (-1), 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6383");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) ' ', (int) (short) 10, (int) (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6384");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(100, (int) (byte) 10, 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6385");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((-1), (int) '#', (int) (byte) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6386");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 10, (int) (short) 100, (int) (byte) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6387");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) ' ', (int) (short) 100, (int) '4');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6388");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 10, (int) '#', (int) (short) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6389");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) 'a', (int) (short) -1, (int) (byte) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6390");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '4', (int) (byte) -1, (int) (byte) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6391");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 100, (int) (short) 10, (int) (byte) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6392");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 10, (int) '#', 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6393");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) 'a', (-1), 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6394");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) 'a', (int) (byte) 10, (int) 'a');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 484.3552415324934d + "'", double3 == 484.3552415324934d);
    }

    @Test
    public void test6395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6395");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(10, (int) (short) 100, (int) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6396");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(10, (int) (short) 0, (int) (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6397");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 0, (int) 'a', (int) (short) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6398");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '#', (int) (short) 1, 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6399");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 1, (int) (short) 0, 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6400");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(100, (int) (short) -1, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 49.9993749960937d + "'", double3 == 49.9993749960937d);
    }

    @Test
    public void test6401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6401");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) -1, (int) (short) 10, 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6402");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 10, (int) (byte) 100, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 499.3746088859545d + "'", double3 == 499.3746088859545d);
    }

    @Test
    public void test6403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6403");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 100, (int) '#', 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6404");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 0, (int) (short) 100, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test6405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6405");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) ' ', (int) (short) 100, (int) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6406");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(1, (int) (short) -1, (int) '4');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6407");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 100, 10, 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6408");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((-1), (-1), (int) 'a');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6409");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) -1, (int) '#', (int) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6410");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 10, 100, 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6411");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) ' ', (-1), (int) (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6412");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(10, (int) (short) 10, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test6413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6413");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(1, (int) (short) -1, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.4330127018922193d + "'", double3 == 0.4330127018922193d);
    }

    @Test
    public void test6414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6414");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 10, (int) (byte) 0, 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6415");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) ' ', (int) '#', 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 157.99505530237332d + "'", double3 == 157.99505530237332d);
    }

    @Test
    public void test6416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6416");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '4', (int) (short) 1, (int) '#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6417");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 0, (int) (byte) 0, (int) (byte) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6418");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) -1, (int) ' ', (int) (byte) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6419");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 0, (int) (byte) 100, (int) '#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6420");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 100, (int) '4', 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6421");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 10, (-1), (int) (byte) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6422");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) 'a', (int) (byte) 100, (int) (byte) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6423");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) -1, 1, (int) 'a');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6424");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 0, (int) (short) 1, (int) 'a');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6425");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 100, (int) (short) 100, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 49.9993749960937d + "'", double3 == 49.9993749960937d);
    }

    @Test
    public void test6426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6426");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 100, (int) '#', (int) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6427");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 100, (int) (short) -1, (int) (byte) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6428");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 10, (int) (byte) 10, 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4.993746088859544d + "'", double3 == 4.993746088859544d);
    }

    @Test
    public void test6429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6429");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 1, (int) (short) 100, (int) (byte) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6430");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) -1, (int) '4', (int) (short) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6431");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 0, (int) (byte) 100, (int) (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6432");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '#', (int) (byte) 100, (int) '4');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6433");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 0, 1, (int) (byte) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6434");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(1, (int) (short) 0, (int) (short) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6435");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) 'a', (int) (short) 100, 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6436");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(1, (int) ' ', (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6437");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) 'a', 1, 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6438");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 100, (int) 'a', (int) (short) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 469.2093749063418d + "'", double3 == 469.2093749063418d);
    }

    @Test
    public void test6439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6439");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((-1), (int) (byte) -1, 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6440");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) -1, (int) (byte) 10, (int) (short) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6441");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) 'a', 1, (int) (byte) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6442");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) 'a', (-1), (int) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6443");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 1, (int) (byte) 0, (int) (short) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6444");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 100, (int) (byte) 1, (int) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6445");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) ' ', (int) (short) 0, (int) (byte) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6446");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((-1), (int) (byte) 100, (int) (byte) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6447");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(1, (int) (short) 100, (int) (short) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6448");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '4', (int) (byte) -1, (int) 'a');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6449");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((-1), (int) (byte) -1, 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.4330127018922193d + "'", double3 == 0.4330127018922193d);
    }

    @Test
    public void test6450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6450");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(100, (int) (byte) 10, (int) (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6451");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 1, (int) (byte) 0, (int) '#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6452");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) 'a', (int) (short) 10, 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6453");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 1, (int) (short) 1, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test6454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6454");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) ' ', (int) (short) 100, (int) (byte) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6455");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '#', (int) (byte) 10, (int) 'a');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6456");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 1, (int) (byte) -1, (int) (short) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6457");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(1, 10, (int) (short) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6458");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(1, (int) (byte) 10, (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6459");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) -1, 10, (int) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6460");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) 'a', (int) (short) 100, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 469.2093749063418d + "'", double3 == 469.2093749063418d);
    }

    @Test
    public void test6461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6461");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 10, (int) (byte) 1, (int) (byte) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6462");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 10, (-1), 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4.993746088859544d + "'", double3 == 4.993746088859544d);
    }

    @Test
    public void test6463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6463");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 100, (int) (byte) 0, 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6464");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(10, (int) (short) 0, (int) (short) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6465");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) ' ', (int) (byte) 100, (int) (byte) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6466");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((-1), (int) (byte) 1, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.4330127018922193d + "'", double3 == 0.4330127018922193d);
    }

    @Test
    public void test6467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6467");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(1, (int) (short) 10, (int) (byte) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6468");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '4', (int) (short) -1, (int) (short) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6469");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(100, (int) (byte) 10, (int) (byte) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6470");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((-1), (int) (short) -1, 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6471");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) -1, (int) '#', (int) (byte) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6472");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) -1, 10, (int) (byte) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6473");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) ' ', (int) (byte) 1, 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6474");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 0, (int) '4', (int) (short) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6475");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) -1, (int) (byte) 0, (int) 'a');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6476");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '4', (int) ' ', (int) (byte) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6477");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(10, (int) '#', (int) '#');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 173.20508075688772d + "'", double3 == 173.20508075688772d);
    }

    @Test
    public void test6478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6478");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 10, (int) (short) 100, (int) (short) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6479");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 0, (int) (byte) 1, (int) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6480");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 10, (int) (short) -1, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4.993746088859544d + "'", double3 == 4.993746088859544d);
    }

    @Test
    public void test6481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6481");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) ' ', (int) ' ', (int) (short) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6482");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 10, (int) (byte) 100, (int) (byte) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6483");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 1, 100, 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6484");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 0, 10, (int) '4');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6485");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 1, (int) '4', (int) (byte) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6486");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 0, 10, (int) (short) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6487");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 0, (int) 'a', 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6488");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 0, (-1), (int) '#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6489");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 1, (int) (byte) 1, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.4330127018922193d + "'", double3 == 0.4330127018922193d);
    }

    @Test
    public void test6490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6490");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) -1, (int) (byte) 1, (int) (byte) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6491");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '#', 10, (int) (byte) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6492");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) -1, (int) (short) 100, 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6493");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) ' ', (int) (short) 100, (int) '#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6494");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 0, (int) (short) 1, (int) (short) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6495");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 10, (int) 'a', (int) (short) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6496");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 10, (int) (short) -1, (int) (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6497");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 0, (-1), (int) (short) -1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test6498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6498");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) -1, 100, (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6499");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) -1, (int) (short) 1, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.4330127018922193d + "'", double3 == 0.4330127018922193d);
    }

    @Test
    public void test6500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6500");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(1, (int) (short) 0, (int) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }
}

