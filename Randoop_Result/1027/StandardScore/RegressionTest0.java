package StandardScore;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test00001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00001");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((double) 10, (double) (byte) 10, (double) (short) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test00002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00002");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test00003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00003");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0d, (double) (byte) 10, (double) '#');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.2857142857142857d) + "'", double3 == (-0.2857142857142857d));
    }

    @Test
    public void test00004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00004");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((double) (byte) -1, (double) (short) 1, (double) (-1));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.0d + "'", double3 == 2.0d);
    }

    @Test
    public void test00005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00005");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((double) (-1.0f), (double) (byte) 1, (double) (-1));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.0d + "'", double3 == 2.0d);
    }

    @Test
    public void test00006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00006");
        com.thealgorithms.maths.StandardScore standardScore0 = new com.thealgorithms.maths.StandardScore();
        java.lang.Class<?> wildcardClass1 = standardScore0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test00007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00007");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((double) '#', (double) 0L, (double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3.5d + "'", double3 == 3.5d);
    }

    @Test
    public void test00008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00008");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0d, (double) 10L, (double) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.1d) + "'", double3 == (-0.1d));
    }

    @Test
    public void test00009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00009");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((double) 1.0f, (double) (byte) -1, (double) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.02d + "'", double3 == 0.02d);
    }

    @Test
    public void test00010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00010");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((double) (byte) 0, (double) (short) 0, (-1.0d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.0d) + "'", double3 == (-0.0d));
    }

    @Test
    public void test00011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00011");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((double) 10, (double) 0, (double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test00012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00012");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((double) 100, 0.0d, (double) (byte) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test00013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00013");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.1d), (double) 0.0f, (double) 1.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.1d) + "'", double3 == (-0.1d));
    }

    @Test
    public void test00014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00014");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((double) 10.0f, (double) '#', (double) 0.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.NEGATIVE_INFINITY + "'", double3 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test00015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00015");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((double) (byte) 1, (double) (short) 100, (double) 0L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.NEGATIVE_INFINITY + "'", double3 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test00016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00016");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((double) 10L, (double) (byte) -1, Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.0d) + "'", double3 == (-0.0d));
    }

    @Test
    public void test00017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00017");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((double) 0.0f, 0.02d, 3.5d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.005714285714285714d) + "'", double3 == (-0.005714285714285714d));
    }

    @Test
    public void test00018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00018");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((double) 1.0f, (double) 10, (double) (short) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.9d) + "'", double3 == (-0.9d));
    }

    @Test
    public void test00019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00019");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((double) '4', (-0.2857142857142857d), (double) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 5.228571428571429d + "'", double3 == 5.228571428571429d);
    }

    @Test
    public void test00020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00020");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.2857142857142857d), (double) 10, (double) (-1.0f));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.285714285714286d + "'", double3 == 10.285714285714286d);
    }

    @Test
    public void test00021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00021");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(3.5d, (double) ' ', (-0.9d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 31.666666666666664d + "'", double3 == 31.666666666666664d);
    }

    @Test
    public void test00022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00022");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((double) 0L, 5.228571428571429d, (double) ' ');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.16339285714285715d) + "'", double3 == (-0.16339285714285715d));
    }

    @Test
    public void test00023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00023");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1.0d, 0.0d, (double) (byte) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test00024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00024");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((double) 100L, (-0.2857142857142857d), (double) 10.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.028571428571428d + "'", double3 == 10.028571428571428d);
    }

    @Test
    public void test00025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00025");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((double) (byte) 0, (-0.16339285714285715d), (double) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0016339285714285715d + "'", double3 == 0.0016339285714285715d);
    }

    @Test
    public void test00026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00026");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(Double.NEGATIVE_INFINITY, (double) (byte) 0, (-0.0d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test00027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00027");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((double) 10.0f, (double) 1, (double) (byte) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test00028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00028");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((double) (byte) 10, (-0.9d), (double) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test00029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00029");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(Double.NEGATIVE_INFINITY, (-1.0d), Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test00030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00030");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((double) (byte) 10, (double) (-1), 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test00031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00031");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((double) (short) 100, 31.666666666666664d, 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 68.33333333333334d + "'", double3 == 68.33333333333334d);
    }

    @Test
    public void test00032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00032");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.02d, (double) (short) 100, (double) 'a');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0307216494845362d) + "'", double3 == (-1.0307216494845362d));
    }

    @Test
    public void test00033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00033");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((double) (short) -1, (double) 1.0f, (double) 1L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-2.0d) + "'", double3 == (-2.0d));
    }

    @Test
    public void test00034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00034");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(10.028571428571428d, (double) 1, 100.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.09028571428571429d + "'", double3 == 0.09028571428571429d);
    }

    @Test
    public void test00035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00035");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((double) 1L, (double) (byte) -1, 68.33333333333334d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.029268292682926824d + "'", double3 == 0.029268292682926824d);
    }

    @Test
    public void test00036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00036");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((double) (byte) 10, 100.0d, 5.228571428571429d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-17.21311475409836d) + "'", double3 == (-17.21311475409836d));
    }

    @Test
    public void test00037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00037");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(5.228571428571429d, 0.0d, (-0.0d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.NEGATIVE_INFINITY + "'", double3 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test00038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00038");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((double) 100L, (-0.0d), (double) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test00039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00039");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(68.33333333333334d, (double) (short) -1, (-17.21311475409836d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-4.027936507936508d) + "'", double3 == (-4.027936507936508d));
    }

    @Test
    public void test00040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00040");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((double) 10L, 1.0d, (double) ' ');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.28125d + "'", double3 == 0.28125d);
    }

    @Test
    public void test00041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00041");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((double) ' ', (double) 10, 31.666666666666664d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.6947368421052632d + "'", double3 == 0.6947368421052632d);
    }

    @Test
    public void test00042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00042");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((double) 100.0f, 0.0016339285714285715d, (double) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 9.999836607142857d + "'", double3 == 9.999836607142857d);
    }

    @Test
    public void test00043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00043");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(68.33333333333334d, (-17.21311475409836d), (double) '4');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.6451240016813788d + "'", double3 == 1.6451240016813788d);
    }

    @Test
    public void test00044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00044");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-17.21311475409836d), (double) 10.0f, (double) 1L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-27.21311475409836d) + "'", double3 == (-27.21311475409836d));
    }

    @Test
    public void test00045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00045");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(68.33333333333334d, (double) (byte) 1, (double) 10.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 6.733333333333334d + "'", double3 == 6.733333333333334d);
    }

    @Test
    public void test00046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00046");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1.0d), (-2.0d), (double) (byte) -1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test00047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00047");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.09028571428571429d, (-0.9d), 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test00048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00048");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((double) (-1L), 1.6451240016813788d, (double) 0.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.NEGATIVE_INFINITY + "'", double3 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test00049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00049");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0d, (double) 0, (double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test00050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00050");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(68.33333333333334d, (-0.005714285714285714d), (double) '4');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.3142124542124545d + "'", double3 == 1.3142124542124545d);
    }

    @Test
    public void test00051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00051");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.02d, (double) (-1L), (double) (-1.0f));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.02d) + "'", double3 == (-1.02d));
    }

    @Test
    public void test00052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00052");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(9.999836607142857d, (double) (short) -1, 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.999836607142857d + "'", double3 == 10.999836607142857d);
    }

    @Test
    public void test00053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00053");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((double) 1.0f, (double) '4', 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.NEGATIVE_INFINITY + "'", double3 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test00054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00054");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((double) (byte) 10, (double) 0.0f, (-0.1d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-100.0d) + "'", double3 == (-100.0d));
    }

    @Test
    public void test00055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00055");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((double) (short) 10, 0.029268292682926824d, 0.02d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 498.5365853658536d + "'", double3 == 498.5365853658536d);
    }

    @Test
    public void test00056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00056");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((double) (byte) 10, 10.0d, (double) 1L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test00057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00057");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((double) (short) 0, 2.0d, (double) (short) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.NEGATIVE_INFINITY + "'", double3 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test00058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00058");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((double) (short) 1, (double) (-1), (double) (-1L));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-2.0d) + "'", double3 == (-2.0d));
    }

    @Test
    public void test00059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00059");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((double) 100L, (double) (short) 1, (double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 9.9d + "'", double3 == 9.9d);
    }

    @Test
    public void test00060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00060");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.1d), 1.0d, (double) (byte) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.1d) + "'", double3 == (-1.1d));
    }

    @Test
    public void test00061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00061");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(68.33333333333334d, 0.0d, (double) ' ');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.135416666666667d + "'", double3 == 2.135416666666667d);
    }

    @Test
    public void test00062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00062");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((double) (short) -1, (double) 1L, 0.029268292682926824d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-68.33333333333334d) + "'", double3 == (-68.33333333333334d));
    }

    @Test
    public void test00063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00063");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1.6451240016813788d, (double) (byte) 10, 1.3142124542124545d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-6.357325234240991d) + "'", double3 == (-6.357325234240991d));
    }

    @Test
    public void test00064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00064");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1.0307216494845362d), 100.0d, (-0.9d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 112.25635738831615d + "'", double3 == 112.25635738831615d);
    }

    @Test
    public void test00065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00065");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((double) 0, 0.0d, 9.999836607142857d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test00066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00066");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0d, Double.NaN, 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test00067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00067");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(Double.POSITIVE_INFINITY, (double) '#', (double) (byte) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test00068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00068");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((double) 0.0f, (-27.21311475409836d), (double) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 27.21311475409836d + "'", double3 == 27.21311475409836d);
    }

    @Test
    public void test00069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00069");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(2.0d, 112.25635738831615d, Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.0d) + "'", double3 == (-0.0d));
    }

    @Test
    public void test00070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00070");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((double) 0L, (double) 0L, (double) 'a');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test00071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00071");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0016339285714285715d, 1.3142124542124545d, Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.0d) + "'", double3 == (-0.0d));
    }

    @Test
    public void test00072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00072");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((double) (byte) 100, 1.3142124542124545d, (double) 'a');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0173792530493562d + "'", double3 == 1.0173792530493562d);
    }

    @Test
    public void test00073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00073");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((double) (-1L), 27.21311475409836d, (double) (short) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-28.21311475409836d) + "'", double3 == (-28.21311475409836d));
    }

    @Test
    public void test00074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00074");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(2.0d, (double) 10, 27.21311475409836d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.29397590361445786d) + "'", double3 == (-0.29397590361445786d));
    }

    @Test
    public void test00075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00075");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-4.027936507936508d), (-1.1d), 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-2.9279365079365083d) + "'", double3 == (-2.9279365079365083d));
    }

    @Test
    public void test00076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00076");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1.0173792530493562d, (-0.005714285714285714d), (double) 'a');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.010547356069728267d + "'", double3 == 0.010547356069728267d);
    }

    @Test
    public void test00077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00077");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0016339285714285715d, 27.21311475409836d, (-0.29397590361445786d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 92.56364379175143d + "'", double3 == 92.56364379175143d);
    }

    @Test
    public void test00078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00078");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((double) (byte) 100, (double) (byte) 100, (-1.1d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.0d) + "'", double3 == (-0.0d));
    }

    @Test
    public void test00079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00079");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.029268292682926824d, (double) (short) 0, 10.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0029268292682926825d + "'", double3 == 0.0029268292682926825d);
    }

    @Test
    public void test00080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00080");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-68.33333333333334d), 0.0d, 10.028571428571428d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-6.813865147198482d) + "'", double3 == (-6.813865147198482d));
    }

    @Test
    public void test00081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00081");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((double) '4', (-6.357325234240991d), 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test00082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00082");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.16339285714285715d), (double) (-1.0f), (double) 0L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test00083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00083");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(100.0d, 5.228571428571429d, (-0.16339285714285715d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-580.0218579234972d) + "'", double3 == (-580.0218579234972d));
    }

    @Test
    public void test00084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00084");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(100.0d, (double) (short) 1, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test00085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00085");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((double) 100.0f, 0.09028571428571429d, (double) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 9.990971428571429d + "'", double3 == 9.990971428571429d);
    }

    @Test
    public void test00086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00086");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((double) (byte) 1, 1.0173792530493562d, (double) (-1.0f));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.01737925304935617d + "'", double3 == 0.01737925304935617d);
    }

    @Test
    public void test00087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00087");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.9d), 2.0d, 68.33333333333334d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.0424390243902439d) + "'", double3 == (-0.0424390243902439d));
    }

    @Test
    public void test00088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00088");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.0424390243902439d), 0.6947368421052632d, (double) (byte) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.7371758664955071d) + "'", double3 == (-0.7371758664955071d));
    }

    @Test
    public void test00089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00089");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((double) (short) 0, 9.990971428571429d, 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.990971428571429d) + "'", double3 == (-9.990971428571429d));
    }

    @Test
    public void test00090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00090");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((double) (-1), (double) 'a', (-0.7371758664955071d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 132.93978337338487d + "'", double3 == 132.93978337338487d);
    }

    @Test
    public void test00091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00091");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((double) (byte) 100, (double) 0.0f, (double) (short) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test00092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00092");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((double) 0L, (-0.16339285714285715d), 31.666666666666664d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.005159774436090226d + "'", double3 == 0.005159774436090226d);
    }

    @Test
    public void test00093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00093");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-27.21311475409836d), (double) '4', (double) '#');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-2.263231850117096d) + "'", double3 == (-2.263231850117096d));
    }

    @Test
    public void test00094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00094");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0d, (double) (byte) 10, (-28.21311475409836d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.35444509006391633d + "'", double3 == 0.35444509006391633d);
    }

    @Test
    public void test00095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00095");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(9.999836607142857d, (double) 1.0f, (-2.0d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-4.4999183035714285d) + "'", double3 == (-4.4999183035714285d));
    }

    @Test
    public void test00096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00096");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((double) 0, 27.21311475409836d, 100.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.2721311475409836d) + "'", double3 == (-0.2721311475409836d));
    }

    @Test
    public void test00097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00097");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((double) '4', 498.5365853658536d, (double) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-4.465365853658536d) + "'", double3 == (-4.465365853658536d));
    }

    @Test
    public void test00098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00098");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((double) 0L, (double) (short) 1, 10.285714285714286d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.09722222222222221d) + "'", double3 == (-0.09722222222222221d));
    }

    @Test
    public void test00099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00099");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((double) 0L, (-2.263231850117096d), (double) (short) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.263231850117096d + "'", double3 == 2.263231850117096d);
    }

    @Test
    public void test00100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00100");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0029268292682926825d, 31.666666666666664d, 10.285714285714286d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-3.0784191508581746d) + "'", double3 == (-3.0784191508581746d));
    }

    @Test
    public void test00101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00101");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.6947368421052632d, (double) (byte) 1, (-2.0d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.1526315789473684d + "'", double3 == 0.1526315789473684d);
    }

    @Test
    public void test00102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00102");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(27.21311475409836d, (double) 100, 2.263231850117096d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-32.16059602649007d) + "'", double3 == (-32.16059602649007d));
    }

    @Test
    public void test00103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00103");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.02d, (double) (-1), (-0.09722222222222221d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-10.491428571428573d) + "'", double3 == (-10.491428571428573d));
    }

    @Test
    public void test00104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00104");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-32.16059602649007d), 2.0d, 0.6947368421052632d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-49.17055488661449d) + "'", double3 == (-49.17055488661449d));
    }

    @Test
    public void test00105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00105");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(9.9d, (-0.29397590361445786d), 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test00106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00106");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((double) 1.0f, 0.0d, (double) (short) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.1d + "'", double3 == 0.1d);
    }

    @Test
    public void test00107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00107");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.9d), (-10.491428571428573d), 1.3142124542124545d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 7.298232900384636d + "'", double3 == 7.298232900384636d);
    }

    @Test
    public void test00108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00108");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((double) 100, (double) 10, (-6.813865147198482d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-13.208362369337976d) + "'", double3 == (-13.208362369337976d));
    }

    @Test
    public void test00109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00109");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.029268292682926824d, 9.990971428571429d, (double) (-1.0f));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 9.961703135888502d + "'", double3 == 9.961703135888502d);
    }

    @Test
    public void test00110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00110");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((double) (short) -1, 0.0d, (-0.005714285714285714d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 175.0d + "'", double3 == 175.0d);
    }

    @Test
    public void test00111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00111");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-13.208362369337976d), (double) (short) 10, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.NEGATIVE_INFINITY + "'", double3 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test00112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00112");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1.0307216494845362d), (double) (byte) 100, 2.263231850117096d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-44.64002291424865d) + "'", double3 == (-44.64002291424865d));
    }

    @Test
    public void test00113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00113");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-6.813865147198482d), (double) (short) 0, (double) '#');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.19468186134852805d) + "'", double3 == (-0.19468186134852805d));
    }

    @Test
    public void test00114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00114");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(498.5365853658536d, (-2.263231850117096d), (-6.357325234240991d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-78.77523939134471d) + "'", double3 == (-78.77523939134471d));
    }

    @Test
    public void test00115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00115");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(132.93978337338487d, Double.POSITIVE_INFINITY, (-17.21311475409836d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test00116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00116");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(92.56364379175143d, (double) (byte) -1, (-2.263231850117096d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-41.340724233317324d) + "'", double3 == (-41.340724233317324d));
    }

    @Test
    public void test00117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00117");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1.0307216494845362d), (double) (short) 100, 0.09028571428571429d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1119.0111575101134d) + "'", double3 == (-1119.0111575101134d));
    }

    @Test
    public void test00118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00118");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((double) (short) -1, Double.NaN, (double) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test00119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00119");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-27.21311475409836d), (double) (byte) 10, (double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-3.7213114754098355d) + "'", double3 == (-3.7213114754098355d));
    }

    @Test
    public void test00120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00120");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((double) (-1.0f), (-3.0784191508581746d), Double.NaN);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test00121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00121");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((double) 1L, (double) 0, 0.029268292682926824d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 34.16666666666667d + "'", double3 == 34.16666666666667d);
    }

    @Test
    public void test00122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00122");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(2.0d, (-17.21311475409836d), (-0.16339285714285715d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-117.58846188300636d) + "'", double3 == (-117.58846188300636d));
    }

    @Test
    public void test00123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00123");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(2.135416666666667d, (double) (short) 0, (double) 1L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.135416666666667d + "'", double3 == 2.135416666666667d);
    }

    @Test
    public void test00124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00124");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-2.0d), (-0.29397590361445786d), 175.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.009748709122203098d) + "'", double3 == (-0.009748709122203098d));
    }

    @Test
    public void test00125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00125");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(10.285714285714286d, (double) '#', 0.1526315789473684d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-161.92118226600988d) + "'", double3 == (-161.92118226600988d));
    }

    @Test
    public void test00126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00126");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((double) 1.0f, (double) (short) 0, (double) '4');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.019230769230769232d + "'", double3 == 0.019230769230769232d);
    }

    @Test
    public void test00127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00127");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-3.7213114754098355d), (-1.1d), (-41.340724233317324d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0634074879921254d + "'", double3 == 0.0634074879921254d);
    }

    @Test
    public void test00128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00128");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.09722222222222221d), (-6.813865147198482d), (double) '4');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.1291662100956973d + "'", double3 == 0.1291662100956973d);
    }

    @Test
    public void test00129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00129");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(9.999836607142857d, (-161.92118226600988d), (-1.0d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-171.92101887315275d) + "'", double3 == (-171.92101887315275d));
    }

    @Test
    public void test00130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00130");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1.6451240016813788d, 0.0016339285714285715d, (-9.990971428571429d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.16449752507649265d) + "'", double3 == (-0.16449752507649265d));
    }

    @Test
    public void test00131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00131");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((double) (-1), (-44.64002291424865d), (double) 'a');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.44989714344586235d + "'", double3 == 0.44989714344586235d);
    }

    @Test
    public void test00132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00132");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1.3142124542124545d, (double) 100, 5.228571428571429d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-18.87433095138013d) + "'", double3 == (-18.87433095138013d));
    }

    @Test
    public void test00133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00133");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0d, (-44.64002291424865d), 92.56364379175143d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.4822630255857173d + "'", double3 == 0.4822630255857173d);
    }

    @Test
    public void test00134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00134");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.010547356069728267d, (-171.92101887315275d), (-0.2857142857142857d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-601.7604818022787d) + "'", double3 == (-601.7604818022787d));
    }

    @Test
    public void test00135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00135");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(498.5365853658536d, 7.298232900384636d, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test00136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00136");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.16339285714285715d), (-1119.0111575101134d), (double) 10L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 111.88477646529707d + "'", double3 == 111.88477646529707d);
    }

    @Test
    public void test00137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00137");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-601.7604818022787d), 10.0d, (-1.02d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 599.7651782375282d + "'", double3 == 599.7651782375282d);
    }

    @Test
    public void test00138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00138");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1.0173792530493562d, 2.263231850117096d, (double) 0.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.NEGATIVE_INFINITY + "'", double3 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test00139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00139");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((double) (byte) 10, (-6.357325234240991d), (double) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test00140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00140");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0d, 0.1d, (-0.1d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test00141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00141");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-27.21311475409836d), (-44.64002291424865d), 0.029268292682926824d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 595.4193621384683d + "'", double3 == 595.4193621384683d);
    }

    @Test
    public void test00142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00142");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-601.7604818022787d), (-4.4999183035714285d), (double) 0L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.NEGATIVE_INFINITY + "'", double3 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test00143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00143");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.16449752507649265d), 9.999836607142857d, 0.09028571428571429d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-112.57965019863204d) + "'", double3 == (-112.57965019863204d));
    }

    @Test
    public void test00144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00144");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-44.64002291424865d), (-2.9279365079365083d), (-0.9d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 46.34676267368015d + "'", double3 == 46.34676267368015d);
    }

    @Test
    public void test00145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00145");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((double) 10L, 31.666666666666664d, 5.228571428571429d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-4.143897996357012d) + "'", double3 == (-4.143897996357012d));
    }

    @Test
    public void test00146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00146");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-6.357325234240991d), (double) 1.0f, 5.228571428571429d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.4071387060023755d) + "'", double3 == (-1.4071387060023755d));
    }

    @Test
    public void test00147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00147");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-2.9279365079365083d), (-0.16339285714285715d), 3.5d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.7898696145124717d) + "'", double3 == (-0.7898696145124717d));
    }

    @Test
    public void test00148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00148");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.005714285714285714d), (-49.17055488661449d), 111.88477646529707d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.43942386224590174d + "'", double3 == 0.43942386224590174d);
    }

    @Test
    public void test00149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00149");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((double) (-1), (-28.21311475409836d), (-78.77523939134471d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.34545264431260303d) + "'", double3 == (-0.34545264431260303d));
    }

    @Test
    public void test00150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00150");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-2.9279365079365083d), (-0.09722222222222221d), 599.7651782375282d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.004719704291657331d) + "'", double3 == (-0.004719704291657331d));
    }

    @Test
    public void test00151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00151");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.9d), 0.0029268292682926825d, (-78.77523939134471d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.01146206392065246d + "'", double3 == 0.01146206392065246d);
    }

    @Test
    public void test00152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00152");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(2.135416666666667d, (-0.005714285714285714d), (-28.21311475409836d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.07589133532553058d) + "'", double3 == (-0.07589133532553058d));
    }

    @Test
    public void test00153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00153");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.005159774436090226d, 0.4822630255857173d, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.NEGATIVE_INFINITY + "'", double3 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test00154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00154");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.34545264431260303d), (-0.34545264431260303d), (-0.2857142857142857d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.0d) + "'", double3 == (-0.0d));
    }

    @Test
    public void test00155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00155");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(2.135416666666667d, 5.228571428571429d, (double) 1L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-3.0931547619047617d) + "'", double3 == (-3.0931547619047617d));
    }

    @Test
    public void test00156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00156");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.4822630255857173d, 132.93978337338487d, (-117.58846188300636d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.1264499783965762d + "'", double3 == 1.1264499783965762d);
    }

    @Test
    public void test00157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00157");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1119.0111575101134d), 0.0d, 0.1291662100956973d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-8663.342809865328d) + "'", double3 == (-8663.342809865328d));
    }

    @Test
    public void test00158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00158");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(92.56364379175143d, 2.135416666666667d, (-4.465365853658536d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-20.251023116279637d) + "'", double3 == (-20.251023116279637d));
    }

    @Test
    public void test00159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00159");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1.02d), 0.01146206392065246d, (-0.2857142857142857d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3.6101172237222836d + "'", double3 == 3.6101172237222836d);
    }

    @Test
    public void test00160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00160");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.0424390243902439d), 0.0d, (-1.02d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.04160688665710186d + "'", double3 == 0.04160688665710186d);
    }

    @Test
    public void test00161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00161");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1.0173792530493562d, 0.0d, (-2.0d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.5086896265246781d) + "'", double3 == (-0.5086896265246781d));
    }

    @Test
    public void test00162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00162");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-13.208362369337976d), (-0.009748709122203098d), (-0.005714285714285714d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2309.7573905377603d + "'", double3 == 2309.7573905377603d);
    }

    @Test
    public void test00163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00163");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-27.21311475409836d), 1.0d, (-0.0d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test00164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00164");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.009748709122203098d), 111.88477646529707d, (double) '4');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-2.151817791815755d) + "'", double3 == (-2.151817791815755d));
    }

    @Test
    public void test00165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00165");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((double) 1, (double) 10.0f, (-0.16449752507649265d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 54.71206935067825d + "'", double3 == 54.71206935067825d);
    }

    @Test
    public void test00166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00166");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.005714285714285714d), (double) (short) 1, 0.6947368421052632d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.4476190476190476d) + "'", double3 == (-1.4476190476190476d));
    }

    @Test
    public void test00167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00167");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((double) 100L, (double) 100L, (-4.027936507936508d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.0d) + "'", double3 == (-0.0d));
    }

    @Test
    public void test00168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00168");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(10.999836607142857d, 1.6451240016813788d, (-17.21311475409836d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.5434642561268097d) + "'", double3 == (-0.5434642561268097d));
    }

    @Test
    public void test00169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00169");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.2721311475409836d), 0.1d, (-68.33333333333334d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.005445821671331467d + "'", double3 == 0.005445821671331467d);
    }

    @Test
    public void test00170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00170");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1.1d), 1.6451240016813788d, (double) (short) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.27451240016813794d) + "'", double3 == (-0.27451240016813794d));
    }

    @Test
    public void test00171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00171");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(175.0d, (-3.0784191508581746d), (double) 10.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 17.807841915085817d + "'", double3 == 17.807841915085817d);
    }

    @Test
    public void test00172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00172");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-32.16059602649007d), 0.0d, (double) (byte) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-32.16059602649007d) + "'", double3 == (-32.16059602649007d));
    }

    @Test
    public void test00173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00173");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.27451240016813794d), (-4.027936507936508d), 498.5365853658536d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.007528883973507984d + "'", double3 == 0.007528883973507984d);
    }

    @Test
    public void test00174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00174");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0d, (-0.34545264431260303d), (-4.027936507936508d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.08576417320182057d) + "'", double3 == (-0.08576417320182057d));
    }

    @Test
    public void test00175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00175");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1.0d), (-3.0931547619047617d), (-0.0d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.NEGATIVE_INFINITY + "'", double3 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test00176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00176");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(46.34676267368015d, (-3.0784191508581746d), 5.228571428571429d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 9.452903627643943d + "'", double3 == 9.452903627643943d);
    }

    @Test
    public void test00177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00177");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(10.285714285714286d, Double.NaN, (-0.7371758664955071d));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test00178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00178");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((double) 1L, 3.5d, 0.01737925304935617d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-143.84968058754487d) + "'", double3 == (-143.84968058754487d));
    }

    @Test
    public void test00179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00179");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.5086896265246781d), (double) (-1.0f), 2.135416666666667d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.23007705294454095d + "'", double3 == 0.23007705294454095d);
    }

    @Test
    public void test00180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00180");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((double) (byte) 0, (-3.7213114754098355d), (-2.9279365079365083d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.27096727177068d) + "'", double3 == (-1.27096727177068d));
    }

    @Test
    public void test00181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00181");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((double) 100, (-3.7213114754098355d), (-0.08576417320182057d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1209.3780841486393d) + "'", double3 == (-1209.3780841486393d));
    }

    @Test
    public void test00182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00182");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(9.452903627643943d, (-0.2721311475409836d), (-17.21311475409836d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.5649782107488386d) + "'", double3 == (-0.5649782107488386d));
    }

    @Test
    public void test00183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00183");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.009748709122203098d), (-8663.342809865328d), 599.7651782375282d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 14.444541589784027d + "'", double3 == 14.444541589784027d);
    }

    @Test
    public void test00184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00184");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(2.135416666666667d, (double) (short) 1, (-6.357325234240991d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.17859974514930188d) + "'", double3 == (-0.17859974514930188d));
    }

    @Test
    public void test00185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00185");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(92.56364379175143d, (double) (-1.0f), 111.88477646529707d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.8362499952866399d + "'", double3 == 0.8362499952866399d);
    }

    @Test
    public void test00186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00186");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.09028571428571429d, 5.228571428571429d, 0.0016339285714285715d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-3144.743169398907d) + "'", double3 == (-3144.743169398907d));
    }

    @Test
    public void test00187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00187");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-580.0218579234972d), 10.0d, 0.0029268292682926825d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-201590.80145719493d) + "'", double3 == (-201590.80145719493d));
    }

    @Test
    public void test00188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00188");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(2309.7573905377603d, (-0.5434642561268097d), 0.6947368421052632d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3325.4330485669584d + "'", double3 == 3325.4330485669584d);
    }

    @Test
    public void test00189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00189");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-49.17055488661449d), 2309.7573905377603d, 3.6101172237222836d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-653.4214262971092d) + "'", double3 == (-653.4214262971092d));
    }

    @Test
    public void test00190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00190");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0634074879921254d, (-78.77523939134471d), 0.43942386224590174d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 179.4136678795534d + "'", double3 == 179.4136678795534d);
    }

    @Test
    public void test00191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00191");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.27451240016813794d), (double) 100, 112.25635738831615d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.8932635507964994d) + "'", double3 == (-0.8932635507964994d));
    }

    @Test
    public void test00192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00192");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(10.028571428571428d, (-0.16339285714285715d), (-10.491428571428573d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.9714562908496731d) + "'", double3 == (-0.9714562908496731d));
    }

    @Test
    public void test00193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00193");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.5086896265246781d), (-3.0784191508581746d), 100.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.025697295243334962d + "'", double3 == 0.025697295243334962d);
    }

    @Test
    public void test00194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00194");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-9.990971428571429d), (-3.7213114754098355d), (-100.0d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.06269659953161594d + "'", double3 == 0.06269659953161594d);
    }

    @Test
    public void test00195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00195");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-68.33333333333334d), 17.807841915085817d, (-1.02d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 84.45213259648938d + "'", double3 == 84.45213259648938d);
    }

    @Test
    public void test00196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00196");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.0424390243902439d), 0.6947368421052632d, (-2.263231850117096d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.32571822743541134d + "'", double3 == 0.32571822743541134d);
    }

    @Test
    public void test00197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00197");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((double) (byte) 10, 599.7651782375282d, (-201590.80145719493d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0029255559974682515d + "'", double3 == 0.0029255559974682515d);
    }

    @Test
    public void test00198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00198");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.04160688665710186d, (double) 0.0f, (-13.208362369337976d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.0031500412764029324d) + "'", double3 == (-0.0031500412764029324d));
    }

    @Test
    public void test00199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00199");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(84.45213259648938d, 0.02d, 2.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 42.21606629824469d + "'", double3 == 42.21606629824469d);
    }

    @Test
    public void test00200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00200");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.07589133532553058d), 27.21311475409836d, 2.263231850117096d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-12.057538907475166d) + "'", double3 == (-12.057538907475166d));
    }

    @Test
    public void test00201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00201");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-8663.342809865328d), (-0.0031500412764029324d), (double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-866.3339659824051d) + "'", double3 == (-866.3339659824051d));
    }

    @Test
    public void test00202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00202");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1209.3780841486393d), (double) 1, (double) 0.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.NEGATIVE_INFINITY + "'", double3 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test00203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00203");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1.0307216494845362d), (-0.2857142857142857d), (-0.009748709122203098d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 76.42112965228029d + "'", double3 == 76.42112965228029d);
    }

    @Test
    public void test00204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00204");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(179.4136678795534d, (-0.16449752507649265d), (double) '4');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3.453426257781344d + "'", double3 == 3.453426257781344d);
    }

    @Test
    public void test00205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00205");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((double) 10.0f, 1.3142124542124545d, 0.01146206392065246d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 757.7856488949959d + "'", double3 == 757.7856488949959d);
    }

    @Test
    public void test00206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00206");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1209.3780841486393d), 599.7651782375282d, 0.09028571428571429d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-20037.97917199869d) + "'", double3 == (-20037.97917199869d));
    }

    @Test
    public void test00207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00207");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-10.491428571428573d), (-0.7898696145124717d), (double) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.9701558956916101d) + "'", double3 == (-0.9701558956916101d));
    }

    @Test
    public void test00208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00208");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-3.7213114754098355d), 84.45213259648938d, (-4.143897996357012d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 21.27789925075722d + "'", double3 == 21.27789925075722d);
    }

    @Test
    public void test00209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00209");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((double) 100L, 27.21311475409836d, (-0.9701558956916101d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-75.0259680625998d) + "'", double3 == (-75.0259680625998d));
    }

    @Test
    public void test00210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00210");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-49.17055488661449d), 0.01146206392065246d, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.NEGATIVE_INFINITY + "'", double3 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test00211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00211");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.005714285714285714d), (-0.7898696145124717d), (-78.77523939134471d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.009954337617466431d) + "'", double3 == (-0.009954337617466431d));
    }

    @Test
    public void test00212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00212");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-12.057538907475166d), 0.010547356069728267d, (-0.19468186134852805d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 61.988755295184255d + "'", double3 == 61.988755295184255d);
    }

    @Test
    public void test00213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00213");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0d, 0.09028571428571429d, (-0.29397590361445786d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.30711943793911006d + "'", double3 == 0.30711943793911006d);
    }

    @Test
    public void test00214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00214");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(5.228571428571429d, (double) '4', 0.005445821671331467d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-8588.49800713237d) + "'", double3 == (-8588.49800713237d));
    }

    @Test
    public void test00215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00215");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-17.21311475409836d), (-0.0031500412764029324d), (-18.87433095138013d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.9118185305298744d + "'", double3 == 0.9118185305298744d);
    }

    @Test
    public void test00216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00216");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.1291662100956973d, (-2.9279365079365083d), (double) (byte) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test00217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00217");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(27.21311475409836d, (-4.143897996357012d), 17.807841915085817d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.760854173120857d + "'", double3 == 1.760854173120857d);
    }

    @Test
    public void test00218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00218");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((double) 1L, 42.21606629824469d, (-0.5434642561268097d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 75.83951627653596d + "'", double3 == 75.83951627653596d);
    }

    @Test
    public void test00219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00219");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(Double.NEGATIVE_INFINITY, 76.42112965228029d, 0.005159774436090226d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.NEGATIVE_INFINITY + "'", double3 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test00220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00220");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.16339285714285715d), 0.0d, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.NEGATIVE_INFINITY + "'", double3 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test00221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00221");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0d, 0.1291662100956973d, (-0.9701558956916101d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.1331396435040129d + "'", double3 == 0.1331396435040129d);
    }

    @Test
    public void test00222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00222");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.0d), (double) (short) -1, 0.01737925304935617d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 57.539872235017945d + "'", double3 == 57.539872235017945d);
    }

    @Test
    public void test00223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00223");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(46.34676267368015d, (double) 10.0f, (double) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3.6346762673680155d + "'", double3 == 3.6346762673680155d);
    }

    @Test
    public void test00224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00224");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-13.208362369337976d), 9.961703135888502d, 0.01146206392065246d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-2021.4566648401276d) + "'", double3 == (-2021.4566648401276d));
    }

    @Test
    public void test00225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00225");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1.0d), 498.5365853658536d, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.NEGATIVE_INFINITY + "'", double3 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test00226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00226");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.007528883973507984d, (double) 0.0f, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test00227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00227");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.30711943793911006d, 179.4136678795534d, (-10.491428571428573d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 17.071702602005715d + "'", double3 == 17.071702602005715d);
    }

    @Test
    public void test00228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00228");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((double) '4', (-0.17859974514930188d), 57.539872235017945d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.906825088732021d + "'", double3 == 0.906825088732021d);
    }

    @Test
    public void test00229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00229");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((double) (byte) -1, (-143.84968058754487d), (double) (byte) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test00230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00230");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.44989714344586235d, (double) 10.0f, 3325.4330485669584d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.0028718373568427723d) + "'", double3 == (-0.0028718373568427723d));
    }

    @Test
    public void test00231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00231");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((double) 10L, (double) (byte) 0, (double) 0.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test00232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00232");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(5.228571428571429d, (-12.057538907475166d), (-3.0931547619047617d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-5.588504832975711d) + "'", double3 == (-5.588504832975711d));
    }

    @Test
    public void test00233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00233");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-2.263231850117096d), 1.3142124542124545d, (-9.990971428571429d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.3580677144265516d + "'", double3 == 0.3580677144265516d);
    }

    @Test
    public void test00234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00234");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-28.21311475409836d), 498.5365853658536d, (double) (-1.0f));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 526.749700119952d + "'", double3 == 526.749700119952d);
    }

    @Test
    public void test00235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00235");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0016339285714285715d, 76.42112965228029d, (double) ' ');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-2.388109241365902d) + "'", double3 == (-2.388109241365902d));
    }

    @Test
    public void test00236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00236");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(10.028571428571428d, (-3144.743169398907d), (-2.388109241365902d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1321.0332618716707d) + "'", double3 == (-1321.0332618716707d));
    }

    @Test
    public void test00237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00237");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0d, 0.01146206392065246d, 0.30711943793911006d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.037321193336271166d) + "'", double3 == (-0.037321193336271166d));
    }

    @Test
    public void test00238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00238");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.1d), 0.06269659953161594d, (-27.21311475409836d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.005978609982788297d + "'", double3 == 0.005978609982788297d);
    }

    @Test
    public void test00239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00239");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((double) (-1L), 0.1526315789473684d, 0.0634074879921254d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-18.178161845656373d) + "'", double3 == (-18.178161845656373d));
    }

    @Test
    public void test00240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00240");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(21.27789925075722d, 0.02d, (-13.208362369337976d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.609427320082126d) + "'", double3 == (-1.609427320082126d));
    }

    @Test
    public void test00241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00241");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.8362499952866399d, (-5.588504832975711d), 179.4136678795534d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.03580972901448908d + "'", double3 == 0.03580972901448908d);
    }

    @Test
    public void test00242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00242");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.9d), (-161.92118226600988d), (-0.9714562908496731d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-165.75236969763668d) + "'", double3 == (-165.75236969763668d));
    }

    @Test
    public void test00243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00243");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-4.465365853658536d), (-0.16449752507649265d), (-1.27096727177068d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3.3839331854628965d + "'", double3 == 3.3839331854628965d);
    }

    @Test
    public void test00244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00244");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(14.444541589784027d, (double) 100.0f, 3.6346762673680155d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-23.538673630532d) + "'", double3 == (-23.538673630532d));
    }

    @Test
    public void test00245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00245");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1.1264499783965762d, (-1209.3780841486393d), (-6.357325234240991d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-190.41098095896922d) + "'", double3 == (-190.41098095896922d));
    }

    @Test
    public void test00246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00246");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(9.452903627643943d, 0.0029255559974682515d, (double) (byte) -1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.449978071646475d) + "'", double3 == (-9.449978071646475d));
    }

    @Test
    public void test00247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00247");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(46.34676267368015d, (-4.465365853658536d), (double) (short) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 5.081212852733868d + "'", double3 == 5.081212852733868d);
    }

    @Test
    public void test00248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00248");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(112.25635738831615d, (-0.009954337617466431d), (-2.151817791815755d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-52.17277789640387d) + "'", double3 == (-52.17277789640387d));
    }

    @Test
    public void test00249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00249");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.029268292682926824d, (-201590.80145719493d), (-12.057538907475166d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-16719.06947781108d) + "'", double3 == (-16719.06947781108d));
    }

    @Test
    public void test00250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00250");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.09722222222222221d), 0.0d, 0.005159774436090226d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-18.842339607366924d) + "'", double3 == (-18.842339607366924d));
    }

    @Test
    public void test00251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00251");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((double) 0.0f, 10.285714285714286d, (-20037.97917199869d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 5.133109580275273E-4d + "'", double3 == 5.133109580275273E-4d);
    }

    @Test
    public void test00252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00252");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1.760854173120857d, 2.135416666666667d, (-52.17277789640387d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.007179270658916316d + "'", double3 == 0.007179270658916316d);
    }

    @Test
    public void test00253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00253");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-201590.80145719493d), 3.453426257781344d, (-18.178161845656373d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 11089.914183574241d + "'", double3 == 11089.914183574241d);
    }

    @Test
    public void test00254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00254");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1.609427320082126d), (-117.58846188300636d), (-2.388109241365902d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-48.56521324652172d) + "'", double3 == (-48.56521324652172d));
    }

    @Test
    public void test00255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00255");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.029268292682926824d, 498.5365853658536d, 0.02d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-24925.365853658535d) + "'", double3 == (-24925.365853658535d));
    }

    @Test
    public void test00256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00256");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((double) (-1L), 175.0d, (-18.178161845656373d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 9.681947024916315d + "'", double3 == 9.681947024916315d);
    }

    @Test
    public void test00257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00257");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1209.3780841486393d), 0.0d, (-190.41098095896922d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 6.351409346550463d + "'", double3 == 6.351409346550463d);
    }

    @Test
    public void test00258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00258");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0634074879921254d, 2.135416666666667d, (-1209.3780841486393d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0017132848741286434d + "'", double3 == 0.0017132848741286434d);
    }

    @Test
    public void test00259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00259");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-4.143897996357012d), 111.88477646529707d, 9.999836607142857d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-11.60305703182941d) + "'", double3 == (-11.60305703182941d));
    }

    @Test
    public void test00260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00260");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0d, (-0.5086896265246781d), 0.23007705294454095d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.2109533306969795d + "'", double3 == 2.2109533306969795d);
    }

    @Test
    public void test00261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00261");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1.609427320082126d), 10.0d, 0.02d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-580.4713660041064d) + "'", double3 == (-580.4713660041064d));
    }

    @Test
    public void test00262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00262");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.04160688665710186d, (double) '4', 0.005159774436090226d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-10069.896224516728d) + "'", double3 == (-10069.896224516728d));
    }

    @Test
    public void test00263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00263");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.8362499952866399d, (-0.19468186134852805d), 0.02d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 51.546592831758396d + "'", double3 == 51.546592831758396d);
    }

    @Test
    public void test00264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00264");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.27451240016813794d), (double) (byte) -1, 0.1291662100956973d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 5.616698045830711d + "'", double3 == 5.616698045830711d);
    }

    @Test
    public void test00265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00265");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.7898696145124717d), 0.43942386224590174d, (-11.60305703182941d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.10594565495853255d + "'", double3 == 0.10594565495853255d);
    }

    @Test
    public void test00266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00266");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(Double.NEGATIVE_INFINITY, 0.0029268292682926825d, (double) (short) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.NEGATIVE_INFINITY + "'", double3 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test00267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00267");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1.02d), (-1.1d), (-18.178161845656373d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.004400885011325602d) + "'", double3 == (-0.004400885011325602d));
    }

    @Test
    public void test00268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00268");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0d, (-11.60305703182941d), 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test00269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00269");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0d, 0.43942386224590174d, (-653.4214262971092d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 6.724968673526429E-4d + "'", double3 == 6.724968673526429E-4d);
    }

    @Test
    public void test00270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00270");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.44989714344586235d, 1.6451240016813788d, (-0.5086896265246781d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.3496190917066646d + "'", double3 == 2.3496190917066646d);
    }

    @Test
    public void test00271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00271");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.009954337617466431d), (double) 100L, (-1.4071387060023755d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 71.07327366592149d + "'", double3 == 71.07327366592149d);
    }

    @Test
    public void test00272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00272");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-6.357325234240991d), 0.010547356069728267d, 0.3580677144265516d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-17.783989825804095d) + "'", double3 == (-17.783989825804095d));
    }

    @Test
    public void test00273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00273");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0d, 0.010547356069728267d, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.NEGATIVE_INFINITY + "'", double3 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test00274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00274");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1.27096727177068d), (-4.143897996357012d), 0.1526315789473684d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 18.82264957487597d + "'", double3 == 18.82264957487597d);
    }

    @Test
    public void test00275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00275");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((double) (short) -1, 9.452903627643943d, 0.02d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-522.6451813821972d) + "'", double3 == (-522.6451813821972d));
    }

    @Test
    public void test00276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00276");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-112.57965019863204d), (-0.009748709122203098d), 0.32571822743541134d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-345.6051642422499d) + "'", double3 == (-345.6051642422499d));
    }

    @Test
    public void test00277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00277");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.037321193336271166d), (-165.75236969763668d), 46.34676267368015d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3.575547437284293d + "'", double3 == 3.575547437284293d);
    }

    @Test
    public void test00278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00278");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.8932635507964994d), 1.0d, 100.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.018932635507964993d) + "'", double3 == (-0.018932635507964993d));
    }

    @Test
    public void test00279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00279");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((double) (-1.0f), (-3.0931547619047617d), (-13.208362369337976d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.15847193644261548d) + "'", double3 == (-0.15847193644261548d));
    }

    @Test
    public void test00280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00280");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(75.83951627653596d, 0.0029255559974682515d, (-0.0028718373568427723d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-26406.993606320168d) + "'", double3 == (-26406.993606320168d));
    }

    @Test
    public void test00281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00281");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(111.88477646529707d, (double) (byte) 100, (-580.4713660041064d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.02047435439772061d) + "'", double3 == (-0.02047435439772061d));
    }

    @Test
    public void test00282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00282");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((double) 1L, 0.906825088732021d, (-2021.4566648401276d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-4.6092955089565593E-5d) + "'", double3 == (-4.6092955089565593E-5d));
    }

    @Test
    public void test00283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00283");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((double) '4', 111.88477646529707d, (-1209.3780841486393d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.049517001548323815d + "'", double3 == 0.049517001548323815d);
    }

    @Test
    public void test00284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00284");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.009748709122203098d), (-49.17055488661449d), 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test00285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00285");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0d, (double) 0L, 0.43942386224590174d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test00286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00286");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-48.56521324652172d), 3.6346762673680155d, (double) 'a');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.5381431908648426d) + "'", double3 == (-0.5381431908648426d));
    }

    @Test
    public void test00287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00287");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1.3142124542124545d, 0.0029255559974682515d, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test00288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00288");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((double) 10.0f, 0.0634074879921254d, 3.453426257781344d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.8773142294897722d + "'", double3 == 2.8773142294897722d);
    }

    @Test
    public void test00289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00289");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(51.546592831758396d, 84.45213259648938d, (-0.19468186134852805d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 169.02211401103276d + "'", double3 == 169.02211401103276d);
    }

    @Test
    public void test00290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00290");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0d, 11089.914183574241d, (-18.842339607366924d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 588.5635443720768d + "'", double3 == 588.5635443720768d);
    }

    @Test
    public void test00291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00291");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-4.027936507936508d), (-4.4999183035714285d), (double) 0L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test00292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00292");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.09722222222222221d), (-8588.49800713237d), (-0.2721311475409836d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-31559.786016838494d) + "'", double3 == (-31559.786016838494d));
    }

    @Test
    public void test00293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00293");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.03580972901448908d, (double) (byte) -1, 2.135416666666667d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.485062117001907d + "'", double3 == 0.485062117001907d);
    }

    @Test
    public void test00294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00294");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(71.07327366592149d, (-171.92101887315275d), (-17.21311475409836d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-14.116811280841457d) + "'", double3 == (-14.116811280841457d));
    }

    @Test
    public void test00295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00295");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-49.17055488661449d), 1.0d, (double) (byte) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-50.17055488661449d) + "'", double3 == (-50.17055488661449d));
    }

    @Test
    public void test00296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00296");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.007179270658916316d, (-0.004400885011325602d), (-1.0307216494845362d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.011234997999734608d) + "'", double3 == (-0.011234997999734608d));
    }

    @Test
    public void test00297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00297");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(9.9d, (-0.004400885011325602d), 71.07327366592149d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.13935478660469144d + "'", double3 == 0.13935478660469144d);
    }

    @Test
    public void test00298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00298");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.7898696145124717d), (double) (short) -1, (-26406.993606320168d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-7.957376315539241E-6d) + "'", double3 == (-7.957376315539241E-6d));
    }

    @Test
    public void test00299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00299");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0634074879921254d, 588.5635443720768d, (-28.21311475409836d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 20.85909840205065d + "'", double3 == 20.85909840205065d);
    }

    @Test
    public void test00300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00300");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.9118185305298744d, 0.1526315789473684d, 526.749700119952d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0014412669839387155d + "'", double3 == 0.0014412669839387155d);
    }

    @Test
    public void test00301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00301");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((double) (short) 100, 20.85909840205065d, (double) (byte) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test00302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00302");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(3.5d, (-13.208362369337976d), 0.01737925304935617d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 961.3970359880889d + "'", double3 == 961.3970359880889d);
    }

    @Test
    public void test00303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00303");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.01737925304935617d, 599.7651782375282d, 0.029268292682926824d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-20491.383131969695d) + "'", double3 == (-20491.383131969695d));
    }

    @Test
    public void test00304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00304");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((double) (short) -1, 0.005159774436090226d, (-48.56521324652172d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.020697114400256043d + "'", double3 == 0.020697114400256043d);
    }

    @Test
    public void test00305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00305");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.01146206392065246d, (-18.178161845656373d), 0.01737925304935617d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1046.6286357600898d + "'", double3 == 1046.6286357600898d);
    }

    @Test
    public void test00306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00306");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-117.58846188300636d), (-0.8932635507964994d), (-6.357325234240991d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 18.356021444943778d + "'", double3 == 18.356021444943778d);
    }

    @Test
    public void test00307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00307");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-13.208362369337976d), 3.453426257781344d, 0.0014412669839387155d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-11560.515027955293d) + "'", double3 == (-11560.515027955293d));
    }

    @Test
    public void test00308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00308");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(10.999836607142857d, 0.0d, 0.44989714344586235d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 24.449669813176985d + "'", double3 == 24.449669813176985d);
    }

    @Test
    public void test00309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00309");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-601.7604818022787d), (double) (short) 1, (-52.17277789640387d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 11.55316059649232d + "'", double3 == 11.55316059649232d);
    }

    @Test
    public void test00310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00310");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.010547356069728267d, 3.5d, 0.01146206392065246d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-304.4349314474631d) + "'", double3 == (-304.4349314474631d));
    }

    @Test
    public void test00311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00311");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-190.41098095896922d), (-171.92101887315275d), (double) '#');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.5282846310233278d) + "'", double3 == (-0.5282846310233278d));
    }

    @Test
    public void test00312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00312");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.010547356069728267d, (-0.09722222222222221d), (-18.87433095138013d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.005709848924953292d) + "'", double3 == (-0.005709848924953292d));
    }

    @Test
    public void test00313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00313");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-5.588504832975711d), (-0.7898696145124717d), 0.029268292682926824d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-163.95336996416071d) + "'", double3 == (-163.95336996416071d));
    }

    @Test
    public void test00314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00314");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.13935478660469144d, (-2021.4566648401276d), (-20491.383131969695d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.09865590851564983d) + "'", double3 == (-0.09865590851564983d));
    }

    @Test
    public void test00315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00315");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(5.616698045830711d, (double) 0L, (-18.87433095138013d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.29758395464714504d) + "'", double3 == (-0.29758395464714504d));
    }

    @Test
    public void test00316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00316");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((double) 10L, (-0.8932635507964994d), 169.02211401103276d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.06444874751764998d + "'", double3 == 0.06444874751764998d);
    }

    @Test
    public void test00317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00317");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.03580972901448908d, 112.25635738831615d, (-0.19468186134852805d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 576.4304228548518d + "'", double3 == 576.4304228548518d);
    }

    @Test
    public void test00318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00318");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-653.4214262971092d), (-0.0028718373568427723d), (double) 'a');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-6.736273757317035d) + "'", double3 == (-6.736273757317035d));
    }

    @Test
    public void test00319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00319");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((double) 0L, (-3.0931547619047617d), 68.33333333333334d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0452656794425087d + "'", double3 == 0.0452656794425087d);
    }

    @Test
    public void test00320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00320");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(9.961703135888502d, 11.55316059649232d, 0.019230769230769232d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-82.75578795139855d) + "'", double3 == (-82.75578795139855d));
    }

    @Test
    public void test00321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00321");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(7.298232900384636d, (-8588.49800713237d), (double) 1L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 8595.796240032754d + "'", double3 == 8595.796240032754d);
    }

    @Test
    public void test00322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00322");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-32.16059602649007d), (-2.0d), Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.0d) + "'", double3 == (-0.0d));
    }

    @Test
    public void test00323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00323");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(51.546592831758396d, 3325.4330485669584d, 3.575547437284293d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-915.6322250395841d) + "'", double3 == (-915.6322250395841d));
    }

    @Test
    public void test00324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00324");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.2721311475409836d), (-3144.743169398907d), 1.3142124542124545d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2392.665682152357d + "'", double3 == 2392.665682152357d);
    }

    @Test
    public void test00325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00325");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(5.081212852733868d, 3325.4330485669584d, (double) (short) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.NEGATIVE_INFINITY + "'", double3 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test00326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00326");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-190.41098095896922d), (-0.07589133532553058d), (-0.8932635507964994d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 213.07831205463037d + "'", double3 == 213.07831205463037d);
    }

    @Test
    public void test00327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00327");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((double) 10, (-4.4999183035714285d), 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test00328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00328");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-52.17277789640387d), 112.25635738831615d, 51.546592831758396d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-3.1899127808776044d) + "'", double3 == (-3.1899127808776044d));
    }

    @Test
    public void test00329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00329");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.1331396435040129d, Double.NaN, 0.025697295243334962d);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test00330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00330");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(11.55316059649232d, (double) 10.0f, (double) (short) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test00331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00331");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(175.0d, 0.0029268292682926825d, 0.007179270658916316d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 24375.32745104039d + "'", double3 == 24375.32745104039d);
    }

    @Test
    public void test00332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00332");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-6.813865147198482d), (-16719.06947781108d), (-75.0259680625998d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-222.75294866864752d) + "'", double3 == (-222.75294866864752d));
    }

    @Test
    public void test00333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00333");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-915.6322250395841d), (-12.057538907475166d), (-0.0d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test00334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00334");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-32.16059602649007d), (-866.3339659824051d), 0.1d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 8341.733699559149d + "'", double3 == 8341.733699559149d);
    }

    @Test
    public void test00335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00335");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.2857142857142857d), (-1.609427320082126d), (-52.17277789640387d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.025371718504164222d) + "'", double3 == (-0.025371718504164222d));
    }

    @Test
    public void test00336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00336");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.007528883973507984d, 0.3580677144265516d, 11089.914183574241d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-3.1608795582227505E-5d) + "'", double3 == (-3.1608795582227505E-5d));
    }

    @Test
    public void test00337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00337");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0014412669839387155d, 2392.665682152357d, (-31559.786016838494d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.07581370290688234d + "'", double3 == 0.07581370290688234d);
    }

    @Test
    public void test00338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00338");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-12.057538907475166d), (-0.29758395464714504d), (-201590.80145719493d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 5.833577161170763E-5d + "'", double3 == 5.833577161170763E-5d);
    }

    @Test
    public void test00339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00339");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-161.92118226600988d), 0.44989714344586235d, 0.1d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1623.7107940945573d) + "'", double3 == (-1623.7107940945573d));
    }

    @Test
    public void test00340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00340");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.029268292682926824d, 0.025697295243334962d, (-4.143897996357012d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-8.617483931146957E-4d) + "'", double3 == (-8.617483931146957E-4d));
    }

    @Test
    public void test00341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00341");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-17.783989825804095d), 0.485062117001907d, Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test00342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00342");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((double) '#', 10.0d, 11.55316059649232d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.1639100219545377d + "'", double3 == 2.1639100219545377d);
    }

    @Test
    public void test00343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00343");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(11.55316059649232d, 84.45213259648938d, 0.0016339285714285715d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-44615.7642841512d) + "'", double3 == (-44615.7642841512d));
    }

    @Test
    public void test00344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00344");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-2.151817791815755d), 3.575547437284293d, (double) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.5727365229100048d) + "'", double3 == (-0.5727365229100048d));
    }

    @Test
    public void test00345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00345");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(9.990971428571429d, (-0.7898696145124717d), (-3.0784191508581746d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-3.5020705481508303d) + "'", double3 == (-3.5020705481508303d));
    }

    @Test
    public void test00346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00346");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0d, (-82.75578795139855d), 2309.7573905377603d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.03582877937328788d + "'", double3 == 0.03582877937328788d);
    }

    @Test
    public void test00347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00347");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.0424390243902439d), 3.6346762673680155d, (double) 0L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.NEGATIVE_INFINITY + "'", double3 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test00348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00348");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-117.58846188300636d), (-0.0424390243902439d), (-2021.4566648401276d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.058149167826910875d + "'", double3 == 0.058149167826910875d);
    }

    @Test
    public void test00349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00349");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-10.491428571428573d), (double) 100L, 0.1291662100956973d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-855.4205352124766d) + "'", double3 == (-855.4205352124766d));
    }

    @Test
    public void test00350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00350");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1.27096727177068d), (-0.005709848924953292d), (-1209.3780841486393d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0010462050201086822d + "'", double3 == 0.0010462050201086822d);
    }

    @Test
    public void test00351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00351");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(6.724968673526429E-4d, 169.02211401103276d, 2309.7573905377603d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.07317714068437882d) + "'", double3 == (-0.07317714068437882d));
    }

    @Test
    public void test00352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00352");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((double) 0, 2.0d, (-14.116811280841457d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.14167505396309205d + "'", double3 == 0.14167505396309205d);
    }

    @Test
    public void test00353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00353");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0016339285714285715d, (-0.5381431908648426d), 175.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.003084440682492978d + "'", double3 == 0.003084440682492978d);
    }

    @Test
    public void test00354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00354");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(Double.POSITIVE_INFINITY, (-0.004400885011325602d), 175.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test00355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00355");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(2.1639100219545377d, 24375.32745104039d, (double) 100.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-243.73163541018437d) + "'", double3 == (-243.73163541018437d));
    }

    @Test
    public void test00356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00356");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-143.84968058754487d), (-52.17277789640387d), (-24925.365853658535d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0036780564517846265d + "'", double3 == 0.0036780564517846265d);
    }

    @Test
    public void test00357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00357");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-580.4713660041064d), 0.35444509006391633d, 9.990971428571429d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-58.13506877150787d) + "'", double3 == (-58.13506877150787d));
    }

    @Test
    public void test00358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00358");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(9.961703135888502d, (-2.151817791815755d), (-68.33333333333334d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.17727103796640375d) + "'", double3 == (-0.17727103796640375d));
    }

    @Test
    public void test00359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00359");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(9.999836607142857d, (-0.17727103796640375d), (-0.17859974514930188d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-56.98276689365725d) + "'", double3 == (-56.98276689365725d));
    }

    @Test
    public void test00360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00360");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.5381431908648426d), (-3.1899127808776044d), 0.0452656794425087d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 58.58234368006642d + "'", double3 == 58.58234368006642d);
    }

    @Test
    public void test00361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00361");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0634074879921254d, 46.34676267368015d, (-0.7898696145124717d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 58.596196556130764d + "'", double3 == 58.596196556130764d);
    }

    @Test
    public void test00362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00362");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(2.135416666666667d, (-0.09865590851564983d), 169.02211401103276d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.01321763479444169d + "'", double3 == 0.01321763479444169d);
    }

    @Test
    public void test00363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00363");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(7.298232900384636d, 213.07831205463037d, 0.32571822743541134d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-631.7732991932455d) + "'", double3 == (-631.7732991932455d));
    }

    @Test
    public void test00364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00364");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-48.56521324652172d), (-3.1899127808776044d), 51.546592831758396d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.8802773951276158d) + "'", double3 == (-0.8802773951276158d));
    }

    @Test
    public void test00365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00365");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-2021.4566648401276d), (-0.0424390243902439d), (double) (short) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-202.14142258157375d) + "'", double3 == (-202.14142258157375d));
    }

    @Test
    public void test00366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00366");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-78.77523939134471d), 0.14167505396309205d, (-8663.342809865328d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.00910929143372252d + "'", double3 == 0.00910929143372252d);
    }

    @Test
    public void test00367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00367");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-13.208362369337976d), 0.44989714344586235d, 71.07327366592149d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.1921715267680537d) + "'", double3 == (-0.1921715267680537d));
    }

    @Test
    public void test00368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00368");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1119.0111575101134d), (-6.357325234240991d), (-49.17055488661449d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 22.628457922462168d + "'", double3 == 22.628457922462168d);
    }

    @Test
    public void test00369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00369");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.025371718504164222d), 3.575547437284293d, 0.28125d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-12.803268109470071d) + "'", double3 == (-12.803268109470071d));
    }

    @Test
    public void test00370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00370");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(111.88477646529707d, (-0.16339285714285715d), (-0.2721311475409836d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-411.7432728113756d) + "'", double3 == (-411.7432728113756d));
    }

    @Test
    public void test00371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00371");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.06269659953161594d, 10.285714285714286d, 111.88477646529707d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.09137094436930399d) + "'", double3 == (-0.09137094436930399d));
    }

    @Test
    public void test00372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00372");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(3.6346762673680155d, 2.8773142294897722d, 8595.796240032754d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 8.81084214573422E-5d + "'", double3 == 8.81084214573422E-5d);
    }

    @Test
    public void test00373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00373");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.7371758664955071d), (-522.6451813821972d), 76.42112965228029d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 6.829367844867088d + "'", double3 == 6.829367844867088d);
    }

    @Test
    public void test00374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00374");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-117.58846188300636d), 0.44989714344586235d, 57.539872235017945d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-2.051418511051468d) + "'", double3 == (-2.051418511051468d));
    }

    @Test
    public void test00375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00375");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-304.4349314474631d), 2.1639100219545377d, 2.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-153.29942073470883d) + "'", double3 == (-153.29942073470883d));
    }

    @Test
    public void test00376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00376");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-18.178161845656373d), 595.4193621384683d, 0.06444874751764998d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9520.705174543298d) + "'", double3 == (-9520.705174543298d));
    }

    @Test
    public void test00377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00377");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-2.051418511051468d), (-16719.06947781108d), (double) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test00378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00378");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.01146206392065246d, (-915.6322250395841d), (-0.004400885011325602d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-208058.98921401298d) + "'", double3 == (-208058.98921401298d));
    }

    @Test
    public void test00379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00379");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(2309.7573905377603d, 498.5365853658536d, 24375.32745104039d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.07430549635937711d + "'", double3 == 0.07430549635937711d);
    }

    @Test
    public void test00380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00380");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.30711943793911006d, 0.01737925304935617d, 9.9d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.029266685342399384d + "'", double3 == 0.029266685342399384d);
    }

    @Test
    public void test00381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00381");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-2.9279365079365083d), (-6.357325234240991d), (-0.07589133532553058d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-45.18814580866656d) + "'", double3 == (-45.18814580866656d));
    }

    @Test
    public void test00382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00382");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-11560.515027955293d), 0.02d, 588.5635443720768d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-19.64194884052652d) + "'", double3 == (-19.64194884052652d));
    }

    @Test
    public void test00383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00383");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-18.178161845656373d), (double) '#', (double) 1L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-53.178161845656376d) + "'", double3 == (-53.178161845656376d));
    }

    @Test
    public void test00384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00384");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.009954337617466431d), (-161.92118226600988d), 0.01737925304935617d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 9316.35136841457d + "'", double3 == 9316.35136841457d);
    }

    @Test
    public void test00385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00385");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-10069.896224516728d), 22.628457922462168d, (-3.1899127808776044d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3163.887346055446d + "'", double3 == 3163.887346055446d);
    }

    @Test
    public void test00386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00386");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-28.21311475409836d), (-3.0931547619047617d), 0.0029255559974682515d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-8586.388369914019d) + "'", double3 == (-8586.388369914019d));
    }

    @Test
    public void test00387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00387");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0036780564517846265d, (-601.7604818022787d), (-1.609427320082126d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-373.8995556680519d) + "'", double3 == (-373.8995556680519d));
    }

    @Test
    public void test00388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00388");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.025697295243334962d, (-112.57965019863204d), 6.733333333333334d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 16.723566459486438d + "'", double3 == 16.723566459486438d);
    }

    @Test
    public void test00389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00389");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((double) 'a', 0.3580677144265516d, (-2021.4566648401276d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.047808065325613415d) + "'", double3 == (-0.047808065325613415d));
    }

    @Test
    public void test00390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00390");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-2.9279365079365083d), 14.444541589784027d, (-82.75578795139855d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.20992462917425397d + "'", double3 == 0.20992462917425397d);
    }

    @Test
    public void test00391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00391");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.1d), (-0.9d), 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test00392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00392");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(9.999836607142857d, (-6.813865147198482d), (-4.143897996357012d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-4.057460335443251d) + "'", double3 == (-4.057460335443251d));
    }

    @Test
    public void test00393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00393");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-23.538673630532d), (-4.6092955089565593E-5d), 3.575547437284293d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-6.583223394584583d) + "'", double3 == (-6.583223394584583d));
    }

    @Test
    public void test00394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00394");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-3.0784191508581746d), 0.003084440682492978d, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.NEGATIVE_INFINITY + "'", double3 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test00395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00395");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(71.07327366592149d, 14.444541589784027d, (-7.957376315539241E-6d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-7116507.983360336d) + "'", double3 == (-7116507.983360336d));
    }

    @Test
    public void test00396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00396");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(3.3839331854628965d, (-0.17859974514930188d), 6.724968673526429E-4d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 5297.471413713044d + "'", double3 == 5297.471413713044d);
    }

    @Test
    public void test00397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00397");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.007179270658916316d, 6.829367844867088d, (-3.1899127808776044d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.138675582324624d + "'", double3 == 2.138675582324624d);
    }

    @Test
    public void test00398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00398");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(595.4193621384683d, (double) 10.0f, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test00399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00399");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1321.0332618716707d), 75.83951627653596d, 0.9118185305298744d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1531.9635775952681d) + "'", double3 == (-1531.9635775952681d));
    }

    @Test
    public void test00400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00400");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.43942386224590174d, (double) 10, 9.990971428571429d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.9569215772565901d) + "'", double3 == (-0.9569215772565901d));
    }

    @Test
    public void test00401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00401");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.23007705294454095d, (double) (short) 100, 18.356021444943778d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-5.435269469819528d) + "'", double3 == (-5.435269469819528d));
    }

    @Test
    public void test00402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00402");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.0d), (-0.19468186134852805d), (-0.27451240016813794d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.7091915018384818d) + "'", double3 == (-0.7091915018384818d));
    }

    @Test
    public void test00403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00403");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-19.64194884052652d), 1.6451240016813788d, (-0.004400885011325602d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4836.99819182414d + "'", double3 == 4836.99819182414d);
    }

    @Test
    public void test00404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00404");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.17727103796640375d), (-1623.7107940945573d), (-2.263231850117096d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-717.351836035973d) + "'", double3 == (-717.351836035973d));
    }

    @Test
    public void test00405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00405");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0010462050201086822d, (-17.21311475409836d), (double) ' ');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.5379425299724522d + "'", double3 == 0.5379425299724522d);
    }

    @Test
    public void test00406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00406");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(3.3839331854628965d, 18.356021444943778d, (-631.7732991932455d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.02369851381595228d + "'", double3 == 0.02369851381595228d);
    }

    @Test
    public void test00407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00407");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.037321193336271166d), 76.42112965228029d, 1.1264499783965762d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-67.87558463488088d) + "'", double3 == (-67.87558463488088d));
    }

    @Test
    public void test00408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00408");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1.27096727177068d), (-1.02d), 5.228571428571429d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.04799920498346337d) + "'", double3 == (-0.04799920498346337d));
    }

    @Test
    public void test00409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00409");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(6.733333333333334d, 57.539872235017945d, 0.4822630255857173d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-105.35026781283747d) + "'", double3 == (-105.35026781283747d));
    }

    @Test
    public void test00410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00410");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-26406.993606320168d), 2392.665682152357d, 0.13935478660469144d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-206664.29901807886d) + "'", double3 == (-206664.29901807886d));
    }

    @Test
    public void test00411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00411");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0017132848741286434d, 10.285714285714286d, 1.1264499783965762d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.129567400301896d) + "'", double3 == (-9.129567400301896d));
    }

    @Test
    public void test00412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00412");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.3580677144265516d, (-2.388109241365902d), (-171.92101887315275d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.015973479995594054d) + "'", double3 == (-0.015973479995594054d));
    }

    @Test
    public void test00413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00413");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(3.5d, 17.807841915085817d, (-165.75236969763668d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.08632058739905799d + "'", double3 == 0.08632058739905799d);
    }

    @Test
    public void test00414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00414");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(10.028571428571428d, (-6.357325234240991d), 0.007528883973507984d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2176.404460537546d + "'", double3 == 2176.404460537546d);
    }

    @Test
    public void test00415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00415");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.6947368421052632d, (-18.842339607366924d), (-17.783989825804095d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0985766771596108d) + "'", double3 == (-1.0985766771596108d));
    }

    @Test
    public void test00416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00416");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-44615.7642841512d), (-201590.80145719493d), 5.228571428571429d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 30022.548093205085d + "'", double3 == 30022.548093205085d);
    }

    @Test
    public void test00417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00417");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-5.588504832975711d), 24375.32745104039d, 5.833577161170763E-5d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-4.1794108969975924E8d) + "'", double3 == (-4.1794108969975924E8d));
    }

    @Test
    public void test00418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00418");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(2309.7573905377603d, (-18.87433095138013d), (-31559.786016838494d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.0737847753545197d) + "'", double3 == (-0.0737847753545197d));
    }

    @Test
    public void test00419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00419");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-208058.98921401298d), (-0.5086896265246781d), 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.NEGATIVE_INFINITY + "'", double3 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test00420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00420");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(8341.733699559149d, Double.NaN, 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test00421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00421");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((double) 1.0f, (-1.1d), 0.049517001548323815d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 42.40967615841203d + "'", double3 == 42.40967615841203d);
    }

    @Test
    public void test00422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00422");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-6.813865147198482d), 132.93978337338487d, (-202.14142258157375d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.6913657118653453d + "'", double3 == 0.6913657118653453d);
    }

    @Test
    public void test00423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00423");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.16449752507649265d), 2.263231850117096d, 3.5d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.6936369643410254d) + "'", double3 == (-0.6936369643410254d));
    }

    @Test
    public void test00424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00424");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.03582877937328788d, (-0.34545264431260303d), 2309.7573905377603d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.6507423041392261E-4d + "'", double3 == 1.6507423041392261E-4d);
    }

    @Test
    public void test00425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00425");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(2309.7573905377603d, (-8.617483931146957E-4d), 9.961703135888502d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 231.86379083762387d + "'", double3 == 231.86379083762387d);
    }

    @Test
    public void test00426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00426");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(9316.35136841457d, (-0.5086896265246781d), (-3.0931547619047617d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-3012.0898484574304d) + "'", double3 == (-3012.0898484574304d));
    }

    @Test
    public void test00427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00427");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.005445821671331467d, (-32.16059602649007d), (-0.16339285714285715d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-196.86320693956702d) + "'", double3 == (-196.86320693956702d));
    }

    @Test
    public void test00428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00428");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(5297.471413713044d, 0.0014412669839387155d, (-0.02047435439772061d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-258736.8504784611d) + "'", double3 == (-258736.8504784611d));
    }

    @Test
    public void test00429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00429");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(100.0d, 0.0d, (double) 100L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test00430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00430");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-4.4999183035714285d), 34.16666666666667d, 0.28125d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-137.481191005291d) + "'", double3 == (-137.481191005291d));
    }

    @Test
    public void test00431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00431");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((double) 100, 5.616698045830711d, 498.5365853658536d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.18932071331315758d + "'", double3 == 0.18932071331315758d);
    }

    @Test
    public void test00432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00432");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(5.133109580275273E-4d, (-0.04799920498346337d), (-100.0d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-4.85125159414909E-4d) + "'", double3 == (-4.85125159414909E-4d));
    }

    @Test
    public void test00433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00433");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.485062117001907d, (-0.1d), (-8588.49800713237d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-6.812158732714832E-5d) + "'", double3 == (-6.812158732714832E-5d));
    }

    @Test
    public void test00434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00434");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.003084440682492978d, (-17.21311475409836d), (-0.004719704291657331d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-3647.7283598492904d) + "'", double3 == (-3647.7283598492904d));
    }

    @Test
    public void test00435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00435");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.5086896265246781d), (-4.143897996357012d), 0.5379425299724522d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 6.757614740032716d + "'", double3 == 6.757614740032716d);
    }

    @Test
    public void test00436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00436");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-5.588504832975711d), 14.444541589784027d, (-0.004719704291657331d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4244.555418052495d + "'", double3 == 4244.555418052495d);
    }

    @Test
    public void test00437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00437");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.0424390243902439d), (-373.8995556680519d), 0.029266685342399384d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 12774.153009464499d + "'", double3 == 12774.153009464499d);
    }

    @Test
    public void test00438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00438");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-601.7604818022787d), (-8663.342809865328d), 76.42112965228029d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 105.48891863734055d + "'", double3 == 105.48891863734055d);
    }

    @Test
    public void test00439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00439");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.17727103796640375d), (-100.0d), (-0.16449752507649265d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-606.8342299716378d) + "'", double3 == (-606.8342299716378d));
    }

    @Test
    public void test00440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00440");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-14.116811280841457d), 9.681947024916315d, 0.005978609982788297d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-3980.65074896532d) + "'", double3 == (-3980.65074896532d));
    }

    @Test
    public void test00441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00441");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1.0307216494845362d), 0.058149167826910875d, (-56.98276689365725d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.019108774049942618d + "'", double3 == 0.019108774049942618d);
    }

    @Test
    public void test00442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00442");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(24.449669813176985d, 0.0d, 0.1d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 244.49669813176985d + "'", double3 == 244.49669813176985d);
    }

    @Test
    public void test00443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00443");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.17727103796640375d), Double.POSITIVE_INFINITY, (-0.2721311475409836d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test00444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00444");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.009748709122203098d), (-20.251023116279637d), 132.93978337338487d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.15225896938846545d + "'", double3 == 0.15225896938846545d);
    }

    @Test
    public void test00445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00445");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-243.73163541018437d), 0.8362499952866399d, 0.15225896938846545d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1606.2625826757928d) + "'", double3 == (-1606.2625826757928d));
    }

    @Test
    public void test00446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00446");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(111.88477646529707d, 0.6947368421052632d, 9.681947024916315d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 11.484264408496168d + "'", double3 == 11.484264408496168d);
    }

    @Test
    public void test00447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00447");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(30022.548093205085d, 0.06269659953161594d, (-1.0d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-30022.485396605553d) + "'", double3 == (-30022.485396605553d));
    }

    @Test
    public void test00448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00448");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.0737847753545197d), 0.058149167826910875d, 34.16666666666667d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.0038614812638467486d) + "'", double3 == (-0.0038614812638467486d));
    }

    @Test
    public void test00449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00449");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.018932635507964993d), 0.007528883973507984d, 0.0017132848741286434d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-15.4449034606291d) + "'", double3 == (-15.4449034606291d));
    }

    @Test
    public void test00450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00450");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((double) (short) 10, (-13.208362369337976d), (-0.0424390243902439d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-546.8637110016421d) + "'", double3 == (-546.8637110016421d));
    }

    @Test
    public void test00451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00451");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(11.55316059649232d, 18.82264957487597d, 961.3970359880889d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.007561380684840925d) + "'", double3 == (-0.007561380684840925d));
    }

    @Test
    public void test00452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00452");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(3163.887346055446d, (-0.011234997999734608d), (-915.6322250395841d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-3.4554251090460095d) + "'", double3 == (-3.4554251090460095d));
    }

    @Test
    public void test00453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00453");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((double) 1, 0.0029255559974682515d, 0.32571822743541134d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3.061156423001374d + "'", double3 == 3.061156423001374d);
    }

    @Test
    public void test00454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00454");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.32571822743541134d, 588.5635443720768d, (double) (short) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-5.882378261446413d) + "'", double3 == (-5.882378261446413d));
    }

    @Test
    public void test00455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00455");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.1291662100956973d, (-100.0d), (-12.803268109470071d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-7.820594347784853d) + "'", double3 == (-7.820594347784853d));
    }

    @Test
    public void test00456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00456");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0d, 6.351409346550463d, 10.285714285714286d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.6174981309146284d) + "'", double3 == (-0.6174981309146284d));
    }

    @Test
    public void test00457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00457");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((double) 'a', 0.0d, 2176.404460537546d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.04456892170494916d + "'", double3 == 0.04456892170494916d);
    }

    @Test
    public void test00458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00458");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.0031500412764029324d), 0.0d, 1.6507423041392261E-4d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-19.08257435763428d) + "'", double3 == (-19.08257435763428d));
    }

    @Test
    public void test00459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00459");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0d, 0.43942386224590174d, 34.16666666666667d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.012861186212075172d) + "'", double3 == (-0.012861186212075172d));
    }

    @Test
    public void test00460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00460");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-2.151817791815755d), (-855.4205352124766d), 0.15225896938846545d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 5604.062084800248d + "'", double3 == 5604.062084800248d);
    }

    @Test
    public void test00461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00461");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.029268292682926824d, 2.8773142294897722d, (-3.4554251090460095d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.8242244722222174d + "'", double3 == 0.8242244722222174d);
    }

    @Test
    public void test00462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00462");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-855.4205352124766d), 17.071702602005715d, 0.02369851381595228d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-36816.32715833758d) + "'", double3 == (-36816.32715833758d));
    }

    @Test
    public void test00463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00463");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.7898696145124717d), (-6.812158732714832E-5d), (-1.0307216494845362d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.7662607002774456d + "'", double3 == 0.7662607002774456d);
    }

    @Test
    public void test00464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00464");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(54.71206935067825d, 3325.4330485669584d, 0.35444509006391633d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9227.722631526587d) + "'", double3 == (-9227.722631526587d));
    }

    @Test
    public void test00465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00465");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((double) 10L, (-0.6174981309146284d), 0.10594565495853255d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.2164565887138d + "'", double3 == 100.2164565887138d);
    }

    @Test
    public void test00466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00466");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((double) (short) 100, 231.86379083762387d, 5.833577161170763E-5d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-2260427.644899097d) + "'", double3 == (-2260427.644899097d));
    }

    @Test
    public void test00467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00467");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-52.17277789640387d), 0.0029268292682926825d, (-4.027936507936508d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 12.953457588734812d + "'", double3 == 12.953457588734812d);
    }

    @Test
    public void test00468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00468");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.012861186212075172d), (-9520.705174543298d), (double) (byte) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 9520.692313357085d + "'", double3 == 9520.692313357085d);
    }

    @Test
    public void test00469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00469");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.0424390243902439d), (-24925.365853658535d), (-411.7432728113756d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-60.536079301173494d) + "'", double3 == (-60.536079301173494d));
    }

    @Test
    public void test00470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00470");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(244.49669813176985d, 9.961703135888502d, (-67.87558463488088d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-3.455366112240529d) + "'", double3 == (-3.455366112240529d));
    }

    @Test
    public void test00471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00471");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-112.57965019863204d), 0.0010462050201086822d, 0.28125d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-400.2869205463187d) + "'", double3 == (-400.2869205463187d));
    }

    @Test
    public void test00472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00472");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.8802773951276158d), (-68.33333333333334d), (-190.41098095896922d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.35424982108957714d) + "'", double3 == (-0.35424982108957714d));
    }

    @Test
    public void test00473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00473");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.10594565495853255d, 0.01737925304935617d, (-3647.7283598492904d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-2.4279878645578637E-5d) + "'", double3 == (-2.4279878645578637E-5d));
    }

    @Test
    public void test00474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00474");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(10.028571428571428d, 6.351409346550463d, (-1623.7107940945573d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.0022646656629954167d) + "'", double3 == (-0.0022646656629954167d));
    }

    @Test
    public void test00475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00475");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.07317714068437882d), (-0.34545264431260303d), 2.1639100219545377d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.12582570479630809d + "'", double3 == 0.12582570479630809d);
    }

    @Test
    public void test00476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00476");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.047808065325613415d), (-4.027936507936508d), (-373.8995556680519d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.010644913539679234d) + "'", double3 == (-0.010644913539679234d));
    }

    @Test
    public void test00477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00477");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(4836.99819182414d, 0.06269659953161594d, (-0.15847193644261548d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-30522.347387205173d) + "'", double3 == (-30522.347387205173d));
    }

    @Test
    public void test00478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00478");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(9.681947024916315d, (-4.4999183035714285d), 42.21606629824469d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.33593526285222397d + "'", double3 == 0.33593526285222397d);
    }

    @Test
    public void test00479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00479");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-9.449978071646475d), (-143.84968058754487d), (double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 13.439970251589838d + "'", double3 == 13.439970251589838d);
    }

    @Test
    public void test00480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00480");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(3.061156423001374d, (-48.56521324652172d), (-5.882378261446413d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-8.77644506608603d) + "'", double3 == (-8.77644506608603d));
    }

    @Test
    public void test00481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00481");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1531.9635775952681d), 0.3580677144265516d, (-0.5282846310233278d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2900.5607116403717d + "'", double3 == 2900.5607116403717d);
    }

    @Test
    public void test00482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00482");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.06269659953161594d, 0.07430549635937711d, 2.263231850117096d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.005129344935279409d) + "'", double3 == (-0.005129344935279409d));
    }

    @Test
    public void test00483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00483");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(22.628457922462168d, (-49.17055488661449d), (-50.17055488661449d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.4310986388598355d) + "'", double3 == (-1.4310986388598355d));
    }

    @Test
    public void test00484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00484");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0d, (double) 1, 8341.733699559149d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.1987915654186478E-4d) + "'", double3 == (-1.1987915654186478E-4d));
    }

    @Test
    public void test00485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00485");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-112.57965019863204d), 0.0010462050201086822d, (-4.4999183035714285d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 25.01838673699937d + "'", double3 == 25.01838673699937d);
    }

    @Test
    public void test00486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00486");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.19468186134852805d), (double) (byte) 1, 595.4193621384683d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.0020064545047003323d) + "'", double3 == (-0.0020064545047003323d));
    }

    @Test
    public void test00487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00487");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0d, 0.23007705294454095d, (-4.85125159414909E-4d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 474.2632874824059d + "'", double3 == 474.2632874824059d);
    }

    @Test
    public void test00488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00488");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(244.49669813176985d, (-0.5086896265246781d), (-12.057538907475166d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-20.319684608805325d) + "'", double3 == (-20.319684608805325d));
    }

    @Test
    public void test00489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00489");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-631.7732991932455d), (-117.58846188300636d), 0.00910929143372252d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-56446.19464108165d) + "'", double3 == (-56446.19464108165d));
    }

    @Test
    public void test00490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00490");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.20992462917425397d, (-2.9279365079365083d), (-855.4205352124766d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.0036682088025059554d) + "'", double3 == (-0.0036682088025059554d));
    }

    @Test
    public void test00491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00491");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.9714562908496731d), 2900.5607116403717d, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.NEGATIVE_INFINITY + "'", double3 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test00492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00492");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-9.449978071646475d), 6.351409346550463d, (-1.609427320082126d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 9.818018633727817d + "'", double3 == 9.818018633727817d);
    }

    @Test
    public void test00493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00493");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1046.6286357600898d, 17.071702602005715d, (-7116507.983360336d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.4467164732553828E-4d) + "'", double3 == (-1.4467164732553828E-4d));
    }

    @Test
    public void test00494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00494");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0d, (-0.16449752507649265d), (-6.736273757317035d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.02441966152248684d) + "'", double3 == (-0.02441966152248684d));
    }

    @Test
    public void test00495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00495");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-19.08257435763428d), (-171.92101887315275d), 0.6947368421052632d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 219.99473074203414d + "'", double3 == 219.99473074203414d);
    }

    @Test
    public void test00496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00496");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.029266685342399384d, (-1.0985766771596108d), (-0.29397590361445786d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-3.8365163560519195d) + "'", double3 == (-3.8365163560519195d));
    }

    @Test
    public void test00497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00497");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(12774.153009464499d, 0.03582877937328788d, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test00498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00498");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.5282846310233278d), 6.829367844867088d, (-68.33333333333334d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.10767296306181094d + "'", double3 == 0.10767296306181094d);
    }

    @Test
    public void test00499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00499");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(11089.914183574241d, 3.061156423001374d, 5.081212852733868d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2181.9304462292166d + "'", double3 == 2181.9304462292166d);
    }

    @Test
    public void test00500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00500");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-15.4449034606291d), (-580.4713660041064d), (-36816.32715833758d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.01534717083845554d) + "'", double3 == (-0.01534717083845554d));
    }
}

