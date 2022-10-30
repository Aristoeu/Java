package DistanceFormula;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest5 {

    public static boolean debug = false;

    @Test
    public void test02501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02501");
        double[] doubleArray4 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray5 = new double[] {};
        double double7 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray4, doubleArray5, 0);
        double[] doubleArray12 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray13 = new double[] {};
        double double15 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray12, doubleArray13, 0);
        double double17 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray4, doubleArray13, (int) (short) 100);
        double[] doubleArray22 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray23 = new double[] {};
        double double25 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray22, doubleArray23, 0);
        double double27 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray4, doubleArray22, (int) (byte) 0);
        double[] doubleArray32 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray33 = new double[] {};
        double double35 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray32, doubleArray33, 0);
        double[] doubleArray40 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray41 = new double[] {};
        double double43 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray40, doubleArray41, 0);
        double double45 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray32, doubleArray41, (int) (short) 100);
        double[] doubleArray48 = new double[] { (byte) 0, 132.0d };
        double double50 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray41, doubleArray48, (int) '4');
        double[] doubleArray55 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray56 = new double[] {};
        double double58 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray55, doubleArray56, 0);
        double[] doubleArray63 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray64 = new double[] {};
        double double66 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray63, doubleArray64, 0);
        double double68 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray56, doubleArray64, (int) (byte) 1);
        double[] doubleArray73 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray74 = new double[] {};
        double double76 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray73, doubleArray74, 0);
        double[] doubleArray81 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray82 = new double[] {};
        double double84 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray81, doubleArray82, 0);
        double double86 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray73, doubleArray82, (int) (short) 100);
        double double88 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray64, doubleArray82, (int) (short) 0);
        double double90 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray41, doubleArray64, (-1));
        double double92 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray22, doubleArray41, (int) (short) 0);
        java.lang.Class<?> wildcardClass93 = doubleArray22.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[]");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-1.0d) + "'", double25 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + Double.POSITIVE_INFINITY + "'", double27 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[]");
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + (-1.0d) + "'", double35 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[]");
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + (-1.0d) + "'", double43 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + (-1.0d) + "'", double45 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[0.0, 132.0]");
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + (-1.0d) + "'", double50 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray56), "[]");
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + (-1.0d) + "'", double58 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[]");
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + (-1.0d) + "'", double66 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 0.0d + "'", double68 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray73), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray74), "[]");
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + (-1.0d) + "'", double76 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray81), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray82), "[]");
        org.junit.Assert.assertTrue("'" + double84 + "' != '" + (-1.0d) + "'", double84 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double86 + "' != '" + (-1.0d) + "'", double86 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double88 + "' != '" + 0.0d + "'", double88 == 0.0d);
        org.junit.Assert.assertTrue("'" + double90 + "' != '" + Double.POSITIVE_INFINITY + "'", double90 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double92 + "' != '" + (-1.0d) + "'", double92 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass93);
    }

    @Test
    public void test02502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02502");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(547.801229584586d, 156.99714288128257d, 524.4025725377481d, 574.8480378080076d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 35.7634867800957d + "'", double4 == 35.7634867800957d);
    }

    @Test
    public void test02503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02503");
        double[] doubleArray4 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray5 = new double[] {};
        double double7 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray4, doubleArray5, 0);
        double[] doubleArray12 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray13 = new double[] {};
        double double15 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray12, doubleArray13, 0);
        double[] doubleArray20 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray21 = new double[] {};
        double double23 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray20, doubleArray21, 0);
        double double25 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray12, doubleArray21, 1);
        double double27 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray5, doubleArray21, (int) (short) 10);
        double[] doubleArray32 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray33 = new double[] {};
        double double35 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray32, doubleArray33, 0);
        double[] doubleArray40 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray41 = new double[] {};
        double double43 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray40, doubleArray41, 0);
        double double45 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray32, doubleArray41, 1);
        double double47 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray21, doubleArray32, (int) '#');
        double[] doubleArray52 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray53 = new double[] {};
        double double55 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray52, doubleArray53, 0);
        double double57 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray21, doubleArray53, 1);
        double[] doubleArray59 = new double[] { (short) 0 };
        double[] doubleArray64 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray65 = new double[] {};
        double double67 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray64, doubleArray65, 0);
        double[] doubleArray72 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray73 = new double[] {};
        double double75 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray72, doubleArray73, 0);
        double double77 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray64, doubleArray73, (int) (short) 100);
        double double79 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray59, doubleArray64, 1);
        double double81 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray53, doubleArray59, (int) (short) 10);
        double[] doubleArray82 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double84 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray59, doubleArray82, 111);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"p2\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[]");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-1.0d) + "'", double23 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-1.0d) + "'", double25 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[]");
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + (-1.0d) + "'", double35 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[]");
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + (-1.0d) + "'", double43 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + (-1.0d) + "'", double45 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + (-1.0d) + "'", double47 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[]");
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + (-1.0d) + "'", double55 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 0.0d + "'", double57 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[0.0]");
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray65), "[]");
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + (-1.0d) + "'", double67 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray72), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray73), "[]");
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + (-1.0d) + "'", double75 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + (-1.0d) + "'", double77 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + (-1.0d) + "'", double79 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + (-1.0d) + "'", double81 == (-1.0d));
    }

    @Test
    public void test02504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02504");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(2594.4723220201163d, 513.0962710588753d, 574.2264568926857d, 811.3973280012198d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2694.5778500277124d + "'", double4 == 2694.5778500277124d);
    }

    @Test
    public void test02505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02505");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(568.8168049812173d, 149.99500012499374d, 0.0d, 460.2476947640703d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 579.0853212803646d + "'", double4 == 579.0853212803646d);
    }

    @Test
    public void test02506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02506");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(725.0283442092522d, 818.8255089349238d, 161.48391061683444d, 79.01194999030838d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 857.2744661032689d + "'", double4 == 857.2744661032689d);
    }

    @Test
    public void test02507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02507");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1414.7547259510409d, 256.7515121442339d, 1486.0106889076544d, 1200.219568479256d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1014.7240192916356d + "'", double4 == 1014.7240192916356d);
    }

    @Test
    public void test02508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02508");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(649.5045751650479d, 1159.7502235336701d, 1871.1193032415176d, 1254.822632409213d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1316.6871369520127d + "'", double4 == 1316.6871369520127d);
    }

    @Test
    public void test02509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02509");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(953.2080731355461d, 0.0d, 497.6952949381995d, 916.9319093937357d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 456.95497716611834d + "'", double4 == 456.95497716611834d);
    }

    @Test
    public void test02510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02510");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(414.02599906015445d, 1631.6742652109288d, 351.6199127515424d, 640.073700145462d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 234.50390780179015d + "'", double4 == 234.50390780179015d);
    }

    @Test
    public void test02511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02511");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1084.281502208625d, 679.1293280194403d, 879.3703982763809d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 884.0404319516844d + "'", double4 == 884.0404319516844d);
    }

    @Test
    public void test02512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02512");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(433.12475140929354d, 101.79250162264779d, 1043.0173537839164d, 659.9563710239427d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1168.0564717759175d + "'", double4 == 1168.0564717759175d);
    }

    @Test
    public void test02513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02513");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(569.6093702673131d, 547.801229584586d, (double) 100, 1318.0864281704735d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1239.8945688532006d + "'", double4 == 1239.8945688532006d);
    }

    @Test
    public void test02514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02514");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(285.1699348719751d, 162.59014554237984d, 795.7792892510216d, 614.1505664186741d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 607.4126840231867d + "'", double4 == 607.4126840231867d);
    }

    @Test
    public void test02515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02515");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(777.2918910170832d, 676.4487404919405d, 358.666116899047d, 479.33602837693195d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 513.8338591778103d + "'", double4 == 513.8338591778103d);
    }

    @Test
    public void test02516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02516");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance((double) 1L, 998.1877562866482d, 144.3969578381549d, 211.43548684318966d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 930.1492272816134d + "'", double4 == 930.1492272816134d);
    }

    @Test
    public void test02517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02517");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1193.0998956704975d, 380.6284109636399d, 937.476137726764d, 204.76001435311565d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1020.8620017552486d + "'", double4 == 1020.8620017552486d);
    }

    @Test
    public void test02518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02518");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1914.5847580681952d, 238.4437024880397d, 680.4287641198678d, 2312.1711435044044d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3307.8834349646922d + "'", double4 == 3307.8834349646922d);
    }

    @Test
    public void test02519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02519");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance((double) 0.0f, 23.896346195046025d, 916.7412550310105d, 176.5775196994847d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1069.4224285354492d + "'", double4 == 1069.4224285354492d);
    }

    @Test
    public void test02520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02520");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(667.7052720987249d, 385.69367074008187d, 419.16939749396454d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 634.2295453448422d + "'", double4 == 634.2295453448422d);
    }

    @Test
    public void test02521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02521");
        int[] intArray3 = new int[] { 1, 1, 100 };
        int[] intArray5 = new int[] { (byte) -1 };
        int int6 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray3, intArray5);
        int[] intArray10 = new int[] { 1, 1, 100 };
        int[] intArray12 = new int[] { (byte) -1 };
        int int13 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray10, intArray12);
        int[] intArray16 = new int[] { 'a', 10 };
        int int17 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray12, intArray16);
        int[] intArray21 = new int[] { (byte) 1, (short) 1, (short) -1 };
        int int22 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray12, intArray21);
        int int23 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray5, intArray12);
        int[] intArray27 = new int[] { 1, 1, 100 };
        int[] intArray29 = new int[] { (byte) -1 };
        int int30 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray27, intArray29);
        int int31 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray5, intArray27);
        int[] intArray35 = new int[] { 1, 1, 100 };
        int[] intArray37 = new int[] { (byte) -1 };
        int int38 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray35, intArray37);
        int[] intArray41 = new int[] { 'a', 10 };
        int int42 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray37, intArray41);
        int int43 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray5, intArray37);
        int[] intArray47 = new int[] { 1, 1, 100 };
        int[] intArray49 = new int[] { (byte) -1 };
        int int50 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray47, intArray49);
        int[] intArray53 = new int[] { 'a', 10 };
        int int54 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray49, intArray53);
        int[] intArray58 = new int[] { (byte) 1, (short) 1, (short) -1 };
        int int59 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray49, intArray58);
        int int60 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray37, intArray49);
        int[] intArray64 = new int[] { 1, 1, 100 };
        int[] intArray66 = new int[] { (byte) -1 };
        int int67 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray64, intArray66);
        int int68 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray37, intArray66);
        int[] intArray72 = new int[] { 1, 1, 100 };
        int[] intArray74 = new int[] { (byte) -1 };
        int int75 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray72, intArray74);
        int[] intArray79 = new int[] { 1, 1, 100 };
        int[] intArray81 = new int[] { (byte) -1 };
        int int82 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray79, intArray81);
        int[] intArray85 = new int[] { 'a', 10 };
        int int86 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray81, intArray85);
        int[] intArray90 = new int[] { (byte) 1, (short) 1, (short) -1 };
        int int91 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray81, intArray90);
        int int92 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray74, intArray81);
        int int93 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray37, intArray74);
        int[] intArray94 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int95 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray74, intArray94);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"b2\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 1, -1]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[-1]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[-1]");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray49), "[-1]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray53), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray58), "[1, 1, -1]");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(intArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray64), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray66), "[-1]");
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertNotNull(intArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray72), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray74), "[-1]");
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
        org.junit.Assert.assertNotNull(intArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray79), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray81), "[-1]");
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + (-1) + "'", int82 == (-1));
        org.junit.Assert.assertNotNull(intArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray85), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + (-1) + "'", int86 == (-1));
        org.junit.Assert.assertNotNull(intArray90);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray90), "[1, 1, -1]");
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + (-1) + "'", int91 == (-1));
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 0 + "'", int92 == 0);
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 0 + "'", int93 == 0);
    }

    @Test
    public void test02522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02522");
        double[] doubleArray0 = null;
        double[] doubleArray5 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray6 = new double[] {};
        double double8 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray5, doubleArray6, 0);
        double[] doubleArray13 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray14 = new double[] {};
        double double16 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray13, doubleArray14, 0);
        double double18 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray6, doubleArray14, (int) (byte) 1);
        double[] doubleArray23 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray24 = new double[] {};
        double double26 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray23, doubleArray24, 0);
        double[] doubleArray31 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray32 = new double[] {};
        double double34 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray31, doubleArray32, 0);
        double double36 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray24, doubleArray32, (int) (byte) 1);
        double[] doubleArray41 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray42 = new double[] {};
        double double44 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray41, doubleArray42, 0);
        double[] doubleArray49 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray50 = new double[] {};
        double double52 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray49, doubleArray50, 0);
        double double54 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray41, doubleArray50, (int) (short) 100);
        double double56 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray32, doubleArray50, (int) (short) 0);
        double double58 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray14, doubleArray50, (int) ' ');
        double[] doubleArray63 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray64 = new double[] {};
        double double66 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray63, doubleArray64, 0);
        double[] doubleArray71 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray72 = new double[] {};
        double double74 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray71, doubleArray72, 0);
        double double76 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray63, doubleArray72, (int) (short) 100);
        double[] doubleArray81 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray82 = new double[] {};
        double double84 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray81, doubleArray82, 0);
        double double86 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray63, doubleArray81, (int) (byte) 0);
        double double88 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray14, doubleArray81, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            double double90 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray0, doubleArray14, 136);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"p1\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[]");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[]");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[]");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-1.0d) + "'", double26 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[]");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + (-1.0d) + "'", double34 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[]");
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + (-1.0d) + "'", double44 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[]");
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + (-1.0d) + "'", double52 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + (-1.0d) + "'", double54 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 0.0d + "'", double56 == 0.0d);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 0.0d + "'", double58 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[]");
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + (-1.0d) + "'", double66 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray71), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray72), "[]");
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + (-1.0d) + "'", double74 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + (-1.0d) + "'", double76 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray81), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray82), "[]");
        org.junit.Assert.assertTrue("'" + double84 + "' != '" + (-1.0d) + "'", double84 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double86 + "' != '" + Double.POSITIVE_INFINITY + "'", double86 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double88 + "' != '" + (-1.0d) + "'", double88 == (-1.0d));
    }

    @Test
    public void test02523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02523");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(0.0d, 930.8856102419176d, 0.0d, 429.40594279593d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 429.40594279593d + "'", double4 == 429.40594279593d);
    }

    @Test
    public void test02524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02524");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(291.4933092840025d, 472.5109881900736d, 2212.0898829125053d, 392.4748348031439d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1923.2494552526769d + "'", double4 == 1923.2494552526769d);
    }

    @Test
    public void test02525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02525");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(235.11229898487548d, 431.87538762457024d, 457.78541965322023d, 755.7877889674128d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 546.5855220111873d + "'", double4 == 546.5855220111873d);
    }

    @Test
    public void test02526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02526");
        double[] doubleArray4 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray5 = new double[] {};
        double double7 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray4, doubleArray5, 0);
        double[] doubleArray12 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray13 = new double[] {};
        double double15 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray12, doubleArray13, 0);
        double double17 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray5, doubleArray13, (int) (byte) 1);
        double[] doubleArray22 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray23 = new double[] {};
        double double25 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray22, doubleArray23, 0);
        double[] doubleArray30 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray31 = new double[] {};
        double double33 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray30, doubleArray31, 0);
        double double35 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray22, doubleArray31, (int) (short) 100);
        double[] doubleArray40 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray41 = new double[] {};
        double double43 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray40, doubleArray41, 0);
        double double45 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray31, doubleArray40, (int) (short) 100);
        double double47 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray13, doubleArray40, (int) (byte) 10);
        double[] doubleArray52 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray53 = new double[] {};
        double double55 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray52, doubleArray53, 0);
        double[] doubleArray60 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray61 = new double[] {};
        double double63 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray60, doubleArray61, 0);
        double[] doubleArray68 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray69 = new double[] {};
        double double71 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray68, doubleArray69, 0);
        double double73 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray60, doubleArray69, 1);
        double double75 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray53, doubleArray60, (int) ' ');
        double double77 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray13, doubleArray53, 111);
        double[] doubleArray82 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray83 = new double[] {};
        double double85 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray82, doubleArray83, 0);
        double[] doubleArray91 = new double[] { 232.4213562373095d, (short) 0, 1.0f, 75.85073476263909d, (-1L) };
        double double93 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray83, doubleArray91, (int) (byte) -1);
        double double95 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray53, doubleArray91, (int) (short) -1);
        java.lang.Class<?> wildcardClass96 = doubleArray91.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[]");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-1.0d) + "'", double25 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[]");
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + (-1.0d) + "'", double33 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + (-1.0d) + "'", double35 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[]");
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + (-1.0d) + "'", double43 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + (-1.0d) + "'", double45 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + (-1.0d) + "'", double47 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[]");
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + (-1.0d) + "'", double55 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[]");
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + (-1.0d) + "'", double63 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray68), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray69), "[]");
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + (-1.0d) + "'", double71 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + (-1.0d) + "'", double73 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + (-1.0d) + "'", double75 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 0.0d + "'", double77 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray82), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray83), "[]");
        org.junit.Assert.assertTrue("'" + double85 + "' != '" + (-1.0d) + "'", double85 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray91);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray91), "[232.4213562373095, 0.0, 1.0, 75.85073476263909, -1.0]");
        org.junit.Assert.assertTrue("'" + double93 + "' != '" + (-1.0d) + "'", double93 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double95 + "' != '" + (-1.0d) + "'", double95 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass96);
    }

    @Test
    public void test02527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02527");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(676.3422283448025d, 1207.3033873692275d, 933.3689927125812d, 877.4483706677477d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 326.35324126073317d + "'", double4 == 326.35324126073317d);
    }

    @Test
    public void test02528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02528");
        int[] intArray0 = null;
        int[] intArray4 = new int[] { 1, 1, 100 };
        int[] intArray6 = new int[] { (byte) -1 };
        int int7 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray4, intArray6);
        int[] intArray11 = new int[] { 1, 1, 100 };
        int[] intArray13 = new int[] { (byte) -1 };
        int int14 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray11, intArray13);
        int[] intArray17 = new int[] { 'a', 10 };
        int int18 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray13, intArray17);
        int[] intArray22 = new int[] { (byte) 1, (short) 1, (short) -1 };
        int int23 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray13, intArray22);
        int int24 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray6, intArray13);
        int[] intArray28 = new int[] { 1, 1, 100 };
        int[] intArray30 = new int[] { (byte) -1 };
        int int31 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray28, intArray30);
        int int32 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray6, intArray28);
        int[] intArray36 = new int[] { 1, 1, 100 };
        int[] intArray38 = new int[] { (byte) -1 };
        int int39 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray36, intArray38);
        int[] intArray42 = new int[] { 'a', 10 };
        int int43 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray38, intArray42);
        int int44 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray6, intArray38);
        int[] intArray48 = new int[] { 1, 1, 100 };
        int[] intArray50 = new int[] { (byte) -1 };
        int int51 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray48, intArray50);
        int[] intArray55 = new int[] { 1, 1, 100 };
        int[] intArray57 = new int[] { (byte) -1 };
        int int58 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray55, intArray57);
        int[] intArray61 = new int[] { 'a', 10 };
        int int62 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray57, intArray61);
        int int63 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray48, intArray61);
        int int64 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray38, intArray61);
        int[] intArray68 = new int[] { (byte) -1, (short) -1, ' ' };
        int[] intArray72 = new int[] { 1, 1, 100 };
        int[] intArray74 = new int[] { (byte) -1 };
        int int75 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray72, intArray74);
        int int76 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray68, intArray72);
        int int77 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray61, intArray68);
        // The following exception was thrown during execution in test generation
        try {
            int int78 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray0, intArray68);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"b1\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[1, 1, -1]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[-1]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[-1]");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray50), "[-1]");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray55), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray57), "[-1]");
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray61), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertNotNull(intArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray68), "[-1, -1, 32]");
        org.junit.Assert.assertNotNull(intArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray72), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray74), "[-1]");
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 72 + "'", int76 == 72);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + (-1) + "'", int77 == (-1));
    }

    @Test
    public void test02529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02529");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(459.2830293219934d, 445.5565709724445d, 0.0d, 1429.1280765910471d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1073.0984655358986d + "'", double4 == 1073.0984655358986d);
    }

    @Test
    public void test02530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02530");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(0.0d, 0.0d, 274.03466457696356d, 283.2880399328444d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 394.14097853281095d + "'", double4 == 394.14097853281095d);
    }

    @Test
    public void test02531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02531");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(527.2756114119443d, 2694.5778500277124d, 1201.6280100200713d, 723.5314800386946d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2645.398768597145d + "'", double4 == 2645.398768597145d);
    }

    @Test
    public void test02532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02532");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(243.24025375080168d, 1001.7337362044342d, 548.6842561828317d, 657.2105287235684d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 514.4583823621946d + "'", double4 == 514.4583823621946d);
    }

    @Test
    public void test02533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02533");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(649.5045751650479d, 630.1930244036126d, 1420.4614059880025d, 235.15038127728056d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 875.2507257837353d + "'", double4 == 875.2507257837353d);
    }

    @Test
    public void test02534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02534");
        int[] intArray3 = new int[] { 1, 1, 100 };
        int[] intArray5 = new int[] { (byte) -1 };
        int int6 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray3, intArray5);
        int[] intArray12 = new int[] { (byte) 10, (byte) 100, ' ', (short) -1, (short) 100 };
        int int13 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray5, intArray12);
        int[] intArray17 = new int[] { 1, 1, 100 };
        int[] intArray19 = new int[] { (byte) -1 };
        int int20 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray17, intArray19);
        int[] intArray23 = new int[] { 'a', 10 };
        int int24 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray19, intArray23);
        int[] intArray28 = new int[] { 1, 1, 100 };
        int[] intArray30 = new int[] { (byte) -1 };
        int int31 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray28, intArray30);
        int[] intArray35 = new int[] { 1, 1, 100 };
        int[] intArray37 = new int[] { (byte) -1 };
        int int38 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray35, intArray37);
        int[] intArray41 = new int[] { 'a', 10 };
        int int42 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray37, intArray41);
        int[] intArray46 = new int[] { (byte) 1, (short) 1, (short) -1 };
        int int47 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray37, intArray46);
        int int48 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray30, intArray37);
        int[] intArray52 = new int[] { 1, 1, 100 };
        int[] intArray54 = new int[] { (byte) -1 };
        int int55 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray52, intArray54);
        int[] intArray58 = new int[] { 'a', 10 };
        int int59 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray54, intArray58);
        int[] intArray63 = new int[] { (byte) 1, (short) 1, (short) -1 };
        int int64 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray54, intArray63);
        int[] intArray68 = new int[] { (byte) -1, '#', (-1) };
        int int69 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray54, intArray68);
        int int70 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray37, intArray54);
        int[] intArray74 = new int[] { 1, 1, 100 };
        int[] intArray76 = new int[] { (byte) -1 };
        int int77 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray74, intArray76);
        int[] intArray80 = new int[] { 'a', 10 };
        int int81 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray76, intArray80);
        int[] intArray85 = new int[] { (byte) 1, (short) 1, (short) -1 };
        int int86 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray76, intArray85);
        int int87 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray37, intArray76);
        int int88 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray23, intArray76);
        int int89 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray12, intArray23);
        int[] intArray90 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int91 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray12, intArray90);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"b2\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[10, 100, 32, -1, 100]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[-1]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[-1]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[-1]");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[1, 1, -1]");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray52), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray54), "[-1]");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray58), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray63), "[1, 1, -1]");
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertNotNull(intArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray68), "[-1, 35, -1]");
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertNotNull(intArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray74), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray76), "[-1]");
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + (-1) + "'", int77 == (-1));
        org.junit.Assert.assertNotNull(intArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray80), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + (-1) + "'", int81 == (-1));
        org.junit.Assert.assertNotNull(intArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray85), "[1, 1, -1]");
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + (-1) + "'", int86 == (-1));
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 0 + "'", int87 == 0);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + (-1) + "'", int88 == (-1));
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + (-1) + "'", int89 == (-1));
    }

    @Test
    public void test02535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02535");
        double[] doubleArray4 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray5 = new double[] {};
        double double7 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray4, doubleArray5, 0);
        double[] doubleArray12 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray13 = new double[] {};
        double double15 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray12, doubleArray13, 0);
        double[] doubleArray20 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray21 = new double[] {};
        double double23 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray20, doubleArray21, 0);
        double double25 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray12, doubleArray21, 1);
        double double27 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray5, doubleArray12, (int) ' ');
        double[] doubleArray32 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray33 = new double[] {};
        double double35 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray32, doubleArray33, 0);
        double[] doubleArray40 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray41 = new double[] {};
        double double43 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray40, doubleArray41, 0);
        double double45 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray32, doubleArray41, (int) (short) 100);
        double[] doubleArray50 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray51 = new double[] {};
        double double53 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray50, doubleArray51, 0);
        double double55 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray32, doubleArray50, (int) (byte) 0);
        double double57 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray12, doubleArray50, (int) (short) 10);
        java.lang.Class<?> wildcardClass58 = doubleArray12.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[]");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-1.0d) + "'", double23 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-1.0d) + "'", double25 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + (-1.0d) + "'", double27 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[]");
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + (-1.0d) + "'", double35 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[]");
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + (-1.0d) + "'", double43 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + (-1.0d) + "'", double45 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[]");
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + (-1.0d) + "'", double53 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + Double.POSITIVE_INFINITY + "'", double55 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 0.0d + "'", double57 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass58);
    }

    @Test
    public void test02536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02536");
        int[] intArray3 = new int[] { 1, 1, 100 };
        int[] intArray5 = new int[] { (byte) -1 };
        int int6 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray3, intArray5);
        int[] intArray10 = new int[] { 1, 1, 100 };
        int[] intArray12 = new int[] { (byte) -1 };
        int int13 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray10, intArray12);
        int[] intArray19 = new int[] { (byte) 10, (byte) 100, ' ', (short) -1, (short) 100 };
        int int20 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray12, intArray19);
        int int21 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray3, intArray19);
        int[] intArray25 = new int[] { 1, 1, 100 };
        int[] intArray27 = new int[] { (byte) -1 };
        int int28 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray25, intArray27);
        int[] intArray31 = new int[] { 'a', 10 };
        int int32 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray27, intArray31);
        int[] intArray36 = new int[] { 1, 1, 100 };
        int[] intArray38 = new int[] { (byte) -1 };
        int int39 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray36, intArray38);
        int[] intArray43 = new int[] { 1, 1, 100 };
        int[] intArray45 = new int[] { (byte) -1 };
        int int46 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray43, intArray45);
        int[] intArray49 = new int[] { 'a', 10 };
        int int50 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray45, intArray49);
        int int51 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray36, intArray49);
        int int52 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray27, intArray36);
        int[] intArray56 = new int[] { 1, 1, 100 };
        int[] intArray58 = new int[] { (byte) -1 };
        int int59 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray56, intArray58);
        int[] intArray63 = new int[] { 1, 1, 100 };
        int[] intArray65 = new int[] { (byte) -1 };
        int int66 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray63, intArray65);
        int[] intArray69 = new int[] { 'a', 10 };
        int int70 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray65, intArray69);
        int int71 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray56, intArray69);
        int int72 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray27, intArray69);
        int[] intArray76 = new int[] { 1, 1, 100 };
        int[] intArray78 = new int[] { (byte) -1 };
        int int79 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray76, intArray78);
        int[] intArray83 = new int[] { 1, 1, 100 };
        int[] intArray85 = new int[] { (byte) -1 };
        int int86 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray83, intArray85);
        int[] intArray89 = new int[] { 'a', 10 };
        int int90 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray85, intArray89);
        int int91 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray76, intArray89);
        int int92 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray69, intArray89);
        int int93 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray3, intArray89);
        java.lang.Class<?> wildcardClass94 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 100, 32, -1, 100]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[-1]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[-1]");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray43), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray45), "[-1]");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray49), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray56), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray58), "[-1]");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray63), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray65), "[-1]");
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertNotNull(intArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray69), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-1) + "'", int72 == (-1));
        org.junit.Assert.assertNotNull(intArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray76), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray78), "[-1]");
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + (-1) + "'", int79 == (-1));
        org.junit.Assert.assertNotNull(intArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray83), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray85), "[-1]");
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + (-1) + "'", int86 == (-1));
        org.junit.Assert.assertNotNull(intArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray89), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + (-1) + "'", int90 == (-1));
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + (-1) + "'", int91 == (-1));
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 0 + "'", int92 == 0);
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + (-1) + "'", int93 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass94);
    }

    @Test
    public void test02537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02537");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1260.1990459869085d, 0.0d, 567.3730282853945d, 592.9607468427321d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1285.7867645442461d + "'", double4 == 1285.7867645442461d);
    }

    @Test
    public void test02538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02538");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(533.3857283874163d, 505.57540820504266d, 219.30999222078046d, 358.9555529423255d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 359.2623750887635d + "'", double4 == 359.2623750887635d);
    }

    @Test
    public void test02539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02539");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(423.4184263336566d, 336.9767708108019d, 326.1374322058475d, 381.70219372076156d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 105.84817372967753d + "'", double4 == 105.84817372967753d);
    }

    @Test
    public void test02540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02540");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(129.18370657668194d, 867.1622518811478d, 207.04377965738468d, 444.63020367211396d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 500.39212128973656d + "'", double4 == 500.39212128973656d);
    }

    @Test
    public void test02541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02541");
        double[] doubleArray4 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray5 = new double[] {};
        double double7 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray4, doubleArray5, 0);
        double[] doubleArray13 = new double[] { 232.4213562373095d, (short) 0, 1.0f, 75.85073476263909d, (-1L) };
        double double15 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray5, doubleArray13, (int) (byte) -1);
        double[] doubleArray20 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray21 = new double[] {};
        double double23 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray20, doubleArray21, 0);
        double[] doubleArray28 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray29 = new double[] {};
        double double31 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray28, doubleArray29, 0);
        double double33 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray20, doubleArray29, (int) (short) 100);
        double[] doubleArray38 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray39 = new double[] {};
        double double41 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray38, doubleArray39, 0);
        double double43 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray20, doubleArray38, (int) (byte) 0);
        double double45 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray13, doubleArray38, (int) (short) 100);
        java.lang.Class<?> wildcardClass46 = doubleArray38.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[232.4213562373095, 0.0, 1.0, 75.85073476263909, -1.0]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[]");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-1.0d) + "'", double23 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[]");
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + (-1.0d) + "'", double31 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + (-1.0d) + "'", double33 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[]");
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + (-1.0d) + "'", double41 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + Double.POSITIVE_INFINITY + "'", double43 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + (-1.0d) + "'", double45 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test02542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02542");
        double[] doubleArray4 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray5 = new double[] {};
        double double7 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray4, doubleArray5, 0);
        double[] doubleArray12 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray13 = new double[] {};
        double double15 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray12, doubleArray13, 0);
        double double17 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray4, doubleArray13, (int) (short) 100);
        double[] doubleArray22 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray23 = new double[] {};
        double double25 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray22, doubleArray23, 0);
        double[] doubleArray30 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray31 = new double[] {};
        double double33 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray30, doubleArray31, 0);
        double double35 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray23, doubleArray31, (int) (byte) 1);
        double double37 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray4, doubleArray23, (int) (short) -1);
        double[] doubleArray42 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray43 = new double[] {};
        double double45 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray42, doubleArray43, 0);
        double[] doubleArray50 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray51 = new double[] {};
        double double53 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray50, doubleArray51, 0);
        double double55 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray43, doubleArray51, (int) (byte) 1);
        double[] doubleArray60 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray61 = new double[] {};
        double double63 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray60, doubleArray61, 0);
        double[] doubleArray68 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray69 = new double[] {};
        double double71 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray68, doubleArray69, 0);
        double[] doubleArray76 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray77 = new double[] {};
        double double79 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray76, doubleArray77, 0);
        double double81 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray68, doubleArray77, 1);
        double double83 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray61, doubleArray77, (int) (short) 10);
        double double85 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray51, doubleArray61, (int) ' ');
        double[] doubleArray90 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray91 = new double[] {};
        double double93 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray90, doubleArray91, 0);
        double double95 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray51, doubleArray91, (-1));
        double double97 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray4, doubleArray91, 10);
        java.lang.Class<?> wildcardClass98 = doubleArray91.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[]");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-1.0d) + "'", double25 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[]");
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + (-1.0d) + "'", double33 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + (-1.0d) + "'", double37 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[]");
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + (-1.0d) + "'", double45 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[]");
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + (-1.0d) + "'", double53 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 0.0d + "'", double55 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[]");
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + (-1.0d) + "'", double63 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray68), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray69), "[]");
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + (-1.0d) + "'", double71 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray76), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray77), "[]");
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + (-1.0d) + "'", double79 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + (-1.0d) + "'", double81 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + 0.0d + "'", double83 == 0.0d);
        org.junit.Assert.assertTrue("'" + double85 + "' != '" + 0.0d + "'", double85 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray90);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray90), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray91);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray91), "[]");
        org.junit.Assert.assertTrue("'" + double93 + "' != '" + (-1.0d) + "'", double93 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double95 + "' != '" + Double.POSITIVE_INFINITY + "'", double95 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double97 + "' != '" + (-1.0d) + "'", double97 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass98);
    }

    @Test
    public void test02543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02543");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(600.4477757661662d, 564.0294948337818d, 609.9403408366832d, 836.3511286601912d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 236.09426231541696d + "'", double4 == 236.09426231541696d);
    }

    @Test
    public void test02544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02544");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(294.9318687626705d, 160.6408171889707d, 607.089723914349d, 150.5531074368993d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 322.2455649037498d + "'", double4 == 322.2455649037498d);
    }

    @Test
    public void test02545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02545");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(234.50390780179015d, 207.04377965738468d, 580.7258883643475d, 347.48157825649446d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 364.18898095086786d + "'", double4 == 364.18898095086786d);
    }

    @Test
    public void test02546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02546");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(401.85876510713194d, 433.5149692961964d, 687.8385619858715d, 423.1701731848648d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 286.77276777452346d + "'", double4 == 286.77276777452346d);
    }

    @Test
    public void test02547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02547");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(441.9662258776474d, 426.4365981979791d, 167.64104369694883d, 1695.0049382569227d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1282.715993624304d + "'", double4 == 1282.715993624304d);
    }

    @Test
    public void test02548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02548");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(433.3217325352321d, 110.73681895204965d, 459.7280589510255d, 1429.1280765910471d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 996.1563978294703d + "'", double4 == 996.1563978294703d);
    }

    @Test
    public void test02549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02549");
        double[] doubleArray4 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray5 = new double[] {};
        double double7 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray4, doubleArray5, 0);
        double[] doubleArray12 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray13 = new double[] {};
        double double15 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray12, doubleArray13, 0);
        double double17 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray4, doubleArray13, (int) (short) 100);
        double[] doubleArray20 = new double[] { (byte) 0, 132.0d };
        double double22 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray13, doubleArray20, (int) '4');
        double[] doubleArray27 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray28 = new double[] {};
        double double30 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray27, doubleArray28, 0);
        double[] doubleArray35 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray36 = new double[] {};
        double double38 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray35, doubleArray36, 0);
        double double40 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray28, doubleArray36, (int) (byte) 1);
        double[] doubleArray45 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray46 = new double[] {};
        double double48 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray45, doubleArray46, 0);
        double[] doubleArray53 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray54 = new double[] {};
        double double56 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray53, doubleArray54, 0);
        double double58 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray45, doubleArray54, (int) (short) 100);
        double double60 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray36, doubleArray54, (int) (short) 0);
        double double62 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray13, doubleArray36, (-1));
        double[] doubleArray67 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray68 = new double[] {};
        double double70 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray67, doubleArray68, 0);
        double[] doubleArray75 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray76 = new double[] {};
        double double78 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray75, doubleArray76, 0);
        double[] doubleArray83 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray84 = new double[] {};
        double double86 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray83, doubleArray84, 0);
        double double88 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray75, doubleArray84, 1);
        double double90 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray68, doubleArray75, (int) ' ');
        double double92 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray13, doubleArray68, 137);
        java.lang.Class<?> wildcardClass93 = doubleArray68.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[0.0, 132.0]");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-1.0d) + "'", double22 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[]");
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + (-1.0d) + "'", double30 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[]");
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + (-1.0d) + "'", double38 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[]");
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + (-1.0d) + "'", double48 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[]");
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + (-1.0d) + "'", double56 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + (-1.0d) + "'", double58 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 0.0d + "'", double60 == 0.0d);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + Double.POSITIVE_INFINITY + "'", double62 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray67), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray68), "[]");
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + (-1.0d) + "'", double70 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray75), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray76), "[]");
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + (-1.0d) + "'", double78 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray83), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray84), "[]");
        org.junit.Assert.assertTrue("'" + double86 + "' != '" + (-1.0d) + "'", double86 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double88 + "' != '" + (-1.0d) + "'", double88 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double90 + "' != '" + (-1.0d) + "'", double90 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double92 + "' != '" + 0.0d + "'", double92 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass93);
    }

    @Test
    public void test02550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02550");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(797.5899331206741d, 827.8241495267088d, 58.069587009010455d, 527.1382011920248d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1040.2062944463478d + "'", double4 == 1040.2062944463478d);
    }

    @Test
    public void test02551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02551");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(489.5472968394182d, 684.3898597150222d, 0.0d, 587.1125817224615d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 499.1748598007424d + "'", double4 == 499.1748598007424d);
    }

    @Test
    public void test02552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02552");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(452.9073047125782d, 680.7592365609005d, 1156.7548171637534d, 447.90514501266284d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 703.865287100714d + "'", double4 == 703.865287100714d);
    }

    @Test
    public void test02553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02553");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(308.7413345116753d, 1741.486649791941d, 1181.4133177717654d, 784.9484205212476d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1829.2102125307836d + "'", double4 == 1829.2102125307836d);
    }

    @Test
    public void test02554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02554");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(195.9916338774825d, 0.0d, 274.03466457696356d, 983.8351075302581d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1061.8781382297393d + "'", double4 == 1061.8781382297393d);
    }

    @Test
    public void test02555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02555");
        int[] intArray3 = new int[] { 1, 1, 100 };
        int[] intArray5 = new int[] { (byte) -1 };
        int int6 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray3, intArray5);
        int[] intArray10 = new int[] { 1, 1, 100 };
        int[] intArray12 = new int[] { (byte) -1 };
        int int13 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray10, intArray12);
        int[] intArray19 = new int[] { (byte) 10, (byte) 100, ' ', (short) -1, (short) 100 };
        int int20 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray12, intArray19);
        int int21 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray3, intArray19);
        int[] intArray25 = new int[] { 1, 1, 100 };
        int[] intArray27 = new int[] { (byte) -1 };
        int int28 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray25, intArray27);
        int[] intArray31 = new int[] { 'a', 10 };
        int int32 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray27, intArray31);
        int[] intArray36 = new int[] { 1, 1, 100 };
        int[] intArray38 = new int[] { (byte) -1 };
        int int39 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray36, intArray38);
        int[] intArray43 = new int[] { 1, 1, 100 };
        int[] intArray45 = new int[] { (byte) -1 };
        int int46 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray43, intArray45);
        int[] intArray49 = new int[] { 'a', 10 };
        int int50 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray45, intArray49);
        int int51 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray36, intArray49);
        int int52 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray27, intArray36);
        int int53 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray19, intArray27);
        java.lang.Class<?> wildcardClass54 = intArray27.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 100, 32, -1, 100]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[-1]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[-1]");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray43), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray45), "[-1]");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray49), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass54);
    }

    @Test
    public void test02556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02556");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(339.99517634338116d, 380.66067005174415d, 993.6335652888822d, 415.6127619444709d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 688.5904808382277d + "'", double4 == 688.5904808382277d);
    }

    @Test
    public void test02557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02557");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(194.78787162154086d, 670.8183981016402d, 627.382046416377d, 719.2055846677729d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 679.8173709335953d + "'", double4 == 679.8173709335953d);
    }

    @Test
    public void test02558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02558");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(411.63958298507504d, 394.7553821156331d, 1155.4240670859472d, 689.3330009868114d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 793.9326124997559d + "'", double4 == 793.9326124997559d);
    }

    @Test
    public void test02559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02559");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(333.87755885756354d, 816.3228889880967d, 1145.4123950228852d, 532.3985198594888d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1095.4592052939295d + "'", double4 == 1095.4592052939295d);
    }

    @Test
    public void test02560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02560");
        double[] doubleArray1 = new double[] { (short) 0 };
        double[] doubleArray6 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray7 = new double[] {};
        double double9 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray6, doubleArray7, 0);
        double[] doubleArray14 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray15 = new double[] {};
        double double17 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray14, doubleArray15, 0);
        double double19 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray6, doubleArray15, (int) (short) 100);
        double double21 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray1, doubleArray6, 1);
        double[] doubleArray26 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray27 = new double[] {};
        double double29 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray26, doubleArray27, 0);
        double[] doubleArray34 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray35 = new double[] {};
        double double37 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray34, doubleArray35, 0);
        double double39 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray26, doubleArray35, (int) (short) 100);
        double[] doubleArray44 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray45 = new double[] {};
        double double47 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray44, doubleArray45, 0);
        double[] doubleArray52 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray53 = new double[] {};
        double double55 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray52, doubleArray53, 0);
        double double57 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray45, doubleArray53, (int) (byte) 1);
        double double59 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray35, doubleArray53, 0);
        double[] doubleArray64 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray65 = new double[] {};
        double double67 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray64, doubleArray65, 0);
        double[] doubleArray72 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray73 = new double[] {};
        double double75 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray72, doubleArray73, 0);
        double double77 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray64, doubleArray73, (int) (short) 100);
        double double79 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray53, doubleArray73, (int) (short) 1);
        double double81 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray1, doubleArray53, 100);
        double[] doubleArray86 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray87 = new double[] {};
        double double89 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray86, doubleArray87, 0);
        double double91 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray1, doubleArray87, 26);
        java.lang.Class<?> wildcardClass92 = doubleArray1.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[0.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[]");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.0d) + "'", double19 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1.0d) + "'", double21 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[]");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + (-1.0d) + "'", double29 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[]");
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + (-1.0d) + "'", double37 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + (-1.0d) + "'", double39 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[]");
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + (-1.0d) + "'", double47 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[]");
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + (-1.0d) + "'", double55 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 0.0d + "'", double57 == 0.0d);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 0.0d + "'", double59 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray65), "[]");
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + (-1.0d) + "'", double67 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray72), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray73), "[]");
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + (-1.0d) + "'", double75 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + (-1.0d) + "'", double77 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + 0.0d + "'", double79 == 0.0d);
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + (-1.0d) + "'", double81 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray86), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray87);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray87), "[]");
        org.junit.Assert.assertTrue("'" + double89 + "' != '" + (-1.0d) + "'", double89 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double91 + "' != '" + (-1.0d) + "'", double91 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass92);
    }

    @Test
    public void test02561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02561");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(155.2389314063153d, 635.8266350960342d, 269.58674802344547d, 199.75445414771787d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 550.4199975654466d + "'", double4 == 550.4199975654466d);
    }

    @Test
    public void test02562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02562");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(590.7679441815164d, 728.2700485391184d, 232.4213562373095d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 690.9551656683019d + "'", double4 == 690.9551656683019d);
    }

    @Test
    public void test02563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02563");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(187.26690261190743d, 0.0d, 635.8266350960342d, 46.246738985369255d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 494.80647146949605d + "'", double4 == 494.80647146949605d);
    }

    @Test
    public void test02564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02564");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(693.024198664954d, 933.3689927125812d, 91.27801765290928d, 102.8619978699419d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1432.253175854684d + "'", double4 == 1432.253175854684d);
    }

    @Test
    public void test02565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02565");
        int[] intArray3 = new int[] { 1, 1, 100 };
        int[] intArray5 = new int[] { (byte) -1 };
        int int6 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray3, intArray5);
        int[] intArray10 = new int[] { 1, 1, 100 };
        int[] intArray12 = new int[] { (byte) -1 };
        int int13 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray10, intArray12);
        int[] intArray16 = new int[] { 'a', 10 };
        int int17 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray12, intArray16);
        int int18 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray3, intArray16);
        int[] intArray22 = new int[] { 1, 1, 100 };
        int[] intArray24 = new int[] { (byte) -1 };
        int int25 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray22, intArray24);
        int[] intArray28 = new int[] { 'a', 10 };
        int int29 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray24, intArray28);
        int[] intArray33 = new int[] { (byte) 1, (short) 1, (short) -1 };
        int int34 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray24, intArray33);
        int[] intArray38 = new int[] { (byte) -1, '#', (-1) };
        int int39 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray24, intArray38);
        int int40 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray3, intArray24);
        int[] intArray44 = new int[] { 1, 1, 100 };
        int[] intArray46 = new int[] { (byte) -1 };
        int int47 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray44, intArray46);
        int[] intArray50 = new int[] { 'a', 10 };
        int int51 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray46, intArray50);
        int[] intArray55 = new int[] { (byte) 1, (short) 1, (short) -1 };
        int int56 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray46, intArray55);
        int[] intArray60 = new int[] { (byte) -1, '#', (-1) };
        int int61 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray46, intArray60);
        int int62 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray3, intArray46);
        int[] intArray66 = new int[] { 1, 1, 100 };
        int[] intArray68 = new int[] { (byte) -1 };
        int int69 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray66, intArray68);
        int[] intArray72 = new int[] { 'a', 10 };
        int int73 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray68, intArray72);
        int[] intArray77 = new int[] { (byte) 1, (short) 1, (short) -1 };
        int int78 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray68, intArray77);
        int[] intArray82 = new int[] { (byte) -1, '#', (-1) };
        int int83 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray68, intArray82);
        int int84 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray3, intArray68);
        java.lang.Class<?> wildcardClass85 = intArray68.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[-1]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[1, 1, -1]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[-1, 35, -1]");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[-1]");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray50), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray55), "[1, 1, -1]");
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray60), "[-1, 35, -1]");
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertNotNull(intArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray66), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray68), "[-1]");
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
        org.junit.Assert.assertNotNull(intArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray72), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertNotNull(intArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray77), "[1, 1, -1]");
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
        org.junit.Assert.assertNotNull(intArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray82), "[-1, 35, -1]");
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + (-1) + "'", int83 == (-1));
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + (-1) + "'", int84 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass85);
    }

    @Test
    public void test02566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02566");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(383.8104267414643d, 1333.732083151523d, 0.0d, 245.87495653847805d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1471.6675533545094d + "'", double4 == 1471.6675533545094d);
    }

    @Test
    public void test02567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02567");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(230.1492652373609d, 250.0d, 215.05196722620533d, 651.6870125299818d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 421.80801414835054d + "'", double4 == 421.80801414835054d);
    }

    @Test
    public void test02568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02568");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(747.071354124768d, 1317.955722121542d, (double) (short) 100, 115.82660080517897d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1849.2004754411312d + "'", double4 == 1849.2004754411312d);
    }

    @Test
    public void test02569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02569");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(152.72882127449927d, 1493.8850460277881d, 2212.0898829125053d, 162.831248100459d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3390.414859565335d + "'", double4 == 3390.414859565335d);
    }

    @Test
    public void test02570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02570");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(467.41331001723336d, 561.2648143618683d, 0.0d, 1147.40972671585d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 825.1486709098094d + "'", double4 == 825.1486709098094d);
    }

    @Test
    public void test02571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02571");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance((double) 215, 637.4770430936846d, 402.9691622687067d, 836.3511286601912d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 386.8432478352133d + "'", double4 == 386.8432478352133d);
    }

    @Test
    public void test02572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02572");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(261.28660281325404d, 944.6164994332674d, 571.4354617909383d, 256.7515121442339d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 998.0138462667178d + "'", double4 == 998.0138462667178d);
    }

    @Test
    public void test02573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02573");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(661.4473008805483d, 635.8266350960342d, 527.1382011920248d, 404.2452834900107d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 290.15825338753353d + "'", double4 == 290.15825338753353d);
    }

    @Test
    public void test02574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02574");
        int[] intArray3 = new int[] { 1, 1, 100 };
        int[] intArray5 = new int[] { (byte) -1 };
        int int6 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray3, intArray5);
        int[] intArray9 = new int[] { 'a', 10 };
        int int10 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray5, intArray9);
        int[] intArray14 = new int[] { 1, 1, 100 };
        int[] intArray16 = new int[] { (byte) -1 };
        int int17 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray14, intArray16);
        int[] intArray21 = new int[] { 1, 1, 100 };
        int[] intArray23 = new int[] { (byte) -1 };
        int int24 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray21, intArray23);
        int[] intArray27 = new int[] { 'a', 10 };
        int int28 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray23, intArray27);
        int int29 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray14, intArray27);
        int int30 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray5, intArray14);
        int[] intArray34 = new int[] { 1, 1, 100 };
        int[] intArray36 = new int[] { (byte) -1 };
        int int37 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray34, intArray36);
        int[] intArray41 = new int[] { 1, 1, 100 };
        int[] intArray43 = new int[] { (byte) -1 };
        int int44 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray41, intArray43);
        int[] intArray47 = new int[] { 'a', 10 };
        int int48 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray43, intArray47);
        int int49 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray34, intArray47);
        int int50 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray5, intArray47);
        int[] intArray54 = new int[] { 1, 1, 100 };
        int[] intArray56 = new int[] { (byte) -1 };
        int int57 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray54, intArray56);
        int[] intArray61 = new int[] { 1, 1, 100 };
        int[] intArray63 = new int[] { (byte) -1 };
        int int64 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray61, intArray63);
        int[] intArray67 = new int[] { 'a', 10 };
        int int68 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray63, intArray67);
        int int69 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray54, intArray67);
        int int70 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray47, intArray67);
        int[] intArray71 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int72 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray67, intArray71);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"b2\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[-1]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[-1]");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray43), "[-1]");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray54), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray56), "[-1]");
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray61), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray63), "[-1]");
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray67), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
    }

    @Test
    public void test02575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02575");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(226.33524583965954d, 553.9155272754956d, 371.09806248951145d, 416.7932251801975d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 281.88511874515d + "'", double4 == 281.88511874515d);
    }

    @Test
    public void test02576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02576");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(609.7793622065474d, 1267.400893421706d, 1467.5281833642714d, 237.953312915854d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 934.873066853779d + "'", double4 == 934.873066853779d);
    }

    @Test
    public void test02577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02577");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(314.45377983745203d, 1631.6742652109288d, 1001.7337362044342d, 442.98025338116196d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1875.973968196749d + "'", double4 == 1875.973968196749d);
    }

    @Test
    public void test02578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02578");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(112.71645842555559d, 386.8432478352133d, 245.39699806137992d, 72.90846425408961d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 446.615323216948d + "'", double4 == 446.615323216948d);
    }

    @Test
    public void test02579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02579");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(982.2432624389727d, 1022.7280033760819d, 281.1492652373609d, 911.9139034206346d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 811.908097157059d + "'", double4 == 811.908097157059d);
    }

    @Test
    public void test02580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02580");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(580.7258883643475d, 191.32568848467787d, 704.8977144889124d, 696.4536903628047d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 169.73970236365818d + "'", double4 == 169.73970236365818d);
    }

    @Test
    public void test02581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02581");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(867.1622518811478d, 1353.448044776758d, 984.2335746468543d, 454.00499987500626d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 429.42357818286894d + "'", double4 == 429.42357818286894d);
    }

    @Test
    public void test02582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02582");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(244.13720139709324d, 1056.5692706321804d, 184.58727687869154d, 312.29438706679554d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 803.8248080837866d + "'", double4 == 803.8248080837866d);
    }

    @Test
    public void test02583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02583");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(879.9934350972535d, 275.9081445293757d, 633.8605058765781d, 905.1535286739935d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 247.41553943829052d + "'", double4 == 247.41553943829052d);
    }

    @Test
    public void test02584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02584");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(745.0022462694706d, 1251.9132124366795d, 609.9403408366832d, 670.1381944953195d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 716.8369233741474d + "'", double4 == 716.8369233741474d);
    }

    @Test
    public void test02585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02585");
        double[] doubleArray4 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray5 = new double[] {};
        double double7 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray4, doubleArray5, 0);
        double[] doubleArray12 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray13 = new double[] {};
        double double15 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray12, doubleArray13, 0);
        double double17 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray4, doubleArray13, (int) (short) 100);
        double[] doubleArray22 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray23 = new double[] {};
        double double25 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray22, doubleArray23, 0);
        double[] doubleArray30 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray31 = new double[] {};
        double double33 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray30, doubleArray31, 0);
        double double35 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray23, doubleArray31, (int) (byte) 1);
        double double37 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray13, doubleArray31, 0);
        double[] doubleArray42 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray43 = new double[] {};
        double double45 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray42, doubleArray43, 0);
        double[] doubleArray50 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray51 = new double[] {};
        double double53 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray50, doubleArray51, 0);
        double double55 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray42, doubleArray51, (int) (short) 100);
        double double57 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray31, doubleArray51, (int) (short) 1);
        double[] doubleArray62 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray63 = new double[] {};
        double double65 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray62, doubleArray63, 0);
        double[] doubleArray71 = new double[] { 232.4213562373095d, (short) 0, 1.0f, 75.85073476263909d, (-1L) };
        double double73 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray63, doubleArray71, (int) (byte) -1);
        double double75 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray51, doubleArray63, (int) (short) 1);
        double[] doubleArray80 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray81 = new double[] {};
        double double83 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray80, doubleArray81, 0);
        double[] doubleArray88 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray89 = new double[] {};
        double double91 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray88, doubleArray89, 0);
        double double93 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray81, doubleArray89, (int) (byte) 1);
        double double95 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray51, doubleArray81, 26);
        java.lang.Class<?> wildcardClass96 = doubleArray51.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[]");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-1.0d) + "'", double25 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[]");
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + (-1.0d) + "'", double33 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[]");
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + (-1.0d) + "'", double45 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[]");
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + (-1.0d) + "'", double53 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + (-1.0d) + "'", double55 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 0.0d + "'", double57 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray62), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[]");
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + (-1.0d) + "'", double65 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray71), "[232.4213562373095, 0.0, 1.0, 75.85073476263909, -1.0]");
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + (-1.0d) + "'", double73 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + 0.0d + "'", double75 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray80), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray81), "[]");
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + (-1.0d) + "'", double83 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray88);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray88), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray89), "[]");
        org.junit.Assert.assertTrue("'" + double91 + "' != '" + (-1.0d) + "'", double91 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double93 + "' != '" + 0.0d + "'", double93 == 0.0d);
        org.junit.Assert.assertTrue("'" + double95 + "' != '" + 0.0d + "'", double95 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass96);
    }

    @Test
    public void test02586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02586");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(293.96891861545134d, 86.44669753535501d, 186.15368245374606d, (double) 100L);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 221.91905402072143d + "'", double4 == 221.91905402072143d);
    }

    @Test
    public void test02587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02587");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(0.0d, 323.08444526140875d, 564.6151928723338d, 309.7418279793674d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 643.9955869586861d + "'", double4 == 643.9955869586861d);
    }

    @Test
    public void test02588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02588");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(0.0d, 1318.0864281704735d, 985.4414441655066d, 896.632439101549d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1332.3079864386434d + "'", double4 == 1332.3079864386434d);
    }

    @Test
    public void test02589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02589");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance((double) 10.0f, 533.3857283874163d, 161.69929982227998d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 685.0850282096962d + "'", double4 == 685.0850282096962d);
    }

    @Test
    public void test02590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02590");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1822.8586946789696d, 0.0d, 392.45387245704717d, 1040.2062944463478d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1630.5222277005653d + "'", double4 == 1630.5222277005653d);
    }

    @Test
    public void test02591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02591");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(580.7352867136476d, 506.64081324618246d, 1702.618724140871d, 2029.8399574577923d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2645.0825816388333d + "'", double4 == 2645.0825816388333d);
    }

    @Test
    public void test02592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02592");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1085.9203536169716d, 1253.288389373309d, 167.29384278124112d, 231.28754390542792d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1940.6273563036116d + "'", double4 == 1940.6273563036116d);
    }

    @Test
    public void test02593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02593");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1085.9203536169716d, 1580.7540211106561d, 608.7160566860049d, 468.9509167769467d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 779.9841197127514d + "'", double4 == 779.9841197127514d);
    }

    @Test
    public void test02594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02594");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(267.02682409492445d, 149.99500012499374d, 1221.248948951979d, 389.23201588782825d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 962.0155780796133d + "'", double4 == 962.0155780796133d);
    }

    @Test
    public void test02595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02595");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(833.2404484695342d, 709.5490174935603d, 132.0438729335658d, 1945.7116823361646d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1937.3592403785726d + "'", double4 == 1937.3592403785726d);
    }

    @Test
    public void test02596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02596");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(818.9571347352227d, 419.16939749396454d, 260.1892565101676d, 194.9374918584498d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 837.6288297522865d + "'", double4 == 837.6288297522865d);
    }

    @Test
    public void test02597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02597");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(2997.9260036087294d, 175.09754101316523d, 289.5392231128663d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4040.16327341831d + "'", double4 == 4040.16327341831d);
    }

    @Test
    public void test02598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02598");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(633.8490641557331d, 2312.1711435044044d, 833.2404484695342d, 692.7291040974272d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 207.9033026243436d + "'", double4 == 207.9033026243436d);
    }

    @Test
    public void test02599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02599");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1255.1514421955394d, 55.70115734375261d, 667.8612344230871d, 148.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1253.2733556974204d + "'", double4 == 1253.2733556974204d);
    }

    @Test
    public void test02600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02600");
        int[] intArray0 = null;
        int[] intArray4 = new int[] { 1, 1, 100 };
        int[] intArray6 = new int[] { (byte) -1 };
        int int7 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray4, intArray6);
        int[] intArray11 = new int[] { 1, 1, 100 };
        int[] intArray13 = new int[] { (byte) -1 };
        int int14 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray11, intArray13);
        int[] intArray18 = new int[] { 1, 1, 100 };
        int[] intArray20 = new int[] { (byte) -1 };
        int int21 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray18, intArray20);
        int[] intArray24 = new int[] { 'a', 10 };
        int int25 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray20, intArray24);
        int int26 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray11, intArray24);
        int[] intArray30 = new int[] { 1, 1, 100 };
        int[] intArray32 = new int[] { (byte) -1 };
        int int33 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray30, intArray32);
        int[] intArray36 = new int[] { 'a', 10 };
        int int37 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray32, intArray36);
        int[] intArray41 = new int[] { (byte) 1, (short) 1, (short) -1 };
        int int42 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray32, intArray41);
        int[] intArray46 = new int[] { (byte) -1, '#', (-1) };
        int int47 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray32, intArray46);
        int int48 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray11, intArray32);
        int[] intArray52 = new int[] { 1, 1, 100 };
        int[] intArray54 = new int[] { (byte) -1 };
        int int55 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray52, intArray54);
        int[] intArray58 = new int[] { 'a', 10 };
        int int59 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray54, intArray58);
        int[] intArray63 = new int[] { (byte) 1, (short) 1, (short) -1 };
        int int64 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray54, intArray63);
        int[] intArray68 = new int[] { (byte) -1, '#', (-1) };
        int int69 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray54, intArray68);
        int int70 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray11, intArray54);
        int[] intArray74 = new int[] { 1, 1, 100 };
        int[] intArray76 = new int[] { (byte) -1 };
        int int77 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray74, intArray76);
        int[] intArray80 = new int[] { 'a', 10 };
        int int81 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray76, intArray80);
        int[] intArray85 = new int[] { (byte) 1, (short) 1, (short) -1 };
        int int86 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray76, intArray85);
        int[] intArray90 = new int[] { (byte) -1, '#', (-1) };
        int int91 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray76, intArray90);
        int int92 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray11, intArray76);
        int int93 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray6, intArray76);
        // The following exception was thrown during execution in test generation
        try {
            int int94 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray0, intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"b1\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[-1]");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[1, 1, -1]");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[-1, 35, -1]");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray52), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray54), "[-1]");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray58), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray63), "[1, 1, -1]");
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertNotNull(intArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray68), "[-1, 35, -1]");
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertNotNull(intArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray74), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray76), "[-1]");
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + (-1) + "'", int77 == (-1));
        org.junit.Assert.assertNotNull(intArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray80), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + (-1) + "'", int81 == (-1));
        org.junit.Assert.assertNotNull(intArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray85), "[1, 1, -1]");
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + (-1) + "'", int86 == (-1));
        org.junit.Assert.assertNotNull(intArray90);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray90), "[-1, 35, -1]");
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + (-1) + "'", int91 == (-1));
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + (-1) + "'", int92 == (-1));
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 0 + "'", int93 == 0);
    }

    @Test
    public void test02601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02601");
        double[] doubleArray1 = new double[] { 475.90324156126127d };
        double[] doubleArray6 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray7 = new double[] {};
        double double9 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray6, doubleArray7, 0);
        double[] doubleArray14 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray15 = new double[] {};
        double double17 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray14, doubleArray15, 0);
        double double19 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray6, doubleArray15, (int) (short) 100);
        double[] doubleArray22 = new double[] { (byte) 0, 132.0d };
        double double24 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray15, doubleArray22, (int) '4');
        double[] doubleArray29 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray30 = new double[] {};
        double double32 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray29, doubleArray30, 0);
        double[] doubleArray37 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray38 = new double[] {};
        double double40 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray37, doubleArray38, 0);
        double double42 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray30, doubleArray38, (int) (byte) 1);
        double[] doubleArray47 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray48 = new double[] {};
        double double50 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray47, doubleArray48, 0);
        double[] doubleArray55 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray56 = new double[] {};
        double double58 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray55, doubleArray56, 0);
        double double60 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray47, doubleArray56, (int) (short) 100);
        double[] doubleArray65 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray66 = new double[] {};
        double double68 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray65, doubleArray66, 0);
        double double70 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray56, doubleArray65, (int) (short) 100);
        double double72 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray38, doubleArray65, (int) (byte) 10);
        double double74 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray22, doubleArray38, (int) (short) -1);
        double double76 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray1, doubleArray22, (-1));
        java.lang.Class<?> wildcardClass77 = doubleArray22.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[475.90324156126127]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[]");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.0d) + "'", double19 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[0.0, 132.0]");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-1.0d) + "'", double24 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[]");
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + (-1.0d) + "'", double32 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[]");
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + (-1.0d) + "'", double40 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[]");
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + (-1.0d) + "'", double50 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray56), "[]");
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + (-1.0d) + "'", double58 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + (-1.0d) + "'", double60 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray65), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[]");
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + (-1.0d) + "'", double68 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + (-1.0d) + "'", double70 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + (-1.0d) + "'", double72 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + (-1.0d) + "'", double74 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + (-1.0d) + "'", double76 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass77);
    }

    @Test
    public void test02602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02602");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(575.6271931406408d, 148.0d, 955.7878825142769d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 689.8324544612343d + "'", double4 == 689.8324544612343d);
    }

    @Test
    public void test02603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02603");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1348.489578160435d, 682.3932453456185d, 422.70616878417604d, 1695.0049382569227d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 988.5078734431651d + "'", double4 == 988.5078734431651d);
    }

    @Test
    public void test02604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02604");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance((double) 1L, 646.3510287776788d, 1997.1792176714437d, 159.87271607883307d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2482.6575303702894d + "'", double4 == 2482.6575303702894d);
    }

    @Test
    public void test02605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02605");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(506.93116111407437d, 918.9650879856456d, 1035.8032344689284d, 2088.1419456483327d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1698.0489310175412d + "'", double4 == 1698.0489310175412d);
    }

    @Test
    public void test02606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02606");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1510.1966252429165d, 1432.253175854684d, 322.2455649037498d, 1302.6143229318418d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1317.589913262009d + "'", double4 == 1317.589913262009d);
    }

    @Test
    public void test02607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02607");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1214.2347953862636d, 574.2264568926857d, 1014.7240192916356d, 793.3634741754175d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 465.7651970635461d + "'", double4 == 465.7651970635461d);
    }

    @Test
    public void test02608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02608");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(44.145104782617494d, 729.8843065942162d, 465.26773014275807d, 172.31541541288095d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 440.1952908849384d + "'", double4 == 440.1952908849384d);
    }

    @Test
    public void test02609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02609");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(590.7679441815164d, 59.40894017819502d, 137.03519842149686d, 336.9767708108019d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 519.8878381495481d + "'", double4 == 519.8878381495481d);
    }

    @Test
    public void test02610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02610");
        double[] doubleArray4 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray5 = new double[] {};
        double double7 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray4, doubleArray5, 0);
        double[] doubleArray12 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray13 = new double[] {};
        double double15 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray12, doubleArray13, 0);
        double[] doubleArray20 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray21 = new double[] {};
        double double23 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray20, doubleArray21, 0);
        double double25 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray12, doubleArray21, (int) (short) 100);
        double[] doubleArray30 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray31 = new double[] {};
        double double33 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray30, doubleArray31, 0);
        double double35 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray21, doubleArray30, (int) (short) 100);
        double double37 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray5, doubleArray21, (int) '4');
        double[] doubleArray42 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray43 = new double[] {};
        double double45 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray42, doubleArray43, 0);
        double[] doubleArray50 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray51 = new double[] {};
        double double53 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray50, doubleArray51, 0);
        double double55 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray42, doubleArray51, (int) (short) 100);
        double[] doubleArray60 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray61 = new double[] {};
        double double63 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray60, doubleArray61, 0);
        double[] doubleArray68 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray69 = new double[] {};
        double double71 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray68, doubleArray69, 0);
        double double73 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray61, doubleArray69, (int) (byte) 1);
        double double75 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray51, doubleArray69, 0);
        double double77 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray21, doubleArray69, (int) (byte) 10);
        java.lang.Class<?> wildcardClass78 = doubleArray21.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[]");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-1.0d) + "'", double23 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-1.0d) + "'", double25 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[]");
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + (-1.0d) + "'", double33 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + (-1.0d) + "'", double35 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[]");
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + (-1.0d) + "'", double45 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[]");
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + (-1.0d) + "'", double53 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + (-1.0d) + "'", double55 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[]");
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + (-1.0d) + "'", double63 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray68), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray69), "[]");
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + (-1.0d) + "'", double71 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + 0.0d + "'", double73 == 0.0d);
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + 0.0d + "'", double75 == 0.0d);
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 0.0d + "'", double77 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass78);
    }

    @Test
    public void test02611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02611");
        double[] doubleArray4 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray5 = new double[] {};
        double double7 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray4, doubleArray5, 0);
        double[] doubleArray12 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray13 = new double[] {};
        double double15 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray12, doubleArray13, 0);
        double[] doubleArray20 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray21 = new double[] {};
        double double23 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray20, doubleArray21, 0);
        double double25 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray12, doubleArray21, (int) (short) 100);
        double[] doubleArray30 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray31 = new double[] {};
        double double33 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray30, doubleArray31, 0);
        double double35 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray21, doubleArray30, (int) (short) 100);
        double double37 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray5, doubleArray21, (int) '4');
        double[] doubleArray42 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray43 = new double[] {};
        double double45 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray42, doubleArray43, 0);
        double[] doubleArray50 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray51 = new double[] {};
        double double53 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray50, doubleArray51, 0);
        double double55 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray42, doubleArray51, (int) (short) 100);
        double[] doubleArray60 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray61 = new double[] {};
        double double63 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray60, doubleArray61, 0);
        double[] doubleArray68 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray69 = new double[] {};
        double double71 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray68, doubleArray69, 0);
        double double73 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray61, doubleArray69, (int) (byte) 1);
        double double75 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray51, doubleArray69, 0);
        double double77 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray21, doubleArray69, (int) (byte) 10);
        java.lang.Class<?> wildcardClass78 = doubleArray69.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[]");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-1.0d) + "'", double23 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-1.0d) + "'", double25 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[]");
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + (-1.0d) + "'", double33 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + (-1.0d) + "'", double35 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[]");
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + (-1.0d) + "'", double45 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[]");
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + (-1.0d) + "'", double53 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + (-1.0d) + "'", double55 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[]");
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + (-1.0d) + "'", double63 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray68), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray69), "[]");
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + (-1.0d) + "'", double71 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + 0.0d + "'", double73 == 0.0d);
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + 0.0d + "'", double75 == 0.0d);
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 0.0d + "'", double77 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass78);
    }

    @Test
    public void test02612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02612");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(609.9293586384213d, 129.18370657668194d, 571.4354617909383d, 614.1026145771851d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 38.71945453690022d + "'", double4 == 38.71945453690022d);
    }

    @Test
    public void test02613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02613");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1878.4305121094562d, 2471.960735276367d, 922.8406127352839d, 237.953312915854d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1898.5040154974722d + "'", double4 == 1898.5040154974722d);
    }

    @Test
    public void test02614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02614");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(419.0413653100427d, 416.70416071191465d, 401.85876510713194d, 355.43448444224407d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 78.45227647258133d + "'", double4 == 78.45227647258133d);
    }

    @Test
    public void test02615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02615");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(2044.7962219626638d, 768.8357377606628d, 102.8619978699419d, 74.91343462409199d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2766.1429331391d + "'", double4 == 2766.1429331391d);
    }

    @Test
    public void test02616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02616");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(303.393281120278d, 151.66317855948952d, 283.2880399328444d, 1086.7303826351704d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 955.1724452631145d + "'", double4 == 955.1724452631145d);
    }

    @Test
    public void test02617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02617");
        int[] intArray3 = new int[] { 1, 1, 100 };
        int[] intArray5 = new int[] { (byte) -1 };
        int int6 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray3, intArray5);
        int[] intArray10 = new int[] { 1, 1, 100 };
        int[] intArray12 = new int[] { (byte) -1 };
        int int13 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray10, intArray12);
        int[] intArray16 = new int[] { 'a', 10 };
        int int17 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray12, intArray16);
        int[] intArray21 = new int[] { (byte) 1, (short) 1, (short) -1 };
        int int22 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray12, intArray21);
        int int23 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray5, intArray12);
        int[] intArray27 = new int[] { 1, 1, 100 };
        int[] intArray29 = new int[] { (byte) -1 };
        int int30 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray27, intArray29);
        int int31 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray5, intArray27);
        int[] intArray35 = new int[] { 1, 1, 100 };
        int[] intArray37 = new int[] { (byte) -1 };
        int int38 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray35, intArray37);
        int[] intArray42 = new int[] { 1, 1, 100 };
        int[] intArray44 = new int[] { (byte) -1 };
        int int45 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray42, intArray44);
        int[] intArray48 = new int[] { 'a', 10 };
        int int49 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray44, intArray48);
        int[] intArray53 = new int[] { (byte) 1, (short) 1, (short) -1 };
        int int54 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray44, intArray53);
        int int55 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray37, intArray44);
        int[] intArray59 = new int[] { 1, 1, 100 };
        int[] intArray61 = new int[] { (byte) -1 };
        int int62 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray59, intArray61);
        int[] intArray66 = new int[] { 1, 1, 100 };
        int[] intArray68 = new int[] { (byte) -1 };
        int int69 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray66, intArray68);
        int[] intArray72 = new int[] { 'a', 10 };
        int int73 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray68, intArray72);
        int[] intArray77 = new int[] { (byte) 1, (short) 1, (short) -1 };
        int int78 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray68, intArray77);
        int int79 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray61, intArray68);
        int[] intArray83 = new int[] { 1, 1, 100 };
        int[] intArray85 = new int[] { (byte) -1 };
        int int86 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray83, intArray85);
        int int87 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray68, intArray83);
        int int88 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray44, intArray68);
        int int89 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray5, intArray68);
        int[] intArray90 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int91 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray5, intArray90);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"b2\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 1, -1]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[-1]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[-1]");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[-1]");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray53), "[1, 1, -1]");
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray59), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray61), "[-1]");
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertNotNull(intArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray66), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray68), "[-1]");
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
        org.junit.Assert.assertNotNull(intArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray72), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertNotNull(intArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray77), "[1, 1, -1]");
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertNotNull(intArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray83), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray85), "[-1]");
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + (-1) + "'", int86 == (-1));
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + (-1) + "'", int87 == (-1));
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 0 + "'", int88 == 0);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 0 + "'", int89 == 0);
    }

    @Test
    public void test02618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02618");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(185.09060898709973d, 456.8791003118282d, 254.49072408390177d, 766.9683109428049d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 379.48932572777875d + "'", double4 == 379.48932572777875d);
    }

    @Test
    public void test02619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02619");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(219.30999222078046d, 293.6673919614228d, 1834.171839210729d, 465.8212726297929d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1633.5686689676313d + "'", double4 == 1633.5686689676313d);
    }

    @Test
    public void test02620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02620");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(558.0681006752535d, 1111.061838552791d, 424.55910681763555d, 1207.2793752197167d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 229.7265305245437d + "'", double4 == 229.7265305245437d);
    }

    @Test
    public void test02621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02621");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(469.82663509603424d, 484.2452832538524d, 492.67841315353076d, 285.1699348719751d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 186.06531298989373d + "'", double4 == 186.06531298989373d);
    }

    @Test
    public void test02622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02622");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(294.7641266225551d, 1898.5040154974722d, 490.25700073760834d, 670.5025714040848d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 423.5526445633491d + "'", double4 == 423.5526445633491d);
    }

    @Test
    public void test02623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02623");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(941.1476765326927d, 2963.7812627724106d, 606.1975226364846d, 1113.295503583767d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2185.4359130848516d + "'", double4 == 2185.4359130848516d);
    }

    @Test
    public void test02624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02624");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(185.09060898709973d, 811.7841946802557d, 881.5814085104663d, 434.3267617642323d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 739.7419101766809d + "'", double4 == 739.7419101766809d);
    }

    @Test
    public void test02625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02625");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(359.8788905584546d, 625.0155148874841d, 2483.9847999350486d, 879.3703982763809d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2186.7092492692327d + "'", double4 == 2186.7092492692327d);
    }

    @Test
    public void test02626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02626");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(195.86115869725893d, 1318.0864281704735d, 311.714830208365d, 1089.9135821642358d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 344.0265175173438d + "'", double4 == 344.0265175173438d);
    }

    @Test
    public void test02627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02627");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(579.6591966111972d, 180.85664895471237d, 236.09426231541696d, 1405.4091582399142d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 894.371211079321d + "'", double4 == 894.371211079321d);
    }

    @Test
    public void test02628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02628");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(406.6144590385233d, 629.6281185279596d, 200.90336088855406d, 791.3427433400091d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 367.4257229620187d + "'", double4 == 367.4257229620187d);
    }

    @Test
    public void test02629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02629");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(957.5562404372337d, 1307.973287223694d, 1317.589913262009d, 576.0783876630139d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1091.9285723854555d + "'", double4 == 1091.9285723854555d);
    }

    @Test
    public void test02630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02630");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(401.22409534707685d, 1188.1697342114403d, 413.8437306383785d, 621.6515574452047d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 220.78840830511703d + "'", double4 == 220.78840830511703d);
    }

    @Test
    public void test02631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02631");
        int[] intArray3 = new int[] { 1, 1, 100 };
        int[] intArray5 = new int[] { (byte) -1 };
        int int6 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray3, intArray5);
        int[] intArray10 = new int[] { 1, 1, 100 };
        int[] intArray12 = new int[] { (byte) -1 };
        int int13 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray10, intArray12);
        int[] intArray16 = new int[] { 'a', 10 };
        int int17 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray12, intArray16);
        int[] intArray21 = new int[] { (byte) 1, (short) 1, (short) -1 };
        int int22 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray12, intArray21);
        int int23 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray5, intArray12);
        int[] intArray27 = new int[] { 1, 1, 100 };
        int[] intArray29 = new int[] { (byte) -1 };
        int int30 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray27, intArray29);
        int int31 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray5, intArray27);
        int[] intArray35 = new int[] { 1, 1, 100 };
        int[] intArray37 = new int[] { (byte) -1 };
        int int38 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray35, intArray37);
        int[] intArray41 = new int[] { 'a', 10 };
        int int42 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray37, intArray41);
        int[] intArray46 = new int[] { 1, 1, 100 };
        int[] intArray48 = new int[] { (byte) -1 };
        int int49 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray46, intArray48);
        int[] intArray53 = new int[] { 1, 1, 100 };
        int[] intArray55 = new int[] { (byte) -1 };
        int int56 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray53, intArray55);
        int[] intArray59 = new int[] { 'a', 10 };
        int int60 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray55, intArray59);
        int int61 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray46, intArray59);
        int int62 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray37, intArray46);
        int int63 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray27, intArray37);
        int[] intArray67 = new int[] { 1, 1, 100 };
        int[] intArray69 = new int[] { (byte) -1 };
        int int70 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray67, intArray69);
        int[] intArray73 = new int[] { 'a', 10 };
        int int74 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray69, intArray73);
        int[] intArray78 = new int[] { (byte) 1, (short) 1, (short) -1 };
        int int79 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray69, intArray78);
        int[] intArray83 = new int[] { (byte) -1, '#', (-1) };
        int int84 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray69, intArray83);
        int int85 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray27, intArray69);
        int[] intArray86 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int87 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray27, intArray86);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"b2\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 1, -1]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[-1]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[-1]");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[-1]");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray53), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray55), "[-1]");
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray59), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray67), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray69), "[-1]");
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertNotNull(intArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray73), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
        org.junit.Assert.assertNotNull(intArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray78), "[1, 1, -1]");
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + (-1) + "'", int79 == (-1));
        org.junit.Assert.assertNotNull(intArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray83), "[-1, 35, -1]");
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + (-1) + "'", int84 == (-1));
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + (-1) + "'", int85 == (-1));
    }

    @Test
    public void test02632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02632");
        double[] doubleArray0 = null;
        double[] doubleArray5 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray6 = new double[] {};
        double double8 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray5, doubleArray6, 0);
        double[] doubleArray13 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray14 = new double[] {};
        double double16 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray13, doubleArray14, 0);
        double double18 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray5, doubleArray14, 1);
        double[] doubleArray23 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray24 = new double[] {};
        double double26 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray23, doubleArray24, 0);
        double[] doubleArray31 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray32 = new double[] {};
        double double34 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray31, doubleArray32, 0);
        double double36 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray24, doubleArray32, (int) (byte) 1);
        double[] doubleArray41 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray42 = new double[] {};
        double double44 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray41, doubleArray42, 0);
        double[] doubleArray49 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray50 = new double[] {};
        double double52 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray49, doubleArray50, 0);
        double double54 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray42, doubleArray50, (int) (byte) 1);
        double double56 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray24, doubleArray42, (int) (short) 0);
        double double58 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray14, doubleArray24, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            double double60 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray0, doubleArray14, 72);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"p1\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[]");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[]");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.0d) + "'", double18 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[]");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-1.0d) + "'", double26 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[]");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + (-1.0d) + "'", double34 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[]");
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + (-1.0d) + "'", double44 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[]");
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + (-1.0d) + "'", double52 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 0.0d + "'", double54 == 0.0d);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 0.0d + "'", double56 == 0.0d);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 0.0d + "'", double58 == 0.0d);
    }

    @Test
    public void test02633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02633");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(256.5675697232512d, 1383.9518231925686d, 759.4458766521755d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1886.8301301214929d + "'", double4 == 1886.8301301214929d);
    }

    @Test
    public void test02634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02634");
        double[] doubleArray4 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray5 = new double[] {};
        double double7 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray4, doubleArray5, 0);
        double[] doubleArray12 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray13 = new double[] {};
        double double15 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray12, doubleArray13, 0);
        double[] doubleArray20 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray21 = new double[] {};
        double double23 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray20, doubleArray21, 0);
        double double25 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray12, doubleArray21, 1);
        double double27 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray5, doubleArray12, (int) ' ');
        double[] doubleArray32 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray33 = new double[] {};
        double double35 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray32, doubleArray33, 0);
        double[] doubleArray40 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray41 = new double[] {};
        double double43 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray40, doubleArray41, 0);
        double double45 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray32, doubleArray41, (int) (short) 100);
        double[] doubleArray50 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray51 = new double[] {};
        double double53 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray50, doubleArray51, 0);
        double double55 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray32, doubleArray50, (int) (byte) 0);
        double double57 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray12, doubleArray50, (int) (short) 10);
        double[] doubleArray62 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray63 = new double[] {};
        double double65 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray62, doubleArray63, 0);
        double double67 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray12, doubleArray63, 10);
        java.lang.Class<?> wildcardClass68 = doubleArray63.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[]");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-1.0d) + "'", double23 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-1.0d) + "'", double25 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + (-1.0d) + "'", double27 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[]");
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + (-1.0d) + "'", double35 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[]");
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + (-1.0d) + "'", double43 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + (-1.0d) + "'", double45 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[]");
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + (-1.0d) + "'", double53 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + Double.POSITIVE_INFINITY + "'", double55 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 0.0d + "'", double57 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray62), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[]");
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + (-1.0d) + "'", double65 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + (-1.0d) + "'", double67 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass68);
    }

    @Test
    public void test02635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02635");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance((double) (byte) 100, 0.0d, 309.189347980773d, 36.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 245.189347980773d + "'", double4 == 245.189347980773d);
    }

    @Test
    public void test02636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02636");
        int[] intArray3 = new int[] { 1, 1, 100 };
        int[] intArray5 = new int[] { (byte) -1 };
        int int6 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray3, intArray5);
        int[] intArray10 = new int[] { 1, 1, 100 };
        int[] intArray12 = new int[] { (byte) -1 };
        int int13 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray10, intArray12);
        int[] intArray16 = new int[] { 'a', 10 };
        int int17 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray12, intArray16);
        int[] intArray21 = new int[] { (byte) 1, (short) 1, (short) -1 };
        int int22 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray12, intArray21);
        int int23 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray5, intArray12);
        int[] intArray27 = new int[] { 1, 1, 100 };
        int[] intArray29 = new int[] { (byte) -1 };
        int int30 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray27, intArray29);
        int int31 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray5, intArray27);
        int[] intArray35 = new int[] { 1, 1, 100 };
        int[] intArray37 = new int[] { (byte) -1 };
        int int38 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray35, intArray37);
        int[] intArray41 = new int[] { 'a', 10 };
        int int42 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray37, intArray41);
        int[] intArray46 = new int[] { 1, 1, 100 };
        int[] intArray48 = new int[] { (byte) -1 };
        int int49 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray46, intArray48);
        int[] intArray53 = new int[] { 1, 1, 100 };
        int[] intArray55 = new int[] { (byte) -1 };
        int int56 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray53, intArray55);
        int[] intArray59 = new int[] { 'a', 10 };
        int int60 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray55, intArray59);
        int int61 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray46, intArray59);
        int int62 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray37, intArray46);
        int int63 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray27, intArray37);
        int[] intArray67 = new int[] { 1, 1, 100 };
        int[] intArray69 = new int[] { (byte) -1 };
        int int70 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray67, intArray69);
        int[] intArray73 = new int[] { 'a', 10 };
        int int74 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray69, intArray73);
        int[] intArray78 = new int[] { (byte) 1, (short) 1, (short) -1 };
        int int79 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray69, intArray78);
        int[] intArray83 = new int[] { (byte) -1, '#', (-1) };
        int int84 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray69, intArray83);
        int int85 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray27, intArray69);
        java.lang.Class<?> wildcardClass86 = intArray27.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 1, -1]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[-1]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[-1]");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[-1]");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray53), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray55), "[-1]");
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray59), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray67), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray69), "[-1]");
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertNotNull(intArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray73), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
        org.junit.Assert.assertNotNull(intArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray78), "[1, 1, -1]");
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + (-1) + "'", int79 == (-1));
        org.junit.Assert.assertNotNull(intArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray83), "[-1, 35, -1]");
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + (-1) + "'", int84 == (-1));
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + (-1) + "'", int85 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass86);
    }

    @Test
    public void test02637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02637");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(235.09139141013205d, 429.42357818286894d, 412.7484808105533d, 60.315077373544014d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 546.7655902097462d + "'", double4 == 546.7655902097462d);
    }

    @Test
    public void test02638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02638");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1022.7280033760819d, 258.891505624066d, 1056.5692706321804d, 384.57813099055943d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 639.0465483790342d + "'", double4 == 639.0465483790342d);
    }

    @Test
    public void test02639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02639");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(538.8680053645919d, 0.0d, 376.3509022513544d, 508.76819606974647d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 165.2809950475394d + "'", double4 == 165.2809950475394d);
    }

    @Test
    public void test02640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02640");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1383.9518231925686d, 1082.4838795872572d, 0.0d, 284.0384066340601d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2182.3972961457657d + "'", double4 == 2182.3972961457657d);
    }

    @Test
    public void test02641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02641");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(568.8137394967453d, 0.0d, 195.8747027899148d, 565.9850962978414d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 372.94976380494643d + "'", double4 == 372.94976380494643d);
    }

    @Test
    public void test02642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02642");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1002.6348330943177d, 962.0155780796133d, 1193.0998956704975d, (double) '4');
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 969.5274756057248d + "'", double4 == 969.5274756057248d);
    }

    @Test
    public void test02643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02643");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1207.3033873692275d, 621.6515574452047d, (double) (short) 100, 287.6841281443828d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1439.3819415348441d + "'", double4 == 1439.3819415348441d);
    }

    @Test
    public void test02644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02644");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(718.8891071340651d, 1099.7439959970745d, 690.3361644802496d, 936.0649003385682d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 192.23203831232172d + "'", double4 == 192.23203831232172d);
    }

    @Test
    public void test02645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02645");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(460.51094068065646d, (double) 72, 716.8369233741474d, 1357.430063107238d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1541.756045800729d + "'", double4 == 1541.756045800729d);
    }

    @Test
    public void test02646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02646");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(679.9856732867083d, 787.5043799554695d, 1040.2062944463478d, 688.5904808382277d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 360.32338062029106d + "'", double4 == 360.32338062029106d);
    }

    @Test
    public void test02647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02647");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1026.9846974953555d, 1030.529719285076d, 2766.1429331391d, 176.5775196994847d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1935.940013702439d + "'", double4 == 1935.940013702439d);
    }

    @Test
    public void test02648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02648");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1098.3417464932243d, 393.60755379174935d, 874.1663920834051d, 417.28295470017156d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 247.8507553182414d + "'", double4 == 247.8507553182414d);
    }

    @Test
    public void test02649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02649");
        int[] intArray3 = new int[] { 1, 1, 100 };
        int[] intArray5 = new int[] { (byte) -1 };
        int int6 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray3, intArray5);
        int[] intArray10 = new int[] { 1, 1, 100 };
        int[] intArray12 = new int[] { (byte) -1 };
        int int13 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray10, intArray12);
        int[] intArray16 = new int[] { 'a', 10 };
        int int17 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray12, intArray16);
        int[] intArray21 = new int[] { (byte) 1, (short) 1, (short) -1 };
        int int22 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray12, intArray21);
        int int23 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray5, intArray12);
        int[] intArray27 = new int[] { 1, 1, 100 };
        int[] intArray29 = new int[] { (byte) -1 };
        int int30 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray27, intArray29);
        int int31 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray5, intArray27);
        int[] intArray35 = new int[] { 1, 1, 100 };
        int[] intArray37 = new int[] { (byte) -1 };
        int int38 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray35, intArray37);
        int[] intArray41 = new int[] { 'a', 10 };
        int int42 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray37, intArray41);
        int int43 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray5, intArray37);
        int[] intArray47 = new int[] { 1, 1, 100 };
        int[] intArray49 = new int[] { (byte) -1 };
        int int50 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray47, intArray49);
        int[] intArray54 = new int[] { 1, 1, 100 };
        int[] intArray56 = new int[] { (byte) -1 };
        int int57 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray54, intArray56);
        int[] intArray60 = new int[] { 'a', 10 };
        int int61 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray56, intArray60);
        int int62 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray47, intArray60);
        int int63 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray37, intArray60);
        int[] intArray67 = new int[] { 1, 1, 100 };
        int[] intArray69 = new int[] { (byte) -1 };
        int int70 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray67, intArray69);
        int[] intArray73 = new int[] { 'a', 10 };
        int int74 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray69, intArray73);
        int int75 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray60, intArray73);
        java.lang.Class<?> wildcardClass76 = intArray73.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 1, -1]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[-1]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[-1]");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray49), "[-1]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray54), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray56), "[-1]");
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray60), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray67), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray69), "[-1]");
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertNotNull(intArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray73), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertNotNull(wildcardClass76);
    }

    @Test
    public void test02650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02650");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(464.76819606974647d, 404.2841760032792d, 842.4929866611079d, 1089.5137394711123d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 730.0568549278582d + "'", double4 == 730.0568549278582d);
    }

    @Test
    public void test02651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02651");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(277.1976496143225d, 338.19105883602975d, 930.1492272816134d, 58.069587009010455d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 933.0730494943102d + "'", double4 == 933.0730494943102d);
    }

    @Test
    public void test02652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02652");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(609.9293586384213d, 314.7784247541758d, 720.0966189919977d, 982.2432624389727d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 777.6320980383734d + "'", double4 == 777.6320980383734d);
    }

    @Test
    public void test02653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02653");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(3390.414859565335d, 128.12503722077693d, 300.6862160574688d, 1109.648630442865d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4071.2522367299543d + "'", double4 == 4071.2522367299543d);
    }

    @Test
    public void test02654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02654");
        double[] doubleArray0 = null;
        double[] doubleArray5 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray6 = new double[] {};
        double double8 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray5, doubleArray6, 0);
        double[] doubleArray13 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray14 = new double[] {};
        double double16 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray13, doubleArray14, 0);
        double double18 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray5, doubleArray14, (int) (short) 100);
        double[] doubleArray23 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray24 = new double[] {};
        double double26 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray23, doubleArray24, 0);
        double double28 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray14, doubleArray23, (int) (short) 100);
        double[] doubleArray33 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray34 = new double[] {};
        double double36 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray33, doubleArray34, 0);
        double[] doubleArray42 = new double[] { 232.4213562373095d, (short) 0, 1.0f, 75.85073476263909d, (-1L) };
        double double44 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray34, doubleArray42, (int) (byte) -1);
        double double46 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray23, doubleArray42, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            double double48 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray0, doubleArray42, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"p1\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[]");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[]");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.0d) + "'", double18 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[]");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-1.0d) + "'", double26 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + (-1.0d) + "'", double28 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[]");
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + (-1.0d) + "'", double36 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[232.4213562373095, 0.0, 1.0, 75.85073476263909, -1.0]");
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + (-1.0d) + "'", double44 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + (-1.0d) + "'", double46 == (-1.0d));
    }

    @Test
    public void test02655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02655");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(904.1388326818795d, 1188.1697342114403d, 953.5446166253988d, 494.80647146949605d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 742.7690466854635d + "'", double4 == 742.7690466854635d);
    }

    @Test
    public void test02656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02656");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1200.219568479256d, 912.3200508707025d, 357.7676884230674d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1754.771930926891d + "'", double4 == 1754.771930926891d);
    }

    @Test
    public void test02657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02657");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(504.0523441952501d, 604.4664943211609d, 1519.4960091305277d, 256.5675697232512d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1363.3425895331873d + "'", double4 == 1363.3425895331873d);
    }

    @Test
    public void test02658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02658");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(0.0d, 137.42302032977943d, 322.19732825436046d, 533.3857283874163d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 718.1600363119974d + "'", double4 == 718.1600363119974d);
    }

    @Test
    public void test02659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02659");
        int[] intArray3 = new int[] { 1, 1, 100 };
        int[] intArray5 = new int[] { (byte) -1 };
        int int6 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray3, intArray5);
        int[] intArray10 = new int[] { 1, 1, 100 };
        int[] intArray12 = new int[] { (byte) -1 };
        int int13 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray10, intArray12);
        int[] intArray16 = new int[] { 'a', 10 };
        int int17 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray12, intArray16);
        int int18 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray3, intArray16);
        int[] intArray22 = new int[] { 1, 1, 100 };
        int[] intArray24 = new int[] { (byte) -1 };
        int int25 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray22, intArray24);
        int[] intArray28 = new int[] { 'a', 10 };
        int int29 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray24, intArray28);
        int[] intArray33 = new int[] { (byte) 1, (short) 1, (short) -1 };
        int int34 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray24, intArray33);
        int[] intArray38 = new int[] { (byte) -1, '#', (-1) };
        int int39 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray24, intArray38);
        int int40 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray3, intArray24);
        java.lang.Class<?> wildcardClass41 = intArray24.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[-1]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[1, 1, -1]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[-1, 35, -1]");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test02660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02660");
        int[] intArray3 = new int[] { 1, 1, 100 };
        int[] intArray5 = new int[] { (byte) -1 };
        int int6 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray3, intArray5);
        int[] intArray12 = new int[] { (byte) 10, (byte) 100, ' ', (short) -1, (short) 100 };
        int int13 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray5, intArray12);
        int[] intArray17 = new int[] { 1, 1, 100 };
        int[] intArray19 = new int[] { (byte) -1 };
        int int20 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray17, intArray19);
        int[] intArray23 = new int[] { 'a', 10 };
        int int24 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray19, intArray23);
        int[] intArray28 = new int[] { 1, 1, 100 };
        int[] intArray30 = new int[] { (byte) -1 };
        int int31 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray28, intArray30);
        int[] intArray35 = new int[] { 1, 1, 100 };
        int[] intArray37 = new int[] { (byte) -1 };
        int int38 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray35, intArray37);
        int[] intArray41 = new int[] { 'a', 10 };
        int int42 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray37, intArray41);
        int[] intArray46 = new int[] { (byte) 1, (short) 1, (short) -1 };
        int int47 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray37, intArray46);
        int int48 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray30, intArray37);
        int[] intArray52 = new int[] { 1, 1, 100 };
        int[] intArray54 = new int[] { (byte) -1 };
        int int55 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray52, intArray54);
        int[] intArray58 = new int[] { 'a', 10 };
        int int59 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray54, intArray58);
        int[] intArray63 = new int[] { (byte) 1, (short) 1, (short) -1 };
        int int64 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray54, intArray63);
        int[] intArray68 = new int[] { (byte) -1, '#', (-1) };
        int int69 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray54, intArray68);
        int int70 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray37, intArray54);
        int[] intArray74 = new int[] { 1, 1, 100 };
        int[] intArray76 = new int[] { (byte) -1 };
        int int77 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray74, intArray76);
        int[] intArray80 = new int[] { 'a', 10 };
        int int81 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray76, intArray80);
        int[] intArray85 = new int[] { (byte) 1, (short) 1, (short) -1 };
        int int86 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray76, intArray85);
        int int87 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray37, intArray76);
        int int88 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray23, intArray76);
        int int89 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray12, intArray23);
        java.lang.Class<?> wildcardClass90 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[10, 100, 32, -1, 100]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[-1]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[-1]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[-1]");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[1, 1, -1]");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray52), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray54), "[-1]");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray58), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray63), "[1, 1, -1]");
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertNotNull(intArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray68), "[-1, 35, -1]");
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertNotNull(intArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray74), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray76), "[-1]");
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + (-1) + "'", int77 == (-1));
        org.junit.Assert.assertNotNull(intArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray80), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + (-1) + "'", int81 == (-1));
        org.junit.Assert.assertNotNull(intArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray85), "[1, 1, -1]");
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + (-1) + "'", int86 == (-1));
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 0 + "'", int87 == 0);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + (-1) + "'", int88 == (-1));
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + (-1) + "'", int89 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass90);
    }

    @Test
    public void test02661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02661");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(704.5294709279362d, 324.87536071545964d, 761.6521423750089d, 460.63617381552586d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 250.49339306579066d + "'", double4 == 250.49339306579066d);
    }

    @Test
    public void test02662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02662");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1483.1604443921456d, 482.9523483900521d, 309.4213562373095d, 246.4044206487757d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1705.059796408342d + "'", double4 == 1705.059796408342d);
    }

    @Test
    public void test02663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02663");
        int[] intArray3 = new int[] { 1, 1, 100 };
        int[] intArray5 = new int[] { (byte) -1 };
        int int6 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray3, intArray5);
        int[] intArray9 = new int[] { 'a', 10 };
        int int10 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray5, intArray9);
        int[] intArray14 = new int[] { 1, 1, 100 };
        int[] intArray16 = new int[] { (byte) -1 };
        int int17 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray14, intArray16);
        int[] intArray21 = new int[] { 1, 1, 100 };
        int[] intArray23 = new int[] { (byte) -1 };
        int int24 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray21, intArray23);
        int[] intArray27 = new int[] { 'a', 10 };
        int int28 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray23, intArray27);
        int[] intArray32 = new int[] { (byte) 1, (short) 1, (short) -1 };
        int int33 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray23, intArray32);
        int int34 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray16, intArray23);
        int[] intArray38 = new int[] { 1, 1, 100 };
        int[] intArray40 = new int[] { (byte) -1 };
        int int41 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray38, intArray40);
        int int42 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray16, intArray38);
        int[] intArray46 = new int[] { 1, 1, 100 };
        int[] intArray48 = new int[] { (byte) -1 };
        int int49 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray46, intArray48);
        int[] intArray52 = new int[] { 'a', 10 };
        int int53 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray48, intArray52);
        int int54 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray16, intArray48);
        int[] intArray58 = new int[] { 1, 1, 100 };
        int[] intArray60 = new int[] { (byte) -1 };
        int int61 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray58, intArray60);
        int[] intArray65 = new int[] { 1, 1, 100 };
        int[] intArray67 = new int[] { (byte) -1 };
        int int68 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray65, intArray67);
        int[] intArray71 = new int[] { 'a', 10 };
        int int72 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray67, intArray71);
        int int73 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray58, intArray71);
        int int74 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray48, intArray71);
        int int75 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray5, intArray71);
        int[] intArray79 = new int[] { 1, 1, 100 };
        int[] intArray81 = new int[] { (byte) -1 };
        int int82 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray79, intArray81);
        int[] intArray88 = new int[] { (byte) 10, (byte) 100, ' ', (short) -1, (short) 100 };
        int int89 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray81, intArray88);
        int int90 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray5, intArray88);
        java.lang.Class<?> wildcardClass91 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[-1]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[1, 1, -1]");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[-1]");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[-1]");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray52), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray58), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray60), "[-1]");
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray65), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray67), "[-1]");
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertNotNull(intArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray71), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-1) + "'", int72 == (-1));
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
        org.junit.Assert.assertNotNull(intArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray79), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray81), "[-1]");
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + (-1) + "'", int82 == (-1));
        org.junit.Assert.assertNotNull(intArray88);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray88), "[10, 100, 32, -1, 100]");
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + (-1) + "'", int89 == (-1));
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + (-1) + "'", int90 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass91);
    }

    @Test
    public void test02664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02664");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(167.29384278124112d, 504.1892407191555d, 905.1535286739935d, 2022.9060016040892d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2256.576446777686d + "'", double4 == 2256.576446777686d);
    }

    @Test
    public void test02665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02665");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(448.5118411552872d, 661.4473008805483d, 322.2455649037498d, 579.6591966111972d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 182.05164476463364d + "'", double4 == 182.05164476463364d);
    }

    @Test
    public void test02666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02666");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(259.31005301878207d, 433.5149692961964d, 385.6725491638043d, (double) '#');
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 524.8774654412186d + "'", double4 == 524.8774654412186d);
    }

    @Test
    public void test02667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02667");
        int[] intArray3 = new int[] { 1, 1, 100 };
        int[] intArray5 = new int[] { (byte) -1 };
        int int6 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray3, intArray5);
        int[] intArray9 = new int[] { 'a', 10 };
        int int10 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray5, intArray9);
        int[] intArray14 = new int[] { (byte) 1, (short) 1, (short) -1 };
        int int15 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray5, intArray14);
        int[] intArray19 = new int[] { 1, 1, 100 };
        int[] intArray21 = new int[] { (byte) -1 };
        int int22 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray19, intArray21);
        int[] intArray25 = new int[] { 'a', 10 };
        int int26 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray21, intArray25);
        int[] intArray30 = new int[] { 1, 1, 100 };
        int[] intArray32 = new int[] { (byte) -1 };
        int int33 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray30, intArray32);
        int[] intArray37 = new int[] { 1, 1, 100 };
        int[] intArray39 = new int[] { (byte) -1 };
        int int40 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray37, intArray39);
        int[] intArray43 = new int[] { 'a', 10 };
        int int44 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray39, intArray43);
        int int45 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray30, intArray43);
        int int46 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray21, intArray30);
        int int47 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray14, intArray21);
        int[] intArray51 = new int[] { 1, 1, 100 };
        int[] intArray53 = new int[] { (byte) -1 };
        int int54 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray51, intArray53);
        int[] intArray60 = new int[] { (byte) 10, (byte) 100, ' ', (short) -1, (short) 100 };
        int int61 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray53, intArray60);
        int[] intArray65 = new int[] { 1, 1, 100 };
        int[] intArray67 = new int[] { (byte) -1 };
        int int68 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray65, intArray67);
        int[] intArray72 = new int[] { 1, 1, 100 };
        int[] intArray74 = new int[] { (byte) -1 };
        int int75 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray72, intArray74);
        int[] intArray78 = new int[] { 'a', 10 };
        int int79 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray74, intArray78);
        int int80 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray65, intArray78);
        int int81 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray53, intArray78);
        int int82 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray14, intArray53);
        java.lang.Class<?> wildcardClass83 = intArray53.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[1, 1, -1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[-1]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[-1]");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[-1]");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray43), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray51), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray53), "[-1]");
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray60), "[10, 100, 32, -1, 100]");
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray65), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray67), "[-1]");
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertNotNull(intArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray72), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray74), "[-1]");
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
        org.junit.Assert.assertNotNull(intArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray78), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + (-1) + "'", int79 == (-1));
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + (-1) + "'", int80 == (-1));
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + (-1) + "'", int81 == (-1));
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + (-1) + "'", int82 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass83);
    }

    @Test
    public void test02668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02668");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(689.179909625901d, 1370.9620153931494d, 459.7280589510255d, 633.8490641557331d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 966.5648019122918d + "'", double4 == 966.5648019122918d);
    }

    @Test
    public void test02669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02669");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(508.76819606974647d, 942.3260805538212d, 889.515809986488d, 6.186539851916677d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 630.521265834824d + "'", double4 == 630.521265834824d);
    }

    @Test
    public void test02670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02670");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(30.10864641105329d, 690.588115022927d, 1829.2102125307836d, 803.8248080837866d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1958.4185313788403d + "'", double4 == 1958.4185313788403d);
    }

    @Test
    public void test02671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02671");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1184.2462885697346d, 630.4713680990789d, 0.0d, 220.78840830511703d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1593.9292483636964d + "'", double4 == 1593.9292483636964d);
    }

    @Test
    public void test02672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02672");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(472.9509077137483d, 526.1603102497103d, 2483.9847999350486d, 1410.8842493339566d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2895.757831305547d + "'", double4 == 2895.757831305547d);
    }

    @Test
    public void test02673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02673");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(296.6349750306253d, 150.00535004535024d, 787.5043799554695d, 1066.464717489007d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1407.328772368501d + "'", double4 == 1407.328772368501d);
    }

    @Test
    public void test02674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02674");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(59.40894017819502d, 590.1769828638132d, 0.0d, 879.8033576502743d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 822.5426568831847d + "'", double4 == 822.5426568831847d);
    }

    @Test
    public void test02675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02675");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(423.1701731848648d, 452.3869766947d, 2172.5168628156075d, 824.4388460585776d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1794.7786460596942d + "'", double4 == 1794.7786460596942d);
    }

    @Test
    public void test02676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02676");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(833.2404484695342d, 318.6063079589574d, 829.6926964153299d, 148.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 174.15406001316165d + "'", double4 == 174.15406001316165d);
    }

    @Test
    public void test02677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02677");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(0.0d, 815.1910886538078d, 554.0360052988086d, 803.8665608360225d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 565.360533116594d + "'", double4 == 565.360533116594d);
    }

    @Test
    public void test02678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02678");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1003.3862145365393d, 284.6189351320858d, 465.8212726297929d, 786.4611048709063d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1039.407111645567d + "'", double4 == 1039.407111645567d);
    }

    @Test
    public void test02679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02679");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(0.0d, 0.0d, 378.5990534663774d, 506.93116111407437d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 632.7056546247239d + "'", double4 == 632.7056546247239d);
    }

    @Test
    public void test02680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02680");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(313.81045375356257d, 223.0863499747256d, 944.6164994332674d, 150.40770846134703d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 703.4846871930835d + "'", double4 == 703.4846871930835d);
    }

    @Test
    public void test02681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02681");
        double[] doubleArray4 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray5 = new double[] {};
        double double7 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray4, doubleArray5, 0);
        double[] doubleArray13 = new double[] { 232.4213562373095d, (short) 0, 1.0f, 75.85073476263909d, (-1L) };
        double double15 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray5, doubleArray13, (int) (byte) -1);
        double[] doubleArray20 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray21 = new double[] {};
        double double23 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray20, doubleArray21, 0);
        double[] doubleArray28 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray29 = new double[] {};
        double double31 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray28, doubleArray29, 0);
        double double33 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray21, doubleArray29, (int) (byte) 1);
        double[] doubleArray38 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray39 = new double[] {};
        double double41 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray38, doubleArray39, 0);
        double[] doubleArray46 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray47 = new double[] {};
        double double49 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray46, doubleArray47, 0);
        double double51 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray38, doubleArray47, (int) (short) 100);
        double[] doubleArray56 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray57 = new double[] {};
        double double59 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray56, doubleArray57, 0);
        double double61 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray47, doubleArray56, (int) (short) 100);
        double double63 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray29, doubleArray56, (int) (byte) 10);
        double[] doubleArray68 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray69 = new double[] {};
        double double71 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray68, doubleArray69, 0);
        double[] doubleArray76 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray77 = new double[] {};
        double double79 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray76, doubleArray77, 0);
        double double81 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray68, doubleArray77, (int) (short) 100);
        double[] doubleArray86 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray87 = new double[] {};
        double double89 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray86, doubleArray87, 0);
        double double91 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray68, doubleArray86, (int) (byte) 0);
        double double93 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray29, doubleArray86, 0);
        double double95 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray5, doubleArray29, (int) (byte) 10);
        java.lang.Class<?> wildcardClass96 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[232.4213562373095, 0.0, 1.0, 75.85073476263909, -1.0]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[]");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-1.0d) + "'", double23 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[]");
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + (-1.0d) + "'", double31 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[]");
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + (-1.0d) + "'", double41 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[]");
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + (-1.0d) + "'", double49 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + (-1.0d) + "'", double51 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray56), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[]");
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + (-1.0d) + "'", double59 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + (-1.0d) + "'", double61 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + (-1.0d) + "'", double63 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray68), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray69), "[]");
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + (-1.0d) + "'", double71 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray76), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray77), "[]");
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + (-1.0d) + "'", double79 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + (-1.0d) + "'", double81 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray86), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray87);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray87), "[]");
        org.junit.Assert.assertTrue("'" + double89 + "' != '" + (-1.0d) + "'", double89 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double91 + "' != '" + Double.POSITIVE_INFINITY + "'", double91 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double93 + "' != '" + (-1.0d) + "'", double93 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double95 + "' != '" + 0.0d + "'", double95 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass96);
    }

    @Test
    public void test02682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02682");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(988.1839780629083d, 375.97526322393975d, 99.40824915468535d, 394.14097853281095d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1069.0226291276806d + "'", double4 == 1069.0226291276806d);
    }

    @Test
    public void test02683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02683");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(521.9751938756947d, 323.08444526140875d, 199.9966375835254d, 699.3261970700897d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 367.59157912831455d + "'", double4 == 367.59157912831455d);
    }

    @Test
    public void test02684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02684");
        int[] intArray0 = null;
        int[] intArray4 = new int[] { 1, 1, 100 };
        int[] intArray6 = new int[] { (byte) -1 };
        int int7 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray4, intArray6);
        int[] intArray10 = new int[] { 'a', 10 };
        int int11 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray6, intArray10);
        int[] intArray15 = new int[] { (byte) 1, (short) 1, (short) -1 };
        int int16 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray6, intArray15);
        int[] intArray20 = new int[] { 1, 1, 100 };
        int[] intArray22 = new int[] { (byte) -1 };
        int int23 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray20, intArray22);
        int[] intArray27 = new int[] { 1, 1, 100 };
        int[] intArray29 = new int[] { (byte) -1 };
        int int30 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray27, intArray29);
        int[] intArray33 = new int[] { 'a', 10 };
        int int34 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray29, intArray33);
        int[] intArray38 = new int[] { (byte) 1, (short) 1, (short) -1 };
        int int39 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray29, intArray38);
        int int40 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray22, intArray29);
        int[] intArray44 = new int[] { 1, 1, 100 };
        int[] intArray46 = new int[] { (byte) -1 };
        int int47 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray44, intArray46);
        int int48 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray22, intArray44);
        int[] intArray52 = new int[] { 1, 1, 100 };
        int[] intArray54 = new int[] { (byte) -1 };
        int int55 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray52, intArray54);
        int[] intArray58 = new int[] { 'a', 10 };
        int int59 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray54, intArray58);
        int int60 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray22, intArray54);
        int[] intArray64 = new int[] { 1, 1, 100 };
        int[] intArray66 = new int[] { (byte) -1 };
        int int67 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray64, intArray66);
        int[] intArray70 = new int[] { 'a', 10 };
        int int71 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray66, intArray70);
        int[] intArray75 = new int[] { (byte) 1, (short) 1, (short) -1 };
        int int76 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray66, intArray75);
        int[] intArray80 = new int[] { (byte) -1, '#', (-1) };
        int int81 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray66, intArray80);
        int int82 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray54, intArray80);
        int int83 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray15, intArray54);
        // The following exception was thrown during execution in test generation
        try {
            int int84 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray0, intArray54);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"b1\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1, -1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[-1]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[-1]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[1, 1, -1]");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[-1]");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray52), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray54), "[-1]");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray58), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(intArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray64), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray66), "[-1]");
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertNotNull(intArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray70), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertNotNull(intArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray75), "[1, 1, -1]");
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-1) + "'", int76 == (-1));
        org.junit.Assert.assertNotNull(intArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray80), "[-1, 35, -1]");
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + (-1) + "'", int81 == (-1));
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + (-1) + "'", int82 == (-1));
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + (-1) + "'", int83 == (-1));
    }

    @Test
    public void test02685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02685");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(518.2420741296589d, 72.09748128251067d, 484.2206679959923d, 937.476137726764d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 899.4000625779199d + "'", double4 == 899.4000625779199d);
    }

    @Test
    public void test02686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02686");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1201.6280100200713d, 504.1892407191555d, 962.5824041711725d, 503.13322656792127d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 738.2667297024383d + "'", double4 == 738.2667297024383d);
    }

    @Test
    public void test02687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02687");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1073.8771967928965d, 689.179909625901d, 657.5321254102356d, 998.0138462667178d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 423.2002675066391d + "'", double4 == 423.2002675066391d);
    }

    @Test
    public void test02688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02688");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(63.234418836332225d, 183.58184974459016d, 860.8662372742338d, 468.42069516739264d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1082.470663860704d + "'", double4 == 1082.470663860704d);
    }

    @Test
    public void test02689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02689");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(415.78775792499863d, 821.9404560206501d, 353.658609881411d, 601.712149954323d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 196.0303817985771d + "'", double4 == 196.0303817985771d);
    }

    @Test
    public void test02690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02690");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(515.3008802650451d, 186.9180422268371d, 245.87495653847805d, 1541.756045800729d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1624.2639273004588d + "'", double4 == 1624.2639273004588d);
    }

    @Test
    public void test02691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02691");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(472.9509077137483d, 358.666116899047d, 1017.2158503276609d, 1741.486649791941d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1380.3648998320687d + "'", double4 == 1380.3648998320687d);
    }

    @Test
    public void test02692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02692");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(385.6725491638043d, 267.02682409492445d, 7.706157218758875d, 615.2073500056413d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 442.2044982103387d + "'", double4 == 442.2044982103387d);
    }

    @Test
    public void test02693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02693");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(989.8852570493364d, 531.6236873455962d, 176.4602767831856d, 1290.9135650720034d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 867.339749320863d + "'", double4 == 867.339749320863d);
    }

    @Test
    public void test02694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02694");
        double[] doubleArray4 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray5 = new double[] {};
        double double7 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray4, doubleArray5, 0);
        double[] doubleArray12 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray13 = new double[] {};
        double double15 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray12, doubleArray13, 0);
        double double17 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray4, doubleArray13, (int) (short) 100);
        double[] doubleArray22 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray23 = new double[] {};
        double double25 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray22, doubleArray23, 0);
        double double27 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray13, doubleArray22, (int) (short) 100);
        double[] doubleArray32 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray33 = new double[] {};
        double double35 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray32, doubleArray33, 0);
        double[] doubleArray40 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray41 = new double[] {};
        double double43 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray40, doubleArray41, 0);
        double[] doubleArray48 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray49 = new double[] {};
        double double51 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray48, doubleArray49, 0);
        double double53 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray40, doubleArray49, (int) (short) 100);
        double[] doubleArray58 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray59 = new double[] {};
        double double61 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray58, doubleArray59, 0);
        double double63 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray49, doubleArray58, (int) (short) 100);
        double double65 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray33, doubleArray49, (int) '4');
        double[] doubleArray70 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray71 = new double[] {};
        double double73 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray70, doubleArray71, 0);
        double[] doubleArray78 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray79 = new double[] {};
        double double81 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray78, doubleArray79, 0);
        double[] doubleArray86 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray87 = new double[] {};
        double double89 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray86, doubleArray87, 0);
        double double91 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray78, doubleArray87, 1);
        double double93 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray71, doubleArray87, (int) (short) 10);
        double double95 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray49, doubleArray87, 0);
        double double97 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray22, doubleArray49, (int) (short) 0);
        java.lang.Class<?> wildcardClass98 = doubleArray22.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[]");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-1.0d) + "'", double25 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + (-1.0d) + "'", double27 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[]");
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + (-1.0d) + "'", double35 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[]");
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + (-1.0d) + "'", double43 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[]");
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + (-1.0d) + "'", double51 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + (-1.0d) + "'", double53 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[]");
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + (-1.0d) + "'", double61 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + (-1.0d) + "'", double63 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 0.0d + "'", double65 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray70), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray71), "[]");
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + (-1.0d) + "'", double73 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray78), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray79), "[]");
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + (-1.0d) + "'", double81 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray86), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray87);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray87), "[]");
        org.junit.Assert.assertTrue("'" + double89 + "' != '" + (-1.0d) + "'", double89 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double91 + "' != '" + (-1.0d) + "'", double91 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double93 + "' != '" + 0.0d + "'", double93 == 0.0d);
        org.junit.Assert.assertTrue("'" + double95 + "' != '" + 0.0d + "'", double95 == 0.0d);
        org.junit.Assert.assertTrue("'" + double97 + "' != '" + (-1.0d) + "'", double97 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass98);
    }

    @Test
    public void test02695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02695");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(162.59014554237984d, 1308.050118617758d, 195.86115869725893d, 653.8220417482348d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 687.4990900244022d + "'", double4 == 687.4990900244022d);
    }

    @Test
    public void test02696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02696");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(203.47355162652715d, 1997.3898007645857d, 1081.1487055736848d, 442.7159299471211d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 909.6980770786871d + "'", double4 == 909.6980770786871d);
    }

    @Test
    public void test02697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02697");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(530.1671498841977d, 428.75890195044605d, 978.4438663763432d, 527.2756114119443d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 448.28604210226746d + "'", double4 == 448.28604210226746d);
    }

    @Test
    public void test02698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02698");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(508.5647858466356d, 912.3200508707025d, 903.0910492666097d, 475.8773849871957d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 395.87806039621915d + "'", double4 == 395.87806039621915d);
    }

    @Test
    public void test02699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02699");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(2963.7812627724106d, 1143.28819990604d, 1630.5222277005653d, 885.5120248650928d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2469.1663937111593d + "'", double4 == 2469.1663937111593d);
    }

    @Test
    public void test02700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02700");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(580.7352867136476d, 1937.3592403785726d, Double.POSITIVE_INFINITY, 423.6966685158553d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test02701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02701");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(591.2386429693088d, 564.0294948337818d, 637.8514798973449d, 985.4414441655066d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 468.02478625976096d + "'", double4 == 468.02478625976096d);
    }

    @Test
    public void test02702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02702");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(188.00592040346186d, 732.7008314323236d, 737.9337555965523d, 91.17760003365332d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1191.4510665917608d + "'", double4 == 1191.4510665917608d);
    }

    @Test
    public void test02703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02703");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(555.430640930876d, 601.116670134495d, 0.0d, 761.1853721887338d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 592.3159683141059d + "'", double4 == 592.3159683141059d);
    }

    @Test
    public void test02704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02704");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(0.0d, 3204.7597357909353d, 614.6324374476843d, 591.2386429693088d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3228.153530269311d + "'", double4 == 3228.153530269311d);
    }

    @Test
    public void test02705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02705");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(2592.0288495957343d, 592.9607468427321d, 1214.703235988529d, 653.6605082493417d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2377.876715187823d + "'", double4 == 2377.876715187823d);
    }

    @Test
    public void test02706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02706");
        double[] doubleArray0 = null;
        double[] doubleArray5 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray6 = new double[] {};
        double double8 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray5, doubleArray6, 0);
        double[] doubleArray13 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray14 = new double[] {};
        double double16 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray13, doubleArray14, 0);
        double double18 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray5, doubleArray14, 1);
        double[] doubleArray23 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray24 = new double[] {};
        double double26 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray23, doubleArray24, 0);
        double[] doubleArray31 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray32 = new double[] {};
        double double34 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray31, doubleArray32, 0);
        double double36 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray23, doubleArray32, 1);
        double[] doubleArray41 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray42 = new double[] {};
        double double44 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray41, doubleArray42, 0);
        double[] doubleArray49 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray50 = new double[] {};
        double double52 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray49, doubleArray50, 0);
        double double54 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray42, doubleArray50, (int) (byte) 1);
        double[] doubleArray59 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray60 = new double[] {};
        double double62 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray59, doubleArray60, 0);
        double[] doubleArray67 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray68 = new double[] {};
        double double70 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray67, doubleArray68, 0);
        double double72 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray60, doubleArray68, (int) (byte) 1);
        double double74 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray42, doubleArray60, (int) (short) 0);
        double double76 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray32, doubleArray42, (int) '#');
        double double78 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray14, doubleArray42, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            double double80 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray0, doubleArray14, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"p1\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[]");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[]");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.0d) + "'", double18 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[]");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-1.0d) + "'", double26 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[]");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + (-1.0d) + "'", double34 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + (-1.0d) + "'", double36 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[]");
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + (-1.0d) + "'", double44 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[]");
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + (-1.0d) + "'", double52 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 0.0d + "'", double54 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[]");
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + (-1.0d) + "'", double62 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray67), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray68), "[]");
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + (-1.0d) + "'", double70 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 0.0d + "'", double72 == 0.0d);
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 0.0d + "'", double74 == 0.0d);
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 0.0d + "'", double76 == 0.0d);
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + 0.0d + "'", double78 == 0.0d);
    }

    @Test
    public void test02707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02707");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1084.281502208625d, 171.13605016916154d, 425.71130297188733d, 386.8432478352133d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 874.2773969027894d + "'", double4 == 874.2773969027894d);
    }

    @Test
    public void test02708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02708");
        double[] doubleArray4 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray5 = new double[] {};
        double double7 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray4, doubleArray5, 0);
        double[] doubleArray12 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray13 = new double[] {};
        double double15 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray12, doubleArray13, 0);
        double double17 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray4, doubleArray13, (int) (short) 100);
        double[] doubleArray22 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray23 = new double[] {};
        double double25 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray22, doubleArray23, 0);
        double[] doubleArray30 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray31 = new double[] {};
        double double33 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray30, doubleArray31, 0);
        double double35 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray23, doubleArray31, (int) (byte) 1);
        double double37 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray13, doubleArray31, 0);
        double[] doubleArray42 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray43 = new double[] {};
        double double45 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray42, doubleArray43, 0);
        double[] doubleArray50 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray51 = new double[] {};
        double double53 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray50, doubleArray51, 0);
        double double55 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray42, doubleArray51, (int) (short) 100);
        double double57 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray31, doubleArray51, (int) (short) 1);
        double[] doubleArray62 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray63 = new double[] {};
        double double65 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray62, doubleArray63, 0);
        double[] doubleArray71 = new double[] { 232.4213562373095d, (short) 0, 1.0f, 75.85073476263909d, (-1L) };
        double double73 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray63, doubleArray71, (int) (byte) -1);
        double double75 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray51, doubleArray63, (int) (short) 1);
        double[] doubleArray80 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray81 = new double[] {};
        double double83 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray80, doubleArray81, 0);
        double[] doubleArray88 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray89 = new double[] {};
        double double91 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray88, doubleArray89, 0);
        double double93 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray81, doubleArray89, (int) (byte) 1);
        double double95 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray51, doubleArray81, 26);
        java.lang.Class<?> wildcardClass96 = doubleArray81.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[]");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-1.0d) + "'", double25 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[]");
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + (-1.0d) + "'", double33 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[]");
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + (-1.0d) + "'", double45 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[]");
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + (-1.0d) + "'", double53 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + (-1.0d) + "'", double55 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 0.0d + "'", double57 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray62), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[]");
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + (-1.0d) + "'", double65 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray71), "[232.4213562373095, 0.0, 1.0, 75.85073476263909, -1.0]");
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + (-1.0d) + "'", double73 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + 0.0d + "'", double75 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray80), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray81), "[]");
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + (-1.0d) + "'", double83 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray88);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray88), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray89), "[]");
        org.junit.Assert.assertTrue("'" + double91 + "' != '" + (-1.0d) + "'", double91 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double93 + "' != '" + 0.0d + "'", double93 == 0.0d);
        org.junit.Assert.assertTrue("'" + double95 + "' != '" + 0.0d + "'", double95 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass96);
    }

    @Test
    public void test02709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02709");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(456.8791003118282d, 427.91471160278576d, 692.0591126438114d, 111.8257573191436d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 417.57807379087694d + "'", double4 == 417.57807379087694d);
    }

    @Test
    public void test02710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02710");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(220.3017643888764d, 812.3403011217949d, 698.3991064446583d, 1406.6854418957596d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1072.4424828297465d + "'", double4 == 1072.4424828297465d);
    }

    @Test
    public void test02711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02711");
        double[] doubleArray4 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray5 = new double[] {};
        double double7 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray4, doubleArray5, 0);
        double[] doubleArray12 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray13 = new double[] {};
        double double15 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray12, doubleArray13, 0);
        double double17 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray4, doubleArray13, (int) (short) 100);
        double[] doubleArray22 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray23 = new double[] {};
        double double25 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray22, doubleArray23, 0);
        double[] doubleArray30 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray31 = new double[] {};
        double double33 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray30, doubleArray31, 0);
        double double35 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray23, doubleArray31, (int) (byte) 1);
        double double37 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray4, doubleArray23, (int) (short) -1);
        double[] doubleArray42 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray43 = new double[] {};
        double double45 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray42, doubleArray43, 0);
        double[] doubleArray50 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray51 = new double[] {};
        double double53 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray50, doubleArray51, 0);
        double double55 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray43, doubleArray51, (int) (byte) 1);
        double[] doubleArray60 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray61 = new double[] {};
        double double63 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray60, doubleArray61, 0);
        double[] doubleArray68 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray69 = new double[] {};
        double double71 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray68, doubleArray69, 0);
        double[] doubleArray76 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray77 = new double[] {};
        double double79 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray76, doubleArray77, 0);
        double double81 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray68, doubleArray77, 1);
        double double83 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray61, doubleArray77, (int) (short) 10);
        double double85 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray51, doubleArray61, (int) ' ');
        double double87 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray23, doubleArray61, (int) ' ');
        java.lang.Class<?> wildcardClass88 = doubleArray61.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[]");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-1.0d) + "'", double25 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[]");
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + (-1.0d) + "'", double33 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + (-1.0d) + "'", double37 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[]");
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + (-1.0d) + "'", double45 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[]");
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + (-1.0d) + "'", double53 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 0.0d + "'", double55 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[]");
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + (-1.0d) + "'", double63 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray68), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray69), "[]");
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + (-1.0d) + "'", double71 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray76), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray77), "[]");
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + (-1.0d) + "'", double79 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + (-1.0d) + "'", double81 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + 0.0d + "'", double83 == 0.0d);
        org.junit.Assert.assertTrue("'" + double85 + "' != '" + 0.0d + "'", double85 == 0.0d);
        org.junit.Assert.assertTrue("'" + double87 + "' != '" + 0.0d + "'", double87 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass88);
    }

    @Test
    public void test02712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02712");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(661.4473008805483d, 346.72635292547017d, 670.8183981016402d, 58.216600569028486d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 297.8808495775337d + "'", double4 == 297.8808495775337d);
    }

    @Test
    public void test02713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02713");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(634.2295453448422d, 703.865287100714d, 693.417905157533d, 2044.7962219626638d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1400.1192946746407d + "'", double4 == 1400.1192946746407d);
    }

    @Test
    public void test02714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02714");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(0.0d, 344.0265175173438d, 340.4421739578686d, 604.4664943211609d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 600.8821507616857d + "'", double4 == 600.8821507616857d);
    }

    @Test
    public void test02715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02715");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(783.4339093421895d, 181.1730024775672d, 772.0458937590442d, 725.1616906289017d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 59.37455997892704d + "'", double4 == 59.37455997892704d);
    }

    @Test
    public void test02716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02716");
        int[] intArray3 = new int[] { 1, 1, 100 };
        int[] intArray5 = new int[] { (byte) -1 };
        int int6 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray3, intArray5);
        int[] intArray10 = new int[] { 1, 1, 100 };
        int[] intArray12 = new int[] { (byte) -1 };
        int int13 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray10, intArray12);
        int[] intArray16 = new int[] { 'a', 10 };
        int int17 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray12, intArray16);
        int[] intArray21 = new int[] { (byte) 1, (short) 1, (short) -1 };
        int int22 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray12, intArray21);
        int int23 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray5, intArray12);
        int[] intArray27 = new int[] { 1, 1, 100 };
        int[] intArray29 = new int[] { (byte) -1 };
        int int30 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray27, intArray29);
        int int31 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray5, intArray27);
        int[] intArray35 = new int[] { 1, 1, 100 };
        int[] intArray37 = new int[] { (byte) -1 };
        int int38 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray35, intArray37);
        int[] intArray41 = new int[] { 'a', 10 };
        int int42 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray37, intArray41);
        int[] intArray46 = new int[] { 1, 1, 100 };
        int[] intArray48 = new int[] { (byte) -1 };
        int int49 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray46, intArray48);
        int[] intArray53 = new int[] { 1, 1, 100 };
        int[] intArray55 = new int[] { (byte) -1 };
        int int56 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray53, intArray55);
        int[] intArray59 = new int[] { 'a', 10 };
        int int60 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray55, intArray59);
        int int61 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray46, intArray59);
        int int62 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray37, intArray46);
        int[] intArray66 = new int[] { 1, 1, 100 };
        int[] intArray68 = new int[] { (byte) -1 };
        int int69 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray66, intArray68);
        int[] intArray72 = new int[] { 'a', 10 };
        int int73 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray68, intArray72);
        int[] intArray77 = new int[] { (byte) 1, (short) 1, (short) -1 };
        int int78 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray68, intArray77);
        int int79 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray46, intArray68);
        int int80 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray27, intArray68);
        java.lang.Class<?> wildcardClass81 = intArray27.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 1, -1]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[-1]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[-1]");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[-1]");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray53), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray55), "[-1]");
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray59), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertNotNull(intArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray66), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray68), "[-1]");
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
        org.junit.Assert.assertNotNull(intArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray72), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertNotNull(intArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray77), "[1, 1, -1]");
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + (-1) + "'", int79 == (-1));
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + (-1) + "'", int80 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass81);
    }

    @Test
    public void test02717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02717");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(515.7252440971957d, 115.14060609640867d, 91.27801765290928d, 89.77848449612381d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 449.8093480445713d + "'", double4 == 449.8093480445713d);
    }

    @Test
    public void test02718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02718");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(807.5323439092334d, 437.61027356172747d, 295.35263043242065d, 245.87495653847805d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 760.1230687759271d + "'", double4 == 760.1230687759271d);
    }

    @Test
    public void test02719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02719");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1354.9427883510798d, 343.53860254466906d, 871.2992730721038d, 287.4213562373095d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 539.7607615863355d + "'", double4 == 539.7607615863355d);
    }

    @Test
    public void test02720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02720");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(59.40894017819502d, 98.2248342131674d, 1066.464717489007d, 555.7197088172657d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1122.713551037035d + "'", double4 == 1122.713551037035d);
    }

    @Test
    public void test02721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02721");
        double[] doubleArray4 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray5 = new double[] {};
        double double7 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray4, doubleArray5, 0);
        double[] doubleArray12 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray13 = new double[] {};
        double double15 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray12, doubleArray13, 0);
        double double17 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray4, doubleArray13, (int) (short) 100);
        double[] doubleArray22 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray23 = new double[] {};
        double double25 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray22, doubleArray23, 0);
        double[] doubleArray30 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray31 = new double[] {};
        double double33 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray30, doubleArray31, 0);
        double double35 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray22, doubleArray31, (int) (short) 100);
        double[] doubleArray40 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray41 = new double[] {};
        double double43 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray40, doubleArray41, 0);
        double double45 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray22, doubleArray40, (int) (byte) 0);
        double double47 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray4, doubleArray40, (int) (short) 1);
        double[] doubleArray52 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray53 = new double[] {};
        double double55 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray52, doubleArray53, 0);
        double[] doubleArray60 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray61 = new double[] {};
        double double63 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray60, doubleArray61, 0);
        double double65 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray53, doubleArray61, (int) (byte) 1);
        double[] doubleArray70 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray71 = new double[] {};
        double double73 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray70, doubleArray71, 0);
        double[] doubleArray78 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray79 = new double[] {};
        double double81 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray78, doubleArray79, 0);
        double double83 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray71, doubleArray79, (int) (byte) 1);
        double double85 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray53, doubleArray71, (int) (short) 0);
        double double87 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray4, doubleArray71, (int) (byte) 1);
        double[] doubleArray88 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double90 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray4, doubleArray88, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"p2\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[]");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-1.0d) + "'", double25 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[]");
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + (-1.0d) + "'", double33 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + (-1.0d) + "'", double35 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[]");
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + (-1.0d) + "'", double43 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + Double.POSITIVE_INFINITY + "'", double45 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.0d + "'", double47 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[]");
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + (-1.0d) + "'", double55 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[]");
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + (-1.0d) + "'", double63 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 0.0d + "'", double65 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray70), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray71), "[]");
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + (-1.0d) + "'", double73 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray78), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray79), "[]");
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + (-1.0d) + "'", double81 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + 0.0d + "'", double83 == 0.0d);
        org.junit.Assert.assertTrue("'" + double85 + "' != '" + 0.0d + "'", double85 == 0.0d);
        org.junit.Assert.assertTrue("'" + double87 + "' != '" + (-1.0d) + "'", double87 == (-1.0d));
    }

    @Test
    public void test02722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02722");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1002.602929337322d, 413.8437306383785d, 959.8852305870198d, 268.59948986728233d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 187.9619395213984d + "'", double4 == 187.9619395213984d);
    }

    @Test
    public void test02723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02723");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(721.2584480765205d, 1267.400893421706d, 582.1574183122069d, 3204.7597357909353d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2487.39376508036d + "'", double4 == 2487.39376508036d);
    }

    @Test
    public void test02724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02724");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(110.22998117257458d, 733.5968760056405d, 427.91471160278576d, 344.7628584686314d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 394.8787896067389d + "'", double4 == 394.8787896067389d);
    }

    @Test
    public void test02725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02725");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(425.71130297188733d, 1168.0564717759175d, 604.2826343560215d, 1014.1008157937363d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 332.52698736631544d + "'", double4 == 332.52698736631544d);
    }

    @Test
    public void test02726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02726");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(376.8601759872545d, 200.01741434894532d, 416.7932251801975d, 1138.0023060837207d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 762.1889468010093d + "'", double4 == 762.1889468010093d);
    }

    @Test
    public void test02727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02727");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(351.6199127515424d, 275.4187635335095d, 546.9941398742101d, 868.5987780744226d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 788.5542416635808d + "'", double4 == 788.5542416635808d);
    }

    @Test
    public void test02728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02728");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1497.0729541854828d, 243.24025375080168d, 397.7177005722833d, 1720.3168189486005d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2576.4318188109983d + "'", double4 == 2576.4318188109983d);
    }

    @Test
    public void test02729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02729");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1431.044245781737d, 444.23554773240085d, 231.9064967234238d, 1222.7030823864745d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1217.1020423865575d + "'", double4 == 1217.1020423865575d);
    }

    @Test
    public void test02730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02730");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(136.57490340747813d, 180.0274220553354d, 988.5078734431651d, 243.14774917259138d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 858.5729770312488d + "'", double4 == 858.5729770312488d);
    }

    @Test
    public void test02731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02731");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(414.604730252317d, 627.8514798973449d, 996.1563978294703d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1209.4031474744982d + "'", double4 == 1209.4031474744982d);
    }

    @Test
    public void test02732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02732");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(0.0d, 546.0643392889106d, 592.9366778909589d, 634.1478301952668d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 681.0201687973151d + "'", double4 == 681.0201687973151d);
    }

    @Test
    public void test02733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02733");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(309.4213562373095d, 1028.732704283299d, 474.72340590982594d, 755.7877889674128d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 438.2469649884026d + "'", double4 == 438.2469649884026d);
    }

    @Test
    public void test02734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02734");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(816.3228889880967d, 1159.7502235336701d, 560.0246542664447d, 524.4025725377481d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 388.46654460571847d + "'", double4 == 388.46654460571847d);
    }

    @Test
    public void test02735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02735");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1633.5686689676313d, 280.74328252048d, 203.47355162652715d, 741.9061120174771d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1685.2994274341145d + "'", double4 == 1685.2994274341145d);
    }

    @Test
    public void test02736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02736");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(472.5109881900736d, (double) 26, 472.5109881900736d, 237.65150738269148d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 234.8594808073821d + "'", double4 == 234.8594808073821d);
    }

    @Test
    public void test02737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02737");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(167.29384278124112d, 372.95052751976243d, 254.3727246655306d, 179.42158274528765d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 280.6078266587642d + "'", double4 == 280.6078266587642d);
    }

    @Test
    public void test02738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02738");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(569.959937758982d, 691.8072225542435d, 546.5855220111873d, 349.57519522850913d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 365.6064430735291d + "'", double4 == 365.6064430735291d);
    }

    @Test
    public void test02739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02739");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(417.3513100069032d, 230.1492652373609d, 0.0d, 322.2455649037498d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 509.4476096732921d + "'", double4 == 509.4476096732921d);
    }

    @Test
    public void test02740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02740");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1066.464717489007d, 1035.8032344689284d, 456.622934142084d, 420.1686547710891d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1225.4763630447624d + "'", double4 == 1225.4763630447624d);
    }

    @Test
    public void test02741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02741");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(692.822859816043d, 877.4483706677477d, 238.45762724844747d, 453.9015312110428d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 877.9120720243004d + "'", double4 == 877.9120720243004d);
    }

    @Test
    public void test02742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02742");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(687.8385619858715d, 607.089723914349d, 716.1930244036126d, 351.6199127515424d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 283.8242735805477d + "'", double4 == 283.8242735805477d);
    }

    @Test
    public void test02743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02743");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(588.7272878990773d, 629.5444608483646d, 237.65150738269148d, 626.2527251290963d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 353.0755756272212d + "'", double4 == 353.0755756272212d);
    }

    @Test
    public void test02744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02744");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(175.09754101316523d, 446.615323216948d, 448.28604210226746d, 301.85507241890923d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 301.16345876515066d + "'", double4 == 301.16345876515066d);
    }

    @Test
    public void test02745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02745");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(435.2117505246209d, 0.0d, 275.0065142587339d, 326.1374322058475d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 486.34266847173456d + "'", double4 == 486.34266847173456d);
    }

    @Test
    public void test02746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02746");
        int[] intArray0 = null;
        int[] intArray4 = new int[] { 1, 1, 100 };
        int[] intArray6 = new int[] { (byte) -1 };
        int int7 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray4, intArray6);
        int[] intArray11 = new int[] { 1, 1, 100 };
        int[] intArray13 = new int[] { (byte) -1 };
        int int14 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray11, intArray13);
        int[] intArray17 = new int[] { 'a', 10 };
        int int18 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray13, intArray17);
        int[] intArray22 = new int[] { (byte) 1, (short) 1, (short) -1 };
        int int23 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray13, intArray22);
        int[] intArray27 = new int[] { 1, 1, 100 };
        int[] intArray29 = new int[] { (byte) -1 };
        int int30 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray27, intArray29);
        int[] intArray33 = new int[] { 'a', 10 };
        int int34 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray29, intArray33);
        int[] intArray38 = new int[] { 1, 1, 100 };
        int[] intArray40 = new int[] { (byte) -1 };
        int int41 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray38, intArray40);
        int[] intArray45 = new int[] { 1, 1, 100 };
        int[] intArray47 = new int[] { (byte) -1 };
        int int48 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray45, intArray47);
        int[] intArray51 = new int[] { 'a', 10 };
        int int52 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray47, intArray51);
        int int53 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray38, intArray51);
        int int54 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray29, intArray38);
        int int55 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray22, intArray29);
        int[] intArray59 = new int[] { 1, 1, 100 };
        int[] intArray61 = new int[] { (byte) -1 };
        int int62 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray59, intArray61);
        int[] intArray66 = new int[] { 1, 1, 100 };
        int[] intArray68 = new int[] { (byte) -1 };
        int int69 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray66, intArray68);
        int int70 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray59, intArray68);
        int int71 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray22, intArray59);
        int[] intArray75 = new int[] { '4', (short) 100, '#' };
        int int76 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray22, intArray75);
        int int77 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray4, intArray75);
        int[] intArray81 = new int[] { 1, 1, 100 };
        int[] intArray83 = new int[] { (byte) -1 };
        int int84 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray81, intArray83);
        int int85 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray75, intArray81);
        // The following exception was thrown during execution in test generation
        try {
            int int86 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray0, intArray81);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[1, 1, -1]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[-1]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[-1]");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray45), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[-1]");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray51), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray59), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray61), "[-1]");
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertNotNull(intArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray66), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray68), "[-1]");
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 101 + "'", int71 == 101);
        org.junit.Assert.assertNotNull(intArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray75), "[52, 100, 35]");
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 186 + "'", int76 == 186);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 215 + "'", int77 == 215);
        org.junit.Assert.assertNotNull(intArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray81), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray83), "[-1]");
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + (-1) + "'", int84 == (-1));
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 215 + "'", int85 == 215);
    }

    @Test
    public void test02747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02747");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1794.7786460596942d, 229.7265305245437d, 530.1671498841977d, 359.8788905584546d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1394.7638562094075d + "'", double4 == 1394.7638562094075d);
    }

    @Test
    public void test02748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02748");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(460.3096842010527d, 604.9083823509063d, 709.5490174935603d, 203.47355162652715d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 650.6741640168868d + "'", double4 == 650.6741640168868d);
    }

    @Test
    public void test02749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02749");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1323.0790153317653d, 1102.5320475851477d, 1505.987346488035d, 1030.529719285076d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 345.02253292181524d + "'", double4 == 345.02253292181524d);
    }

    @Test
    public void test02750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02750");
        double[] doubleArray4 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray5 = new double[] {};
        double double7 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray4, doubleArray5, 0);
        double[] doubleArray12 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray13 = new double[] {};
        double double15 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray12, doubleArray13, 0);
        double double17 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray4, doubleArray13, (int) (short) 100);
        double[] doubleArray22 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray23 = new double[] {};
        double double25 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray22, doubleArray23, 0);
        double double27 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray13, doubleArray22, (int) (short) 100);
        double[] doubleArray32 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray33 = new double[] {};
        double double35 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray32, doubleArray33, 0);
        double[] doubleArray40 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray41 = new double[] {};
        double double43 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray40, doubleArray41, 0);
        double[] doubleArray48 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray49 = new double[] {};
        double double51 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray48, doubleArray49, 0);
        double double53 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray40, doubleArray49, 1);
        double double55 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray33, doubleArray49, (int) (short) 10);
        double double57 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray13, doubleArray33, 100);
        double[] doubleArray62 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray63 = new double[] {};
        double double65 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray62, doubleArray63, 0);
        double[] doubleArray70 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray71 = new double[] {};
        double double73 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray70, doubleArray71, 0);
        double double75 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray62, doubleArray71, (int) (short) 100);
        double[] doubleArray80 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray81 = new double[] {};
        double double83 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray80, doubleArray81, 0);
        double double85 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray71, doubleArray80, (int) (short) 100);
        double double87 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray13, doubleArray80, 215);
        double[] doubleArray88 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double90 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray80, doubleArray88, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"p2\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[]");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-1.0d) + "'", double25 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + (-1.0d) + "'", double27 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[]");
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + (-1.0d) + "'", double35 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[]");
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + (-1.0d) + "'", double43 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[]");
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + (-1.0d) + "'", double51 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + (-1.0d) + "'", double53 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 0.0d + "'", double55 == 0.0d);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 0.0d + "'", double57 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray62), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[]");
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + (-1.0d) + "'", double65 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray70), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray71), "[]");
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + (-1.0d) + "'", double73 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + (-1.0d) + "'", double75 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray80), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray81), "[]");
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + (-1.0d) + "'", double83 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double85 + "' != '" + (-1.0d) + "'", double85 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double87 + "' != '" + (-1.0d) + "'", double87 == (-1.0d));
    }

    @Test
    public void test02751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02751");
        double[] doubleArray1 = new double[] { 102.26030820844352d };
        double[] doubleArray6 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray7 = new double[] {};
        double double9 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray6, doubleArray7, 0);
        double[] doubleArray14 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray15 = new double[] {};
        double double17 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray14, doubleArray15, 0);
        double double19 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray6, doubleArray15, 1);
        double[] doubleArray24 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray25 = new double[] {};
        double double27 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray24, doubleArray25, 0);
        double[] doubleArray32 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray33 = new double[] {};
        double double35 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray32, doubleArray33, 0);
        double double37 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray25, doubleArray33, (int) (byte) 1);
        double[] doubleArray42 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray43 = new double[] {};
        double double45 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray42, doubleArray43, 0);
        double[] doubleArray50 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray51 = new double[] {};
        double double53 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray50, doubleArray51, 0);
        double double55 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray43, doubleArray51, (int) (byte) 1);
        double double57 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray25, doubleArray43, (int) (short) 0);
        double double59 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray15, doubleArray43, 0);
        double double61 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray1, doubleArray15, 10);
        java.lang.Class<?> wildcardClass62 = doubleArray1.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[102.26030820844352]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[]");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.0d) + "'", double19 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[]");
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + (-1.0d) + "'", double27 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[]");
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + (-1.0d) + "'", double35 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[]");
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + (-1.0d) + "'", double45 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[]");
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + (-1.0d) + "'", double53 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 0.0d + "'", double55 == 0.0d);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 0.0d + "'", double57 == 0.0d);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 0.0d + "'", double59 == 0.0d);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + (-1.0d) + "'", double61 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass62);
    }

    @Test
    public void test02752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02752");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(526.3691245954593d, 152.51248812544304d, 1429.1280765910471d, 609.7793622065474d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 906.6040994538412d + "'", double4 == 906.6040994538412d);
    }

    @Test
    public void test02753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02753");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(926.8168419803987d, 220.78840830511703d, 373.44890145037124d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 774.1563488351445d + "'", double4 == 774.1563488351445d);
    }

    @Test
    public void test02754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02754");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(874.1663920834051d, 1790.7743259911974d, 933.0730494943102d, 609.9293586384213d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 270.7234827847988d + "'", double4 == 270.7234827847988d);
    }

    @Test
    public void test02755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02755");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(347.4014495905789d, 1040.2062944463478d, 2483.9847999350486d, 372.30674150719653d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2136.728500894452d + "'", double4 == 2136.728500894452d);
    }

    @Test
    public void test02756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02756");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(475.9324615695342d, 0.0d, 0.0d, 812.2303596667742d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 582.758941793481d + "'", double4 == 582.758941793481d);
    }

    @Test
    public void test02757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02757");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1253.7257826169155d, 741.9061120174771d, 754.5164898211783d, 1013.2681792786382d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 554.1026773232632d + "'", double4 == 554.1026773232632d);
    }

    @Test
    public void test02758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02758");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(957.7440738866916d, 344.7628584686314d, 223.31249474929078d, 784.9484205212476d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1174.617141190017d + "'", double4 == 1174.617141190017d);
    }

    @Test
    public void test02759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02759");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1192.5196727343853d, (double) (-1), 465.7651970635461d, 476.0074296060986d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1203.7619052769378d + "'", double4 == 1203.7619052769378d);
    }

    @Test
    public void test02760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02760");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1067.9763627976358d, 1184.2462885697346d, 1818.3430093357147d, 500.0698876288167d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 941.046156559536d + "'", double4 == 941.046156559536d);
    }

    @Test
    public void test02761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02761");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(254.4112638901271d, 22.409854457620142d, 1014.7240192916356d, 285.1699348719751d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 760.9346764780822d + "'", double4 == 760.9346764780822d);
    }

    @Test
    public void test02762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02762");
        double[] doubleArray4 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray5 = new double[] {};
        double double7 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray4, doubleArray5, 0);
        double[] doubleArray12 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray13 = new double[] {};
        double double15 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray12, doubleArray13, 0);
        double double17 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray4, doubleArray13, (int) (short) 100);
        double[] doubleArray20 = new double[] { (byte) 0, 132.0d };
        double double22 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray13, doubleArray20, (int) '4');
        double[] doubleArray24 = new double[] { (short) 0 };
        double[] doubleArray29 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray30 = new double[] {};
        double double32 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray29, doubleArray30, 0);
        double[] doubleArray37 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray38 = new double[] {};
        double double40 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray37, doubleArray38, 0);
        double double42 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray29, doubleArray38, (int) (short) 100);
        double double44 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray24, doubleArray29, 1);
        double double46 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray13, doubleArray29, 26);
        double[] doubleArray51 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray52 = new double[] {};
        double double54 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray51, doubleArray52, 0);
        double[] doubleArray59 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray60 = new double[] {};
        double double62 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray59, doubleArray60, 0);
        double double64 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray51, doubleArray60, (int) (short) 100);
        double[] doubleArray69 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray70 = new double[] {};
        double double72 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray69, doubleArray70, 0);
        double double74 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray60, doubleArray69, (int) (short) 100);
        double double76 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray13, doubleArray69, (int) ' ');
        java.lang.Class<?> wildcardClass77 = doubleArray13.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[0.0, 132.0]");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-1.0d) + "'", double22 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[0.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[]");
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + (-1.0d) + "'", double32 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[]");
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + (-1.0d) + "'", double40 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + (-1.0d) + "'", double42 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + (-1.0d) + "'", double44 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + (-1.0d) + "'", double46 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[]");
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + (-1.0d) + "'", double54 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[]");
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + (-1.0d) + "'", double62 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + (-1.0d) + "'", double64 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray69), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray70), "[]");
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + (-1.0d) + "'", double72 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + (-1.0d) + "'", double74 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + (-1.0d) + "'", double76 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass77);
    }

    @Test
    public void test02763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02763");
        int[] intArray3 = new int[] { 1, 1, 100 };
        int[] intArray5 = new int[] { (byte) -1 };
        int int6 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray3, intArray5);
        int[] intArray9 = new int[] { 'a', 10 };
        int int10 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray5, intArray9);
        int[] intArray14 = new int[] { (byte) 1, (short) 1, (short) -1 };
        int int15 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray5, intArray14);
        int[] intArray19 = new int[] { 1, 1, 100 };
        int[] intArray21 = new int[] { (byte) -1 };
        int int22 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray19, intArray21);
        int[] intArray25 = new int[] { 'a', 10 };
        int int26 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray21, intArray25);
        int[] intArray30 = new int[] { 1, 1, 100 };
        int[] intArray32 = new int[] { (byte) -1 };
        int int33 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray30, intArray32);
        int[] intArray37 = new int[] { 1, 1, 100 };
        int[] intArray39 = new int[] { (byte) -1 };
        int int40 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray37, intArray39);
        int[] intArray43 = new int[] { 'a', 10 };
        int int44 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray39, intArray43);
        int int45 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray30, intArray43);
        int int46 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray21, intArray30);
        int int47 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray14, intArray21);
        int[] intArray51 = new int[] { 1, 1, 100 };
        int[] intArray53 = new int[] { (byte) -1 };
        int int54 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray51, intArray53);
        int[] intArray60 = new int[] { (byte) 10, (byte) 100, ' ', (short) -1, (short) 100 };
        int int61 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray53, intArray60);
        int[] intArray65 = new int[] { 1, 1, 100 };
        int[] intArray67 = new int[] { (byte) -1 };
        int int68 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray65, intArray67);
        int[] intArray72 = new int[] { 1, 1, 100 };
        int[] intArray74 = new int[] { (byte) -1 };
        int int75 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray72, intArray74);
        int[] intArray78 = new int[] { 'a', 10 };
        int int79 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray74, intArray78);
        int int80 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray65, intArray78);
        int int81 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray53, intArray78);
        int int82 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray14, intArray53);
        java.lang.Class<?> wildcardClass83 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[1, 1, -1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[-1]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[-1]");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[-1]");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray43), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray51), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray53), "[-1]");
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray60), "[10, 100, 32, -1, 100]");
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray65), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray67), "[-1]");
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertNotNull(intArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray72), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray74), "[-1]");
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
        org.junit.Assert.assertNotNull(intArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray78), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + (-1) + "'", int79 == (-1));
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + (-1) + "'", int80 == (-1));
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + (-1) + "'", int81 == (-1));
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + (-1) + "'", int82 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass83);
    }

    @Test
    public void test02764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02764");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(283.7811747592152d, 617.5764224172406d, 300.59725112716797d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 284.27897490340905d + "'", double4 == 284.27897490340905d);
    }

    @Test
    public void test02765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02765");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(266.0d, 883.2477228774341d, 270.0550079678848d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 887.3027308453188d + "'", double4 == 887.3027308453188d);
    }

    @Test
    public void test02766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02766");
        int[] intArray3 = new int[] { 1, 1, 100 };
        int[] intArray5 = new int[] { (byte) -1 };
        int int6 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray3, intArray5);
        int[] intArray10 = new int[] { 1, 1, 100 };
        int[] intArray12 = new int[] { (byte) -1 };
        int int13 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray10, intArray12);
        int[] intArray16 = new int[] { 'a', 10 };
        int int17 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray12, intArray16);
        int[] intArray21 = new int[] { (byte) 1, (short) 1, (short) -1 };
        int int22 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray12, intArray21);
        int int23 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray5, intArray12);
        int[] intArray27 = new int[] { 1, 1, 100 };
        int[] intArray29 = new int[] { (byte) -1 };
        int int30 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray27, intArray29);
        int int31 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray5, intArray27);
        int[] intArray32 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int33 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray27, intArray32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 1, -1]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[-1]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
    }

    @Test
    public void test02767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02767");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(431.3449894720819d, 389.23201588782825d, 136.57490340747813d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 522.4441631229163d + "'", double4 == 522.4441631229163d);
    }

    @Test
    public void test02768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02768");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(0.0d, 582.1574183122069d, 328.6731802847771d, 787.3684582930454d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 853.2145970113713d + "'", double4 == 853.2145970113713d);
    }

    @Test
    public void test02769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02769");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(329.4012999106945d, 503.36603226666506d, 652.042545403267d, 980.2263420235763d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 799.5015552494838d + "'", double4 == 799.5015552494838d);
    }

    @Test
    public void test02770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02770");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(373.6116600540088d, 1290.9135650720034d, 698.8756247101211d, 493.2930398078507d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1122.884489920265d + "'", double4 == 1122.884489920265d);
    }

    @Test
    public void test02771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02771");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(582.1574183122069d, 111.2372087121366d, 510.9207644402136d, 917.1667464219267d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 342.4995047812538d + "'", double4 == 342.4995047812538d);
    }

    @Test
    public void test02772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02772");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(63.234418836332225d, 204.01225453388824d, 656.2457151754967d, 460.2476947640703d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 849.2467365693465d + "'", double4 == 849.2467365693465d);
    }

    @Test
    public void test02773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02773");
        double[] doubleArray1 = new double[] { (short) 0 };
        double[] doubleArray6 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray7 = new double[] {};
        double double9 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray6, doubleArray7, 0);
        double[] doubleArray14 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray15 = new double[] {};
        double double17 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray14, doubleArray15, 0);
        double double19 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray6, doubleArray15, (int) (short) 100);
        double double21 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray1, doubleArray6, 1);
        double[] doubleArray26 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray27 = new double[] {};
        double double29 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray26, doubleArray27, 0);
        double[] doubleArray34 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray35 = new double[] {};
        double double37 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray34, doubleArray35, 0);
        double double39 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray27, doubleArray35, (int) (byte) 1);
        double[] doubleArray44 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray45 = new double[] {};
        double double47 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray44, doubleArray45, 0);
        double[] doubleArray52 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray53 = new double[] {};
        double double55 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray52, doubleArray53, 0);
        double[] doubleArray60 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray61 = new double[] {};
        double double63 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray60, doubleArray61, 0);
        double double65 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray52, doubleArray61, 1);
        double double67 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray45, doubleArray61, (int) (short) 10);
        double double69 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray35, doubleArray45, (int) ' ');
        double[] doubleArray74 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray75 = new double[] {};
        double double77 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray74, doubleArray75, 0);
        double[] doubleArray82 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray83 = new double[] {};
        double double85 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray82, doubleArray83, 0);
        double double87 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray75, doubleArray83, (int) (byte) 1);
        double double89 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray35, doubleArray83, 72);
        double double91 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray1, doubleArray35, (int) '4');
        java.lang.Class<?> wildcardClass92 = doubleArray1.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[0.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[]");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.0d) + "'", double19 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1.0d) + "'", double21 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[]");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + (-1.0d) + "'", double29 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[]");
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + (-1.0d) + "'", double37 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[]");
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + (-1.0d) + "'", double47 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[]");
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + (-1.0d) + "'", double55 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[]");
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + (-1.0d) + "'", double63 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + (-1.0d) + "'", double65 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 0.0d + "'", double67 == 0.0d);
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 0.0d + "'", double69 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray74), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray75), "[]");
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + (-1.0d) + "'", double77 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray82), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray83), "[]");
        org.junit.Assert.assertTrue("'" + double85 + "' != '" + (-1.0d) + "'", double85 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double87 + "' != '" + 0.0d + "'", double87 == 0.0d);
        org.junit.Assert.assertTrue("'" + double89 + "' != '" + 0.0d + "'", double89 == 0.0d);
        org.junit.Assert.assertTrue("'" + double91 + "' != '" + (-1.0d) + "'", double91 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass92);
    }

    @Test
    public void test02774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02774");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(119.72206941536145d, 1849.2004754411312d, 212.5208577575268d, 609.7793622065474d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1332.2199015767492d + "'", double4 == 1332.2199015767492d);
    }

    @Test
    public void test02775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02775");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1582.0156297267456d, 479.47463434269935d, 886.9991318016976d, 816.3228889880967d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1034.085734167077d + "'", double4 == 1034.085734167077d);
    }

    @Test
    public void test02776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02776");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(372.30674150719653d, 668.1928114195907d, 483.6996920353407d, 1546.538813930864d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 989.7389530394175d + "'", double4 == 989.7389530394175d);
    }

    @Test
    public void test02777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02777");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1758.236007373104d, 110.73681895204965d, 1760.5047985463032d, 784.0374608938663d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 974.201188346456d + "'", double4 == 974.201188346456d);
    }

    @Test
    public void test02778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02778");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(488.98631962571847d, 145.04728234672646d, 0.0d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 634.0336019724449d + "'", double4 == 634.0336019724449d);
    }

    @Test
    public void test02779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02779");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(442.98025338116196d, 719.2055846677729d, 1380.3648998320687d, 822.4991563827713d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1040.678218165905d + "'", double4 == 1040.678218165905d);
    }

    @Test
    public void test02780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02780");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(213.3473584230394d, 141.32112170894843d, 962.0155780796133d, 1486.0106889076544d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2093.35778685528d + "'", double4 == 2093.35778685528d);
    }

    @Test
    public void test02781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02781");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1289.261867709632d, 682.3932453456185d, 0.0d, 774.1563488351445d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1388.3550911438629d + "'", double4 == 1388.3550911438629d);
    }

    @Test
    public void test02782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02782");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(989.7389530394175d, 0.0d, 229.50120276052428d, 703.4846871930835d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1463.7224374719767d + "'", double4 == 1463.7224374719767d);
    }

    @Test
    public void test02783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02783");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance((-1.0d), 99.40824915468535d, 388.46654460571847d, 428.196971756117d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 718.2552672071502d + "'", double4 == 718.2552672071502d);
    }

    @Test
    public void test02784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02784");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1098.3417464932243d, 871.2181639675185d, 372.94976380494643d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1596.6101466557964d + "'", double4 == 1596.6101466557964d);
    }

    @Test
    public void test02785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02785");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1138.0023060837207d, 1082.470663860704d, 417.28295470017156d, 1236.6752907573918d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 727.4426034836936d + "'", double4 == 727.4426034836936d);
    }

    @Test
    public void test02786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02786");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1535.3460709311994d, 989.1844835299229d, 353.658609881411d, 2196.5238088677543d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1354.0831794041292d + "'", double4 == 1354.0831794041292d);
    }

    @Test
    public void test02787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02787");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(693.417905157533d, 252.8742777722448d, 684.3898597150222d, 508.76819606974647d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 264.9219637400125d + "'", double4 == 264.9219637400125d);
    }

    @Test
    public void test02788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02788");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(231.9064967234238d, 0.0d, 459.52139206247597d, 348.4574041312402d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 255.7198752498387d + "'", double4 == 255.7198752498387d);
    }

    @Test
    public void test02789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02789");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(537.6734054899458d, 628.9313872906666d, 500.0698876288167d, 325.96909051909483d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 340.56581463270095d + "'", double4 == 340.56581463270095d);
    }

    @Test
    public void test02790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02790");
        double[] doubleArray4 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray5 = new double[] {};
        double double7 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray4, doubleArray5, 0);
        double[] doubleArray12 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray13 = new double[] {};
        double double15 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray12, doubleArray13, 0);
        double[] doubleArray20 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray21 = new double[] {};
        double double23 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray20, doubleArray21, 0);
        double double25 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray12, doubleArray21, 1);
        double double27 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray5, doubleArray21, (int) (short) 10);
        double[] doubleArray32 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray33 = new double[] {};
        double double35 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray32, doubleArray33, 0);
        double[] doubleArray40 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray41 = new double[] {};
        double double43 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray40, doubleArray41, 0);
        double double45 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray32, doubleArray41, 1);
        double double47 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray21, doubleArray32, (int) '#');
        double[] doubleArray48 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double50 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray32, doubleArray48, 111);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"p2\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[]");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-1.0d) + "'", double23 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-1.0d) + "'", double25 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[]");
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + (-1.0d) + "'", double35 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[]");
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + (-1.0d) + "'", double43 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + (-1.0d) + "'", double45 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + (-1.0d) + "'", double47 == (-1.0d));
    }

    @Test
    public void test02791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02791");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(531.9291584092143d, 793.3634741754175d, 415.0418892831276d, 1447.3946977424262d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 770.9184926930953d + "'", double4 == 770.9184926930953d);
    }

    @Test
    public void test02792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02792");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(231.83280856387287d, 805.2996232304821d, 212.0862081751727d, 854.0411423288443d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 622.5215970819753d + "'", double4 == 622.5215970819753d);
    }

    @Test
    public void test02793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02793");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(0.0d, 2592.0288495957343d, 1022.121609758591d, 213.3473584230394d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3400.8031009312863d + "'", double4 == 3400.8031009312863d);
    }

    @Test
    public void test02794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02794");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(600.5503288932999d, 627.8514798973449d, 721.2584480765205d, 797.5899331206741d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 290.44657240654976d + "'", double4 == 290.44657240654976d);
    }

    @Test
    public void test02795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02795");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(915.6229266699065d, 229.7265305245437d, (double) 72, 560.3844877706626d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 915.3654957855197d + "'", double4 == 915.3654957855197d);
    }

    @Test
    public void test02796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02796");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1328.573669597486d, 1085.9203536169716d, 1193.0998956704975d, 228.2773007214092d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 993.1168268225509d + "'", double4 == 993.1168268225509d);
    }

    @Test
    public void test02797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02797");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1292.0367371442157d, 1923.2494552526769d, 0.0d, (double) 111);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3104.2861923968926d + "'", double4 == 3104.2861923968926d);
    }

    @Test
    public void test02798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02798");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1117.4402236439857d, 0.0d, 55.70115734375261d, 96.05767204529039d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1157.7967383455236d + "'", double4 == 1157.7967383455236d);
    }

    @Test
    public void test02799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02799");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance((double) (byte) 0, 0.0d, 395.87806039621915d, 1318.0864281704735d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1376.2526188277607d + "'", double4 == 1376.2526188277607d);
    }

    @Test
    public void test02800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02800");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(389.2205766920531d, 0.0d, 343.53860254466906d, 556.9757457476818d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 602.6577198950658d + "'", double4 == 602.6577198950658d);
    }

    @Test
    public void test02801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02801");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(153.43012976962632d, 1221.248948951979d, 479.47463434269935d, 79.01194999030838d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1468.2815035347435d + "'", double4 == 1468.2815035347435d);
    }

    @Test
    public void test02802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02802");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(444.112221123372d, 0.0d, 324.54639705998176d, 617.4713644682606d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 737.0371885316508d + "'", double4 == 737.0371885316508d);
    }

    @Test
    public void test02803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02803");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1011.7972527379859d, 322.19732825436046d, 2847.4902779710783d, 629.5444608483646d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2143.0401578270967d + "'", double4 == 2143.0401578270967d);
    }

    @Test
    public void test02804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02804");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(3228.153530269311d, 434.59128451792674d, 0.0d, 329.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3333.744814787238d + "'", double4 == 3333.744814787238d);
    }

    @Test
    public void test02805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02805");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(553.9155272754956d, 476.0074296060986d, 816.3228889880967d, 301.1492652373609d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 364.34654754189563d + "'", double4 == 364.34654754189563d);
    }

    @Test
    public void test02806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02806");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(303.3128472749923d, 533.7322743943777d, 197.91364154759924d, 289.5392231128663d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 349.5922570089044d + "'", double4 == 349.5922570089044d);
    }

    @Test
    public void test02807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02807");
        int[] intArray3 = new int[] { 1, 1, 100 };
        int[] intArray5 = new int[] { (byte) -1 };
        int int6 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray3, intArray5);
        int[] intArray10 = new int[] { 1, 1, 100 };
        int[] intArray12 = new int[] { (byte) -1 };
        int int13 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray10, intArray12);
        int[] intArray16 = new int[] { 'a', 10 };
        int int17 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray12, intArray16);
        int[] intArray21 = new int[] { (byte) 1, (short) 1, (short) -1 };
        int int22 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray12, intArray21);
        int int23 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray5, intArray12);
        int[] intArray27 = new int[] { 1, 1, 100 };
        int[] intArray29 = new int[] { (byte) -1 };
        int int30 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray27, intArray29);
        int[] intArray33 = new int[] { 'a', 10 };
        int int34 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray29, intArray33);
        int[] intArray38 = new int[] { (byte) 1, (short) 1, (short) -1 };
        int int39 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray29, intArray38);
        int[] intArray43 = new int[] { (byte) -1, '#', (-1) };
        int int44 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray29, intArray43);
        int int45 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray12, intArray29);
        int[] intArray49 = new int[] { 1, 1, 100 };
        int[] intArray51 = new int[] { (byte) -1 };
        int int52 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray49, intArray51);
        int int53 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray29, intArray51);
        java.lang.Class<?> wildcardClass54 = intArray29.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 1, -1]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[-1]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[1, 1, -1]");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray43), "[-1, 35, -1]");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray49), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray51), "[-1]");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(wildcardClass54);
    }

    @Test
    public void test02808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02808");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(181.94685709660757d, 2088.1419456483327d, 877.9120720243004d, 397.8625759407711d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2386.244584635255d + "'", double4 == 2386.244584635255d);
    }

    @Test
    public void test02809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02809");
        double[] doubleArray4 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray5 = new double[] {};
        double double7 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray4, doubleArray5, 0);
        double[] doubleArray12 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray13 = new double[] {};
        double double15 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray12, doubleArray13, 0);
        double double17 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray5, doubleArray13, (int) (byte) 1);
        double[] doubleArray22 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray23 = new double[] {};
        double double25 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray22, doubleArray23, 0);
        double[] doubleArray30 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray31 = new double[] {};
        double double33 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray30, doubleArray31, 0);
        double double35 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray22, doubleArray31, (int) (short) 100);
        double[] doubleArray40 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray41 = new double[] {};
        double double43 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray40, doubleArray41, 0);
        double double45 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray31, doubleArray40, (int) (short) 100);
        double double47 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray13, doubleArray40, (int) (byte) 10);
        double[] doubleArray52 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray53 = new double[] {};
        double double55 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray52, doubleArray53, 0);
        double[] doubleArray60 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray61 = new double[] {};
        double double63 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray60, doubleArray61, 0);
        double[] doubleArray68 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray69 = new double[] {};
        double double71 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray68, doubleArray69, 0);
        double double73 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray60, doubleArray69, 1);
        double double75 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray53, doubleArray60, (int) ' ');
        double double77 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray13, doubleArray53, 111);
        java.lang.Class<?> wildcardClass78 = doubleArray53.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[]");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-1.0d) + "'", double25 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[]");
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + (-1.0d) + "'", double33 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + (-1.0d) + "'", double35 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[]");
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + (-1.0d) + "'", double43 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + (-1.0d) + "'", double45 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + (-1.0d) + "'", double47 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[]");
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + (-1.0d) + "'", double55 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[]");
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + (-1.0d) + "'", double63 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray68), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray69), "[]");
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + (-1.0d) + "'", double71 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + (-1.0d) + "'", double73 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + (-1.0d) + "'", double75 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 0.0d + "'", double77 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass78);
    }

    @Test
    public void test02810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02810");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(37.3064424931273d, 429.07839943364144d, 982.9863826916253d, 716.8369233741474d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1164.5051411394563d + "'", double4 == 1164.5051411394563d);
    }

    @Test
    public void test02811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02811");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(210.43152753590826d, 1834.171839210729d, 905.3915780663442d, 1760.5047985463032d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 768.6270911948619d + "'", double4 == 768.6270911948619d);
    }

    @Test
    public void test02812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02812");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(275.4187635335095d, 1013.2681792786382d, 1335.6221527888076d, 1034.0337828761076d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1080.9689928527675d + "'", double4 == 1080.9689928527675d);
    }

    @Test
    public void test02813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02813");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(878.1086993790781d, 489.5472968394182d, 417.3513100069032d, 1091.9285723854555d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 507.9530588091043d + "'", double4 == 507.9530588091043d);
    }

    @Test
    public void test02814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02814");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(379.48932572777875d, 726.8005610398169d, 237.953312915854d, (double) 136);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 732.3365738517416d + "'", double4 == 732.3365738517416d);
    }

    @Test
    public void test02815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02815");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(0.0d, 268.59948986728233d, 1333.1036007329699d, 100.65557929031002d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1501.0475113099421d + "'", double4 == 1501.0475113099421d);
    }

    @Test
    public void test02816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02816");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(91.0d, 513.8338591778103d, 666.1719514049422d, 262.3073194548731d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 826.6984911278794d + "'", double4 == 826.6984911278794d);
    }

    @Test
    public void test02817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02817");
        double[] doubleArray4 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray5 = new double[] {};
        double double7 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray4, doubleArray5, 0);
        double[] doubleArray13 = new double[] { 232.4213562373095d, (short) 0, 1.0f, 75.85073476263909d, (-1L) };
        double double15 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray5, doubleArray13, (int) (byte) -1);
        double[] doubleArray20 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray21 = new double[] {};
        double double23 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray20, doubleArray21, 0);
        double[] doubleArray28 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray29 = new double[] {};
        double double31 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray28, doubleArray29, 0);
        double double33 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray20, doubleArray29, (int) (short) 100);
        double[] doubleArray38 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray39 = new double[] {};
        double double41 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray38, doubleArray39, 0);
        double double43 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray20, doubleArray38, (int) (byte) 0);
        double double45 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray13, doubleArray38, (int) (short) 100);
        double[] doubleArray50 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray51 = new double[] {};
        double double53 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray50, doubleArray51, 0);
        double[] doubleArray58 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray59 = new double[] {};
        double double61 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray58, doubleArray59, 0);
        double double63 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray50, doubleArray59, (int) (short) 100);
        double double65 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray13, doubleArray50, 100);
        java.lang.Class<?> wildcardClass66 = doubleArray13.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[232.4213562373095, 0.0, 1.0, 75.85073476263909, -1.0]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[]");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-1.0d) + "'", double23 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[]");
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + (-1.0d) + "'", double31 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + (-1.0d) + "'", double33 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[]");
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + (-1.0d) + "'", double41 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + Double.POSITIVE_INFINITY + "'", double43 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + (-1.0d) + "'", double45 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[]");
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + (-1.0d) + "'", double53 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[]");
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + (-1.0d) + "'", double61 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + (-1.0d) + "'", double63 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + (-1.0d) + "'", double65 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass66);
    }

    @Test
    public void test02818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02818");
        int[] intArray3 = new int[] { (byte) -1, (short) -1, ' ' };
        int[] intArray7 = new int[] { 1, 1, 100 };
        int[] intArray9 = new int[] { (byte) -1 };
        int int10 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray7, intArray9);
        int int11 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray3, intArray7);
        int[] intArray12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int13 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray3, intArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, -1, 32]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 72 + "'", int11 == 72);
    }

    @Test
    public void test02819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02819");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(0.0d, 956.5579343315898d, 685.0850282096962d, 883.2477228774341d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1117.796061831161d + "'", double4 == 1117.796061831161d);
    }

    @Test
    public void test02820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02820");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(935.8370962646457d, 604.9655572193913d, 0.0d, 724.0308906643231d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1054.9024297095775d + "'", double4 == 1054.9024297095775d);
    }

    @Test
    public void test02821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02821");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(266.09479742842706d, 555.5147953355564d, 920.4834412344354d, 401.85876510713194d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 668.3235384618226d + "'", double4 == 668.3235384618226d);
    }

    @Test
    public void test02822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02822");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(421.44070408348125d, 927.6563662606078d, 150.46520120670195d, 91.17760003365332d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1107.4542691037336d + "'", double4 == 1107.4542691037336d);
    }

    @Test
    public void test02823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02823");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1156.7548171637534d, 559.8794281330635d, 1233.710556947929d, 49.62154523619969d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 587.2136226810394d + "'", double4 == 587.2136226810394d);
    }

    @Test
    public void test02824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02824");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(714.9565770654988d, 1463.7224374719767d, 1461.2128417750914d, 951.3857669727188d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1258.5929352088506d + "'", double4 == 1258.5929352088506d);
    }

    @Test
    public void test02825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02825");
        int[] intArray3 = new int[] { 1, 1, 100 };
        int[] intArray5 = new int[] { (byte) -1 };
        int int6 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray3, intArray5);
        int[] intArray10 = new int[] { 1, 1, 100 };
        int[] intArray12 = new int[] { (byte) -1 };
        int int13 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray10, intArray12);
        int[] intArray16 = new int[] { 'a', 10 };
        int int17 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray12, intArray16);
        int[] intArray21 = new int[] { (byte) 1, (short) 1, (short) -1 };
        int int22 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray12, intArray21);
        int int23 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray5, intArray12);
        int[] intArray27 = new int[] { 1, 1, 100 };
        int[] intArray29 = new int[] { (byte) -1 };
        int int30 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray27, intArray29);
        int int31 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray5, intArray27);
        int[] intArray35 = new int[] { 1, 1, 100 };
        int[] intArray37 = new int[] { (byte) -1 };
        int int38 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray35, intArray37);
        int[] intArray41 = new int[] { 'a', 10 };
        int int42 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray37, intArray41);
        int[] intArray46 = new int[] { (byte) 1, (short) 1, (short) -1 };
        int int47 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray37, intArray46);
        int[] intArray51 = new int[] { 1, 1, 100 };
        int[] intArray53 = new int[] { (byte) -1 };
        int int54 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray51, intArray53);
        int[] intArray57 = new int[] { 'a', 10 };
        int int58 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray53, intArray57);
        int[] intArray62 = new int[] { 1, 1, 100 };
        int[] intArray64 = new int[] { (byte) -1 };
        int int65 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray62, intArray64);
        int[] intArray69 = new int[] { 1, 1, 100 };
        int[] intArray71 = new int[] { (byte) -1 };
        int int72 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray69, intArray71);
        int[] intArray75 = new int[] { 'a', 10 };
        int int76 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray71, intArray75);
        int int77 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray62, intArray75);
        int int78 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray53, intArray62);
        int int79 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray46, intArray53);
        int[] intArray83 = new int[] { 1, 1, 100 };
        int[] intArray85 = new int[] { (byte) -1 };
        int int86 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray83, intArray85);
        int[] intArray90 = new int[] { 1, 1, 100 };
        int[] intArray92 = new int[] { (byte) -1 };
        int int93 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray90, intArray92);
        int int94 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray83, intArray92);
        int int95 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray46, intArray83);
        int int96 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray27, intArray83);
        java.lang.Class<?> wildcardClass97 = intArray83.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 1, -1]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[-1]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[-1]");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[1, 1, -1]");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray51), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray53), "[-1]");
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray57), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertNotNull(intArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray62), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray64), "[-1]");
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertNotNull(intArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray69), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray71), "[-1]");
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-1) + "'", int72 == (-1));
        org.junit.Assert.assertNotNull(intArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray75), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-1) + "'", int76 == (-1));
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + (-1) + "'", int77 == (-1));
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + (-1) + "'", int79 == (-1));
        org.junit.Assert.assertNotNull(intArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray83), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray85), "[-1]");
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + (-1) + "'", int86 == (-1));
        org.junit.Assert.assertNotNull(intArray90);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray90), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray92);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray92), "[-1]");
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + (-1) + "'", int93 == (-1));
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + (-1) + "'", int94 == (-1));
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + 101 + "'", int95 == 101);
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + 0 + "'", int96 == 0);
        org.junit.Assert.assertNotNull(wildcardClass97);
    }

    @Test
    public void test02826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02826");
        int[] intArray3 = new int[] { 1, 1, 100 };
        int[] intArray5 = new int[] { (byte) -1 };
        int int6 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray3, intArray5);
        int[] intArray9 = new int[] { 'a', 10 };
        int int10 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray5, intArray9);
        int[] intArray14 = new int[] { (byte) 1, (short) 1, (short) -1 };
        int int15 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray5, intArray14);
        int[] intArray19 = new int[] { 1, 1, 100 };
        int[] intArray21 = new int[] { (byte) -1 };
        int int22 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray19, intArray21);
        int[] intArray26 = new int[] { 1, 1, 100 };
        int[] intArray28 = new int[] { (byte) -1 };
        int int29 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray26, intArray28);
        int[] intArray32 = new int[] { 'a', 10 };
        int int33 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray28, intArray32);
        int[] intArray37 = new int[] { (byte) 1, (short) 1, (short) -1 };
        int int38 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray28, intArray37);
        int int39 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray21, intArray28);
        int[] intArray43 = new int[] { 1, 1, 100 };
        int[] intArray45 = new int[] { (byte) -1 };
        int int46 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray43, intArray45);
        int[] intArray49 = new int[] { 'a', 10 };
        int int50 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray45, intArray49);
        int[] intArray54 = new int[] { (byte) 1, (short) 1, (short) -1 };
        int int55 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray45, intArray54);
        int[] intArray59 = new int[] { (byte) -1, '#', (-1) };
        int int60 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray45, intArray59);
        int int61 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray28, intArray45);
        int[] intArray65 = new int[] { 1, 1, 100 };
        int[] intArray67 = new int[] { (byte) -1 };
        int int68 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray65, intArray67);
        int[] intArray71 = new int[] { 'a', 10 };
        int int72 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray67, intArray71);
        int[] intArray76 = new int[] { (byte) 1, (short) 1, (short) -1 };
        int int77 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray67, intArray76);
        int int78 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray28, intArray67);
        int int79 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray14, intArray28);
        java.lang.Class<?> wildcardClass80 = intArray28.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[1, 1, -1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[-1]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[-1]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[1, 1, -1]");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray43), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray45), "[-1]");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray49), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray54), "[1, 1, -1]");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray59), "[-1, 35, -1]");
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray65), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray67), "[-1]");
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertNotNull(intArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray71), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-1) + "'", int72 == (-1));
        org.junit.Assert.assertNotNull(intArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray76), "[1, 1, -1]");
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + (-1) + "'", int77 == (-1));
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + (-1) + "'", int79 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass80);
    }

    @Test
    public void test02827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02827");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1028.732704283299d, 788.2550733253368d, 311.714830208365d, 353.658609881411d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1151.6143375188597d + "'", double4 == 1151.6143375188597d);
    }

    @Test
    public void test02828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02828");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(200.90336088855406d, 649.5045751650479d, 795.7792892510216d, 345.02253292181524d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 612.084721172372d + "'", double4 == 612.084721172372d);
    }

    @Test
    public void test02829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02829");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(454.12565181325886d, 351.6199127515424d, 0.0d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 642.2306558158326d + "'", double4 == 642.2306558158326d);
    }

    @Test
    public void test02830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02830");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(626.1724203515566d, (double) (byte) 0, 570.362221215667d, 1112.4837742292545d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 489.50333118166543d + "'", double4 == 489.50333118166543d);
    }

    @Test
    public void test02831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02831");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(500.4832062519777d, 1316.6871369520127d, 120.0140155458501d, 951.9825489532838d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 745.1737787048565d + "'", double4 == 745.1737787048565d);
    }

    @Test
    public void test02832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02832");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(809.867614684615d, 20.0d, 733.5968760056405d, 420.4337905199521d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 396.8323688689596d + "'", double4 == 396.8323688689596d);
    }

    @Test
    public void test02833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02833");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1624.2639273004588d, 1697.8573279192422d, 685.8436957842314d, 326.1374322058475d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1601.8005269650744d + "'", double4 == 1601.8005269650744d);
    }

    @Test
    public void test02834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02834");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(152.72882127449927d, 768.6270911948619d, 206.8413115591487d, 686.3437606194915d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 536.3516244936394d + "'", double4 == 536.3516244936394d);
    }

    @Test
    public void test02835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02835");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(587.2136226810394d, 641.156637911209d, 296.6349750306253d, 972.7599638001475d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 482.7855959125905d + "'", double4 == 482.7855959125905d);
    }

    @Test
    public void test02836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02836");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1066.464717489007d, 228.81717627192373d, 346.72635292547017d, 1317.589913262009d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 762.2907433365718d + "'", double4 == 762.2907433365718d);
    }

    @Test
    public void test02837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02837");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(423.4184263336566d, 423.5526445633491d, 2446.974580808893d, 1033.3613358095706d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2633.3648457214576d + "'", double4 == 2633.3648457214576d);
    }

    @Test
    public void test02838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02838");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(825.1486709098094d, 784.9484205212476d, 714.9565770654988d, 517.7839731622196d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 326.5200682458287d + "'", double4 == 326.5200682458287d);
    }

    @Test
    public void test02839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02839");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(755.6071571265365d, 601.720563037279d, 474.546078308824d, 419.81899554943766d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 437.89156132712156d + "'", double4 == 437.89156132712156d);
    }

    @Test
    public void test02840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02840");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(555.7197088172657d, 169.40985445762016d, 428.75890195044605d, 793.9326124997559d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 269.93412892985066d + "'", double4 == 269.93412892985066d);
    }

    @Test
    public void test02841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02841");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(238.57103000254892d, 637.8514798973449d, 286.88848007544675d, 906.6040994538412d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 317.0700696293941d + "'", double4 == 317.0700696293941d);
    }

    @Test
    public void test02842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02842");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1497.3023621363538d, 347.48157825649446d, 476.0074296060986d, 508.5647858466356d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1182.3781401203964d + "'", double4 == 1182.3781401203964d);
    }

    @Test
    public void test02843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02843");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(874.2773969027894d, 824.4388460585776d, 446.615323216948d, 621.808771795944d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 630.292147948475d + "'", double4 == 630.292147948475d);
    }

    @Test
    public void test02844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02844");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(903.0910492666097d, 434.3267617642323d, 441.9662258776474d, 656.7162468754174d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 683.5143085001474d + "'", double4 == 683.5143085001474d);
    }

    @Test
    public void test02845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02845");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1606.2044434854495d, 358.666116899047d, 423.5526445633491d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1541.3179158211474d + "'", double4 == 1541.3179158211474d);
    }

    @Test
    public void test02846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02846");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(375.97526322393975d, 353.0755756272212d, 22.409854457620142d, 913.9108087561316d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 914.40064189523d + "'", double4 == 914.40064189523d);
    }

    @Test
    public void test02847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02847");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(359.2623750887635d, 609.9403408366832d, 537.6734054899458d, 837.7108581071841d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 510.63044040816783d + "'", double4 == 510.63044040816783d);
    }

    @Test
    public void test02848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02848");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1497.3023621363538d, 1324.8639334077811d, 2334.1386014051322d, 484.2206679959923d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1314.012713163696d + "'", double4 == 1314.012713163696d);
    }

    @Test
    public void test02849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02849");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1898.5040154974722d, 898.6352748337238d, 296.60947527847765d, 532.5937039245571d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2105.1786378463567d + "'", double4 == 2105.1786378463567d);
    }

    @Test
    public void test02850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02850");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance((double) 0L, 394.14097853281095d, 391.2284782475115d, 512.5219076654217d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 509.60940738012226d + "'", double4 == 509.60940738012226d);
    }

    @Test
    public void test02851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02851");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(0.0d, 135.86683466289244d, 317.8707178302241d, 326.35324126073317d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 455.57461664944447d + "'", double4 == 455.57461664944447d);
    }

    @Test
    public void test02852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02852");
        int[] intArray3 = new int[] { 1, 1, 100 };
        int[] intArray5 = new int[] { (byte) -1 };
        int int6 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray3, intArray5);
        int[] intArray9 = new int[] { 'a', 10 };
        int int10 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray5, intArray9);
        int[] intArray14 = new int[] { (byte) 1, (short) 1, (short) -1 };
        int int15 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray5, intArray14);
        int[] intArray19 = new int[] { 1, 1, 100 };
        int[] intArray21 = new int[] { (byte) -1 };
        int int22 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray19, intArray21);
        int[] intArray26 = new int[] { 1, 1, 100 };
        int[] intArray28 = new int[] { (byte) -1 };
        int int29 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray26, intArray28);
        int[] intArray32 = new int[] { 'a', 10 };
        int int33 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray28, intArray32);
        int[] intArray37 = new int[] { (byte) 1, (short) 1, (short) -1 };
        int int38 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray28, intArray37);
        int int39 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray21, intArray28);
        int[] intArray43 = new int[] { 1, 1, 100 };
        int[] intArray45 = new int[] { (byte) -1 };
        int int46 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray43, intArray45);
        int int47 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray21, intArray43);
        int[] intArray51 = new int[] { 1, 1, 100 };
        int[] intArray53 = new int[] { (byte) -1 };
        int int54 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray51, intArray53);
        int[] intArray57 = new int[] { 'a', 10 };
        int int58 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray53, intArray57);
        int int59 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray21, intArray53);
        int[] intArray63 = new int[] { 1, 1, 100 };
        int[] intArray65 = new int[] { (byte) -1 };
        int int66 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray63, intArray65);
        int[] intArray70 = new int[] { 1, 1, 100 };
        int[] intArray72 = new int[] { (byte) -1 };
        int int73 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray70, intArray72);
        int[] intArray76 = new int[] { 'a', 10 };
        int int77 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray72, intArray76);
        int int78 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray63, intArray76);
        int int79 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray53, intArray76);
        int int80 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray14, intArray53);
        int[] intArray84 = new int[] { 1, 1, 100 };
        int[] intArray86 = new int[] { (byte) -1 };
        int int87 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray84, intArray86);
        int[] intArray93 = new int[] { (byte) 10, (byte) 100, ' ', (short) -1, (short) 100 };
        int int94 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray86, intArray93);
        int int95 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray53, intArray86);
        java.lang.Class<?> wildcardClass96 = intArray53.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[1, 1, -1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[-1]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[-1]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[1, 1, -1]");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray43), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray45), "[-1]");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray51), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray53), "[-1]");
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray57), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray63), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray65), "[-1]");
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertNotNull(intArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray70), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray72), "[-1]");
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertNotNull(intArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray76), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + (-1) + "'", int77 == (-1));
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + (-1) + "'", int79 == (-1));
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + (-1) + "'", int80 == (-1));
        org.junit.Assert.assertNotNull(intArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray84), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray86), "[-1]");
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + (-1) + "'", int87 == (-1));
        org.junit.Assert.assertNotNull(intArray93);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray93), "[10, 100, 32, -1, 100]");
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + (-1) + "'", int94 == (-1));
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + 0 + "'", int95 == 0);
        org.junit.Assert.assertNotNull(wildcardClass96);
    }

    @Test
    public void test02853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02853");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(729.0184993438161d, 676.3422283448025d, 981.7729625674999d, 441.86431325028315d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 487.2323783182032d + "'", double4 == 487.2323783182032d);
    }

    @Test
    public void test02854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02854");
        double[] doubleArray1 = new double[] { (short) 0 };
        double[] doubleArray6 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray7 = new double[] {};
        double double9 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray6, doubleArray7, 0);
        double[] doubleArray14 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray15 = new double[] {};
        double double17 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray14, doubleArray15, 0);
        double double19 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray6, doubleArray15, (int) (short) 100);
        double double21 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray1, doubleArray6, 1);
        double[] doubleArray26 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray27 = new double[] {};
        double double29 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray26, doubleArray27, 0);
        double[] doubleArray34 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray35 = new double[] {};
        double double37 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray34, doubleArray35, 0);
        double[] doubleArray42 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray43 = new double[] {};
        double double45 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray42, doubleArray43, 0);
        double double47 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray34, doubleArray43, (int) (short) 100);
        double[] doubleArray52 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray53 = new double[] {};
        double double55 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray52, doubleArray53, 0);
        double double57 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray43, doubleArray52, (int) (short) 100);
        double double59 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray27, doubleArray43, (int) '4');
        double[] doubleArray64 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray65 = new double[] {};
        double double67 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray64, doubleArray65, 0);
        double[] doubleArray72 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray73 = new double[] {};
        double double75 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray72, doubleArray73, 0);
        double double77 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray64, doubleArray73, (int) (short) 100);
        double[] doubleArray82 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray83 = new double[] {};
        double double85 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray82, doubleArray83, 0);
        double double87 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray73, doubleArray82, (int) (short) 100);
        double double89 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray43, doubleArray82, 26);
        double double91 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray6, doubleArray43, 26);
        java.lang.Class<?> wildcardClass92 = doubleArray43.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[0.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[]");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.0d) + "'", double19 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1.0d) + "'", double21 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[]");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + (-1.0d) + "'", double29 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[]");
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + (-1.0d) + "'", double37 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[]");
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + (-1.0d) + "'", double45 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + (-1.0d) + "'", double47 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[]");
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + (-1.0d) + "'", double55 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + (-1.0d) + "'", double57 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 0.0d + "'", double59 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray65), "[]");
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + (-1.0d) + "'", double67 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray72), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray73), "[]");
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + (-1.0d) + "'", double75 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + (-1.0d) + "'", double77 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray82), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray83), "[]");
        org.junit.Assert.assertTrue("'" + double85 + "' != '" + (-1.0d) + "'", double85 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double87 + "' != '" + (-1.0d) + "'", double87 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double89 + "' != '" + (-1.0d) + "'", double89 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double91 + "' != '" + (-1.0d) + "'", double91 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass92);
    }

    @Test
    public void test02855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02855");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1796.010984487501d, 825.3751255731883d, 1132.4450013621713d, 1050.7876424943584d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 997.8364812996736d + "'", double4 == 997.8364812996736d);
    }

    @Test
    public void test02856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02856");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(110.55299721646323d, 144.3969578381549d, 0.0d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 254.9499550546181d + "'", double4 == 254.9499550546181d);
    }

    @Test
    public void test02857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02857");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(823.2048226688985d, 2694.5778500277124d, 494.7772317573717d, 200.15176335734705d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2822.853677581892d + "'", double4 == 2822.853677581892d);
    }

    @Test
    public void test02858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02858");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(590.1769828638132d, 784.2049386362926d, 1117.4402236439857d, 132.64218988096647d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1178.8259895354986d + "'", double4 == 1178.8259895354986d);
    }

    @Test
    public void test02859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02859");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(966.2253882053817d, 980.2263420235763d, 296.1178470459708d, 403.9037707077835d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1246.4301124752037d + "'", double4 == 1246.4301124752037d);
    }

    @Test
    public void test02860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02860");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(679.9856732867083d, (double) 0L, 1860.4068879497572d, 200.15176335734705d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1274.21930025592d + "'", double4 == 1274.21930025592d);
    }

    @Test
    public void test02861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02861");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(422.70616878417604d, 231.4923541816547d, 100.4987562112089d, 803.8665608360225d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 499.100051278382d + "'", double4 == 499.100051278382d);
    }

    @Test
    public void test02862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02862");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(429.36693750886025d, 413.2305922118328d, 728.7328190589028d, 156.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 556.5964737618754d + "'", double4 == 556.5964737618754d);
    }

    @Test
    public void test02863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02863");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(879.8033576502743d, 1357.3729401151645d, 486.6751676493515d, 590.1769828638132d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1160.324147252274d + "'", double4 == 1160.324147252274d);
    }

    @Test
    public void test02864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02864");
        double[] doubleArray4 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray5 = new double[] {};
        double double7 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray4, doubleArray5, 0);
        double[] doubleArray12 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray13 = new double[] {};
        double double15 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray12, doubleArray13, 0);
        double[] doubleArray21 = new double[] { 232.4213562373095d, (short) 0, 1.0f, 75.85073476263909d, (-1L) };
        double double23 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray13, doubleArray21, (int) (byte) -1);
        double[] doubleArray28 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray29 = new double[] {};
        double double31 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray28, doubleArray29, 0);
        double[] doubleArray36 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray37 = new double[] {};
        double double39 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray36, doubleArray37, 0);
        double double41 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray28, doubleArray37, (int) (short) 100);
        double[] doubleArray44 = new double[] { (byte) 0, 132.0d };
        double double46 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray37, doubleArray44, (int) '4');
        double[] doubleArray51 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray52 = new double[] {};
        double double54 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray51, doubleArray52, 0);
        double[] doubleArray60 = new double[] { 232.4213562373095d, (short) 0, 1.0f, 75.85073476263909d, (-1L) };
        double double62 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray52, doubleArray60, (int) (byte) -1);
        double[] doubleArray67 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray68 = new double[] {};
        double double70 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray67, doubleArray68, 0);
        double[] doubleArray75 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray76 = new double[] {};
        double double78 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray75, doubleArray76, 0);
        double double80 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray67, doubleArray76, (int) (short) 100);
        double[] doubleArray85 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray86 = new double[] {};
        double double88 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray85, doubleArray86, 0);
        double double90 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray67, doubleArray85, (int) (byte) 0);
        double double92 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray60, doubleArray85, (int) (short) 100);
        double double94 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray37, doubleArray60, (int) (short) -1);
        double double96 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray21, doubleArray60, (int) (byte) -1);
        double double98 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray5, doubleArray21, (int) '4');
        java.lang.Class<?> wildcardClass99 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[232.4213562373095, 0.0, 1.0, 75.85073476263909, -1.0]");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-1.0d) + "'", double23 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[]");
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + (-1.0d) + "'", double31 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[]");
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + (-1.0d) + "'", double39 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + (-1.0d) + "'", double41 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[0.0, 132.0]");
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + (-1.0d) + "'", double46 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[]");
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + (-1.0d) + "'", double54 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[232.4213562373095, 0.0, 1.0, 75.85073476263909, -1.0]");
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + (-1.0d) + "'", double62 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray67), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray68), "[]");
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + (-1.0d) + "'", double70 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray75), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray76), "[]");
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + (-1.0d) + "'", double78 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double80 + "' != '" + (-1.0d) + "'", double80 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray85), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray86), "[]");
        org.junit.Assert.assertTrue("'" + double88 + "' != '" + (-1.0d) + "'", double88 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double90 + "' != '" + Double.POSITIVE_INFINITY + "'", double90 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double92 + "' != '" + (-1.0d) + "'", double92 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double94 + "' != '" + (-1.0d) + "'", double94 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double96 + "' != '" + 0.0d + "'", double96 == 0.0d);
        org.junit.Assert.assertTrue("'" + double98 + "' != '" + (-1.0d) + "'", double98 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass99);
    }

    @Test
    public void test02865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02865");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(614.1505664186741d, 88.2375286553044d, 0.0d, 718.1600363119974d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1244.073074075367d + "'", double4 == 1244.073074075367d);
    }

    @Test
    public void test02866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02866");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(486.1444817768018d, 1754.2553174822342d, 784.0374608938663d, 1945.7116823361646d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1489.656551006283d + "'", double4 == 1489.656551006283d);
    }

    @Test
    public void test02867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02867");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(0.0d, 144.3969578381549d, 602.6577198950658d, 718.8891071340651d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 938.0820197110341d + "'", double4 == 938.0820197110341d);
    }

    @Test
    public void test02868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02868");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(340.53058208047037d, 1948.9417153271818d, 669.205282796098d, 1829.2102125307836d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1524.5307806037201d + "'", double4 == 1524.5307806037201d);
    }

    @Test
    public void test02869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02869");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(935.8370962646457d, 0.0d, 0.0d, 426.4365981979791d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1065.4951610287171d + "'", double4 == 1065.4951610287171d);
    }

    @Test
    public void test02870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02870");
        int[] intArray3 = new int[] { 1, 1, 100 };
        int[] intArray5 = new int[] { (byte) -1 };
        int int6 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray3, intArray5);
        int[] intArray10 = new int[] { 1, 1, 100 };
        int[] intArray12 = new int[] { (byte) -1 };
        int int13 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray10, intArray12);
        int[] intArray16 = new int[] { 'a', 10 };
        int int17 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray12, intArray16);
        int[] intArray21 = new int[] { (byte) 1, (short) 1, (short) -1 };
        int int22 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray12, intArray21);
        int int23 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray5, intArray12);
        int[] intArray27 = new int[] { 1, 1, 100 };
        int[] intArray29 = new int[] { (byte) -1 };
        int int30 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray27, intArray29);
        int int31 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray5, intArray27);
        int[] intArray35 = new int[] { 1, 1, 100 };
        int[] intArray37 = new int[] { (byte) -1 };
        int int38 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray35, intArray37);
        int[] intArray41 = new int[] { 'a', 10 };
        int int42 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray37, intArray41);
        int[] intArray46 = new int[] { 1, 1, 100 };
        int[] intArray48 = new int[] { (byte) -1 };
        int int49 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray46, intArray48);
        int[] intArray53 = new int[] { 1, 1, 100 };
        int[] intArray55 = new int[] { (byte) -1 };
        int int56 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray53, intArray55);
        int[] intArray59 = new int[] { 'a', 10 };
        int int60 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray55, intArray59);
        int int61 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray46, intArray59);
        int int62 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray37, intArray46);
        int[] intArray66 = new int[] { 1, 1, 100 };
        int[] intArray68 = new int[] { (byte) -1 };
        int int69 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray66, intArray68);
        int[] intArray72 = new int[] { 'a', 10 };
        int int73 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray68, intArray72);
        int[] intArray77 = new int[] { (byte) 1, (short) 1, (short) -1 };
        int int78 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray68, intArray77);
        int int79 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray46, intArray68);
        int int80 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray27, intArray68);
        int[] intArray84 = new int[] { (byte) -1, (short) -1, ' ' };
        int[] intArray88 = new int[] { 1, 1, 100 };
        int[] intArray90 = new int[] { (byte) -1 };
        int int91 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray88, intArray90);
        int int92 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray84, intArray88);
        int int93 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray68, intArray84);
        java.lang.Class<?> wildcardClass94 = intArray68.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 1, -1]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[-1]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[-1]");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[-1]");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray53), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray55), "[-1]");
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray59), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertNotNull(intArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray66), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray68), "[-1]");
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
        org.junit.Assert.assertNotNull(intArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray72), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertNotNull(intArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray77), "[1, 1, -1]");
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + (-1) + "'", int79 == (-1));
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + (-1) + "'", int80 == (-1));
        org.junit.Assert.assertNotNull(intArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray84), "[-1, -1, 32]");
        org.junit.Assert.assertNotNull(intArray88);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray88), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray90);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray90), "[-1]");
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + (-1) + "'", int91 == (-1));
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 72 + "'", int92 == 72);
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + (-1) + "'", int93 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass94);
    }

    @Test
    public void test02871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02871");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(244.13720139709324d, 780.9621260792533d, 605.3411715595164d, 1317.955722121542d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 898.197566204712d + "'", double4 == 898.197566204712d);
    }

    @Test
    public void test02872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02872");
        double[] doubleArray4 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray5 = new double[] {};
        double double7 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray4, doubleArray5, 0);
        double[] doubleArray12 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray13 = new double[] {};
        double double15 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray12, doubleArray13, 0);
        double double17 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray5, doubleArray13, (int) (byte) 1);
        double[] doubleArray22 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray23 = new double[] {};
        double double25 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray22, doubleArray23, 0);
        double[] doubleArray30 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray31 = new double[] {};
        double double33 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray30, doubleArray31, 0);
        double[] doubleArray38 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray39 = new double[] {};
        double double41 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray38, doubleArray39, 0);
        double double43 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray30, doubleArray39, 1);
        double double45 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray23, doubleArray39, (int) (short) 10);
        double double47 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray13, doubleArray23, (int) ' ');
        java.lang.Class<?> wildcardClass48 = doubleArray13.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[]");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-1.0d) + "'", double25 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[]");
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + (-1.0d) + "'", double33 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[]");
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + (-1.0d) + "'", double41 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + (-1.0d) + "'", double43 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.0d + "'", double45 == 0.0d);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.0d + "'", double47 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test02873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02873");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(828.6293915546679d, 833.2404484695342d, 226.69203958814956d, 136.9096390986464d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1298.2681613374061d + "'", double4 == 1298.2681613374061d);
    }

    @Test
    public void test02874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02874");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(691.9161973683077d, 821.2629173622472d, 2548.18217586309d, 236.7589786659278d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1911.253901671381d + "'", double4 == 1911.253901671381d);
    }

    @Test
    public void test02875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02875");
        double[] doubleArray4 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray5 = new double[] {};
        double double7 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray4, doubleArray5, 0);
        double[] doubleArray12 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray13 = new double[] {};
        double double15 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray12, doubleArray13, 0);
        double double17 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray4, doubleArray13, (int) (short) 100);
        java.lang.Class<?> wildcardClass18 = doubleArray13.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test02876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02876");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(665.4510980134135d, 508.5647858466356d, 533.7322743943777d, 955.7878825142769d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 578.9419202866771d + "'", double4 == 578.9419202866771d);
    }

    @Test
    public void test02877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02877");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(886.0644611424128d, 590.3802649016793d, 1159.7502235336701d, 627.382046416377d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 376.5906109081539d + "'", double4 == 376.5906109081539d);
    }

    @Test
    public void test02878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02878");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(336.9767708108019d, 221.99500012499374d, 896.632439101549d, 339.74650298461927d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 677.4071711503727d + "'", double4 == 677.4071711503727d);
    }

    @Test
    public void test02879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02879");
        int[] intArray3 = new int[] { 1, 1, 100 };
        int[] intArray5 = new int[] { (byte) -1 };
        int int6 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray3, intArray5);
        int[] intArray9 = new int[] { 'a', 10 };
        int int10 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray5, intArray9);
        int[] intArray14 = new int[] { 1, 1, 100 };
        int[] intArray16 = new int[] { (byte) -1 };
        int int17 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray14, intArray16);
        int[] intArray21 = new int[] { 1, 1, 100 };
        int[] intArray23 = new int[] { (byte) -1 };
        int int24 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray21, intArray23);
        int[] intArray27 = new int[] { 'a', 10 };
        int int28 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray23, intArray27);
        int int29 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray14, intArray27);
        int int30 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray5, intArray14);
        int[] intArray34 = new int[] { 1, 1, 100 };
        int[] intArray36 = new int[] { (byte) -1 };
        int int37 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray34, intArray36);
        int[] intArray41 = new int[] { 1, 1, 100 };
        int[] intArray43 = new int[] { (byte) -1 };
        int int44 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray41, intArray43);
        int[] intArray47 = new int[] { 'a', 10 };
        int int48 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray43, intArray47);
        int int49 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray34, intArray47);
        int int50 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray5, intArray47);
        int[] intArray54 = new int[] { 1, 1, 100 };
        int[] intArray56 = new int[] { (byte) -1 };
        int int57 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray54, intArray56);
        int[] intArray60 = new int[] { 'a', 10 };
        int int61 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray56, intArray60);
        int[] intArray65 = new int[] { 1, 1, 100 };
        int[] intArray67 = new int[] { (byte) -1 };
        int int68 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray65, intArray67);
        int[] intArray72 = new int[] { 1, 1, 100 };
        int[] intArray74 = new int[] { (byte) -1 };
        int int75 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray72, intArray74);
        int[] intArray78 = new int[] { 'a', 10 };
        int int79 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray74, intArray78);
        int int80 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray65, intArray78);
        int int81 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray56, intArray65);
        int int82 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray47, intArray56);
        int[] intArray83 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int84 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray47, intArray83);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"b2\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[-1]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[-1]");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray43), "[-1]");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray54), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray56), "[-1]");
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray60), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray65), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray67), "[-1]");
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertNotNull(intArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray72), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray74), "[-1]");
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
        org.junit.Assert.assertNotNull(intArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray78), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + (-1) + "'", int79 == (-1));
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + (-1) + "'", int80 == (-1));
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + (-1) + "'", int81 == (-1));
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + (-1) + "'", int82 == (-1));
    }

    @Test
    public void test02880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02880");
        double[] doubleArray4 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray5 = new double[] {};
        double double7 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray4, doubleArray5, 0);
        double[] doubleArray12 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray13 = new double[] {};
        double double15 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray12, doubleArray13, 0);
        double double17 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray4, doubleArray13, (int) (short) 100);
        double[] doubleArray22 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray23 = new double[] {};
        double double25 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray22, doubleArray23, 0);
        double[] doubleArray30 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray31 = new double[] {};
        double double33 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray30, doubleArray31, 0);
        double double35 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray23, doubleArray31, (int) (byte) 1);
        double double37 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray13, doubleArray31, 0);
        double[] doubleArray42 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray43 = new double[] {};
        double double45 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray42, doubleArray43, 0);
        double[] doubleArray50 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray51 = new double[] {};
        double double53 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray50, doubleArray51, 0);
        double double55 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray42, doubleArray51, (int) (short) 100);
        double double57 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray31, doubleArray51, (int) (short) 1);
        double[] doubleArray62 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray63 = new double[] {};
        double double65 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray62, doubleArray63, 0);
        double[] doubleArray70 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray71 = new double[] {};
        double double73 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray70, doubleArray71, 0);
        double double75 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray62, doubleArray71, (int) (short) 100);
        double double77 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray31, doubleArray62, (int) (byte) 0);
        java.lang.Class<?> wildcardClass78 = doubleArray62.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[]");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-1.0d) + "'", double25 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[]");
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + (-1.0d) + "'", double33 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[]");
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + (-1.0d) + "'", double45 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[]");
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + (-1.0d) + "'", double53 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + (-1.0d) + "'", double55 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 0.0d + "'", double57 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray62), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[]");
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + (-1.0d) + "'", double65 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray70), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray71), "[]");
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + (-1.0d) + "'", double73 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + (-1.0d) + "'", double75 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + (-1.0d) + "'", double77 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass78);
    }

    @Test
    public void test02881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02881");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(605.9155468135754d, 224.76550746286068d, 167.76644024403632d, 518.7150125837679d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 446.7421770525469d + "'", double4 == 446.7421770525469d);
    }

    @Test
    public void test02882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02882");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(515.3008802650451d, 206.8413115591487d, 702.9647896666105d, 220.238507078122d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 349.68492527213414d + "'", double4 == 349.68492527213414d);
    }

    @Test
    public void test02883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02883");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(674.6394035036492d, 1741.486649791941d, 313.4536530943542d, 507.9530588091043d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1594.7193413921318d + "'", double4 == 1594.7193413921318d);
    }

    @Test
    public void test02884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02884");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(849.2467365693465d, 556.9757457476818d, 174.15406001316165d, 245.39699806137992d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 905.7508645515792d + "'", double4 == 905.7508645515792d);
    }

    @Test
    public void test02885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02885");
        int[] intArray0 = null;
        int[] intArray4 = new int[] { 1, 1, 100 };
        int[] intArray6 = new int[] { (byte) -1 };
        int int7 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray4, intArray6);
        int[] intArray13 = new int[] { (byte) 10, (byte) 100, ' ', (short) -1, (short) 100 };
        int int14 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray6, intArray13);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray0, intArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 100, 32, -1, 100]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test02886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02886");
        int[] intArray3 = new int[] { 1, 1, 100 };
        int[] intArray5 = new int[] { (byte) -1 };
        int int6 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray3, intArray5);
        int[] intArray10 = new int[] { 1, 1, 100 };
        int[] intArray12 = new int[] { (byte) -1 };
        int int13 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray10, intArray12);
        int[] intArray16 = new int[] { 'a', 10 };
        int int17 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray12, intArray16);
        int[] intArray21 = new int[] { (byte) 1, (short) 1, (short) -1 };
        int int22 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray12, intArray21);
        int int23 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray5, intArray12);
        int[] intArray27 = new int[] { 1, 1, 100 };
        int[] intArray29 = new int[] { (byte) -1 };
        int int30 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray27, intArray29);
        int int31 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray5, intArray27);
        int[] intArray35 = new int[] { 1, 1, 100 };
        int[] intArray37 = new int[] { (byte) -1 };
        int int38 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray35, intArray37);
        int[] intArray41 = new int[] { 'a', 10 };
        int int42 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray37, intArray41);
        int[] intArray46 = new int[] { 1, 1, 100 };
        int[] intArray48 = new int[] { (byte) -1 };
        int int49 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray46, intArray48);
        int[] intArray53 = new int[] { 1, 1, 100 };
        int[] intArray55 = new int[] { (byte) -1 };
        int int56 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray53, intArray55);
        int[] intArray59 = new int[] { 'a', 10 };
        int int60 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray55, intArray59);
        int int61 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray46, intArray59);
        int int62 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray37, intArray46);
        int[] intArray66 = new int[] { 1, 1, 100 };
        int[] intArray68 = new int[] { (byte) -1 };
        int int69 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray66, intArray68);
        int[] intArray72 = new int[] { 'a', 10 };
        int int73 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray68, intArray72);
        int[] intArray77 = new int[] { (byte) 1, (short) 1, (short) -1 };
        int int78 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray68, intArray77);
        int int79 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray46, intArray68);
        int int80 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray27, intArray68);
        java.lang.Class<?> wildcardClass81 = intArray68.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 1, -1]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[-1]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[-1]");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[-1]");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray53), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray55), "[-1]");
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray59), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertNotNull(intArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray66), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray68), "[-1]");
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
        org.junit.Assert.assertNotNull(intArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray72), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertNotNull(intArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray77), "[1, 1, -1]");
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + (-1) + "'", int79 == (-1));
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + (-1) + "'", int80 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass81);
    }

    @Test
    public void test02887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02887");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(679.2205484716004d, 448.5118411552872d, 0.0d, 1567.0660655906124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1797.7747729069256d + "'", double4 == 1797.7747729069256d);
    }

    @Test
    public void test02888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02888");
        double[] doubleArray0 = null;
        double[] doubleArray5 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray6 = new double[] {};
        double double8 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray5, doubleArray6, 0);
        double[] doubleArray13 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray14 = new double[] {};
        double double16 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray13, doubleArray14, 0);
        double double18 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray5, doubleArray14, (int) (short) 100);
        double[] doubleArray21 = new double[] { (byte) 0, 132.0d };
        double double23 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray14, doubleArray21, (int) '4');
        double[] doubleArray28 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray29 = new double[] {};
        double double31 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray28, doubleArray29, 0);
        double[] doubleArray37 = new double[] { 232.4213562373095d, (short) 0, 1.0f, 75.85073476263909d, (-1L) };
        double double39 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray29, doubleArray37, (int) (byte) -1);
        double[] doubleArray44 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray45 = new double[] {};
        double double47 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray44, doubleArray45, 0);
        double[] doubleArray52 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray53 = new double[] {};
        double double55 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray52, doubleArray53, 0);
        double double57 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray44, doubleArray53, (int) (short) 100);
        double[] doubleArray62 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray63 = new double[] {};
        double double65 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray62, doubleArray63, 0);
        double double67 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray44, doubleArray62, (int) (byte) 0);
        double double69 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray37, doubleArray62, (int) (short) 100);
        double double71 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray14, doubleArray37, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            double double73 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray0, doubleArray37, 101);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"p1\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[]");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[]");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.0d) + "'", double18 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[0.0, 132.0]");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-1.0d) + "'", double23 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[]");
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + (-1.0d) + "'", double31 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[232.4213562373095, 0.0, 1.0, 75.85073476263909, -1.0]");
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + (-1.0d) + "'", double39 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[]");
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + (-1.0d) + "'", double47 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[]");
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + (-1.0d) + "'", double55 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + (-1.0d) + "'", double57 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray62), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[]");
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + (-1.0d) + "'", double65 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + Double.POSITIVE_INFINITY + "'", double67 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + (-1.0d) + "'", double69 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + (-1.0d) + "'", double71 == (-1.0d));
    }

    @Test
    public void test02889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02889");
        double[] doubleArray4 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray5 = new double[] {};
        double double7 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray4, doubleArray5, 0);
        double[] doubleArray12 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray13 = new double[] {};
        double double15 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray12, doubleArray13, 0);
        double double17 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray5, doubleArray13, (int) (byte) 1);
        double[] doubleArray22 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray23 = new double[] {};
        double double25 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray22, doubleArray23, 0);
        double[] doubleArray30 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray31 = new double[] {};
        double double33 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray30, doubleArray31, 0);
        double[] doubleArray38 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray39 = new double[] {};
        double double41 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray38, doubleArray39, 0);
        double double43 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray30, doubleArray39, 1);
        double double45 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray23, doubleArray39, (int) (short) 10);
        double double47 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray13, doubleArray23, (int) ' ');
        double[] doubleArray48 = new double[] {};
        double double50 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray23, doubleArray48, 101);
        double[] doubleArray55 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray56 = new double[] {};
        double double58 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray55, doubleArray56, 0);
        double[] doubleArray63 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray64 = new double[] {};
        double double66 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray63, doubleArray64, 0);
        double double68 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray55, doubleArray64, (int) (short) 100);
        double[] doubleArray73 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray74 = new double[] {};
        double double76 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray73, doubleArray74, 0);
        double double78 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray64, doubleArray73, (int) (short) 100);
        double double80 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray23, doubleArray73, (int) '#');
        java.lang.Class<?> wildcardClass81 = doubleArray23.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[]");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-1.0d) + "'", double25 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[]");
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + (-1.0d) + "'", double33 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[]");
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + (-1.0d) + "'", double41 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + (-1.0d) + "'", double43 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.0d + "'", double45 == 0.0d);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.0d + "'", double47 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[]");
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray56), "[]");
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + (-1.0d) + "'", double58 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[]");
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + (-1.0d) + "'", double66 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + (-1.0d) + "'", double68 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray73), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray74), "[]");
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + (-1.0d) + "'", double76 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + (-1.0d) + "'", double78 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double80 + "' != '" + (-1.0d) + "'", double80 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass81);
    }

    @Test
    public void test02890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02890");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(286.88848007544675d, (double) (short) 1, 264.0d, 145.98524464748706d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 167.87372472293382d + "'", double4 == 167.87372472293382d);
    }

    @Test
    public void test02891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02891");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(182.19024591218871d, 0.0d, 754.8618148368492d, 1117.796061831161d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1690.4676307558216d + "'", double4 == 1690.4676307558216d);
    }

    @Test
    public void test02892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02892");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(197.91364154759924d, 1532.6762509565908d, 1530.406411122999d, 969.5274756057248d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1895.6415449262659d + "'", double4 == 1895.6415449262659d);
    }

    @Test
    public void test02893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02893");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(643.9042115403038d, 155.2389314063153d, 779.8923271374493d, 1039.407111645567d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1020.1562958363974d + "'", double4 == 1020.1562958363974d);
    }

    @Test
    public void test02894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02894");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(533.3857283874163d, 672.7658533665345d, 446.7421770525469d, (double) 186);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 358.02786103203465d + "'", double4 == 358.02786103203465d);
    }

    @Test
    public void test02895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02895");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1014.7240192916356d, 206.8413115591487d, 622.4835640535658d, 1524.5307806037201d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1709.9299242826414d + "'", double4 == 1709.9299242826414d);
    }

    @Test
    public void test02896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02896");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(58.216600569028486d, 106.68198585867175d, 605.3411715595164d, 664.3431501479369d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 816.538235654619d + "'", double4 == 816.538235654619d);
    }

    @Test
    public void test02897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02897");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(494.7772317573717d, 625.7199020892954d, 1014.1739389210353d, 1332.2199015767492d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 985.4355202887014d + "'", double4 == 985.4355202887014d);
    }

    @Test
    public void test02898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02898");
        double[] doubleArray4 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray5 = new double[] {};
        double double7 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray4, doubleArray5, 0);
        double[] doubleArray13 = new double[] { 232.4213562373095d, (short) 0, 1.0f, 75.85073476263909d, (-1L) };
        double double15 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray5, doubleArray13, (int) (byte) -1);
        double[] doubleArray20 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray21 = new double[] {};
        double double23 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray20, doubleArray21, 0);
        double[] doubleArray28 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray29 = new double[] {};
        double double31 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray28, doubleArray29, 0);
        double double33 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray20, doubleArray29, 1);
        double[] doubleArray38 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray39 = new double[] {};
        double double41 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray38, doubleArray39, 0);
        double[] doubleArray46 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray47 = new double[] {};
        double double49 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray46, doubleArray47, 0);
        double double51 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray39, doubleArray47, (int) (byte) 1);
        double[] doubleArray56 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray57 = new double[] {};
        double double59 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray56, doubleArray57, 0);
        double[] doubleArray64 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray65 = new double[] {};
        double double67 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray64, doubleArray65, 0);
        double double69 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray57, doubleArray65, (int) (byte) 1);
        double double71 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray39, doubleArray57, (int) (short) 0);
        double double73 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray29, doubleArray57, 0);
        double double75 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray13, doubleArray29, (int) (byte) 10);
        java.lang.Class<?> wildcardClass76 = doubleArray13.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[232.4213562373095, 0.0, 1.0, 75.85073476263909, -1.0]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[]");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-1.0d) + "'", double23 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[]");
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + (-1.0d) + "'", double31 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + (-1.0d) + "'", double33 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[]");
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + (-1.0d) + "'", double41 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[]");
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + (-1.0d) + "'", double49 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 0.0d + "'", double51 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray56), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[]");
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + (-1.0d) + "'", double59 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray65), "[]");
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + (-1.0d) + "'", double67 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 0.0d + "'", double69 == 0.0d);
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 0.0d + "'", double71 == 0.0d);
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + 0.0d + "'", double73 == 0.0d);
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + (-1.0d) + "'", double75 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass76);
    }

    @Test
    public void test02899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02899");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1790.7743259911974d, 183.29761062832108d, 286.77276777452346d, 1532.6762509565908d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1525.9866655560106d + "'", double4 == 1525.9866655560106d);
    }

    @Test
    public void test02900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02900");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(629.5888270616556d, 1370.939463128285d, 426.4365981979791d, 1069.4224285354492d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 504.6692634565124d + "'", double4 == 504.6692634565124d);
    }

    @Test
    public void test02901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02901");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(621.6515574452047d, 284.69002088953687d, 283.7811747592152d, 1173.0068643841632d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1226.1872261806159d + "'", double4 == 1226.1872261806159d);
    }

    @Test
    public void test02902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02902");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(588.7272878990773d, 1374.7158255799427d, 1006.4589976708653d, 243.14774917259138d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1549.2997861791393d + "'", double4 == 1549.2997861791393d);
    }

    @Test
    public void test02903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02903");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(0.0d, 199.9966375835254d, 1267.400893421706d, 1233.710556947929d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1768.7133071730161d + "'", double4 == 1768.7133071730161d);
    }

    @Test
    public void test02904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02904");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(101.79250162264779d, 383.6847775335497d, 287.6841281443828d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 569.5764040552847d + "'", double4 == 569.5764040552847d);
    }

    @Test
    public void test02905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02905");
        double[] doubleArray0 = null;
        double[] doubleArray5 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray6 = new double[] {};
        double double8 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray5, doubleArray6, 0);
        double[] doubleArray13 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray14 = new double[] {};
        double double16 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray13, doubleArray14, 0);
        double double18 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray6, doubleArray14, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            double double20 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray0, doubleArray14, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"p1\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[]");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[]");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test02906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02906");
        double[] doubleArray4 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray5 = new double[] {};
        double double7 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray4, doubleArray5, 0);
        double[] doubleArray12 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray13 = new double[] {};
        double double15 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray12, doubleArray13, 0);
        double double17 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray4, doubleArray13, (int) (short) 100);
        double[] doubleArray20 = new double[] { (byte) 0, 132.0d };
        double double22 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray13, doubleArray20, (int) '4');
        double[] doubleArray24 = new double[] { (short) 0 };
        double[] doubleArray29 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray30 = new double[] {};
        double double32 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray29, doubleArray30, 0);
        double[] doubleArray37 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray38 = new double[] {};
        double double40 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray37, doubleArray38, 0);
        double double42 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray29, doubleArray38, (int) (short) 100);
        double double44 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray24, doubleArray29, 1);
        double double46 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray20, doubleArray29, 1);
        double[] doubleArray51 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray52 = new double[] {};
        double double54 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray51, doubleArray52, 0);
        double[] doubleArray59 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray60 = new double[] {};
        double double62 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray59, doubleArray60, 0);
        double double64 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray52, doubleArray60, (int) (byte) 1);
        double[] doubleArray69 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray70 = new double[] {};
        double double72 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray69, doubleArray70, 0);
        double[] doubleArray77 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray78 = new double[] {};
        double double80 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray77, doubleArray78, 0);
        double double82 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray69, doubleArray78, (int) (short) 100);
        double[] doubleArray87 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray88 = new double[] {};
        double double90 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray87, doubleArray88, 0);
        double double92 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray78, doubleArray87, (int) (short) 100);
        double double94 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray60, doubleArray87, (int) (byte) 10);
        double double96 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray20, doubleArray60, 186);
        java.lang.Class<?> wildcardClass97 = doubleArray60.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[0.0, 132.0]");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-1.0d) + "'", double22 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[0.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[]");
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + (-1.0d) + "'", double32 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[]");
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + (-1.0d) + "'", double40 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + (-1.0d) + "'", double42 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + (-1.0d) + "'", double44 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + (-1.0d) + "'", double46 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[]");
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + (-1.0d) + "'", double54 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[]");
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + (-1.0d) + "'", double62 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 0.0d + "'", double64 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray69), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray70), "[]");
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + (-1.0d) + "'", double72 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray77), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray78), "[]");
        org.junit.Assert.assertTrue("'" + double80 + "' != '" + (-1.0d) + "'", double80 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + (-1.0d) + "'", double82 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray87);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray87), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray88);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray88), "[]");
        org.junit.Assert.assertTrue("'" + double90 + "' != '" + (-1.0d) + "'", double90 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double92 + "' != '" + (-1.0d) + "'", double92 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double94 + "' != '" + (-1.0d) + "'", double94 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double96 + "' != '" + (-1.0d) + "'", double96 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass97);
    }

    @Test
    public void test02907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02907");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(490.25700073760834d, (double) (short) -1, 702.9647896666105d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 534.4123223161123d + "'", double4 == 534.4123223161123d);
    }

    @Test
    public void test02908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02908");
        int[] intArray3 = new int[] { 1, 1, 100 };
        int[] intArray5 = new int[] { (byte) -1 };
        int int6 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray3, intArray5);
        int[] intArray9 = new int[] { 'a', 10 };
        int int10 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray5, intArray9);
        int[] intArray14 = new int[] { 1, 1, 100 };
        int[] intArray16 = new int[] { (byte) -1 };
        int int17 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray14, intArray16);
        int[] intArray21 = new int[] { 1, 1, 100 };
        int[] intArray23 = new int[] { (byte) -1 };
        int int24 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray21, intArray23);
        int[] intArray27 = new int[] { 'a', 10 };
        int int28 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray23, intArray27);
        int[] intArray32 = new int[] { (byte) 1, (short) 1, (short) -1 };
        int int33 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray23, intArray32);
        int int34 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray16, intArray23);
        int[] intArray38 = new int[] { 1, 1, 100 };
        int[] intArray40 = new int[] { (byte) -1 };
        int int41 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray38, intArray40);
        int int42 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray16, intArray38);
        int[] intArray46 = new int[] { 1, 1, 100 };
        int[] intArray48 = new int[] { (byte) -1 };
        int int49 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray46, intArray48);
        int[] intArray52 = new int[] { 'a', 10 };
        int int53 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray48, intArray52);
        int int54 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray16, intArray48);
        int[] intArray58 = new int[] { 1, 1, 100 };
        int[] intArray60 = new int[] { (byte) -1 };
        int int61 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray58, intArray60);
        int[] intArray65 = new int[] { 1, 1, 100 };
        int[] intArray67 = new int[] { (byte) -1 };
        int int68 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray65, intArray67);
        int[] intArray71 = new int[] { 'a', 10 };
        int int72 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray67, intArray71);
        int int73 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray58, intArray71);
        int int74 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray48, intArray71);
        int int75 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray5, intArray71);
        int[] intArray79 = new int[] { 1, 1, 100 };
        int[] intArray81 = new int[] { (byte) -1 };
        int int82 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray79, intArray81);
        int int83 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray71, intArray79);
        java.lang.Class<?> wildcardClass84 = intArray71.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[-1]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[1, 1, -1]");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[-1]");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[-1]");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray52), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray58), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray60), "[-1]");
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray65), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray67), "[-1]");
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertNotNull(intArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray71), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-1) + "'", int72 == (-1));
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
        org.junit.Assert.assertNotNull(intArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray79), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray81), "[-1]");
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + (-1) + "'", int82 == (-1));
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + (-1) + "'", int83 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass84);
    }

    @Test
    public void test02909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02909");
        double[] doubleArray4 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray5 = new double[] {};
        double double7 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray4, doubleArray5, 0);
        double[] doubleArray12 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray13 = new double[] {};
        double double15 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray12, doubleArray13, 0);
        double double17 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray4, doubleArray13, (int) (short) 100);
        double[] doubleArray20 = new double[] { (byte) 0, 132.0d };
        double double22 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray13, doubleArray20, (int) '4');
        double[] doubleArray27 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray28 = new double[] {};
        double double30 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray27, doubleArray28, 0);
        double[] doubleArray35 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray36 = new double[] {};
        double double38 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray35, doubleArray36, 0);
        double[] doubleArray43 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray44 = new double[] {};
        double double46 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray43, doubleArray44, 0);
        double double48 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray35, doubleArray44, 1);
        double double50 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray28, doubleArray44, (int) (short) 10);
        double[] doubleArray55 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray56 = new double[] {};
        double double58 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray55, doubleArray56, 0);
        double[] doubleArray63 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray64 = new double[] {};
        double double66 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray63, doubleArray64, 0);
        double double68 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray55, doubleArray64, 1);
        double double70 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray44, doubleArray55, (int) '#');
        double[] doubleArray72 = new double[] { (short) 0 };
        double[] doubleArray77 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray78 = new double[] {};
        double double80 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray77, doubleArray78, 0);
        double[] doubleArray85 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray86 = new double[] {};
        double double88 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray85, doubleArray86, 0);
        double double90 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray77, doubleArray86, (int) (short) 100);
        double double92 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray72, doubleArray77, 1);
        double double94 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray44, doubleArray77, (int) (byte) 0);
        double double96 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray20, doubleArray77, (int) (short) -1);
        java.lang.Class<?> wildcardClass97 = doubleArray77.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[0.0, 132.0]");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-1.0d) + "'", double22 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[]");
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + (-1.0d) + "'", double30 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[]");
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + (-1.0d) + "'", double38 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[]");
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + (-1.0d) + "'", double46 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + (-1.0d) + "'", double48 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray56), "[]");
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + (-1.0d) + "'", double58 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[]");
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + (-1.0d) + "'", double66 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + (-1.0d) + "'", double68 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + (-1.0d) + "'", double70 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray72), "[0.0]");
        org.junit.Assert.assertNotNull(doubleArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray77), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray78), "[]");
        org.junit.Assert.assertTrue("'" + double80 + "' != '" + (-1.0d) + "'", double80 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray85), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray86), "[]");
        org.junit.Assert.assertTrue("'" + double88 + "' != '" + (-1.0d) + "'", double88 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double90 + "' != '" + (-1.0d) + "'", double90 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double92 + "' != '" + (-1.0d) + "'", double92 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double94 + "' != '" + (-1.0d) + "'", double94 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double96 + "' != '" + (-1.0d) + "'", double96 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass97);
    }

    @Test
    public void test02910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02910");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1376.2526188277607d, 109.09844337062745d, 254.3727246655306d, 479.33602837693195d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1436.3404426358663d + "'", double4 == 1436.3404426358663d);
    }

    @Test
    public void test02911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02911");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1344.3225833894705d, 930.1492272816134d, 0.0d, 945.7937458115363d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1359.9671019193934d + "'", double4 == 1359.9671019193934d);
    }

    @Test
    public void test02912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02912");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(532.5937039245571d, 379.4251428364147d, 333.91416128859964d, 431.87538762457024d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 251.12978742411298d + "'", double4 == 251.12978742411298d);
    }

    @Test
    public void test02913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02913");
        int[] intArray3 = new int[] { 1, 1, 100 };
        int[] intArray5 = new int[] { (byte) -1 };
        int int6 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray3, intArray5);
        int[] intArray9 = new int[] { 'a', 10 };
        int int10 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray5, intArray9);
        int[] intArray14 = new int[] { (byte) 1, (short) 1, (short) -1 };
        int int15 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray5, intArray14);
        int[] intArray19 = new int[] { 1, 1, 100 };
        int[] intArray21 = new int[] { (byte) -1 };
        int int22 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray19, intArray21);
        int[] intArray26 = new int[] { 1, 1, 100 };
        int[] intArray28 = new int[] { (byte) -1 };
        int int29 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray26, intArray28);
        int[] intArray32 = new int[] { 'a', 10 };
        int int33 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray28, intArray32);
        int[] intArray37 = new int[] { (byte) 1, (short) 1, (short) -1 };
        int int38 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray28, intArray37);
        int int39 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray21, intArray28);
        int[] intArray43 = new int[] { 1, 1, 100 };
        int[] intArray45 = new int[] { (byte) -1 };
        int int46 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray43, intArray45);
        int int47 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray21, intArray43);
        int[] intArray51 = new int[] { 1, 1, 100 };
        int[] intArray53 = new int[] { (byte) -1 };
        int int54 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray51, intArray53);
        int[] intArray57 = new int[] { 'a', 10 };
        int int58 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray53, intArray57);
        int int59 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray21, intArray53);
        int int60 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray14, intArray21);
        int[] intArray64 = new int[] { 1, 1, 100 };
        int[] intArray66 = new int[] { (byte) -1 };
        int int67 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray64, intArray66);
        int[] intArray70 = new int[] { 'a', 10 };
        int int71 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray66, intArray70);
        int[] intArray75 = new int[] { (byte) 1, (short) 1, (short) -1 };
        int int76 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray66, intArray75);
        int int77 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray21, intArray66);
        java.lang.Class<?> wildcardClass78 = intArray66.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[1, 1, -1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[-1]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[-1]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[1, 1, -1]");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray43), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray45), "[-1]");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray51), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray53), "[-1]");
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray57), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertNotNull(intArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray64), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray66), "[-1]");
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertNotNull(intArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray70), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertNotNull(intArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray75), "[1, 1, -1]");
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-1) + "'", int76 == (-1));
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertNotNull(wildcardClass78);
    }

    @Test
    public void test02914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02914");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(149.16705768146082d, 135.59014554237984d, 1601.8005269650744d, (double) 1.0f);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1460.1703575490526d + "'", double4 == 1460.1703575490526d);
    }

    @Test
    public void test02915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02915");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1314.012713163696d, 445.4371447615443d, 335.472956984172d, 296.6349750306253d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1411.593963033508d + "'", double4 == 1411.593963033508d);
    }

    @Test
    public void test02916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02916");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(943.279124792876d, 822.5426568831847d, (double) (short) 1, 914.40064189523d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 942.7215473271511d + "'", double4 == 942.7215473271511d);
    }

    @Test
    public void test02917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02917");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(351.7317554491893d, 548.6842561828317d, 1282.7825390543835d, 1497.0729541854828d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1476.0291403541248d + "'", double4 == 1476.0291403541248d);
    }

    @Test
    public void test02918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02918");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(643.9955869586861d, 322.2455649037498d, 175.09754101316523d, 277.1976496143225d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 513.9459612349482d + "'", double4 == 513.9459612349482d);
    }

    @Test
    public void test02919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02919");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(536.1815974651743d, 99.40824915468535d, 1182.569805869932d, 475.8773849871957d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 649.1951278370022d + "'", double4 == 649.1951278370022d);
    }

    @Test
    public void test02920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02920");
        double[] doubleArray4 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray5 = new double[] {};
        double double7 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray4, doubleArray5, 0);
        double[] doubleArray12 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray13 = new double[] {};
        double double15 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray12, doubleArray13, 0);
        double double17 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray4, doubleArray13, (int) (short) 100);
        double[] doubleArray20 = new double[] { (byte) 0, 132.0d };
        double double22 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray13, doubleArray20, (int) '4');
        double[] doubleArray27 = new double[] { 149.99500012499374d, Double.POSITIVE_INFINITY, 10, (byte) 100 };
        double double29 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray20, doubleArray27, (int) (byte) 0);
        double[] doubleArray34 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray35 = new double[] {};
        double double37 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray34, doubleArray35, 0);
        double[] doubleArray42 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray43 = new double[] {};
        double double45 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray42, doubleArray43, 0);
        double double47 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray34, doubleArray43, (int) (short) 100);
        double[] doubleArray52 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray53 = new double[] {};
        double double55 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray52, doubleArray53, 0);
        double[] doubleArray60 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray61 = new double[] {};
        double double63 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray60, doubleArray61, 0);
        double double65 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray53, doubleArray61, (int) (byte) 1);
        double double67 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray34, doubleArray53, (int) (short) -1);
        double[] doubleArray72 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray73 = new double[] {};
        double double75 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray72, doubleArray73, 0);
        double double77 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray34, doubleArray73, (int) (byte) -1);
        double double79 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray20, doubleArray73, 26);
        java.lang.Class<?> wildcardClass80 = doubleArray20.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[0.0, 132.0]");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-1.0d) + "'", double22 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[149.99500012499374, Infinity, 10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + (-1.0d) + "'", double29 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[]");
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + (-1.0d) + "'", double37 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[]");
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + (-1.0d) + "'", double45 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + (-1.0d) + "'", double47 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[]");
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + (-1.0d) + "'", double55 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[]");
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + (-1.0d) + "'", double63 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 0.0d + "'", double65 == 0.0d);
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + (-1.0d) + "'", double67 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray72), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray73), "[]");
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + (-1.0d) + "'", double75 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + (-1.0d) + "'", double77 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + (-1.0d) + "'", double79 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass80);
    }

    @Test
    public void test02921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02921");
        int[] intArray3 = new int[] { 1, 1, 100 };
        int[] intArray5 = new int[] { (byte) -1 };
        int int6 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray3, intArray5);
        int[] intArray9 = new int[] { 'a', 10 };
        int int10 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray5, intArray9);
        int[] intArray14 = new int[] { (byte) 1, (short) 1, (short) -1 };
        int int15 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray5, intArray14);
        int[] intArray19 = new int[] { 1, 1, 100 };
        int[] intArray21 = new int[] { (byte) -1 };
        int int22 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray19, intArray21);
        int[] intArray25 = new int[] { 'a', 10 };
        int int26 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray21, intArray25);
        int[] intArray30 = new int[] { 1, 1, 100 };
        int[] intArray32 = new int[] { (byte) -1 };
        int int33 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray30, intArray32);
        int[] intArray37 = new int[] { 1, 1, 100 };
        int[] intArray39 = new int[] { (byte) -1 };
        int int40 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray37, intArray39);
        int[] intArray43 = new int[] { 'a', 10 };
        int int44 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray39, intArray43);
        int int45 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray30, intArray43);
        int int46 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray21, intArray30);
        int int47 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray14, intArray21);
        int[] intArray51 = new int[] { 1, 1, 100 };
        int[] intArray53 = new int[] { (byte) -1 };
        int int54 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray51, intArray53);
        int[] intArray58 = new int[] { 1, 1, 100 };
        int[] intArray60 = new int[] { (byte) -1 };
        int int61 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray58, intArray60);
        int int62 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray51, intArray60);
        int int63 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray14, intArray51);
        int[] intArray67 = new int[] { '4', (short) 100, '#' };
        int int68 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray14, intArray67);
        java.lang.Class<?> wildcardClass69 = intArray67.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[1, 1, -1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[-1]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[-1]");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[-1]");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray43), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray51), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray53), "[-1]");
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray58), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray60), "[-1]");
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 101 + "'", int63 == 101);
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray67), "[52, 100, 35]");
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 186 + "'", int68 == 186);
        org.junit.Assert.assertNotNull(wildcardClass69);
    }

    @Test
    public void test02922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02922");
        double[] doubleArray4 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray5 = new double[] {};
        double double7 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray4, doubleArray5, 0);
        double[] doubleArray12 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray13 = new double[] {};
        double double15 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray12, doubleArray13, 0);
        double double17 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray4, doubleArray13, (int) (short) 100);
        double[] doubleArray22 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray23 = new double[] {};
        double double25 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray22, doubleArray23, 0);
        double double27 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray13, doubleArray22, (int) (short) 100);
        double[] doubleArray32 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray33 = new double[] {};
        double double35 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray32, doubleArray33, 0);
        double[] doubleArray40 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray41 = new double[] {};
        double double43 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray40, doubleArray41, 0);
        double[] doubleArray48 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray49 = new double[] {};
        double double51 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray48, doubleArray49, 0);
        double double53 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray40, doubleArray49, 1);
        double double55 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray33, doubleArray49, (int) (short) 10);
        double double57 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray13, doubleArray33, 100);
        double[] doubleArray62 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray63 = new double[] {};
        double double65 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray62, doubleArray63, 0);
        double[] doubleArray70 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray71 = new double[] {};
        double double73 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray70, doubleArray71, 0);
        double[] doubleArray78 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray79 = new double[] {};
        double double81 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray78, doubleArray79, 0);
        double double83 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray70, doubleArray79, 1);
        double double85 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray63, doubleArray70, (int) ' ');
        double double87 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray33, doubleArray63, (int) (short) 1);
        java.lang.Class<?> wildcardClass88 = doubleArray63.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[]");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-1.0d) + "'", double25 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + (-1.0d) + "'", double27 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[]");
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + (-1.0d) + "'", double35 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[]");
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + (-1.0d) + "'", double43 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[]");
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + (-1.0d) + "'", double51 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + (-1.0d) + "'", double53 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 0.0d + "'", double55 == 0.0d);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 0.0d + "'", double57 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray62), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[]");
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + (-1.0d) + "'", double65 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray70), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray71), "[]");
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + (-1.0d) + "'", double73 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray78), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray79), "[]");
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + (-1.0d) + "'", double81 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + (-1.0d) + "'", double83 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double85 + "' != '" + (-1.0d) + "'", double85 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double87 + "' != '" + 0.0d + "'", double87 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass88);
    }

    @Test
    public void test02923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02923");
        double[] doubleArray4 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray5 = new double[] {};
        double double7 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray4, doubleArray5, 0);
        double[] doubleArray12 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray13 = new double[] {};
        double double15 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray12, doubleArray13, 0);
        double double17 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray4, doubleArray13, (int) (short) 100);
        double[] doubleArray22 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray23 = new double[] {};
        double double25 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray22, doubleArray23, 0);
        double double27 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray4, doubleArray22, (int) (byte) 0);
        double[] doubleArray32 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray33 = new double[] {};
        double double35 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray32, doubleArray33, 0);
        double[] doubleArray40 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray41 = new double[] {};
        double double43 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray40, doubleArray41, 0);
        double double45 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray32, doubleArray41, (int) (short) 100);
        double[] doubleArray50 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray51 = new double[] {};
        double double53 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray50, doubleArray51, 0);
        double[] doubleArray58 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray59 = new double[] {};
        double double61 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray58, doubleArray59, 0);
        double double63 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray51, doubleArray59, (int) (byte) 1);
        double double65 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray32, doubleArray51, (int) (short) -1);
        double[] doubleArray70 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray71 = new double[] {};
        double double73 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray70, doubleArray71, 0);
        double double75 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray32, doubleArray71, (int) (byte) -1);
        double double77 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray22, doubleArray71, (-1));
        java.lang.Class<?> wildcardClass78 = doubleArray71.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[]");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-1.0d) + "'", double25 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + Double.POSITIVE_INFINITY + "'", double27 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[]");
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + (-1.0d) + "'", double35 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[]");
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + (-1.0d) + "'", double43 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + (-1.0d) + "'", double45 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[]");
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + (-1.0d) + "'", double53 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[]");
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + (-1.0d) + "'", double61 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 0.0d + "'", double63 == 0.0d);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + (-1.0d) + "'", double65 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray70), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray71), "[]");
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + (-1.0d) + "'", double73 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + (-1.0d) + "'", double75 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + (-1.0d) + "'", double77 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass78);
    }

    @Test
    public void test02924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02924");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(664.3431501479369d, 37.59251283876873d, 605.205537045175d, 1688.7772783557193d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1026.1396300310848d + "'", double4 == 1026.1396300310848d);
    }

    @Test
    public void test02925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02925");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(272.6868131092915d, 195.86115869725893d, 0.0d, 486.1444817768018d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 346.2979560388283d + "'", double4 == 346.2979560388283d);
    }

    @Test
    public void test02926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02926");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(319.6902425827283d, 363.5896205997675d, 0.0d, 820.1625256517515d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 593.8639215535189d + "'", double4 == 593.8639215535189d);
    }

    @Test
    public void test02927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02927");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(427.0954714739296d, 586.9333963249293d, 855.8409738812244d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1015.6788987322241d + "'", double4 == 1015.6788987322241d);
    }

    @Test
    public void test02928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02928");
        int[] intArray3 = new int[] { 1, 1, 100 };
        int[] intArray5 = new int[] { (byte) -1 };
        int int6 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray3, intArray5);
        int[] intArray12 = new int[] { (byte) 10, (byte) 100, ' ', (short) -1, (short) 100 };
        int int13 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray5, intArray12);
        int[] intArray17 = new int[] { 1, 1, 100 };
        int[] intArray19 = new int[] { (byte) -1 };
        int int20 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray17, intArray19);
        int[] intArray24 = new int[] { 1, 1, 100 };
        int[] intArray26 = new int[] { (byte) -1 };
        int int27 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray24, intArray26);
        int[] intArray30 = new int[] { 'a', 10 };
        int int31 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray26, intArray30);
        int int32 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray17, intArray30);
        int int33 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray5, intArray30);
        int[] intArray37 = new int[] { 1, 1, 100 };
        int[] intArray39 = new int[] { (byte) -1 };
        int int40 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray37, intArray39);
        int[] intArray44 = new int[] { 1, 1, 100 };
        int[] intArray46 = new int[] { (byte) -1 };
        int int47 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray44, intArray46);
        int[] intArray50 = new int[] { 'a', 10 };
        int int51 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray46, intArray50);
        int[] intArray55 = new int[] { (byte) 1, (short) 1, (short) -1 };
        int int56 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray46, intArray55);
        int int57 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray39, intArray46);
        int[] intArray61 = new int[] { 1, 1, 100 };
        int[] intArray63 = new int[] { (byte) -1 };
        int int64 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray61, intArray63);
        int[] intArray67 = new int[] { 'a', 10 };
        int int68 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray63, intArray67);
        int[] intArray72 = new int[] { (byte) 1, (short) 1, (short) -1 };
        int int73 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray63, intArray72);
        int[] intArray77 = new int[] { (byte) -1, '#', (-1) };
        int int78 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray63, intArray77);
        int int79 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray46, intArray63);
        int int80 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray30, intArray46);
        int[] intArray85 = new int[] { (byte) 1, (byte) 0, 1, 100 };
        int int86 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray30, intArray85);
        java.lang.Class<?> wildcardClass87 = intArray30.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[10, 100, 32, -1, 100]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[-1]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[-1]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[-1]");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[-1]");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray50), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray55), "[1, 1, -1]");
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray61), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray63), "[-1]");
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray67), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertNotNull(intArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray72), "[1, 1, -1]");
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertNotNull(intArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray77), "[-1, 35, -1]");
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + (-1) + "'", int80 == (-1));
        org.junit.Assert.assertNotNull(intArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray85), "[1, 0, 1, 100]");
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + (-1) + "'", int86 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass87);
    }

    @Test
    public void test02929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02929");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance((double) (byte) 10, 235.95949270096705d, 745.1737787048565d, (double) 101);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 740.7843713896625d + "'", double4 == 740.7843713896625d);
    }

    @Test
    public void test02930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02930");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(699.3261970700897d, 270.44266936177814d, 2633.3648457214576d, 367.4257229620187d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2031.0217022516085d + "'", double4 == 2031.0217022516085d);
    }

    @Test
    public void test02931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02931");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(571.4354617909383d, 1390.5887209367127d, 896.632439101549d, 422.59981641014514d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1293.1858818371782d + "'", double4 == 1293.1858818371782d);
    }

    @Test
    public void test02932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02932");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1040.678218165905d, 259.31005301878207d, 1497.0729541854828d, 555.430640930876d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 752.5153239316717d + "'", double4 == 752.5153239316717d);
    }

    @Test
    public void test02933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02933");
        double[] doubleArray4 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray5 = new double[] {};
        double double7 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray4, doubleArray5, 0);
        double[] doubleArray12 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray13 = new double[] {};
        double double15 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray12, doubleArray13, 0);
        double double17 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray4, doubleArray13, 1);
        double[] doubleArray22 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray23 = new double[] {};
        double double25 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray22, doubleArray23, 0);
        double[] doubleArray30 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray31 = new double[] {};
        double double33 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray30, doubleArray31, 0);
        double double35 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray23, doubleArray31, (int) (byte) 1);
        double[] doubleArray40 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray41 = new double[] {};
        double double43 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray40, doubleArray41, 0);
        double[] doubleArray48 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray49 = new double[] {};
        double double51 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray48, doubleArray49, 0);
        double[] doubleArray56 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray57 = new double[] {};
        double double59 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray56, doubleArray57, 0);
        double double61 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray48, doubleArray57, 1);
        double double63 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray41, doubleArray57, (int) (short) 10);
        double double65 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray31, doubleArray41, (int) ' ');
        double double67 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray4, doubleArray31, (int) (byte) 100);
        java.lang.Class<?> wildcardClass68 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[]");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-1.0d) + "'", double25 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[]");
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + (-1.0d) + "'", double33 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[]");
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + (-1.0d) + "'", double43 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[]");
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + (-1.0d) + "'", double51 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray56), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[]");
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + (-1.0d) + "'", double59 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + (-1.0d) + "'", double61 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 0.0d + "'", double63 == 0.0d);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 0.0d + "'", double65 == 0.0d);
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + (-1.0d) + "'", double67 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass68);
    }

    @Test
    public void test02934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02934");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(480.22375577838454d, 485.6444048742231d, 1411.593963033508d, 232.4213562373095d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1184.5932558920372d + "'", double4 == 1184.5932558920372d);
    }

    @Test
    public void test02935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02935");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(237.15390812259642d, 0.0d, 1225.4763630447624d, 451.47820949769306d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1011.2943098145563d + "'", double4 == 1011.2943098145563d);
    }

    @Test
    public void test02936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02936");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(0.0d, 1095.4592052939295d, 214.59729728027799d, 591.2386429693088d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 718.8178596048987d + "'", double4 == 718.8178596048987d);
    }

    @Test
    public void test02937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02937");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(302.7120305681588d, 1741.486649791941d, 507.9530588091043d, 962.0155780796133d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 690.5107149310497d + "'", double4 == 690.5107149310497d);
    }

    @Test
    public void test02938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02938");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(898.197566204712d, 922.8406127352839d, 242.91258543717748d, 587.5796262549627d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 990.5459672478557d + "'", double4 == 990.5459672478557d);
    }

    @Test
    public void test02939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02939");
        int[] intArray3 = new int[] { 1, 1, 100 };
        int[] intArray5 = new int[] { (byte) -1 };
        int int6 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray3, intArray5);
        int[] intArray10 = new int[] { 1, 1, 100 };
        int[] intArray12 = new int[] { (byte) -1 };
        int int13 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray10, intArray12);
        int[] intArray16 = new int[] { 'a', 10 };
        int int17 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray12, intArray16);
        int[] intArray21 = new int[] { (byte) 1, (short) 1, (short) -1 };
        int int22 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray12, intArray21);
        int int23 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray5, intArray12);
        int[] intArray27 = new int[] { 1, 1, 100 };
        int[] intArray29 = new int[] { (byte) -1 };
        int int30 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray27, intArray29);
        int int31 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray5, intArray27);
        int[] intArray35 = new int[] { 1, 1, 100 };
        int[] intArray37 = new int[] { (byte) -1 };
        int int38 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray35, intArray37);
        int[] intArray41 = new int[] { 'a', 10 };
        int int42 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray37, intArray41);
        int int43 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray5, intArray37);
        int[] intArray47 = new int[] { 1, 1, 100 };
        int[] intArray49 = new int[] { (byte) -1 };
        int int50 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray47, intArray49);
        int[] intArray53 = new int[] { 'a', 10 };
        int int54 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray49, intArray53);
        int[] intArray58 = new int[] { 1, 1, 100 };
        int[] intArray60 = new int[] { (byte) -1 };
        int int61 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray58, intArray60);
        int[] intArray65 = new int[] { 1, 1, 100 };
        int[] intArray67 = new int[] { (byte) -1 };
        int int68 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray65, intArray67);
        int[] intArray71 = new int[] { 'a', 10 };
        int int72 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray67, intArray71);
        int int73 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray58, intArray71);
        int int74 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray49, intArray58);
        int[] intArray78 = new int[] { 1, 1, 100 };
        int[] intArray80 = new int[] { (byte) -1 };
        int int81 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray78, intArray80);
        int[] intArray85 = new int[] { 1, 1, 100 };
        int[] intArray87 = new int[] { (byte) -1 };
        int int88 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray85, intArray87);
        int[] intArray91 = new int[] { 'a', 10 };
        int int92 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray87, intArray91);
        int int93 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray78, intArray91);
        int int94 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray49, intArray91);
        int int95 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray37, intArray49);
        java.lang.Class<?> wildcardClass96 = intArray49.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 1, -1]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[-1]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[-1]");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray49), "[-1]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray53), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray58), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray60), "[-1]");
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray65), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray67), "[-1]");
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertNotNull(intArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray71), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-1) + "'", int72 == (-1));
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
        org.junit.Assert.assertNotNull(intArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray78), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray80), "[-1]");
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + (-1) + "'", int81 == (-1));
        org.junit.Assert.assertNotNull(intArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray85), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray87);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray87), "[-1]");
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + (-1) + "'", int88 == (-1));
        org.junit.Assert.assertNotNull(intArray91);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray91), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + (-1) + "'", int92 == (-1));
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + (-1) + "'", int93 == (-1));
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + (-1) + "'", int94 == (-1));
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + 0 + "'", int95 == 0);
        org.junit.Assert.assertNotNull(wildcardClass96);
    }

    @Test
    public void test02940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02940");
        double[] doubleArray0 = null;
        double[] doubleArray5 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray6 = new double[] {};
        double double8 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray5, doubleArray6, 0);
        double[] doubleArray13 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray14 = new double[] {};
        double double16 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray13, doubleArray14, 0);
        double double18 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray5, doubleArray14, (int) (short) 100);
        double[] doubleArray21 = new double[] { (byte) 0, 132.0d };
        double double23 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray14, doubleArray21, (int) '4');
        double[] doubleArray28 = new double[] { 149.99500012499374d, Double.POSITIVE_INFINITY, 10, (byte) 100 };
        double double30 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray21, doubleArray28, (int) (byte) 0);
        double[] doubleArray35 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray36 = new double[] {};
        double double38 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray35, doubleArray36, 0);
        double[] doubleArray43 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray44 = new double[] {};
        double double46 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray43, doubleArray44, 0);
        double double48 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray36, doubleArray44, (int) (byte) 1);
        double[] doubleArray53 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray54 = new double[] {};
        double double56 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray53, doubleArray54, 0);
        double[] doubleArray61 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray62 = new double[] {};
        double double64 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray61, doubleArray62, 0);
        double[] doubleArray69 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray70 = new double[] {};
        double double72 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray69, doubleArray70, 0);
        double double74 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray61, doubleArray70, 1);
        double double76 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray54, doubleArray70, (int) (short) 10);
        double double78 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray44, doubleArray54, (int) ' ');
        double double80 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray21, doubleArray54, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            double double82 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray0, doubleArray54, 111);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[]");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[]");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.0d) + "'", double18 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[0.0, 132.0]");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-1.0d) + "'", double23 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[149.99500012499374, Infinity, 10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + (-1.0d) + "'", double30 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[]");
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + (-1.0d) + "'", double38 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[]");
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + (-1.0d) + "'", double46 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.0d + "'", double48 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[]");
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + (-1.0d) + "'", double56 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray62), "[]");
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + (-1.0d) + "'", double64 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray69), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray70), "[]");
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + (-1.0d) + "'", double72 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + (-1.0d) + "'", double74 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 0.0d + "'", double76 == 0.0d);
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + 0.0d + "'", double78 == 0.0d);
        org.junit.Assert.assertTrue("'" + double80 + "' != '" + (-1.0d) + "'", double80 == (-1.0d));
    }

    @Test
    public void test02941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02941");
        double[] doubleArray4 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray5 = new double[] {};
        double double7 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray4, doubleArray5, 0);
        double[] doubleArray12 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray13 = new double[] {};
        double double15 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray12, doubleArray13, 0);
        double double17 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray4, doubleArray13, (int) (short) 100);
        double[] doubleArray20 = new double[] { (byte) 0, 132.0d };
        double double22 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray13, doubleArray20, (int) '4');
        double[] doubleArray27 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray28 = new double[] {};
        double double30 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray27, doubleArray28, 0);
        double[] doubleArray35 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray36 = new double[] {};
        double double38 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray35, doubleArray36, 0);
        double double40 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray28, doubleArray36, (int) (byte) 1);
        double[] doubleArray45 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray46 = new double[] {};
        double double48 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray45, doubleArray46, 0);
        double[] doubleArray53 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray54 = new double[] {};
        double double56 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray53, doubleArray54, 0);
        double double58 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray45, doubleArray54, (int) (short) 100);
        double[] doubleArray63 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray64 = new double[] {};
        double double66 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray63, doubleArray64, 0);
        double double68 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray54, doubleArray63, (int) (short) 100);
        double double70 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray36, doubleArray63, (int) (byte) 10);
        double double72 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray20, doubleArray36, (int) (short) -1);
        double[] doubleArray77 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray78 = new double[] {};
        double double80 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray77, doubleArray78, 0);
        double double82 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray36, doubleArray78, (int) '4');
        java.lang.Class<?> wildcardClass83 = doubleArray36.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[0.0, 132.0]");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-1.0d) + "'", double22 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[]");
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + (-1.0d) + "'", double30 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[]");
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + (-1.0d) + "'", double38 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[]");
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + (-1.0d) + "'", double48 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[]");
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + (-1.0d) + "'", double56 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + (-1.0d) + "'", double58 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[]");
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + (-1.0d) + "'", double66 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + (-1.0d) + "'", double68 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + (-1.0d) + "'", double70 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + (-1.0d) + "'", double72 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray77), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray78), "[]");
        org.junit.Assert.assertTrue("'" + double80 + "' != '" + (-1.0d) + "'", double80 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + 0.0d + "'", double82 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass83);
    }

    @Test
    public void test02942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02942");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(0.0d, 546.5855220111873d, 320.56011654358406d, 349.60040893340556d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 517.5452296213658d + "'", double4 == 517.5452296213658d);
    }

    @Test
    public void test02943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02943");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1117.4402236439857d, 726.6062205917581d, 530.1671498841977d, 203.49228509754138d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1086.365729179895d + "'", double4 == 1086.365729179895d);
    }

    @Test
    public void test02944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02944");
        int[] intArray3 = new int[] { 1, 1, 100 };
        int[] intArray5 = new int[] { (byte) -1 };
        int int6 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray3, intArray5);
        int[] intArray10 = new int[] { 1, 1, 100 };
        int[] intArray12 = new int[] { (byte) -1 };
        int int13 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray10, intArray12);
        int[] intArray16 = new int[] { 'a', 10 };
        int int17 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray12, intArray16);
        int[] intArray21 = new int[] { (byte) 1, (short) 1, (short) -1 };
        int int22 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray12, intArray21);
        int int23 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray5, intArray12);
        int[] intArray27 = new int[] { 1, 1, 100 };
        int[] intArray29 = new int[] { (byte) -1 };
        int int30 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray27, intArray29);
        int[] intArray33 = new int[] { 'a', 10 };
        int int34 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray29, intArray33);
        int[] intArray38 = new int[] { (byte) 1, (short) 1, (short) -1 };
        int int39 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray29, intArray38);
        int[] intArray43 = new int[] { (byte) -1, '#', (-1) };
        int int44 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray29, intArray43);
        int int45 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray12, intArray29);
        int[] intArray49 = new int[] { 1, 1, 100 };
        int[] intArray51 = new int[] { (byte) -1 };
        int int52 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray49, intArray51);
        int[] intArray56 = new int[] { 1, 1, 100 };
        int[] intArray58 = new int[] { (byte) -1 };
        int int59 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray56, intArray58);
        int[] intArray62 = new int[] { 'a', 10 };
        int int63 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray58, intArray62);
        int int64 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray49, intArray62);
        int[] intArray68 = new int[] { 1, 1, 100 };
        int[] intArray70 = new int[] { (byte) -1 };
        int int71 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray68, intArray70);
        int[] intArray74 = new int[] { 'a', 10 };
        int int75 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray70, intArray74);
        int[] intArray79 = new int[] { (byte) 1, (short) 1, (short) -1 };
        int int80 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray70, intArray79);
        int[] intArray84 = new int[] { (byte) -1, '#', (-1) };
        int int85 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray70, intArray84);
        int int86 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray49, intArray70);
        int int87 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray12, intArray70);
        java.lang.Class<?> wildcardClass88 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 1, -1]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[-1]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[1, 1, -1]");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray43), "[-1, 35, -1]");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray49), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray51), "[-1]");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray56), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray58), "[-1]");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNotNull(intArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray62), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertNotNull(intArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray68), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray70), "[-1]");
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertNotNull(intArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray74), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
        org.junit.Assert.assertNotNull(intArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray79), "[1, 1, -1]");
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + (-1) + "'", int80 == (-1));
        org.junit.Assert.assertNotNull(intArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray84), "[-1, 35, -1]");
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + (-1) + "'", int85 == (-1));
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + (-1) + "'", int86 == (-1));
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 0 + "'", int87 == 0);
        org.junit.Assert.assertNotNull(wildcardClass88);
    }

    @Test
    public void test02945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02945");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(117.5273091577346d, 887.3027308453188d, 1383.9518231925686d, 1359.661242426394d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1738.783025615909d + "'", double4 == 1738.783025615909d);
    }

    @Test
    public void test02946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02946");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1192.5196727343853d, 678.5281601343461d, 346.72635292547017d, 77.86254967678965d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1399.2236568241767d + "'", double4 == 1399.2236568241767d);
    }

    @Test
    public void test02947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02947");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(643.9042115403038d, 1182.7634239574209d, 1200.219568479256d, 233.65447025960663d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1505.4243106367664d + "'", double4 == 1505.4243106367664d);
    }

    @Test
    public void test02948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02948");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(420.4337905199521d, 825.8447855853702d, 0.0d, 670.5025714040848d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 575.7760047012375d + "'", double4 == 575.7760047012375d);
    }

    @Test
    public void test02949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02949");
        double[] doubleArray4 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray5 = new double[] {};
        double double7 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray4, doubleArray5, 0);
        double[] doubleArray12 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray13 = new double[] {};
        double double15 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray12, doubleArray13, 0);
        double[] doubleArray20 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray21 = new double[] {};
        double double23 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray20, doubleArray21, 0);
        double double25 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray12, doubleArray21, 1);
        double double27 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray5, doubleArray12, (int) ' ');
        double[] doubleArray32 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray33 = new double[] {};
        double double35 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray32, doubleArray33, 0);
        double[] doubleArray40 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray41 = new double[] {};
        double double43 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray40, doubleArray41, 0);
        double double45 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray32, doubleArray41, (int) (short) 100);
        double[] doubleArray50 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray51 = new double[] {};
        double double53 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray50, doubleArray51, 0);
        double double55 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray32, doubleArray50, (int) (byte) 0);
        double double57 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray12, doubleArray50, (int) (short) 10);
        double[] doubleArray62 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray63 = new double[] {};
        double double65 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray62, doubleArray63, 0);
        double double67 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray12, doubleArray63, 10);
        java.lang.Class<?> wildcardClass68 = doubleArray12.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[]");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-1.0d) + "'", double23 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-1.0d) + "'", double25 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + (-1.0d) + "'", double27 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[]");
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + (-1.0d) + "'", double35 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[]");
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + (-1.0d) + "'", double43 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + (-1.0d) + "'", double45 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[]");
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + (-1.0d) + "'", double53 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + Double.POSITIVE_INFINITY + "'", double55 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 0.0d + "'", double57 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray62), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[]");
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + (-1.0d) + "'", double65 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + (-1.0d) + "'", double67 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass68);
    }

    @Test
    public void test02950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02950");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(263.5389460810053d, 438.0401328127323d, 849.6583320319836d, 204.83607191297912d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 819.3234468507314d + "'", double4 == 819.3234468507314d);
    }

    @Test
    public void test02951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02951");
        int[] intArray0 = null;
        int[] intArray4 = new int[] { 1, 1, 100 };
        int[] intArray6 = new int[] { (byte) -1 };
        int int7 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray4, intArray6);
        int[] intArray10 = new int[] { 'a', 10 };
        int int11 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray6, intArray10);
        int[] intArray15 = new int[] { (byte) 1, (short) 1, (short) -1 };
        int int16 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray6, intArray15);
        int[] intArray20 = new int[] { 1, 1, 100 };
        int[] intArray22 = new int[] { (byte) -1 };
        int int23 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray20, intArray22);
        int[] intArray27 = new int[] { 1, 1, 100 };
        int[] intArray29 = new int[] { (byte) -1 };
        int int30 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray27, intArray29);
        int[] intArray33 = new int[] { 'a', 10 };
        int int34 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray29, intArray33);
        int[] intArray38 = new int[] { (byte) 1, (short) 1, (short) -1 };
        int int39 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray29, intArray38);
        int int40 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray22, intArray29);
        int[] intArray44 = new int[] { 1, 1, 100 };
        int[] intArray46 = new int[] { (byte) -1 };
        int int47 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray44, intArray46);
        int[] intArray50 = new int[] { 'a', 10 };
        int int51 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray46, intArray50);
        int[] intArray55 = new int[] { (byte) 1, (short) 1, (short) -1 };
        int int56 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray46, intArray55);
        int[] intArray60 = new int[] { (byte) -1, '#', (-1) };
        int int61 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray46, intArray60);
        int int62 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray29, intArray46);
        int[] intArray66 = new int[] { 1, 1, 100 };
        int[] intArray68 = new int[] { (byte) -1 };
        int int69 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray66, intArray68);
        int[] intArray72 = new int[] { 'a', 10 };
        int int73 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray68, intArray72);
        int[] intArray77 = new int[] { (byte) 1, (short) 1, (short) -1 };
        int int78 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray68, intArray77);
        int int79 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray29, intArray68);
        int int80 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray15, intArray29);
        // The following exception was thrown during execution in test generation
        try {
            int int81 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray0, intArray29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1, -1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[-1]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[-1]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[1, 1, -1]");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[-1]");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray50), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray55), "[1, 1, -1]");
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray60), "[-1, 35, -1]");
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(intArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray66), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray68), "[-1]");
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
        org.junit.Assert.assertNotNull(intArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray72), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertNotNull(intArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray77), "[1, 1, -1]");
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + (-1) + "'", int80 == (-1));
    }

    @Test
    public void test02952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02952");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(747.5848177449909d, 330.1806184959905d, 806.6492081870565d, 807.5323439092334d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 536.4161158553086d + "'", double4 == 536.4161158553086d);
    }

    @Test
    public void test02953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02953");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(124.12768977003863d, 1043.0173537839164d, 601.720563037279d, 630.521265834824d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 890.0889612163328d + "'", double4 == 890.0889612163328d);
    }

    @Test
    public void test02954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02954");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(941.1476765326927d, 351.7317554491893d, 339.56076344170043d, 253.75693821022156d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 699.56173032996d + "'", double4 == 699.56173032996d);
    }

    @Test
    public void test02955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02955");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(0.0d, 489.968037609455d, 0.0d, 855.8409738812244d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 855.8409738812244d + "'", double4 == 855.8409738812244d);
    }

    @Test
    public void test02956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02956");
        int[] intArray0 = null;
        int[] intArray4 = new int[] { 1, 1, 100 };
        int[] intArray6 = new int[] { (byte) -1 };
        int int7 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray4, intArray6);
        int[] intArray11 = new int[] { 1, 1, 100 };
        int[] intArray13 = new int[] { (byte) -1 };
        int int14 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray11, intArray13);
        int[] intArray17 = new int[] { 'a', 10 };
        int int18 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray13, intArray17);
        int[] intArray22 = new int[] { (byte) 1, (short) 1, (short) -1 };
        int int23 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray13, intArray22);
        int int24 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray6, intArray13);
        int[] intArray28 = new int[] { 1, 1, 100 };
        int[] intArray30 = new int[] { (byte) -1 };
        int int31 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray28, intArray30);
        int int32 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray6, intArray28);
        int[] intArray36 = new int[] { 1, 1, 100 };
        int[] intArray38 = new int[] { (byte) -1 };
        int int39 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray36, intArray38);
        int[] intArray43 = new int[] { 1, 1, 100 };
        int[] intArray45 = new int[] { (byte) -1 };
        int int46 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray43, intArray45);
        int[] intArray49 = new int[] { 'a', 10 };
        int int50 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray45, intArray49);
        int[] intArray54 = new int[] { (byte) 1, (short) 1, (short) -1 };
        int int55 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray45, intArray54);
        int int56 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray38, intArray45);
        int[] intArray60 = new int[] { 1, 1, 100 };
        int[] intArray62 = new int[] { (byte) -1 };
        int int63 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray60, intArray62);
        int[] intArray67 = new int[] { 1, 1, 100 };
        int[] intArray69 = new int[] { (byte) -1 };
        int int70 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray67, intArray69);
        int[] intArray73 = new int[] { 'a', 10 };
        int int74 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray69, intArray73);
        int[] intArray78 = new int[] { (byte) 1, (short) 1, (short) -1 };
        int int79 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray69, intArray78);
        int int80 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray62, intArray69);
        int[] intArray84 = new int[] { 1, 1, 100 };
        int[] intArray86 = new int[] { (byte) -1 };
        int int87 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray84, intArray86);
        int int88 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray69, intArray84);
        int int89 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray45, intArray69);
        int int90 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray6, intArray69);
        // The following exception was thrown during execution in test generation
        try {
            int int91 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray0, intArray69);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[1, 1, -1]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[-1]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[-1]");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray43), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray45), "[-1]");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray49), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray54), "[1, 1, -1]");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray60), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray62), "[-1]");
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray67), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray69), "[-1]");
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertNotNull(intArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray73), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
        org.junit.Assert.assertNotNull(intArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray78), "[1, 1, -1]");
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + (-1) + "'", int79 == (-1));
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
        org.junit.Assert.assertNotNull(intArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray84), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray86), "[-1]");
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + (-1) + "'", int87 == (-1));
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + (-1) + "'", int88 == (-1));
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 0 + "'", int89 == 0);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 0 + "'", int90 == 0);
    }

    @Test
    public void test02957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02957");
        double[] doubleArray1 = new double[] { 475.90324156126127d };
        double[] doubleArray6 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray7 = new double[] {};
        double double9 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray6, doubleArray7, 0);
        double[] doubleArray14 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray15 = new double[] {};
        double double17 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray14, doubleArray15, 0);
        double double19 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray6, doubleArray15, (int) (short) 100);
        double[] doubleArray22 = new double[] { (byte) 0, 132.0d };
        double double24 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray15, doubleArray22, (int) '4');
        double[] doubleArray29 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray30 = new double[] {};
        double double32 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray29, doubleArray30, 0);
        double[] doubleArray37 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray38 = new double[] {};
        double double40 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray37, doubleArray38, 0);
        double double42 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray30, doubleArray38, (int) (byte) 1);
        double[] doubleArray47 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray48 = new double[] {};
        double double50 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray47, doubleArray48, 0);
        double[] doubleArray55 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray56 = new double[] {};
        double double58 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray55, doubleArray56, 0);
        double double60 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray47, doubleArray56, (int) (short) 100);
        double[] doubleArray65 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray66 = new double[] {};
        double double68 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray65, doubleArray66, 0);
        double double70 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray56, doubleArray65, (int) (short) 100);
        double double72 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray38, doubleArray65, (int) (byte) 10);
        double double74 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray22, doubleArray38, (int) (short) -1);
        double double76 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray1, doubleArray22, (-1));
        double[] doubleArray81 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray82 = new double[] {};
        double double84 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray81, doubleArray82, 0);
        double[] doubleArray89 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray90 = new double[] {};
        double double92 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray89, doubleArray90, 0);
        double double94 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray82, doubleArray90, (int) (byte) 1);
        double double96 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray1, doubleArray82, 0);
        java.lang.Class<?> wildcardClass97 = doubleArray82.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[475.90324156126127]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[]");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.0d) + "'", double19 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[0.0, 132.0]");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-1.0d) + "'", double24 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[]");
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + (-1.0d) + "'", double32 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[]");
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + (-1.0d) + "'", double40 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[]");
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + (-1.0d) + "'", double50 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray56), "[]");
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + (-1.0d) + "'", double58 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + (-1.0d) + "'", double60 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray65), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[]");
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + (-1.0d) + "'", double68 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + (-1.0d) + "'", double70 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + (-1.0d) + "'", double72 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + (-1.0d) + "'", double74 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + (-1.0d) + "'", double76 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray81), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray82), "[]");
        org.junit.Assert.assertTrue("'" + double84 + "' != '" + (-1.0d) + "'", double84 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray89), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray90);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray90), "[]");
        org.junit.Assert.assertTrue("'" + double92 + "' != '" + (-1.0d) + "'", double92 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double94 + "' != '" + 0.0d + "'", double94 == 0.0d);
        org.junit.Assert.assertTrue("'" + double96 + "' != '" + (-1.0d) + "'", double96 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass97);
    }

    @Test
    public void test02958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02958");
        int[] intArray3 = new int[] { 1, 1, 100 };
        int[] intArray5 = new int[] { (byte) -1 };
        int int6 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray3, intArray5);
        int[] intArray10 = new int[] { 1, 1, 100 };
        int[] intArray12 = new int[] { (byte) -1 };
        int int13 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray10, intArray12);
        int[] intArray16 = new int[] { 'a', 10 };
        int int17 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray12, intArray16);
        int int18 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray3, intArray16);
        int[] intArray22 = new int[] { 1, 1, 100 };
        int[] intArray24 = new int[] { (byte) -1 };
        int int25 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray22, intArray24);
        int[] intArray28 = new int[] { 'a', 10 };
        int int29 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray24, intArray28);
        int[] intArray33 = new int[] { (byte) 1, (short) 1, (short) -1 };
        int int34 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray24, intArray33);
        int[] intArray38 = new int[] { (byte) -1, '#', (-1) };
        int int39 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray24, intArray38);
        int int40 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray3, intArray24);
        int[] intArray44 = new int[] { 1, 1, 100 };
        int[] intArray46 = new int[] { (byte) -1 };
        int int47 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray44, intArray46);
        int[] intArray50 = new int[] { 'a', 10 };
        int int51 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray46, intArray50);
        int[] intArray55 = new int[] { (byte) 1, (short) 1, (short) -1 };
        int int56 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray46, intArray55);
        int[] intArray60 = new int[] { (byte) -1, '#', (-1) };
        int int61 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray46, intArray60);
        int int62 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray3, intArray46);
        int[] intArray66 = new int[] { 1, 1, 100 };
        int[] intArray68 = new int[] { (byte) -1 };
        int int69 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray66, intArray68);
        int int70 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray3, intArray66);
        java.lang.Class<?> wildcardClass71 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[-1]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[1, 1, -1]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[-1, 35, -1]");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[-1]");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray50), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray55), "[1, 1, -1]");
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray60), "[-1, 35, -1]");
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertNotNull(intArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray66), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray68), "[-1]");
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertNotNull(wildcardClass71);
    }

    @Test
    public void test02959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02959");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(741.9061120174771d, 258.891505624066d, 0.0d, 277.515023655668d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 875.2621104553508d + "'", double4 == 875.2621104553508d);
    }

    @Test
    public void test02960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02960");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance((double) (short) 1, 718.8602910842101d, 797.5899331206741d, 1560.2723288853044d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1638.0019709217686d + "'", double4 == 1638.0019709217686d);
    }

    @Test
    public void test02961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02961");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1001.9951237254555d, 737.0371885316508d, 298.5992668050363d, 1006.4589976708653d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 972.8176660596337d + "'", double4 == 972.8176660596337d);
    }

    @Test
    public void test02962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02962");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(376.8601759872545d, 128.12503722077693d, 879.3703982763809d, 990.4666361499317d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 793.1137443383757d + "'", double4 == 793.1137443383757d);
    }

    @Test
    public void test02963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02963");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(829.1261878829811d, 515.7252440971957d, 868.5987780744226d, 852.931001406363d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 46.09505964096883d + "'", double4 == 46.09505964096883d);
    }

    @Test
    public void test02964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02964");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(679.1293280194403d, 3333.744814787238d, 527.1907224716535d, 621.5343680937419d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 162.4885204088238d + "'", double4 == 162.4885204088238d);
    }

    @Test
    public void test02965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02965");
        int[] intArray3 = new int[] { 1, 1, 100 };
        int[] intArray5 = new int[] { (byte) -1 };
        int int6 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray3, intArray5);
        int[] intArray9 = new int[] { 'a', 10 };
        int int10 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray5, intArray9);
        int[] intArray14 = new int[] { 1, 1, 100 };
        int[] intArray16 = new int[] { (byte) -1 };
        int int17 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray14, intArray16);
        int[] intArray21 = new int[] { 1, 1, 100 };
        int[] intArray23 = new int[] { (byte) -1 };
        int int24 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray21, intArray23);
        int[] intArray27 = new int[] { 'a', 10 };
        int int28 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray23, intArray27);
        int[] intArray32 = new int[] { (byte) 1, (short) 1, (short) -1 };
        int int33 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray23, intArray32);
        int int34 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray16, intArray23);
        int[] intArray38 = new int[] { 1, 1, 100 };
        int[] intArray40 = new int[] { (byte) -1 };
        int int41 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray38, intArray40);
        int int42 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray16, intArray38);
        int[] intArray46 = new int[] { 1, 1, 100 };
        int[] intArray48 = new int[] { (byte) -1 };
        int int49 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray46, intArray48);
        int[] intArray52 = new int[] { 'a', 10 };
        int int53 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray48, intArray52);
        int int54 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray16, intArray48);
        int[] intArray58 = new int[] { 1, 1, 100 };
        int[] intArray60 = new int[] { (byte) -1 };
        int int61 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray58, intArray60);
        int[] intArray65 = new int[] { 1, 1, 100 };
        int[] intArray67 = new int[] { (byte) -1 };
        int int68 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray65, intArray67);
        int[] intArray71 = new int[] { 'a', 10 };
        int int72 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray67, intArray71);
        int int73 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray58, intArray71);
        int int74 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray48, intArray71);
        int int75 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray5, intArray71);
        int[] intArray79 = new int[] { 1, 1, 100 };
        int[] intArray81 = new int[] { (byte) -1 };
        int int82 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray79, intArray81);
        int[] intArray88 = new int[] { (byte) 10, (byte) 100, ' ', (short) -1, (short) 100 };
        int int89 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray81, intArray88);
        int int90 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray5, intArray88);
        java.lang.Class<?> wildcardClass91 = intArray88.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[-1]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[1, 1, -1]");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[-1]");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[-1]");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray52), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray58), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray60), "[-1]");
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray65), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray67), "[-1]");
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertNotNull(intArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray71), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-1) + "'", int72 == (-1));
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
        org.junit.Assert.assertNotNull(intArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray79), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray81), "[-1]");
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + (-1) + "'", int82 == (-1));
        org.junit.Assert.assertNotNull(intArray88);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray88), "[10, 100, 32, -1, 100]");
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + (-1) + "'", int89 == (-1));
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + (-1) + "'", int90 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass91);
    }

    @Test
    public void test02966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02966");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(265.0d, 180.85664895471237d, 2334.1386014051322d, 884.4041635989996d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2772.6861160494195d + "'", double4 == 2772.6861160494195d);
    }

    @Test
    public void test02967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02967");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(280.97238101164777d, 340.53058208047037d, (double) 137, 834.828952492293d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 572.2631809460208d + "'", double4 == 572.2631809460208d);
    }

    @Test
    public void test02968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02968");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(139.47274222400492d, 247.8507553182414d, 679.1293280194403d, 810.8207860532161d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1102.62661653041d + "'", double4 == 1102.62661653041d);
    }

    @Test
    public void test02969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02969");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(335.7483604141366d, 1164.5051411394563d, 628.8349589675499d, 1423.4920541423903d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1126.5372153183375d + "'", double4 == 1126.5372153183375d);
    }

    @Test
    public void test02970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02970");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(825.1486709098094d, 257.9209849813188d, 760.2396163201802d, 329.4012999106945d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 136.38936951900496d + "'", double4 == 136.38936951900496d);
    }

    @Test
    public void test02971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02971");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(974.201188346456d, 78.07951666556232d, 174.15406001316165d, 91.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 812.967611667732d + "'", double4 == 812.967611667732d);
    }

    @Test
    public void test02972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02972");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(204.76001435311565d, 381.62280690931635d, 818.3121238642178d, 875.0289624209219d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1106.9582650227076d + "'", double4 == 1106.9582650227076d);
    }

    @Test
    public void test02973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02973");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(0.0d, 564.0294948337818d, 433.8341894155431d, 490.7494344988548d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 507.1142497504701d + "'", double4 == 507.1142497504701d);
    }

    @Test
    public void test02974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02974");
        double[] doubleArray4 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray5 = new double[] {};
        double double7 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray4, doubleArray5, 0);
        double[] doubleArray12 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray13 = new double[] {};
        double double15 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray12, doubleArray13, 0);
        double double17 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray4, doubleArray13, (int) (short) 100);
        double[] doubleArray22 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray23 = new double[] {};
        double double25 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray22, doubleArray23, 0);
        double[] doubleArray30 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray31 = new double[] {};
        double double33 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray30, doubleArray31, 0);
        double double35 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray22, doubleArray31, (int) (short) 100);
        double[] doubleArray40 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray41 = new double[] {};
        double double43 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray40, doubleArray41, 0);
        double double45 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray22, doubleArray40, (int) (byte) 0);
        double double47 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray4, doubleArray40, (int) (short) 1);
        double[] doubleArray52 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray53 = new double[] {};
        double double55 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray52, doubleArray53, 0);
        double double57 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray4, doubleArray52, 100);
        java.lang.Class<?> wildcardClass58 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[]");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-1.0d) + "'", double25 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[]");
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + (-1.0d) + "'", double33 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + (-1.0d) + "'", double35 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[]");
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + (-1.0d) + "'", double43 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + Double.POSITIVE_INFINITY + "'", double45 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.0d + "'", double47 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[]");
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + (-1.0d) + "'", double55 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 0.0d + "'", double57 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass58);
    }

    @Test
    public void test02975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02975");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(626.1724203515566d, 341.7378669222432d, 500.0698876288167d, 898.6352748337238d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 682.9999406342205d + "'", double4 == 682.9999406342205d);
    }

    @Test
    public void test02976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02976");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(822.5426568831847d, 186.9180422268371d, 475.8773849871957d, 2136.728500894452d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1359.1398910113435d + "'", double4 == 1359.1398910113435d);
    }

    @Test
    public void test02977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02977");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(0.0d, 245.39699806137992d, 1112.4837742292545d, 293.96891861545134d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1150.6684461804387d + "'", double4 == 1150.6684461804387d);
    }

    @Test
    public void test02978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02978");
        double[] doubleArray1 = new double[] { 475.90324156126127d };
        double[] doubleArray6 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray7 = new double[] {};
        double double9 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray6, doubleArray7, 0);
        double[] doubleArray14 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray15 = new double[] {};
        double double17 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray14, doubleArray15, 0);
        double double19 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray6, doubleArray15, (int) (short) 100);
        double[] doubleArray22 = new double[] { (byte) 0, 132.0d };
        double double24 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray15, doubleArray22, (int) '4');
        double[] doubleArray29 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray30 = new double[] {};
        double double32 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray29, doubleArray30, 0);
        double[] doubleArray37 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray38 = new double[] {};
        double double40 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray37, doubleArray38, 0);
        double double42 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray30, doubleArray38, (int) (byte) 1);
        double[] doubleArray47 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray48 = new double[] {};
        double double50 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray47, doubleArray48, 0);
        double[] doubleArray55 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray56 = new double[] {};
        double double58 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray55, doubleArray56, 0);
        double double60 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray47, doubleArray56, (int) (short) 100);
        double[] doubleArray65 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray66 = new double[] {};
        double double68 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray65, doubleArray66, 0);
        double double70 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray56, doubleArray65, (int) (short) 100);
        double double72 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray38, doubleArray65, (int) (byte) 10);
        double double74 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray22, doubleArray38, (int) (short) -1);
        double double76 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray1, doubleArray22, (-1));
        double[] doubleArray81 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray82 = new double[] {};
        double double84 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray81, doubleArray82, 0);
        double[] doubleArray89 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray90 = new double[] {};
        double double92 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray89, doubleArray90, 0);
        double double94 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray82, doubleArray90, (int) (byte) 1);
        double double96 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray1, doubleArray82, 0);
        java.lang.Class<?> wildcardClass97 = doubleArray1.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[475.90324156126127]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[]");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.0d) + "'", double19 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[0.0, 132.0]");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-1.0d) + "'", double24 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[]");
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + (-1.0d) + "'", double32 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[]");
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + (-1.0d) + "'", double40 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[]");
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + (-1.0d) + "'", double50 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray56), "[]");
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + (-1.0d) + "'", double58 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + (-1.0d) + "'", double60 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray65), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[]");
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + (-1.0d) + "'", double68 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + (-1.0d) + "'", double70 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + (-1.0d) + "'", double72 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + (-1.0d) + "'", double74 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + (-1.0d) + "'", double76 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray81), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray82), "[]");
        org.junit.Assert.assertTrue("'" + double84 + "' != '" + (-1.0d) + "'", double84 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray89), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray90);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray90), "[]");
        org.junit.Assert.assertTrue("'" + double92 + "' != '" + (-1.0d) + "'", double92 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double94 + "' != '" + 0.0d + "'", double94 == 0.0d);
        org.junit.Assert.assertTrue("'" + double96 + "' != '" + (-1.0d) + "'", double96 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass97);
    }

    @Test
    public void test02979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02979");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(706.5032237784504d, 360.643250362379d, 600.4477757661662d, 152.51248812544304d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 564.0509668837087d + "'", double4 == 564.0509668837087d);
    }

    @Test
    public void test02980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02980");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(344.4597570301277d, 269.3598320793501d, 403.9037707077835d, 739.0468175246912d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 529.1309991229969d + "'", double4 == 529.1309991229969d);
    }

    @Test
    public void test02981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02981");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1359.9671019193934d, 324.9129524411771d, 419.56491396050245d, 2256.576446777686d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2872.0656822953997d + "'", double4 == 2872.0656822953997d);
    }

    @Test
    public void test02982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02982");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(88.2375286553044d, (double) 69, 524.8774654412186d, 129.18370657668194d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 496.82364336259616d + "'", double4 == 496.82364336259616d);
    }

    @Test
    public void test02983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02983");
        double[] doubleArray4 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray5 = new double[] {};
        double double7 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray4, doubleArray5, 0);
        double[] doubleArray12 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray13 = new double[] {};
        double double15 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray12, doubleArray13, 0);
        double double17 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray4, doubleArray13, (int) (short) 100);
        double[] doubleArray22 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray23 = new double[] {};
        double double25 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray22, doubleArray23, 0);
        double[] doubleArray30 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray31 = new double[] {};
        double double33 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray30, doubleArray31, 0);
        double double35 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray23, doubleArray31, (int) (byte) 1);
        double double37 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray13, doubleArray31, 0);
        double[] doubleArray42 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray43 = new double[] {};
        double double45 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray42, doubleArray43, 0);
        double[] doubleArray50 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray51 = new double[] {};
        double double53 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray50, doubleArray51, 0);
        double double55 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray42, doubleArray51, (int) (short) 100);
        double[] doubleArray60 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray61 = new double[] {};
        double double63 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray60, doubleArray61, 0);
        double double65 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray51, doubleArray60, (int) (short) 100);
        double[] doubleArray70 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray71 = new double[] {};
        double double73 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray70, doubleArray71, 0);
        double[] doubleArray79 = new double[] { 232.4213562373095d, (short) 0, 1.0f, 75.85073476263909d, (-1L) };
        double double81 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray71, doubleArray79, (int) (byte) -1);
        double double83 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray60, doubleArray79, (int) (short) 10);
        double double85 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray31, doubleArray79, (int) ' ');
        java.lang.Class<?> wildcardClass86 = doubleArray31.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[]");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-1.0d) + "'", double25 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[]");
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + (-1.0d) + "'", double33 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[]");
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + (-1.0d) + "'", double45 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[]");
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + (-1.0d) + "'", double53 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + (-1.0d) + "'", double55 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[]");
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + (-1.0d) + "'", double63 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + (-1.0d) + "'", double65 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray70), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray71), "[]");
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + (-1.0d) + "'", double73 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray79), "[232.4213562373095, 0.0, 1.0, 75.85073476263909, -1.0]");
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + (-1.0d) + "'", double81 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + (-1.0d) + "'", double83 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double85 + "' != '" + (-1.0d) + "'", double85 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass86);
    }

    @Test
    public void test02984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02984");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1835.0188225969866d, 0.0d, 1923.2494552526769d, 983.8351075302581d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1072.0657401859485d + "'", double4 == 1072.0657401859485d);
    }

    @Test
    public void test02985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02985");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(262.17083616066867d, 0.0d, 695.2529165237823d, 333.87755885756354d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 438.97829378179034d + "'", double4 == 438.97829378179034d);
    }

    @Test
    public void test02986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02986");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1102.5320475851477d, 640.073700145462d, 340.56581463270095d, 1154.3996351784397d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1276.2921679854244d + "'", double4 == 1276.2921679854244d);
    }

    @Test
    public void test02987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02987");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(461.52306304116587d, 456.7311515485347d, 747.3085974017015d, 448.28604210226746d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 294.23064380680285d + "'", double4 == 294.23064380680285d);
    }

    @Test
    public void test02988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02988");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(111.8257573191436d, 790.3676114966954d, 1236.6752907573918d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1915.2171449349437d + "'", double4 == 1915.2171449349437d);
    }

    @Test
    public void test02989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02989");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1091.9285723854555d, 1216.8240601932325d, 1501.0475113099421d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1625.9429991177192d + "'", double4 == 1625.9429991177192d);
    }

    @Test
    public void test02990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02990");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(547.3555045049396d, 395.0094394147251d, 755.997710019333d, 472.5109881900736d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 221.66026153624514d + "'", double4 == 221.66026153624514d);
    }

    @Test
    public void test02991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02991");
        int[] intArray0 = null;
        int[] intArray4 = new int[] { 1, 1, 100 };
        int[] intArray6 = new int[] { (byte) -1 };
        int int7 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray4, intArray6);
        int[] intArray13 = new int[] { (byte) 10, (byte) 100, ' ', (short) -1, (short) 100 };
        int int14 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray6, intArray13);
        int[] intArray18 = new int[] { 1, 1, 100 };
        int[] intArray20 = new int[] { (byte) -1 };
        int int21 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray18, intArray20);
        int[] intArray25 = new int[] { 1, 1, 100 };
        int[] intArray27 = new int[] { (byte) -1 };
        int int28 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray25, intArray27);
        int[] intArray31 = new int[] { 'a', 10 };
        int int32 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray27, intArray31);
        int int33 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray18, intArray31);
        int int34 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray6, intArray31);
        int[] intArray38 = new int[] { 1, 1, 100 };
        int[] intArray40 = new int[] { (byte) -1 };
        int int41 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray38, intArray40);
        int[] intArray44 = new int[] { 'a', 10 };
        int int45 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray40, intArray44);
        int int46 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray6, intArray40);
        // The following exception was thrown during execution in test generation
        try {
            int int47 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray0, intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 100, 32, -1, 100]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[-1]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[-1]");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
    }

    @Test
    public void test02992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02992");
        int[] intArray3 = new int[] { 1, 1, 100 };
        int[] intArray5 = new int[] { (byte) -1 };
        int int6 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray3, intArray5);
        int[] intArray10 = new int[] { 1, 1, 100 };
        int[] intArray12 = new int[] { (byte) -1 };
        int int13 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray10, intArray12);
        int[] intArray16 = new int[] { 'a', 10 };
        int int17 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray12, intArray16);
        int int18 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray3, intArray16);
        int[] intArray22 = new int[] { 1, 1, 100 };
        int[] intArray24 = new int[] { (byte) -1 };
        int int25 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray22, intArray24);
        int[] intArray29 = new int[] { 1, 1, 100 };
        int[] intArray31 = new int[] { (byte) -1 };
        int int32 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray29, intArray31);
        int[] intArray35 = new int[] { 'a', 10 };
        int int36 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray31, intArray35);
        int[] intArray40 = new int[] { (byte) 1, (short) 1, (short) -1 };
        int int41 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray31, intArray40);
        int int42 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray24, intArray31);
        int[] intArray46 = new int[] { 1, 1, 100 };
        int[] intArray48 = new int[] { (byte) -1 };
        int int49 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray46, intArray48);
        int int50 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray24, intArray46);
        int[] intArray54 = new int[] { 1, 1, 100 };
        int[] intArray56 = new int[] { (byte) -1 };
        int int57 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray54, intArray56);
        int[] intArray60 = new int[] { 'a', 10 };
        int int61 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray56, intArray60);
        int int62 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray24, intArray56);
        int[] intArray66 = new int[] { 1, 1, 100 };
        int[] intArray68 = new int[] { (byte) -1 };
        int int69 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray66, intArray68);
        int[] intArray73 = new int[] { 1, 1, 100 };
        int[] intArray75 = new int[] { (byte) -1 };
        int int76 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray73, intArray75);
        int[] intArray79 = new int[] { 'a', 10 };
        int int80 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray75, intArray79);
        int int81 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray66, intArray79);
        int int82 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray56, intArray79);
        int[] intArray86 = new int[] { (byte) -1, (short) -1, ' ' };
        int[] intArray90 = new int[] { 1, 1, 100 };
        int[] intArray92 = new int[] { (byte) -1 };
        int int93 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray90, intArray92);
        int int94 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray86, intArray90);
        int int95 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray79, intArray86);
        int int96 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray3, intArray86);
        java.lang.Class<?> wildcardClass97 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[-1]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[-1]");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[1, 1, -1]");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[-1]");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray54), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray56), "[-1]");
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray60), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(intArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray66), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray68), "[-1]");
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
        org.junit.Assert.assertNotNull(intArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray73), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray75), "[-1]");
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-1) + "'", int76 == (-1));
        org.junit.Assert.assertNotNull(intArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray79), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + (-1) + "'", int80 == (-1));
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + (-1) + "'", int81 == (-1));
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + (-1) + "'", int82 == (-1));
        org.junit.Assert.assertNotNull(intArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray86), "[-1, -1, 32]");
        org.junit.Assert.assertNotNull(intArray90);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray90), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray92);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray92), "[-1]");
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + (-1) + "'", int93 == (-1));
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 72 + "'", int94 == 72);
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + (-1) + "'", int95 == (-1));
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + 72 + "'", int96 == 72);
        org.junit.Assert.assertNotNull(wildcardClass97);
    }

    @Test
    public void test02993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02993");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(621.5343680937419d, 280.6078266587642d, 71.53615965246802d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 830.6060351000382d + "'", double4 == 830.6060351000382d);
    }

    @Test
    public void test02994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02994");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(200.43152753590826d, 415.78775792499863d, 825.8447855853702d, 634.0336019724449d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 761.0206976815485d + "'", double4 == 761.0206976815485d);
    }

    @Test
    public void test02995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02995");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1541.756045800729d, 1292.0367371442157d, 555.430640930876d, 1003.6213789219814d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1274.7407630920873d + "'", double4 == 1274.7407630920873d);
    }

    @Test
    public void test02996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02996");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(472.5109881900736d, 909.6980770786871d, 231.28754390542792d, 153.3688347441879d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 400.0505770257366d + "'", double4 == 400.0505770257366d);
    }

    @Test
    public void test02997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02997");
        int[] intArray3 = new int[] { 1, 1, 100 };
        int[] intArray5 = new int[] { (byte) -1 };
        int int6 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray3, intArray5);
        int[] intArray10 = new int[] { 1, 1, 100 };
        int[] intArray12 = new int[] { (byte) -1 };
        int int13 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray10, intArray12);
        int[] intArray16 = new int[] { 'a', 10 };
        int int17 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray12, intArray16);
        int[] intArray21 = new int[] { (byte) 1, (short) 1, (short) -1 };
        int int22 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray12, intArray21);
        int int23 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray5, intArray12);
        int[] intArray27 = new int[] { (byte) -1, (short) -1, ' ' };
        int[] intArray31 = new int[] { 1, 1, 100 };
        int[] intArray33 = new int[] { (byte) -1 };
        int int34 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray31, intArray33);
        int int35 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray27, intArray31);
        int[] intArray39 = new int[] { 1, 1, 100 };
        int[] intArray41 = new int[] { (byte) -1 };
        int int42 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray39, intArray41);
        int[] intArray45 = new int[] { 'a', 10 };
        int int46 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray41, intArray45);
        int[] intArray50 = new int[] { (byte) 1, (short) 1, (short) -1 };
        int int51 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray41, intArray50);
        int[] intArray55 = new int[] { 1, 1, 100 };
        int[] intArray57 = new int[] { (byte) -1 };
        int int58 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray55, intArray57);
        int[] intArray62 = new int[] { 1, 1, 100 };
        int[] intArray64 = new int[] { (byte) -1 };
        int int65 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray62, intArray64);
        int[] intArray68 = new int[] { 'a', 10 };
        int int69 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray64, intArray68);
        int[] intArray73 = new int[] { (byte) 1, (short) 1, (short) -1 };
        int int74 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray64, intArray73);
        int int75 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray57, intArray64);
        int[] intArray79 = new int[] { 1, 1, 100 };
        int[] intArray81 = new int[] { (byte) -1 };
        int int82 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray79, intArray81);
        int int83 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray57, intArray79);
        int[] intArray87 = new int[] { 1, 1, 100 };
        int[] intArray89 = new int[] { (byte) -1 };
        int int90 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray87, intArray89);
        int[] intArray93 = new int[] { 'a', 10 };
        int int94 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray89, intArray93);
        int int95 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray57, intArray89);
        int int96 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray50, intArray57);
        int int97 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray31, intArray57);
        int int98 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray12, intArray31);
        java.lang.Class<?> wildcardClass99 = intArray31.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 1, -1]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[-1, -1, 32]");
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[-1]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 72 + "'", int35 == 72);
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[-1]");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray45), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray50), "[1, 1, -1]");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray55), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray57), "[-1]");
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertNotNull(intArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray62), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray64), "[-1]");
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertNotNull(intArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray68), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
        org.junit.Assert.assertNotNull(intArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray73), "[1, 1, -1]");
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertNotNull(intArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray79), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray81), "[-1]");
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + (-1) + "'", int82 == (-1));
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + (-1) + "'", int83 == (-1));
        org.junit.Assert.assertNotNull(intArray87);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray87), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray89), "[-1]");
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + (-1) + "'", int90 == (-1));
        org.junit.Assert.assertNotNull(intArray93);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray93), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + (-1) + "'", int94 == (-1));
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + 0 + "'", int95 == 0);
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + (-1) + "'", int96 == (-1));
        org.junit.Assert.assertTrue("'" + int97 + "' != '" + (-1) + "'", int97 == (-1));
        org.junit.Assert.assertTrue("'" + int98 + "' != '" + (-1) + "'", int98 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass99);
    }

    @Test
    public void test02998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02998");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(424.55910681763555d, 682.3932453456185d, (double) 186, 236.7589786659278d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 684.1933734973263d + "'", double4 == 684.1933734973263d);
    }

    @Test
    public void test02999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02999");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(413.2305922118328d, 333.8845445646578d, 603.3074996188053d, 1895.6415449262659d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1751.8339077685805d + "'", double4 == 1751.8339077685805d);
    }

    @Test
    public void test03000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test03000");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1734.4312664158128d, 424.7766846973143d, 1174.617141190017d, 911.9139034206346d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1046.951343949116d + "'", double4 == 1046.951343949116d);
    }
}

