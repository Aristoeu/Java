package DistanceFormula;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest18 {

    public static boolean debug = false;

    @Test
    public void test09001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09001");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(5629.366662844536d, 433.8341894155431d, 576.5723607668759d, 2128.4361764905866d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 6747.3962891527035d + "'", double4 == 6747.3962891527035d);
    }

    @Test
    public void test09002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09002");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1229.454780469774d, 970.617388611097d, 413.8437306383785d, 816.3228889880967d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 969.9055494543959d + "'", double4 == 969.9055494543959d);
    }

    @Test
    public void test09003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09003");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(2306.9731421097404d, 160.0457809614037d, 0.0d, 703.909886127582d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2809.259133845756d + "'", double4 == 2809.259133845756d);
    }

    @Test
    public void test09004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09004");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(455.57461664944447d, 133.18939359108865d, 2461.4480277645876d, 807.5323439092334d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2680.2163614332876d + "'", double4 == 2680.2163614332876d);
    }

    @Test
    public void test09005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09005");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(161.715672432487d, 319.6699687996772d, 933.2787870756218d, 1704.8176095814592d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2156.710755424917d + "'", double4 == 2156.710755424917d);
    }

    @Test
    public void test09006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09006");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1532.4066615545596d, 1106.965545768595d, 421.80801414835054d, 238.57103000254892d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1978.993163172255d + "'", double4 == 1978.993163172255d);
    }

    @Test
    public void test09007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09007");
        double[] doubleArray4 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray5 = new double[] {};
        double double7 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray4, doubleArray5, 0);
        double[] doubleArray11 = new double[] { 574.5536640965004d, 292.0641734589212d, 590.3802649016793d };
        double[] doubleArray16 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray17 = new double[] {};
        double double19 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray16, doubleArray17, 0);
        double[] doubleArray24 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray25 = new double[] {};
        double double27 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray24, doubleArray25, 0);
        double double29 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray16, doubleArray25, (int) (short) 100);
        double[] doubleArray34 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray35 = new double[] {};
        double double37 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray34, doubleArray35, 0);
        double[] doubleArray42 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray43 = new double[] {};
        double double45 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray42, doubleArray43, 0);
        double double47 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray35, doubleArray43, (int) (byte) 1);
        double double49 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray25, doubleArray43, 0);
        double double51 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray11, doubleArray25, (int) (short) -1);
        double[] doubleArray56 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray57 = new double[] {};
        double double59 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray56, doubleArray57, 0);
        double[] doubleArray64 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray65 = new double[] {};
        double double67 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray64, doubleArray65, 0);
        double double69 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray56, doubleArray65, (int) (short) 100);
        double[] doubleArray74 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray75 = new double[] {};
        double double77 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray74, doubleArray75, 0);
        double[] doubleArray82 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray83 = new double[] {};
        double double85 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray82, doubleArray83, 0);
        double double87 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray75, doubleArray83, (int) (byte) 1);
        double double89 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray65, doubleArray83, 0);
        double double91 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray11, doubleArray83, (int) (byte) 10);
        double double93 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray4, doubleArray83, 72);
        java.lang.Class<?> wildcardClass94 = doubleArray83.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[574.5536640965004, 292.0641734589212, 590.3802649016793]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[]");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.0d) + "'", double19 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[]");
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + (-1.0d) + "'", double27 == (-1.0d));
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
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.0d + "'", double47 == 0.0d);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.0d + "'", double49 == 0.0d);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + (-1.0d) + "'", double51 == (-1.0d));
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
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + (-1.0d) + "'", double69 == (-1.0d));
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
        org.junit.Assert.assertTrue("'" + double93 + "' != '" + (-1.0d) + "'", double93 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass94);
    }

    @Test
    public void test09008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09008");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(998.3089994242234d, 1348.489578160435d, 1811.6274415144944d, 950.5162996351808d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1211.2917206155253d + "'", double4 == 1211.2917206155253d);
    }

    @Test
    public void test09009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09009");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1819.0504172286073d, 226.69203958814956d, 815.204832074316d, 2320.629327205265d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3097.782872771407d + "'", double4 == 3097.782872771407d);
    }

    @Test
    public void test09010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09010");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(361.22579444008596d, 1410.566070092264d, 296.6349750306253d, 305.4177409815338d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1169.7391485201908d + "'", double4 == 1169.7391485201908d);
    }

    @Test
    public void test09011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09011");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(248.76133480910391d, 1997.3898007645857d, 1470.8075926378162d, 220.3017643888764d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2999.134294204422d + "'", double4 == 2999.134294204422d);
    }

    @Test
    public void test09012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09012");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1133.3361978396206d, 1172.7228887780416d, 813.612146229778d, 985.4355202887014d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 507.0114200991828d + "'", double4 == 507.0114200991828d);
    }

    @Test
    public void test09013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09013");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(600.2040345816112d, 0.0d, 705.7138717056934d, 176.5775196994847d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 282.0873568235669d + "'", double4 == 282.0873568235669d);
    }

    @Test
    public void test09014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09014");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(513.0962710588753d, 1737.082645217249d, 1956.0610505372244d, 483.6996920353407d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1443.2641870680807d + "'", double4 == 1443.2641870680807d);
    }

    @Test
    public void test09015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09015");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(928.4610636634484d, 1174.1652512854043d, 74.74780399372804d, 1968.277946913467d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1647.8259552977831d + "'", double4 == 1647.8259552977831d);
    }

    @Test
    public void test09016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09016");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(0.0d, 349.79792638653475d, 611.5484027254348d, 1778.5870698779736d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2040.3375462168738d + "'", double4 == 2040.3375462168738d);
    }

    @Test
    public void test09017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09017");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(0.0d, 1117.0694893632d, 789.1575818830274d, 632.3899450763809d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1273.8371261698467d + "'", double4 == 1273.8371261698467d);
    }

    @Test
    public void test09018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09018");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(0.0d, 732.7755175536307d, 1853.2363306232926d, 429.27177795969703d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1902.3036446621147d + "'", double4 == 1902.3036446621147d);
    }

    @Test
    public void test09019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09019");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(532.5937039245571d, 1450.9174488979525d, 2789.9000638226944d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2319.2861091069935d + "'", double4 == 2319.2861091069935d);
    }

    @Test
    public void test09020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09020");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(286.3885107063019d, 193.20980490947247d, 923.0475533712627d, 406.50251559304854d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 849.9517533485368d + "'", double4 == 849.9517533485368d);
    }

    @Test
    public void test09021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09021");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1075.2369309587705d, 1512.8744646387922d, 1044.1164386029313d, 200.43152753590826d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 875.3587715344529d + "'", double4 == 875.3587715344529d);
    }

    @Test
    public void test09022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09022");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(0.0d, 854.0411423288443d, 550.7707814009694d, 2516.6424865236195d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2576.2060978541335d + "'", double4 == 2576.2060978541335d);
    }

    @Test
    public void test09023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09023");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(2294.6287863299817d, 225.1016639337322d, 993.6335652888822d, 868.2254995729284d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1930.5996223047139d + "'", double4 == 1930.5996223047139d);
    }

    @Test
    public void test09024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09024");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(784.8892445297196d, 2035.3472909522595d, 204.83607191297912d, 4100.314475696812d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3365.784625688654d + "'", double4 == 3365.784625688654d);
    }

    @Test
    public void test09025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09025");
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
        int int30 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray12, intArray28);
        java.lang.Class<?> wildcardClass31 = intArray12.getClass();
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test09026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09026");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(871.2992730721038d, 599.1954026113349d, 1914.1839562045725d, 599.2701060342042d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1042.959386555338d + "'", double4 == 1042.959386555338d);
    }

    @Test
    public void test09027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09027");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(622.3178581245444d, 1533.0140149600534d, 1914.7704322181469d, 863.5160259266543d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1314.7662196878478d + "'", double4 == 1314.7662196878478d);
    }

    @Test
    public void test09028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09028");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(2748.7154687782045d, 438.97829378179034d, 3494.9507443505227d, 191.32568848467787d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2664.0400850697174d + "'", double4 == 2664.0400850697174d);
    }

    @Test
    public void test09029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09029");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(0.0d, 228.29858276560483d, 1895.245877904139d, 259.15965828116396d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1926.1069534196981d + "'", double4 == 1926.1069534196981d);
    }

    @Test
    public void test09030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09030");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1457.0564949130237d, 1387.6062631083898d, 685.41824613244d, 492.30976810098156d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1235.379226746069d + "'", double4 == 1235.379226746069d);
    }

    @Test
    public void test09031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09031");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(539.3785900263996d, 1138.7230506055257d, 1588.8878282789594d, 2129.1261894350837d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2039.912377082118d + "'", double4 == 2039.912377082118d);
    }

    @Test
    public void test09032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09032");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1135.6124514136184d, 784.2182474956893d, 2632.038670593218d, 638.2978612727459d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1642.346605402543d + "'", double4 == 1642.346605402543d);
    }

    @Test
    public void test09033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09033");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(783.7978594614158d, 52.16484698241814d, 242.71259635991422d, 133.0277687196285d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 846.3302977855013d + "'", double4 == 846.3302977855013d);
    }

    @Test
    public void test09034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09034");
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
        int[] intArray72 = new int[] { 'a', 10 };
        int int73 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray68, intArray72);
        int[] intArray77 = new int[] { (byte) 1, (short) 1, (short) -1 };
        int int78 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray68, intArray77);
        int[] intArray82 = new int[] { (byte) -1, '#', (-1) };
        int int83 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray68, intArray82);
        int int84 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray56, intArray82);
        int[] intArray88 = new int[] { (byte) -1, (short) -1, ' ' };
        int[] intArray92 = new int[] { 1, 1, 100 };
        int[] intArray94 = new int[] { (byte) -1 };
        int int95 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray92, intArray94);
        int int96 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray88, intArray92);
        int int97 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray82, intArray88);
        int int98 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray16, intArray88);
        java.lang.Class<?> wildcardClass99 = intArray88.getClass();
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
        org.junit.Assert.assertNotNull(intArray88);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray88), "[-1, -1, 32]");
        org.junit.Assert.assertNotNull(intArray92);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray92), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray94);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray94), "[-1]");
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + (-1) + "'", int95 == (-1));
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + 72 + "'", int96 == 72);
        org.junit.Assert.assertTrue("'" + int97 + "' != '" + 69 + "'", int97 == 69);
        org.junit.Assert.assertTrue("'" + int98 + "' != '" + (-1) + "'", int98 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass99);
    }

    @Test
    public void test09035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09035");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1728.6060689590258d, 0.0d, 392.727266891686d, 603.0082883958016d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1746.8664910123289d + "'", double4 == 1746.8664910123289d);
    }

    @Test
    public void test09036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09036");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(206.1803399776416d, 1750.9155711951876d, 1272.976621893827d, 214.19929113781262d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1066.8264201302416d + "'", double4 == 1066.8264201302416d);
    }

    @Test
    public void test09037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09037");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1037.2782600053122d, 372.10153723305945d, 1121.6440574775736d, 379.5582291992054d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 91.82248943840739d + "'", double4 == 91.82248943840739d);
    }

    @Test
    public void test09038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09038");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(436.0365379798176d, 800.5533158928175d, 916.4991176912024d, 1168.0564717759175d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 875.6126278085335d + "'", double4 == 875.6126278085335d);
    }

    @Test
    public void test09039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09039");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1007.3868728451162d, 2283.815936573337d, 445.15565334563473d, 1026.0204526500195d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 562.539913673883d + "'", double4 == 562.539913673883d);
    }

    @Test
    public void test09040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09040");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(264.9111278263732d, 762.1889468010093d, 206.8413115591487d, 409.4502386714465d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 410.8085243967872d + "'", double4 == 410.8085243967872d);
    }

    @Test
    public void test09041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09041");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(448.28604210226746d, 748.0414034714805d, 1831.7889207857309d, 2820.2121154445276d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2745.92671291975d + "'", double4 == 2745.92671291975d);
    }

    @Test
    public void test09042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09042");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(852.897961919623d, 280.97238101164777d, 573.0245855403448d, 415.955006572553d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 518.8913692030045d + "'", double4 == 518.8913692030045d);
    }

    @Test
    public void test09043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09043");
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
        double[] doubleArray58 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double60 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray23, doubleArray58, (int) '4');
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
    }

    @Test
    public void test09044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09044");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1066.4156521349796d, 2910.528326987008d, 1404.1067534121478d, 524.6435521795014d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 638.3982206835756d + "'", double4 == 638.3982206835756d);
    }

    @Test
    public void test09045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09045");
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
        int int60 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray5, intArray21);
        int[] intArray64 = new int[] { 1, 1, 100 };
        int[] intArray66 = new int[] { (byte) -1 };
        int int67 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray64, intArray66);
        int[] intArray71 = new int[] { 1, 1, 100 };
        int[] intArray73 = new int[] { (byte) -1 };
        int int74 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray71, intArray73);
        int int75 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray64, intArray73);
        int[] intArray79 = new int[] { 1, 1, 100 };
        int[] intArray81 = new int[] { (byte) -1 };
        int int82 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray79, intArray81);
        int int83 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray73, intArray79);
        int int84 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray5, intArray73);
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
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(intArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray64), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray66), "[-1]");
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
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
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 0 + "'", int84 == 0);
    }

    @Test
    public void test09046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09046");
        int[] intArray3 = new int[] { 1, 1, 100 };
        int[] intArray5 = new int[] { (byte) -1 };
        int int6 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray3, intArray5);
        int[] intArray9 = new int[] { 'a', 10 };
        int int10 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray5, intArray9);
        int[] intArray14 = new int[] { 1, 1, 100 };
        int[] intArray16 = new int[] { (byte) -1 };
        int int17 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray14, intArray16);
        int[] intArray23 = new int[] { (byte) 10, (byte) 100, ' ', (short) -1, (short) 100 };
        int int24 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray16, intArray23);
        int[] intArray28 = new int[] { 1, 1, 100 };
        int[] intArray30 = new int[] { (byte) -1 };
        int int31 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray28, intArray30);
        int[] intArray35 = new int[] { 1, 1, 100 };
        int[] intArray37 = new int[] { (byte) -1 };
        int int38 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray35, intArray37);
        int[] intArray41 = new int[] { 'a', 10 };
        int int42 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray37, intArray41);
        int int43 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray28, intArray41);
        int int44 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray16, intArray41);
        int int45 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray9, intArray16);
        int[] intArray50 = new int[] { 100, 136, 215, 69 };
        int[] intArray54 = new int[] { (byte) -1, (short) -1, ' ' };
        int[] intArray58 = new int[] { 1, 1, 100 };
        int[] intArray60 = new int[] { (byte) -1 };
        int int61 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray58, intArray60);
        int int62 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray54, intArray58);
        int[] intArray66 = new int[] { 1, 1, 100 };
        int[] intArray68 = new int[] { (byte) -1 };
        int int69 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray66, intArray68);
        int[] intArray72 = new int[] { 'a', 10 };
        int int73 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray68, intArray72);
        int[] intArray77 = new int[] { 1, 1, 100 };
        int[] intArray79 = new int[] { (byte) -1 };
        int int80 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray77, intArray79);
        int[] intArray84 = new int[] { 1, 1, 100 };
        int[] intArray86 = new int[] { (byte) -1 };
        int int87 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray84, intArray86);
        int[] intArray90 = new int[] { 'a', 10 };
        int int91 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray86, intArray90);
        int int92 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray77, intArray90);
        int int93 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray68, intArray90);
        int int94 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray58, intArray68);
        int int95 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray50, intArray68);
        int int96 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray16, intArray50);
        int[] intArray97 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int98 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray50, intArray97);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
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
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[10, 100, 32, -1, 100]");
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
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray50), "[100, 136, 215, 69]");
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray54), "[-1, -1, 32]");
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray58), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray60), "[-1]");
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 72 + "'", int62 == 72);
        org.junit.Assert.assertNotNull(intArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray66), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray68), "[-1]");
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
        org.junit.Assert.assertNotNull(intArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray72), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertNotNull(intArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray77), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray79), "[-1]");
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + (-1) + "'", int80 == (-1));
        org.junit.Assert.assertNotNull(intArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray84), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray86), "[-1]");
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + (-1) + "'", int87 == (-1));
        org.junit.Assert.assertNotNull(intArray90);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray90), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + (-1) + "'", int91 == (-1));
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + (-1) + "'", int92 == (-1));
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + (-1) + "'", int93 == (-1));
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + (-1) + "'", int94 == (-1));
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + (-1) + "'", int95 == (-1));
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + (-1) + "'", int96 == (-1));
    }

    @Test
    public void test09047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09047");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(809.867614684615d, 1392.9518875771462d, 916.9379759508236d, 2496.2441155580864d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1210.3625892471487d + "'", double4 == 1210.3625892471487d);
    }

    @Test
    public void test09048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09048");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(853.6152065132407d, 68.80572190500413d, 1546.2551237347398d, 2212.0898829125053d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1524.8617974579508d + "'", double4 == 1524.8617974579508d);
    }

    @Test
    public void test09049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09049");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(341.7378669222432d, 345.02253292181524d, 332.52698736631544d, 514.4583823621946d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 178.6467289963071d + "'", double4 == 178.6467289963071d);
    }

    @Test
    public void test09050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09050");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(808.0044001508044d, 438.0401328127323d, 2200.6004801836375d, 883.9288584915055d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1838.4848057116062d + "'", double4 == 1838.4848057116062d);
    }

    @Test
    public void test09051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09051");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(2525.93551167729d, 844.7638864121714d, 780.9621260792533d, 745.1737787048565d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2493.199644245213d + "'", double4 == 2493.199644245213d);
    }

    @Test
    public void test09052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09052");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(907.8561517211983d, 0.0d, 1546.2551237347398d, 2544.482065155524d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1756.7292415146644d + "'", double4 == 1756.7292415146644d);
    }

    @Test
    public void test09053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09053");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance((double) (short) -1, 1205.7587838949864d, 497.6952949381995d, 1569.438920038542d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 862.375431081755d + "'", double4 == 862.375431081755d);
    }

    @Test
    public void test09054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09054");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(737.7491614585805d, 4675.814059739997d, 1310.8434542107746d, 1135.0084112596537d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 697.3177037316987d + "'", double4 == 697.3177037316987d);
    }

    @Test
    public void test09055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09055");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(329.4012999106945d, 2740.8677807783633d, 206.06908495375603d, 1686.4043386243986d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1177.7956571109032d + "'", double4 == 1177.7956571109032d);
    }

    @Test
    public void test09056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09056");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(614.6542483640318d, 545.7139477899229d, 358.666116899047d, 332.0533251182606d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 381.3046095581544d + "'", double4 == 381.3046095581544d);
    }

    @Test
    public void test09057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09057");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(456.17939553002856d, 90.5608003457567d, 275.7493034643693d, 383.6847775335497d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 473.55406925345227d + "'", double4 == 473.55406925345227d);
    }

    @Test
    public void test09058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09058");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(120.83040483867897d, 221.47798505250438d, 2934.2483455780743d, 893.8342249207731d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2917.6797999670575d + "'", double4 == 2917.6797999670575d);
    }

    @Test
    public void test09059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09059");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(197.09371384593d, 942.3260805538212d, 0.0d, 65.9080036239302d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 236.7606863565652d + "'", double4 == 236.7606863565652d);
    }

    @Test
    public void test09060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09060");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(3251.2001998753476d, 2520.200507853767d, 4213.551643492881d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3390.6375566701686d + "'", double4 == 3390.6375566701686d);
    }

    @Test
    public void test09061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09061");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(0.0d, 282.1994595477188d, 530.3934173395959d, 182.53302624480077d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 630.0598506425139d + "'", double4 == 630.0598506425139d);
    }

    @Test
    public void test09062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09062");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(385.1080041055461d, 545.4581896025791d, 264.9111278263732d, 545.9406267322378d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 200.78451526014302d + "'", double4 == 200.78451526014302d);
    }

    @Test
    public void test09063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09063");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(2849.3415460531464d, 475.9324615695342d, 1074.9072225929112d, 663.5080816364044d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1962.0099435271054d + "'", double4 == 1962.0099435271054d);
    }

    @Test
    public void test09064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09064");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(382.2425147690072d, 2434.3474243723795d, 476.4278225087196d, 671.4067733168717d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 304.11649185067324d + "'", double4 == 304.11649185067324d);
    }

    @Test
    public void test09065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09065");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(406.43367670481405d, 3407.0263998831115d, 1980.1490089792385d, 1008.5523427607792d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1684.9708706825222d + "'", double4 == 1684.9708706825222d);
    }

    @Test
    public void test09066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09066");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1640.025571073489d, 263.5389460810053d, 0.0d, 796.6050949282106d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1844.1914145109913d + "'", double4 == 1844.1914145109913d);
    }

    @Test
    public void test09067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09067");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(2137.347695445429d, 814.040863045154d, 2018.2147339989697d, 976.5614518064042d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1166.883612844315d + "'", double4 == 1166.883612844315d);
    }

    @Test
    public void test09068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09068");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(542.1805536501383d, 1325.1233860794462d, 3219.7365386231754d, 592.9366778909589d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2678.037011845221d + "'", double4 == 2678.037011845221d);
    }

    @Test
    public void test09069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09069");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(0.0d, 536.5073332323396d, 624.2484871876188d, 780.3041827274247d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 999.2801365672916d + "'", double4 == 999.2801365672916d);
    }

    @Test
    public void test09070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09070");
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
        int int30 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray5, intArray27);
        int[] intArray34 = new int[] { 1, 1, 100 };
        int[] intArray36 = new int[] { (byte) -1 };
        int int37 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray34, intArray36);
        int[] intArray40 = new int[] { 'a', 10 };
        int int41 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray36, intArray40);
        int[] intArray45 = new int[] { (byte) 1, (short) 1, (short) -1 };
        int int46 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray36, intArray45);
        int[] intArray50 = new int[] { 1, 1, 100 };
        int[] intArray52 = new int[] { (byte) -1 };
        int int53 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray50, intArray52);
        int[] intArray57 = new int[] { 1, 1, 100 };
        int[] intArray59 = new int[] { (byte) -1 };
        int int60 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray57, intArray59);
        int[] intArray63 = new int[] { 'a', 10 };
        int int64 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray59, intArray63);
        int[] intArray68 = new int[] { (byte) 1, (short) 1, (short) -1 };
        int int69 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray59, intArray68);
        int int70 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray52, intArray59);
        int[] intArray74 = new int[] { 1, 1, 100 };
        int[] intArray76 = new int[] { (byte) -1 };
        int int77 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray74, intArray76);
        int int78 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray52, intArray74);
        int[] intArray82 = new int[] { 1, 1, 100 };
        int[] intArray84 = new int[] { (byte) -1 };
        int int85 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray82, intArray84);
        int[] intArray88 = new int[] { 'a', 10 };
        int int89 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray84, intArray88);
        int int90 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray52, intArray84);
        int int91 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray45, intArray52);
        int int92 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray5, intArray52);
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
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray45), "[1, 1, -1]");
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
        org.junit.Assert.assertNotNull(intArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray68), "[1, 1, -1]");
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertNotNull(intArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray74), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray76), "[-1]");
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + (-1) + "'", int77 == (-1));
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
        org.junit.Assert.assertNotNull(intArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray82), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray84), "[-1]");
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + (-1) + "'", int85 == (-1));
        org.junit.Assert.assertNotNull(intArray88);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray88), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + (-1) + "'", int89 == (-1));
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 0 + "'", int90 == 0);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + (-1) + "'", int91 == (-1));
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 0 + "'", int92 == 0);
    }

    @Test
    public void test09071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09071");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(367.59157912831455d, 775.270960288489d, 1698.673804034093d, 1160.713405466961d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1716.5246700842504d + "'", double4 == 1716.5246700842504d);
    }

    @Test
    public void test09072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09072");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(2133.602381482537d, 1239.8945688532006d, 445.4371447615443d, 4380.026043519007d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4828.296711386799d + "'", double4 == 4828.296711386799d);
    }

    @Test
    public void test09073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09073");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(0.0d, 490.25700073760834d, 1148.3107511959963d, 761.1853721887338d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1377.6867394826788d + "'", double4 == 1377.6867394826788d);
    }

    @Test
    public void test09074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09074");
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
        double double43 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray30, doubleArray39, (int) (short) 100);
        double[] doubleArray48 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray49 = new double[] {};
        double double51 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray48, doubleArray49, 0);
        double double53 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray39, doubleArray48, (int) (short) 100);
        double double55 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray23, doubleArray39, (int) '4');
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
        double double83 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray69, doubleArray78, (int) (short) 100);
        double double85 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray39, doubleArray78, 26);
        double double87 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray13, doubleArray39, 10);
        java.lang.Class<?> wildcardClass88 = doubleArray39.getClass();
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
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[]");
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + (-1.0d) + "'", double51 == (-1.0d));
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
    public void test09075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09075");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1058.2999707997549d, 2905.878411692255d, 1453.3374024523816d, 221.06624126544014d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3079.849602079442d + "'", double4 == 3079.849602079442d);
    }

    @Test
    public void test09076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09076");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1820.8881979600715d, 717.3390643861583d, 1765.557887033107d, 79.45141512783117d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 693.2179601852916d + "'", double4 == 693.2179601852916d);
    }

    @Test
    public void test09077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09077");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(2072.9499792265988d, 286.3885107063019d, 859.5558935938309d, 1625.9429991177192d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2552.948574044185d + "'", double4 == 2552.948574044185d);
    }

    @Test
    public void test09078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09078");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1609.3047128509d, 58.069587009010455d, 1573.125977548808d, 1172.8753489280534d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1150.984497221135d + "'", double4 == 1150.984497221135d);
    }

    @Test
    public void test09079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09079");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(444.5004030551891d, 133.0277687196285d, 2669.2960561997807d, 779.8923271374493d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2871.6602115624123d + "'", double4 == 2871.6602115624123d);
    }

    @Test
    public void test09080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09080");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1079.8682158269867d, 959.981452064076d, 373.6116600540088d, 2143.0401578270967d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1889.3152615359984d + "'", double4 == 1889.3152615359984d);
    }

    @Test
    public void test09081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09081");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(2147.4286594863497d, 2143.0401578270967d, 150.5531074368993d, 1667.4102109828045d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2053.759888905358d + "'", double4 == 2053.759888905358d);
    }

    @Test
    public void test09082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09082");
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
        double double41 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray29, doubleArray37, (int) (byte) 1);
        double[] doubleArray46 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray47 = new double[] {};
        double double49 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray46, doubleArray47, 0);
        double[] doubleArray54 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray55 = new double[] {};
        double double57 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray54, doubleArray55, 0);
        double double59 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray46, doubleArray55, (int) (short) 100);
        double double61 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray37, doubleArray55, (int) (short) 0);
        double double63 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray14, doubleArray37, (-1));
        double[] doubleArray68 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray69 = new double[] {};
        double double71 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray68, doubleArray69, 0);
        double[] doubleArray76 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray77 = new double[] {};
        double double79 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray76, doubleArray77, 0);
        double[] doubleArray84 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray85 = new double[] {};
        double double87 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray84, doubleArray85, 0);
        double double89 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray76, doubleArray85, 1);
        double double91 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray69, doubleArray76, (int) ' ');
        double double93 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray14, doubleArray69, 137);
        // The following exception was thrown during execution in test generation
        try {
            double double95 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray0, doubleArray69, (int) (byte) 1);
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
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
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
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + Double.POSITIVE_INFINITY + "'", double63 == Double.POSITIVE_INFINITY);
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
        org.junit.Assert.assertNotNull(doubleArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray84), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray85), "[]");
        org.junit.Assert.assertTrue("'" + double87 + "' != '" + (-1.0d) + "'", double87 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double89 + "' != '" + (-1.0d) + "'", double89 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double91 + "' != '" + (-1.0d) + "'", double91 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double93 + "' != '" + 0.0d + "'", double93 == 0.0d);
    }

    @Test
    public void test09083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09083");
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
        int[] intArray45 = new int[] { 1, 1, 100 };
        int[] intArray47 = new int[] { (byte) -1 };
        int int48 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray45, intArray47);
        int[] intArray51 = new int[] { 'a', 10 };
        int int52 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray47, intArray51);
        int[] intArray56 = new int[] { (byte) 1, (short) 1, (short) -1 };
        int int57 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray47, intArray56);
        int int58 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray40, intArray47);
        int[] intArray62 = new int[] { 1, 1, 100 };
        int[] intArray64 = new int[] { (byte) -1 };
        int int65 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray62, intArray64);
        int[] intArray68 = new int[] { 'a', 10 };
        int int69 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray64, intArray68);
        int[] intArray73 = new int[] { (byte) 1, (short) 1, (short) -1 };
        int int74 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray64, intArray73);
        int[] intArray78 = new int[] { (byte) -1, '#', (-1) };
        int int79 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray64, intArray78);
        int int80 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray47, intArray64);
        int int81 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray31, intArray47);
        int[] intArray86 = new int[] { (byte) 1, (byte) 0, 1, 100 };
        int int87 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray31, intArray86);
        // The following exception was thrown during execution in test generation
        try {
            int int88 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray0, intArray86);
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
        org.junit.Assert.assertNotNull(intArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray68), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
        org.junit.Assert.assertNotNull(intArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray73), "[1, 1, -1]");
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
        org.junit.Assert.assertNotNull(intArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray78), "[-1, 35, -1]");
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + (-1) + "'", int79 == (-1));
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + (-1) + "'", int81 == (-1));
        org.junit.Assert.assertNotNull(intArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray86), "[1, 0, 1, 100]");
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + (-1) + "'", int87 == (-1));
    }

    @Test
    public void test09084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09084");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(2587.009217682258d, 0.0d, 755.7384494027308d, 1626.811134785038d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2067.736198153572d + "'", double4 == 2067.736198153572d);
    }

    @Test
    public void test09085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09085");
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
        double double73 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray60, doubleArray69, (int) (short) 100);
        double[] doubleArray78 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray79 = new double[] {};
        double double81 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray78, doubleArray79, 0);
        double double83 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray60, doubleArray78, (int) (byte) 0);
        double double85 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray42, doubleArray78, (int) (short) 1);
        double double87 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray5, doubleArray42, 186);
        java.lang.Class<?> wildcardClass88 = doubleArray42.getClass();
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
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + (-1.0d) + "'", double73 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray78), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray79), "[]");
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + (-1.0d) + "'", double81 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + Double.POSITIVE_INFINITY + "'", double83 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double85 + "' != '" + 0.0d + "'", double85 == 0.0d);
        org.junit.Assert.assertTrue("'" + double87 + "' != '" + (-1.0d) + "'", double87 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass88);
    }

    @Test
    public void test09086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09086");
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
        int[] intArray40 = new int[] { 'a', 10 };
        int int41 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray36, intArray40);
        int[] intArray45 = new int[] { (byte) 1, (short) 1, (short) -1 };
        int int46 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray36, intArray45);
        int int47 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray19, intArray36);
        int int48 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray5, intArray19);
        java.lang.Class<?> wildcardClass49 = intArray19.getClass();
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
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray45), "[1, 1, -1]");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test09087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09087");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(734.9522634215991d, 392.8371163726768d, 791.3427433400091d, 669.7748718120987d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 333.32823535783183d + "'", double4 == 333.32823535783183d);
    }

    @Test
    public void test09088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09088");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(550.640051803866d, 897.4342087367569d, 3376.55495984282d, 254.9499550546181d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2841.342587720177d + "'", double4 == 2841.342587720177d);
    }

    @Test
    public void test09089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09089");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1625.9429991177192d, 457.5253698331466d, 926.8182347708953d, 1012.5492067652477d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1254.148601278925d + "'", double4 == 1254.148601278925d);
    }

    @Test
    public void test09090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09090");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(818.8255089349238d, 1492.6857051635702d, 1327.1607151893802d, 469.72333642475326d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1531.2975749932734d + "'", double4 == 1531.2975749932734d);
    }

    @Test
    public void test09091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09091");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(186.29062043987966d, 2022.654758985479d, 1470.8397935697385d, 413.7815112729882d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1304.5377279330198d + "'", double4 == 1304.5377279330198d);
    }

    @Test
    public void test09092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09092");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(633.8394186690646d, 1379.1918261573564d, 1717.2393775450803d, 2784.940278483535d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2489.1484112021944d + "'", double4 == 2489.1484112021944d);
    }

    @Test
    public void test09093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09093");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(2339.736452955298d, 333.0526306624067d, 1820.3574553715514d, 348.8122642567162d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2057.555264938515d + "'", double4 == 2057.555264938515d);
    }

    @Test
    public void test09094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09094");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1234.0747468921195d, 2533.5998068209196d, 0.0d, 297.2580588905373d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3470.416494822502d + "'", double4 == 3470.416494822502d);
    }

    @Test
    public void test09095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09095");
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
        java.lang.Class<?> wildcardClass68 = intArray5.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass68);
    }

    @Test
    public void test09096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09096");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(2598.1331824531635d, 297.2580588905373d, 0.0d, 2007.3192863197673d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2664.46187693285d + "'", double4 == 2664.46187693285d);
    }

    @Test
    public void test09097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09097");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1633.3131113488175d, 264.0d, 823.0017877319367d, 440.1952908849384d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1442.2671648103963d + "'", double4 == 1442.2671648103963d);
    }

    @Test
    public void test09098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09098");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(65.30018268116424d, 1169.7391485201908d, 0.0d, 1092.868792058805d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 142.17053914255013d + "'", double4 == 142.17053914255013d);
    }

    @Test
    public void test09099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09099");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(2586.932422615435d, 308.0245929034511d, 1439.5642048562368d, 120.09017554298981d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2720.6184037945027d + "'", double4 == 2720.6184037945027d);
    }

    @Test
    public void test09100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09100");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(124.05585426610935d, 875.2507257837353d, 2568.589806105013d, 1507.7426992397886d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2808.974105727275d + "'", double4 == 2808.974105727275d);
    }

    @Test
    public void test09101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09101");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1920.161705423197d, 1711.4839648876218d, 476.49546095744375d, 1113.295503583767d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1653.8456073892264d + "'", double4 == 1653.8456073892264d);
    }

    @Test
    public void test09102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09102");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(905.3915780663442d, 326.5200682458287d, 728.7328190589028d, 621.808771795944d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 334.107056414923d + "'", double4 == 334.107056414923d);
    }

    @Test
    public void test09103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09103");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(416.7932251801975d, 1424.6589766622005d, 1816.4332429609024d, 3990.967498611844d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3838.4520208325916d + "'", double4 == 3838.4520208325916d);
    }

    @Test
    public void test09104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09104");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1778.805286324257d, 780.3041827274247d, 783.4339093421895d, 1685.5586945496475d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1900.6258888042903d + "'", double4 == 1900.6258888042903d);
    }

    @Test
    public void test09105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09105");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(646.6367003341174d, 2086.6467286374295d, 2776.8100428033104d, 962.2544315264946d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2153.4282020093906d + "'", double4 == 2153.4282020093906d);
    }

    @Test
    public void test09106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09106");
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
        // The following exception was thrown during execution in test generation
        try {
            double double60 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray0, doubleArray22, (int) 'a');
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
    }

    @Test
    public void test09107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09107");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1225.8057226466149d, 2417.183122039889d, 1122.5449976821405d, 1467.4653470596918d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1052.9784999446715d + "'", double4 == 1052.9784999446715d);
    }

    @Test
    public void test09108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09108");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(574.8480378080076d, 1747.5421668667009d, 0.0d, 1923.2494552526769d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 750.5553261939835d + "'", double4 == 750.5553261939835d);
    }

    @Test
    public void test09109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09109");
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
        double double47 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray35, doubleArray43, (int) (byte) 1);
        double[] doubleArray52 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray53 = new double[] {};
        double double55 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray52, doubleArray53, 0);
        double[] doubleArray60 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray61 = new double[] {};
        double double63 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray60, doubleArray61, 0);
        double double65 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray52, doubleArray61, (int) (short) 100);
        double[] doubleArray68 = new double[] { (byte) 0, 132.0d };
        double double70 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray61, doubleArray68, (int) '4');
        double[] doubleArray72 = new double[] { (short) 0 };
        double[] doubleArray77 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray78 = new double[] {};
        double double80 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray77, doubleArray78, 0);
        double[] doubleArray85 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray86 = new double[] {};
        double double88 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray85, doubleArray86, 0);
        double double90 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray77, doubleArray86, (int) (short) 100);
        double double92 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray72, doubleArray77, 1);
        double double94 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray68, doubleArray77, 1);
        double double96 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray43, doubleArray68, (int) (short) -1);
        double double98 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray27, doubleArray68, (int) (short) -1);
        java.lang.Class<?> wildcardClass99 = doubleArray68.getClass();
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
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray68), "[0.0, 132.0]");
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
        org.junit.Assert.assertTrue("'" + double98 + "' != '" + (-1.0d) + "'", double98 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass99);
    }

    @Test
    public void test09110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09110");
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
        double double35 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray22, doubleArray31, (int) (short) 100);
        double[] doubleArray40 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray41 = new double[] {};
        double double43 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray40, doubleArray41, 0);
        double double45 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray31, doubleArray40, (int) (short) 100);
        double[] doubleArray50 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray51 = new double[] {};
        double double53 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray50, doubleArray51, 0);
        double[] doubleArray59 = new double[] { 232.4213562373095d, (short) 0, 1.0f, 75.85073476263909d, (-1L) };
        double double61 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray51, doubleArray59, (int) (byte) -1);
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
        double double91 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray59, doubleArray84, (int) (short) 100);
        double double93 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray40, doubleArray59, (int) (short) 1);
        double double95 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray13, doubleArray59, (int) (byte) 1);
        double[] doubleArray96 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double98 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray59, doubleArray96, (-1));
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
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + (-1.0d) + "'", double45 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[]");
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + (-1.0d) + "'", double53 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[232.4213562373095, 0.0, 1.0, 75.85073476263909, -1.0]");
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
        org.junit.Assert.assertTrue("'" + double93 + "' != '" + (-1.0d) + "'", double93 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double95 + "' != '" + (-1.0d) + "'", double95 == (-1.0d));
    }

    @Test
    public void test09111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09111");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1359.661242426394d, 161.7345274581286d, 3403.917226921266d, 2009.6864730654277d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2145.1142931346167d + "'", double4 == 2145.1142931346167d);
    }

    @Test
    public void test09112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09112");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(2392.9035277052335d, 739.7419101766809d, 1390.7350496506167d, 1243.127005155692d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1505.5535730336278d + "'", double4 == 1505.5535730336278d);
    }

    @Test
    public void test09113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09113");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(970.6014510601196d, 355.43448444224407d, 1518.8869503445171d, 2108.6613560561427d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2301.5123708982965d + "'", double4 == 2301.5123708982965d);
    }

    @Test
    public void test09114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09114");
        int[] intArray0 = null;
        int[] intArray4 = new int[] { 1, 1, 100 };
        int[] intArray6 = new int[] { (byte) -1 };
        int int7 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray4, intArray6);
        int[] intArray11 = new int[] { 1, 1, 100 };
        int[] intArray13 = new int[] { (byte) -1 };
        int int14 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray11, intArray13);
        int[] intArray20 = new int[] { (byte) 10, (byte) 100, ' ', (short) -1, (short) 100 };
        int int21 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray13, intArray20);
        int int22 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray4, intArray20);
        int[] intArray26 = new int[] { 1, 1, 100 };
        int[] intArray28 = new int[] { (byte) -1 };
        int int29 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray26, intArray28);
        int[] intArray33 = new int[] { 1, 1, 100 };
        int[] intArray35 = new int[] { (byte) -1 };
        int int36 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray33, intArray35);
        int[] intArray39 = new int[] { 'a', 10 };
        int int40 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray35, intArray39);
        int int41 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray26, intArray39);
        int int42 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray20, intArray26);
        // The following exception was thrown during execution in test generation
        try {
            int int43 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray0, intArray20);
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
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[10, 100, 32, -1, 100]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
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
    }

    @Test
    public void test09115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09115");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(2385.95328056377d, 1072.0657401859485d, 1093.7774039239396d, 214.19929113781262d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2527.099896473718d + "'", double4 == 2527.099896473718d);
    }

    @Test
    public void test09116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09116");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1057.4275167079888d, 823.0558448818485d, 685.0850282096962d, 719.3578955651086d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 476.04043781503253d + "'", double4 == 476.04043781503253d);
    }

    @Test
    public void test09117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09117");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(547.801229584586d, 1231.5899008843833d, 0.0d, 1037.2707630084167d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 734.6200455232125d + "'", double4 == 734.6200455232125d);
    }

    @Test
    public void test09118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09118");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(115.7923937432095d, 737.2592338764838d, 1720.3168189486005d, 506.7897703571102d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1834.9938887247645d + "'", double4 == 1834.9938887247645d);
    }

    @Test
    public void test09119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09119");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(823.2048226688985d, 471.08561422042396d, 959.0422189047277d, 5005.431884226412d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4184.432457650633d + "'", double4 == 4184.432457650633d);
    }

    @Test
    public void test09120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09120");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1619.0496554094177d, 1143.5891226009435d, 1108.29991183946d, 885.5120248650928d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 893.8359782316663d + "'", double4 == 893.8359782316663d);
    }

    @Test
    public void test09121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09121");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(3706.443598550084d, 1488.8754289953795d, 2865.620089168635d, 1746.8664910123289d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1098.8145713983986d + "'", double4 == 1098.8145713983986d);
    }

    @Test
    public void test09122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09122");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1493.3640711629396d, 1238.7546142208173d, 926.8168419803987d, 1476.1683711129729d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 566.8081289066193d + "'", double4 == 566.8081289066193d);
    }

    @Test
    public void test09123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09123");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(301.16345876515066d, 0.0d, 0.0d, 198.824477193098d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 318.076556892509d + "'", double4 == 318.076556892509d);
    }

    @Test
    public void test09124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09124");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(169.5558367014212d, 241.86946405314654d, 1158.2910843011919d, 1118.0418394490325d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1370.1179099823203d + "'", double4 == 1370.1179099823203d);
    }

    @Test
    public void test09125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09125");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(299.34040563238096d, 266.74043359662835d, 0.0d, 2282.7865933658777d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2315.3865654016304d + "'", double4 == 2315.3865654016304d);
    }

    @Test
    public void test09126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09126");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(2187.097140768588d, 1467.4653470596918d, 1106.965545768595d, 2677.233912115538d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2289.900160055839d + "'", double4 == 2289.900160055839d);
    }

    @Test
    public void test09127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09127");
        double[] doubleArray0 = null;
        double[] doubleArray2 = new double[] { (short) 0 };
        double[] doubleArray7 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray8 = new double[] {};
        double double10 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray7, doubleArray8, 0);
        double[] doubleArray15 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray16 = new double[] {};
        double double18 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray15, doubleArray16, 0);
        double double20 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray7, doubleArray16, (int) (short) 100);
        double double22 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray2, doubleArray7, 1);
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
        double double96 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray2, doubleArray77, 100);
        // The following exception was thrown during execution in test generation
        try {
            double double98 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray0, doubleArray2, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0]");
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
    }

    @Test
    public void test09128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09128");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1051.3532201541273d, 824.6810786617991d, 0.0d, 676.4407711774177d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1116.2002230452056d + "'", double4 == 1116.2002230452056d);
    }

    @Test
    public void test09129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09129");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1030.529719285076d, 316.85210118166225d, 1086.932192912669d, 1544.1606723747102d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1283.711044820641d + "'", double4 == 1283.711044820641d);
    }

    @Test
    public void test09130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09130");
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
        double[] doubleArray34 = new double[] { 221.38186019448963d, 364.34654754189563d, 1789.0559517170952d, 896.632439101549d, 5328.628649866165d, 2634.3844687894953d };
        double double36 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray21, doubleArray34, 137);
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
        double[] doubleArray75 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray76 = new double[] {};
        double double78 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray75, doubleArray76, 0);
        double double80 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray67, doubleArray76, 1);
        double double82 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray60, doubleArray76, (int) (short) 10);
        double double84 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray50, doubleArray60, (int) ' ');
        double[] doubleArray89 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray90 = new double[] {};
        double double92 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray89, doubleArray90, 0);
        double double94 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray50, doubleArray90, (-1));
        double double96 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray21, doubleArray50, 1);
        java.lang.Class<?> wildcardClass97 = doubleArray50.getClass();
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
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[221.38186019448963, 364.34654754189563, 1789.0559517170952, 896.632439101549, 5328.628649866165, 2634.3844687894953]");
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
        org.junit.Assert.assertNotNull(doubleArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray75), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray76), "[]");
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + (-1.0d) + "'", double78 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double80 + "' != '" + (-1.0d) + "'", double80 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + 0.0d + "'", double82 == 0.0d);
        org.junit.Assert.assertTrue("'" + double84 + "' != '" + 0.0d + "'", double84 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray89), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray90);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray90), "[]");
        org.junit.Assert.assertTrue("'" + double92 + "' != '" + (-1.0d) + "'", double92 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double94 + "' != '" + Double.POSITIVE_INFINITY + "'", double94 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double96 + "' != '" + 0.0d + "'", double96 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass97);
    }

    @Test
    public void test09131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09131");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(2026.3794624230661d, (double) 157, 1599.2423394953043d, 2740.026060755558d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3010.1631836833194d + "'", double4 == 3010.1631836833194d);
    }

    @Test
    public void test09132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09132");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(415.955006572553d, 2609.9119765229984d, 993.1104853699078d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 711.4260426766625d + "'", double4 == 711.4260426766625d);
    }

    @Test
    public void test09133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09133");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(513.8338591778103d, 468.02478625976096d, 3166.988720473382d, 668.1928114195907d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2657.64132345836d + "'", double4 == 2657.64132345836d);
    }

    @Test
    public void test09134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09134");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(0.0d, 1269.190001179692d, 985.4414441655066d, 1544.589780204923d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1832.171506435053d + "'", double4 == 1832.171506435053d);
    }

    @Test
    public void test09135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09135");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(2574.901931980616d, 1054.9137685793771d, 6474.065541033065d, 385.6725491638043d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4568.404828468021d + "'", double4 == 4568.404828468021d);
    }

    @Test
    public void test09136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09136");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1088.6004472132392d, 3921.9670325046727d, 207.9033026243436d, 935.8370962646457d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 893.8479187647513d + "'", double4 == 893.8479187647513d);
    }

    @Test
    public void test09137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09137");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(5564.414943497599d, 3367.3682759154726d, 499.79951222776896d, 2346.0429517234325d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 6000.687272645768d + "'", double4 == 6000.687272645768d);
    }

    @Test
    public void test09138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09138");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(773.0647599387627d, 727.9250066104931d, 5729.674047879649d, 1282.991063948638d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 5511.675345279031d + "'", double4 == 5511.675345279031d);
    }

    @Test
    public void test09139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09139");
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
        double[] doubleArray35 = new double[] { 232.4213562373095d, (short) 0, 1.0f, 75.85073476263909d, (-1L) };
        double double37 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray27, doubleArray35, (int) (byte) -1);
        double[] doubleArray42 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray43 = new double[] {};
        double double45 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray42, doubleArray43, 0);
        double[] doubleArray50 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray51 = new double[] {};
        double double53 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray50, doubleArray51, 0);
        double double55 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray42, doubleArray51, (int) (short) 100);
        double[] doubleArray58 = new double[] { (byte) 0, 132.0d };
        double double60 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray51, doubleArray58, (int) '4');
        double[] doubleArray62 = new double[] { (short) 0 };
        double[] doubleArray67 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray68 = new double[] {};
        double double70 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray67, doubleArray68, 0);
        double[] doubleArray75 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray76 = new double[] {};
        double double78 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray75, doubleArray76, 0);
        double double80 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray67, doubleArray76, (int) (short) 100);
        double double82 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray62, doubleArray67, 1);
        double double84 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray51, doubleArray67, 26);
        double double86 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray27, doubleArray67, (int) 'a');
        double double88 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray1, doubleArray67, 0);
        java.lang.Class<?> wildcardClass89 = doubleArray67.getClass();
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
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[232.4213562373095, 0.0, 1.0, 75.85073476263909, -1.0]");
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
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[0.0, 132.0]");
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + (-1.0d) + "'", double60 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray62), "[0.0]");
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
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + (-1.0d) + "'", double82 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double84 + "' != '" + (-1.0d) + "'", double84 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double86 + "' != '" + (-1.0d) + "'", double86 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double88 + "' != '" + (-1.0d) + "'", double88 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass89);
    }

    @Test
    public void test09140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09140");
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
        double[] doubleArray34 = new double[] { 221.38186019448963d, 364.34654754189563d, 1789.0559517170952d, 896.632439101549d, 5328.628649866165d, 2634.3844687894953d };
        double double36 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray21, doubleArray34, 137);
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
        double[] doubleArray75 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray76 = new double[] {};
        double double78 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray75, doubleArray76, 0);
        double double80 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray67, doubleArray76, 1);
        double double82 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray60, doubleArray76, (int) (short) 10);
        double double84 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray50, doubleArray60, (int) ' ');
        double[] doubleArray89 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray90 = new double[] {};
        double double92 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray89, doubleArray90, 0);
        double double94 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray50, doubleArray90, (-1));
        double double96 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray21, doubleArray50, 1);
        double[] doubleArray97 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double99 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray21, doubleArray97, 100);
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
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[221.38186019448963, 364.34654754189563, 1789.0559517170952, 896.632439101549, 5328.628649866165, 2634.3844687894953]");
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
        org.junit.Assert.assertNotNull(doubleArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray75), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray76), "[]");
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + (-1.0d) + "'", double78 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double80 + "' != '" + (-1.0d) + "'", double80 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + 0.0d + "'", double82 == 0.0d);
        org.junit.Assert.assertTrue("'" + double84 + "' != '" + 0.0d + "'", double84 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray89), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray90);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray90), "[]");
        org.junit.Assert.assertTrue("'" + double92 + "' != '" + (-1.0d) + "'", double92 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double94 + "' != '" + Double.POSITIVE_INFINITY + "'", double94 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double96 + "' != '" + 0.0d + "'", double96 == 0.0d);
    }

    @Test
    public void test09141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09141");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1218.8409991183232d, 2812.549650455464d, 682.832101952355d, 1802.9490922507239d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1545.6094553707085d + "'", double4 == 1545.6094553707085d);
    }

    @Test
    public void test09142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09142");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(81.25955692602055d, 1750.9155711951876d, 835.1169016492886d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2504.7729159184555d + "'", double4 == 2504.7729159184555d);
    }

    @Test
    public void test09143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09143");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1461.5375422818581d, 669.205282796098d, 1333.1036007329699d, 449.8093480445713d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 347.8298763004149d + "'", double4 == 347.8298763004149d);
    }

    @Test
    public void test09144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09144");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(492.01282170218144d, 923.0475533712627d, 777.3497876142732d, 1539.568024548582d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1085.7205382263344d + "'", double4 == 1085.7205382263344d);
    }

    @Test
    public void test09145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09145");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1516.1051814088135d, 998.1877562866482d, 961.4828858358441d, 1693.787274246288d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1250.2218135326093d + "'", double4 == 1250.2218135326093d);
    }

    @Test
    public void test09146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09146");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(0.0d, 2007.3192863197673d, 1750.8097571232058d, 2267.7839988772057d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2011.2744696806442d + "'", double4 == 2011.2744696806442d);
    }

    @Test
    public void test09147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09147");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1211.5004068235132d, 153.20567590240128d, 1862.5412681104992d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1375.3499332165754d + "'", double4 == 1375.3499332165754d);
    }

    @Test
    public void test09148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09148");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(6141.851274476137d, 4126.6529334796d, 268.19893576279566d, 2465.3597485657783d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 6929.3853793942935d + "'", double4 == 6929.3853793942935d);
    }

    @Test
    public void test09149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09149");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(2750.6403196415104d, 1077.4879725451576d, 613.5466995285793d, 2101.16308835662d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3160.7687359243937d + "'", double4 == 3160.7687359243937d);
    }

    @Test
    public void test09150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09150");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance((double) (-1.0f), 871.2181639675185d, 195.61993583566004d, 857.2744661032689d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 210.5636336999097d + "'", double4 == 210.5636336999097d);
    }

    @Test
    public void test09151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09151");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(424.11412232418536d, 308.20997064862183d, 690.632285925544d, 1772.3693785249543d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1374.3449957716011d + "'", double4 == 1374.3449957716011d);
    }

    @Test
    public void test09152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09152");
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
        double[] doubleArray58 = new double[] { (byte) 0, 132.0d };
        double double60 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray51, doubleArray58, (int) '4');
        double[] doubleArray65 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray66 = new double[] {};
        double double68 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray65, doubleArray66, 0);
        double[] doubleArray73 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray74 = new double[] {};
        double double76 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray73, doubleArray74, 0);
        double double78 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray65, doubleArray74, (int) (short) 100);
        double[] doubleArray83 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray84 = new double[] {};
        double double86 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray83, doubleArray84, 0);
        double double88 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray65, doubleArray83, (int) (byte) 0);
        double double90 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray58, doubleArray65, (int) '4');
        double double92 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray13, doubleArray65, (int) ' ');
        java.lang.Class<?> wildcardClass93 = doubleArray13.getClass();
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
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[0.0, 132.0]");
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + (-1.0d) + "'", double60 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray65), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[]");
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + (-1.0d) + "'", double68 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray73), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray74), "[]");
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + (-1.0d) + "'", double76 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + (-1.0d) + "'", double78 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray83), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray84), "[]");
        org.junit.Assert.assertTrue("'" + double86 + "' != '" + (-1.0d) + "'", double86 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double88 + "' != '" + Double.POSITIVE_INFINITY + "'", double88 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double90 + "' != '" + (-1.0d) + "'", double90 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double92 + "' != '" + (-1.0d) + "'", double92 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass93);
    }

    @Test
    public void test09153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09153");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(3661.657617769359d, 454.00499987500626d, 337.427790680193d, 815.1974480831736d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4376.395713474637d + "'", double4 == 4376.395713474637d);
    }

    @Test
    public void test09154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09154");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(2859.6987879438148d, 1238.7546142208173d, 2440.6299281759552d, 2891.3945286132553d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 420.26578400307386d + "'", double4 == 420.26578400307386d);
    }

    @Test
    public void test09155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09155");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(784.9970752297284d, 476.2789617268681d, 5802.21738524984d, 105.74562271114466d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 5387.753649035834d + "'", double4 == 5387.753649035834d);
    }

    @Test
    public void test09156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09156");
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
        int[] intArray51 = new int[] { 1, 1, 100 };
        int[] intArray53 = new int[] { (byte) -1 };
        int int54 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray51, intArray53);
        int[] intArray57 = new int[] { 'a', 10 };
        int int58 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray53, intArray57);
        int int59 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray44, intArray57);
        int[] intArray63 = new int[] { 1, 1, 100 };
        int[] intArray65 = new int[] { (byte) -1 };
        int int66 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray63, intArray65);
        int[] intArray69 = new int[] { 'a', 10 };
        int int70 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray65, intArray69);
        int[] intArray74 = new int[] { (byte) 1, (short) 1, (short) -1 };
        int int75 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray65, intArray74);
        int[] intArray79 = new int[] { (byte) -1, '#', (-1) };
        int int80 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray65, intArray79);
        int int81 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray44, intArray65);
        int int82 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray24, intArray65);
        java.lang.Class<?> wildcardClass83 = intArray65.getClass();
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
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray51), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray53), "[-1]");
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray57), "[97, 10]");
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
        org.junit.Assert.assertNotNull(intArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray74), "[1, 1, -1]");
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
        org.junit.Assert.assertNotNull(intArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray79), "[-1, 35, -1]");
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + (-1) + "'", int80 == (-1));
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + (-1) + "'", int81 == (-1));
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 0 + "'", int82 == 0);
        org.junit.Assert.assertNotNull(wildcardClass83);
    }

    @Test
    public void test09157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09157");
        int[] intArray0 = null;
        int[] intArray5 = new int[] { 136, ' ', 0, (byte) 0 };
        int[] intArray9 = new int[] { 1, 1, 100 };
        int[] intArray11 = new int[] { (byte) -1 };
        int int12 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray9, intArray11);
        int[] intArray15 = new int[] { 'a', 10 };
        int int16 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray11, intArray15);
        int[] intArray20 = new int[] { (byte) 1, (short) 1, (short) -1 };
        int int21 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray11, intArray20);
        int[] intArray25 = new int[] { 1, 1, 100 };
        int[] intArray27 = new int[] { (byte) -1 };
        int int28 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray25, intArray27);
        int[] intArray32 = new int[] { 1, 1, 100 };
        int[] intArray34 = new int[] { (byte) -1 };
        int int35 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray32, intArray34);
        int[] intArray38 = new int[] { 'a', 10 };
        int int39 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray34, intArray38);
        int[] intArray43 = new int[] { (byte) 1, (short) 1, (short) -1 };
        int int44 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray34, intArray43);
        int int45 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray27, intArray34);
        int[] intArray49 = new int[] { 1, 1, 100 };
        int[] intArray51 = new int[] { (byte) -1 };
        int int52 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray49, intArray51);
        int int53 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray27, intArray49);
        int[] intArray57 = new int[] { 1, 1, 100 };
        int[] intArray59 = new int[] { (byte) -1 };
        int int60 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray57, intArray59);
        int[] intArray63 = new int[] { 'a', 10 };
        int int64 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray59, intArray63);
        int int65 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray27, intArray59);
        int int66 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray20, intArray27);
        int int67 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray5, intArray27);
        // The following exception was thrown during execution in test generation
        try {
            int int68 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray0, intArray27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[136, 32, 0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[1, 1, -1]");
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
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray43), "[1, 1, -1]");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray49), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray51), "[-1]");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray57), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray59), "[-1]");
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray63), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
    }

    @Test
    public void test09158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09158");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(579.9865621659195d, 984.7350979794056d, 1117.4402236439857d, 355.6408158519169d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 582.398018648215d + "'", double4 == 582.398018648215d);
    }

    @Test
    public void test09159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09159");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(943.279124792876d, 1084.160743128407d, 248.3998793528227d, 4710.023177978803d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4320.741680290449d + "'", double4 == 4320.741680290449d);
    }

    @Test
    public void test09160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09160");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(0.0d, 2259.884694984768d, 730.472745289593d, 476.33347371503845d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2514.0239665593226d + "'", double4 == 2514.0239665593226d);
    }

    @Test
    public void test09161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09161");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(776.2644272774396d, 464.69297928283805d, 492.67841315353076d, 915.5928278299326d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 734.4858626710034d + "'", double4 == 734.4858626710034d);
    }

    @Test
    public void test09162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09162");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1474.186498648268d, 248.126381261532d, 2659.7765793007243d, 6492.717281527916d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 5156.672867077386d + "'", double4 == 5156.672867077386d);
    }

    @Test
    public void test09163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09163");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(319.5212270991567d, 0.0d, 516.5821079807387d, 386.8432478352133d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 583.9041287167952d + "'", double4 == 583.9041287167952d);
    }

    @Test
    public void test09164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09164");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1286.838136978442d, 578.8375389186903d, 2504.7729159184555d, 1239.9159397373205d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1879.0131797586437d + "'", double4 == 1879.0131797586437d);
    }

    @Test
    public void test09165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09165");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1901.1255819179382d, 825.3751255731883d, 0.0d, 1162.646774620551d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2039.5169592455443d + "'", double4 == 2039.5169592455443d);
    }

    @Test
    public void test09166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09166");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(0.0d, 2312.181998186525d, 483.149981034691d, 1087.3277405940744d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1189.8384426632201d + "'", double4 == 1189.8384426632201d);
    }

    @Test
    public void test09167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09167");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(822.5426568831847d, 1653.8456073892264d, 1697.7485794538813d, 662.47774618419d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1866.573783775733d + "'", double4 == 1866.573783775733d);
    }

    @Test
    public void test09168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09168");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(3952.1564354464554d, 957.6886780149314d, 1114.6220535613181d, 1522.9631008522388d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3735.315465287669d + "'", double4 == 3735.315465287669d);
    }

    @Test
    public void test09169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09169");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(682.4365105072902d, 0.0d, 713.7119802893501d, 2088.1419456483327d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2119.417415430393d + "'", double4 == 2119.417415430393d);
    }

    @Test
    public void test09170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09170");
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
        double[] doubleArray39 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray40 = new double[] {};
        double double42 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray39, doubleArray40, 0);
        double double44 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray31, doubleArray40, 1);
        double double46 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray24, doubleArray40, (int) (short) 10);
        double double48 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray14, doubleArray24, (int) ' ');
        double[] doubleArray53 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray54 = new double[] {};
        double double56 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray53, doubleArray54, 0);
        double[] doubleArray61 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray62 = new double[] {};
        double double64 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray61, doubleArray62, 0);
        double double66 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray54, doubleArray62, (int) (byte) 1);
        double double68 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray14, doubleArray62, 72);
        double[] doubleArray73 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray74 = new double[] {};
        double double76 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray73, doubleArray74, 0);
        double[] doubleArray81 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray82 = new double[] {};
        double double84 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray81, doubleArray82, 0);
        double double86 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray73, doubleArray82, 1);
        double double88 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray14, doubleArray73, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            double double90 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray0, doubleArray14, 137);
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
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[]");
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + (-1.0d) + "'", double42 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + (-1.0d) + "'", double44 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.0d + "'", double46 == 0.0d);
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
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 0.0d + "'", double66 == 0.0d);
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
        org.junit.Assert.assertTrue("'" + double88 + "' != '" + (-1.0d) + "'", double88 == (-1.0d));
    }

    @Test
    public void test09171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09171");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(132.09525866090112d, 0.0d, 737.3969134774696d, 1468.9126065593966d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2074.214261375965d + "'", double4 == 2074.214261375965d);
    }

    @Test
    public void test09172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09172");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(757.1684869401565d, 1262.9959356743564d, 240.02878170815336d, 2698.79941054778d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2009.3193171412145d + "'", double4 == 2009.3193171412145d);
    }

    @Test
    public void test09173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09173");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1240.073827582351d, 554.0360052988086d, 398.2548271112235d, 1488.7546449286797d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 877.7820791462117d + "'", double4 == 877.7820791462117d);
    }

    @Test
    public void test09174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09174");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1956.0610505372244d, 806.6492081870565d, 1626.0277133652694d, 753.9308874361723d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 382.7516579228393d + "'", double4 == 382.7516579228393d);
    }

    @Test
    public void test09175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09175");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(161.27348629222328d, 200.90336088855406d, 3583.5966182809866d, 1811.6274415144944d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 5033.047212614703d + "'", double4 == 5033.047212614703d);
    }

    @Test
    public void test09176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09176");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(615.5047282607248d, 567.3390230270919d, 1697.2899362799615d, 1618.6455167533122d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1475.3137557234234d + "'", double4 == 1475.3137557234234d);
    }

    @Test
    public void test09177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09177");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1967.6958543083538d, 219.28006090636217d, 1607.4147938593312d, 4114.532106858425d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4255.533106401086d + "'", double4 == 4255.533106401086d);
    }

    @Test
    public void test09178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09178");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(79.45141512783117d, 477.1715808752443d, 0.0d, 1638.62679795206d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1561.1983864233578d + "'", double4 == 1561.1983864233578d);
    }

    @Test
    public void test09179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09179");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1024.4480608974482d, 1599.2423394953043d, 456.0113736479015d, 4265.42820718214d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3290.4517282620604d + "'", double4 == 3290.4517282620604d);
    }

    @Test
    public void test09180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09180");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(2224.111073288348d, 25.77738995443042d, 4262.628459203883d, 702.3037359722722d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2543.904617824526d + "'", double4 == 2543.904617824526d);
    }

    @Test
    public void test09181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09181");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance((double) (short) 0, 202.70803514327267d, 859.2036884402513d, 457.7624358107439d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1114.2580891077225d + "'", double4 == 1114.2580891077225d);
    }

    @Test
    public void test09182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09182");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(3121.2384170008627d, 332.8889793328518d, 0.0d, 897.4342087367569d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3832.4188722600766d + "'", double4 == 3832.4188722600766d);
    }

    @Test
    public void test09183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09183");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(0.0d, 1262.2848394186638d, 1057.4275167079888d, 497.1944702364713d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1168.4841865960143d + "'", double4 == 1168.4841865960143d);
    }

    @Test
    public void test09184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09184");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(572.5810921143236d, 348.8122642567162d, 329.99769364124467d, 77.75783953427879d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 551.0868865330071d + "'", double4 == 551.0868865330071d);
    }

    @Test
    public void test09185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09185");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(900.4707772304074d, 0.0d, (double) (byte) 10, 991.9071844518359d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 895.1529599274578d + "'", double4 == 895.1529599274578d);
    }

    @Test
    public void test09186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09186");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1433.713182952143d, 2338.630616536364d, 1130.6933158635497d, 1465.83825814786d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 304.71800128433364d + "'", double4 == 304.71800128433364d);
    }

    @Test
    public void test09187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09187");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(843.7240123150117d, 0.0d, 1943.694419421311d, 473.87268540301864d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1160.4847696235224d + "'", double4 == 1160.4847696235224d);
    }

    @Test
    public void test09188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09188");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(812.3735764895694d, 1135.1586081280889d, 1033.1842351160642d, 150.40770846134703d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 697.822439734797d + "'", double4 == 697.822439734797d);
    }

    @Test
    public void test09189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09189");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1259.7457471855314d, 612.084721172372d, 319.6699687996772d, 607.5198653350744d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1144.1770274146286d + "'", double4 == 1144.1770274146286d);
    }

    @Test
    public void test09190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09190");
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
        double[] doubleArray63 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray64 = new double[] {};
        double double66 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray63, doubleArray64, 0);
        double[] doubleArray72 = new double[] { 232.4213562373095d, (short) 0, 1.0f, 75.85073476263909d, (-1L) };
        double double74 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray64, doubleArray72, (int) (byte) -1);
        double double76 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray14, doubleArray64, (int) ' ');
        double[] doubleArray81 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray82 = new double[] {};
        double double84 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray81, doubleArray82, 0);
        double[] doubleArray90 = new double[] { 232.4213562373095d, (short) 0, 1.0f, 75.85073476263909d, (-1L) };
        double double92 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray82, doubleArray90, (int) (byte) -1);
        double double94 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray64, doubleArray90, 26);
        // The following exception was thrown during execution in test generation
        try {
            double double96 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray0, doubleArray90, (int) ' ');
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[]");
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + (-1.0d) + "'", double66 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray72), "[232.4213562373095, 0.0, 1.0, 75.85073476263909, -1.0]");
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + (-1.0d) + "'", double74 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 0.0d + "'", double76 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray81), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray82), "[]");
        org.junit.Assert.assertTrue("'" + double84 + "' != '" + (-1.0d) + "'", double84 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray90);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray90), "[232.4213562373095, 0.0, 1.0, 75.85073476263909, -1.0]");
        org.junit.Assert.assertTrue("'" + double92 + "' != '" + (-1.0d) + "'", double92 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double94 + "' != '" + (-1.0d) + "'", double94 == (-1.0d));
    }

    @Test
    public void test09191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09191");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(957.163193451578d, 532.854980327507d, 2720.184064082162d, 1838.4848057116062d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3068.650696014683d + "'", double4 == 3068.650696014683d);
    }

    @Test
    public void test09192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09192");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(786.310466018661d, 877.4483706677477d, 1331.5145034609707d, 1579.2399598326074d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 962.2809488935321d + "'", double4 == 962.2809488935321d);
    }

    @Test
    public void test09193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09193");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(2336.1522128651577d, 1789.0559517170952d, 1104.826261152225d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2640.789798722445d + "'", double4 == 2640.789798722445d);
    }

    @Test
    public void test09194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09194");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(190.74955676815085d, 1817.4440666527125d, 1004.2239698727009d, 1792.2382640464227d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 838.6802157108398d + "'", double4 == 838.6802157108398d);
    }

    @Test
    public void test09195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09195");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1436.3404426358663d, 367.9531034650794d, 1117.0694893632d, 2520.200507853767d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1129.9055635661718d + "'", double4 == 1129.9055635661718d);
    }

    @Test
    public void test09196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09196");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(131.5806625907118d, 1327.0761683202525d, 0.0d, 424.7766846973143d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 321.36797934291167d + "'", double4 == 321.36797934291167d);
    }

    @Test
    public void test09197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09197");
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
        double[] doubleArray68 = new double[] { 378.87782726636954d, 980.0815111745515d };
        double double70 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray61, doubleArray68, (int) (short) 0);
        double double72 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray4, doubleArray68, 100);
        java.lang.Class<?> wildcardClass73 = doubleArray68.getClass();
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
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray68), "[378.87782726636954, 980.0815111745515]");
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + (-1.0d) + "'", double70 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + (-1.0d) + "'", double72 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass73);
    }

    @Test
    public void test09198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09198");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(2487.110773776511d, 0.0d, 1238.5333366832397d, 530.7253394567465d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1779.3027765500178d + "'", double4 == 1779.3027765500178d);
    }

    @Test
    public void test09199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09199");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(2637.7084219110284d, 186.29062043987966d, 0.0d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3730.28302385231d + "'", double4 == 3730.28302385231d);
    }

    @Test
    public void test09200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09200");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1395.1380556916986d, 1390.5887209367127d, 1020.8620017552486d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1764.8647748731628d + "'", double4 == 1764.8647748731628d);
    }

    @Test
    public void test09201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09201");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1756.7292415146644d, 2455.757938577531d, 1461.2128417750914d, 1053.7260711374968d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1697.5482671796074d + "'", double4 == 1697.5482671796074d);
    }

    @Test
    public void test09202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09202");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(623.1417856833672d, 0.0d, 5328.628649866165d, 680.7592365609005d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 5386.246100743699d + "'", double4 == 5386.246100743699d);
    }

    @Test
    public void test09203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09203");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(224.76550746286068d, 171.6243955330728d, 3333.744814787238d, 4986.60108100395d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 7923.955992795254d + "'", double4 == 7923.955992795254d);
    }

    @Test
    public void test09204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09204");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(564.2721358127096d, 0.0d, 476.4278225087196d, 2293.073839008447d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2380.918152312437d + "'", double4 == 2380.918152312437d);
    }

    @Test
    public void test09205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09205");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(2416.605715429033d, 768.3743227008079d, 675.735493822986d, 1308.234079976021d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2280.7299788812597d + "'", double4 == 2280.7299788812597d);
    }

    @Test
    public void test09206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09206");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1324.3259076389868d, 1104.1766048460413d, 774.0897884912134d, 461.52306304116587d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1192.8896609526487d + "'", double4 == 1192.8896609526487d);
    }

    @Test
    public void test09207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09207");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(95.406133416423d, 3403.917226921266d, 2170.47752829324d, 1709.5723634010897d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3769.4162583969933d + "'", double4 == 3769.4162583969933d);
    }

    @Test
    public void test09208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09208");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(175.73968350130355d, 3676.6967827270096d, 603.3074996188053d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4104.264598844511d + "'", double4 == 4104.264598844511d);
    }

    @Test
    public void test09209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09209");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1500.5598182938043d, 3181.9032075439895d, 0.0d, 3293.5719229744873d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1612.228533724302d + "'", double4 == 1612.228533724302d);
    }

    @Test
    public void test09210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09210");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(535.8788384307745d, 2810.657888018847d, 876.2158522624918d, 1405.4755521950324d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 933.8242487607007d + "'", double4 == 933.8242487607007d);
    }

    @Test
    public void test09211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09211");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(988.5078734431651d, 0.0d, 96.97872581617344d, 1487.5038290332905d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1021.6756749398571d + "'", double4 == 1021.6756749398571d);
    }

    @Test
    public void test09212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09212");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1108.4899415251407d, 1289.4584518548806d, 0.0d, 798.048088330784d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1599.9003050492374d + "'", double4 == 1599.9003050492374d);
    }

    @Test
    public void test09213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09213");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(0.0d, 392.4748348031439d, 898.7061902540354d, 632.9603820390164d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1099.2323055805357d + "'", double4 == 1099.2323055805357d);
    }

    @Test
    public void test09214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09214");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(0.0d, 507.1142497504701d, 672.6788023428246d, 1817.4440666527125d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1937.9369717646978d + "'", double4 == 1937.9369717646978d);
    }

    @Test
    public void test09215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09215");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(626.2527251290963d, 546.7655902097462d, 340.4421739578686d, 984.2335746468543d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 458.08073500449314d + "'", double4 == 458.08073500449314d);
    }

    @Test
    public void test09216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09216");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1761.1869766235334d, 561.2648143618683d, 5170.74555137657d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3837.560324125251d + "'", double4 == 3837.560324125251d);
    }

    @Test
    public void test09217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09217");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(230.66542913617204d, 444.1316684850466d, 877.7040025535117d, 625.6564411301682d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 828.5633460624613d + "'", double4 == 828.5633460624613d);
    }

    @Test
    public void test09218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09218");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(592.9366778909589d, 4007.0655384628067d, 251.12978742411298d, 632.3899450763809d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3716.482483853272d + "'", double4 == 3716.482483853272d);
    }

    @Test
    public void test09219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09219");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(583.9470564450097d, 373.44890145037124d, 1470.8397935697385d, 1157.288178707074d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1056.0770661468398d + "'", double4 == 1056.0770661468398d);
    }

    @Test
    public void test09220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09220");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(303.55520304099946d, 1798.5358107378138d, 0.0d, 928.1684016400267d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 694.4691563758395d + "'", double4 == 694.4691563758395d);
    }

    @Test
    public void test09221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09221");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(614.7565849610603d, 2482.6575303702894d, 613.2225946703197d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 614.7584988263256d + "'", double4 == 614.7584988263256d);
    }

    @Test
    public void test09222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09222");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1189.2434628753945d, 557.2923477519955d, 683.8176537884021d, 1482.216231314826d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 584.1988458892276d + "'", double4 == 584.1988458892276d);
    }

    @Test
    public void test09223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09223");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1993.8546560413429d, 274.60590126126715d, 1166.7884814990175d, 934.6872967421768d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1487.147570023235d + "'", double4 == 1487.147570023235d);
    }

    @Test
    public void test09224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09224");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1905.2042033183961d, 223.31249474929078d, 497.6952949381995d, 733.1718350049796d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1831.5952608433909d + "'", double4 == 1831.5952608433909d);
    }

    @Test
    public void test09225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09225");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1929.1707615310613d, 1444.67637238831d, 741.9061120174771d, 221.47798505250438d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2079.8586410671414d + "'", double4 == 2079.8586410671414d);
    }

    @Test
    public void test09226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09226");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(254.8256188575748d, 1647.8259552977831d, 2718.4138276026733d, 243.24025375080168d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3868.17391029208d + "'", double4 == 3868.17391029208d);
    }

    @Test
    public void test09227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09227");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(324.87536071545964d, 1026.1396300310848d, 1158.2910843011919d, 970.617388611097d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1054.307609244427d + "'", double4 == 1054.307609244427d);
    }

    @Test
    public void test09228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09228");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(533.7054029724968d, 3050.9068149618993d, 2944.4139862915267d, 875.8276310880376d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4585.787767192891d + "'", double4 == 4585.787767192891d);
    }

    @Test
    public void test09229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09229");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(155.2389314063153d, 1392.0681707335123d, 816.446945574594d, 1153.0766099954212d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1197.02801588453d + "'", double4 == 1197.02801588453d);
    }

    @Test
    public void test09230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09230");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(56.663153648904114d, 609.9403408366832d, 1383.9518231925686d, 2818.2341148988494d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3535.582443605831d + "'", double4 == 3535.582443605831d);
    }

    @Test
    public void test09231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09231");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(825.8447855853702d, 1327.2489971412958d, 4576.90970731603d, 485.6155795664205d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3766.4630569894784d + "'", double4 == 3766.4630569894784d);
    }

    @Test
    public void test09232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09232");
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
        int[] intArray33 = new int[] { 1, 1, 100 };
        int[] intArray35 = new int[] { (byte) -1 };
        int int36 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray33, intArray35);
        int[] intArray40 = new int[] { 1, 1, 100 };
        int[] intArray42 = new int[] { (byte) -1 };
        int int43 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray40, intArray42);
        int[] intArray46 = new int[] { 'a', 10 };
        int int47 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray42, intArray46);
        int int48 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray33, intArray46);
        int int49 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray24, intArray33);
        int[] intArray53 = new int[] { 1, 1, 100 };
        int[] intArray55 = new int[] { (byte) -1 };
        int int56 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray53, intArray55);
        int[] intArray60 = new int[] { 1, 1, 100 };
        int[] intArray62 = new int[] { (byte) -1 };
        int int63 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray60, intArray62);
        int[] intArray66 = new int[] { 'a', 10 };
        int int67 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray62, intArray66);
        int int68 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray53, intArray66);
        int int69 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray24, intArray66);
        int int70 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray16, intArray24);
        int[] intArray74 = new int[] { 1, 1, 100 };
        int[] intArray76 = new int[] { (byte) -1 };
        int int77 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray74, intArray76);
        int[] intArray80 = new int[] { 'a', 10 };
        int int81 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray76, intArray80);
        int[] intArray85 = new int[] { (byte) 1, (short) 1, (short) -1 };
        int int86 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray76, intArray85);
        int[] intArray90 = new int[] { (byte) -1, '#', (-1) };
        int int91 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray76, intArray90);
        int int92 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray16, intArray90);
        java.lang.Class<?> wildcardClass93 = intArray16.getClass();
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[-1]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[-1]");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray53), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray55), "[-1]");
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray60), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray62), "[-1]");
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertNotNull(intArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray66), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
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
        org.junit.Assert.assertNotNull(wildcardClass93);
    }

    @Test
    public void test09233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09233");
        double[] doubleArray0 = null;
        double[] doubleArray5 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray6 = new double[] {};
        double double8 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray5, doubleArray6, 0);
        double[] doubleArray13 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray14 = new double[] {};
        double double16 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray13, doubleArray14, 0);
        double double18 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray6, doubleArray14, (int) (byte) 1);
        double[] doubleArray21 = new double[] { 378.87782726636954d, 980.0815111745515d };
        double double23 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray14, doubleArray21, (int) (short) 0);
        double[] doubleArray28 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray29 = new double[] {};
        double double31 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray28, doubleArray29, 0);
        double[] doubleArray36 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray37 = new double[] {};
        double double39 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray36, doubleArray37, 0);
        double double41 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray28, doubleArray37, (int) (short) 100);
        double[] doubleArray44 = new double[] { (byte) 0, 132.0d };
        double double46 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray37, doubleArray44, (int) '4');
        double[] doubleArray51 = new double[] { 149.99500012499374d, Double.POSITIVE_INFINITY, 10, (byte) 100 };
        double double53 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray44, doubleArray51, (int) (byte) 0);
        double double55 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray21, doubleArray51, 0);
        // The following exception was thrown during execution in test generation
        try {
            double double57 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray0, doubleArray21, 157);
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
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[378.87782726636954, 980.0815111745515]");
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[149.99500012499374, Infinity, 10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + (-1.0d) + "'", double53 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + (-1.0d) + "'", double55 == (-1.0d));
    }

    @Test
    public void test09234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09234");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(369.1449181830311d, 1037.2782600053122d, 447.974228995891d, 1085.9203536169716d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 127.47140442451933d + "'", double4 == 127.47140442451933d);
    }

    @Test
    public void test09235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09235");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1404.638872040181d, 334.107056414923d, 1045.5242291972786d, 1331.809401837636d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 366.4252426268812d + "'", double4 == 366.4252426268812d);
    }

    @Test
    public void test09236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09236");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(400.8353938531051d, 0.0d, 366.4252426268812d, 2335.5873360927653d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1935.0579155434987d + "'", double4 == 1935.0579155434987d);
    }

    @Test
    public void test09237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09237");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(171.5644349530363d, 510.01223202071355d, 683.69440589555d, 1225.1931765785173d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1227.3109155003174d + "'", double4 == 1227.3109155003174d);
    }

    @Test
    public void test09238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09238");
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
        int[] intArray57 = new int[] { (byte) -1, (short) -1, ' ' };
        int[] intArray61 = new int[] { 1, 1, 100 };
        int[] intArray63 = new int[] { (byte) -1 };
        int int64 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray61, intArray63);
        int int65 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray57, intArray61);
        int int66 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray28, intArray57);
        int int67 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray21, intArray28);
        int[] intArray71 = new int[] { 1, 1, 100 };
        int[] intArray73 = new int[] { (byte) -1 };
        int int74 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray71, intArray73);
        int[] intArray77 = new int[] { 'a', 10 };
        int int78 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray73, intArray77);
        int int79 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray28, intArray73);
        int int80 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray3, intArray28);
        java.lang.Class<?> wildcardClass81 = intArray28.getClass();
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
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray57), "[-1, -1, 32]");
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray61), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray63), "[-1]");
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 72 + "'", int65 == 72);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertNotNull(intArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray71), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray73), "[-1]");
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
        org.junit.Assert.assertNotNull(intArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray77), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + (-1) + "'", int80 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass81);
    }

    @Test
    public void test09239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09239");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1757.265542160299d, 1006.5396254951654d, 402.20995176251364d, 114.61486138519422d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2129.4311240608854d + "'", double4 == 2129.4311240608854d);
    }

    @Test
    public void test09240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09240");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(480.56201986901675d, 1073.999438850761d, 4041.3260499355197d, 652.9697596017761d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3981.793709315488d + "'", double4 == 3981.793709315488d);
    }

    @Test
    public void test09241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09241");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(3435.252021644794d, (double) 10L, 874.1663920834051d, 2153.4282020093906d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4704.513831570779d + "'", double4 == 4704.513831570779d);
    }

    @Test
    public void test09242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09242");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(266.09479742842706d, 2326.316486133129d, 106.68198585867175d, 1258.5929352088506d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1227.1363624940336d + "'", double4 == 1227.1363624940336d);
    }

    @Test
    public void test09243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09243");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1205.0138577584069d, 1074.9072225929112d, 911.6483191324794d, 356.89207628956126d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 897.4262618483865d + "'", double4 == 897.4262618483865d);
    }

    @Test
    public void test09244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09244");
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
        double[] doubleArray36 = new double[] { (byte) 0, 132.0d };
        double double38 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray29, doubleArray36, (int) '4');
        double[] doubleArray40 = new double[] { (short) 0 };
        double[] doubleArray45 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray46 = new double[] {};
        double double48 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray45, doubleArray46, 0);
        double[] doubleArray53 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray54 = new double[] {};
        double double56 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray53, doubleArray54, 0);
        double double58 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray45, doubleArray54, (int) (short) 100);
        double double60 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray40, doubleArray45, 1);
        double double62 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray29, doubleArray45, 26);
        double double64 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray5, doubleArray45, (int) 'a');
        double[] doubleArray69 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray70 = new double[] {};
        double double72 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray69, doubleArray70, 0);
        double[] doubleArray77 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray78 = new double[] {};
        double double80 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray77, doubleArray78, 0);
        double[] doubleArray85 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray86 = new double[] {};
        double double88 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray85, doubleArray86, 0);
        double double90 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray77, doubleArray86, 1);
        double double92 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray70, doubleArray77, (int) ' ');
        double double94 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray5, doubleArray77, (int) (byte) 0);
        double[] doubleArray95 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double97 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray77, doubleArray95, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"p2\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[0.0, 132.0]");
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + (-1.0d) + "'", double38 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[0.0]");
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
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + (-1.0d) + "'", double60 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + (-1.0d) + "'", double62 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + (-1.0d) + "'", double64 == (-1.0d));
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
        org.junit.Assert.assertNotNull(doubleArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray85), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray86), "[]");
        org.junit.Assert.assertTrue("'" + double88 + "' != '" + (-1.0d) + "'", double88 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double90 + "' != '" + (-1.0d) + "'", double90 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double92 + "' != '" + (-1.0d) + "'", double92 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double94 + "' != '" + (-1.0d) + "'", double94 == (-1.0d));
    }

    @Test
    public void test09245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09245");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(106.42401020861638d, 640.1169791593887d, 728.2700485391184d, 2089.8672882243186d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2078.6389134462515d + "'", double4 == 2078.6389134462515d);
    }

    @Test
    public void test09246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09246");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(0.0d, 614.7280538289306d, 2112.850446376681d, 2227.5550258835465d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3725.6774184312967d + "'", double4 == 3725.6774184312967d);
    }

    @Test
    public void test09247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09247");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(715.5946028369693d, 1308.234079976021d, 465.7651970635461d, 503.1699525014984d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 327.9313404651175d + "'", double4 == 327.9313404651175d);
    }

    @Test
    public void test09248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09248");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1667.4102109828045d, 879.8033576502743d, 767.8895161970873d, 2320.629327205265d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1111.680122223219d + "'", double4 == 1111.680122223219d);
    }

    @Test
    public void test09249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09249");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(2290.3198711346527d, 872.8412118524546d, 927.2986500922708d, 1259.7457471855314d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1749.9257563754586d + "'", double4 == 1749.9257563754586d);
    }

    @Test
    public void test09250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09250");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(623.1417856833672d, 329.218801971312d, 1346.827358548423d, 1669.508043666988d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1272.2433549520586d + "'", double4 == 1272.2433549520586d);
    }

    @Test
    public void test09251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09251");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(2284.5310672163246d, 456.95497716611834d, 1581.8189823498528d, 1329.120027421337d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1186.007811601392d + "'", double4 == 1186.007811601392d);
    }

    @Test
    public void test09252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09252");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(448.5118411552872d, 308.20997064862183d, 1800.9415871980934d, 2374.5234609985714d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3418.7432363927555d + "'", double4 == 3418.7432363927555d);
    }

    @Test
    public void test09253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09253");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1963.1420348997674d, 1462.4039657972235d, 689.1681565760733d, 815.1974480831736d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1714.8720701710183d + "'", double4 == 1714.8720701710183d);
    }

    @Test
    public void test09254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09254");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(731.0416687290287d, 1167.7359566487628d, 630.521265834824d, 286.88848007544675d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 455.38599713776625d + "'", double4 == 455.38599713776625d);
    }

    @Test
    public void test09255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09255");
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
        double double65 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray52, doubleArray61, (int) (short) 100);
        double double67 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray40, doubleArray61, (int) (short) 100);
        java.lang.Class<?> wildcardClass68 = doubleArray61.getClass();
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
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + (-1.0d) + "'", double65 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + (-1.0d) + "'", double67 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass68);
    }

    @Test
    public void test09256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09256");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(721.8423136804416d, 2244.8764906742254d, 846.7695593308263d, 915.296008925963d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 230.28492983679715d + "'", double4 == 230.28492983679715d);
    }

    @Test
    public void test09257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09257");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1054.9024297095775d, 246.82277442365907d, 0.0d, 737.9337555965523d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1546.0134108824707d + "'", double4 == 1546.0134108824707d);
    }

    @Test
    public void test09258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09258");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1384.0431932814745d, 1915.2171449349437d, 2579.8325137503043d, 2530.2933134316854d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1656.4424037350886d + "'", double4 == 1656.4424037350886d);
    }

    @Test
    public void test09259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09259");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(2182.5517506338774d, 1950.8694433880958d, 790.3773810106355d, 3143.3273252643467d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1691.51978417114d + "'", double4 == 1691.51978417114d);
    }

    @Test
    public void test09260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09260");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(482.7855959125905d, 1477.2731274949908d, 788.5525238738398d, 5638.766420060318d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4467.260220526576d + "'", double4 == 4467.260220526576d);
    }

    @Test
    public void test09261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09261");
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
        java.lang.Class<?> wildcardClass99 = intArray89.getClass();
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
    public void test09262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09262");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(518.7150125837679d, 1383.697169608285d, 681.7255943446476d, 383.36776538226263d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1163.339985986902d + "'", double4 == 1163.339985986902d);
    }

    @Test
    public void test09263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09263");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(702.8723296288329d, 1451.4732522268157d, 460.18501664010336d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1694.1605652155451d + "'", double4 == 1694.1605652155451d);
    }

    @Test
    public void test09264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09264");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(159.05694319825284d, 424.99846035718303d, 6492.717281527916d, 308.0245929034511d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 6335.411955191937d + "'", double4 == 6335.411955191937d);
    }

    @Test
    public void test09265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09265");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(145.04728234672646d, 1759.3791676704761d, 620.3996598056506d, 3116.630076362142d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1832.60328615059d + "'", double4 == 1832.60328615059d);
    }

    @Test
    public void test09266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09266");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(661.4131499811785d, 1257.6193052202998d, 3460.079344794912d, 1528.5405449314248d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3069.5874345248585d + "'", double4 == 3069.5874345248585d);
    }

    @Test
    public void test09267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09267");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(636.5834861894493d, 439.40340754804583d, 1323.0790153317653d, 833.2475495931513d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 714.1098412477199d + "'", double4 == 714.1098412477199d);
    }

    @Test
    public void test09268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09268");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(714.6591946188307d, 1681.7577294703485d, 1274.8122713879661d, 1831.5952608433909d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 709.9906081421777d + "'", double4 == 709.9906081421777d);
    }

    @Test
    public void test09269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09269");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1339.0603294247537d, 1403.1739296930293d, 456.622934142084d, 901.244519413915d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1384.366805561784d + "'", double4 == 1384.366805561784d);
    }

    @Test
    public void test09270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09270");
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
        java.lang.Class<?> wildcardClass47 = doubleArray20.getClass();
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
    public void test09271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09271");
        int[] intArray0 = null;
        int[] intArray5 = new int[] { 100, 136, 215, 69 };
        int[] intArray9 = new int[] { (byte) -1, (short) -1, ' ' };
        int[] intArray13 = new int[] { 1, 1, 100 };
        int[] intArray15 = new int[] { (byte) -1 };
        int int16 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray13, intArray15);
        int int17 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray9, intArray13);
        int[] intArray21 = new int[] { 1, 1, 100 };
        int[] intArray23 = new int[] { (byte) -1 };
        int int24 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray21, intArray23);
        int[] intArray27 = new int[] { 'a', 10 };
        int int28 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray23, intArray27);
        int[] intArray32 = new int[] { 1, 1, 100 };
        int[] intArray34 = new int[] { (byte) -1 };
        int int35 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray32, intArray34);
        int[] intArray39 = new int[] { 1, 1, 100 };
        int[] intArray41 = new int[] { (byte) -1 };
        int int42 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray39, intArray41);
        int[] intArray45 = new int[] { 'a', 10 };
        int int46 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray41, intArray45);
        int int47 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray32, intArray45);
        int int48 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray23, intArray45);
        int int49 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray13, intArray23);
        int int50 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray5, intArray23);
        int[] intArray54 = new int[] { 1, 1, 100 };
        int[] intArray56 = new int[] { (byte) -1 };
        int int57 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray54, intArray56);
        int[] intArray61 = new int[] { 1, 1, 100 };
        int[] intArray63 = new int[] { (byte) -1 };
        int int64 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray61, intArray63);
        int[] intArray67 = new int[] { 'a', 10 };
        int int68 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray63, intArray67);
        int[] intArray72 = new int[] { (byte) 1, (short) 1, (short) -1 };
        int int73 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray63, intArray72);
        int int74 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray56, intArray63);
        int[] intArray78 = new int[] { 1, 1, 100 };
        int[] intArray80 = new int[] { (byte) -1 };
        int int81 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray78, intArray80);
        int int82 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray56, intArray78);
        int[] intArray86 = new int[] { 1, 1, 100 };
        int[] intArray88 = new int[] { (byte) -1 };
        int int89 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray86, intArray88);
        int[] intArray92 = new int[] { 'a', 10 };
        int int93 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray88, intArray92);
        int int94 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray56, intArray88);
        int int95 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray23, intArray88);
        // The following exception was thrown during execution in test generation
        try {
            int int96 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray0, intArray88);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 136, 215, 69]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, -1, 32]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 72 + "'", int17 == 72);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[-1]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[-1]");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[-1]");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray45), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
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
        org.junit.Assert.assertNotNull(intArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray72), "[1, 1, -1]");
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertNotNull(intArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray78), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray80), "[-1]");
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + (-1) + "'", int81 == (-1));
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + (-1) + "'", int82 == (-1));
        org.junit.Assert.assertNotNull(intArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray86), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray88);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray88), "[-1]");
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + (-1) + "'", int89 == (-1));
        org.junit.Assert.assertNotNull(intArray92);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray92), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + (-1) + "'", int93 == (-1));
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 0 + "'", int94 == 0);
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + 0 + "'", int95 == 0);
    }

    @Test
    public void test09272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09272");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(829.6926964153299d, 1801.9366080212849d, 1708.5085390970207d, 414.9928990907574d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2265.7595516122183d + "'", double4 == 2265.7595516122183d);
    }

    @Test
    public void test09273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09273");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(481.0121838635333d, 836.1268472185388d, 0.0d, 771.6423339540825d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 545.4966971279897d + "'", double4 == 545.4966971279897d);
    }

    @Test
    public void test09274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09274");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(807.2960475388851d, 1135.6124514136184d, 1286.2257443602266d, 1095.4592052939295d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 519.0829429410304d + "'", double4 == 519.0829429410304d);
    }

    @Test
    public void test09275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09275");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(774.1563488351445d, 4541.831446352233d, 1631.5790064020466d, 774.0897884912134d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 857.4226601503884d + "'", double4 == 857.4226601503884d);
    }

    @Test
    public void test09276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09276");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(452.39034597224276d, 512.5463828234233d, 828.4960160853518d, 915.0333471769723d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 778.592634466658d + "'", double4 == 778.592634466658d);
    }

    @Test
    public void test09277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09277");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(340.1389565506388d, 2032.743161981d, 0.0d, 614.6324374476843d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 437.0825789462834d + "'", double4 == 437.0825789462834d);
    }

    @Test
    public void test09278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09278");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(351.7317554491893d, 446.615323216948d, 638.2978612727459d, 1735.0941205895042d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1412.7319513246255d + "'", double4 == 1412.7319513246255d);
    }

    @Test
    public void test09279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09279");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(751.0563160871548d, 348.18830717902813d, 1452.245692126995d, 982.2432624389727d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 738.3183224291665d + "'", double4 == 738.3183224291665d);
    }

    @Test
    public void test09280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09280");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1968.2950920149742d, 682.3077444030058d, 457.8098653414465d, 1013.4539254241257d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1786.9771328742713d + "'", double4 == 1786.9771328742713d);
    }

    @Test
    public void test09281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09281");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1750.9175000630846d, 2582.9185785297154d, 489.6844797215029d, 2420.428990198968d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1427.9195940331936d + "'", double4 == 1427.9195940331936d);
    }

    @Test
    public void test09282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09282");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(293.6673919614228d, 893.8479187647513d, 454.12565181325886d, 754.3488126505918d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 487.8260187022319d + "'", double4 == 487.8260187022319d);
    }

    @Test
    public void test09283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09283");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1457.1154065022358d, 456.7311515485347d, 914.2930275299476d, 908.1316486297369d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 772.0358162164143d + "'", double4 == 772.0358162164143d);
    }

    @Test
    public void test09284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09284");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(4807.177973699161d, 1820.3574553715514d, 704.8977144889124d, 3822.2116379090708d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4218.869754773885d + "'", double4 == 4218.869754773885d);
    }

    @Test
    public void test09285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09285");
        int[] intArray4 = new int[] { 100, 136, 215, 69 };
        int[] intArray8 = new int[] { (byte) -1, (short) -1, ' ' };
        int[] intArray12 = new int[] { 1, 1, 100 };
        int[] intArray14 = new int[] { (byte) -1 };
        int int15 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray12, intArray14);
        int int16 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray8, intArray12);
        int[] intArray20 = new int[] { 1, 1, 100 };
        int[] intArray22 = new int[] { (byte) -1 };
        int int23 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray20, intArray22);
        int[] intArray26 = new int[] { 'a', 10 };
        int int27 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray22, intArray26);
        int[] intArray31 = new int[] { 1, 1, 100 };
        int[] intArray33 = new int[] { (byte) -1 };
        int int34 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray31, intArray33);
        int[] intArray38 = new int[] { 1, 1, 100 };
        int[] intArray40 = new int[] { (byte) -1 };
        int int41 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray38, intArray40);
        int[] intArray44 = new int[] { 'a', 10 };
        int int45 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray40, intArray44);
        int int46 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray31, intArray44);
        int int47 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray22, intArray44);
        int int48 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray12, intArray22);
        int int49 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray4, intArray22);
        int[] intArray53 = new int[] { 1, 1, 100 };
        int[] intArray55 = new int[] { (byte) -1 };
        int int56 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray53, intArray55);
        int[] intArray59 = new int[] { 'a', 10 };
        int int60 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray55, intArray59);
        int int61 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray4, intArray59);
        int[] intArray62 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int63 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray4, intArray62);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 136, 215, 69]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1, 32]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 72 + "'", int16 == 72);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[-1]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[97, 10]");
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
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
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
    }

    @Test
    public void test09286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09286");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(101.0d, 1546.2551237347398d, 439.40340754804583d, 2074.214261375965d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2002.0218249403838d + "'", double4 == 2002.0218249403838d);
    }

    @Test
    public void test09287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09287");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(0.0d, 1921.319908212417d, 3333.744814787238d, 2315.3865654016304d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4058.924665150014d + "'", double4 == 4058.924665150014d);
    }

    @Test
    public void test09288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09288");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(650.8900422812455d, 96.9568383829882d, 1915.2171449349437d, 159.13035487999585d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1356.595228009324d + "'", double4 == 1356.595228009324d);
    }

    @Test
    public void test09289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09289");
        int[] intArray0 = null;
        int[] intArray4 = new int[] { 1, 1, 100 };
        int[] intArray6 = new int[] { (byte) -1 };
        int int7 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray4, intArray6);
        int[] intArray11 = new int[] { 1, 1, 100 };
        int[] intArray13 = new int[] { (byte) -1 };
        int int14 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray11, intArray13);
        int[] intArray20 = new int[] { (byte) 10, (byte) 100, ' ', (short) -1, (short) 100 };
        int int21 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray13, intArray20);
        int int22 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray4, intArray20);
        int[] intArray26 = new int[] { 1, 1, 100 };
        int[] intArray28 = new int[] { (byte) -1 };
        int int29 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray26, intArray28);
        int[] intArray33 = new int[] { 1, 1, 100 };
        int[] intArray35 = new int[] { (byte) -1 };
        int int36 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray33, intArray35);
        int[] intArray39 = new int[] { 'a', 10 };
        int int40 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray35, intArray39);
        int[] intArray44 = new int[] { (byte) 1, (short) 1, (short) -1 };
        int int45 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray35, intArray44);
        int int46 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray28, intArray35);
        int[] intArray50 = new int[] { 1, 1, 100 };
        int[] intArray52 = new int[] { (byte) -1 };
        int int53 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray50, intArray52);
        int int54 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray28, intArray50);
        int[] intArray58 = new int[] { 1, 1, 100 };
        int[] intArray60 = new int[] { (byte) -1 };
        int int61 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray58, intArray60);
        int[] intArray64 = new int[] { 'a', 10 };
        int int65 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray60, intArray64);
        int int66 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray28, intArray60);
        int[] intArray70 = new int[] { 1, 1, 100 };
        int[] intArray72 = new int[] { (byte) -1 };
        int int73 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray70, intArray72);
        int[] intArray77 = new int[] { 1, 1, 100 };
        int[] intArray79 = new int[] { (byte) -1 };
        int int80 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray77, intArray79);
        int[] intArray83 = new int[] { 'a', 10 };
        int int84 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray79, intArray83);
        int int85 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray70, intArray83);
        int int86 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray60, intArray83);
        int int87 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray20, intArray60);
        // The following exception was thrown during execution in test generation
        try {
            int int88 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray0, intArray20);
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
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[10, 100, 32, -1, 100]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
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
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[1, 1, -1]");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray50), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray52), "[-1]");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray58), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray60), "[-1]");
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertNotNull(intArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray64), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertNotNull(intArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray70), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray72), "[-1]");
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertNotNull(intArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray77), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray79), "[-1]");
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + (-1) + "'", int80 == (-1));
        org.junit.Assert.assertNotNull(intArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray83), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + (-1) + "'", int84 == (-1));
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + (-1) + "'", int85 == (-1));
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + (-1) + "'", int86 == (-1));
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + (-1) + "'", int87 == (-1));
    }

    @Test
    public void test09290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09290");
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
        int int95 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray34, intArray91);
        java.lang.Class<?> wildcardClass96 = intArray34.getClass();
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
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + (-1) + "'", int95 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass96);
    }

    @Test
    public void test09291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09291");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(812.3403011217949d, 297.89177667742257d, 4425.803148936303d, 613.2225946703197d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3928.793665807405d + "'", double4 == 3928.793665807405d);
    }

    @Test
    public void test09292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09292");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(911.0474342832409d, 1599.4513018778912d, 2413.6569714584775d, 1967.6958543083538d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1870.8540896056993d + "'", double4 == 1870.8540896056993d);
    }

    @Test
    public void test09293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09293");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1262.9959356743564d, 257.15421187030165d, 0.0d, 1731.2407256982228d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1347.001082744345d + "'", double4 == 1347.001082744345d);
    }

    @Test
    public void test09294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09294");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(915.5928278299326d, 748.0414034714805d, 1974.1238288902462d, 251.76782081452316d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1249.4604916301907d + "'", double4 == 1249.4604916301907d);
    }

    @Test
    public void test09295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09295");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(2540.093722470743d, 786.9525036870112d, 721.4255057983173d, 1267.6584818297208d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2219.604812564534d + "'", double4 == 2219.604812564534d);
    }

    @Test
    public void test09296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09296");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(2540.928966699214d, 473.87268540301864d, 96.08922021339528d, 927.2289296844456d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2898.1959907672453d + "'", double4 == 2898.1959907672453d);
    }

    @Test
    public void test09297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09297");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(2664.46187693285d, 1359.661242426394d, 536.8240390954728d, 555.7197088172657d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2931.5793714465053d + "'", double4 == 2931.5793714465053d);
    }

    @Test
    public void test09298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09298");
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
            double double82 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray0, doubleArray54, 0);
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
    public void test09299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09299");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(635.2249546953902d, 0.0d, 3650.6006508099845d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3081.558263571587d + "'", double4 == 3081.558263571587d);
    }

    @Test
    public void test09300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09300");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(2598.1331824531635d, 357.47422719117975d, 579.9618434234615d, 2267.38503150545d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2045.0941037116781d + "'", double4 == 2045.0941037116781d);
    }

    @Test
    public void test09301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09301");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(784.0699268707897d, (double) (byte) 100, 1323.3419759761805d, 462.87004255948045d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 627.681215767945d + "'", double4 == 627.681215767945d);
    }

    @Test
    public void test09302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09302");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1097.6374505374613d, 1396.2092693223371d, 2138.830392485773d, 1551.7698188764311d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1196.7534915024055d + "'", double4 == 1196.7534915024055d);
    }

    @Test
    public void test09303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09303");
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
        double[] doubleArray31 = new double[] { 232.4213562373095d, (short) 0, 1.0f, 75.85073476263909d, (-1L) };
        double double33 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray23, doubleArray31, (int) (byte) -1);
        double[] doubleArray38 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray39 = new double[] {};
        double double41 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray38, doubleArray39, 0);
        double[] doubleArray46 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray47 = new double[] {};
        double double49 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray46, doubleArray47, 0);
        double double51 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray38, doubleArray47, (int) (short) 100);
        double[] doubleArray54 = new double[] { (byte) 0, 132.0d };
        double double56 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray47, doubleArray54, (int) '4');
        double[] doubleArray58 = new double[] { (short) 0 };
        double[] doubleArray63 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray64 = new double[] {};
        double double66 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray63, doubleArray64, 0);
        double[] doubleArray71 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray72 = new double[] {};
        double double74 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray71, doubleArray72, 0);
        double double76 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray63, doubleArray72, (int) (short) 100);
        double double78 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray58, doubleArray63, 1);
        double double80 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray54, doubleArray63, 1);
        double double82 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray31, doubleArray63, 0);
        double double84 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray13, doubleArray31, (int) (short) 100);
        double[] doubleArray85 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double87 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray13, doubleArray85, (int) (short) -1);
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
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
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
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + (-1.0d) + "'", double51 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[0.0, 132.0]");
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + (-1.0d) + "'", double56 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[0.0]");
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
        org.junit.Assert.assertTrue("'" + double80 + "' != '" + (-1.0d) + "'", double80 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + (-1.0d) + "'", double82 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double84 + "' != '" + (-1.0d) + "'", double84 == (-1.0d));
    }

    @Test
    public void test09304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09304");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(2482.6575303702894d, 362.7660181174564d, 708.0729144154564d, 340.31553305515484d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2781.8662427664926d + "'", double4 == 2781.8662427664926d);
    }

    @Test
    public void test09305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09305");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1491.9438204028356d, 272.6868131092915d, 1966.5119245894105d, 537.6734054899458d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1065.7611882074043d + "'", double4 == 1065.7611882074043d);
    }

    @Test
    public void test09306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09306");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(4213.551643492881d, 237.65150738269148d, 2171.8824053145963d, 378.5990534663774d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4344.568407319016d + "'", double4 == 4344.568407319016d);
    }

    @Test
    public void test09307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09307");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1882.2195019689325d, 539.6799180924086d, 1339.655130811486d, 1099.1517526421515d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 952.6653121034615d + "'", double4 == 952.6653121034615d);
    }

    @Test
    public void test09308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09308");
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
        int int32 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray13, intArray28);
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
        int int64 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray38, intArray60);
        int[] intArray68 = new int[] { 1, 1, 100 };
        int[] intArray70 = new int[] { (byte) -1 };
        int int71 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray68, intArray70);
        int[] intArray74 = new int[] { 'a', 10 };
        int int75 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray70, intArray74);
        int int76 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray38, intArray70);
        int int77 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray13, intArray70);
        // The following exception was thrown during execution in test generation
        try {
            int int78 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray0, intArray70);
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
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertNotNull(intArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray68), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray70), "[-1]");
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertNotNull(intArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray74), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
    }

    @Test
    public void test09309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09309");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(927.1665824228618d, 0.0d, 82.46211251235322d, 2822.853677581892d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3667.5581474924006d + "'", double4 == 3667.5581474924006d);
    }

    @Test
    public void test09310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09310");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1046.0932635438255d, 1274.498461527665d, 1228.2488632605925d, 4437.4460582016245d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3396.2412223429355d + "'", double4 == 3396.2412223429355d);
    }

    @Test
    public void test09311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09311");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(914.2930275299476d, 689.179909625901d, 1396.098447315588d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1170.9853294115414d + "'", double4 == 1170.9853294115414d);
    }

    @Test
    public void test09312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09312");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1092.868792058805d, 440.72246835410544d, 372.30674150719653d, 6600.336908522199d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 6880.176490719702d + "'", double4 == 6880.176490719702d);
    }

    @Test
    public void test09313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09313");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1144.1770274146286d, 773.0465405509034d, 4762.727188873353d, 148.27799001310882d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4243.31871199652d + "'", double4 == 4243.31871199652d);
    }

    @Test
    public void test09314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09314");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(4255.533106401086d, 210.8229488246638d, 799.3090405533982d, 1667.4102109828045d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4317.854202625771d + "'", double4 == 4317.854202625771d);
    }

    @Test
    public void test09315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09315");
        double[] doubleArray4 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray5 = new double[] {};
        double double7 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray4, doubleArray5, 0);
        double[] doubleArray12 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray13 = new double[] {};
        double double15 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray12, doubleArray13, 0);
        double double17 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray4, doubleArray13, (int) (short) 100);
        double[] doubleArray20 = new double[] { 289.94401876488206d, 636.5834861894493d };
        double[] doubleArray25 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray26 = new double[] {};
        double double28 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray25, doubleArray26, 0);
        double[] doubleArray33 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray34 = new double[] {};
        double double36 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray33, doubleArray34, 0);
        double double38 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray25, doubleArray34, (int) (short) 100);
        double[] doubleArray43 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray44 = new double[] {};
        double double46 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray43, doubleArray44, 0);
        double double48 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray34, doubleArray43, (int) (short) 100);
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
        double double78 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray34, doubleArray54, 100);
        double double80 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray20, doubleArray34, (int) '#');
        double double82 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray13, doubleArray34, (int) (byte) 10);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[289.94401876488206, 636.5834861894493]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[]");
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + (-1.0d) + "'", double28 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[]");
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + (-1.0d) + "'", double36 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + (-1.0d) + "'", double38 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[]");
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + (-1.0d) + "'", double46 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + (-1.0d) + "'", double48 == (-1.0d));
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
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + 0.0d + "'", double82 == 0.0d);
    }

    @Test
    public void test09316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09316");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(408.4384273209634d, 2338.2595531011807d, 1327.1607151893802d, 427.0954714739296d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2829.886369495668d + "'", double4 == 2829.886369495668d);
    }

    @Test
    public void test09317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09317");
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
        int[] intArray32 = new int[] { 1, 1, 100 };
        int[] intArray34 = new int[] { (byte) -1 };
        int int35 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray32, intArray34);
        int[] intArray38 = new int[] { 'a', 10 };
        int int39 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray34, intArray38);
        int int40 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray25, intArray38);
        int int41 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray19, intArray25);
        int[] intArray45 = new int[] { 1, 1, 100 };
        int[] intArray47 = new int[] { (byte) -1 };
        int int48 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray45, intArray47);
        int[] intArray52 = new int[] { 1, 1, 100 };
        int[] intArray54 = new int[] { (byte) -1 };
        int int55 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray52, intArray54);
        int[] intArray58 = new int[] { 'a', 10 };
        int int59 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray54, intArray58);
        int int60 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray45, intArray58);
        int[] intArray64 = new int[] { 1, 1, 100 };
        int[] intArray66 = new int[] { (byte) -1 };
        int int67 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray64, intArray66);
        int[] intArray70 = new int[] { 'a', 10 };
        int int71 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray66, intArray70);
        int[] intArray75 = new int[] { (byte) 1, (short) 1, (short) -1 };
        int int76 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray66, intArray75);
        int[] intArray80 = new int[] { (byte) -1, '#', (-1) };
        int int81 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray66, intArray80);
        int int82 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray45, intArray66);
        int int83 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray19, intArray66);
        java.lang.Class<?> wildcardClass84 = intArray66.getClass();
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
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray52), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray54), "[-1]");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray58), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
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
        org.junit.Assert.assertNotNull(intArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray80), "[-1, 35, -1]");
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + (-1) + "'", int81 == (-1));
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + (-1) + "'", int82 == (-1));
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + (-1) + "'", int83 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass84);
    }

    @Test
    public void test09318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09318");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(527.1907224716535d, 2094.27120362429d, 997.2336952379803d, 1254.822632409213d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1309.491543981404d + "'", double4 == 1309.491543981404d);
    }

    @Test
    public void test09319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09319");
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
        int[] intArray50 = new int[] { 1, 1, 100 };
        int[] intArray52 = new int[] { (byte) -1 };
        int int53 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray50, intArray52);
        int[] intArray56 = new int[] { 'a', 10 };
        int int57 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray52, intArray56);
        int[] intArray61 = new int[] { (byte) 1, (short) 1, (short) -1 };
        int int62 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray52, intArray61);
        int int63 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray45, intArray52);
        int[] intArray67 = new int[] { 1, 1, 100 };
        int[] intArray69 = new int[] { (byte) -1 };
        int int70 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray67, intArray69);
        int int71 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray52, intArray67);
        int int72 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray28, intArray52);
        int[] intArray76 = new int[] { 1, 1, 100 };
        int[] intArray78 = new int[] { (byte) -1 };
        int int79 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray76, intArray78);
        int[] intArray82 = new int[] { 'a', 10 };
        int int83 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray78, intArray82);
        int[] intArray87 = new int[] { (byte) 1, (short) 1, (short) -1 };
        int int88 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray78, intArray87);
        int int89 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray28, intArray78);
        int int90 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray14, intArray28);
        java.lang.Class<?> wildcardClass91 = intArray14.getClass();
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
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray67), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray69), "[-1]");
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
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
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + (-1) + "'", int90 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass91);
    }

    @Test
    public void test09320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09320");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(2330.8003804486057d, 683.5143085001474d, 1107.0048737615105d, 3327.0925801196036d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3867.3737783065517d + "'", double4 == 3867.3737783065517d);
    }

    @Test
    public void test09321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09321");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(152.19563560223125d, 464.69297928283805d, 1178.4828095220473d, 255.41977514636133d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1235.5603780562928d + "'", double4 == 1235.5603780562928d);
    }

    @Test
    public void test09322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09322");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1575.9672954887894d, 119.72206941536145d, 417.66795450539934d, 855.8783938449538d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1363.8861351275557d + "'", double4 == 1363.8861351275557d);
    }

    @Test
    public void test09323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09323");
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
        double[] doubleArray72 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray73 = new double[] {};
        double double75 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray72, doubleArray73, 0);
        double[] doubleArray80 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray81 = new double[] {};
        double double83 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray80, doubleArray81, 0);
        double[] doubleArray88 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray89 = new double[] {};
        double double91 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray88, doubleArray89, 0);
        double double93 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray80, doubleArray89, 1);
        double double95 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray73, doubleArray89, (int) (short) 10);
        double double97 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray21, doubleArray89, 157);
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
        org.junit.Assert.assertNotNull(doubleArray88);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray88), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray89), "[]");
        org.junit.Assert.assertTrue("'" + double91 + "' != '" + (-1.0d) + "'", double91 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double93 + "' != '" + (-1.0d) + "'", double93 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double95 + "' != '" + 0.0d + "'", double95 == 0.0d);
        org.junit.Assert.assertTrue("'" + double97 + "' != '" + 0.0d + "'", double97 == 0.0d);
    }

    @Test
    public void test09324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09324");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(868.4314838127239d, 156.94538945476546d, 438.2469649884026d, 842.6558508680938d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 430.9560342886605d + "'", double4 == 430.9560342886605d);
    }

    @Test
    public void test09325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09325");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance((double) (short) 0, 755.7384494027308d, 2566.3153406804354d, 4429.991049395023d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 6240.567940672727d + "'", double4 == 6240.567940672727d);
    }

    @Test
    public void test09326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09326");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1857.3176559106494d, 4589.879710412303d, 2582.9185785297154d, 237.60608584912666d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1774.813305420264d + "'", double4 == 1774.813305420264d);
    }

    @Test
    public void test09327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09327");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(534.0054007349432d, 326.5200682458287d, 201.2718775322712d, 4099.74555503482d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4105.959009991663d + "'", double4 == 4105.959009991663d);
    }

    @Test
    public void test09328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09328");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(914.80456570021d, 262.17083616066867d, 1002.8041600329911d, (double) ' ');
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 887.1797054846726d + "'", double4 == 887.1797054846726d);
    }

    @Test
    public void test09329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09329");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(0.0d, 813.5250825095069d, 579.9160313510744d, 1663.0858002096568d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1429.4767490512243d + "'", double4 == 1429.4767490512243d);
    }

    @Test
    public void test09330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09330");
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
        double double75 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray53, doubleArray69, (int) (short) 10);
        double double77 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray13, doubleArray53, (int) '#');
        double[] doubleArray78 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double80 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray53, doubleArray78, 0);
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
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + 0.0d + "'", double75 == 0.0d);
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 0.0d + "'", double77 == 0.0d);
    }

    @Test
    public void test09331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09331");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(3342.8994197259885d, 602.7965987608148d, 386.38223780084934d, 71.49353124534356d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4409.43197409875d + "'", double4 == 4409.43197409875d);
    }

    @Test
    public void test09332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09332");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(2751.2925482046803d, 2168.3917531251705d, 2471.874132632111d, 667.6854662500224d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2102.2590522893915d + "'", double4 == 2102.2590522893915d);
    }

    @Test
    public void test09333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09333");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1756.3197263345141d, 1493.6908742099372d, 0.0d, 957.8278142176666d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2292.1827863267845d + "'", double4 == 2292.1827863267845d);
    }

    @Test
    public void test09334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09334");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(3735.315465287669d, 3990.021978038674d, 2080.873522260326d, 479.47463434269935d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 5164.9892867233175d + "'", double4 == 5164.9892867233175d);
    }

    @Test
    public void test09335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09335");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1760.7435246446817d, 2374.5234609985714d, 179.91885414228824d, 2735.36316199059d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1857.1187566683159d + "'", double4 == 1857.1187566683159d);
    }

    @Test
    public void test09336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09336");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1077.0561352076481d, 0.0d, 272.1275156615877d, 651.1259120141996d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1456.0545315602599d + "'", double4 == 1456.0545315602599d);
    }

    @Test
    public void test09337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09337");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1201.0194902587968d, 588.6435352502476d, 3294.755818569218d, 1140.4786243437534d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2094.611421942635d + "'", double4 == 2094.611421942635d);
    }

    @Test
    public void test09338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09338");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(935.5627697630805d, 364.402991106878d, 0.0d, 3506.175212994978d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2735.5668570637113d + "'", double4 == 2735.5668570637113d);
    }

    @Test
    public void test09339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09339");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1831.7889207857309d, 423.2002675066391d, 465.26773014275807d, 697.6691737578252d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1775.8400167455761d + "'", double4 == 1775.8400167455761d);
    }

    @Test
    public void test09340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09340");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(160.6408171889707d, 2169.3518444647507d, 1552.69868529266d, 66.35060455587607d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1395.247559520454d + "'", double4 == 1395.247559520454d);
    }

    @Test
    public void test09341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09341");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(2660.7680153550314d, 2033.6280110346997d, 527.1382011920248d, 676.3422283448025d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2913.8156921872105d + "'", double4 == 2913.8156921872105d);
    }

    @Test
    public void test09342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09342");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(3101.042107702725d, 780.1371363289729d, 1318.7105853502353d, 141.32112170894843d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2421.147536972514d + "'", double4 == 2421.147536972514d);
    }

    @Test
    public void test09343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09343");
        int[] intArray3 = new int[] { 1, 1, 100 };
        int[] intArray5 = new int[] { (byte) -1 };
        int int6 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray3, intArray5);
        int[] intArray9 = new int[] { 'a', 10 };
        int int10 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray5, intArray9);
        int[] intArray14 = new int[] { 1, 1, 100 };
        int[] intArray16 = new int[] { (byte) -1 };
        int int17 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray14, intArray16);
        int[] intArray23 = new int[] { (byte) 10, (byte) 100, ' ', (short) -1, (short) 100 };
        int int24 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray16, intArray23);
        int[] intArray28 = new int[] { 1, 1, 100 };
        int[] intArray30 = new int[] { (byte) -1 };
        int int31 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray28, intArray30);
        int[] intArray35 = new int[] { 1, 1, 100 };
        int[] intArray37 = new int[] { (byte) -1 };
        int int38 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray35, intArray37);
        int[] intArray41 = new int[] { 'a', 10 };
        int int42 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray37, intArray41);
        int int43 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray28, intArray41);
        int int44 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray16, intArray41);
        int int45 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray9, intArray16);
        java.lang.Class<?> wildcardClass46 = intArray16.getClass();
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
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[10, 100, 32, -1, 100]");
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
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test09344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09344");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1288.4526894853402d, 282.68787864005503d, 511.72643343324756d, 1036.8665966272267d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1530.9049740392643d + "'", double4 == 1530.9049740392643d);
    }

    @Test
    public void test09345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09345");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(657.3298266720961d, 716.8369233741474d, 2440.6299281759552d, 796.964536488118d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1788.7585371449884d + "'", double4 == 1788.7585371449884d);
    }

    @Test
    public void test09346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09346");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(0.0d, 359.2623750887635d, 1638.62679795206d, 2044.0969965035576d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2619.814938899595d + "'", double4 == 2619.814938899595d);
    }

    @Test
    public void test09347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09347");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1973.3633611057894d, 3739.999829759995d, 418.8312603752497d, 3217.752478581656d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2076.779451908879d + "'", double4 == 2076.779451908879d);
    }

    @Test
    public void test09348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09348");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(587.5796262549627d, 298.63164704820605d, 1146.3776766079402d, 1362.443454095583d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 955.3372246354202d + "'", double4 == 955.3372246354202d);
    }

    @Test
    public void test09349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09349");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(643.9955869586861d, 71.53615965246802d, 479.47463434269935d, 5923.435601046604d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 6016.420394010122d + "'", double4 == 6016.420394010122d);
    }

    @Test
    public void test09350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09350");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1535.420242661069d, 761.6427530252773d, 0.0d, 413.8289861245929d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1901.44215486889d + "'", double4 == 1901.44215486889d);
    }

    @Test
    public void test09351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09351");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(3236.7769977752987d, 1768.7133071730161d, 872.471188839181d, 681.0201687973151d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3451.9989473118185d + "'", double4 == 3451.9989473118185d);
    }

    @Test
    public void test09352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09352");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(237.5231875163333d, 902.7609718913877d, 2000.4917381037785d, 2282.5121094828382d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3142.719688178896d + "'", double4 == 3142.719688178896d);
    }

    @Test
    public void test09353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09353");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(127.47140442451933d, 462.4018036256481d, 2446.974580808893d, 3046.4238466477655d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3728.321116161838d + "'", double4 == 3728.321116161838d);
    }

    @Test
    public void test09354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09354");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(2576.4318188109983d, 815.204832074316d, 596.0941353142186d, 531.5523426179997d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2263.9901729530957d + "'", double4 == 2263.9901729530957d);
    }

    @Test
    public void test09355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09355");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1020.3288831193861d, 1780.0464202267328d, 290.52223969209126d, 1943.694419421311d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 893.4546426218731d + "'", double4 == 893.4546426218731d);
    }

    @Test
    public void test09356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09356");
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
        double double86 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray5, doubleArray29, 0);
        java.lang.Class<?> wildcardClass87 = doubleArray5.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass87);
    }

    @Test
    public void test09357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09357");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(814.3861266070571d, 422.0208222943637d, 171.5644349530363d, 711.2291099866812d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 651.0461560741708d + "'", double4 == 651.0461560741708d);
    }

    @Test
    public void test09358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09358");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(167.87372472293382d, 374.4096930671966d, 1487.5038290332905d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1330.2650862345124d + "'", double4 == 1330.2650862345124d);
    }

    @Test
    public void test09359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09359");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1318.4050256596806d, 2292.1827863267845d, 1148.3107511959963d, 264.9219637400125d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1067.1263392668025d + "'", double4 == 1067.1263392668025d);
    }

    @Test
    public void test09360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09360");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(4663.540453059856d, 605.9155468135754d, 1361.8994417877504d, 4104.264598844511d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 6799.990063303041d + "'", double4 == 6799.990063303041d);
    }

    @Test
    public void test09361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09361");
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
        double[] doubleArray66 = new double[] {};
        double double68 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray41, doubleArray66, 101);
        double double70 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray4, doubleArray41, (-1));
        double[] doubleArray74 = new double[] { 198.44088030501894d, 1311.354157651133d, 175.19235070254496d };
        double double76 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray4, doubleArray74, (int) (short) 10);
        java.lang.Class<?> wildcardClass77 = doubleArray74.getClass();
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
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[]");
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 0.0d + "'", double68 == 0.0d);
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + (-1.0d) + "'", double70 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray74), "[198.44088030501894, 1311.354157651133, 175.19235070254496]");
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + (-1.0d) + "'", double76 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass77);
    }

    @Test
    public void test09362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09362");
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
        double double66 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray54, doubleArray62, (int) (byte) 1);
        double[] doubleArray71 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray72 = new double[] {};
        double double74 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray71, doubleArray72, 0);
        double[] doubleArray79 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray80 = new double[] {};
        double double82 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray79, doubleArray80, 0);
        double double84 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray71, doubleArray80, (int) (short) 100);
        double double86 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray62, doubleArray80, (int) (short) 0);
        double double88 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray44, doubleArray80, (int) ' ');
        double double90 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray28, doubleArray44, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            double double92 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray0, doubleArray28, (int) (short) 10);
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
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 0.0d + "'", double66 == 0.0d);
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
        org.junit.Assert.assertTrue("'" + double86 + "' != '" + 0.0d + "'", double86 == 0.0d);
        org.junit.Assert.assertTrue("'" + double88 + "' != '" + 0.0d + "'", double88 == 0.0d);
        org.junit.Assert.assertTrue("'" + double90 + "' != '" + (-1.0d) + "'", double90 == (-1.0d));
    }

    @Test
    public void test09363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09363");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(325.5506232284013d, 635.8266350960342d, 944.2937431290189d, 1121.997693638811d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1008.5489499224487d + "'", double4 == 1008.5489499224487d);
    }

    @Test
    public void test09364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09364");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(903.7752096889352d, 657.2767548962429d, 2636.152833222345d, 2529.031550540857d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3604.132419178024d + "'", double4 == 3604.132419178024d);
    }

    @Test
    public void test09365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09365");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(3583.151681922938d, 680.1362600482971d, 0.0d, 347.7438018996266d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3915.5441400716086d + "'", double4 == 3915.5441400716086d);
    }

    @Test
    public void test09366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09366");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(730.5393088107734d, 780.9192870742608d, 4071.2522367299543d, 894.6521376148579d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3454.445778459778d + "'", double4 == 3454.445778459778d);
    }

    @Test
    public void test09367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09367");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1353.448044776758d, 1264.9091074325117d, 1984.586977454828d, 266.04698833100895d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1630.0010517795727d + "'", double4 == 1630.0010517795727d);
    }

    @Test
    public void test09368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09368");
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
        int[] intArray83 = new int[] { 1, 1, 100 };
        int[] intArray85 = new int[] { (byte) -1 };
        int int86 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray83, intArray85);
        int[] intArray90 = new int[] { 1, 1, 100 };
        int[] intArray92 = new int[] { (byte) -1 };
        int int93 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray90, intArray92);
        int int94 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray83, intArray92);
        int int95 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray28, intArray92);
        java.lang.Class<?> wildcardClass96 = intArray28.getClass();
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
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + 0 + "'", int95 == 0);
        org.junit.Assert.assertNotNull(wildcardClass96);
    }

    @Test
    public void test09369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09369");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1453.3374024523816d, 3451.9989473118185d, 510.014946001383d, 1547.4361952153558d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 948.0041348244191d + "'", double4 == 948.0041348244191d);
    }

    @Test
    public void test09370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09370");
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
        int[] intArray86 = new int[] { 1, 1, 100 };
        int[] intArray88 = new int[] { (byte) -1 };
        int int89 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray86, intArray88);
        int[] intArray92 = new int[] { 'a', 10 };
        int int93 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray88, intArray92);
        int int94 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray14, intArray88);
        int[] intArray95 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int96 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray14, intArray95);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
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
        org.junit.Assert.assertNotNull(intArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray86), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray88);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray88), "[-1]");
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + (-1) + "'", int89 == (-1));
        org.junit.Assert.assertNotNull(intArray92);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray92), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + (-1) + "'", int93 == (-1));
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + (-1) + "'", int94 == (-1));
    }

    @Test
    public void test09371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09371");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(387.5901302290086d, 2148.923125874513d, 814.2659300497917d, 3700.885571993184d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1978.638245939454d + "'", double4 == 1978.638245939454d);
    }

    @Test
    public void test09372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09372");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(747.4152025244257d, 230.290242809725d, 614.9700265474353d, 3390.414859565335d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3292.5697927326005d + "'", double4 == 3292.5697927326005d);
    }

    @Test
    public void test09373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09373");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(5359.1726019473645d, 565.4446936464491d, 378.1620143574939d, 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 7309.180118119044d + "'", double4 == 7309.180118119044d);
    }

    @Test
    public void test09374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09374");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(206.1803399776416d, 1034.085734167077d, 1581.441263965389d, 1404.1067534121478d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1745.2819432328183d + "'", double4 == 1745.2819432328183d);
    }

    @Test
    public void test09375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09375");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(2484.467243686611d, 1625.0904740994156d, 1249.6066372786217d, 1218.4081904256052d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1768.5548460826597d + "'", double4 == 1768.5548460826597d);
    }

    @Test
    public void test09376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09376");
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
        double double33 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray20, doubleArray29, (int) (short) 100);
        double[] doubleArray38 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray39 = new double[] {};
        double double41 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray38, doubleArray39, 0);
        double double43 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray29, doubleArray38, (int) (short) 100);
        double double45 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray13, doubleArray29, (int) '4');
        double[] doubleArray50 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray51 = new double[] {};
        double double53 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray50, doubleArray51, 0);
        double[] doubleArray58 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray59 = new double[] {};
        double double61 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray58, doubleArray59, 0);
        double[] doubleArray66 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray67 = new double[] {};
        double double69 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray66, doubleArray67, 0);
        double double71 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray58, doubleArray67, 1);
        double double73 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray51, doubleArray67, (int) (short) 10);
        double double75 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray29, doubleArray67, 0);
        double double77 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray4, doubleArray67, 0);
        double[] doubleArray78 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double80 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray4, doubleArray78, 137);
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
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray67), "[]");
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + (-1.0d) + "'", double69 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + (-1.0d) + "'", double71 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + 0.0d + "'", double73 == 0.0d);
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + 0.0d + "'", double75 == 0.0d);
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + (-1.0d) + "'", double77 == (-1.0d));
    }

    @Test
    public void test09377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09377");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(2542.0576644491184d, 584.1988458892276d, 576.8366664256379d, 868.1266574013914d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2581.499290611606d + "'", double4 == 2581.499290611606d);
    }

    @Test
    public void test09378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09378");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1069.0226291276806d, 1400.0787156015954d, 2074.214261375965d, 159.42770618139392d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2245.842641668486d + "'", double4 == 2245.842641668486d);
    }

    @Test
    public void test09379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09379");
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
        double[] doubleArray70 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray71 = new double[] {};
        double double73 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray70, doubleArray71, 0);
        double[] doubleArray78 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray79 = new double[] {};
        double double81 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray78, doubleArray79, 0);
        double double83 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray70, doubleArray79, 1);
        double double85 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray50, doubleArray70, 1);
        double[] doubleArray86 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double88 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray70, doubleArray86, 137);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"p2\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + double85 + "' != '" + 0.0d + "'", double85 == 0.0d);
    }

    @Test
    public void test09380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09380");
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
        java.lang.Class<?> wildcardClass96 = doubleArray5.getClass();
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
    public void test09381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09381");
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
        int int30 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray12, intArray28);
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
        int[] intArray65 = new int[] { 1, 1, 100 };
        int[] intArray67 = new int[] { (byte) -1 };
        int int68 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray65, intArray67);
        int[] intArray71 = new int[] { 'a', 10 };
        int int72 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray67, intArray71);
        int[] intArray76 = new int[] { (byte) 1, (short) 1, (short) -1 };
        int int77 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray67, intArray76);
        int int78 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray60, intArray67);
        int[] intArray82 = new int[] { 1, 1, 100 };
        int[] intArray84 = new int[] { (byte) -1 };
        int int85 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray82, intArray84);
        int int86 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray60, intArray82);
        int int87 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray36, intArray60);
        int int88 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray28, intArray60);
        java.lang.Class<?> wildcardClass89 = intArray60.getClass();
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
        org.junit.Assert.assertNotNull(intArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray82), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray84), "[-1]");
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + (-1) + "'", int85 == (-1));
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + (-1) + "'", int86 == (-1));
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 0 + "'", int87 == 0);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 0 + "'", int88 == 0);
        org.junit.Assert.assertNotNull(wildcardClass89);
    }

    @Test
    public void test09382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09382");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1966.7354504051777d, 313.2757432907782d, 1810.2003770695414d, 4705.183033314328d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4548.442363359186d + "'", double4 == 4548.442363359186d);
    }

    @Test
    public void test09383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09383");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1940.6273563036116d, 726.8005610398169d, 984.7079540377606d, 513.1918868266578d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1717.9505007855125d + "'", double4 == 1717.9505007855125d);
    }

    @Test
    public void test09384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09384");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1825.0950574246006d, 1022.7280033760819d, 2251.5976501766086d, 282.4412369416548d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1600.5265606902042d + "'", double4 == 1600.5265606902042d);
    }

    @Test
    public void test09385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09385");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(0.0d, 766.9683109428049d, 4762.727188873353d, 342.230974572274d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4775.007048747694d + "'", double4 == 4775.007048747694d);
    }

    @Test
    public void test09386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09386");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(709.0125940535077d, 2465.2052454835975d, 1976.6510304460985d, 1034.0032542407666d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2698.8404276354217d + "'", double4 == 2698.8404276354217d);
    }

    @Test
    public void test09387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09387");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1079.859193407884d, 4775.007048747694d, 530.1671498841977d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 5324.69909227138d + "'", double4 == 5324.69909227138d);
    }

    @Test
    public void test09388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09388");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1935.940013702439d, 381.3046095581544d, 1473.0983226933265d, 105.74562271114466d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1887.8119450178742d + "'", double4 == 1887.8119450178742d);
    }

    @Test
    public void test09389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09389");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(936.56791087011d, 1829.4924058745787d, 2461.4480277645876d, 1032.1588570524589d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1527.8733585910031d + "'", double4 == 1527.8733585910031d);
    }

    @Test
    public void test09390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09390");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(281.6933070507258d, 1685.2994274341145d, 790.1720718903867d, 1538.7497989088488d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1356.002093661923d + "'", double4 == 1356.002093661923d);
    }

    @Test
    public void test09391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09391");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(424.55910681763555d, 1754.2504958233844d, 1666.3855043568901d, 1569.3096664183115d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1688.960226095151d + "'", double4 == 1688.960226095151d);
    }

    @Test
    public void test09392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09392");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1931.855984282815d, 200.90336088855406d, 1149.3550069927487d, 198.44088030501894d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 784.9634578736013d + "'", double4 == 784.9634578736013d);
    }

    @Test
    public void test09393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09393");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(319.6699687996772d, 696.9969025729727d, 1948.9417153271818d, 2598.1331824531635d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3530.4080264076956d + "'", double4 == 3530.4080264076956d);
    }

    @Test
    public void test09394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09394");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1253.3651748356974d, 3012.431548170647d, (double) 10.0f, 1584.623345137529d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2671.173377868816d + "'", double4 == 2671.173377868816d);
    }

    @Test
    public void test09395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09395");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(204.76001435311565d, 347.7438018996266d, 2427.702986458337d, 2339.965808757059d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3082.3009654620314d + "'", double4 == 3082.3009654620314d);
    }

    @Test
    public void test09396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09396");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(2965.5125008037417d, 482.32661254993286d, 879.3703982763809d, 928.1684016400267d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2915.949219436869d + "'", double4 == 2915.949219436869d);
    }

    @Test
    public void test09397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09397");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(519.1302058653025d, 0.0d, 136.9096390986464d, 521.4922412814548d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 382.2278651154714d + "'", double4 == 382.2278651154714d);
    }

    @Test
    public void test09398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09398");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(527.1382011920248d, 1796.1866720448727d, 836.1268472185388d, 1664.535780767326d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1178.6209048702012d + "'", double4 == 1178.6209048702012d);
    }

    @Test
    public void test09399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09399");
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
        int[] intArray34 = new int[] { 1, 1, 100 };
        int[] intArray36 = new int[] { (byte) -1 };
        int int37 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray34, intArray36);
        int[] intArray40 = new int[] { 'a', 10 };
        int int41 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray36, intArray40);
        int int42 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray27, intArray40);
        int[] intArray46 = new int[] { 1, 1, 100 };
        int[] intArray48 = new int[] { (byte) -1 };
        int int49 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray46, intArray48);
        int[] intArray52 = new int[] { 'a', 10 };
        int int53 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray48, intArray52);
        int[] intArray57 = new int[] { (byte) 1, (short) 1, (short) -1 };
        int int58 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray48, intArray57);
        int[] intArray62 = new int[] { (byte) -1, '#', (-1) };
        int int63 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray48, intArray62);
        int int64 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray27, intArray48);
        int[] intArray68 = new int[] { 1, 1, 100 };
        int[] intArray70 = new int[] { (byte) -1 };
        int int71 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray68, intArray70);
        int[] intArray74 = new int[] { 'a', 10 };
        int int75 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray70, intArray74);
        int[] intArray79 = new int[] { (byte) 1, (short) 1, (short) -1 };
        int int80 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray70, intArray79);
        int[] intArray84 = new int[] { (byte) -1, '#', (-1) };
        int int85 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray70, intArray84);
        int int86 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray27, intArray70);
        int[] intArray90 = new int[] { 1, 1, 100 };
        int[] intArray92 = new int[] { (byte) -1 };
        int int93 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray90, intArray92);
        int int94 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray27, intArray90);
        int int95 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray13, intArray27);
        // The following exception was thrown during execution in test generation
        try {
            int int96 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray0, intArray27);
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
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[-1]");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[97, 10]");
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
        org.junit.Assert.assertNotNull(intArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray62), "[-1, 35, -1]");
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
        org.junit.Assert.assertNotNull(intArray90);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray90), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray92);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray92), "[-1]");
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + (-1) + "'", int93 == (-1));
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 0 + "'", int94 == 0);
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + (-1) + "'", int95 == (-1));
    }

    @Test
    public void test09400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09400");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1207.6930012050066d, 1030.1790390362178d, 813.1299394980268d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1270.5126503987049d + "'", double4 == 1270.5126503987049d);
    }

    @Test
    public void test09401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09401");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(157.71489920338794d, 1407.5881372261192d, 803.6925578648203d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2053.5657958875518d + "'", double4 == 2053.5657958875518d);
    }

    @Test
    public void test09402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09402");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1104.826261152225d, 795.7792892510216d, 1065.1983414653037d, 814.5407116331819d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 58.389342069081636d + "'", double4 == 58.389342069081636d);
    }

    @Test
    public void test09403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09403");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(2221.950069255723d, 0.0d, 421.2668704142359d, 1338.34494581654d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2005.7961004942613d + "'", double4 == 2005.7961004942613d);
    }

    @Test
    public void test09404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09404");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(531.3759037767397d, 893.279884540596d, 2209.8848487640676d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2571.7888295279236d + "'", double4 == 2571.7888295279236d);
    }

    @Test
    public void test09405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09405");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(120.0140155458501d, 234.50390780179015d, 614.1026145771851d, 468.85168542559705d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 604.8233325690062d + "'", double4 == 604.8233325690062d);
    }

    @Test
    public void test09406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09406");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(3120.8360984995475d, 723.3533131255944d, 2894.906903402937d, 630.5823516081128d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 318.70015661409184d + "'", double4 == 318.70015661409184d);
    }

    @Test
    public void test09407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09407");
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
        double double51 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray39, doubleArray47, (int) (byte) 1);
        double double53 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray21, doubleArray39, (int) (short) 0);
        double double55 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray13, doubleArray39, (int) (short) 1);
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
        double double83 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray69, doubleArray78, (int) (short) 100);
        double double85 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray39, doubleArray69, 137);
        java.lang.Class<?> wildcardClass86 = doubleArray39.getClass();
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
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 0.0d + "'", double51 == 0.0d);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.0d + "'", double53 == 0.0d);
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
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + (-1.0d) + "'", double83 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double85 + "' != '" + 0.0d + "'", double85 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass86);
    }

    @Test
    public void test09408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09408");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(3443.5656823446498d, 1407.3407591082284d, 1757.265542160299d, 531.3304925815354d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3365.22242404278d + "'", double4 == 3365.22242404278d);
    }

    @Test
    public void test09409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09409");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(378.0d, 1619.5400246122094d, 0.0d, 761.2930315979277d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 538.3284759991152d + "'", double4 == 538.3284759991152d);
    }

    @Test
    public void test09410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09410");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(488.02963325941397d, 1181.117299054622d, 280.74328252048d, 485.54600752883783d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 207.30122913150785d + "'", double4 == 207.30122913150785d);
    }

    @Test
    public void test09411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09411");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(831.4930373345594d, 205.49962547816742d, 0.0d, 3304.900423968571d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2609.4299705858252d + "'", double4 == 2609.4299705858252d);
    }

    @Test
    public void test09412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09412");
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
        int[] intArray90 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int91 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray80, intArray90);
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
    }

    @Test
    public void test09413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09413");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(711.7773848285456d, 1935.0579155434987d, 1172.7228887780416d, 1077.2718746166966d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1318.7315448762981d + "'", double4 == 1318.7315448762981d);
    }

    @Test
    public void test09414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09414");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(3151.1244755180587d, 1733.7425272909193d, 683.1376202102352d, 657.4014109628207d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3508.505927124389d + "'", double4 == 3508.505927124389d);
    }

    @Test
    public void test09415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09415");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(938.5565382174809d, 1624.6202329304876d, 1200.219568479256d, 1026.1396300310848d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 275.9317657998165d + "'", double4 == 275.9317657998165d);
    }

    @Test
    public void test09416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09416");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(967.2445066796739d, 2079.6908311254906d, 2824.5150470238427d, 1717.2393775450803d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2219.721993924579d + "'", double4 == 2219.721993924579d);
    }

    @Test
    public void test09417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09417");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(3181.9032075439895d, 629.4714697471602d, 1576.5480435415575d, 3139.170941281121d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4115.054635536393d + "'", double4 == 4115.054635536393d);
    }

    @Test
    public void test09418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09418");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1519.2820258285105d, 480.56201986901675d, 545.9842633458804d, 444.63020367211396d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1449.891400525487d + "'", double4 == 1449.891400525487d);
    }

    @Test
    public void test09419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09419");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(930.1492272816134d, 937.6910315248865d, 839.8033335171348d, 866.150508371652d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 161.88641691771318d + "'", double4 == 161.88641691771318d);
    }

    @Test
    public void test09420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09420");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(846.4686300214333d, 2417.680417531119d, 49.33701282608181d, 1654.8457461226537d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1559.9662886038168d + "'", double4 == 1559.9662886038168d);
    }

    @Test
    public void test09421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09421");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(2336.1522128651577d, 117.5273091577346d, 2021.724762462803d, 725.9526056487433d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1640.6118970208706d + "'", double4 == 1640.6118970208706d);
    }

    @Test
    public void test09422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09422");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(830.0533378459004d, 158.31063183921498d, 889.1857289890074d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 217.44302298232202d + "'", double4 == 217.44302298232202d);
    }

    @Test
    public void test09423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09423");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1078.2317336065362d, 1431.044245781737d, 2212.378535842752d, 927.6563662606078d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1637.534681757345d + "'", double4 == 1637.534681757345d);
    }

    @Test
    public void test09424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09424");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(3012.835049248558d, 3893.6080188717588d, 230.1492652373609d, 3143.3273252643467d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3532.966477618609d + "'", double4 == 3532.966477618609d);
    }

    @Test
    public void test09425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09425");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(5605.370410233482d, 340.26183966592777d, 533.3141722678381d, 1061.5948938608483d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 6809.673297910377d + "'", double4 == 6809.673297910377d);
    }

    @Test
    public void test09426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09426");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(217.68384953056642d, 543.3479477771101d, 619.9703522906217d, 258.891505624066d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 686.7429449130993d + "'", double4 == 686.7429449130993d);
    }

    @Test
    public void test09427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09427");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(404.68669618344165d, 1121.9114681279166d, 467.94163262749527d, 945.4911637251181d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 239.6752408468521d + "'", double4 == 239.6752408468521d);
    }

    @Test
    public void test09428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09428");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(262.17083616066867d, 2108.6613560561427d, 3429.0509289842666d, 743.5199841808085d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3203.25249155013d + "'", double4 == 3203.25249155013d);
    }

    @Test
    public void test09429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09429");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(576.6044402183862d, 545.9842633458804d, 1059.8088260909963d, 2063.761199868312d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1563.6884940099142d + "'", double4 == 1563.6884940099142d);
    }

    @Test
    public void test09430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09430");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(350.85976124043816d, 1107.0997065215752d, 226.69203958814956d, 609.147874598878d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 622.1195535749857d + "'", double4 == 622.1195535749857d);
    }

    @Test
    public void test09431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09431");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(178.50574239071582d, 1639.6751268255296d, 2996.483036718749d, 385.6725491638043d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2825.5820846644856d + "'", double4 == 2825.5820846644856d);
    }

    @Test
    public void test09432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09432");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(457.78584976429704d, 795.7800228934582d, 604.9083823509063d, 291.4933092840025d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 222.03208915399662d + "'", double4 == 222.03208915399662d);
    }

    @Test
    public void test09433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09433");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1357.1551954057154d, 3120.8360984995475d, 887.7178164262006d, 3235.435494709517d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 584.0367751894845d + "'", double4 == 584.0367751894845d);
    }

    @Test
    public void test09434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09434");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1283.448058678269d, 0.0d, 1107.4542691037336d, 3198.66493870721d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1923.2861231539619d + "'", double4 == 1923.2861231539619d);
    }

    @Test
    public void test09435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09435");
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
        int int31 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray6, intArray15);
        int[] intArray35 = new int[] { (byte) -1, (short) -1, ' ' };
        int[] intArray39 = new int[] { 1, 1, 100 };
        int[] intArray41 = new int[] { (byte) -1 };
        int int42 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray39, intArray41);
        int int43 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray35, intArray39);
        int int44 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray6, intArray35);
        int[] intArray48 = new int[] { 1, 1, 100 };
        int[] intArray50 = new int[] { (byte) -1 };
        int int51 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray48, intArray50);
        int[] intArray54 = new int[] { 'a', 10 };
        int int55 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray50, intArray54);
        int[] intArray59 = new int[] { 1, 1, 100 };
        int[] intArray61 = new int[] { (byte) -1 };
        int int62 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray59, intArray61);
        int[] intArray66 = new int[] { 1, 1, 100 };
        int[] intArray68 = new int[] { (byte) -1 };
        int int69 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray66, intArray68);
        int[] intArray72 = new int[] { 'a', 10 };
        int int73 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray68, intArray72);
        int int74 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray59, intArray72);
        int int75 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray50, intArray59);
        int[] intArray79 = new int[] { 1, 1, 100 };
        int[] intArray81 = new int[] { (byte) -1 };
        int int82 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray79, intArray81);
        int[] intArray86 = new int[] { 1, 1, 100 };
        int[] intArray88 = new int[] { (byte) -1 };
        int int89 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray86, intArray88);
        int[] intArray92 = new int[] { 'a', 10 };
        int int93 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray88, intArray92);
        int int94 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray79, intArray92);
        int int95 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray50, intArray92);
        int int96 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray6, intArray50);
        // The following exception was thrown during execution in test generation
        try {
            int int97 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray0, intArray50);
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
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[-1, -1, 32]");
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[-1]");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 72 + "'", int43 == 72);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray50), "[-1]");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray54), "[97, 10]");
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
        org.junit.Assert.assertNotNull(intArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray72), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
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
    }

    @Test
    public void test09436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09436");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1343.6916757289164d, 1198.0072810727606d, 737.7911629660048d, 1331.5145034609707d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 606.0228666401973d + "'", double4 == 606.0228666401973d);
    }

    @Test
    public void test09437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09437");
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
        double[] doubleArray66 = new double[] {};
        double double68 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray41, doubleArray66, 101);
        double double70 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray4, doubleArray41, (-1));
        double[] doubleArray74 = new double[] { 198.44088030501894d, 1311.354157651133d, 175.19235070254496d };
        double double76 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray4, doubleArray74, (int) (short) 10);
        java.lang.Class<?> wildcardClass77 = doubleArray4.getClass();
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
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[]");
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 0.0d + "'", double68 == 0.0d);
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + (-1.0d) + "'", double70 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray74), "[198.44088030501894, 1311.354157651133, 175.19235070254496]");
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + (-1.0d) + "'", double76 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass77);
    }

    @Test
    public void test09438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09438");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(0.0d, 3365.22242404278d, 993.6335652888822d, 623.5465540336345d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3735.309435298028d + "'", double4 == 3735.309435298028d);
    }

    @Test
    public void test09439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09439");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1197.6466171091483d, 883.2477228774341d, 1945.7116823361646d, 4213.551643492881d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4078.368985842463d + "'", double4 == 4078.368985842463d);
    }

    @Test
    public void test09440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09440");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(305.4177409815338d, 1377.2129977160603d, 1573.2338479784191d, 341.7378669222432d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2303.2912377907023d + "'", double4 == 2303.2912377907023d);
    }

    @Test
    public void test09441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09441");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1956.0610505372244d, 2951.1447732537763d, 1177.28438963434d, 1072.4841805113106d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2657.43725364535d + "'", double4 == 2657.43725364535d);
    }

    @Test
    public void test09442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09442");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(473.55406925345227d, 661.4062218796978d, 805.0518427817625d, 755.997710019333d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 426.08926166794544d + "'", double4 == 426.08926166794544d);
    }

    @Test
    public void test09443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09443");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(4688.439811842489d, 636.5834861894493d, 415.6397797070284d, 2698.79941054778d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 6335.015956493791d + "'", double4 == 6335.015956493791d);
    }

    @Test
    public void test09444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09444");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(724.9743092094438d, 1477.6363870750436d, 268.5218799278748d, 637.8514798973449d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1296.2373364592677d + "'", double4 == 1296.2373364592677d);
    }

    @Test
    public void test09445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09445");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1168.0564717759175d, 99.285439053062d, 4868.641140059928d, 329.5072715139937d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3794.4026734650333d + "'", double4 == 3794.4026734650333d);
    }

    @Test
    public void test09446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09446");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(925.5051661223237d, 295.4253067481773d, 3726.732216117128d, 499.5278466274377d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3005.3295898740644d + "'", double4 == 3005.3295898740644d);
    }

    @Test
    public void test09447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09447");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1950.8694433880958d, 322.4501563255963d, 1198.0072810727606d, 623.1222195523702d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1526.3401081834934d + "'", double4 == 1526.3401081834934d);
    }

    @Test
    public void test09448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09448");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(3535.582443605831d, 2022.9060016040892d, 59.37455997892704d, 805.1477944534023d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4693.966090777591d + "'", double4 == 4693.966090777591d);
    }

    @Test
    public void test09449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09449");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(272.0850365622572d, 374.33565897777544d, 1822.8586946789696d, 1032.5739367472079d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1727.2065035812036d + "'", double4 == 1727.2065035812036d);
    }

    @Test
    public void test09450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09450");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(757.8840741774023d, 5564.414943497599d, 3321.5533498988893d, 1179.212354252639d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2598.060367826254d + "'", double4 == 2598.060367826254d);
    }

    @Test
    public void test09451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09451");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(426.75714614915944d, 631.9185330175392d, 0.0d, 1733.5270328437382d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1374.6887642521624d + "'", double4 == 1374.6887642521624d);
    }

    @Test
    public void test09452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09452");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1205.7587838949864d, 0.0d, 1671.2103957794097d, 898.197566204712d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 557.8880762598643d + "'", double4 == 557.8880762598643d);
    }

    @Test
    public void test09453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09453");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(3010.1631836833194d, 807.7307936235277d, 444.63020367211396d, 1004.528663934579d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2762.3308503222565d + "'", double4 == 2762.3308503222565d);
    }

    @Test
    public void test09454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09454");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1380.3648998320687d, 485.9368605967579d, 611.5484027254348d, 793.4300519665393d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 967.2493586776095d + "'", double4 == 967.2493586776095d);
    }

    @Test
    public void test09455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09455");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(327.9313404651175d, 6874.75431853364d, 1235.2819840829552d, 1477.6363870750436d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 6304.468575076434d + "'", double4 == 6304.468575076434d);
    }

    @Test
    public void test09456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09456");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1272.2433549520586d, 398.293151952033d, 982.6424098054835d, 1855.3404218809549d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1746.6482150754969d + "'", double4 == 1746.6482150754969d);
    }

    @Test
    public void test09457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09457");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(206.8986500189719d, 410.4875640475244d, 814.2659300497917d, 939.3174188661832d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 951.4894985293852d + "'", double4 == 951.4894985293852d);
    }

    @Test
    public void test09458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09458");
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
        int int56 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray37, intArray52);
        int int57 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray13, intArray37);
        int[] intArray61 = new int[] { 1, 1, 100 };
        int[] intArray63 = new int[] { (byte) -1 };
        int int64 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray61, intArray63);
        int[] intArray67 = new int[] { 'a', 10 };
        int int68 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray63, intArray67);
        int[] intArray72 = new int[] { (byte) 1, (short) 1, (short) -1 };
        int int73 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray63, intArray72);
        int int74 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray13, intArray63);
        int[] intArray78 = new int[] { 1, 1, 100 };
        int[] intArray80 = new int[] { (byte) -1 };
        int int81 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray78, intArray80);
        int[] intArray84 = new int[] { 'a', 10 };
        int int85 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray80, intArray84);
        int[] intArray89 = new int[] { (byte) 1, (short) 1, (short) -1 };
        int int90 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray80, intArray89);
        int[] intArray94 = new int[] { (byte) -1, '#', (-1) };
        int int95 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray80, intArray94);
        int int96 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray13, intArray94);
        // The following exception was thrown during execution in test generation
        try {
            int int97 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray0, intArray13);
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
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertNotNull(intArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray78), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray80), "[-1]");
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + (-1) + "'", int81 == (-1));
        org.junit.Assert.assertNotNull(intArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray84), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + (-1) + "'", int85 == (-1));
        org.junit.Assert.assertNotNull(intArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray89), "[1, 1, -1]");
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + (-1) + "'", int90 == (-1));
        org.junit.Assert.assertNotNull(intArray94);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray94), "[-1, 35, -1]");
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + (-1) + "'", int95 == (-1));
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + (-1) + "'", int96 == (-1));
    }

    @Test
    public void test09459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09459");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(167.29384278124112d, 651.4276402304927d, 990.9382907452346d, 6141.851274476137d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 6031.063478465686d + "'", double4 == 6031.063478465686d);
    }

    @Test
    public void test09460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09460");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(605.3411715595164d, 831.249681825333d, 970.6014510601196d, 517.7839731622196d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 678.7259881637167d + "'", double4 == 678.7259881637167d);
    }

    @Test
    public void test09461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09461");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(0.0d, 1165.2355501668776d, 984.7350979794056d, 2461.4480277645876d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2280.9475755771155d + "'", double4 == 2280.9475755771155d);
    }

    @Test
    public void test09462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09462");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1179.7222842655474d, 837.7108581071841d, 446.615323216948d, 2044.1759868357929d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1133.4575511351622d + "'", double4 == 1133.4575511351622d);
    }

    @Test
    public void test09463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09463");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(2340.102817631847d, 1069.0226291276806d, 2455.1518168111033d, 289.8827617062961d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2053.445531279444d + "'", double4 == 2053.445531279444d);
    }

    @Test
    public void test09464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09464");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(651.381257831246d, 794.3718093678963d, 383.36776538226263d, 2734.1625945471005d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2207.8042776281877d + "'", double4 == 2207.8042776281877d);
    }

    @Test
    public void test09465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09465");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(2548.18217586309d, 1249.643401085903d, 1285.8100014112927d, 877.7040025535117d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2093.8196756965162d + "'", double4 == 2093.8196756965162d);
    }

    @Test
    public void test09466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09466");
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
        int[] intArray67 = new int[] { (byte) 1, (short) 1, (short) -1 };
        int int68 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray58, intArray67);
        int int69 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray51, intArray58);
        int[] intArray73 = new int[] { 1, 1, 100 };
        int[] intArray75 = new int[] { (byte) -1 };
        int int76 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray73, intArray75);
        int[] intArray79 = new int[] { 'a', 10 };
        int int80 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray75, intArray79);
        int[] intArray84 = new int[] { (byte) 1, (short) 1, (short) -1 };
        int int85 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray75, intArray84);
        int[] intArray89 = new int[] { (byte) -1, '#', (-1) };
        int int90 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray75, intArray89);
        int int91 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray58, intArray75);
        int int92 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray29, intArray58);
        int[] intArray93 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int94 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray58, intArray93);
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
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray67), "[1, 1, -1]");
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertNotNull(intArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray73), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray75), "[-1]");
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-1) + "'", int76 == (-1));
        org.junit.Assert.assertNotNull(intArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray79), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + (-1) + "'", int80 == (-1));
        org.junit.Assert.assertNotNull(intArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray84), "[1, 1, -1]");
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + (-1) + "'", int85 == (-1));
        org.junit.Assert.assertNotNull(intArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray89), "[-1, 35, -1]");
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + (-1) + "'", int90 == (-1));
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 0 + "'", int91 == 0);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 0 + "'", int92 == 0);
    }

    @Test
    public void test09467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09467");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1247.29758736029d, 285.878214399093d, 537.326347961464d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1435.2039688519208d + "'", double4 == 1435.2039688519208d);
    }

    @Test
    public void test09468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09468");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1774.9443059735684d, 0.0d, 702.3037359722722d, 5468.032973265415d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3845.706917706051d + "'", double4 == 3845.706917706051d);
    }

    @Test
    public void test09469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09469");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(825.8447855853702d, 332.6325848351356d, 2626.4941212379244d, 498.7182441902145d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1830.1228931607686d + "'", double4 == 1830.1228931607686d);
    }

    @Test
    public void test09470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09470");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1332.504211889108d, 546.5855220111873d, 875.0289624209219d, 2856.5139504314247d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2767.4036778884238d + "'", double4 == 2767.4036778884238d);
    }

    @Test
    public void test09471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09471");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1188.1860396991142d, 3010.1631836833194d, 1782.7181711678513d, 1058.8724802560664d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 608.4327834729079d + "'", double4 == 608.4327834729079d);
    }

    @Test
    public void test09472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09472");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(436.0365379798176d, 2250.8869764609344d, 603.2931024537861d, 232.4213562373095d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 263.5031320414795d + "'", double4 == 263.5031320414795d);
    }

    @Test
    public void test09473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09473");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(2472.1483842289454d, 97.6174960602164d, 435.27058973391496d, 1196.7534915024055d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2403.227680037803d + "'", double4 == 2403.227680037803d);
    }

    @Test
    public void test09474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09474");
        int[] intArray0 = null;
        int[] intArray1 = new int[] {};
        int[] intArray5 = new int[] { 1, 1, 100 };
        int[] intArray7 = new int[] { (byte) -1 };
        int int8 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray5, intArray7);
        int[] intArray14 = new int[] { (byte) 10, (byte) 100, ' ', (short) -1, (short) 100 };
        int int15 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray7, intArray14);
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
        int[] intArray48 = new int[] { (byte) 1, (short) 1, (short) -1 };
        int int49 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray39, intArray48);
        int int50 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray32, intArray39);
        int[] intArray54 = new int[] { 1, 1, 100 };
        int[] intArray56 = new int[] { (byte) -1 };
        int int57 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray54, intArray56);
        int[] intArray60 = new int[] { 'a', 10 };
        int int61 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray56, intArray60);
        int[] intArray65 = new int[] { (byte) 1, (short) 1, (short) -1 };
        int int66 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray56, intArray65);
        int[] intArray70 = new int[] { (byte) -1, '#', (-1) };
        int int71 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray56, intArray70);
        int int72 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray39, intArray56);
        int[] intArray76 = new int[] { 1, 1, 100 };
        int[] intArray78 = new int[] { (byte) -1 };
        int int79 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray76, intArray78);
        int[] intArray82 = new int[] { 'a', 10 };
        int int83 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray78, intArray82);
        int[] intArray87 = new int[] { (byte) 1, (short) 1, (short) -1 };
        int int88 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray78, intArray87);
        int int89 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray39, intArray78);
        int int90 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray25, intArray78);
        int int91 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray14, intArray25);
        int int92 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray1, intArray25);
        // The following exception was thrown during execution in test generation
        try {
            int int93 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray0, intArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[10, 100, 32, -1, 100]");
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
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[1, 1, -1]");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
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
        org.junit.Assert.assertNotNull(intArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray70), "[-1, 35, -1]");
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
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
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + (-1) + "'", int90 == (-1));
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + (-1) + "'", int91 == (-1));
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + (-1) + "'", int92 == (-1));
    }

    @Test
    public void test09475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09475");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(3025.9840131491896d, 1782.6739631584846d, 901.3253854204611d, 879.9527986037731d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3027.37979228344d + "'", double4 == 3027.37979228344d);
    }

    @Test
    public void test09476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09476");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(692.0591126438114d, 424.55910681763555d, 426.75714614915944d, 433.6727012248034d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 370.33588947322175d + "'", double4 == 370.33588947322175d);
    }

    @Test
    public void test09477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09477");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(690.3361644802496d, 500.5657799793145d, 764.0617385356554d, 546.2486273454158d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 161.85388048292586d + "'", double4 == 161.85388048292586d);
    }

    @Test
    public void test09478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09478");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1543.3137699551608d, 1817.4440666527125d, 1587.5845320356902d, 709.7268866212866d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 834.7616380988485d + "'", double4 == 834.7616380988485d);
    }

    @Test
    public void test09479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09479");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(0.0d, 840.9406893232934d, 1111.37344427019d, 1293.6851270936224d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1705.512281014777d + "'", double4 == 1705.512281014777d);
    }

    @Test
    public void test09480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09480");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(478.63387776697317d, 1173.0068643841632d, 877.9120720243004d, 482.5133769882191d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1089.7716816532713d + "'", double4 == 1089.7716816532713d);
    }

    @Test
    public void test09481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09481");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(514.9194063045376d, 264.9219637400125d, 212.0862081751727d, 1746.0118008651607d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1783.9230352545133d + "'", double4 == 1783.9230352545133d);
    }

    @Test
    public void test09482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09482");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(3412.4466427809625d, 381.1670711159525d, 1168.0564717759175d, 417.07297918251146d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2280.296079071604d + "'", double4 == 2280.296079071604d);
    }

    @Test
    public void test09483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09483");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1155.4050794581465d, 1102.5320475851477d, 812.3403011217949d, 756.7837905346028d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 688.8130353868964d + "'", double4 == 688.8130353868964d);
    }

    @Test
    public void test09484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09484");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(2248.98265148586d, 1428.177684253231d, 779.8923271374493d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2686.289140762492d + "'", double4 == 2686.289140762492d);
    }

    @Test
    public void test09485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09485");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(911.7728162024935d, 1930.5996223047139d, 547.552647032441d, 238.57103000254892d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2056.2487614722177d + "'", double4 == 2056.2487614722177d);
    }

    @Test
    public void test09486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09486");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(3382.3252091536906d, 696.4536903628047d, 761.6521423750089d, 1803.668260918566d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3727.887637334443d + "'", double4 == 3727.887637334443d);
    }

    @Test
    public void test09487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09487");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(0.0d, 736.3225982720746d, 1084.368875227418d, 668.304405283657d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1273.7686743218007d + "'", double4 == 1273.7686743218007d);
    }

    @Test
    public void test09488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09488");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1188.1697342114403d, 0.0d, 1237.7331348218322d, 2665.866664992479d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1478.527899608177d + "'", double4 == 1478.527899608177d);
    }

    @Test
    public void test09489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09489");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(766.9371007545403d, 5402.4595282352675d, 1569.7703827734108d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1110.2854566421065d + "'", double4 == 1110.2854566421065d);
    }

    @Test
    public void test09490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09490");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(360.37692385789285d, 575.7760047012375d, 515.2878993762027d, 1902.3036446621147d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1549.688814783825d + "'", double4 == 1549.688814783825d);
    }

    @Test
    public void test09491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09491");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(335.26199318857306d, 725.0886617759102d, 238.90442615441754d, 941.2198455681425d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 613.5712669162416d + "'", double4 == 613.5712669162416d);
    }

    @Test
    public void test09492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09492");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1377.902169392842d, 1149.35258146257d, 973.531495516293d, 115.14060609640867d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1438.5826492427104d + "'", double4 == 1438.5826492427104d);
    }

    @Test
    public void test09493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09493");
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
        double[] doubleArray86 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray87 = new double[] {};
        double double89 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray86, doubleArray87, 0);
        double double91 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray78, doubleArray87, 1);
        double double93 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray71, doubleArray87, (int) (short) 10);
        double double95 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray61, doubleArray71, (int) ' ');
        double double97 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray32, doubleArray61, (int) (byte) 10);
        java.lang.Class<?> wildcardClass98 = doubleArray61.getClass();
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
    public void test09494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09494");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(3251.2001998753476d, 2774.2754561865954d, 340.56581463270095d, 556.8876234021042d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 5128.022218027138d + "'", double4 == 5128.022218027138d);
    }

    @Test
    public void test09495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09495");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1666.3855043568901d, 1140.588688718335d, 1293.6851270936224d, 416.2672975563163d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1097.0217684252866d + "'", double4 == 1097.0217684252866d);
    }

    @Test
    public void test09496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09496");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(385.69367074008187d, 834.9055331603478d, 503.13322656792127d, 751.8914991598874d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 200.45358982829976d + "'", double4 == 200.45358982829976d);
    }

    @Test
    public void test09497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09497");
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
        int[] intArray47 = new int[] { (byte) 10, (byte) 100, ' ', (short) -1, (short) 100 };
        int int48 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray40, intArray47);
        int[] intArray52 = new int[] { 1, 1, 100 };
        int[] intArray54 = new int[] { (byte) -1 };
        int int55 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray52, intArray54);
        int[] intArray59 = new int[] { 1, 1, 100 };
        int[] intArray61 = new int[] { (byte) -1 };
        int int62 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray59, intArray61);
        int[] intArray65 = new int[] { 'a', 10 };
        int int66 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray61, intArray65);
        int int67 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray52, intArray65);
        int int68 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray40, intArray65);
        int[] intArray72 = new int[] { 1, 1, 100 };
        int[] intArray74 = new int[] { (byte) -1 };
        int int75 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray72, intArray74);
        int[] intArray78 = new int[] { 'a', 10 };
        int int79 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray74, intArray78);
        int int80 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray40, intArray74);
        int int81 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray31, intArray40);
        // The following exception was thrown during execution in test generation
        try {
            int int82 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray0, intArray31);
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
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[10, 100, 32, -1, 100]");
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
        org.junit.Assert.assertNotNull(intArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray72), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray74), "[-1]");
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
        org.junit.Assert.assertNotNull(intArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray78), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + (-1) + "'", int79 == (-1));
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + (-1) + "'", int81 == (-1));
    }

    @Test
    public void test09498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09498");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(308.20997064862183d, 1966.05622276884d, 32.504777275138906d, 1723.5636749690511d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 518.1977411732717d + "'", double4 == 518.1977411732717d);
    }

    @Test
    public void test09499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09499");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(0.0d, 941.1476765326927d, 748.4826533653949d, 569.6093702673131d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 940.5748864844451d + "'", double4 == 940.5748864844451d);
    }

    @Test
    public void test09500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09500");
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
        double[] doubleArray34 = new double[] { 221.38186019448963d, 364.34654754189563d, 1789.0559517170952d, 896.632439101549d, 5328.628649866165d, 2634.3844687894953d };
        double double36 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray21, doubleArray34, 137);
        double[] doubleArray41 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray42 = new double[] {};
        double double44 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray41, doubleArray42, 0);
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
        double double72 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray58, doubleArray67, (int) (short) 100);
        double double74 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray42, doubleArray58, (int) '4');
        double double76 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray34, doubleArray58, 137);
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
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[221.38186019448963, 364.34654754189563, 1789.0559517170952, 896.632439101549, 5328.628649866165, 2634.3844687894953]");
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
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + (-1.0d) + "'", double72 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 0.0d + "'", double74 == 0.0d);
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + (-1.0d) + "'", double76 == (-1.0d));
    }
}

