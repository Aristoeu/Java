package DistanceFormula;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest19 {

    public static boolean debug = false;

    @Test
    public void test09501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09501");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(319.5212270991567d, 984.7350979794056d, 1423.5278319700874d, 1400.0787156015954d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1544.8090722019135d + "'", double4 == 1544.8090722019135d);
    }

    @Test
    public void test09502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09502");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1931.9464762233035d, 2115.5592879638466d, 424.83417895447803d, 1391.993599230671d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2230.677986002001d + "'", double4 == 2230.677986002001d);
    }

    @Test
    public void test09503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09503");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(0.0d, 1495.4363159892928d, 1631.8061214964857d, 1362.3830907872932d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1764.8593466984853d + "'", double4 == 1764.8593466984853d);
    }

    @Test
    public void test09504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09504");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(3243.940593932272d, 0.0d, 329.99769364124467d, 260.1892565101676d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4170.591716977901d + "'", double4 == 4170.591716977901d);
    }

    @Test
    public void test09505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09505");
        double[] doubleArray2 = new double[] { 289.94401876488206d, 636.5834861894493d };
        double[] doubleArray7 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray8 = new double[] {};
        double double10 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray7, doubleArray8, 0);
        double[] doubleArray15 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray16 = new double[] {};
        double double18 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray15, doubleArray16, 0);
        double double20 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray7, doubleArray16, (int) (short) 100);
        double[] doubleArray25 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray26 = new double[] {};
        double double28 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray25, doubleArray26, 0);
        double double30 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray16, doubleArray25, (int) (short) 100);
        double[] doubleArray35 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray36 = new double[] {};
        double double38 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray35, doubleArray36, 0);
        double[] doubleArray43 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray44 = new double[] {};
        double double46 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray43, doubleArray44, 0);
        double[] doubleArray51 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray52 = new double[] {};
        double double54 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray51, doubleArray52, 0);
        double double56 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray43, doubleArray52, 1);
        double double58 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray36, doubleArray52, (int) (short) 10);
        double double60 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray16, doubleArray36, 100);
        double double62 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray2, doubleArray16, (int) '#');
        java.lang.Class<?> wildcardClass63 = doubleArray16.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[289.94401876488206, 636.5834861894493]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[]");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[]");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.0d) + "'", double18 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-1.0d) + "'", double20 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[]");
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + (-1.0d) + "'", double28 == (-1.0d));
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
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[]");
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + (-1.0d) + "'", double54 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + (-1.0d) + "'", double56 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 0.0d + "'", double58 == 0.0d);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 0.0d + "'", double60 == 0.0d);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + (-1.0d) + "'", double62 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass63);
    }

    @Test
    public void test09506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09506");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1004.2239698727009d, 335.7483604141366d, 1546.4555243494597d, 1289.3873572486573d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1495.8705513112795d + "'", double4 == 1495.8705513112795d);
    }

    @Test
    public void test09507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09507");
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
        double[] doubleArray41 = new double[] { 232.4213562373095d, (short) 0, 1.0f, 75.85073476263909d, (-1L) };
        double double43 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray33, doubleArray41, (int) (byte) -1);
        double[] doubleArray48 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray49 = new double[] {};
        double double51 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray48, doubleArray49, 0);
        double[] doubleArray56 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray57 = new double[] {};
        double double59 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray56, doubleArray57, 0);
        double double61 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray48, doubleArray57, (int) (short) 100);
        double[] doubleArray66 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray67 = new double[] {};
        double double69 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray66, doubleArray67, 0);
        double double71 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray48, doubleArray66, (int) (byte) 0);
        double double73 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray41, doubleArray66, (int) (short) 100);
        double double75 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray22, doubleArray41, (int) (short) 1);
        double[] doubleArray76 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double78 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray22, doubleArray76, (int) '4');
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
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[232.4213562373095, 0.0, 1.0, 75.85073476263909, -1.0]");
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
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray67), "[]");
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + (-1.0d) + "'", double69 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + Double.POSITIVE_INFINITY + "'", double71 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + (-1.0d) + "'", double73 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + (-1.0d) + "'", double75 == (-1.0d));
    }

    @Test
    public void test09508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09508");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1327.9678521888889d, 1111.2068143935135d, 1215.5878100538368d, 212.0862081751727d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1011.5006483533928d + "'", double4 == 1011.5006483533928d);
    }

    @Test
    public void test09509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09509");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(2553.0694971770213d, 761.6521423750089d, 902.746035163915d, 786.7112522903569d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1675.3825719284541d + "'", double4 == 1675.3825719284541d);
    }

    @Test
    public void test09510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09510");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(729.9405993671058d, 0.0d, 1467.0199198278538d, 226.46133550111497d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 892.6238254684434d + "'", double4 == 892.6238254684434d);
    }

    @Test
    public void test09511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09511");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1992.6090365292562d, 1019.2959049426091d, 1159.6451745459256d, 2905.3586139464755d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1235.6943742064611d + "'", double4 == 1235.6943742064611d);
    }

    @Test
    public void test09512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09512");
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
        int int45 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray34, intArray43);
        int[] intArray49 = new int[] { 1, 1, 100 };
        int[] intArray51 = new int[] { (byte) -1 };
        int int52 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray49, intArray51);
        int int53 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray43, intArray49);
        int int54 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray5, intArray43);
        java.lang.Class<?> wildcardClass55 = intArray5.getClass();
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
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray49), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray51), "[-1]");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test09513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09513");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(502.94809216085235d, 977.168691216433d, 3120.8360984995475d, 1100.6962157689911d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2685.2635686295375d + "'", double4 == 2685.2635686295375d);
    }

    @Test
    public void test09514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09514");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(0.0d, 251.76782081452316d, 293.1835845232116d, 328.40506154074217d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 369.82082524943064d + "'", double4 == 369.82082524943064d);
    }

    @Test
    public void test09515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09515");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(355.06034984081d, 864.1653653407187d, 728.0337052087343d, 623.5465540336345d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 613.5921666750086d + "'", double4 == 613.5921666750086d);
    }

    @Test
    public void test09516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09516");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(219.00241605516848d, 1255.6140506064362d, 0.0d, 532.5937039245571d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 942.0227627370476d + "'", double4 == 942.0227627370476d);
    }

    @Test
    public void test09517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09517");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(382.2345302908354d, 459.0392575681089d, 536.8240390954728d, 3292.8523628971216d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2914.720241072576d + "'", double4 == 2914.720241072576d);
    }

    @Test
    public void test09518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09518");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(727.7419504237471d, 942.7215473271511d, 726.6320835141663d, 2026.3794624230661d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1084.767782005496d + "'", double4 == 1084.767782005496d);
    }

    @Test
    public void test09519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09519");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(0.0d, 1459.082093944009d, 1794.7786460596942d, 3508.505927124389d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3844.2024792400744d + "'", double4 == 3844.2024792400744d);
    }

    @Test
    public void test09520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09520");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(526.1603102497103d, 202.37279762162896d, 1837.0079014240243d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1513.2203887959429d + "'", double4 == 1513.2203887959429d);
    }

    @Test
    public void test09521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09521");
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
        int[] intArray50 = new int[] { 1, 1, 100 };
        int[] intArray52 = new int[] { (byte) -1 };
        int int53 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray50, intArray52);
        int[] intArray56 = new int[] { 'a', 10 };
        int int57 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray52, intArray56);
        int[] intArray61 = new int[] { (byte) 1, (short) 1, (short) -1 };
        int int62 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray52, intArray61);
        int int63 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray30, intArray52);
        int[] intArray67 = new int[] { 1, 1, 100 };
        int[] intArray69 = new int[] { (byte) -1 };
        int int70 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray67, intArray69);
        int[] intArray74 = new int[] { 1, 1, 100 };
        int[] intArray76 = new int[] { (byte) -1 };
        int int77 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray74, intArray76);
        int[] intArray80 = new int[] { 'a', 10 };
        int int81 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray76, intArray80);
        int[] intArray85 = new int[] { (byte) 1, (short) 1, (short) -1 };
        int int86 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray76, intArray85);
        int int87 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray69, intArray76);
        int int88 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray30, intArray69);
        int int89 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray14, intArray69);
        java.lang.Class<?> wildcardClass90 = intArray69.getClass();
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
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray50), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray52), "[-1]");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray56), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray61), "[1, 1, -1]");
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray67), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray69), "[-1]");
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
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 0 + "'", int87 == 0);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + (-1) + "'", int88 == (-1));
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + (-1) + "'", int89 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass90);
    }

    @Test
    public void test09522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09522");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(824.4388460585776d, 411.8728857445273d, 3845.706917706051d, 741.7997315206958d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3022.398051880005d + "'", double4 == 3022.398051880005d);
    }

    @Test
    public void test09523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09523");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(2490.7699040952007d, 1074.3386094041782d, 1179.088709169527d, 2781.3051071353293d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1343.4724639259312d + "'", double4 == 1343.4724639259312d);
    }

    @Test
    public void test09524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09524");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(727.7419504237471d, 2774.2754561865954d, 1371.6785243200636d, 1941.9820832528987d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1374.4211186438754d + "'", double4 == 1374.4211186438754d);
    }

    @Test
    public void test09525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09525");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(2023.1110291729233d, 0.0d, 709.0125940535077d, 1895.1897405410405d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3209.288175660456d + "'", double4 == 3209.288175660456d);
    }

    @Test
    public void test09526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09526");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(2812.549650455464d, 883.5918029789805d, 1488.7546449286797d, 1041.709038520019d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1481.9122410678228d + "'", double4 == 1481.9122410678228d);
    }

    @Test
    public void test09527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09527");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(683.8176537884021d, 767.1724846537633d, 2037.2610224755904d, 962.2809488935321d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1381.7925889814762d + "'", double4 == 1381.7925889814762d);
    }

    @Test
    public void test09528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09528");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(757.6551509679047d, 2037.2610224755904d, 348.18830717902813d, 530.6396742750969d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 468.1870596465551d + "'", double4 == 468.1870596465551d);
    }

    @Test
    public void test09529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09529");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(82.46211251235322d, 470.63720449615835d, 1699.41369357641d, 2040.3375462168738d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3186.651922784772d + "'", double4 == 3186.651922784772d);
    }

    @Test
    public void test09530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09530");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1292.948750385303d, 1818.6788237381804d, 835.6171711553811d, 1148.0055242662934d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1128.0048787018088d + "'", double4 == 1128.0048787018088d);
    }

    @Test
    public void test09531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09531");
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
        int[] intArray79 = new int[] { 1, 1, 100 };
        int[] intArray81 = new int[] { (byte) -1 };
        int int82 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray79, intArray81);
        int int83 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray60, intArray81);
        int[] intArray87 = new int[] { 1, 1, 100 };
        int[] intArray89 = new int[] { (byte) -1 };
        int int90 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray87, intArray89);
        int[] intArray96 = new int[] { (byte) 10, (byte) 100, ' ', (short) -1, (short) 100 };
        int int97 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray89, intArray96);
        int int98 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray60, intArray89);
        java.lang.Class<?> wildcardClass99 = intArray60.getClass();
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
        org.junit.Assert.assertNotNull(intArray96);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray96), "[10, 100, 32, -1, 100]");
        org.junit.Assert.assertTrue("'" + int97 + "' != '" + (-1) + "'", int97 == (-1));
        org.junit.Assert.assertTrue("'" + int98 + "' != '" + (-1) + "'", int98 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass99);
    }

    @Test
    public void test09532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09532");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1309.491543981404d, 503.13322656792127d, 452.9073047125782d, 1581.441263965389d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1934.8922766662934d + "'", double4 == 1934.8922766662934d);
    }

    @Test
    public void test09533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09533");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(195.86115869725893d, 1486.0106889076544d, 0.0d, 1855.3404218809549d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1670.9976117346591d + "'", double4 == 1670.9976117346591d);
    }

    @Test
    public void test09534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09534");
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
        int[] intArray43 = new int[] { 'a', 10 };
        int int44 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray39, intArray43);
        int int45 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray5, intArray39);
        int[] intArray49 = new int[] { 1, 1, 100 };
        int[] intArray51 = new int[] { (byte) -1 };
        int int52 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray49, intArray51);
        int[] intArray55 = new int[] { 'a', 10 };
        int int56 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray51, intArray55);
        int int57 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray39, intArray55);
        int[] intArray61 = new int[] { 1, 1, 100 };
        int[] intArray63 = new int[] { (byte) -1 };
        int int64 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray61, intArray63);
        int[] intArray68 = new int[] { 1, 1, 100 };
        int[] intArray70 = new int[] { (byte) -1 };
        int int71 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray68, intArray70);
        int[] intArray74 = new int[] { 'a', 10 };
        int int75 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray70, intArray74);
        int[] intArray79 = new int[] { (byte) 1, (short) 1, (short) -1 };
        int int80 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray70, intArray79);
        int int81 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray63, intArray70);
        int[] intArray85 = new int[] { 1, 1, 100 };
        int[] intArray87 = new int[] { (byte) -1 };
        int int88 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray85, intArray87);
        int int89 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray63, intArray85);
        int int90 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray39, intArray63);
        int[] intArray91 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int92 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray39, intArray91);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
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
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray43), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray49), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray51), "[-1]");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray55), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray61), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray63), "[-1]");
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
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
        org.junit.Assert.assertNotNull(intArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray85), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray87);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray87), "[-1]");
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + (-1) + "'", int88 == (-1));
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + (-1) + "'", int89 == (-1));
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 0 + "'", int90 == 0);
    }

    @Test
    public void test09535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09535");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(2748.697165542276d, 651.4276402304927d, 4556.122449611018d, 2856.4817395915297d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1810.6362616201943d + "'", double4 == 1810.6362616201943d);
    }

    @Test
    public void test09536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09536");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(711.113777837032d, 708.7763823604616d, 1470.8075926378162d, 400.8353938531051d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1067.6348033081408d + "'", double4 == 1067.6348033081408d);
    }

    @Test
    public void test09537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09537");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(812.2303596667742d, 1991.2289369388843d, 965.3587408087419d, 2193.038732413254d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 354.9381766163373d + "'", double4 == 354.9381766163373d);
    }

    @Test
    public void test09538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09538");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1160.324147252274d, 1455.0835204779296d, 268.59948986728233d, 369.82082524943064d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1191.6662144602037d + "'", double4 == 1191.6662144602037d);
    }

    @Test
    public void test09539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09539");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(2065.7056734216267d, 667.060435579909d, 395.81377071929256d, 296.4987063121494d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2432.8239268758307d + "'", double4 == 2432.8239268758307d);
    }

    @Test
    public void test09540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09540");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(4775.007048747694d, 985.4355202887014d, 1144.4853157912107d, 1751.8339077685805d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4396.920120436363d + "'", double4 == 4396.920120436363d);
    }

    @Test
    public void test09541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09541");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(0.0d, 1345.5447390578754d, 2871.605586910417d, 530.1671498841977d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3686.983176084095d + "'", double4 == 3686.983176084095d);
    }

    @Test
    public void test09542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09542");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(178.6467289963071d, 582.398018648215d, 1238.2453736661246d, 623.3432627627512d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1149.1319745486176d + "'", double4 == 1149.1319745486176d);
    }

    @Test
    public void test09543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09543");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1487.147570023235d, 544.2064967631991d, 1169.7391485201908d, 2571.7888295279236d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1130.1304207307098d + "'", double4 == 1130.1304207307098d);
    }

    @Test
    public void test09544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09544");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(0.0d, 2434.3474243723795d, 5387.753649035834d, 205.49962547816742d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 7616.601447930047d + "'", double4 == 7616.601447930047d);
    }

    @Test
    public void test09545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09545");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(2083.302918111998d, 1632.2063910564498d, 732.3365738517416d, 692.053099526575d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1939.2488548502215d + "'", double4 == 1939.2488548502215d);
    }

    @Test
    public void test09546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09546");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(344.5230047299769d, 0.0d, 1879.3671178900927d, 2820.2121154445276d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2912.865088639168d + "'", double4 == 2912.865088639168d);
    }

    @Test
    public void test09547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09547");
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
        double double45 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray33, doubleArray41, (int) (byte) 1);
        double[] doubleArray50 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray51 = new double[] {};
        double double53 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray50, doubleArray51, 0);
        double[] doubleArray58 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray59 = new double[] {};
        double double61 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray58, doubleArray59, 0);
        double double63 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray51, doubleArray59, (int) (byte) 1);
        double double65 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray33, doubleArray51, (int) (short) 0);
        double double67 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray5, doubleArray33, 111);
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
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.0d + "'", double45 == 0.0d);
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
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 0.0d + "'", double65 == 0.0d);
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 0.0d + "'", double67 == 0.0d);
    }

    @Test
    public void test09548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09548");
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
        int[] intArray50 = new int[] { 1, 1, 100 };
        int[] intArray52 = new int[] { (byte) -1 };
        int int53 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray50, intArray52);
        int[] intArray56 = new int[] { 'a', 10 };
        int int57 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray52, intArray56);
        int[] intArray61 = new int[] { (byte) 1, (short) 1, (short) -1 };
        int int62 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray52, intArray61);
        int int63 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray30, intArray52);
        int[] intArray67 = new int[] { 1, 1, 100 };
        int[] intArray69 = new int[] { (byte) -1 };
        int int70 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray67, intArray69);
        int[] intArray74 = new int[] { 1, 1, 100 };
        int[] intArray76 = new int[] { (byte) -1 };
        int int77 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray74, intArray76);
        int[] intArray80 = new int[] { 'a', 10 };
        int int81 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray76, intArray80);
        int[] intArray85 = new int[] { (byte) 1, (short) 1, (short) -1 };
        int int86 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray76, intArray85);
        int int87 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray69, intArray76);
        int int88 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray30, intArray69);
        int int89 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray14, intArray69);
        java.lang.Class<?> wildcardClass90 = intArray14.getClass();
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
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray50), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray52), "[-1]");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray56), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray61), "[1, 1, -1]");
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray67), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray69), "[-1]");
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
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 0 + "'", int87 == 0);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + (-1) + "'", int88 == (-1));
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + (-1) + "'", int89 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass90);
    }

    @Test
    public void test09549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09549");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1489.656551006283d, 102.8619978699419d, 1249.9544982176799d, 2199.821380876614d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2336.661435795275d + "'", double4 == 2336.661435795275d);
    }

    @Test
    public void test09550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09550");
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
        double[] doubleArray31 = new double[] { 232.4213562373095d, (short) 0, 1.0f, 75.85073476263909d, (-1L) };
        double double33 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray23, doubleArray31, (int) (byte) -1);
        double[] doubleArray38 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray39 = new double[] {};
        double double41 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray38, doubleArray39, 0);
        double[] doubleArray46 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray47 = new double[] {};
        double double49 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray46, doubleArray47, 0);
        double[] doubleArray54 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray55 = new double[] {};
        double double57 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray54, doubleArray55, 0);
        double double59 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray46, doubleArray55, 1);
        double double61 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray39, doubleArray55, (int) (short) 10);
        double[] doubleArray66 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray67 = new double[] {};
        double double69 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray66, doubleArray67, 0);
        double[] doubleArray74 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray75 = new double[] {};
        double double77 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray74, doubleArray75, 0);
        double double79 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray66, doubleArray75, 1);
        double double81 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray55, doubleArray66, (int) '#');
        double[] doubleArray86 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray87 = new double[] {};
        double double89 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray86, doubleArray87, 0);
        double double91 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray55, doubleArray87, 1);
        double double93 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray23, doubleArray87, (int) (short) -1);
        double double95 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray4, doubleArray87, (int) (byte) 100);
        java.lang.Class<?> wildcardClass96 = doubleArray87.getClass();
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
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[232.4213562373095, 0.0, 1.0, 75.85073476263909, -1.0]");
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
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[]");
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + (-1.0d) + "'", double57 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + (-1.0d) + "'", double59 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 0.0d + "'", double61 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray67), "[]");
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + (-1.0d) + "'", double69 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray74), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray75), "[]");
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + (-1.0d) + "'", double77 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + (-1.0d) + "'", double79 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + (-1.0d) + "'", double81 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray86), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray87);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray87), "[]");
        org.junit.Assert.assertTrue("'" + double89 + "' != '" + (-1.0d) + "'", double89 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double91 + "' != '" + 0.0d + "'", double91 == 0.0d);
        org.junit.Assert.assertTrue("'" + double93 + "' != '" + Double.POSITIVE_INFINITY + "'", double93 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double95 + "' != '" + (-1.0d) + "'", double95 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass96);
    }

    @Test
    public void test09551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09551");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(831.4930373345594d, 1088.783692733641d, 653.6605082493417d, 2094.27120362429d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1275.2384505099035d + "'", double4 == 1275.2384505099035d);
    }

    @Test
    public void test09552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09552");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(0.0d, 424.99846035718303d, 847.961734515742d, 1957.2966026233007d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2380.25987678186d + "'", double4 == 2380.25987678186d);
    }

    @Test
    public void test09553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09553");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(918.9650879856456d, 230.66542913617204d, 1130.1135156267658d, 1440.3010542662378d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 562.4720866256708d + "'", double4 == 562.4720866256708d);
    }

    @Test
    public void test09554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09554");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(476.33347371503845d, 6.186539851916677d, 406.43367670481405d, 218.5527652647674d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 282.2660224230751d + "'", double4 == 282.2660224230751d);
    }

    @Test
    public void test09555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09555");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(4255.533106401086d, 199.75445414771787d, 3921.9670325046727d, 817.6897350867257d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3453.988038680035d + "'", double4 == 3453.988038680035d);
    }

    @Test
    public void test09556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09556");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(488.5687065050236d, 1434.4355742326059d, 3341.3100022464023d, 861.0205509406248d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2876.9520810836734d + "'", double4 == 2876.9520810836734d);
    }

    @Test
    public void test09557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09557");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(266.9374418188545d, 1331.4045796481614d, 2823.277210020572d, 441.24776911836136d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2562.27576593404d + "'", double4 == 2562.27576593404d);
    }

    @Test
    public void test09558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09558");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(245.1088656281247d, 1825.0950574246006d, 548.5315268749472d, 1713.3686132507514d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1499.283828315027d + "'", double4 == 1499.283828315027d);
    }

    @Test
    public void test09559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09559");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1536.4400323820114d, 2600.5947551365434d, 723.3533131255944d, 1985.300842144798d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1428.3806322481623d + "'", double4 == 1428.3806322481623d);
    }

    @Test
    public void test09560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09560");
        int[] intArray4 = new int[] { 137, 186, 137, (short) -1 };
        int[] intArray8 = new int[] { 1, 1, 100 };
        int[] intArray10 = new int[] { (byte) -1 };
        int int11 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray8, intArray10);
        int[] intArray15 = new int[] { 1, 1, 100 };
        int[] intArray17 = new int[] { (byte) -1 };
        int int18 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray15, intArray17);
        int[] intArray21 = new int[] { 'a', 10 };
        int int22 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray17, intArray21);
        int[] intArray26 = new int[] { (byte) 1, (short) 1, (short) -1 };
        int int27 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray17, intArray26);
        int[] intArray31 = new int[] { 1, 1, 100 };
        int[] intArray33 = new int[] { (byte) -1 };
        int int34 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray31, intArray33);
        int[] intArray38 = new int[] { 1, 1, 100 };
        int[] intArray40 = new int[] { (byte) -1 };
        int int41 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray38, intArray40);
        int[] intArray44 = new int[] { 'a', 10 };
        int int45 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray40, intArray44);
        int[] intArray49 = new int[] { (byte) 1, (short) 1, (short) -1 };
        int int50 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray40, intArray49);
        int int51 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray33, intArray40);
        int[] intArray55 = new int[] { 1, 1, 100 };
        int[] intArray57 = new int[] { (byte) -1 };
        int int58 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray55, intArray57);
        int int59 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray33, intArray55);
        int[] intArray63 = new int[] { 1, 1, 100 };
        int[] intArray65 = new int[] { (byte) -1 };
        int int66 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray63, intArray65);
        int[] intArray69 = new int[] { 'a', 10 };
        int int70 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray65, intArray69);
        int int71 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray33, intArray65);
        int int72 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray26, intArray33);
        int int73 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray8, intArray33);
        int[] intArray77 = new int[] { 1, 1, 100 };
        int[] intArray79 = new int[] { (byte) -1 };
        int int80 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray77, intArray79);
        int[] intArray86 = new int[] { (byte) 10, (byte) 100, ' ', (short) -1, (short) 100 };
        int int87 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray79, intArray86);
        int int88 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray33, intArray79);
        int int89 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray4, intArray79);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[137, 186, 137, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[1, 1, -1]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[-1]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[-1]");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray49), "[1, 1, -1]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray55), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray57), "[-1]");
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray63), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray65), "[-1]");
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertNotNull(intArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray69), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-1) + "'", int72 == (-1));
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertNotNull(intArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray77), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray79), "[-1]");
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + (-1) + "'", int80 == (-1));
        org.junit.Assert.assertNotNull(intArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray86), "[10, 100, 32, -1, 100]");
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + (-1) + "'", int87 == (-1));
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 0 + "'", int88 == 0);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + (-1) + "'", int89 == (-1));
    }

    @Test
    public void test09561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09561");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(156.99714288128257d, 314.96520757471535d, 2781.415712343024d, 2016.3303433769702d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4325.783705263997d + "'", double4 == 4325.783705263997d);
    }

    @Test
    public void test09562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09562");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(670.8717094183469d, 1335.8608317074572d, 2965.5125008037417d, 432.74512740028047d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2306.9635087173347d + "'", double4 == 2306.9635087173347d);
    }

    @Test
    public void test09563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09563");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1331.4045796481614d, 383.60405834053d, 790.1720718903867d, 615.5047282607248d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 897.4660019579145d + "'", double4 == 897.4660019579145d);
    }

    @Test
    public void test09564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09564");
        double[] doubleArray4 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray5 = new double[] {};
        double double7 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray4, doubleArray5, 0);
        double[] doubleArray12 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray13 = new double[] {};
        double double15 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray12, doubleArray13, 0);
        double double17 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray4, doubleArray13, (int) (short) 100);
        double[] doubleArray19 = new double[] { '4' };
        double[] doubleArray24 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray25 = new double[] {};
        double double27 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray24, doubleArray25, 0);
        double[] doubleArray32 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray33 = new double[] {};
        double double35 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray32, doubleArray33, 0);
        double[] doubleArray40 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray41 = new double[] {};
        double double43 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray40, doubleArray41, 0);
        double double45 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray32, doubleArray41, 1);
        double double47 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray25, doubleArray41, (int) (short) 10);
        double[] doubleArray52 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray53 = new double[] {};
        double double55 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray52, doubleArray53, 0);
        double[] doubleArray60 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray61 = new double[] {};
        double double63 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray60, doubleArray61, 0);
        double double65 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray52, doubleArray61, 1);
        double double67 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray41, doubleArray52, (int) '#');
        double double69 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray19, doubleArray52, (int) (short) 10);
        double double71 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray13, doubleArray52, (int) (short) 1);
        double[] doubleArray73 = new double[] { (short) 0 };
        double[] doubleArray78 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray79 = new double[] {};
        double double81 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray78, doubleArray79, 0);
        double[] doubleArray86 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray87 = new double[] {};
        double double89 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray86, doubleArray87, 0);
        double double91 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray78, doubleArray87, (int) (short) 100);
        double double93 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray73, doubleArray78, 1);
        double double95 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray13, doubleArray78, (int) (short) 10);
        double[] doubleArray96 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double98 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray13, doubleArray96, (int) (short) 1);
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
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[52.0]");
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
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[]");
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + (-1.0d) + "'", double43 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + (-1.0d) + "'", double45 == (-1.0d));
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
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + (-1.0d) + "'", double65 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + (-1.0d) + "'", double67 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + (-1.0d) + "'", double69 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + (-1.0d) + "'", double71 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray73), "[0.0]");
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
        org.junit.Assert.assertTrue("'" + double93 + "' != '" + (-1.0d) + "'", double93 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double95 + "' != '" + (-1.0d) + "'", double95 == (-1.0d));
    }

    @Test
    public void test09565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09565");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(884.0404319516844d, 2057.150077187448d, 2626.048624293527d, 3097.782872771407d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2816.9572478957784d + "'", double4 == 2816.9572478957784d);
    }

    @Test
    public void test09566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09566");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(852.9876243212007d, 1543.300208463103d, 677.1507060283737d, 1693.1313159426159d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 325.6680257723398d + "'", double4 == 325.6680257723398d);
    }

    @Test
    public void test09567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09567");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(423.2002675066391d, 0.0d, 427.283815059034d, 1602.853044473853d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1606.936592026248d + "'", double4 == 1606.936592026248d);
    }

    @Test
    public void test09568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09568");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(606.1975226364846d, 6304.468575076434d, 2890.691976263611d, 2079.6908311254906d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 6509.27219757807d + "'", double4 == 6509.27219757807d);
    }

    @Test
    public void test09569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09569");
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
        double[] doubleArray40 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray41 = new double[] {};
        double double43 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray40, doubleArray41, 0);
        double[] doubleArray49 = new double[] { 232.4213562373095d, (short) 0, 1.0f, 75.85073476263909d, (-1L) };
        double double51 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray41, doubleArray49, (int) (byte) -1);
        double double53 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray30, doubleArray49, (int) (short) 10);
        double double55 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray5, doubleArray30, 101);
        double[] doubleArray60 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray61 = new double[] {};
        double double63 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray60, doubleArray61, 0);
        double[] doubleArray68 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray69 = new double[] {};
        double double71 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray68, doubleArray69, 0);
        double double73 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray60, doubleArray69, (int) (short) 100);
        double[] doubleArray78 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray79 = new double[] {};
        double double81 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray78, doubleArray79, 0);
        double[] doubleArray86 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray87 = new double[] {};
        double double89 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray86, doubleArray87, 0);
        double double91 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray79, doubleArray87, (int) (byte) 1);
        double double93 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray69, doubleArray87, 0);
        double double95 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray5, doubleArray87, 215);
        java.lang.Class<?> wildcardClass96 = doubleArray87.getClass();
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
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[]");
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + (-1.0d) + "'", double43 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[232.4213562373095, 0.0, 1.0, 75.85073476263909, -1.0]");
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + (-1.0d) + "'", double51 == (-1.0d));
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
        org.junit.Assert.assertTrue("'" + double91 + "' != '" + 0.0d + "'", double91 == 0.0d);
        org.junit.Assert.assertTrue("'" + double93 + "' != '" + 0.0d + "'", double93 == 0.0d);
        org.junit.Assert.assertTrue("'" + double95 + "' != '" + 0.0d + "'", double95 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass96);
    }

    @Test
    public void test09570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09570");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1495.9264068942746d, 2748.697165542276d, 2753.8564970073144d, 323.1148661717053d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3683.5123894836106d + "'", double4 == 3683.5123894836106d);
    }

    @Test
    public void test09571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09571");
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
        double[] doubleArray58 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray59 = new double[] {};
        double double61 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray58, doubleArray59, 0);
        double double63 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray50, doubleArray59, 1);
        double double65 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray43, doubleArray59, (int) (short) 10);
        double double67 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray21, doubleArray59, 0);
        java.lang.Class<?> wildcardClass68 = doubleArray21.getClass();
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
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[]");
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + (-1.0d) + "'", double61 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + (-1.0d) + "'", double63 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 0.0d + "'", double65 == 0.0d);
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 0.0d + "'", double67 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass68);
    }

    @Test
    public void test09572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09572");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1507.7426992397886d, 484.2452832538524d, 1635.1822410603374d, 1461.5954009104728d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1104.7896594771692d + "'", double4 == 1104.7896594771692d);
    }

    @Test
    public void test09573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09573");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(570.362221215667d, 940.5748864844451d, 1359.9671019193934d, 221.99500012499374d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 863.0385787214752d + "'", double4 == 863.0385787214752d);
    }

    @Test
    public void test09574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09574");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(2151.333495320436d, 1362.3830907872932d, 643.9042115403038d, 1506.0801443208015d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1651.1263373136408d + "'", double4 == 1651.1263373136408d);
    }

    @Test
    public void test09575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09575");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(2543.904617824526d, 1778.805286324257d, 1391.5715688624805d, 498.7182441902145d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2347.4792349730446d + "'", double4 == 2347.4792349730446d);
    }

    @Test
    public void test09576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09576");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(621.8078065559746d, 634.2295453448422d, 0.0d, 530.1671498841977d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 628.5244293177369d + "'", double4 == 628.5244293177369d);
    }

    @Test
    public void test09577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09577");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(0.0d, 1409.250586878226d, 957.5562404372337d, 483.6996920353407d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1883.1071352801189d + "'", double4 == 1883.1071352801189d);
    }

    @Test
    public void test09578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09578");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(2405.0587366594564d, 0.0d, 262.3073194548731d, 536.3516244936394d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2843.140852471322d + "'", double4 == 2843.140852471322d);
    }

    @Test
    public void test09579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09579");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1561.947855251425d, 475.8773849871957d, 0.0d, 412.7484808105533d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1625.0767594280674d + "'", double4 == 1625.0767594280674d);
    }

    @Test
    public void test09580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09580");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1775.6181740453449d, 915.3654957855197d, 1227.6851052874254d, 696.4536903628047d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1210.3002233662005d + "'", double4 == 1210.3002233662005d);
    }

    @Test
    public void test09581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09581");
        int[] intArray0 = null;
        int[] intArray4 = new int[] { 1, 1, 100 };
        int[] intArray6 = new int[] { (byte) -1 };
        int int7 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray4, intArray6);
        int[] intArray10 = new int[] { 'a', 10 };
        int int11 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray6, intArray10);
        int[] intArray15 = new int[] { 1, 1, 100 };
        int[] intArray17 = new int[] { (byte) -1 };
        int int18 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray15, intArray17);
        int[] intArray24 = new int[] { (byte) 10, (byte) 100, ' ', (short) -1, (short) 100 };
        int int25 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray17, intArray24);
        int[] intArray29 = new int[] { 1, 1, 100 };
        int[] intArray31 = new int[] { (byte) -1 };
        int int32 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray29, intArray31);
        int[] intArray36 = new int[] { 1, 1, 100 };
        int[] intArray38 = new int[] { (byte) -1 };
        int int39 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray36, intArray38);
        int[] intArray42 = new int[] { 'a', 10 };
        int int43 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray38, intArray42);
        int int44 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray29, intArray42);
        int int45 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray17, intArray42);
        int int46 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray10, intArray17);
        int[] intArray50 = new int[] { 1, 1, 100 };
        int[] intArray52 = new int[] { (byte) -1 };
        int int53 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray50, intArray52);
        int[] intArray57 = new int[] { 1, 1, 100 };
        int[] intArray59 = new int[] { (byte) -1 };
        int int60 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray57, intArray59);
        int[] intArray64 = new int[] { 1, 1, 100 };
        int[] intArray66 = new int[] { (byte) -1 };
        int int67 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray64, intArray66);
        int[] intArray73 = new int[] { (byte) 10, (byte) 100, ' ', (short) -1, (short) 100 };
        int int74 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray66, intArray73);
        int int75 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray57, intArray73);
        int[] intArray79 = new int[] { 1, 1, 100 };
        int[] intArray81 = new int[] { (byte) -1 };
        int int82 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray79, intArray81);
        int[] intArray86 = new int[] { 1, 1, 100 };
        int[] intArray88 = new int[] { (byte) -1 };
        int int89 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray86, intArray88);
        int[] intArray92 = new int[] { 'a', 10 };
        int int93 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray88, intArray92);
        int int94 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray79, intArray92);
        int int95 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray73, intArray79);
        int int96 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray50, intArray79);
        int int97 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray17, intArray79);
        // The following exception was thrown during execution in test generation
        try {
            int int98 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray0, intArray79);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[10, 100, 32, -1, 100]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[-1]");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[-1]");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray50), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray52), "[-1]");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray57), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray59), "[-1]");
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertNotNull(intArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray64), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray66), "[-1]");
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertNotNull(intArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray73), "[10, 100, 32, -1, 100]");
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
        org.junit.Assert.assertNotNull(intArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray79), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray81), "[-1]");
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + (-1) + "'", int82 == (-1));
        org.junit.Assert.assertNotNull(intArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray86), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray88);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray88), "[-1]");
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + (-1) + "'", int89 == (-1));
        org.junit.Assert.assertNotNull(intArray92);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray92), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + (-1) + "'", int93 == (-1));
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + (-1) + "'", int94 == (-1));
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + (-1) + "'", int95 == (-1));
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + 0 + "'", int96 == 0);
        org.junit.Assert.assertTrue("'" + int97 + "' != '" + (-1) + "'", int97 == (-1));
    }

    @Test
    public void test09582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09582");
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
        double[] doubleArray25 = new double[] { (short) 0 };
        double[] doubleArray30 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray31 = new double[] {};
        double double33 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray30, doubleArray31, 0);
        double[] doubleArray38 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray39 = new double[] {};
        double double41 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray38, doubleArray39, 0);
        double double43 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray30, doubleArray39, (int) (short) 100);
        double double45 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray25, doubleArray30, 1);
        double double47 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray21, doubleArray30, 1);
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
        double double75 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray53, doubleArray69, (int) (short) 10);
        double[] doubleArray80 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray81 = new double[] {};
        double double83 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray80, doubleArray81, 0);
        double[] doubleArray88 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray89 = new double[] {};
        double double91 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray88, doubleArray89, 0);
        double double93 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray80, doubleArray89, 1);
        double double95 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray69, doubleArray80, (int) '#');
        double double97 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray30, doubleArray80, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            double double99 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray0, doubleArray30, 0);
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
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[0.0]");
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
        org.junit.Assert.assertTrue("'" + double93 + "' != '" + (-1.0d) + "'", double93 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double95 + "' != '" + (-1.0d) + "'", double95 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double97 + "' != '" + 0.0d + "'", double97 == 0.0d);
    }

    @Test
    public void test09583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09583");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(2432.296230827408d, 870.6154329855896d, 984.7350979794056d, 1450.9174488979525d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1748.8675041161737d + "'", double4 == 1748.8675041161737d);
    }

    @Test
    public void test09584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09584");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(4249.718242578625d, 546.2486273454158d, 5469.272046802893d, 1415.9292266323664d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2089.2344035112183d + "'", double4 == 2089.2344035112183d);
    }

    @Test
    public void test09585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09585");
        int[] intArray3 = new int[] { 1, 1, 100 };
        int[] intArray5 = new int[] { (byte) -1 };
        int int6 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray3, intArray5);
        int[] intArray10 = new int[] { 1, 1, 100 };
        int[] intArray12 = new int[] { (byte) -1 };
        int int13 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray10, intArray12);
        int[] intArray17 = new int[] { 1, 1, 100 };
        int[] intArray19 = new int[] { (byte) -1 };
        int int20 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray17, intArray19);
        int[] intArray23 = new int[] { 'a', 10 };
        int int24 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray19, intArray23);
        int[] intArray28 = new int[] { (byte) 1, (short) 1, (short) -1 };
        int int29 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray19, intArray28);
        int int30 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray12, intArray19);
        int[] intArray34 = new int[] { 1, 1, 100 };
        int[] intArray36 = new int[] { (byte) -1 };
        int int37 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray34, intArray36);
        int[] intArray41 = new int[] { 1, 1, 100 };
        int[] intArray43 = new int[] { (byte) -1 };
        int int44 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray41, intArray43);
        int[] intArray47 = new int[] { 'a', 10 };
        int int48 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray43, intArray47);
        int[] intArray52 = new int[] { (byte) 1, (short) 1, (short) -1 };
        int int53 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray43, intArray52);
        int int54 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray36, intArray43);
        int[] intArray58 = new int[] { 1, 1, 100 };
        int[] intArray60 = new int[] { (byte) -1 };
        int int61 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray58, intArray60);
        int int62 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray43, intArray58);
        int int63 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray19, intArray43);
        int[] intArray67 = new int[] { 1, 1, 100 };
        int[] intArray69 = new int[] { (byte) -1 };
        int int70 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray67, intArray69);
        int[] intArray73 = new int[] { 'a', 10 };
        int int74 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray69, intArray73);
        int[] intArray78 = new int[] { (byte) 1, (short) 1, (short) -1 };
        int int79 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray69, intArray78);
        int int80 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray19, intArray69);
        int[] intArray84 = new int[] { 1, 1, 100 };
        int[] intArray86 = new int[] { (byte) -1 };
        int int87 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray84, intArray86);
        int[] intArray93 = new int[] { (byte) 10, (byte) 100, ' ', (short) -1, (short) 100 };
        int int94 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray86, intArray93);
        int int95 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray69, intArray86);
        int int96 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray5, intArray86);
        java.lang.Class<?> wildcardClass97 = intArray5.getClass();
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
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[-1]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[1, 1, -1]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
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
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray52), "[1, 1, -1]");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray58), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray60), "[-1]");
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
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
        org.junit.Assert.assertNotNull(intArray93);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray93), "[10, 100, 32, -1, 100]");
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + (-1) + "'", int94 == (-1));
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + 0 + "'", int95 == 0);
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + 0 + "'", int96 == 0);
        org.junit.Assert.assertNotNull(wildcardClass97);
    }

    @Test
    public void test09586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09586");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(621.5343680937419d, 667.9883139365627d, 916.7412550310105d, 461.3723890762787d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 335.85557255758556d + "'", double4 == 335.85557255758556d);
    }

    @Test
    public void test09587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09587");
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
        double[] doubleArray50 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray51 = new double[] {};
        double double53 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray50, doubleArray51, 0);
        double double55 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray42, doubleArray51, 1);
        double double57 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray35, doubleArray51, (int) (short) 10);
        double double59 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray20, doubleArray51, 100);
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
        double double89 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray20, doubleArray73, (int) '#');
        double[] doubleArray93 = new double[] { 115.82660080517897d, 100.4987562112089d, 745.9659898514686d };
        double double95 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray20, doubleArray93, (int) (short) 1);
        double[] doubleArray96 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double98 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray20, doubleArray96, (int) (short) 10);
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
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[]");
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + (-1.0d) + "'", double53 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + (-1.0d) + "'", double55 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 0.0d + "'", double57 == 0.0d);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + (-1.0d) + "'", double59 == (-1.0d));
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
        org.junit.Assert.assertNotNull(doubleArray93);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray93), "[115.82660080517897, 100.4987562112089, 745.9659898514686]");
        org.junit.Assert.assertTrue("'" + double95 + "' != '" + (-1.0d) + "'", double95 == (-1.0d));
    }

    @Test
    public void test09588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09588");
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
        int[] intArray34 = new int[] { (byte) -1, (short) -1, ' ' };
        int[] intArray38 = new int[] { 1, 1, 100 };
        int[] intArray40 = new int[] { (byte) -1 };
        int int41 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray38, intArray40);
        int int42 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray34, intArray38);
        int int43 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray5, intArray34);
        int[] intArray47 = new int[] { 1, 1, 100 };
        int[] intArray49 = new int[] { (byte) -1 };
        int int50 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray47, intArray49);
        int[] intArray54 = new int[] { 1, 1, 100 };
        int[] intArray56 = new int[] { (byte) -1 };
        int int57 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray54, intArray56);
        int[] intArray63 = new int[] { (byte) 10, (byte) 100, ' ', (short) -1, (short) 100 };
        int int64 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray56, intArray63);
        int int65 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray47, intArray63);
        int[] intArray69 = new int[] { 1, 1, 100 };
        int[] intArray71 = new int[] { (byte) -1 };
        int int72 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray69, intArray71);
        int[] intArray76 = new int[] { 1, 1, 100 };
        int[] intArray78 = new int[] { (byte) -1 };
        int int79 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray76, intArray78);
        int[] intArray82 = new int[] { 'a', 10 };
        int int83 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray78, intArray82);
        int[] intArray87 = new int[] { (byte) 1, (short) 1, (short) -1 };
        int int88 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray78, intArray87);
        int int89 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray71, intArray78);
        int[] intArray93 = new int[] { 1, 1, 100 };
        int[] intArray95 = new int[] { (byte) -1 };
        int int96 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray93, intArray95);
        int int97 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray71, intArray93);
        int int98 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray63, intArray93);
        int int99 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray5, intArray63);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[-1, -1, 32]");
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[-1]");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 72 + "'", int42 == 72);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
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
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray63), "[10, 100, 32, -1, 100]");
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertNotNull(intArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray69), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray71), "[-1]");
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-1) + "'", int72 == (-1));
        org.junit.Assert.assertNotNull(intArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray76), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray78), "[-1]");
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + (-1) + "'", int79 == (-1));
        org.junit.Assert.assertNotNull(intArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray82), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + (-1) + "'", int83 == (-1));
        org.junit.Assert.assertNotNull(intArray87);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray87), "[1, 1, -1]");
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + (-1) + "'", int88 == (-1));
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 0 + "'", int89 == 0);
        org.junit.Assert.assertNotNull(intArray93);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray93), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray95);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray95), "[-1]");
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + (-1) + "'", int96 == (-1));
        org.junit.Assert.assertTrue("'" + int97 + "' != '" + (-1) + "'", int97 == (-1));
        org.junit.Assert.assertTrue("'" + int98 + "' != '" + (-1) + "'", int98 == (-1));
        org.junit.Assert.assertTrue("'" + int99 + "' != '" + (-1) + "'", int99 == (-1));
    }

    @Test
    public void test09589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09589");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(282.94370701765916d, 1167.4951251091672d, 264.0d, 198.98648502752656d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 86.06787530705819d + "'", double4 == 86.06787530705819d);
    }

    @Test
    public void test09590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09590");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(0.0d, 1697.8573279192422d, 1367.6926151750647d, 2033.0721784844934d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2450.299078180476d + "'", double4 == 2450.299078180476d);
    }

    @Test
    public void test09591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09591");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(580.625020842384d, 493.1995131157723d, 0.0d, 1681.5676210299232d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1244.668640135164d + "'", double4 == 1244.668640135164d);
    }

    @Test
    public void test09592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09592");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(3661.657617769359d, 329.04803549308525d, 945.4911637251181d, 3212.7312669658486d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 5599.849685517005d + "'", double4 == 5599.849685517005d);
    }

    @Test
    public void test09593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09593");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1624.5182510275836d, 579.6591966111972d, 3545.751144161149d, 459.7232166467719d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2246.7494968902442d + "'", double4 == 2246.7494968902442d);
    }

    @Test
    public void test09594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09594");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(177.5349137435145d, 98.2248342131674d, 0.0d, 964.0725254812904d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1043.3826050116377d + "'", double4 == 1043.3826050116377d);
    }

    @Test
    public void test09595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09595");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1778.805286324257d, 2920.410687611309d, 2136.728500894452d, 681.295029499438d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2597.038872682066d + "'", double4 == 2597.038872682066d);
    }

    @Test
    public void test09596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09596");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(343.8261708467381d, 1300.9343973291705d, 1001.8257413707506d, 5199.794246161901d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4900.345843232887d + "'", double4 == 4900.345843232887d);
    }

    @Test
    public void test09597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09597");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(2084.5905742797518d, 822.4991563827713d, 115.82660080517897d, 1084.1503155968308d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2208.373223539205d + "'", double4 == 2208.373223539205d);
    }

    @Test
    public void test09598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09598");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1235.2819840829552d, 794.6695258757404d, 756.3850322363193d, 957.6886780149314d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 553.5344018774034d + "'", double4 == 553.5344018774034d);
    }

    @Test
    public void test09599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09599");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(582.5370370156128d, 1457.0564949130237d, 471.08561422042396d, 4798.953520156776d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4217.889208946528d + "'", double4 == 4217.889208946528d);
    }

    @Test
    public void test09600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09600");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(251.76782081452316d, 1012.8160329606467d, 665.4510980134135d, 7777.302188270409d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 7178.169432508652d + "'", double4 == 7178.169432508652d);
    }

    @Test
    public void test09601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09601");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(163.99057517747818d, 1117.7649391526268d, 1759.7330701931014d, 988.1839780629083d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1796.0202882368983d + "'", double4 == 1796.0202882368983d);
    }

    @Test
    public void test09602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09602");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1111.6654249535404d, 0.0d, 1194.812296467553d, 797.5528925512315d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 324.930893044597d + "'", double4 == 324.930893044597d);
    }

    @Test
    public void test09603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09603");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(522.8515244767702d, 884.3381379444297d, 564.59755583695d, 3456.6558144420164d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2934.101283690256d + "'", double4 == 2934.101283690256d);
    }

    @Test
    public void test09604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09604");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(3083.6587614914474d, 2586.021064568995d, 1034.622409003104d, 144.3969578381549d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4490.660459219183d + "'", double4 == 4490.660459219183d);
    }

    @Test
    public void test09605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09605");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(365.8954888322136d, 2667.38497642807d, 988.5078734431651d, 909.6980770786871d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2380.299283960334d + "'", double4 == 2380.299283960334d);
    }

    @Test
    public void test09606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09606");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(982.1379432257596d, 2074.9619443647416d, 190.98432674854234d, 893.279884540596d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1972.835676301363d + "'", double4 == 1972.835676301363d);
    }

    @Test
    public void test09607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09607");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(304.11649185067324d, 792.0828056013817d, 250.65596716483458d, 3981.793709315488d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3678.065761179295d + "'", double4 == 3678.065761179295d);
    }

    @Test
    public void test09608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09608");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1015.6788987322241d, 1319.885752410512d, 4950.844568691614d, 3116.630076362142d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4460.888330905793d + "'", double4 == 4460.888330905793d);
    }

    @Test
    public void test09609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09609");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(422.7103058845154d, 0.0d, 1062.0275939252974d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 639.317288040782d + "'", double4 == 639.317288040782d);
    }

    @Test
    public void test09610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09610");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(6874.75431853364d, 2781.8662427664926d, 368.7233038561935d, 1571.286965272015d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 7716.610292171924d + "'", double4 == 7716.610292171924d);
    }

    @Test
    public void test09611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09611");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(887.4578563240714d, 693.2179601852916d, 1492.224458246262d, 830.5785912519235d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 742.1272329888225d + "'", double4 == 742.1272329888225d);
    }

    @Test
    public void test09612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09612");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1054.9137685793771d, 1229.454780469774d, 394.7553821156331d, 359.8788905584546d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 958.5836306154891d + "'", double4 == 958.5836306154891d);
    }

    @Test
    public void test09613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09613");
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
        double double73 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray60, doubleArray69, (int) (short) 100);
        double double75 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray51, doubleArray69, (int) (short) 0);
        double double77 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray4, doubleArray51, (int) (short) -1);
        java.lang.Class<?> wildcardClass78 = doubleArray4.getClass();
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
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + (-1.0d) + "'", double73 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + 0.0d + "'", double75 == 0.0d);
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + (-1.0d) + "'", double77 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass78);
    }

    @Test
    public void test09614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09614");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1343.3555227367374d, 5629.366662844536d, 1670.794477234515d, 679.1293280194403d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 740.548922537342d + "'", double4 == 740.548922537342d);
    }

    @Test
    public void test09615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09615");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1054.9137685793771d, 1157.8012157483172d, 613.2225946703197d, 1637.534681757345d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 731.1212085430776d + "'", double4 == 731.1212085430776d);
    }

    @Test
    public void test09616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09616");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(0.0d, 3122.1327365159536d, 0.0d, 2305.989973033269d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2305.989973033269d + "'", double4 == 2305.989973033269d);
    }

    @Test
    public void test09617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09617");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(2377.497982263319d, 1476.0291403541248d, 1297.2584734734726d, 4182.716144457776d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3786.9265128934976d + "'", double4 == 3786.9265128934976d);
    }

    @Test
    public void test09618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09618");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(2051.208667126059d, 579.9865621659195d, 313.0954068750014d, 100.65557929031002d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2612.60311833354d + "'", double4 == 2612.60311833354d);
    }

    @Test
    public void test09619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09619");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(2016.4680899388222d, 111.2372087121366d, 2169.2030324163006d, 3434.4191331233d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1426.1532608810135d + "'", double4 == 1426.1532608810135d);
    }

    @Test
    public void test09620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09620");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(860.8662372742338d, 512.1052156916826d, 510.63044040816783d, 795.0360390241904d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 356.36880953311305d + "'", double4 == 356.36880953311305d);
    }

    @Test
    public void test09621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09621");
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
        double[] doubleArray41 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray42 = new double[] {};
        double double44 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray41, doubleArray42, 0);
        double[] doubleArray49 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray50 = new double[] {};
        double double52 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray49, doubleArray50, 0);
        double double54 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray41, doubleArray50, 1);
        double double56 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray34, doubleArray50, (int) (short) 10);
        double double58 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray14, doubleArray34, 100);
        double[] doubleArray63 = new double[] { 706.5032237784504d, (-1.0f), 246.4044206487757d, 51.402702719722015d };
        double double65 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray14, doubleArray63, 1);
        double[] doubleArray68 = new double[] { 964.0725254812904d, 733.1466438217658d };
        double double70 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray14, doubleArray68, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            double double72 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray0, doubleArray68, (int) (byte) 1);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[706.5032237784504, -1.0, 246.4044206487757, 51.402702719722015]");
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + (-1.0d) + "'", double65 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray68), "[964.0725254812904, 733.1466438217658]");
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + (-1.0d) + "'", double70 == (-1.0d));
    }

    @Test
    public void test09622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09622");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(2293.073839008447d, 627.681215767945d, 1535.420242661069d, 767.8895161970873d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 897.8618967765203d + "'", double4 == 897.8618967765203d);
    }

    @Test
    public void test09623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09623");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(2347.4792349730446d, 294.42301307252166d, 401.85876510713194d, 5437.751927198278d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 7088.949383991669d + "'", double4 == 7088.949383991669d);
    }

    @Test
    public void test09624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09624");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1675.3825719284541d, 1200.3454105375386d, 2175.629033341874d, 857.8986293936312d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 842.6932425573275d + "'", double4 == 842.6932425573275d);
    }

    @Test
    public void test09625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09625");
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
        double double49 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray35, doubleArray44, (int) (short) 100);
        double[] doubleArray54 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray55 = new double[] {};
        double double57 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray54, doubleArray55, 0);
        double[] doubleArray62 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray63 = new double[] {};
        double double65 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray62, doubleArray63, 0);
        double[] doubleArray70 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray71 = new double[] {};
        double double73 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray70, doubleArray71, 0);
        double double75 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray62, doubleArray71, 1);
        double double77 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray55, doubleArray71, (int) (short) 10);
        double double79 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray35, doubleArray55, 100);
        double double81 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray1, doubleArray35, (-1));
        double[] doubleArray82 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double84 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray1, doubleArray82, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"p2\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + (-1.0d) + "'", double49 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[]");
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + (-1.0d) + "'", double57 == (-1.0d));
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
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 0.0d + "'", double77 == 0.0d);
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + 0.0d + "'", double79 == 0.0d);
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + (-1.0d) + "'", double81 == (-1.0d));
    }

    @Test
    public void test09626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09626");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1957.2966026233007d, 1117.4402236439857d, 468.85168542559705d, 168.11849816664136d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2327.364724532621d + "'", double4 == 2327.364724532621d);
    }

    @Test
    public void test09627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09627");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(942.5295351745444d, 2720.6184037945027d, 479.33602837693195d, 1606.398208013519d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 809.4873930559088d + "'", double4 == 809.4873930559088d);
    }

    @Test
    public void test09628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09628");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(3574.748189823905d, 0.0d, 452.3869766947d, 989.7389530394175d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4053.567848144989d + "'", double4 == 4053.567848144989d);
    }

    @Test
    public void test09629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09629");
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
        int[] intArray26 = new int[] { 1, 1, 100 };
        int[] intArray28 = new int[] { (byte) -1 };
        int int29 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray26, intArray28);
        int[] intArray32 = new int[] { 'a', 10 };
        int int33 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray28, intArray32);
        int[] intArray37 = new int[] { 1, 1, 100 };
        int[] intArray39 = new int[] { (byte) -1 };
        int int40 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray37, intArray39);
        int[] intArray44 = new int[] { 1, 1, 100 };
        int[] intArray46 = new int[] { (byte) -1 };
        int int47 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray44, intArray46);
        int[] intArray50 = new int[] { 'a', 10 };
        int int51 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray46, intArray50);
        int int52 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray37, intArray50);
        int int53 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray28, intArray37);
        int int54 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray21, intArray28);
        int[] intArray58 = new int[] { 1, 1, 100 };
        int[] intArray60 = new int[] { (byte) -1 };
        int int61 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray58, intArray60);
        int[] intArray65 = new int[] { 1, 1, 100 };
        int[] intArray67 = new int[] { (byte) -1 };
        int int68 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray65, intArray67);
        int int69 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray58, intArray67);
        int int70 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray21, intArray58);
        int[] intArray74 = new int[] { '4', (short) 100, '#' };
        int int75 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray21, intArray74);
        int int76 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray3, intArray74);
        int[] intArray80 = new int[] { (byte) -1, (short) -1, ' ' };
        int[] intArray84 = new int[] { 1, 1, 100 };
        int[] intArray86 = new int[] { (byte) -1 };
        int int87 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray84, intArray86);
        int int88 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray80, intArray84);
        int int89 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray74, intArray80);
        java.lang.Class<?> wildcardClass90 = intArray80.getClass();
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
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[-1]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[97, 10]");
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
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
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
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 101 + "'", int70 == 101);
        org.junit.Assert.assertNotNull(intArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray74), "[52, 100, 35]");
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 186 + "'", int75 == 186);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 215 + "'", int76 == 215);
        org.junit.Assert.assertNotNull(intArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray80), "[-1, -1, 32]");
        org.junit.Assert.assertNotNull(intArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray84), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray86), "[-1]");
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + (-1) + "'", int87 == (-1));
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 72 + "'", int88 == 72);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 157 + "'", int89 == 157);
        org.junit.Assert.assertNotNull(wildcardClass90);
    }

    @Test
    public void test09630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09630");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1022.3482536217167d, 2282.5121094828382d, 569.3645719860358d, 1258.2960550031723d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 510.7500179196852d + "'", double4 == 510.7500179196852d);
    }

    @Test
    public void test09631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09631");
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
        int[] intArray94 = new int[] { 1, 1, 100 };
        int[] intArray96 = new int[] { (byte) -1 };
        int int97 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray94, intArray96);
        int int98 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray69, intArray94);
        // The following exception was thrown during execution in test generation
        try {
            int int99 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray0, intArray94);
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
        org.junit.Assert.assertNotNull(intArray94);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray94), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray96);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray96), "[-1]");
        org.junit.Assert.assertTrue("'" + int97 + "' != '" + (-1) + "'", int97 == (-1));
        org.junit.Assert.assertTrue("'" + int98 + "' != '" + (-1) + "'", int98 == (-1));
    }

    @Test
    public void test09632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09632");
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
        int[] intArray54 = new int[] { 'a', 10 };
        int int55 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray50, intArray54);
        int[] intArray59 = new int[] { (byte) 1, (short) 1, (short) -1 };
        int int60 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray50, intArray59);
        int[] intArray64 = new int[] { (byte) -1, '#', (-1) };
        int int65 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray50, intArray64);
        int int66 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray38, intArray64);
        int[] intArray70 = new int[] { (byte) -1, (short) -1, ' ' };
        int[] intArray74 = new int[] { 1, 1, 100 };
        int[] intArray76 = new int[] { (byte) -1 };
        int int77 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray74, intArray76);
        int int78 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray70, intArray74);
        int int79 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray64, intArray70);
        int[] intArray83 = new int[] { 1, 1, 100 };
        int[] intArray85 = new int[] { (byte) -1 };
        int int86 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray83, intArray85);
        int int87 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray64, intArray83);
        // The following exception was thrown during execution in test generation
        try {
            int int88 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray0, intArray64);
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
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray50), "[-1]");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray54), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray59), "[1, 1, -1]");
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertNotNull(intArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray64), "[-1, 35, -1]");
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertNotNull(intArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray70), "[-1, -1, 32]");
        org.junit.Assert.assertNotNull(intArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray74), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray76), "[-1]");
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + (-1) + "'", int77 == (-1));
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 72 + "'", int78 == 72);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 69 + "'", int79 == 69);
        org.junit.Assert.assertNotNull(intArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray83), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray85), "[-1]");
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + (-1) + "'", int86 == (-1));
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 137 + "'", int87 == 137);
    }

    @Test
    public void test09633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09633");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(2342.044242288626d, 309.39230724958475d, 2041.1094851846067d, 1562.560812461973d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1554.1032623164074d + "'", double4 == 1554.1032623164074d);
    }

    @Test
    public void test09634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09634");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(2213.6714436564234d, 2039.912377082118d, 1532.6762509565908d, 1421.878323112924d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1044.3614308371862d + "'", double4 == 1044.3614308371862d);
    }

    @Test
    public void test09635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09635");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1578.6485640769192d, 213.3473584230394d, 721.4255057983173d, 446.44923719622483d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1090.3249370517874d + "'", double4 == 1090.3249370517874d);
    }

    @Test
    public void test09636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09636");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(241.86946405314654d, 368.99944164262115d, 1073.4048276836766d, 153.3688347441879d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 836.2316798329513d + "'", double4 == 836.2316798329513d);
    }

    @Test
    public void test09637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09637");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1814.5340544550925d, 3832.4188722600766d, 1068.2342360795853d, 2350.6942557688576d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2228.024434866726d + "'", double4 == 2228.024434866726d);
    }

    @Test
    public void test09638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09638");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1465.7762116550416d, 1778.5870698779736d, 0.0d, 949.028613105037d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1554.196893337843d + "'", double4 == 1554.196893337843d);
    }

    @Test
    public void test09639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09639");
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
        int[] intArray74 = new int[] { 1, 1, 100 };
        int[] intArray76 = new int[] { (byte) -1 };
        int int77 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray74, intArray76);
        int[] intArray81 = new int[] { 1, 1, 100 };
        int[] intArray83 = new int[] { (byte) -1 };
        int int84 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray81, intArray83);
        int int85 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray74, intArray83);
        int int86 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray47, intArray74);
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
        org.junit.Assert.assertNotNull(intArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray74), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray76), "[-1]");
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + (-1) + "'", int77 == (-1));
        org.junit.Assert.assertNotNull(intArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray81), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray83), "[-1]");
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + (-1) + "'", int84 == (-1));
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + (-1) + "'", int85 == (-1));
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + (-1) + "'", int86 == (-1));
    }

    @Test
    public void test09640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09640");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(605.205537045175d, 1181.3172432974852d, 309.39230724958475d, 2620.764485853201d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2037.150790452738d + "'", double4 == 2037.150790452738d);
    }

    @Test
    public void test09641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09641");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1267.400893421706d, 30.10864641105329d, 3236.6908021080208d, 1575.9672954887894d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1993.3178293835579d + "'", double4 == 1993.3178293835579d);
    }

    @Test
    public void test09642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09642");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(601.1556235944573d, 3409.994242924516d, 1273.415259681321d, 784.9484205212476d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3297.3054584901324d + "'", double4 == 3297.3054584901324d);
    }

    @Test
    public void test09643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09643");
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
        double[] doubleArray48 = new double[] { (short) 0 };
        double[] doubleArray53 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray54 = new double[] {};
        double double56 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray53, doubleArray54, 0);
        double[] doubleArray61 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray62 = new double[] {};
        double double64 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray61, doubleArray62, 0);
        double double66 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray53, doubleArray62, (int) (short) 100);
        double double68 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray48, doubleArray53, 1);
        double double70 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray13, doubleArray53, 157);
        double[] doubleArray71 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double73 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray53, doubleArray71, (-1));
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
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[0.0]");
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
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + (-1.0d) + "'", double66 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + (-1.0d) + "'", double68 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + (-1.0d) + "'", double70 == (-1.0d));
    }

    @Test
    public void test09644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09644");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1094.5659834339963d, 404.9064227922119d, 304.4265030720657d, 1239.2420875040152d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1624.4751450737338d + "'", double4 == 1624.4751450737338d);
    }

    @Test
    public void test09645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09645");
        double[] doubleArray0 = null;
        double[] doubleArray5 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray6 = new double[] {};
        double double8 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray5, doubleArray6, 0);
        double[] doubleArray13 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray14 = new double[] {};
        double double16 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray13, doubleArray14, 0);
        double[] doubleArray21 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray22 = new double[] {};
        double double24 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray21, doubleArray22, 0);
        double[] doubleArray29 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray30 = new double[] {};
        double double32 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray29, doubleArray30, 0);
        double double34 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray21, doubleArray30, 1);
        double double36 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray14, doubleArray30, (int) (short) 10);
        double[] doubleArray43 = new double[] { 221.38186019448963d, 364.34654754189563d, 1789.0559517170952d, 896.632439101549d, 5328.628649866165d, 2634.3844687894953d };
        double double45 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray30, doubleArray43, 137);
        double[] doubleArray50 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray51 = new double[] {};
        double double53 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray50, doubleArray51, 0);
        double[] doubleArray58 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray59 = new double[] {};
        double double61 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray58, doubleArray59, 0);
        double double63 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray50, doubleArray59, (int) (short) 100);
        double[] doubleArray68 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray69 = new double[] {};
        double double71 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray68, doubleArray69, 0);
        double[] doubleArray76 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray77 = new double[] {};
        double double79 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray76, doubleArray77, 0);
        double double81 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray69, doubleArray77, (int) (byte) 1);
        double double83 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray59, doubleArray77, 0);
        double double85 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray30, doubleArray59, 26);
        double double87 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray6, doubleArray30, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            double double89 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray0, doubleArray30, 72);
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
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[]");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-1.0d) + "'", double24 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[]");
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + (-1.0d) + "'", double32 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + (-1.0d) + "'", double34 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[221.38186019448963, 364.34654754189563, 1789.0559517170952, 896.632439101549, 5328.628649866165, 2634.3844687894953]");
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
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + 0.0d + "'", double81 == 0.0d);
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + 0.0d + "'", double83 == 0.0d);
        org.junit.Assert.assertTrue("'" + double85 + "' != '" + 0.0d + "'", double85 == 0.0d);
        org.junit.Assert.assertTrue("'" + double87 + "' != '" + 0.0d + "'", double87 == 0.0d);
    }

    @Test
    public void test09646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09646");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(132.0d, 255.41977514636133d, 1235.379226746069d, 1786.9771328742713d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2634.9365844739787d + "'", double4 == 2634.9365844739787d);
    }

    @Test
    public void test09647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09647");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(874.5397880748046d, 0.0d, 682.3077444030058d, 627.8514798973449d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 820.0835235691437d + "'", double4 == 820.0835235691437d);
    }

    @Test
    public void test09648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09648");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(197.1225084287766d, 1376.4647490318207d, 4082.6847624687925d, 1046.0932635438255d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3977.2283531450826d + "'", double4 == 3977.2283531450826d);
    }

    @Test
    public void test09649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09649");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(148.0d, 200.01741434894532d, 3596.772336640385d, 628.6773998030992d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3482.10875658091d + "'", double4 == 3482.10875658091d);
    }

    @Test
    public void test09650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09650");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(0.0d, 838.5805349679069d, 0.0d, 200.15176335734705d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 638.4287716105599d + "'", double4 == 638.4287716105599d);
    }

    @Test
    public void test09651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09651");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(355.1331080333377d, 2571.728768696756d, 0.0d, 838.4272272857784d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 599.743887109665d + "'", double4 == 599.743887109665d);
    }

    @Test
    public void test09652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09652");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(2284.728282921257d, 1027.8877885398788d, 2068.825467867834d, 2906.53276482351d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 658.2209653769182d + "'", double4 == 658.2209653769182d);
    }

    @Test
    public void test09653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09653");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1488.063822424116d, 2249.698283008857d, 419.16939749396454d, 653.6605082493417d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1356.0103916831195d + "'", double4 == 1356.0103916831195d);
    }

    @Test
    public void test09654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09654");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(65.9080036239302d, 266.9374418188545d, 619.8867887423064d, 3478.5359995125696d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3457.299861551518d + "'", double4 == 3457.299861551518d);
    }

    @Test
    public void test09655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09655");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(524.8774654412186d, 204.76001435311565d, 249.1688358244643d, 489.5472968394182d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 560.495912103057d + "'", double4 == 560.495912103057d);
    }

    @Test
    public void test09656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09656");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(2044.0969965035576d, 1699.41369357641d, 1754.2553174822342d, 716.8369233741474d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1272.4184492235859d + "'", double4 == 1272.4184492235859d);
    }

    @Test
    public void test09657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09657");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(4749.244548691682d, 4940.0778234083755d, 1387.6062631083898d, 622.1195535749857d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 5322.947744287592d + "'", double4 == 5322.947744287592d);
    }

    @Test
    public void test09658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09658");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1697.2068556798629d, 195.96347416036195d, 410.8085243967872d, 256.91679229321494d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1931.1282022222647d + "'", double4 == 1931.1282022222647d);
    }

    @Test
    public void test09659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09659");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(71.53615965246802d, 767.8895161970873d, 404.68669618344165d, 2425.5363873598344d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1990.7974076937207d + "'", double4 == 1990.7974076937207d);
    }

    @Test
    public void test09660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09660");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1504.4920615370022d, 934.56337512867d, 1716.5246700842504d, 727.3917336047957d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 805.5077571070892d + "'", double4 == 805.5077571070892d);
    }

    @Test
    public void test09661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09661");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(0.0d, 6031.063478465686d, 302.8507347626391d, 527.1382011920248d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 607.9418152276038d + "'", double4 == 607.9418152276038d);
    }

    @Test
    public void test09662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09662");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(206.77820008724825d, 285.734443294704d, 2905.3586139464755d, 423.2002675066391d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2707.244865417741d + "'", double4 == 2707.244865417741d);
    }

    @Test
    public void test09663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09663");
        double[] doubleArray0 = null;
        double[] doubleArray5 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray6 = new double[] {};
        double double8 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray5, doubleArray6, 0);
        double[] doubleArray13 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray14 = new double[] {};
        double double16 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray13, doubleArray14, 0);
        double[] doubleArray21 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray22 = new double[] {};
        double double24 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray21, doubleArray22, 0);
        double double26 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray13, doubleArray22, 1);
        double double28 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray6, doubleArray22, (int) (short) 10);
        double[] doubleArray33 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray34 = new double[] {};
        double double36 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray33, doubleArray34, 0);
        double[] doubleArray41 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray42 = new double[] {};
        double double44 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray41, doubleArray42, 0);
        double double46 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray33, doubleArray42, 1);
        double double48 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray22, doubleArray33, (int) '#');
        double[] doubleArray53 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray54 = new double[] {};
        double double56 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray53, doubleArray54, 0);
        double double58 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray22, doubleArray54, 1);
        double[] doubleArray63 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray64 = new double[] {};
        double double66 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray63, doubleArray64, 0);
        double[] doubleArray71 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray72 = new double[] {};
        double double74 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray71, doubleArray72, 0);
        double[] doubleArray79 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray80 = new double[] {};
        double double82 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray79, doubleArray80, 0);
        double double84 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray71, doubleArray80, 1);
        double double86 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray64, doubleArray71, (int) ' ');
        double double88 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray22, doubleArray71, 1);
        // The following exception was thrown during execution in test generation
        try {
            double double90 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray0, doubleArray22, 186);
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
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[]");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-1.0d) + "'", double24 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-1.0d) + "'", double26 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[]");
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + (-1.0d) + "'", double36 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[]");
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + (-1.0d) + "'", double44 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + (-1.0d) + "'", double46 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + (-1.0d) + "'", double48 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[]");
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + (-1.0d) + "'", double56 == (-1.0d));
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
        org.junit.Assert.assertNotNull(doubleArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray79), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray80), "[]");
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + (-1.0d) + "'", double82 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double84 + "' != '" + (-1.0d) + "'", double84 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double86 + "' != '" + (-1.0d) + "'", double86 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double88 + "' != '" + (-1.0d) + "'", double88 == (-1.0d));
    }

    @Test
    public void test09664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09664");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(754.9261032040102d, 1241.5154434972324d, 376.5906109081539d, 1027.9407152169888d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 466.5562378785061d + "'", double4 == 466.5562378785061d);
    }

    @Test
    public void test09665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09665");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(2308.581457989995d, 809.4873930559088d, 1111.37344427019d, 365.6064430735291d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2282.2048410921757d + "'", double4 == 2282.2048410921757d);
    }

    @Test
    public void test09666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09666");
        int[] intArray3 = new int[] { 1, 1, 100 };
        int[] intArray5 = new int[] { (byte) -1 };
        int int6 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray3, intArray5);
        int[] intArray10 = new int[] { (byte) -1, (short) -1, ' ' };
        int[] intArray14 = new int[] { 1, 1, 100 };
        int[] intArray16 = new int[] { (byte) -1 };
        int int17 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray14, intArray16);
        int int18 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray10, intArray14);
        int int19 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray5, intArray10);
        int[] intArray23 = new int[] { 1, 1, 100 };
        int[] intArray25 = new int[] { (byte) -1 };
        int int26 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray23, intArray25);
        int[] intArray29 = new int[] { 'a', 10 };
        int int30 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray25, intArray29);
        int[] intArray34 = new int[] { 1, 1, 100 };
        int[] intArray36 = new int[] { (byte) -1 };
        int int37 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray34, intArray36);
        int[] intArray41 = new int[] { 1, 1, 100 };
        int[] intArray43 = new int[] { (byte) -1 };
        int int44 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray41, intArray43);
        int[] intArray47 = new int[] { 'a', 10 };
        int int48 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray43, intArray47);
        int int49 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray34, intArray47);
        int int50 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray25, intArray34);
        int[] intArray54 = new int[] { 1, 1, 100 };
        int[] intArray56 = new int[] { (byte) -1 };
        int int57 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray54, intArray56);
        int[] intArray61 = new int[] { 1, 1, 100 };
        int[] intArray63 = new int[] { (byte) -1 };
        int int64 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray61, intArray63);
        int int65 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray54, intArray63);
        int[] intArray69 = new int[] { 1, 1, 100 };
        int[] intArray71 = new int[] { (byte) -1 };
        int int72 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray69, intArray71);
        int int73 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray63, intArray69);
        int int74 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray25, intArray63);
        int int75 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray10, intArray25);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1, 32]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 72 + "'", int18 == 72);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[-1]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[97, 10]");
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
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertNotNull(intArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray69), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray71), "[-1]");
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-1) + "'", int72 == (-1));
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
    }

    @Test
    public void test09667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09667");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1599.2423394953043d, 309.4213562373095d, 768.8357377606628d, 1136.6258215359471d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 950.5730728846236d + "'", double4 == 950.5730728846236d);
    }

    @Test
    public void test09668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09668");
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
        double[] doubleArray51 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray52 = new double[] {};
        double double54 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray51, doubleArray52, 0);
        double double56 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray43, doubleArray52, 1);
        double double58 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray36, doubleArray52, (int) (short) 10);
        double[] doubleArray63 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray64 = new double[] {};
        double double66 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray63, doubleArray64, 0);
        double[] doubleArray71 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray72 = new double[] {};
        double double74 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray71, doubleArray72, 0);
        double double76 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray63, doubleArray72, 1);
        double double78 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray52, doubleArray63, (int) '#');
        double[] doubleArray83 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray84 = new double[] {};
        double double86 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray83, doubleArray84, 0);
        double double88 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray52, doubleArray84, 1);
        double double90 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray28, doubleArray84, (int) 'a');
        double double92 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray20, doubleArray84, 215);
        java.lang.Class<?> wildcardClass93 = doubleArray20.getClass();
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
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[]");
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + (-1.0d) + "'", double54 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + (-1.0d) + "'", double56 == (-1.0d));
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
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + (-1.0d) + "'", double78 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray83), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray84), "[]");
        org.junit.Assert.assertTrue("'" + double86 + "' != '" + (-1.0d) + "'", double86 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double88 + "' != '" + 0.0d + "'", double88 == 0.0d);
        org.junit.Assert.assertTrue("'" + double90 + "' != '" + 0.0d + "'", double90 == 0.0d);
        org.junit.Assert.assertTrue("'" + double92 + "' != '" + (-1.0d) + "'", double92 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass93);
    }

    @Test
    public void test09669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09669");
        int[] intArray3 = new int[] { 1, 1, 100 };
        int[] intArray5 = new int[] { (byte) -1 };
        int int6 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray3, intArray5);
        int[] intArray9 = new int[] { 'a', 10 };
        int int10 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray5, intArray9);
        int[] intArray14 = new int[] { (byte) 1, (short) 1, (short) -1 };
        int int15 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray5, intArray14);
        int[] intArray19 = new int[] { (byte) -1, '#', (-1) };
        int int20 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray5, intArray19);
        int[] intArray25 = new int[] { 100, 136, 215, 69 };
        int[] intArray29 = new int[] { (byte) -1, (short) -1, ' ' };
        int[] intArray33 = new int[] { 1, 1, 100 };
        int[] intArray35 = new int[] { (byte) -1 };
        int int36 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray33, intArray35);
        int int37 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray29, intArray33);
        int[] intArray41 = new int[] { 1, 1, 100 };
        int[] intArray43 = new int[] { (byte) -1 };
        int int44 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray41, intArray43);
        int[] intArray47 = new int[] { 'a', 10 };
        int int48 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray43, intArray47);
        int[] intArray52 = new int[] { 1, 1, 100 };
        int[] intArray54 = new int[] { (byte) -1 };
        int int55 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray52, intArray54);
        int[] intArray59 = new int[] { 1, 1, 100 };
        int[] intArray61 = new int[] { (byte) -1 };
        int int62 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray59, intArray61);
        int[] intArray65 = new int[] { 'a', 10 };
        int int66 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray61, intArray65);
        int int67 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray52, intArray65);
        int int68 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray43, intArray65);
        int int69 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray33, intArray43);
        int int70 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray25, intArray43);
        int int71 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray5, intArray25);
        java.lang.Class<?> wildcardClass72 = intArray5.getClass();
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[-1, 35, -1]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[100, 136, 215, 69]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[-1, -1, 32]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[-1]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 72 + "'", int37 == 72);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray43), "[-1]");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray52), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray54), "[-1]");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray59), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray61), "[-1]");
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray65), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass72);
    }

    @Test
    public void test09670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09670");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(437.0825789462834d, 110.22998117257458d, 1454.9181361330054d, 337.8696308929706d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1245.475206907118d + "'", double4 == 1245.475206907118d);
    }

    @Test
    public void test09671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09671");
        double[] doubleArray0 = null;
        double[] doubleArray5 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray6 = new double[] {};
        double double8 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray5, doubleArray6, 0);
        double[] doubleArray13 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray14 = new double[] {};
        double double16 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray13, doubleArray14, 0);
        double[] doubleArray21 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray22 = new double[] {};
        double double24 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray21, doubleArray22, 0);
        double double26 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray13, doubleArray22, (int) (short) 100);
        double[] doubleArray31 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray32 = new double[] {};
        double double34 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray31, doubleArray32, 0);
        double double36 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray22, doubleArray31, (int) (short) 100);
        double double38 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray6, doubleArray22, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            double double40 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray0, doubleArray22, (int) (short) -1);
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
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[]");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-1.0d) + "'", double24 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-1.0d) + "'", double26 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[]");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + (-1.0d) + "'", double34 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + (-1.0d) + "'", double36 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
    }

    @Test
    public void test09672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09672");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1580.4700333678707d, 1224.1383651672277d, 738.3786125902116d, 285.48437568734903d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1544.7025003364206d + "'", double4 == 1544.7025003364206d);
    }

    @Test
    public void test09673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09673");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(354.4433304389886d, 1025.593896316027d, 1264.5775932182678d, 1137.934993577903d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1022.4753600411552d + "'", double4 == 1022.4753600411552d);
    }

    @Test
    public void test09674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09674");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(2053.445531279444d, 893.8479187647513d, 2574.3991145054943d, 1032.1588570524589d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1146.481184681928d + "'", double4 == 1146.481184681928d);
    }

    @Test
    public void test09675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09675");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1538.914391985074d, 1947.9026270016448d, 1430.135950329429d, 467.3586479449057d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1077.06288672227d + "'", double4 == 1077.06288672227d);
    }

    @Test
    public void test09676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09676");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1443.2641870680807d, 1022.2300512202005d, 3313.656788436764d, 457.78584976429704d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2114.127724748375d + "'", double4 == 2114.127724748375d);
    }

    @Test
    public void test09677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09677");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1693.1313159426159d, 580.3788451073976d, 1384.0431932814745d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1721.1127565025374d + "'", double4 == 1721.1127565025374d);
    }

    @Test
    public void test09678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09678");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1792.2382640464227d, 497.6952949381995d, 281.3657130012615d, 698.3559871180803d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1865.292015015249d + "'", double4 == 1865.292015015249d);
    }

    @Test
    public void test09679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09679");
        int[] intArray3 = new int[] { 1, 1, 100 };
        int[] intArray5 = new int[] { (byte) -1 };
        int int6 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray3, intArray5);
        int[] intArray10 = new int[] { 1, 1, 100 };
        int[] intArray12 = new int[] { (byte) -1 };
        int int13 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray10, intArray12);
        int int14 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray3, intArray12);
        int[] intArray18 = new int[] { 1, 1, 100 };
        int[] intArray20 = new int[] { (byte) -1 };
        int int21 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray18, intArray20);
        int int22 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray12, intArray18);
        int[] intArray26 = new int[] { 1, 1, 100 };
        int[] intArray28 = new int[] { (byte) -1 };
        int int29 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray26, intArray28);
        int[] intArray32 = new int[] { 'a', 10 };
        int int33 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray28, intArray32);
        int[] intArray37 = new int[] { (byte) 1, (short) 1, (short) -1 };
        int int38 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray28, intArray37);
        int[] intArray42 = new int[] { (byte) -1, '#', (-1) };
        int int43 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray28, intArray42);
        int[] intArray47 = new int[] { 1, 1, 100 };
        int[] intArray49 = new int[] { (byte) -1 };
        int int50 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray47, intArray49);
        int[] intArray54 = new int[] { 1, 1, 100 };
        int[] intArray56 = new int[] { (byte) -1 };
        int int57 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray54, intArray56);
        int[] intArray60 = new int[] { 'a', 10 };
        int int61 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray56, intArray60);
        int[] intArray65 = new int[] { (byte) 1, (short) 1, (short) -1 };
        int int66 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray56, intArray65);
        int int67 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray49, intArray56);
        int[] intArray71 = new int[] { 1, 1, 100 };
        int[] intArray73 = new int[] { (byte) -1 };
        int int74 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray71, intArray73);
        int int75 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray49, intArray71);
        int int76 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray42, intArray71);
        int int77 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray12, intArray42);
        java.lang.Class<?> wildcardClass78 = intArray42.getClass();
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
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
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[-1, 35, -1]");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
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
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray65), "[1, 1, -1]");
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertNotNull(intArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray71), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray73), "[-1]");
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 137 + "'", int76 == 137);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + (-1) + "'", int77 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass78);
    }

    @Test
    public void test09680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09680");
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
        int[] intArray34 = new int[] { 1, 1, 100 };
        int[] intArray36 = new int[] { (byte) -1 };
        int int37 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray34, intArray36);
        int[] intArray40 = new int[] { 'a', 10 };
        int int41 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray36, intArray40);
        int[] intArray45 = new int[] { (byte) 1, (short) 1, (short) -1 };
        int int46 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray36, intArray45);
        int int47 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray29, intArray36);
        int[] intArray51 = new int[] { 1, 1, 100 };
        int[] intArray53 = new int[] { (byte) -1 };
        int int54 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray51, intArray53);
        int int55 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray29, intArray51);
        int int56 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray5, intArray29);
        java.lang.Class<?> wildcardClass57 = intArray29.getClass();
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
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[-1]");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray45), "[1, 1, -1]");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray51), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray53), "[-1]");
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(wildcardClass57);
    }

    @Test
    public void test09681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09681");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1630.7266346589795d, 416.2672975563163d, 1796.4354730536033d, 2212.6624552246185d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1962.103996062926d + "'", double4 == 1962.103996062926d);
    }

    @Test
    public void test09682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09682");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1058.8724802560664d, 404.2452834900107d, 215.58194439698696d, 2841.342587720177d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1971.887068742176d + "'", double4 == 1971.887068742176d);
    }

    @Test
    public void test09683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09683");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(3333.744814787238d, 2312.181998186525d, 397.69618503940757d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 5248.230627934356d + "'", double4 == 5248.230627934356d);
    }

    @Test
    public void test09684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09684");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1323.0790153317653d, 889.4332799357663d, 1298.8012533832064d, 640.5702084085508d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 682.9404668439121d + "'", double4 == 682.9404668439121d);
    }

    @Test
    public void test09685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09685");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(667.9934772906911d, 1374.3449957716011d, 2491.977296895925d, 224.75210127375607d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2973.576714103079d + "'", double4 == 2973.576714103079d);
    }

    @Test
    public void test09686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09686");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(7777.302188270409d, 875.3763545616694d, 419.1605085322865d, 1009.8810593949327d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 9997.011439157684d + "'", double4 == 9997.011439157684d);
    }

    @Test
    public void test09687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09687");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(604.9655572193913d, 747.5394850438378d, 288.51430590827755d, 1718.9060777076177d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1287.8178439748935d + "'", double4 == 1287.8178439748935d);
    }

    @Test
    public void test09688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09688");
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
        int[] intArray34 = new int[] { 1, 1, 100 };
        int[] intArray36 = new int[] { (byte) -1 };
        int int37 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray34, intArray36);
        int[] intArray40 = new int[] { 'a', 10 };
        int int41 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray36, intArray40);
        int[] intArray45 = new int[] { (byte) 1, (short) 1, (short) -1 };
        int int46 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray36, intArray45);
        int int47 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray29, intArray36);
        int[] intArray51 = new int[] { 1, 1, 100 };
        int[] intArray53 = new int[] { (byte) -1 };
        int int54 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray51, intArray53);
        int[] intArray57 = new int[] { 'a', 10 };
        int int58 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray53, intArray57);
        int[] intArray62 = new int[] { (byte) 1, (short) 1, (short) -1 };
        int int63 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray53, intArray62);
        int[] intArray67 = new int[] { (byte) -1, '#', (-1) };
        int int68 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray53, intArray67);
        int int69 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray36, intArray53);
        int[] intArray73 = new int[] { 1, 1, 100 };
        int[] intArray75 = new int[] { (byte) -1 };
        int int76 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray73, intArray75);
        int[] intArray80 = new int[] { 1, 1, 100 };
        int[] intArray82 = new int[] { (byte) -1 };
        int int83 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray80, intArray82);
        int int84 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray73, intArray82);
        int int85 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray53, intArray82);
        int int86 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray5, intArray53);
        java.lang.Class<?> wildcardClass87 = intArray5.getClass();
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
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[-1]");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray45), "[1, 1, -1]");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray51), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray53), "[-1]");
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray57), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertNotNull(intArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray62), "[1, 1, -1]");
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray67), "[-1, 35, -1]");
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertNotNull(intArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray73), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray75), "[-1]");
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-1) + "'", int76 == (-1));
        org.junit.Assert.assertNotNull(intArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray80), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray82), "[-1]");
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + (-1) + "'", int83 == (-1));
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + (-1) + "'", int84 == (-1));
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 0 + "'", int85 == 0);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 0 + "'", int86 == 0);
        org.junit.Assert.assertNotNull(wildcardClass87);
    }

    @Test
    public void test09689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09689");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(3328.260126876399d, 277.1976496143225d, 1338.34494581654d, 1741.486649791941d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3454.2041812374778d + "'", double4 == 3454.2041812374778d);
    }

    @Test
    public void test09690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09690");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(392.5814609524481d, 1315.1417930135476d, 1339.655130811486d, 297.89177667742257d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 951.7954992793201d + "'", double4 == 951.7954992793201d);
    }

    @Test
    public void test09691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09691");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(527.1382011920248d, 1254.328055159974d, 461.52306304116587d, 2451.7778340001455d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1925.7577891651729d + "'", double4 == 1925.7577891651729d);
    }

    @Test
    public void test09692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09692");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1527.441301287657d, 1750.9175000630846d, 1253.2733556974204d, 821.9404560206501d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 756.9012518562988d + "'", double4 == 756.9012518562988d);
    }

    @Test
    public void test09693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09693");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1014.1739389210353d, 148.27799001310882d, 372.9132654675304d, 1134.7566154815313d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1627.7392989219275d + "'", double4 == 1627.7392989219275d);
    }

    @Test
    public void test09694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09694");
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
        double double35 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray22, doubleArray31, 1);
        double[] doubleArray40 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray41 = new double[] {};
        double double43 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray40, doubleArray41, 0);
        double[] doubleArray48 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray49 = new double[] {};
        double double51 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray48, doubleArray49, 0);
        double double53 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray40, doubleArray49, 1);
        double[] doubleArray58 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray59 = new double[] {};
        double double61 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray58, doubleArray59, 0);
        double[] doubleArray66 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray67 = new double[] {};
        double double69 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray66, doubleArray67, 0);
        double double71 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray59, doubleArray67, (int) (byte) 1);
        double[] doubleArray76 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray77 = new double[] {};
        double double79 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray76, doubleArray77, 0);
        double[] doubleArray84 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray85 = new double[] {};
        double double87 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray84, doubleArray85, 0);
        double double89 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray77, doubleArray85, (int) (byte) 1);
        double double91 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray59, doubleArray77, (int) (short) 0);
        double double93 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray49, doubleArray59, (int) '#');
        double double95 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray22, doubleArray49, (-1));
        double double97 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray13, doubleArray22, 186);
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
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray67), "[]");
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + (-1.0d) + "'", double69 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 0.0d + "'", double71 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray76), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray77), "[]");
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + (-1.0d) + "'", double79 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray84), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray85), "[]");
        org.junit.Assert.assertTrue("'" + double87 + "' != '" + (-1.0d) + "'", double87 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double89 + "' != '" + 0.0d + "'", double89 == 0.0d);
        org.junit.Assert.assertTrue("'" + double91 + "' != '" + 0.0d + "'", double91 == 0.0d);
        org.junit.Assert.assertTrue("'" + double93 + "' != '" + 0.0d + "'", double93 == 0.0d);
        org.junit.Assert.assertTrue("'" + double95 + "' != '" + (-1.0d) + "'", double95 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double97 + "' != '" + (-1.0d) + "'", double97 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass98);
    }

    @Test
    public void test09695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09695");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(2665.866664992479d, 1398.1822850410945d, 1117.796061831161d, 455.7720019217035d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2698.3404181285523d + "'", double4 == 2698.3404181285523d);
    }

    @Test
    public void test09696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09696");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(630.4713680990789d, 539.6162540981873d, 1678.7776013241084d, 407.95790549631715d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1071.6614202526473d + "'", double4 == 1071.6614202526473d);
    }

    @Test
    public void test09697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09697");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(3738.601337452432d, 1370.939463128285d, 2403.8767064663743d, 599.2701060342042d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3411.288674550829d + "'", double4 == 3411.288674550829d);
    }

    @Test
    public void test09698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09698");
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
        double[] doubleArray36 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray37 = new double[] {};
        double double39 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray36, doubleArray37, 0);
        double[] doubleArray44 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray45 = new double[] {};
        double double47 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray44, doubleArray45, 0);
        double[] doubleArray52 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray53 = new double[] {};
        double double55 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray52, doubleArray53, 0);
        double double57 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray44, doubleArray53, 1);
        double double59 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray37, doubleArray53, (int) (short) 10);
        double[] doubleArray64 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray65 = new double[] {};
        double double67 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray64, doubleArray65, 0);
        double[] doubleArray72 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray73 = new double[] {};
        double double75 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray72, doubleArray73, 0);
        double double77 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray64, doubleArray73, 1);
        double double79 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray53, doubleArray64, (int) '#');
        double[] doubleArray84 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray85 = new double[] {};
        double double87 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray84, doubleArray85, 0);
        double double89 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray53, doubleArray85, 1);
        double double91 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray29, doubleArray85, (int) 'a');
        double double93 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray21, doubleArray85, 215);
        // The following exception was thrown during execution in test generation
        try {
            double double95 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray0, doubleArray85, 69);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[]");
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + (-1.0d) + "'", double31 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[]");
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
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + (-1.0d) + "'", double79 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray84), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray85), "[]");
        org.junit.Assert.assertTrue("'" + double87 + "' != '" + (-1.0d) + "'", double87 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double89 + "' != '" + 0.0d + "'", double89 == 0.0d);
        org.junit.Assert.assertTrue("'" + double91 + "' != '" + 0.0d + "'", double91 == 0.0d);
        org.junit.Assert.assertTrue("'" + double93 + "' != '" + (-1.0d) + "'", double93 == (-1.0d));
    }

    @Test
    public void test09699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09699");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1114.3465426363696d, 460.3096842010527d, 443.7592477112694d, 2352.8594294575623d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1408.4038806170365d + "'", double4 == 1408.4038806170365d);
    }

    @Test
    public void test09700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09700");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1551.1654548225517d, 4314.040207033224d, 723.5314800386946d, 313.4536530943542d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1488.9286417937521d + "'", double4 == 1488.9286417937521d);
    }

    @Test
    public void test09701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09701");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1354.9427883510798d, 1599.2423394953043d, 878.0198360873494d, 362.91735790755365d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1713.247933851481d + "'", double4 == 1713.247933851481d);
    }

    @Test
    public void test09702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09702");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance((double) 26, 328.95823136012325d, 3097.782872771407d, 267.02682409492445d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3133.7142800366055d + "'", double4 == 3133.7142800366055d);
    }

    @Test
    public void test09703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09703");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(0.0d, 467.41331001723336d, 1897.5554697718878d, 4775.007048747694d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 6205.149208502349d + "'", double4 == 6205.149208502349d);
    }

    @Test
    public void test09704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09704");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(4012.650505809647d, 1227.3109155003174d, 2630.4527591949336d, 535.8788384307745d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3741.4451536585775d + "'", double4 == 3741.4451536585775d);
    }

    @Test
    public void test09705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09705");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(416.9459369193912d, 2041.1094851846067d, 228.81717627192373d, 3358.6056661977523d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2947.6693154831314d + "'", double4 == 2947.6693154831314d);
    }

    @Test
    public void test09706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09706");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(0.0d, 998.1857531291378d, 467.2146157038885d, 1389.4086424534037d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1465.860113670995d + "'", double4 == 1465.860113670995d);
    }

    @Test
    public void test09707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09707");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1752.086370184258d, 2633.3648457214576d, 632.3899450763809d, 379.5508275005132d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1771.319818759312d + "'", double4 == 1771.319818759312d);
    }

    @Test
    public void test09708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09708");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(328.40506154074217d, 1871.9372415251735d, 243.14774917259138d, 703.755100043443d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1253.4394538498814d + "'", double4 == 1253.4394538498814d);
    }

    @Test
    public void test09709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09709");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1879.0131797586437d, 4639.072921645695d, 656.7162468754174d, 553.8418281886552d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 5307.528026340266d + "'", double4 == 5307.528026340266d);
    }

    @Test
    public void test09710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09710");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(761.6766798071633d, 1920.2668974122569d, 293.96891861545134d, 497.071677087719d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 537.3698515390686d + "'", double4 == 537.3698515390686d);
    }

    @Test
    public void test09711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09711");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(820.1625256517515d, 877.0734399189231d, 2127.003970620945d, 339.22056403947073d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1844.694320848646d + "'", double4 == 1844.694320848646d);
    }

    @Test
    public void test09712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09712");
        double[] doubleArray4 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray5 = new double[] {};
        double double7 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray4, doubleArray5, 0);
        double[] doubleArray12 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray13 = new double[] {};
        double double15 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray12, doubleArray13, 0);
        double[] doubleArray20 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray21 = new double[] {};
        double double23 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray20, doubleArray21, 0);
        double double25 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray13, doubleArray21, (int) (byte) 1);
        double[] doubleArray30 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray31 = new double[] {};
        double double33 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray30, doubleArray31, 0);
        double[] doubleArray38 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray39 = new double[] {};
        double double41 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray38, doubleArray39, 0);
        double double43 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray30, doubleArray39, (int) (short) 100);
        double double45 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray21, doubleArray39, (int) (short) 0);
        double[] doubleArray50 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray51 = new double[] {};
        double double53 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray50, doubleArray51, 0);
        double[] doubleArray58 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray59 = new double[] {};
        double double61 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray58, doubleArray59, 0);
        double double63 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray50, doubleArray59, (int) (short) 100);
        double[] doubleArray66 = new double[] { (byte) 0, 132.0d };
        double double68 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray59, doubleArray66, (int) '4');
        double[] doubleArray70 = new double[] { (short) 0 };
        double[] doubleArray75 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray76 = new double[] {};
        double double78 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray75, doubleArray76, 0);
        double[] doubleArray83 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray84 = new double[] {};
        double double86 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray83, doubleArray84, 0);
        double double88 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray75, doubleArray84, (int) (short) 100);
        double double90 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray70, doubleArray75, 1);
        double double92 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray66, doubleArray75, 1);
        double double94 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray21, doubleArray75, 26);
        double double96 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray4, doubleArray21, 111);
        java.lang.Class<?> wildcardClass97 = doubleArray4.getClass();
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
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
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
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[0.0, 132.0]");
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + (-1.0d) + "'", double68 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray70), "[0.0]");
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
        org.junit.Assert.assertTrue("'" + double92 + "' != '" + (-1.0d) + "'", double92 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double94 + "' != '" + (-1.0d) + "'", double94 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double96 + "' != '" + (-1.0d) + "'", double96 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass97);
    }

    @Test
    public void test09713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09713");
        int[] intArray0 = null;
        int[] intArray4 = new int[] { 1, 1, 100 };
        int[] intArray6 = new int[] { (byte) -1 };
        int int7 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray4, intArray6);
        int[] intArray11 = new int[] { 1, 1, 100 };
        int[] intArray13 = new int[] { (byte) -1 };
        int int14 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray11, intArray13);
        int[] intArray17 = new int[] { 'a', 10 };
        int int18 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray13, intArray17);
        int int19 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray4, intArray17);
        int[] intArray23 = new int[] { 1, 1, 100 };
        int[] intArray25 = new int[] { (byte) -1 };
        int int26 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray23, intArray25);
        int[] intArray29 = new int[] { 'a', 10 };
        int int30 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray25, intArray29);
        int[] intArray34 = new int[] { (byte) 1, (short) 1, (short) -1 };
        int int35 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray25, intArray34);
        int[] intArray39 = new int[] { 1, 1, 100 };
        int[] intArray41 = new int[] { (byte) -1 };
        int int42 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray39, intArray41);
        int[] intArray45 = new int[] { 'a', 10 };
        int int46 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray41, intArray45);
        int[] intArray50 = new int[] { 1, 1, 100 };
        int[] intArray52 = new int[] { (byte) -1 };
        int int53 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray50, intArray52);
        int[] intArray57 = new int[] { 1, 1, 100 };
        int[] intArray59 = new int[] { (byte) -1 };
        int int60 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray57, intArray59);
        int[] intArray63 = new int[] { 'a', 10 };
        int int64 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray59, intArray63);
        int int65 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray50, intArray63);
        int int66 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray41, intArray50);
        int int67 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray34, intArray41);
        int[] intArray71 = new int[] { 1, 1, 100 };
        int[] intArray73 = new int[] { (byte) -1 };
        int int74 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray71, intArray73);
        int[] intArray78 = new int[] { 1, 1, 100 };
        int[] intArray80 = new int[] { (byte) -1 };
        int int81 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray78, intArray80);
        int int82 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray71, intArray80);
        int int83 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray34, intArray71);
        int int84 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray17, intArray34);
        int[] intArray88 = new int[] { (byte) -1, (short) -1, ' ' };
        int[] intArray92 = new int[] { 1, 1, 100 };
        int[] intArray94 = new int[] { (byte) -1 };
        int int95 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray92, intArray94);
        int int96 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray88, intArray92);
        int int97 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray17, intArray88);
        // The following exception was thrown during execution in test generation
        try {
            int int98 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray0, intArray88);
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[-1]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[1, 1, -1]");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[-1]");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray45), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray50), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray52), "[-1]");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray57), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray59), "[-1]");
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray63), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertNotNull(intArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray71), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray73), "[-1]");
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
        org.junit.Assert.assertNotNull(intArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray78), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray80), "[-1]");
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + (-1) + "'", int81 == (-1));
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + (-1) + "'", int82 == (-1));
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 101 + "'", int83 == 101);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + (-1) + "'", int84 == (-1));
        org.junit.Assert.assertNotNull(intArray88);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray88), "[-1, -1, 32]");
        org.junit.Assert.assertNotNull(intArray92);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray92), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray94);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray94), "[-1]");
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + (-1) + "'", int95 == (-1));
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + 72 + "'", int96 == 72);
        org.junit.Assert.assertTrue("'" + int97 + "' != '" + (-1) + "'", int97 == (-1));
    }

    @Test
    public void test09714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09714");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(592.6254712012968d, 639.9793613446573d, 435.27058973391496d, 363.5896205997675d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 277.88123287185095d + "'", double4 == 277.88123287185095d);
    }

    @Test
    public void test09715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09715");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1352.575250926855d, 129.18370657668194d, 841.7807386553494d, 1950.2065223133231d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2331.817328008147d + "'", double4 == 2331.817328008147d);
    }

    @Test
    public void test09716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09716");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1377.7233444934122d, 1438.030912291867d, 830.6469788472128d, 862.375431081755d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1122.7318468563114d + "'", double4 == 1122.7318468563114d);
    }

    @Test
    public void test09717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09717");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(983.8397599078845d, 1604.248702902869d, 1812.197885956591d, 3494.9507443505227d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2644.2117088424293d + "'", double4 == 2644.2117088424293d);
    }

    @Test
    public void test09718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09718");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(403.30415572758443d, 444.3546768000051d, 722.6232885111716d, 425.71130297188733d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 320.10434050367087d + "'", double4 == 320.10434050367087d);
    }

    @Test
    public void test09719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09719");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(3688.033053072502d, 889.1457634572043d, 2720.184064082162d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3812.914825438001d + "'", double4 == 3812.914825438001d);
    }

    @Test
    public void test09720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09720");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1871.9372415251735d, 887.1797054846726d, 435.23956646732995d, 2693.719675700718d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3243.237645273889d + "'", double4 == 3243.237645273889d);
    }

    @Test
    public void test09721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09721");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(89.77848449612381d, 978.6260708451896d, 2944.4139862915267d, 3505.1424527798863d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4451.25318129195d + "'", double4 == 4451.25318129195d);
    }

    @Test
    public void test09722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09722");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1573.125977548808d, 241.86946405314654d, 641.156637911209d, 2348.3173500617618d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1212.2246136929655d + "'", double4 == 1212.2246136929655d);
    }

    @Test
    public void test09723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09723");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(0.0d, 1490.599607119517d, 230.1492652373609d, 182.53302624480077d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 293.74647225010585d + "'", double4 == 293.74647225010585d);
    }

    @Test
    public void test09724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09724");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(80.72264272297954d, 490.974661774162d, 121.95119009721917d, 809.867614684615d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 360.1215002846926d + "'", double4 == 360.1215002846926d);
    }

    @Test
    public void test09725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09725");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(980.0794169329689d, 453.9979220211067d, 1259.645191535356d, 504.6692634565124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 551.5177570645759d + "'", double4 == 551.5177570645759d);
    }

    @Test
    public void test09726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09726");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(683.5143085001474d, 161.69929982227998d, 228.29858276560483d, 990.4666361499317d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 549.0365091737041d + "'", double4 == 549.0365091737041d);
    }

    @Test
    public void test09727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09727");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(802.6421558686652d, 1296.4671724019547d, 652.042545403267d, 806.8449379314189d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 640.221844935934d + "'", double4 == 640.221844935934d);
    }

    @Test
    public void test09728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09728");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1640.6118970208706d, 1306.671682424156d, 4771.91037076049d, 4409.43197409875d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 6234.058765414214d + "'", double4 == 6234.058765414214d);
    }

    @Test
    public void test09729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09729");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(2579.1391723066113d, 2744.73965020855d, 1024.2147559076318d, 2263.9596978345935d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2035.7043687729358d + "'", double4 == 2035.7043687729358d);
    }

    @Test
    public void test09730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09730");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(2306.570276245635d, 2294.6287863299817d, 0.0d, 710.9485152839799d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3890.250547291637d + "'", double4 == 3890.250547291637d);
    }

    @Test
    public void test09731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09731");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(823.2048226688985d, 2405.127137057149d, 793.4300519665393d, 988.8896848456425d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 168.33897506194077d + "'", double4 == 168.33897506194077d);
    }

    @Test
    public void test09732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09732");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(5247.81076182208d, 603.6662480102977d, 0.0d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 7421.52515213627d + "'", double4 == 7421.52515213627d);
    }

    @Test
    public void test09733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09733");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1275.2384505099035d, 1464.9275654469902d, (double) (byte) 10, 288.27409847270104d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1604.6578977591817d + "'", double4 == 1604.6578977591817d);
    }

    @Test
    public void test09734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09734");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1748.8675041161737d, 2009.6407974656586d, 175.73968350130355d, 948.6076268806784d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1764.9779066904666d + "'", double4 == 1764.9779066904666d);
    }

    @Test
    public void test09735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09735");
        int[] intArray0 = null;
        int[] intArray4 = new int[] { 1, 1, 100 };
        int[] intArray6 = new int[] { (byte) -1 };
        int int7 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray4, intArray6);
        int[] intArray10 = new int[] { 'a', 10 };
        int int11 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray6, intArray10);
        int[] intArray15 = new int[] { 1, 1, 100 };
        int[] intArray17 = new int[] { (byte) -1 };
        int int18 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray15, intArray17);
        int[] intArray21 = new int[] { 'a', 10 };
        int int22 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray17, intArray21);
        int[] intArray26 = new int[] { 1, 1, 100 };
        int[] intArray28 = new int[] { (byte) -1 };
        int int29 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray26, intArray28);
        int[] intArray33 = new int[] { 1, 1, 100 };
        int[] intArray35 = new int[] { (byte) -1 };
        int int36 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray33, intArray35);
        int[] intArray39 = new int[] { 'a', 10 };
        int int40 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray35, intArray39);
        int int41 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray26, intArray39);
        int int42 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray17, intArray26);
        int[] intArray46 = new int[] { 1, 1, 100 };
        int[] intArray48 = new int[] { (byte) -1 };
        int int49 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray46, intArray48);
        int[] intArray52 = new int[] { 'a', 10 };
        int int53 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray48, intArray52);
        int[] intArray57 = new int[] { (byte) 1, (short) 1, (short) -1 };
        int int58 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray48, intArray57);
        int int59 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray17, intArray48);
        int[] intArray63 = new int[] { 1, 1, 100 };
        int[] intArray65 = new int[] { (byte) -1 };
        int int66 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray63, intArray65);
        int int67 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray48, intArray63);
        int int68 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray6, intArray48);
        // The following exception was thrown during execution in test generation
        try {
            int int69 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray0, intArray6);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[-1]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[-1]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
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
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray57), "[1, 1, -1]");
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray63), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray65), "[-1]");
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
    }

    @Test
    public void test09736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09736");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1966.5119245894105d, 871.3030756585122d, 621.5343680937419d, 2698.2828067561045d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1531.1607529792818d + "'", double4 == 1531.1607529792818d);
    }

    @Test
    public void test09737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09737");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(167.58795437292852d, 0.0d, 728.6883712509082d, 3354.051360272725d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3915.1517771507047d + "'", double4 == 3915.1517771507047d);
    }

    @Test
    public void test09738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09738");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(0.0d, 142.38024339966802d, 448.6208835583424d, 784.2049386362926d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1090.445578794967d + "'", double4 == 1090.445578794967d);
    }

    @Test
    public void test09739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09739");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(248.76133480910391d, 1416.821036606561d, 423.4184263336566d, 78.45227647258133d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1513.0258516585322d + "'", double4 == 1513.0258516585322d);
    }

    @Test
    public void test09740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09740");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(682.2888627629408d, 1541.3789157875988d, 569.5764040552847d, 3686.983176084095d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3006.8076118788185d + "'", double4 == 3006.8076118788185d);
    }

    @Test
    public void test09741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09741");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(2576.4318188109983d, 173.28086302383906d, 254.16807522747047d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3468.5601928962296d + "'", double4 == 3468.5601928962296d);
    }

    @Test
    public void test09742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09742");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(137.03519842149686d, 1045.5242291972786d, 2386.244584635255d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2253.380018691585d + "'", double4 == 2253.380018691585d);
    }

    @Test
    public void test09743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09743");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(0.0d, 4041.3260499355197d, 0.0d, 416.5814657370902d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 416.5814657370902d + "'", double4 == 416.5814657370902d);
    }

    @Test
    public void test09744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09744");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(286.88848007544675d, 0.0d, 3253.043904178141d, 792.0828056013817d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3008.8701046202436d + "'", double4 == 3008.8701046202436d);
    }

    @Test
    public void test09745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09745");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(2613.0635560076043d, 137.42302032977943d, 1138.736416197663d, 621.366655462836d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2478.0026349501327d + "'", double4 == 2478.0026349501327d);
    }

    @Test
    public void test09746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09746");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(2395.0492959748417d, 119.99500012499374d, 1179.088709169527d, 349.48898822337424d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1445.4545749036952d + "'", double4 == 1445.4545749036952d);
    }

    @Test
    public void test09747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09747");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(893.7462019837074d, 461.52306304116587d, 775.270960288489d, 3604.132419178024d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3261.0845978320763d + "'", double4 == 3261.0845978320763d);
    }

    @Test
    public void test09748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09748");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(36.0d, 254.8256188575748d, 1260.5815419427367d, 1600.5265606902042d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1986.7922166074563d + "'", double4 == 1986.7922166074563d);
    }

    @Test
    public void test09749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09749");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(5730.048124458685d, 5259.367280449998d, 1823.2566571033663d, 397.8625759407711d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 6610.2361752984d + "'", double4 == 6610.2361752984d);
    }

    @Test
    public void test09750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09750");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(500.4832062519777d, 1573.9582573676535d, 403.30415572758443d, 2376.9769036143766d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 900.1976967711164d + "'", double4 == 900.1976967711164d);
    }

    @Test
    public void test09751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09751");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1993.8547663733802d, 1193.1330186882983d, 724.5087979742074d, 210.43152753590826d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2252.047459551563d + "'", double4 == 2252.047459551563d);
    }

    @Test
    public void test09752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09752");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(486.76902224492216d, 786.310466018661d, 1957.3647360529133d, 633.8394186690646d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1477.9314784437029d + "'", double4 == 1477.9314784437029d);
    }

    @Test
    public void test09753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09753");
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
        double[] doubleArray58 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray59 = new double[] {};
        double double61 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray58, doubleArray59, 0);
        double double63 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray50, doubleArray59, 1);
        double double65 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray43, doubleArray50, (int) ' ');
        double double67 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray5, doubleArray50, (int) '#');
        double[] doubleArray72 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray73 = new double[] {};
        double double75 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray72, doubleArray73, 0);
        double[] doubleArray81 = new double[] { 232.4213562373095d, (short) 0, 1.0f, 75.85073476263909d, (-1L) };
        double double83 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray73, doubleArray81, (int) (byte) -1);
        double double85 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray5, doubleArray73, (int) ' ');
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
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[]");
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + (-1.0d) + "'", double61 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + (-1.0d) + "'", double63 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + (-1.0d) + "'", double65 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + (-1.0d) + "'", double67 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray72), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray73), "[]");
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + (-1.0d) + "'", double75 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray81), "[232.4213562373095, 0.0, 1.0, 75.85073476263909, -1.0]");
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + (-1.0d) + "'", double83 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double85 + "' != '" + 0.0d + "'", double85 == 0.0d);
    }

    @Test
    public void test09754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09754");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1130.1135156267658d, 178.6467289963071d, 5156.672867077386d, 506.64081324618246d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4354.553435700496d + "'", double4 == 4354.553435700496d);
    }

    @Test
    public void test09755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09755");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(2476.9376946236957d, 0.0d, 1272.63466436038d, 1884.603951374186d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3088.9069816375018d + "'", double4 == 3088.9069816375018d);
    }

    @Test
    public void test09756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09756");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(114.61486138519422d, 1315.3811552006025d, 2634.9365844739787d, 1073.3105833825828d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2696.501265575322d + "'", double4 == 2696.501265575322d);
    }

    @Test
    public void test09757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09757");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(0.0d, 2183.9448788749164d, 245.39699806137992d, 1125.3972768193007d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1303.9446001169956d + "'", double4 == 1303.9446001169956d);
    }

    @Test
    public void test09758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09758");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1344.3225833894705d, 1080.9951197755147d, 539.6799180924086d, 452.3869766947d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1201.2489106368955d + "'", double4 == 1201.2489106368955d);
    }

    @Test
    public void test09759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09759");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(565.0430972477499d, 1440.3010542662378d, 459.0392575681089d, 321.36797934291167d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 265.7336582233493d + "'", double4 == 265.7336582233493d);
    }

    @Test
    public void test09760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09760");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(505.57540820504266d, (double) (byte) -1, 918.9650879856456d, 510.63044040816783d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 925.0201201887708d + "'", double4 == 925.0201201887708d);
    }

    @Test
    public void test09761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09761");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(2072.2399217045445d, 2594.869788752475d, 1654.4778896802009d, 102.8619978699419d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2909.7698229068765d + "'", double4 == 2909.7698229068765d);
    }

    @Test
    public void test09762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09762");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(913.9919598167148d, 1810.1478849203654d, 555.4700417755369d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 981.7939031820906d + "'", double4 == 981.7939031820906d);
    }

    @Test
    public void test09763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09763");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(258.891505624066d, 0.0d, 748.9068030372753d, 423.1701731848648d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 516.8195742369936d + "'", double4 == 516.8195742369936d);
    }

    @Test
    public void test09764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09764");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1008.5430500138841d, 3224.750463084224d, 1898.2295560361429d, 741.9580269038474d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 928.7678146580412d + "'", double4 == 928.7678146580412d);
    }

    @Test
    public void test09765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09765");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(0.0d, 1197.6466171091483d, 922.8406127352839d, 1128.0048787018088d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 992.4823511426234d + "'", double4 == 992.4823511426234d);
    }

    @Test
    public void test09766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09766");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(2067.429468691161d, 0.0d, 1307.1581670831067d, 859.1165474429449d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1619.3878490509994d + "'", double4 == 1619.3878490509994d);
    }

    @Test
    public void test09767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09767");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1266.4899725593261d, 72.90846425408961d, 625.6564411301682d, 758.461171135048d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1326.3862383101164d + "'", double4 == 1326.3862383101164d);
    }

    @Test
    public void test09768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09768");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(3128.8358804903896d, 765.2293621740017d, 145.26167378243554d, 2909.7698229068765d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2991.6057535240466d + "'", double4 == 2991.6057535240466d);
    }

    @Test
    public void test09769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09769");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(3151.1244755180587d, 1495.4363159892928d, 4213.551643492881d, 1840.9605867208377d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1686.7960465803976d + "'", double4 == 1686.7960465803976d);
    }

    @Test
    public void test09770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09770");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1382.320804600945d, 2932.633334814371d, 2114.127724748375d, 1252.6596496298803d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 743.2048058806519d + "'", double4 == 743.2048058806519d);
    }

    @Test
    public void test09771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09771");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance((double) 10L, 133.29291006037232d, 576.3209845737458d, 611.5484027254348d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1044.5764772388084d + "'", double4 == 1044.5764772388084d);
    }

    @Test
    public void test09772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09772");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(353.658609881411d, 158.31063183921498d, 2190.8647257132316d, 382.3375952363319d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1837.4299432225528d + "'", double4 == 1837.4299432225528d);
    }

    @Test
    public void test09773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09773");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(917.0018427255086d, 4007.0655384628067d, 44.0d, 992.8835504125221d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3887.183830775793d + "'", double4 == 3887.183830775793d);
    }

    @Test
    public void test09774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09774");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1466.7318327413238d, 957.8278142176666d, 0.0d, 2082.0447751103634d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2590.9487936340206d + "'", double4 == 2590.9487936340206d);
    }

    @Test
    public void test09775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09775");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1756.7292415146644d, 1584.623345137529d, 810.8400132617926d, 734.2659335821604d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1392.8882396635747d + "'", double4 == 1392.8882396635747d);
    }

    @Test
    public void test09776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09776");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(282.68787864005503d, 651.4876990149558d, 582.0571490761524d, 810.7479824738504d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 607.0168311854293d + "'", double4 == 607.0168311854293d);
    }

    @Test
    public void test09777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09777");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(6365.254891436018d, 1967.3253215765246d, 774.0897884912134d, 212.90363914888033d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 8313.396005237984d + "'", double4 == 8313.396005237984d);
    }

    @Test
    public void test09778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09778");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(98.0d, 1390.5887209367127d, 946.5413807087698d, 757.447532267641d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1074.659724093644d + "'", double4 == 1074.659724093644d);
    }

    @Test
    public void test09779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09779");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(3290.4517282620604d, 0.0d, 508.15729725356135d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2782.294431008499d + "'", double4 == 2782.294431008499d);
    }

    @Test
    public void test09780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09780");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(508.1126745005731d, 221.38186019448963d, 284.43176294350855d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 445.06277175155424d + "'", double4 == 445.06277175155424d);
    }

    @Test
    public void test09781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09781");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(508.5647858466356d, 398.2548271112235d, 967.2493586776095d, 944.2937431290189d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1004.7234888487693d + "'", double4 == 1004.7234888487693d);
    }

    @Test
    public void test09782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09782");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1447.804915154999d, 913.1298436135796d, 604.9083823509063d, 952.4965584854033d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 977.6527671928803d + "'", double4 == 977.6527671928803d);
    }

    @Test
    public void test09783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09783");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1685.5753231017197d, 1357.430063107238d, 488.02963325941397d, 211.41272043388378d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1899.2817216948865d + "'", double4 == 1899.2817216948865d);
    }

    @Test
    public void test09784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09784");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(3151.7523650958406d, 0.0d, 1513.686550350365d, 7284.909850341347d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 8922.975665086822d + "'", double4 == 8922.975665086822d);
    }

    @Test
    public void test09785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09785");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1073.2871448156998d, 2648.6934419143936d, 143.38926349619703d, 832.0762245587605d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 960.6730857756448d + "'", double4 == 960.6730857756448d);
    }

    @Test
    public void test09786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09786");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1026.0204526500195d, 1003.7698639842804d, 456.622934142084d, 951.3857669727188d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 574.2681171623096d + "'", double4 == 574.2681171623096d);
    }

    @Test
    public void test09787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09787");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1172.7228887780416d, 1547.4756003380492d, 717.3390643861583d, 1206.42599033948d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 456.62930980461414d + "'", double4 == 456.62930980461414d);
    }

    @Test
    public void test09788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09788");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(956.2873335560257d, 5564.414943497599d, 650.1262301509605d, 384.7573158122918d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 5485.818731090372d + "'", double4 == 5485.818731090372d);
    }

    @Test
    public void test09789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09789");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(566.8081289066193d, 1606.936592026248d, 2735.5668570637113d, 278.2673848707231d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2187.8688676258353d + "'", double4 == 2187.8688676258353d);
    }

    @Test
    public void test09790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09790");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(2403.227680037803d, 1320.9653532119426d, 215.79579510719145d, 994.6653104625752d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2601.7121670535485d + "'", double4 == 2601.7121670535485d);
    }

    @Test
    public void test09791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09791");
        int[] intArray3 = new int[] { 1, 1, 100 };
        int[] intArray5 = new int[] { (byte) -1 };
        int int6 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray3, intArray5);
        int[] intArray10 = new int[] { 1, 1, 100 };
        int[] intArray12 = new int[] { (byte) -1 };
        int int13 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray10, intArray12);
        int[] intArray16 = new int[] { 'a', 10 };
        int int17 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray12, intArray16);
        int[] intArray21 = new int[] { 1, 1, 100 };
        int[] intArray23 = new int[] { (byte) -1 };
        int int24 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray21, intArray23);
        int[] intArray28 = new int[] { 1, 1, 100 };
        int[] intArray30 = new int[] { (byte) -1 };
        int int31 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray28, intArray30);
        int[] intArray34 = new int[] { 'a', 10 };
        int int35 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray30, intArray34);
        int int36 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray21, intArray34);
        int int37 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray12, intArray34);
        int[] intArray41 = new int[] { 1, 1, 100 };
        int[] intArray43 = new int[] { (byte) -1 };
        int int44 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray41, intArray43);
        int[] intArray47 = new int[] { 'a', 10 };
        int int48 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray43, intArray47);
        int[] intArray52 = new int[] { (byte) 1, (short) 1, (short) -1 };
        int int53 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray43, intArray52);
        int[] intArray57 = new int[] { 1, 1, 100 };
        int[] intArray59 = new int[] { (byte) -1 };
        int int60 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray57, intArray59);
        int[] intArray63 = new int[] { 'a', 10 };
        int int64 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray59, intArray63);
        int[] intArray68 = new int[] { 1, 1, 100 };
        int[] intArray70 = new int[] { (byte) -1 };
        int int71 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray68, intArray70);
        int[] intArray75 = new int[] { 1, 1, 100 };
        int[] intArray77 = new int[] { (byte) -1 };
        int int78 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray75, intArray77);
        int[] intArray81 = new int[] { 'a', 10 };
        int int82 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray77, intArray81);
        int int83 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray68, intArray81);
        int int84 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray59, intArray68);
        int int85 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray52, intArray59);
        int int86 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray12, intArray59);
        int int87 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray5, intArray12);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[-1]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[-1]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray43), "[-1]");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray52), "[1, 1, -1]");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray57), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray59), "[-1]");
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray63), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertNotNull(intArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray68), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray70), "[-1]");
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertNotNull(intArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray75), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray77), "[-1]");
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
        org.junit.Assert.assertNotNull(intArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray81), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + (-1) + "'", int82 == (-1));
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + (-1) + "'", int83 == (-1));
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + (-1) + "'", int84 == (-1));
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + (-1) + "'", int85 == (-1));
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 0 + "'", int86 == 0);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 0 + "'", int87 == 0);
    }

    @Test
    public void test09792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09792");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(738.3183224291665d, 195.96347416036195d, 2036.3891841829804d, 459.7280589510255d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1327.6296535702677d + "'", double4 == 1327.6296535702677d);
    }

    @Test
    public void test09793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09793");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1374.6887642521624d, 112.71645842555559d, 1048.2917412637946d, 999.620023574899d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 497.2037578788975d + "'", double4 == 497.2037578788975d);
    }

    @Test
    public void test09794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09794");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(2339.736452955298d, 303.938625096827d, 448.9204830274926d, 916.6703084179811d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2366.4957815010634d + "'", double4 == 2366.4957815010634d);
    }

    @Test
    public void test09795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09795");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(337.2891032685724d, 594.1232436790938d, 0.0d, 438.0401328127323d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 352.0152115149655d + "'", double4 == 352.0152115149655d);
    }

    @Test
    public void test09796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09796");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1844.1914145109913d, 546.2486273454158d, 524.6435521795014d, 754.3488126505918d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1711.4214728737775d + "'", double4 == 1711.4214728737775d);
    }

    @Test
    public void test09797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09797");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1052.591885354206d, 1613.5602924740228d, 625.6937260857255d, 2117.867869811181d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 931.2057366056388d + "'", double4 == 931.2057366056388d);
    }

    @Test
    public void test09798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09798");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(3212.7312669658486d, 279.4673697256193d, 0.0d, 2718.4138276026733d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 5651.6777248429025d + "'", double4 == 5651.6777248429025d);
    }

    @Test
    public void test09799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09799");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1692.106964457491d, 957.5562404372337d, 248.10393736653214d, 1584.623345137529d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1447.997745395334d + "'", double4 == 1447.997745395334d);
    }

    @Test
    public void test09800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09800");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(661.9922489647493d, 651.4876990149558d, 1220.4195624529725d, 738.3183224291665d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 645.257936902434d + "'", double4 == 645.257936902434d);
    }

    @Test
    public void test09801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09801");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(3495.9851218538834d, 773.0647599387627d, 1282.991063948638d, 807.8330280746628d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2247.7623260411456d + "'", double4 == 2247.7623260411456d);
    }

    @Test
    public void test09802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09802");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(0.0d, 0.0d, 661.4062218796978d, 1107.4542691037336d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1768.8604909834314d + "'", double4 == 1768.8604909834314d);
    }

    @Test
    public void test09803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09803");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(398.2548271112235d, 1675.3825719284541d, 1832.171506435053d, 881.4195366634596d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2227.8797145888243d + "'", double4 == 2227.8797145888243d);
    }

    @Test
    public void test09804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09804");
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
        java.lang.Class<?> wildcardClass96 = doubleArray29.getClass();
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
    public void test09805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09805");
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
        int[] intArray35 = new int[] { (byte) 1, (short) 1, (short) -1 };
        int int36 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray26, intArray35);
        int int37 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray19, intArray26);
        int[] intArray41 = new int[] { 1, 1, 100 };
        int[] intArray43 = new int[] { (byte) -1 };
        int int44 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray41, intArray43);
        int[] intArray47 = new int[] { 'a', 10 };
        int int48 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray43, intArray47);
        int[] intArray52 = new int[] { (byte) 1, (short) 1, (short) -1 };
        int int53 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray43, intArray52);
        int int54 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray26, intArray43);
        int int55 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray5, intArray43);
        java.lang.Class<?> wildcardClass56 = intArray43.getClass();
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
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[1, 1, -1]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray43), "[-1]");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray52), "[1, 1, -1]");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(wildcardClass56);
    }

    @Test
    public void test09806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09806");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(415.78775792499863d, 332.8889793328518d, 518.8913692030045d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 428.380455085037d + "'", double4 == 428.380455085037d);
    }

    @Test
    public void test09807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09807");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1395.7652132288606d, 3285.0646874286413d, 1891.1585887149004d, 2574.3991145054943d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1278.5118183708862d + "'", double4 == 1278.5118183708862d);
    }

    @Test
    public void test09808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09808");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(704.768747047279d, 607.2249268884098d, 1041.709038520019d, 1118.0418394490325d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 847.7572040333628d + "'", double4 == 847.7572040333628d);
    }

    @Test
    public void test09809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09809");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(948.6381094211112d, 582.3482949245309d, 1079.8682158269867d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 957.6719707046655d + "'", double4 == 957.6719707046655d);
    }

    @Test
    public void test09810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09810");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(894.371211079321d, 4425.803148936303d, 495.98534344978606d, 717.5554773001766d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 435.86133487474507d + "'", double4 == 435.86133487474507d);
    }

    @Test
    public void test09811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09811");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1298.164086963671d, 1589.9588225247408d, 1656.4424037350886d, 712.3285698638872d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1235.9085694322712d + "'", double4 == 1235.9085694322712d);
    }

    @Test
    public void test09812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09812");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(467.41331001723336d, 812.967611667732d, 1735.5442395095765d, 3188.61092147518d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3002.177958572667d + "'", double4 == 3002.177958572667d);
    }

    @Test
    public void test09813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09813");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1465.0136494931053d, 490.7322591768047d, 2000.4631476266463d, 828.4960160853518d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 831.7817398154808d + "'", double4 == 831.7817398154808d);
    }

    @Test
    public void test09814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09814");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(439.22202415293077d, 1067.7471678006414d, 4639.072921645695d, 829.349727072121d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4438.248338221285d + "'", double4 == 4438.248338221285d);
    }

    @Test
    public void test09815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09815");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(6509.27219757807d, 1461.5375422818581d, 729.0184993438161d, 463.53642524090617d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 6778.254815275205d + "'", double4 == 6778.254815275205d);
    }

    @Test
    public void test09816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09816");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1392.0681707335123d, 828.4960160853518d, 897.4660019579145d, 2621.569511336641d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1325.2565230559762d + "'", double4 == 1325.2565230559762d);
    }

    @Test
    public void test09817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09817");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1136.6258215359471d, 899.4000625779199d, 504.0523441952501d, 480.053811204915d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1051.919728713702d + "'", double4 == 1051.919728713702d);
    }

    @Test
    public void test09818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09818");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(181.94685709660757d, 246.73421824148423d, 2416.6724926300785d, 2504.2869072301014d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4492.278324522089d + "'", double4 == 4492.278324522089d);
    }

    @Test
    public void test09819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09819");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1693.1313159426159d, 1496.5843769624714d, 1719.585436746232d, 1815.3200360754631d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 125.01961380197746d + "'", double4 == 125.01961380197746d);
    }

    @Test
    public void test09820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09820");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(175.73968350130355d, 2087.7515142177117d, 459.7280589510255d, 525.6033028024341d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1846.1365868649996d + "'", double4 == 1846.1365868649996d);
    }

    @Test
    public void test09821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09821");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(98.0d, 538.9516916713967d, 340.1389565506388d, 867.1622518811478d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 806.3757461619927d + "'", double4 == 806.3757461619927d);
    }

    @Test
    public void test09822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09822");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1579.963361562504d, 105.74562271114466d, 1899.3875850292193d, 601.712149954323d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1029.0807876693589d + "'", double4 == 1029.0807876693589d);
    }

    @Test
    public void test09823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09823");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(981.552780344625d, 161.15072637849005d, 326.0653325559482d, 328.77297056953023d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 925.0866306776476d + "'", double4 == 925.0866306776476d);
    }

    @Test
    public void test09824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09824");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(755.997710019333d, 622.3178581245444d, 1602.9539488706366d, 565.8374473901113d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 868.0413561647631d + "'", double4 == 868.0413561647631d);
    }

    @Test
    public void test09825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09825");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(657.2767548962429d, 584.1988458892276d, 2676.984601309733d, 593.8639215535189d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2029.3729220777814d + "'", double4 == 2029.3729220777814d);
    }

    @Test
    public void test09826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09826");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1803.668260918566d, 324.7608056812169d, 657.3298266720961d, 683.1376202102352d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1603.0223712091076d + "'", double4 == 1603.0223712091076d);
    }

    @Test
    public void test09827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09827");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(2724.503084374335d, 294.7641266225551d, 824.3617257768799d, 37.3064424931273d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3291.133995265191d + "'", double4 == 3291.133995265191d);
    }

    @Test
    public void test09828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09828");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1731.0565808224262d, 720.8774982525197d, 490.7322591768047d, 881.5814085104663d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1401.0282319035682d + "'", double4 == 1401.0282319035682d);
    }

    @Test
    public void test09829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09829");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(2039.912377082118d, 1457.0852203350687d, 96.97872581617344d, 2779.79318285368d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2079.041793704684d + "'", double4 == 2079.041793704684d);
    }

    @Test
    public void test09830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09830");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(361.40691134511934d, 716.8369233741474d, 133.29291006037232d, 277.9680387517694d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 242.89512766168622d + "'", double4 == 242.89512766168622d);
    }

    @Test
    public void test09831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09831");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(974.5095294594933d, 1549.5883291412417d, 1569.9378969388893d, 4564.280230512779d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3638.816926823851d + "'", double4 == 3638.816926823851d);
    }

    @Test
    public void test09832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09832");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1160.324147252274d, 1783.9230352545133d, 1397.4308804965908d, 1327.2489971412958d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 693.7807713575341d + "'", double4 == 693.7807713575341d);
    }

    @Test
    public void test09833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09833");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(2446.974580808893d, 0.0d, 1084.0353931512184d, 1627.7392989219275d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1590.2042876125624d + "'", double4 == 1590.2042876125624d);
    }

    @Test
    public void test09834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09834");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(582.0571490761524d, 640.221844935934d, 896.632439101549d, 1416.821036606561d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 892.0697063679737d + "'", double4 == 892.0697063679737d);
    }

    @Test
    public void test09835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09835");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1444.67637238831d, 1328.573669597486d, 254.3727246655306d, 304.71800128433364d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1648.1285937790735d + "'", double4 == 1648.1285937790735d);
    }

    @Test
    public void test09836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09836");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(3985.732700317162d, 1373.870355120675d, 1244.073074075367d, 161.15072637849005d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4705.754432770683d + "'", double4 == 4705.754432770683d);
    }

    @Test
    public void test09837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09837");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(402.20995176251364d, 472.0621371770095d, 1160.4847696235224d, 1086.2697910773807d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1372.48247176138d + "'", double4 == 1372.48247176138d);
    }

    @Test
    public void test09838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09838");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(2356.7011783433077d, 901.109490665229d, 402.81114714039353d, 1029.2375392323747d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2362.169758335706d + "'", double4 == 2362.169758335706d);
    }

    @Test
    public void test09839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09839");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(988.1839780629083d, 132.0d, 1768.5548460826597d, 965.6795954819602d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1614.0504635017114d + "'", double4 == 1614.0504635017114d);
    }

    @Test
    public void test09840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09840");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(261.28660281325404d, 618.1977688049909d, 5668.669492455361d, 1798.9019358950309d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 6588.087056732147d + "'", double4 == 6588.087056732147d);
    }

    @Test
    public void test09841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09841");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(2463.827628031723d, 640.5702084085508d, 3435.252021644794d, 275.0065142587339d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2394.7031591838168d + "'", double4 == 2394.7031591838168d);
    }

    @Test
    public void test09842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09842");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1749.895722575138d, 403.30415572758443d, 1075.2369309587705d, 441.3563857730341d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1472.222700906268d + "'", double4 == 1472.222700906268d);
    }

    @Test
    public void test09843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09843");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(2251.5976501766086d, 499.5278466274377d, 367.4257229620187d, 2183.9448788749164d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1885.3861007147425d + "'", double4 == 1885.3861007147425d);
    }

    @Test
    public void test09844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09844");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1360.5815187716676d, 949.028613105037d, 431.87538762457024d, 2337.1312742180976d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1347.6440564528498d + "'", double4 == 1347.6440564528498d);
    }

    @Test
    public void test09845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09845");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(468.85168542559705d, 1649.5050308100826d, 0.0d, 836.5370547217423d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 595.8308767770144d + "'", double4 == 595.8308767770144d);
    }

    @Test
    public void test09846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09846");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(249.78680803868008d, 7777.302188270409d, 675.735493822986d, 3678.065761179295d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3454.6387457255623d + "'", double4 == 3454.6387457255623d);
    }

    @Test
    public void test09847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09847");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(859.1165474429449d, 149.16705768146082d, 1865.292015015249d, 1330.2650862345124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2187.2734961253555d + "'", double4 == 2187.2734961253555d);
    }

    @Test
    public void test09848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09848");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1760.7435246446817d, 402.62125830545074d, 1126.5372153183375d, 340.4658790288715d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1555.444063097523d + "'", double4 == 1555.444063097523d);
    }

    @Test
    public void test09849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09849");
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
        int[] intArray90 = new int[] {};
        int int91 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray12, intArray90);
        java.lang.Class<?> wildcardClass92 = intArray12.getClass();
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
        org.junit.Assert.assertNotNull(intArray90);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray90), "[]");
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + (-1) + "'", int91 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass92);
    }

    @Test
    public void test09850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09850");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(455.57461664944447d, 1493.8850460277881d, 3290.3058749425722d, 2044.0969965035576d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3249.477597713441d + "'", double4 == 3249.477597713441d);
    }

    @Test
    public void test09851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09851");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(755.7877889674128d, 829.6926964153299d, 980.2263420235763d, 1757.265542160299d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1026.3188365406804d + "'", double4 == 1026.3188365406804d);
    }

    @Test
    public void test09852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09852");
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
        double[] doubleArray66 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray67 = new double[] {};
        double double69 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray66, doubleArray67, 0);
        double[] doubleArray74 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray75 = new double[] {};
        double double77 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray74, doubleArray75, 0);
        double double79 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray66, doubleArray75, (int) (short) 100);
        double[] doubleArray84 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray85 = new double[] {};
        double double87 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray84, doubleArray85, 0);
        double double89 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray66, doubleArray84, (int) (byte) 0);
        double double91 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray47, doubleArray84, (int) '#');
        double double93 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray21, doubleArray47, 0);
        double double95 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray5, doubleArray21, (int) '4');
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
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray67), "[]");
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + (-1.0d) + "'", double69 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray74), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray75), "[]");
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + (-1.0d) + "'", double77 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + (-1.0d) + "'", double79 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray84), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray85), "[]");
        org.junit.Assert.assertTrue("'" + double87 + "' != '" + (-1.0d) + "'", double87 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double89 + "' != '" + Double.POSITIVE_INFINITY + "'", double89 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double91 + "' != '" + (-1.0d) + "'", double91 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double93 + "' != '" + 0.0d + "'", double93 == 0.0d);
        org.junit.Assert.assertTrue("'" + double95 + "' != '" + 0.0d + "'", double95 == 0.0d);
    }

    @Test
    public void test09853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09853");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(952.4965584854033d, 1252.6596496298803d, 1162.646774620551d, 805.5077571070892d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 657.3021086579388d + "'", double4 == 657.3021086579388d);
    }

    @Test
    public void test09854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09854");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(179.25105674774412d, 773.0465405509034d, 145.74368975806703d, 2499.1808909212277d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2320.1717994861474d + "'", double4 == 2320.1717994861474d);
    }

    @Test
    public void test09855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09855");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1084.3417912339025d, 1742.1166285796144d, 777.2918910170832d, 3468.5601928962296d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2403.908697943501d + "'", double4 == 2403.908697943501d);
    }

    @Test
    public void test09856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09856");
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
        int[] intArray88 = new int[] { (byte) 10, (byte) 100, ' ', (short) -1, (short) 100 };
        int int89 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray81, intArray88);
        int int90 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray72, intArray88);
        int int91 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray66, intArray88);
        int[] intArray95 = new int[] { 100, 101, (byte) 1 };
        int int96 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray88, intArray95);
        java.lang.Class<?> wildcardClass97 = intArray88.getClass();
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
        org.junit.Assert.assertNotNull(intArray88);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray88), "[10, 100, 32, -1, 100]");
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + (-1) + "'", int89 == (-1));
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + (-1) + "'", int90 == (-1));
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + (-1) + "'", int91 == (-1));
        org.junit.Assert.assertNotNull(intArray95);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray95), "[100, 101, 1]");
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + (-1) + "'", int96 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass97);
    }

    @Test
    public void test09857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09857");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1444.67637238831d, 1001.9951237254555d, 800.2252089107835d, 737.3969134774696d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 956.8497975673866d + "'", double4 == 956.8497975673866d);
    }

    @Test
    public void test09858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09858");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1072.4424828297465d, 836.5370547217423d, 0.0d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1908.9795375514886d + "'", double4 == 1908.9795375514886d);
    }

    @Test
    public void test09859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09859");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1076.409245327592d, 66.35060455587607d, 982.7069551451049d, 6168.809540904334d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 6196.161226530946d + "'", double4 == 6196.161226530946d);
    }

    @Test
    public void test09860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09860");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1823.1159092192684d, 538.8680053645919d, 2592.1381319139196d, 487.2323783182032d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1541.4214177605418d + "'", double4 == 1541.4214177605418d);
    }

    @Test
    public void test09861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09861");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1034.8886911307932d, 376.8752080844716d, 314.71789781811526d, 1439.2726433320374d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 825.9372569018243d + "'", double4 == 825.9372569018243d);
    }

    @Test
    public void test09862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09862");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(416.5814657370902d, 651.4876990149558d, 1008.2500310819237d, 1477.776133344312d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1417.9569996741898d + "'", double4 == 1417.9569996741898d);
    }

    @Test
    public void test09863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09863");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(346.11599039795277d, 386.38223780084934d, 2344.286353927345d, 2685.2635686295375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3076.40962721707d + "'", double4 == 3076.40962721707d);
    }

    @Test
    public void test09864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09864");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(684.4096083478988d, 1877.911654526508d, 100.4987562112089d, 6474.065541033065d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 5180.0647386432465d + "'", double4 == 5180.0647386432465d);
    }

    @Test
    public void test09865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09865");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(916.6703084179811d, 847.7572040333628d, 722.7045671883419d, 2245.842641668486d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1592.0511788647625d + "'", double4 == 1592.0511788647625d);
    }

    @Test
    public void test09866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09866");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(2759.5773192487386d, 3495.9851218538834d, 630.4713680990789d, 518.4053939931825d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 5106.68567901036d + "'", double4 == 5106.68567901036d);
    }

    @Test
    public void test09867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09867");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(526.1493218657623d, 301.16345876515066d, 230.61154201185937d, 366.3917665186351d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 335.95394894459037d + "'", double4 == 335.95394894459037d);
    }

    @Test
    public void test09868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09868");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1117.4402236439857d, 2529.4425194615533d, 2781.8662427664926d, 459.52139206247597d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1789.7405292615952d + "'", double4 == 1789.7405292615952d);
    }

    @Test
    public void test09869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09869");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1922.3541155991197d, 2190.8647257132316d, 2201.457115108937d, 1034.085734167077d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 931.0849594893466d + "'", double4 == 931.0849594893466d);
    }

    @Test
    public void test09870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09870");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(185.51105438526488d, 2592.017907401038d, 1984.586977454828d, 1571.286965272015d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2819.806865198586d + "'", double4 == 2819.806865198586d);
    }

    @Test
    public void test09871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09871");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(2024.3131692747331d, 1756.3197263345141d, 442.7159299471211d, 354.643471884476d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2299.836238916153d + "'", double4 == 2299.836238916153d);
    }

    @Test
    public void test09872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09872");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1014.4900312682073d, 2086.6467286374295d, 946.5413807087698d, 486.76902224492216d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 532.0775154781518d + "'", double4 == 532.0775154781518d);
    }

    @Test
    public void test09873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09873");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1249.9544982176799d, 4226.676850001255d, 1172.8514538877012d, 233.0127717563659d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1019.8604583290149d + "'", double4 == 1019.8604583290149d);
    }

    @Test
    public void test09874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09874");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(452.3869766947d, 659.9563710239427d, 206.8986500189719d, 1382.5465551969342d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 968.0785108487196d + "'", double4 == 968.0785108487196d);
    }

    @Test
    public void test09875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09875");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1812.7654321100495d, 1683.0552245443828d, 715.5946028369693d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2780.226053817463d + "'", double4 == 2780.226053817463d);
    }

    @Test
    public void test09876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09876");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1684.9708706825222d, 6610.2361752984d, 644.9388058320856d, 200.01741434894532d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 7450.250825799891d + "'", double4 == 7450.250825799891d);
    }

    @Test
    public void test09877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09877");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1390.7350496506167d, 1149.3550069927487d, 0.0d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1966.7963688835218d + "'", double4 == 1966.7963688835218d);
    }

    @Test
    public void test09878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09878");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(416.7932251801975d, 344.5230047299769d, 686.9221490228654d, 1727.2992047128707d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1652.9051238255615d + "'", double4 == 1652.9051238255615d);
    }

    @Test
    public void test09879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09879");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(574.2681171623096d, 2089.2344035112183d, 2796.062527629182d, 696.2530148439882d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2225.1406062638484d + "'", double4 == 2225.1406062638484d);
    }

    @Test
    public void test09880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09880");
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
        java.lang.Class<?> wildcardClass86 = doubleArray79.getClass();
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
    public void test09881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09881");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(3921.9670325046727d, 999.2801365672916d, 3341.3100022464023d, 102.26030820844352d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1477.6768586171186d + "'", double4 == 1477.6768586171186d);
    }

    @Test
    public void test09882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09882");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1236.8269012839482d, 448.14231548840075d, 764.3060388881156d, 888.6023510466166d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 586.9721482211003d + "'", double4 == 586.9721482211003d);
    }

    @Test
    public void test09883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09883");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1450.338514611861d, 6335.015956493791d, 1633.5686689676313d, 1606.398208013519d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 240.68219163423564d + "'", double4 == 240.68219163423564d);
    }

    @Test
    public void test09884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09884");
        double[] doubleArray4 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray5 = new double[] {};
        double double7 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray4, doubleArray5, 0);
        double[] doubleArray12 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray13 = new double[] {};
        double double15 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray12, doubleArray13, 0);
        double double17 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray5, doubleArray13, (int) (byte) 1);
        double[] doubleArray20 = new double[] { 378.87782726636954d, 980.0815111745515d };
        double double22 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray13, doubleArray20, (int) (short) 0);
        double[] doubleArray24 = new double[] { (short) 0 };
        double[] doubleArray29 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray30 = new double[] {};
        double double32 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray29, doubleArray30, 0);
        double[] doubleArray37 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray38 = new double[] {};
        double double40 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray37, doubleArray38, 0);
        double double42 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray29, doubleArray38, (int) (short) 100);
        double double44 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray24, doubleArray29, 1);
        double double46 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray20, doubleArray24, (int) (byte) 100);
        java.lang.Class<?> wildcardClass47 = doubleArray24.getClass();
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
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[378.87782726636954, 980.0815111745515]");
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
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test09885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09885");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(2327.364724532621d, 74.91343462409199d, 442.2044982103387d, 1898.2295560361429d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3708.476347734333d + "'", double4 == 3708.476347734333d);
    }

    @Test
    public void test09886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09886");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(626.618317666575d, 0.0d, 1696.2964783565853d, 824.3617257768799d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1087.8022903580606d + "'", double4 == 1087.8022903580606d);
    }

    @Test
    public void test09887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09887");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(7506.099775629067d, 368.7233038561935d, 2252.047459551563d, 365.53882056997696d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 8865.25106767957d + "'", double4 == 8865.25106767957d);
    }

    @Test
    public void test09888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09888");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(424.83417895447803d, 313.4536530943542d, 1160.5764037316449d, 805.2996232304821d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 828.2937737350151d + "'", double4 == 828.2937737350151d);
    }

    @Test
    public void test09889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09889");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(11.0d, 2209.8848487640676d, 502.1608299106415d, 1487.3437662475014d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1555.9016283095689d + "'", double4 == 1555.9016283095689d);
    }

    @Test
    public void test09890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09890");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(784.2536075694591d, 877.0514440450277d, 980.9205102508095d, 2315.1572318891826d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1543.4842978033632d + "'", double4 == 1543.4842978033632d);
    }

    @Test
    public void test09891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09891");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(815.6650229146184d, 2160.1547802170135d, 33.05800855762949d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1130.3907149862232d + "'", double4 == 1130.3907149862232d);
    }

    @Test
    public void test09892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09892");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(2837.4269693379265d, 0.0d, 1667.2485373790196d, 2186.7092492692327d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3356.8876812281396d + "'", double4 == 3356.8876812281396d);
    }

    @Test
    public void test09893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09893");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(867.3480047272382d, 445.06277175155424d, 891.2294086694922d, 2083.302918111998d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1662.1215503026979d + "'", double4 == 1662.1215503026979d);
    }

    @Test
    public void test09894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09894");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(419.56491396050245d, 272.0850365622572d, 2403.227680037803d, 569.3645719860358d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2280.9423015010793d + "'", double4 == 2280.9423015010793d);
    }

    @Test
    public void test09895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09895");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(639.9793613446573d, 2740.8677807783633d, 405.50286977861737d, 259.31005301878207d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 447.088746669405d + "'", double4 == 447.088746669405d);
    }

    @Test
    public void test09896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09896");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1920.5798166518177d, 757.843947277966d, 1032.5739367472079d, 1400.1192946746407d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1530.2812273012846d + "'", double4 == 1530.2812273012846d);
    }

    @Test
    public void test09897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09897");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(367.59157912831455d, 3304.900423968571d, 893.8479187647513d, 1819.0504172286073d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1543.9166084044152d + "'", double4 == 1543.9166084044152d);
    }

    @Test
    public void test09898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09898");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(50.91168824543142d, 3239.6579352585422d, 486.76902224492216d, 854.0221443788273d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 913.760373594705d + "'", double4 == 913.760373594705d);
    }

    @Test
    public void test09899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09899");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(901.109490665229d, 120.09017554298981d, 820.012635783017d, 295.4253067481773d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 256.43198608739954d + "'", double4 == 256.43198608739954d);
    }

    @Test
    public void test09900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09900");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(378.1620143574939d, 320.56011654358406d, 3341.207645898974d, 1110.874708700701d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3753.360223698597d + "'", double4 == 3753.360223698597d);
    }

    @Test
    public void test09901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09901");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(616.2021552226354d, 2887.9666438328823d, 1179.212354252639d, 349.57519522850913d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 622.9529837857057d + "'", double4 == 622.9529837857057d);
    }

    @Test
    public void test09902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09902");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(277.1877858489132d, 0.0d, 854.0411423288443d, 1156.5803593463743d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1051.7086541455528d + "'", double4 == 1051.7086541455528d);
    }

    @Test
    public void test09903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09903");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1199.0360244609533d, 480.053811204915d, 621.8669731042609d, 514.4583823621946d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 611.5736225139719d + "'", double4 == 611.5736225139719d);
    }

    @Test
    public void test09904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09904");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(0.0d, 824.6810786617991d, 1531.2054743932156d, 1491.9438204028356d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2137.8696330810167d + "'", double4 == 2137.8696330810167d);
    }

    @Test
    public void test09905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09905");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(189.30980045465006d, 0.0d, 1663.0858002096568d, 2590.9487936340206d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4064.7247933890276d + "'", double4 == 4064.7247933890276d);
    }

    @Test
    public void test09906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09906");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(680.7592365609005d, 442.7159299471211d, 1942.0649060649096d, 972.8176660596337d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1791.4074056165216d + "'", double4 == 1791.4074056165216d);
    }

    @Test
    public void test09907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09907");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(517.693927402488d, 451.72086971443827d, 460.2476947640703d, 439.40340754804583d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 97.10548462072585d + "'", double4 == 97.10548462072585d);
    }

    @Test
    public void test09908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09908");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(881.4195366634596d, 2886.6827490463547d, 1675.3825719284541d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3680.6457843113494d + "'", double4 == 3680.6457843113494d);
    }

    @Test
    public void test09909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09909");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1104.89549802623d, 2029.909539745049d, 813.1299394980268d, 317.3291730729698d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2004.3459252002822d + "'", double4 == 2004.3459252002822d);
    }

    @Test
    public void test09910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09910");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(4771.91037076049d, 912.3200508707025d, 474.72340590982594d, 877.0514440450277d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4332.455571676339d + "'", double4 == 4332.455571676339d);
    }

    @Test
    public void test09911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09911");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(0.0d, 0.0d, 2808.906456819314d, 3548.6208428463447d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4525.777874514472d + "'", double4 == 4525.777874514472d);
    }

    @Test
    public void test09912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09912");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(859.5558935938309d, 392.727266891686d, 3592.397480517376d, 718.8178596048987d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2736.463106535491d + "'", double4 == 2736.463106535491d);
    }

    @Test
    public void test09913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09913");
        int[] intArray0 = null;
        int[] intArray7 = new int[] { '#', (byte) 0, 69, (short) 10, (-1), '4' };
        // The following exception was thrown during execution in test generation
        try {
            int int8 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray0, intArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[35, 0, 69, 10, -1, 52]");
    }

    @Test
    public void test09914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09914");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(660.8737855706839d, 734.6200455232125d, 1008.9473944400337d, 196.14794634057392d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 886.5457080519884d + "'", double4 == 886.5457080519884d);
    }

    @Test
    public void test09915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09915");
        double[] doubleArray4 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray5 = new double[] {};
        double double7 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray4, doubleArray5, 0);
        double[] doubleArray12 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray13 = new double[] {};
        double double15 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray12, doubleArray13, 0);
        double[] doubleArray20 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray21 = new double[] {};
        double double23 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray20, doubleArray21, 0);
        double[] doubleArray28 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray29 = new double[] {};
        double double31 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray28, doubleArray29, 0);
        double double33 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray20, doubleArray29, 1);
        double double35 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray13, doubleArray29, (int) (short) 10);
        double[] doubleArray40 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray41 = new double[] {};
        double double43 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray40, doubleArray41, 0);
        double[] doubleArray48 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray49 = new double[] {};
        double double51 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray48, doubleArray49, 0);
        double double53 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray40, doubleArray49, 1);
        double double55 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray29, doubleArray40, (int) '#');
        double[] doubleArray60 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray61 = new double[] {};
        double double63 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray60, doubleArray61, 0);
        double double65 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray29, doubleArray61, 1);
        double double67 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray4, doubleArray29, (int) (short) 0);
        double[] doubleArray72 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray73 = new double[] {};
        double double75 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray72, doubleArray73, 0);
        double[] doubleArray80 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray81 = new double[] {};
        double double83 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray80, doubleArray81, 0);
        double double85 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray72, doubleArray81, (int) (short) 100);
        double[] doubleArray90 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray91 = new double[] {};
        double double93 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray90, doubleArray91, 0);
        double double95 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray72, doubleArray90, (int) (byte) 0);
        double double97 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray29, doubleArray72, 26);
        java.lang.Class<?> wildcardClass98 = doubleArray29.getClass();
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
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[]");
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + (-1.0d) + "'", double31 == (-1.0d));
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
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + (-1.0d) + "'", double53 == (-1.0d));
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
        org.junit.Assert.assertNotNull(doubleArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray80), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray81), "[]");
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + (-1.0d) + "'", double83 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double85 + "' != '" + (-1.0d) + "'", double85 == (-1.0d));
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
    public void test09916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09916");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(461.9372712428467d, 1501.0475113099421d, 669.205282796098d, 1121.8136037846682d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 691.6623474370159d + "'", double4 == 691.6623474370159d);
    }

    @Test
    public void test09917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09917");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1612.0337295295085d, 1756.3197263345141d, 1452.2325537115544d, 2808.5605925484447d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1212.0420420318846d + "'", double4 == 1212.0420420318846d);
    }

    @Test
    public void test09918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09918");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(416.70416071191465d, 224.75210127375607d, 1001.8257413707506d, 2450.5894258339763d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2810.958905219056d + "'", double4 == 2810.958905219056d);
    }

    @Test
    public void test09919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09919");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(634.2295453448422d, 933.3689927125812d, 3139.170941281121d, 2960.1734314800215d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4531.745834703719d + "'", double4 == 4531.745834703719d);
    }

    @Test
    public void test09920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09920");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(394.7553821156331d, 1093.2369568734316d, 445.5565709724445d, 852.4982074660716d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 460.5532053401294d + "'", double4 == 460.5532053401294d);
    }

    @Test
    public void test09921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09921");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(512.1052156916826d, 1844.8504809071742d, 2366.6055996441623d, 1543.300208463103d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2121.9177145206986d + "'", double4 == 2121.9177145206986d);
    }

    @Test
    public void test09922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09922");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(132.92680248554626d, 1796.0202882368983d, 697.822439734797d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 580.3245779753504d + "'", double4 == 580.3245779753504d);
    }

    @Test
    public void test09923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09923");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1097.947025087836d, 124.87818547522426d, 1015.4946738808226d, 1121.997693638811d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 85.88844437590856d + "'", double4 == 85.88844437590856d);
    }

    @Test
    public void test09924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09924");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(0.0d, 3502.6530561004865d, 1555.206631700226d, 1024.0280124554229d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4033.8316753452896d + "'", double4 == 4033.8316753452896d);
    }

    @Test
    public void test09925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09925");
        double[] doubleArray4 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray5 = new double[] {};
        double double7 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray4, doubleArray5, 0);
        double[] doubleArray12 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray13 = new double[] {};
        double double15 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray12, doubleArray13, 0);
        double[] doubleArray20 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray21 = new double[] {};
        double double23 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray20, doubleArray21, 0);
        double[] doubleArray28 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray29 = new double[] {};
        double double31 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray28, doubleArray29, 0);
        double double33 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray20, doubleArray29, 1);
        double double35 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray13, doubleArray29, (int) (short) 10);
        double[] doubleArray42 = new double[] { 221.38186019448963d, 364.34654754189563d, 1789.0559517170952d, 896.632439101549d, 5328.628649866165d, 2634.3844687894953d };
        double double44 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray29, doubleArray42, 137);
        double[] doubleArray49 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray50 = new double[] {};
        double double52 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray49, doubleArray50, 0);
        double[] doubleArray57 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray58 = new double[] {};
        double double60 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray57, doubleArray58, 0);
        double double62 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray49, doubleArray58, (int) (short) 100);
        double[] doubleArray67 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray68 = new double[] {};
        double double70 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray67, doubleArray68, 0);
        double[] doubleArray75 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray76 = new double[] {};
        double double78 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray75, doubleArray76, 0);
        double double80 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray68, doubleArray76, (int) (byte) 1);
        double double82 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray58, doubleArray76, 0);
        double double84 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray29, doubleArray58, 26);
        double double86 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray5, doubleArray29, (int) (byte) 100);
        double[] doubleArray87 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double89 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray5, doubleArray87, 157);
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
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[]");
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + (-1.0d) + "'", double31 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + (-1.0d) + "'", double33 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[221.38186019448963, 364.34654754189563, 1789.0559517170952, 896.632439101549, 5328.628649866165, 2634.3844687894953]");
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + (-1.0d) + "'", double44 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[]");
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + (-1.0d) + "'", double52 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[]");
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + (-1.0d) + "'", double60 == (-1.0d));
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
        org.junit.Assert.assertTrue("'" + double80 + "' != '" + 0.0d + "'", double80 == 0.0d);
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + 0.0d + "'", double82 == 0.0d);
        org.junit.Assert.assertTrue("'" + double84 + "' != '" + 0.0d + "'", double84 == 0.0d);
        org.junit.Assert.assertTrue("'" + double86 + "' != '" + 0.0d + "'", double86 == 0.0d);
    }

    @Test
    public void test09926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09926");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1857.1187566683159d, 629.5444608483646d, 778.592634466658d, 587.9528783836956d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1665.533134726931d + "'", double4 == 1665.533134726931d);
    }

    @Test
    public void test09927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09927");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(74.91343462409199d, 282.1994595477188d, 3583.5966182809866d, 279.4673697256193d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3511.415273478994d + "'", double4 == 3511.415273478994d);
    }

    @Test
    public void test09928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09928");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(115.82660080517897d, 1069.0226291276806d, 2036.3891841829804d, 492.30976810098156d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2497.2754444045004d + "'", double4 == 2497.2754444045004d);
    }

    @Test
    public void test09929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09929");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1032.1941981485315d, 1104.89549802623d, 671.0406791709299d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1093.5523430368546d + "'", double4 == 1093.5523430368546d);
    }

    @Test
    public void test09930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09930");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1977.9662478912073d, 605.205537045175d, 501.9676185738713d, 1011.1285481306548d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1764.4679343714158d + "'", double4 == 1764.4679343714158d);
    }

    @Test
    public void test09931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09931");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(0.0d, 0.0d, 2291.210025389064d, 761.2930315979277d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2414.3757910488825d + "'", double4 == 2414.3757910488825d);
    }

    @Test
    public void test09932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09932");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(424.11412232418536d, 150.00535004535024d, 608.7160566860049d, 1034.27708889396d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 637.4768387505176d + "'", double4 == 637.4768387505176d);
    }

    @Test
    public void test09933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09933");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1239.452605656115d, 480.482912991947d, 198.44088030501894d, 893.8359782316663d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1096.8848004556887d + "'", double4 == 1096.8848004556887d);
    }

    @Test
    public void test09934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09934");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(202.19892660646443d, 1742.1166285796144d, 0.0d, 506.65920558892253d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1437.6563495971563d + "'", double4 == 1437.6563495971563d);
    }

    @Test
    public void test09935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09935");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(4254.113345619445d, 3376.621984067274d, 582.3482949245309d, 1113.295503583767d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4831.831464812724d + "'", double4 == 4831.831464812724d);
    }

    @Test
    public void test09936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09936");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(5404.6205003274035d, 780.5582598343776d, 2390.39501278206d, 1370.1179099823203d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 5036.14599086138d + "'", double4 == 5036.14599086138d);
    }

    @Test
    public void test09937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09937");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1193.0998956704975d, 3101.133680055732d, 1150.984497221135d, 645.257936902434d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2497.9911416026603d + "'", double4 == 2497.9911416026603d);
    }

    @Test
    public void test09938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09938");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(927.2289296844456d, 1267.8911481761006d, 2201.457115108937d, 1246.4301124752037d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1313.6007245830872d + "'", double4 == 1313.6007245830872d);
    }

    @Test
    public void test09939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09939");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1280.4340264025495d, 286.3414624115187d, 1659.2942105484537d, 2950.749936189434d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3043.268657923819d + "'", double4 == 3043.268657923819d);
    }

    @Test
    public void test09940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09940");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1504.4920615370022d, 1264.5775932182678d, 1812.197885956591d, 1138.736416197663d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 433.54700144019375d + "'", double4 == 433.54700144019375d);
    }

    @Test
    public void test09941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09941");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(992.4778093750206d, 3915.1517771507047d, 274.73878064534733d, 258.891505624066d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4373.9993002563115d + "'", double4 == 4373.9993002563115d);
    }

    @Test
    public void test09942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09942");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(740.686937793616d, 665.4510980134135d, 1659.2942105484537d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1584.0583707682513d + "'", double4 == 1584.0583707682513d);
    }

    @Test
    public void test09943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09943");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1437.8379911956886d, 3292.5697927326005d, 430.60693402097104d, 1326.9667428059956d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2972.8341071013224d + "'", double4 == 2972.8341071013224d);
    }

    @Test
    public void test09944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09944");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(2115.5592879638466d, 35.14926523736091d, 1383.9518231925686d, 1091.9285723854555d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1258.2008283197822d + "'", double4 == 1258.2008283197822d);
    }

    @Test
    public void test09945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09945");
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
        // The following exception was thrown during execution in test generation
        try {
            double double60 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray0, doubleArray14, (int) (short) 0);
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
    }

    @Test
    public void test09946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09946");
        int[] intArray3 = new int[] { 1, 1, 100 };
        int[] intArray5 = new int[] { (byte) -1 };
        int int6 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray3, intArray5);
        int[] intArray9 = new int[] { 'a', 10 };
        int int10 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray5, intArray9);
        int[] intArray14 = new int[] { 1, 1, 100 };
        int[] intArray16 = new int[] { (byte) -1 };
        int int17 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray14, intArray16);
        int[] intArray20 = new int[] { 'a', 10 };
        int int21 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray16, intArray20);
        int[] intArray25 = new int[] { 1, 1, 100 };
        int[] intArray27 = new int[] { (byte) -1 };
        int int28 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray25, intArray27);
        int[] intArray32 = new int[] { 1, 1, 100 };
        int[] intArray34 = new int[] { (byte) -1 };
        int int35 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray32, intArray34);
        int[] intArray38 = new int[] { 'a', 10 };
        int int39 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray34, intArray38);
        int int40 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray25, intArray38);
        int int41 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray16, intArray25);
        int[] intArray45 = new int[] { 1, 1, 100 };
        int[] intArray47 = new int[] { (byte) -1 };
        int int48 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray45, intArray47);
        int[] intArray51 = new int[] { 'a', 10 };
        int int52 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray47, intArray51);
        int[] intArray56 = new int[] { (byte) 1, (short) 1, (short) -1 };
        int int57 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray47, intArray56);
        int int58 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray16, intArray47);
        int[] intArray62 = new int[] { 1, 1, 100 };
        int[] intArray64 = new int[] { (byte) -1 };
        int int65 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray62, intArray64);
        int int66 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray47, intArray62);
        int int67 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray5, intArray47);
        int[] intArray71 = new int[] { 1, 1, 100 };
        int[] intArray73 = new int[] { (byte) -1 };
        int int74 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray71, intArray73);
        int[] intArray77 = new int[] { 'a', 10 };
        int int78 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray73, intArray77);
        int int79 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray5, intArray77);
        java.lang.Class<?> wildcardClass80 = intArray77.getClass();
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
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[-1]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[-1]");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray45), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[-1]");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray51), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray56), "[1, 1, -1]");
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(intArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray62), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray64), "[-1]");
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertNotNull(intArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray71), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray73), "[-1]");
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
        org.junit.Assert.assertNotNull(intArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray77), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + (-1) + "'", int79 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass80);
    }

    @Test
    public void test09947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09947");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(311.7386263554344d, 347.84876928626426d, 513.0962710588753d, 957.5562404372337d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 676.4800749015635d + "'", double4 == 676.4800749015635d);
    }

    @Test
    public void test09948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09948");
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
        int[] intArray43 = new int[] { 'a', 10 };
        int int44 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray39, intArray43);
        int[] intArray48 = new int[] { 1, 1, 100 };
        int[] intArray50 = new int[] { (byte) -1 };
        int int51 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray48, intArray50);
        int[] intArray55 = new int[] { 1, 1, 100 };
        int[] intArray57 = new int[] { (byte) -1 };
        int int58 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray55, intArray57);
        int[] intArray61 = new int[] { 'a', 10 };
        int int62 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray57, intArray61);
        int int63 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray48, intArray61);
        int int64 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray39, intArray61);
        int[] intArray68 = new int[] { 1, 1, 100 };
        int[] intArray70 = new int[] { (byte) -1 };
        int int71 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray68, intArray70);
        int[] intArray74 = new int[] { 'a', 10 };
        int int75 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray70, intArray74);
        int[] intArray79 = new int[] { (byte) 1, (short) 1, (short) -1 };
        int int80 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray70, intArray79);
        int[] intArray84 = new int[] { (byte) -1, '#', (-1) };
        int int85 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray70, intArray84);
        int int86 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray61, intArray84);
        int int87 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray5, intArray84);
        java.lang.Class<?> wildcardClass88 = intArray84.getClass();
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
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray43), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
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
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + (-1) + "'", int87 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass88);
    }

    @Test
    public void test09949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09949");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(2189.8654793620262d, 0.0d, 1049.5561037251455d, 904.1388326818795d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1718.5454553629786d + "'", double4 == 1718.5454553629786d);
    }

    @Test
    public void test09950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09950");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(0.0d, 127.97315542808013d, 460.51094068065646d, 2862.266741294654d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2899.0759260164436d + "'", double4 == 2899.0759260164436d);
    }

    @Test
    public void test09951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09951");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(365.6064430735291d, 638.3254550618983d, 3680.6457843113494d, 1900.6258888042903d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4577.3397749802125d + "'", double4 == 4577.3397749802125d);
    }

    @Test
    public void test09952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09952");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(2267.7839988772057d, 596.178779154028d, 916.7412550310105d, 7284.909850341347d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 5195.851066488457d + "'", double4 == 5195.851066488457d);
    }

    @Test
    public void test09953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09953");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(520.4111800001816d, 779.839183901642d, 1472.222700906268d, 491.38497704246265d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 952.2540059184315d + "'", double4 == 952.2540059184315d);
    }

    @Test
    public void test09954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09954");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(0.0d, 2504.7729159184555d, 465.7651970635461d, 542.2127480560036d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2428.3253649259977d + "'", double4 == 2428.3253649259977d);
    }

    @Test
    public void test09955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09955");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(235.11229898487548d, 1091.5239530409972d, 818.3954986588162d, 1098.3417464932243d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 590.1009931261679d + "'", double4 == 590.1009931261679d);
    }

    @Test
    public void test09956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09956");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(96.71378137032355d, 858.9004145722498d, 450.8884448121965d, 1937.6771195947044d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1874.7228341572043d + "'", double4 == 1874.7228341572043d);
    }

    @Test
    public void test09957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09957");
        int[] intArray0 = null;
        int[] intArray4 = new int[] { 1, 1, 100 };
        int[] intArray6 = new int[] { (byte) -1 };
        int int7 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray4, intArray6);
        int[] intArray11 = new int[] { 1, 1, 100 };
        int[] intArray13 = new int[] { (byte) -1 };
        int int14 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray11, intArray13);
        int int15 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray4, intArray13);
        int[] intArray19 = new int[] { 1, 1, 100 };
        int[] intArray21 = new int[] { (byte) -1 };
        int int22 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray19, intArray21);
        int int23 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray13, intArray19);
        int[] intArray27 = new int[] { 1, 1, 100 };
        int[] intArray29 = new int[] { (byte) -1 };
        int int30 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray27, intArray29);
        int int31 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray13, intArray29);
        int[] intArray35 = new int[] { 1, 1, 100 };
        int[] intArray37 = new int[] { (byte) -1 };
        int int38 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray35, intArray37);
        int[] intArray44 = new int[] { (byte) 10, (byte) 100, ' ', (short) -1, (short) 100 };
        int int45 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray37, intArray44);
        int[] intArray49 = new int[] { 1, 1, 100 };
        int[] intArray51 = new int[] { (byte) -1 };
        int int52 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray49, intArray51);
        int[] intArray56 = new int[] { 1, 1, 100 };
        int[] intArray58 = new int[] { (byte) -1 };
        int int59 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray56, intArray58);
        int[] intArray62 = new int[] { 'a', 10 };
        int int63 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray58, intArray62);
        int int64 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray49, intArray62);
        int int65 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray37, intArray62);
        int[] intArray69 = new int[] { 1, 1, 100 };
        int[] intArray71 = new int[] { (byte) -1 };
        int int72 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray69, intArray71);
        int[] intArray75 = new int[] { 'a', 10 };
        int int76 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray71, intArray75);
        int int77 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray37, intArray71);
        int[] intArray81 = new int[] { 1, 1, 100 };
        int[] intArray83 = new int[] { (byte) -1 };
        int int84 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray81, intArray83);
        int[] intArray87 = new int[] { 'a', 10 };
        int int88 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray83, intArray87);
        int[] intArray92 = new int[] { (byte) 1, (short) 1, (short) -1 };
        int int93 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray83, intArray92);
        int int94 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray37, intArray83);
        int int95 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray13, intArray83);
        // The following exception was thrown during execution in test generation
        try {
            int int96 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray0, intArray83);
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[-1]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[-1]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[-1]");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[10, 100, 32, -1, 100]");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
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
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertNotNull(intArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray69), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray71), "[-1]");
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-1) + "'", int72 == (-1));
        org.junit.Assert.assertNotNull(intArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray75), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-1) + "'", int76 == (-1));
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertNotNull(intArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray81), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray83), "[-1]");
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + (-1) + "'", int84 == (-1));
        org.junit.Assert.assertNotNull(intArray87);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray87), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + (-1) + "'", int88 == (-1));
        org.junit.Assert.assertNotNull(intArray92);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray92), "[1, 1, -1]");
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + (-1) + "'", int93 == (-1));
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 0 + "'", int94 == 0);
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + 0 + "'", int95 == 0);
    }

    @Test
    public void test09958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09958");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(162.23484796428474d, 876.0631684671114d, 4226.676850001255d, 807.7307936235277d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4132.774376880554d + "'", double4 == 4132.774376880554d);
    }

    @Test
    public void test09959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09959");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(2800.047902676809d, 607.089723914349d, 502.68387230973843d, 432.74512740028047d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2471.708626881139d + "'", double4 == 2471.708626881139d);
    }

    @Test
    public void test09960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09960");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(3109.480513383831d, 0.0d, 1814.0416132949465d, 1240.073827582351d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2535.5127276712356d + "'", double4 == 2535.5127276712356d);
    }

    @Test
    public void test09961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09961");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(2326.2899495091287d, 0.0d, 3088.9069816375018d, 3887.183830775793d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4649.800862904166d + "'", double4 == 4649.800862904166d);
    }

    @Test
    public void test09962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09962");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1689.921502333886d, 480.56201986901675d, 1831.706730366616d, 1117.7649391526268d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 778.98814731634d + "'", double4 == 778.98814731634d);
    }

    @Test
    public void test09963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09963");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(4449.183365523987d, 335.49898510954745d, 628.5158066587022d, 542.3714532029553d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 5464.4926492419345d + "'", double4 == 5464.4926492419345d);
    }

    @Test
    public void test09964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09964");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(0.0d, 413.3411785297121d, 1073.999438850761d, 1231.5899008843833d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1634.101734474373d + "'", double4 == 1634.101734474373d);
    }

    @Test
    public void test09965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09965");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(551.7540975753784d, 1092.0415074166947d, 1595.4753932860335d, 1195.2564878334267d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1146.9362761273871d + "'", double4 == 1146.9362761273871d);
    }

    @Test
    public void test09966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09966");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(0.0d, 1697.2068556798629d, 1593.7210318732734d, 1699.7780203531145d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2330.062669953485d + "'", double4 == 2330.062669953485d);
    }

    @Test
    public void test09967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09967");
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
        double[] doubleArray31 = new double[] { 232.4213562373095d, (short) 0, 1.0f, 75.85073476263909d, (-1L) };
        double double33 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray23, doubleArray31, (int) (byte) -1);
        double[] doubleArray38 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray39 = new double[] {};
        double double41 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray38, doubleArray39, 0);
        double[] doubleArray46 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray47 = new double[] {};
        double double49 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray46, doubleArray47, 0);
        double[] doubleArray54 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray55 = new double[] {};
        double double57 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray54, doubleArray55, 0);
        double double59 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray46, doubleArray55, (int) (short) 100);
        double[] doubleArray64 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray65 = new double[] {};
        double double67 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray64, doubleArray65, 0);
        double double69 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray55, doubleArray64, (int) (short) 100);
        double double71 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray39, doubleArray55, (int) '4');
        double double73 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray23, doubleArray55, 10);
        double double75 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray13, doubleArray55, 72);
        double[] doubleArray80 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray81 = new double[] {};
        double double83 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray80, doubleArray81, 0);
        double[] doubleArray88 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray89 = new double[] {};
        double double91 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray88, doubleArray89, 0);
        double double93 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray80, doubleArray89, 1);
        double double95 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray13, doubleArray89, (int) (byte) 1);
        java.lang.Class<?> wildcardClass96 = doubleArray89.getClass();
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
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[232.4213562373095, 0.0, 1.0, 75.85073476263909, -1.0]");
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
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[]");
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + (-1.0d) + "'", double57 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + (-1.0d) + "'", double59 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray65), "[]");
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + (-1.0d) + "'", double67 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + (-1.0d) + "'", double69 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 0.0d + "'", double71 == 0.0d);
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + 0.0d + "'", double73 == 0.0d);
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
        org.junit.Assert.assertTrue("'" + double93 + "' != '" + (-1.0d) + "'", double93 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double95 + "' != '" + 0.0d + "'", double95 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass96);
    }

    @Test
    public void test09968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09968");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(459.0392575681089d, 438.97829378179034d, 601.720563037279d, 2129.1261894350837d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1676.1707296463662d + "'", double4 == 1676.1707296463662d);
    }

    @Test
    public void test09969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09969");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1081.1487055736848d, 1285.3436588924824d, 2026.971687400784d, 566.8081289066193d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1076.6277637877051d + "'", double4 == 1076.6277637877051d);
    }

    @Test
    public void test09970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09970");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(156.0d, 3050.9068149618993d, 0.0d, 1548.7969780437572d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1658.109836918142d + "'", double4 == 1658.109836918142d);
    }

    @Test
    public void test09971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09971");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(514.6194464564113d, 6240.567940672727d, 1487.147570023235d, 210.43152753590826d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1018.9903047358172d + "'", double4 == 1018.9903047358172d);
    }

    @Test
    public void test09972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09972");
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
        double double47 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray4, doubleArray43, (int) (byte) -1);
        double[] doubleArray48 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double50 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray43, doubleArray48, 26);
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
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + (-1.0d) + "'", double37 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[]");
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + (-1.0d) + "'", double45 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + (-1.0d) + "'", double47 == (-1.0d));
    }

    @Test
    public void test09973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09973");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(649.5369668695829d, 440.72246835410544d, 2199.033873292094d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1990.2193747766164d + "'", double4 == 1990.2193747766164d);
    }

    @Test
    public void test09974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09974");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(2772.6861160494195d, 277.1976496143225d, 918.071395620256d, 2367.473692502469d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3944.8907633173103d + "'", double4 == 3944.8907633173103d);
    }

    @Test
    public void test09975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09975");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(814.5476314720477d, 3504.8879078968394d, 1573.2338479784191d, 696.2530148439882d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3567.3211095592224d + "'", double4 == 3567.3211095592224d);
    }

    @Test
    public void test09976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09976");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(776.4995539649813d, 515.4393014336005d, 1715.9504518257918d, 1153.1214008848594d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1012.132404909962d + "'", double4 == 1012.132404909962d);
    }

    @Test
    public void test09977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09977");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1438.5826492427104d, 3284.682154639102d, 1760.1217906457014d, 1296.6623818195048d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 351.4666154269091d + "'", double4 == 351.4666154269091d);
    }

    @Test
    public void test09978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09978");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(4800.555200148045d, 257.15421187030165d, 1210.3002233662005d, 1847.6861437700247d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4648.587577148743d + "'", double4 == 4648.587577148743d);
    }

    @Test
    public void test09979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09979");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(4950.844568691614d, 1829.4924058745787d, 2319.802136420398d, 980.0815111745515d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4763.3332383273255d + "'", double4 == 4763.3332383273255d);
    }

    @Test
    public void test09980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09980");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(2829.886369495668d, 1554.196893337843d, 311.714830208365d, 2267.38503150545d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2580.23170597475d + "'", double4 == 2580.23170597475d);
    }

    @Test
    public void test09981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09981");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1505.8401580014133d, 1354.0831794041292d, 1661.4712989827988d, 784.0699268707897d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 738.3585298413784d + "'", double4 == 738.3585298413784d);
    }

    @Test
    public void test09982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09982");
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
        double double65 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray52, doubleArray61, (int) (short) 100);
        double[] doubleArray70 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray71 = new double[] {};
        double double73 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray70, doubleArray71, 0);
        double double75 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray52, doubleArray70, (int) (byte) 0);
        double double77 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray13, doubleArray70, 0);
        double[] doubleArray82 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray83 = new double[] {};
        double double85 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray82, doubleArray83, 0);
        double[] doubleArray90 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray91 = new double[] {};
        double double93 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray90, doubleArray91, 0);
        double double95 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray82, doubleArray91, (int) (short) 100);
        double double97 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray13, doubleArray82, (int) ' ');
        java.lang.Class<?> wildcardClass98 = doubleArray82.getClass();
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
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + (-1.0d) + "'", double65 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray70), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray71), "[]");
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + (-1.0d) + "'", double73 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + Double.POSITIVE_INFINITY + "'", double75 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + (-1.0d) + "'", double77 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray82), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray83), "[]");
        org.junit.Assert.assertTrue("'" + double85 + "' != '" + (-1.0d) + "'", double85 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray90);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray90), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray91);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray91), "[]");
        org.junit.Assert.assertTrue("'" + double93 + "' != '" + (-1.0d) + "'", double93 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double95 + "' != '" + (-1.0d) + "'", double95 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double97 + "' != '" + (-1.0d) + "'", double97 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass98);
    }

    @Test
    public void test09983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09983");
        double[] doubleArray0 = null;
        double[] doubleArray5 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray6 = new double[] {};
        double double8 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray5, doubleArray6, 0);
        double[] doubleArray14 = new double[] { 232.4213562373095d, (short) 0, 1.0f, 75.85073476263909d, (-1L) };
        double double16 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray6, doubleArray14, (int) (byte) -1);
        double[] doubleArray21 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray22 = new double[] {};
        double double24 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray21, doubleArray22, 0);
        double[] doubleArray29 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray30 = new double[] {};
        double double32 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray29, doubleArray30, 0);
        double[] doubleArray37 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray38 = new double[] {};
        double double40 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray37, doubleArray38, 0);
        double double42 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray29, doubleArray38, (int) (short) 100);
        double[] doubleArray47 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray48 = new double[] {};
        double double50 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray47, doubleArray48, 0);
        double double52 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray38, doubleArray47, (int) (short) 100);
        double double54 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray22, doubleArray38, (int) '4');
        double double56 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray6, doubleArray38, 10);
        double[] doubleArray61 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray62 = new double[] {};
        double double64 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray61, doubleArray62, 0);
        double[] doubleArray69 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray70 = new double[] {};
        double double72 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray69, doubleArray70, 0);
        double double74 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray61, doubleArray70, 1);
        double double76 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray38, doubleArray70, 1);
        // The following exception was thrown during execution in test generation
        try {
            double double78 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray0, doubleArray38, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[]");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[232.4213562373095, 0.0, 1.0, 75.85073476263909, -1.0]");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[]");
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
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + (-1.0d) + "'", double42 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[]");
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + (-1.0d) + "'", double50 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + (-1.0d) + "'", double52 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 0.0d + "'", double54 == 0.0d);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 0.0d + "'", double56 == 0.0d);
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
    }

    @Test
    public void test09984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09984");
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
        double[] doubleArray48 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray49 = new double[] {};
        double double51 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray48, doubleArray49, 0);
        double double53 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray40, doubleArray49, 1);
        double double55 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray33, doubleArray40, (int) ' ');
        double[] doubleArray60 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray61 = new double[] {};
        double double63 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray60, doubleArray61, 0);
        double[] doubleArray68 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray69 = new double[] {};
        double double71 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray68, doubleArray69, 0);
        double double73 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray60, doubleArray69, (int) (short) 100);
        double[] doubleArray76 = new double[] { (byte) 0, 132.0d };
        double double78 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray69, doubleArray76, (int) '4');
        double double80 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray33, doubleArray69, (int) (byte) -1);
        double double82 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray21, doubleArray33, 26);
        java.lang.Class<?> wildcardClass83 = doubleArray33.getClass();
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
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[]");
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + (-1.0d) + "'", double51 == (-1.0d));
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
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + (-1.0d) + "'", double73 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray76), "[0.0, 132.0]");
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + (-1.0d) + "'", double78 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double80 + "' != '" + Double.POSITIVE_INFINITY + "'", double80 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + 0.0d + "'", double82 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass83);
    }

    @Test
    public void test09985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09985");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1521.9542794837575d, 347.6332631604373d, 722.8002263242752d, 1990.347183294131d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2441.867973293176d + "'", double4 == 2441.867973293176d);
    }

    @Test
    public void test09986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09986");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(727.6556876010794d, 283.3834624095232d, 4922.123454010138d, 1168.4443862978762d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4217.564998947071d + "'", double4 == 4217.564998947071d);
    }

    @Test
    public void test09987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09987");
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
        double[] doubleArray31 = new double[] { 232.4213562373095d, (short) 0, 1.0f, 75.85073476263909d, (-1L) };
        double double33 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray23, doubleArray31, (int) (byte) -1);
        double[] doubleArray38 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray39 = new double[] {};
        double double41 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray38, doubleArray39, 0);
        double[] doubleArray46 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray47 = new double[] {};
        double double49 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray46, doubleArray47, 0);
        double[] doubleArray54 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray55 = new double[] {};
        double double57 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray54, doubleArray55, 0);
        double double59 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray46, doubleArray55, 1);
        double double61 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray39, doubleArray55, (int) (short) 10);
        double[] doubleArray66 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray67 = new double[] {};
        double double69 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray66, doubleArray67, 0);
        double[] doubleArray74 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray75 = new double[] {};
        double double77 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray74, doubleArray75, 0);
        double double79 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray66, doubleArray75, 1);
        double double81 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray55, doubleArray66, (int) '#');
        double[] doubleArray86 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray87 = new double[] {};
        double double89 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray86, doubleArray87, 0);
        double double91 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray55, doubleArray87, 1);
        double double93 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray23, doubleArray87, (int) (short) -1);
        double double95 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray4, doubleArray87, (int) (byte) 100);
        java.lang.Class<?> wildcardClass96 = doubleArray4.getClass();
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
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[232.4213562373095, 0.0, 1.0, 75.85073476263909, -1.0]");
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
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[]");
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + (-1.0d) + "'", double57 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + (-1.0d) + "'", double59 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 0.0d + "'", double61 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray67), "[]");
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + (-1.0d) + "'", double69 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray74), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray75), "[]");
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + (-1.0d) + "'", double77 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + (-1.0d) + "'", double79 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + (-1.0d) + "'", double81 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray86), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray87);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray87), "[]");
        org.junit.Assert.assertTrue("'" + double89 + "' != '" + (-1.0d) + "'", double89 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double91 + "' != '" + 0.0d + "'", double91 == 0.0d);
        org.junit.Assert.assertTrue("'" + double93 + "' != '" + Double.POSITIVE_INFINITY + "'", double93 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double95 + "' != '" + (-1.0d) + "'", double95 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass96);
    }

    @Test
    public void test09988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09988");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(2587.009217682258d, 452.9073047125782d, 289.94401876488206d, 6335.411955191937d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 8179.569849396734d + "'", double4 == 8179.569849396734d);
    }

    @Test
    public void test09989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09989");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1705.512281014777d, 462.21548794951923d, 100.65557929031002d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2341.8661733246336d + "'", double4 == 2341.8661733246336d);
    }

    @Test
    public void test09990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09990");
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
        double double53 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray41, doubleArray49, (int) (byte) 1);
        double double55 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray23, doubleArray41, (int) (short) 0);
        double double57 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray13, doubleArray23, (int) '#');
        double[] doubleArray62 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray63 = new double[] {};
        double double65 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray62, doubleArray63, 0);
        double[] doubleArray70 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray71 = new double[] {};
        double double73 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray70, doubleArray71, 0);
        double[] doubleArray78 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray79 = new double[] {};
        double double81 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray78, doubleArray79, 0);
        double double83 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray70, doubleArray79, (int) (short) 100);
        double[] doubleArray88 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray89 = new double[] {};
        double double91 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray88, doubleArray89, 0);
        double double93 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray79, doubleArray88, (int) (short) 100);
        double double95 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray63, doubleArray79, (int) '4');
        double double97 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray23, doubleArray63, 26);
        java.lang.Class<?> wildcardClass98 = doubleArray23.getClass();
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
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.0d + "'", double53 == 0.0d);
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
        org.junit.Assert.assertNotNull(doubleArray88);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray88), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray89), "[]");
        org.junit.Assert.assertTrue("'" + double91 + "' != '" + (-1.0d) + "'", double91 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double93 + "' != '" + (-1.0d) + "'", double93 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double95 + "' != '" + 0.0d + "'", double95 == 0.0d);
        org.junit.Assert.assertTrue("'" + double97 + "' != '" + 0.0d + "'", double97 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass98);
    }

    @Test
    public void test09991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09991");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(63.25728199523712d, 314.2078389288376d, 178.6467289963071d, 219.00241605516848d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 193.83310156564778d + "'", double4 == 193.83310156564778d);
    }

    @Test
    public void test09992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09992");
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
        int[] intArray34 = new int[] { (byte) -1, (short) -1, ' ' };
        int[] intArray38 = new int[] { 1, 1, 100 };
        int[] intArray40 = new int[] { (byte) -1 };
        int int41 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray38, intArray40);
        int int42 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray34, intArray38);
        int int43 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray5, intArray34);
        int[] intArray47 = new int[] { 1, 1, 100 };
        int[] intArray49 = new int[] { (byte) -1 };
        int int50 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray47, intArray49);
        int[] intArray54 = new int[] { 1, 1, 100 };
        int[] intArray56 = new int[] { (byte) -1 };
        int int57 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray54, intArray56);
        int[] intArray60 = new int[] { 'a', 10 };
        int int61 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray56, intArray60);
        int[] intArray65 = new int[] { (byte) 1, (short) 1, (short) -1 };
        int int66 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray56, intArray65);
        int int67 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray49, intArray56);
        int[] intArray71 = new int[] { 1, 1, 100 };
        int[] intArray73 = new int[] { (byte) -1 };
        int int74 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray71, intArray73);
        int int75 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray49, intArray71);
        int[] intArray79 = new int[] { 1, 1, 100 };
        int[] intArray81 = new int[] { (byte) -1 };
        int int82 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray79, intArray81);
        int int83 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray49, intArray79);
        int int84 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray34, intArray49);
        java.lang.Class<?> wildcardClass85 = intArray34.getClass();
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[-1, -1, 32]");
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[-1]");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 72 + "'", int42 == 72);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
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
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray65), "[1, 1, -1]");
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertNotNull(intArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray71), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray73), "[-1]");
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
        org.junit.Assert.assertNotNull(intArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray79), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray81), "[-1]");
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + (-1) + "'", int82 == (-1));
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + (-1) + "'", int83 == (-1));
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + (-1) + "'", int84 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass85);
    }

    @Test
    public void test09993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09993");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1307.973287223694d, 1613.5602924740228d, 182.05164476463364d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1725.8312968098774d + "'", double4 == 1725.8312968098774d);
    }

    @Test
    public void test09994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09994");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(824.6810786617991d, 0.0d, 2199.033873292094d, 456.673285986374d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1422.770304574122d + "'", double4 == 1422.770304574122d);
    }

    @Test
    public void test09995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09995");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(216.8310642801902d, 397.7177005722833d, 1993.8546560413429d, 619.8117776629068d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1822.1433261503198d + "'", double4 == 1822.1433261503198d);
    }

    @Test
    public void test09996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09996");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(685.1785040751912d, 1377.618587108016d, 252.50093186255893d, 7616.601447930047d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 6671.660433034663d + "'", double4 == 6671.660433034663d);
    }

    @Test
    public void test09997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09997");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(0.0d, 406.43367670481405d, 504.66714216572143d, 1234.0747468921195d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1333.277692492665d + "'", double4 == 1333.277692492665d);
    }

    @Test
    public void test09998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09998");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1003.6213789219814d, 993.1104853699078d, 1437.9155518848538d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1093.5571776998058d + "'", double4 == 1093.5571776998058d);
    }

    @Test
    public void test09999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09999");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1125.1987222259413d, 2781.696581763455d, 538.9516916713967d, 3641.8128673933506d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2583.9954211435265d + "'", double4 == 2583.9954211435265d);
    }

    @Test
    public void test10000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test10000");
        int[] intArray0 = null;
        int[] intArray4 = new int[] { 1, 1, 100 };
        int[] intArray6 = new int[] { (byte) -1 };
        int int7 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray4, intArray6);
        int[] intArray10 = new int[] { 'a', 10 };
        int int11 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray6, intArray10);
        int[] intArray15 = new int[] { 1, 1, 100 };
        int[] intArray17 = new int[] { (byte) -1 };
        int int18 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray15, intArray17);
        int[] intArray22 = new int[] { 1, 1, 100 };
        int[] intArray24 = new int[] { (byte) -1 };
        int int25 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray22, intArray24);
        int[] intArray28 = new int[] { 'a', 10 };
        int int29 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray24, intArray28);
        int int30 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray15, intArray28);
        int int31 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray6, intArray28);
        // The following exception was thrown during execution in test generation
        try {
            int int32 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray0, intArray28);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[-1]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
    }
}

