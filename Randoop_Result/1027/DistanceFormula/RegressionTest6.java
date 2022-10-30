package DistanceFormula;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest6 {

    public static boolean debug = false;

    @Test
    public void test03001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03001");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(738.2667297024383d, 1705.4264381633693d, 384.57813099055943d, 287.4213562373095d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 573.0245855403448d + "'", double4 == 573.0245855403448d);
    }

    @Test
    public void test03002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03002");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(2694.5778500277124d, 97.10956325067855d, 2633.3648457214576d, 2668.977638529901d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 66.35060455587607d + "'", double4 == 66.35060455587607d);
    }

    @Test
    public void test03003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03003");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(184.58727687869154d, 459.7232166467719d, 293.1835845232116d, 264.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 304.31952429129194d + "'", double4 == 304.31952429129194d);
    }

    @Test
    public void test03004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03004");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(712.3285698638872d, 459.7232166467719d, 170.41777368493752d, 692.0591126438114d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 542.2897398174703d + "'", double4 == 542.2897398174703d);
    }

    @Test
    public void test03005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03005");
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
        int int47 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray22, intArray31);
        int int48 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray15, intArray22);
        int[] intArray52 = new int[] { 1, 1, 100 };
        int[] intArray54 = new int[] { (byte) -1 };
        int int55 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray52, intArray54);
        int[] intArray59 = new int[] { 1, 1, 100 };
        int[] intArray61 = new int[] { (byte) -1 };
        int int62 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray59, intArray61);
        int int63 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray52, intArray61);
        int int64 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray15, intArray52);
        int[] intArray68 = new int[] { '4', (short) 100, '#' };
        int int69 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray15, intArray68);
        int[] intArray73 = new int[] { 1, 1, 100 };
        int[] intArray75 = new int[] { (byte) -1 };
        int int76 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray73, intArray75);
        int[] intArray79 = new int[] { 'a', 10 };
        int int80 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray75, intArray79);
        int int81 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray68, intArray75);
        // The following exception was thrown during execution in test generation
        try {
            int int82 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray0, intArray68);
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
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 101 + "'", int64 == 101);
        org.junit.Assert.assertNotNull(intArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray68), "[52, 100, 35]");
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 186 + "'", int69 == 186);
        org.junit.Assert.assertNotNull(intArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray73), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray75), "[-1]");
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-1) + "'", int76 == (-1));
        org.junit.Assert.assertNotNull(intArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray79), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + (-1) + "'", int80 == (-1));
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + (-1) + "'", int81 == (-1));
    }

    @Test
    public void test03006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03006");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(728.7328190589028d, 952.4965584854033d, 245.189347980773d, 776.9027688652584d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 485.9368605967579d + "'", double4 == 485.9368605967579d);
    }

    @Test
    public void test03007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03007");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1035.759131366233d, 0.0d, 278.30377623382043d, 1580.7540211106561d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 933.1441715331588d + "'", double4 == 933.1441715331588d);
    }

    @Test
    public void test03008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03008");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(188.00592040346186d, 1790.041294576208d, 77.31557716268777d, 812.2303596667742d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 633.9625404236099d + "'", double4 == 633.9625404236099d);
    }

    @Test
    public void test03009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03009");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(704.5294709279362d, 507.1142497504701d, 378.0d, 762.1889468010093d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 331.58122766893104d + "'", double4 == 331.58122766893104d);
    }

    @Test
    public void test03010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03010");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(403.9037707077835d, 1072.4424828297465d, 720.2158681436334d, 473.0207883763717d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 323.77539300519203d + "'", double4 == 323.77539300519203d);
    }

    @Test
    public void test03011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03011");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(480.56201986901675d, 1915.2171449349437d, 1582.0156297267456d, 755.6071571265365d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2261.063597666136d + "'", double4 == 2261.063597666136d);
    }

    @Test
    public void test03012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03012");
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
        int[] intArray87 = new int[] { 'a', 10 };
        int int88 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray83, intArray87);
        int int89 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray75, intArray83);
        // The following exception was thrown during execution in test generation
        try {
            int int90 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray0, intArray75);
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
        org.junit.Assert.assertNotNull(intArray87);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray87), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + (-1) + "'", int88 == (-1));
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + (-1) + "'", int89 == (-1));
    }

    @Test
    public void test03013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03013");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(2471.960735276367d, 468.5495722761949d, 233.19026405631413d, 275.49796277521034d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2431.8220807210373d + "'", double4 == 2431.8220807210373d);
    }

    @Test
    public void test03014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03014");
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
        double[] doubleArray43 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray44 = new double[] {};
        double double46 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray43, doubleArray44, 0);
        double[] doubleArray51 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray52 = new double[] {};
        double double54 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray51, doubleArray52, 0);
        double double56 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray43, doubleArray52, (int) (short) 100);
        double[] doubleArray61 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray62 = new double[] {};
        double double64 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray61, doubleArray62, 0);
        double[] doubleArray69 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray70 = new double[] {};
        double double72 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray69, doubleArray70, 0);
        double double74 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray62, doubleArray70, (int) (byte) 1);
        double double76 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray52, doubleArray70, 0);
        double double78 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray22, doubleArray70, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            double double80 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray0, doubleArray22, (int) (short) 0);
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
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 0.0d + "'", double74 == 0.0d);
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 0.0d + "'", double76 == 0.0d);
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + 0.0d + "'", double78 == 0.0d);
    }

    @Test
    public void test03015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03015");
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
        java.lang.Class<?> wildcardClass78 = doubleArray22.getClass();
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
    public void test03016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03016");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(811.7841946802557d, 281.88511874515d, 351.3746809091957d, 1273.7081586856443d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1452.2325537115544d + "'", double4 == 1452.2325537115544d);
    }

    @Test
    public void test03017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03017");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(368.39470755902255d, 1535.3460709311994d, 704.8977144889124d, 418.8312603752497d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 340.26183966592777d + "'", double4 == 340.26183966592777d);
    }

    @Test
    public void test03018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03018");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(490.7494344988548d, 508.15729725356135d, 460.63617381552586d, 594.0319464909992d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 115.98790992076675d + "'", double4 == 115.98790992076675d);
    }

    @Test
    public void test03019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03019");
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
        int int52 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray37, intArray50);
        int[] intArray56 = new int[] { 1, 1, 100 };
        int[] intArray58 = new int[] { (byte) -1 };
        int int59 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray56, intArray58);
        int[] intArray62 = new int[] { 'a', 10 };
        int int63 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray58, intArray62);
        int[] intArray67 = new int[] { (byte) 1, (short) 1, (short) -1 };
        int int68 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray58, intArray67);
        int[] intArray72 = new int[] { (byte) -1, '#', (-1) };
        int int73 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray58, intArray72);
        int int74 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray37, intArray58);
        int[] intArray78 = new int[] { 1, 1, 100 };
        int[] intArray80 = new int[] { (byte) -1 };
        int int81 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray78, intArray80);
        int[] intArray84 = new int[] { 'a', 10 };
        int int85 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray80, intArray84);
        int[] intArray89 = new int[] { (byte) 1, (short) 1, (short) -1 };
        int int90 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray80, intArray89);
        int[] intArray94 = new int[] { (byte) -1, '#', (-1) };
        int int95 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray80, intArray94);
        int int96 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray37, intArray80);
        int int97 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray5, intArray80);
        java.lang.Class<?> wildcardClass98 = intArray80.getClass();
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
        org.junit.Assert.assertNotNull(intArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray72), "[-1, 35, -1]");
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
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
        org.junit.Assert.assertTrue("'" + int97 + "' != '" + 0 + "'", int97 == 0);
        org.junit.Assert.assertNotNull(wildcardClass98);
    }

    @Test
    public void test03020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03020");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(626.2527251290963d, 92.25294381252866d, 583.1360242569174d, 1221.248948951979d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 596.5564149831856d + "'", double4 == 596.5564149831856d);
    }

    @Test
    public void test03021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03021");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(2256.576446777686d, 335.49898510954745d, 282.4412369416548d, 1476.1683711129729d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3114.804595839457d + "'", double4 == 3114.804595839457d);
    }

    @Test
    public void test03022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03022");
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
        double double92 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray22, doubleArray41, 10);
        java.lang.Class<?> wildcardClass93 = doubleArray41.getClass();
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
    public void test03023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03023");
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
        int int25 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray10, intArray23);
        int[] intArray29 = new int[] { 1, 1, 100 };
        int[] intArray31 = new int[] { (byte) -1 };
        int int32 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray29, intArray31);
        int[] intArray35 = new int[] { 'a', 10 };
        int int36 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray31, intArray35);
        int[] intArray40 = new int[] { (byte) 1, (short) 1, (short) -1 };
        int int41 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray31, intArray40);
        int[] intArray45 = new int[] { (byte) -1, '#', (-1) };
        int int46 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray31, intArray45);
        int int47 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray10, intArray31);
        int[] intArray51 = new int[] { 1, 1, 100 };
        int[] intArray53 = new int[] { (byte) -1 };
        int int54 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray51, intArray53);
        int[] intArray57 = new int[] { 'a', 10 };
        int int58 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray53, intArray57);
        int[] intArray62 = new int[] { (byte) 1, (short) 1, (short) -1 };
        int int63 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray53, intArray62);
        int[] intArray67 = new int[] { (byte) -1, '#', (-1) };
        int int68 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray53, intArray67);
        int int69 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray10, intArray53);
        int[] intArray73 = new int[] { 1, 1, 100 };
        int[] intArray75 = new int[] { (byte) -1 };
        int int76 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray73, intArray75);
        int[] intArray79 = new int[] { 'a', 10 };
        int int80 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray75, intArray79);
        int[] intArray84 = new int[] { (byte) 1, (short) 1, (short) -1 };
        int int85 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray75, intArray84);
        int[] intArray89 = new int[] { (byte) -1, '#', (-1) };
        int int90 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray75, intArray89);
        int int91 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray10, intArray75);
        int int92 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray5, intArray75);
        java.lang.Class<?> wildcardClass93 = intArray5.getClass();
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
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray45), "[-1, 35, -1]");
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
        org.junit.Assert.assertNotNull(intArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray62), "[1, 1, -1]");
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray67), "[-1, 35, -1]");
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
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
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + (-1) + "'", int91 == (-1));
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 0 + "'", int92 == 0);
        org.junit.Assert.assertNotNull(wildcardClass93);
    }

    @Test
    public void test03024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03024");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(532.3985198594888d, 754.8618148368492d, 401.22409534707685d, 388.2562455613085d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 194.89413763890983d + "'", double4 == 194.89413763890983d);
    }

    @Test
    public void test03025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03025");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(383.60405834053d, 1489.656551006283d, 1357.3729401151645d, 892.774615770831d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1098.8541721568452d + "'", double4 == 1098.8541721568452d);
    }

    @Test
    public void test03026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03026");
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
        double double34 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray21, doubleArray30, (int) (short) 100);
        double[] doubleArray39 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray40 = new double[] {};
        double double42 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray39, doubleArray40, 0);
        double double44 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray21, doubleArray39, (int) (byte) 0);
        double double46 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray14, doubleArray39, (int) (short) 100);
        double[] doubleArray51 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray52 = new double[] {};
        double double54 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray51, doubleArray52, 0);
        double[] doubleArray59 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray60 = new double[] {};
        double double62 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray59, doubleArray60, 0);
        double double64 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray51, doubleArray60, (int) (short) 100);
        double double66 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray14, doubleArray51, 100);
        double[] doubleArray71 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray72 = new double[] {};
        double double74 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray71, doubleArray72, 0);
        double[] doubleArray79 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray80 = new double[] {};
        double double82 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray79, doubleArray80, 0);
        double double84 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray71, doubleArray80, 1);
        double double86 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray51, doubleArray71, 1);
        // The following exception was thrown during execution in test generation
        try {
            double double88 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray0, doubleArray71, 69);
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
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + (-1.0d) + "'", double34 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[]");
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + (-1.0d) + "'", double42 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + Double.POSITIVE_INFINITY + "'", double44 == Double.POSITIVE_INFINITY);
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
        org.junit.Assert.assertTrue("'" + double86 + "' != '" + 0.0d + "'", double86 == 0.0d);
    }

    @Test
    public void test03027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03027");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(953.5446166253988d, 372.95052751976243d, 1143.28819990604d, 803.0937329814276d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 619.8867887423064d + "'", double4 == 619.8867887423064d);
    }

    @Test
    public void test03028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03028");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(793.4300519665393d, 149.16705768146082d, 1097.6374505374613d, 861.5390074473373d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 311.7386263554344d + "'", double4 == 311.7386263554344d);
    }

    @Test
    public void test03029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03029");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(480.47322196858494d, 649.1951278370022d, 1201.6280100200713d, 338.19105883602975d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1032.1588570524589d + "'", double4 == 1032.1588570524589d);
    }

    @Test
    public void test03030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03030");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1393.7615781276963d, 268.7797268354929d, 575.6271931406408d, 340.56581463270095d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 889.9204727842637d + "'", double4 == 889.9204727842637d);
    }

    @Test
    public void test03031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03031");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(649.5045751650479d, 145.74368975806703d, 332.0533251182606d, 1118.0418394490325d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1289.7493997377528d + "'", double4 == 1289.7493997377528d);
    }

    @Test
    public void test03032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03032");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(250.49339306579066d, 296.4987063121494d, 1017.2158503276609d, 712.6228328373139d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 895.2245224373729d + "'", double4 == 895.2245224373729d);
    }

    @Test
    public void test03033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03033");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(415.6127619444709d, 217.47976508146692d, 1044.516798678362d, 380.6284109636399d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 792.0526826160641d + "'", double4 == 792.0526826160641d);
    }

    @Test
    public void test03034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03034");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(262.17083616066867d, 1972.118862235286d, 416.4983091590088d, 475.8773849871957d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1650.5689502464306d + "'", double4 == 1650.5689502464306d);
    }

    @Test
    public void test03035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03035");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(989.8852570493364d, 559.952581927014d, 668.304405283657d, 77.86254967678965d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 803.6708840159037d + "'", double4 == 803.6708840159037d);
    }

    @Test
    public void test03036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03036");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(895.2245224373729d, 713.2658664605801d, 270.44266936177814d, 689.3330009868114d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 657.8325642120502d + "'", double4 == 657.8325642120502d);
    }

    @Test
    public void test03037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03037");
        int[] intArray0 = null;
        int[] intArray4 = new int[] { 1, 1, 100 };
        int[] intArray6 = new int[] { (byte) -1 };
        int int7 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray4, intArray6);
        int[] intArray13 = new int[] { (byte) 10, (byte) 100, ' ', (short) -1, (short) 100 };
        int int14 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray6, intArray13);
        int[] intArray21 = new int[] { 0, 215, 1, 69, (short) 10, (short) 100 };
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
        int[] intArray69 = new int[] { 1, 1, 100 };
        int[] intArray71 = new int[] { (byte) -1 };
        int int72 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray69, intArray71);
        int[] intArray75 = new int[] { 'a', 10 };
        int int76 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray71, intArray75);
        int[] intArray80 = new int[] { (byte) 1, (short) 1, (short) -1 };
        int int81 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray71, intArray80);
        int int82 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray59, intArray71);
        int[] intArray86 = new int[] { 1, 1, 100 };
        int[] intArray88 = new int[] { (byte) -1 };
        int int89 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray86, intArray88);
        int int90 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray71, intArray88);
        int int91 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray21, intArray88);
        int int92 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray6, intArray88);
        // The following exception was thrown during execution in test generation
        try {
            int int93 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray0, intArray6);
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
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0, 215, 1, 69, 10, 100]");
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
        org.junit.Assert.assertNotNull(intArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray69), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray71), "[-1]");
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-1) + "'", int72 == (-1));
        org.junit.Assert.assertNotNull(intArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray75), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-1) + "'", int76 == (-1));
        org.junit.Assert.assertNotNull(intArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray80), "[1, 1, -1]");
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + (-1) + "'", int81 == (-1));
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 0 + "'", int82 == 0);
        org.junit.Assert.assertNotNull(intArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray86), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray88);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray88), "[-1]");
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + (-1) + "'", int89 == (-1));
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 0 + "'", int90 == 0);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + (-1) + "'", int91 == (-1));
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 0 + "'", int92 == 0);
    }

    @Test
    public void test03038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03038");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(605.205537045175d, 1184.5932558920372d, 1185.0088054428425d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1764.3965242897048d + "'", double4 == 1764.3965242897048d);
    }

    @Test
    public void test03039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03039");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(345.3113456421975d, 1011.7972527379859d, 98.5193674472778d, 402.20995176251364d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 253.26612856794847d + "'", double4 == 253.26612856794847d);
    }

    @Test
    public void test03040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03040");
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
        int[] intArray69 = new int[] { 'a', 10 };
        int int70 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray65, intArray69);
        int[] intArray74 = new int[] { (byte) 1, (short) 1, (short) -1 };
        int int75 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray65, intArray74);
        int[] intArray79 = new int[] { (byte) -1, '#', (-1) };
        int int80 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray65, intArray79);
        int int81 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray53, intArray79);
        int int82 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray14, intArray53);
        int[] intArray86 = new int[] { 1, 1, 100 };
        int[] intArray88 = new int[] { (byte) -1 };
        int int89 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray86, intArray88);
        int int90 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray53, intArray86);
        java.lang.Class<?> wildcardClass91 = intArray53.getClass();
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
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + (-1) + "'", int82 == (-1));
        org.junit.Assert.assertNotNull(intArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray86), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray88);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray88), "[-1]");
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + (-1) + "'", int89 == (-1));
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + (-1) + "'", int90 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass91);
    }

    @Test
    public void test03041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03041");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(2548.18217586309d, 567.8266350960342d, 4071.2522367299543d, 1006.4589976708653d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1961.7024234416954d + "'", double4 == 1961.7024234416954d);
    }

    @Test
    public void test03042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03042");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(782.3144896032597d, 766.9683109428049d, 646.3510287776788d, 439.2591763903302d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 369.01627417133034d + "'", double4 == 369.01627417133034d);
    }

    @Test
    public void test03043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03043");
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
        double[] doubleArray90 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double92 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray20, doubleArray90, 0);
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
    }

    @Test
    public void test03044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03044");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(727.7419504237471d, 1066.464717489007d, 366.3917665186351d, 1180.3578280495476d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 475.24329446565264d + "'", double4 == 475.24329446565264d);
    }

    @Test
    public void test03045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03045");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(308.7413345116753d, 1030.1790390362178d, 1182.7634239574209d, 1290.9135650720034d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1134.7566154815313d + "'", double4 == 1134.7566154815313d);
    }

    @Test
    public void test03046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03046");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1275.8208123260843d, 858.8263355548762d, 786.3350760679193d, 743.2187758710172d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 605.0932959420239d + "'", double4 == 605.0932959420239d);
    }

    @Test
    public void test03047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03047");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(394.14097853281095d, 263.5389460810053d, (double) 101, 342.4995047812538d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 372.10153723305945d + "'", double4 == 372.10153723305945d);
    }

    @Test
    public void test03048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03048");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(762.2907433365718d, 513.8338591778103d, 296.0129554346333d, 270.0550079678848d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 710.056639111864d + "'", double4 == 710.056639111864d);
    }

    @Test
    public void test03049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03049");
        double[] doubleArray0 = null;
        double[] doubleArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray0, doubleArray1, 26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03050");
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
        double[] doubleArray92 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double94 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray1, doubleArray92, 101);
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
    }

    @Test
    public void test03051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03051");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(486.34266847173456d, 733.1718350049796d, 2766.1429331391d, 896.0323498545016d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2316.319252997933d + "'", double4 == 2316.319252997933d);
    }

    @Test
    public void test03052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03052");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1849.2004754411312d, 1128.6419161452409d, 1274.21930025592d, 478.8997982639517d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1224.7232930665004d + "'", double4 == 1224.7232930665004d);
    }

    @Test
    public void test03053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03053");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(257.74051779498967d, 710.056639111864d, 1528.7429140467852d, 1532.6762509565908d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1800.2522642591275d + "'", double4 == 1800.2522642591275d);
    }

    @Test
    public void test03054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03054");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(213.3473584230394d, 670.1381944953195d, 0.0d, 580.7258883643475d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 424.83417895447803d + "'", double4 == 424.83417895447803d);
    }

    @Test
    public void test03055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03055");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1572.0167674001102d, 670.1381944953195d, 671.6551883854427d, 1002.6348330943177d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1232.8582176136658d + "'", double4 == 1232.8582176136658d);
    }

    @Test
    public void test03056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03056");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(894.371211079321d, 467.41331001723336d, 513.9459612349482d, 685.0850282096962d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 598.0969680368357d + "'", double4 == 598.0969680368357d);
    }

    @Test
    public void test03057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03057");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(3204.7597357909353d, 345.02253292181524d, 656.2457151754967d, 596.5564149831856d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2800.047902676809d + "'", double4 == 2800.047902676809d);
    }

    @Test
    public void test03058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03058");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1323.0790153317653d, 510.9207644402136d, 0.0d, 389.23201588782825d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1619.4469115045783d + "'", double4 == 1619.4469115045783d);
    }

    @Test
    public void test03059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03059");
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
            double double80 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray53, doubleArray78, (int) (byte) 10);
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
    public void test03060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03060");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(215.05196722620533d, 847.3429777902343d, 858.8263355548762d, 713.2658664605801d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 814.040863045154d + "'", double4 == 814.040863045154d);
    }

    @Test
    public void test03061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03061");
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
        int[] intArray86 = new int[] { 1, 1, 100 };
        int[] intArray88 = new int[] { (byte) -1 };
        int int89 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray86, intArray88);
        int[] intArray95 = new int[] { (byte) 10, (byte) 100, ' ', (short) -1, (short) 100 };
        int int96 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray88, intArray95);
        int int97 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray79, intArray95);
        int int98 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray71, intArray95);
        java.lang.Class<?> wildcardClass99 = intArray95.getClass();
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
        org.junit.Assert.assertNotNull(intArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray86), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray88);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray88), "[-1]");
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + (-1) + "'", int89 == (-1));
        org.junit.Assert.assertNotNull(intArray95);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray95), "[10, 100, 32, -1, 100]");
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + (-1) + "'", int96 == (-1));
        org.junit.Assert.assertTrue("'" + int97 + "' != '" + (-1) + "'", int97 == (-1));
        org.junit.Assert.assertTrue("'" + int98 + "' != '" + (-1) + "'", int98 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass99);
    }

    @Test
    public void test03062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03062");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1488.063822424116d, 298.5992668050363d, 239.34555184024387d, 943.279124792876d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1362.3830907872932d + "'", double4 == 1362.3830907872932d);
    }

    @Test
    public void test03063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03063");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(340.31553305515484d, 239.7013122060673d, 555.8500408038165d, 248.10393736653214d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 223.93713290912643d + "'", double4 == 223.93713290912643d);
    }

    @Test
    public void test03064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03064");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1034.6208250899676d, 235.37621103794947d, 861.5390074473373d, 1276.2921679854244d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 297.2580588905373d + "'", double4 == 297.2580588905373d);
    }

    @Test
    public void test03065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03065");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(152.72882127449927d, 97.09065754677769d, 0.0d, 503.13322656792127d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 382.2425147690072d + "'", double4 == 382.2425147690072d);
    }

    @Test
    public void test03066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03066");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1227.0918332767103d, 221.47798505250438d, 1328.573669597486d, 1332.2199015767492d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 146.11801342590982d + "'", double4 == 146.11801342590982d);
    }

    @Test
    public void test03067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03067");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(704.768747047279d, 275.0065142587339d, 691.8072225542435d, (double) 10L);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 277.9680387517694d + "'", double4 == 277.9680387517694d);
    }

    @Test
    public void test03068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03068");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(717.9718079630422d, 418.8312603752497d, 360.74512521998355d, 517.7839731622196d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 456.17939553002856d + "'", double4 == 456.17939553002856d);
    }

    @Test
    public void test03069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03069");
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
        double[] doubleArray28 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double30 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray4, doubleArray28, 10);
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
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + Double.POSITIVE_INFINITY + "'", double27 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test03070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03070");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(355.1331080333377d, 457.2390555781002d, 1601.8005269650744d, 269.3598320793501d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1249.6146239116272d + "'", double4 == 1249.6146239116272d);
    }

    @Test
    public void test03071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03071");
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
        double[] doubleArray48 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray49 = new double[] {};
        double double51 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray48, doubleArray49, 0);
        double double53 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray40, doubleArray49, 1);
        double double55 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray33, doubleArray49, (int) (short) 10);
        double[] doubleArray60 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray61 = new double[] {};
        double double63 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray60, doubleArray61, 0);
        double[] doubleArray68 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray69 = new double[] {};
        double double71 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray68, doubleArray69, 0);
        double double73 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray60, doubleArray69, 1);
        double double75 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray49, doubleArray60, (int) '#');
        double double77 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray5, doubleArray60, 111);
        java.lang.Class<?> wildcardClass78 = doubleArray60.getClass();
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
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + (-1.0d) + "'", double75 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + (-1.0d) + "'", double77 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass78);
    }

    @Test
    public void test03072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03072");
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
        double double53 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray41, doubleArray49, (int) (byte) 1);
        double[] doubleArray58 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray59 = new double[] {};
        double double61 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray58, doubleArray59, 0);
        double[] doubleArray66 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray67 = new double[] {};
        double double69 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray66, doubleArray67, 0);
        double double71 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray59, doubleArray67, (int) (byte) 1);
        double double73 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray41, doubleArray59, (int) (short) 0);
        double double75 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray31, doubleArray41, (int) '#');
        double double77 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray4, doubleArray31, (int) (byte) 10);
        java.lang.Class<?> wildcardClass78 = doubleArray31.getClass();
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
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.0d + "'", double53 == 0.0d);
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
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + 0.0d + "'", double73 == 0.0d);
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + 0.0d + "'", double75 == 0.0d);
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + (-1.0d) + "'", double77 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass78);
    }

    @Test
    public void test03073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03073");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1505.4243106367664d, 42.90807836106438d, 502.1608299106415d, 299.41728338107504d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1568.754461841881d + "'", double4 == 1568.754461841881d);
    }

    @Test
    public void test03074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03074");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(0.0d, 1006.4589976708653d, 936.8580357712652d, 1221.248948951979d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1539.204981315194d + "'", double4 == 1539.204981315194d);
    }

    @Test
    public void test03075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03075");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(237.15390812259642d, 1625.9429991177192d, 1590.0607786213113d, 1878.4305121094562d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2127.003970620945d + "'", double4 == 2127.003970620945d);
    }

    @Test
    public void test03076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03076");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(546.7655902097462d, 723.5314800386946d, 369.01627417133034d, 886.0644611424128d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 383.03856616313067d + "'", double4 == 383.03856616313067d);
    }

    @Test
    public void test03077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03077");
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
        int int31 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray12, intArray27);
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
        int int79 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray37, intArray68);
        int int80 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray12, intArray68);
        java.lang.Class<?> wildcardClass81 = intArray12.getClass();
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
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
        org.junit.Assert.assertNotNull(wildcardClass81);
    }

    @Test
    public void test03078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03078");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(0.0d, 877.0734399189231d, 1184.2462885697346d, 233.19026405631413d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1828.1294644323434d + "'", double4 == 1828.1294644323434d);
    }

    @Test
    public void test03079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03079");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(660.2954593813611d, 339.99517634338116d, 829.6926964153299d, (double) 215);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 476.4278225087196d + "'", double4 == 476.4278225087196d);
    }

    @Test
    public void test03080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03080");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(403.01813432273127d, 514.9194063045376d, 86.44669753535501d, 1404.1067534121478d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1205.7587838949864d + "'", double4 == 1205.7587838949864d);
    }

    @Test
    public void test03081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03081");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(997.8364812996736d, 1143.28819990604d, 503.6237710637337d, 42.90807836106438d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1075.2369309587705d + "'", double4 == 1075.2369309587705d);
    }

    @Test
    public void test03082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03082");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1688.7772783557193d, 362.7660181174564d, 527.3347368521902d, 174.15406001316165d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1350.0544996078238d + "'", double4 == 1350.0544996078238d);
    }

    @Test
    public void test03083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03083");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(329.0d, 153.8493212416082d, 401.85876510713194d, 1188.1860396991142d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1107.195483564638d + "'", double4 == 1107.195483564638d);
    }

    @Test
    public void test03084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03084");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(985.4355202887014d, 1239.452605656115d, 78.07951666556232d, 989.8852570493364d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1156.9233522299178d + "'", double4 == 1156.9233522299178d);
    }

    @Test
    public void test03085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03085");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(317.3503151641939d, 282.4412369416548d, 1102.62661653041d, 1702.618724140871d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1592.3653583258395d + "'", double4 == 1592.3653583258395d);
    }

    @Test
    public void test03086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03086");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(582.3482949245309d, 191.32568848467787d, 0.0d, 1370.939463128285d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1761.9620695681383d + "'", double4 == 1761.9620695681383d);
    }

    @Test
    public void test03087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03087");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(329.0d, 1820.8881979600715d, 60.315077373544014d, 985.4414441655066d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 709.3003293844439d + "'", double4 == 709.3003293844439d);
    }

    @Test
    public void test03088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03088");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(568.8168049812173d, 1388.3550911438629d, 1390.5887209367127d, 759.6457694684568d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1450.4812376309014d + "'", double4 == 1450.4812376309014d);
    }

    @Test
    public void test03089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03089");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(378.0d, 512.5463828234233d, 319.6902425827283d, 377.17411165802133d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 193.6820285826737d + "'", double4 == 193.6820285826737d);
    }

    @Test
    public void test03090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03090");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(803.6708840159037d, 178.44662506919906d, 886.4434740943086d, 416.70416071191465d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 321.03012572112056d + "'", double4 == 321.03012572112056d);
    }

    @Test
    public void test03091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03091");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(714.9277444008551d, 284.6189351320858d, 1056.5692706321804d, 529.9578957473819d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 586.9804868466215d + "'", double4 == 586.9804868466215d);
    }

    @Test
    public void test03092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03092");
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
        double double65 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray51, doubleArray60, (int) (short) 100);
        double double67 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray21, doubleArray60, 26);
        double[] doubleArray72 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray73 = new double[] {};
        double double75 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray72, doubleArray73, 0);
        double double77 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray60, doubleArray72, 69);
        double[] doubleArray82 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray83 = new double[] {};
        double double85 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray82, doubleArray83, 0);
        double double87 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray72, doubleArray83, (int) (short) 1);
        java.lang.Class<?> wildcardClass88 = doubleArray72.getClass();
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
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + (-1.0d) + "'", double65 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + (-1.0d) + "'", double67 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray72), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray73), "[]");
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + (-1.0d) + "'", double75 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 0.0d + "'", double77 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray82), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray83), "[]");
        org.junit.Assert.assertTrue("'" + double85 + "' != '" + (-1.0d) + "'", double85 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double87 + "' != '" + (-1.0d) + "'", double87 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass88);
    }

    @Test
    public void test03093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03093");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(517.578441700593d, 998.3089994242234d, 1374.7158255799427d, 822.4991563827713d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1032.9472269208018d + "'", double4 == 1032.9472269208018d);
    }

    @Test
    public void test03094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03094");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(267.02682409492445d, 478.8997982639517d, 732.3365738517416d, 223.31249474929078d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 467.3586479449057d + "'", double4 == 467.3586479449057d);
    }

    @Test
    public void test03095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03095");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(338.8762958783806d, 532.3985198594888d, 614.7280538289306d, 267.59365353301337d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 540.6566242770255d + "'", double4 == 540.6566242770255d);
    }

    @Test
    public void test03096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03096");
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
        double double76 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray63, doubleArray72, 1);
        double double78 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray22, doubleArray72, 215);
        // The following exception was thrown during execution in test generation
        try {
            double double80 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray0, doubleArray22, 111);
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
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + (-1.0d) + "'", double76 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + 0.0d + "'", double78 == 0.0d);
    }

    @Test
    public void test03097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03097");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(762.1889468010093d, 818.9571347352227d, 626.618317666575d, 1698.0489310175412d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 945.6285240736311d + "'", double4 == 945.6285240736311d);
    }

    @Test
    public void test03098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03098");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(183.78023309928d, 0.0d, 103.4376113230772d, 829.6926964153299d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 650.8900422812455d + "'", double4 == 650.8900422812455d);
    }

    @Test
    public void test03099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03099");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(10.0d, 442.7159299471211d, 214.19929113781262d, 914.40064189523d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 927.1665824228618d + "'", double4 == 927.1665824228618d);
    }

    @Test
    public void test03100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03100");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(0.0d, 71.2527490865055d, 239.7013122060673d, 110.22998117257458d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 263.83208262570474d + "'", double4 == 263.83208262570474d);
    }

    @Test
    public void test03101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03101");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(690.9551656683019d, 1734.4312664158128d, 197.91364154759924d, 347.48157825649446d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 600.8860538877583d + "'", double4 == 600.8860538877583d);
    }

    @Test
    public void test03102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03102");
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
        double double75 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray62, doubleArray71, 1);
        double double77 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray13, doubleArray71, 10);
        double[] doubleArray82 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray83 = new double[] {};
        double double85 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray82, doubleArray83, 0);
        double double87 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray13, doubleArray82, (int) (byte) 0);
        java.lang.Class<?> wildcardClass88 = doubleArray82.getClass();
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
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 0.0d + "'", double77 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray82), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray83), "[]");
        org.junit.Assert.assertTrue("'" + double85 + "' != '" + (-1.0d) + "'", double85 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double87 + "' != '" + (-1.0d) + "'", double87 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass88);
    }

    @Test
    public void test03103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03103");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(141.32112170894843d, 0.0d, 2136.728500894452d, 879.6956921111387d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2875.103071296642d + "'", double4 == 2875.103071296642d);
    }

    @Test
    public void test03104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03104");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(580.1837315253787d, 351.7317554491893d, 394.14097853281095d, 163.1242822947696d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 456.673285986374d + "'", double4 == 456.673285986374d);
    }

    @Test
    public void test03105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03105");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(600.8821507616857d, 425.71130297188733d, 335.7483604141366d, (double) (byte) 100);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 566.7264381831062d + "'", double4 == 566.7264381831062d);
    }

    @Test
    public void test03106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03106");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(4040.16327341831d, 568.8168049812173d, 178.50574239071582d, 368.39470755902255d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 5328.628649866165d + "'", double4 == 5328.628649866165d);
    }

    @Test
    public void test03107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03107");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(303.3128472749923d, 697.1357361279265d, 887.3027308453188d, 564.0509668837087d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 639.5533997482719d + "'", double4 == 639.5533997482719d);
    }

    @Test
    public void test03108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03108");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(323.08444526140875d, 554.0360052988086d, 1028.732704283299d, 256.5675697232512d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 708.7763823604616d + "'", double4 == 708.7763823604616d);
    }

    @Test
    public void test03109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03109");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(886.9991318016976d, 0.0d, 110.55299721646323d, 299.7215374309961d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 973.531495516293d + "'", double4 == 973.531495516293d);
    }

    @Test
    public void test03110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03110");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(448.28604210226746d, 336.280275281024d, 1794.7786460596942d, 2727.7455340885726d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2647.4474325505535d + "'", double4 == 2647.4474325505535d);
    }

    @Test
    public void test03111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03111");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1134.7566154815313d, 595.5329980219346d, 0.0d, 1314.012713163696d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1853.2363306232926d + "'", double4 == 1853.2363306232926d);
    }

    @Test
    public void test03112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03112");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1222.7030823864745d, 878.1086993790781d, 605.3411715595164d, 996.9143121206173d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 736.1675235684974d + "'", double4 == 736.1675235684974d);
    }

    @Test
    public void test03113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03113");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(57.75429951679375d, 1549.2997861791393d, (double) '4', 822.0386766421623d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 764.3060388881156d + "'", double4 == 764.3060388881156d);
    }

    @Test
    public void test03114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03114");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(3017.592911296828d, 1631.6742652109288d, 527.3347368521902d, 167.4457571590446d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3784.801788155893d + "'", double4 == 3784.801788155893d);
    }

    @Test
    public void test03115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03115");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(293.1835845232116d, 1013.2681792786382d, 209.09663124837564d, 890.0889612163328d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 207.26617133714134d + "'", double4 == 207.26617133714134d);
    }

    @Test
    public void test03116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03116");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(0.0d, 360.65217402671465d, 1339.0603294247537d, 509.60940738012226d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1488.0175627781614d + "'", double4 == 1488.0175627781614d);
    }

    @Test
    public void test03117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03117");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(357.79180129636717d, 0.0d, 755.7384494027308d, 764.5155728239295d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1162.4622209302931d + "'", double4 == 1162.4622209302931d);
    }

    @Test
    public void test03118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03118");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(818.9571347352227d, 537.6734054899458d, 713.2658664605801d, 136.57490340747813d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 506.7897703571102d + "'", double4 == 506.7897703571102d);
    }

    @Test
    public void test03119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03119");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(294.23064380680285d, 1140.4786243437534d, 704.8977144889124d, 649.1951278370022d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 542.814174340953d + "'", double4 == 542.814174340953d);
    }

    @Test
    public void test03120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03120");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1236.6752907573918d, 2766.1429331391d, 825.1486709098094d, 727.4426034836936d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 654.7305465847526d + "'", double4 == 654.7305465847526d);
    }

    @Test
    public void test03121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03121");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(0.0d, 119.99500012499374d, 677.4071711503727d, 732.3365738517416d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1289.7487448771205d + "'", double4 == 1289.7487448771205d);
    }

    @Test
    public void test03122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03122");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(942.3260805538212d, 905.7508645515792d, 602.7965987608148d, 531.6236873455962d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 713.6566589989893d + "'", double4 == 713.6566589989893d);
    }

    @Test
    public void test03123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03123");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(820.1625256517515d, 403.9037707077835d, 0.0d, 690.3361644802496d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1106.5949194242176d + "'", double4 == 1106.5949194242176d);
    }

    @Test
    public void test03124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03124");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(914.40064189523d, 791.831372964938d, 637.4770430936846d, 998.3089994242234d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 289.3566865244566d + "'", double4 == 289.3566865244566d);
    }

    @Test
    public void test03125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03125");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(571.4354617909383d, 870.6154329855896d, 764.0655433643342d, 1156.7548171637534d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 616.2021552226354d + "'", double4 == 616.2021552226354d);
    }

    @Test
    public void test03126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03126");
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
        double double37 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray13, doubleArray31, (int) (short) 0);
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
        double double84 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray58, doubleArray67, 1);
        double double86 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray13, doubleArray67, 26);
        java.lang.Class<?> wildcardClass87 = doubleArray67.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass87);
    }

    @Test
    public void test03127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03127");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(160.6408171889707d, 1768.7133071730161d, 745.1737787048565d, 670.8183981016402d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 775.8607782098768d + "'", double4 == 775.8607782098768d);
    }

    @Test
    public void test03128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03128");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(287.6841281443828d, 499.1748598007424d, 194.78787162154086d, 1005.9416819900712d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 599.6630787121707d + "'", double4 == 599.6630787121707d);
    }

    @Test
    public void test03129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03129");
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
        double[] doubleArray68 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double70 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray63, doubleArray68, 101);
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
    }

    @Test
    public void test03130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03130");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(506.65920558892253d, 330.80531220996926d, 194.89413763890983d, 1117.0694893632d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 685.41824613244d + "'", double4 == 685.41824613244d);
    }

    @Test
    public void test03131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03131");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(860.7872328913397d, 656.7162468754174d, 727.0619544307596d, 1638.0019709217686d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 788.6350227520129d + "'", double4 == 788.6350227520129d);
    }

    @Test
    public void test03132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03132");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(333.87755885756354d, 1582.0156297267456d, 11.0d, 1460.1703575490526d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 444.72283103525655d + "'", double4 == 444.72283103525655d);
    }

    @Test
    public void test03133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03133");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(519.8878381495481d, 258.1086573615974d, 905.1535286739935d, 532.3985198594888d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 385.46876585804614d + "'", double4 == 385.46876585804614d);
    }

    @Test
    public void test03134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03134");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(567.8266350960342d, 66.35060455587607d, 248.10393736653214d, 542.814174340953d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 796.186267514579d + "'", double4 == 796.186267514579d);
    }

    @Test
    public void test03135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03135");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(0.0d, 985.4414441655066d, 1039.668660391156d, 730.2534811633145d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1294.856623393348d + "'", double4 == 1294.856623393348d);
    }

    @Test
    public void test03136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03136");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(121.95119009721917d, 959.8852305870198d, 459.7232166467719d, 33.05800855762949d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 349.2734453742829d + "'", double4 == 349.2734453742829d);
    }

    @Test
    public void test03137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03137");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(394.8787896067389d, 600.8821507616857d, 662.8861550421406d, (double) 101);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 767.8895161970873d + "'", double4 == 767.8895161970873d);
    }

    @Test
    public void test03138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03138");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(362.7660181174564d, 1818.3430093357147d, 2576.4318188109983d, 357.7676884230674d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2213.6714436564234d + "'", double4 == 2213.6714436564234d);
    }

    @Test
    public void test03139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03139");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(0.0d, 1126.5372153183375d, 584.992216057528d, 501.9676185738713d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1209.5618128019942d + "'", double4 == 1209.5618128019942d);
    }

    @Test
    public void test03140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03140");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1188.1697342114403d, 499.1748598007424d, 1224.1383651672277d, 238.4437024880397d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 296.6997882684901d + "'", double4 == 296.6997882684901d);
    }

    @Test
    public void test03141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03141");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(325.5506232284013d, 2137.453079809138d, 0.0d, 1754.771930926891d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1465.8297154389322d + "'", double4 == 1465.8297154389322d);
    }

    @Test
    public void test03142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03142");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1084.160743128407d, 1698.0489310175412d, 886.4434740943086d, 956.8483103349404d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 938.9178897166992d + "'", double4 == 938.9178897166992d);
    }

    @Test
    public void test03143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03143");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(933.2787870756218d, 736.1675235684974d, 1818.3430093357147d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1286.2145901560154d + "'", double4 == 1286.2145901560154d);
    }

    @Test
    public void test03144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03144");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(818.3121238642178d, 692.053099526575d, (double) 0.0f, 469.82663509603424d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 889.4250209799401d + "'", double4 == 889.4250209799401d);
    }

    @Test
    public void test03145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03145");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(603.0625600630915d, 132.0438729335658d, 303.393281120278d, 827.8241495267088d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 374.59237691164697d + "'", double4 == 374.59237691164697d);
    }

    @Test
    public void test03146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03146");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(235.09139141013205d, 497.7505917183977d, 1236.6752907573918d, 1309.8869236501089d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1813.720231278971d + "'", double4 == 1813.720231278971d);
    }

    @Test
    public void test03147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03147");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(658.8806078890834d, 496.82364336259616d, 489.50333118166543d, 366.3917665186351d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 299.80915355137904d + "'", double4 == 299.80915355137904d);
    }

    @Test
    public void test03148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03148");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(340.56581463270095d, 463.21858829225727d, 1249.7945143014063d, 1283.9922191100031d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1310.2481478583418d + "'", double4 == 1310.2481478583418d);
    }

    @Test
    public void test03149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03149");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(936.0649003385682d, 0.0d, 2645.398768597145d, 328.6731802847771d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1814.0416132949465d + "'", double4 == 1814.0416132949465d);
    }

    @Test
    public void test03150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03150");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(521.9751938756947d, 116.28126637821768d, 22.409854457620142d, 415.375979454456d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 510.8120210636406d + "'", double4 == 510.8120210636406d);
    }

    @Test
    public void test03151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03151");
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
        int int55 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray36, intArray51);
        int int56 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray12, intArray36);
        int[] intArray60 = new int[] { 1, 1, 100 };
        int[] intArray62 = new int[] { (byte) -1 };
        int int63 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray60, intArray62);
        int[] intArray66 = new int[] { 'a', 10 };
        int int67 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray62, intArray66);
        int[] intArray71 = new int[] { (byte) 1, (short) 1, (short) -1 };
        int int72 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray62, intArray71);
        int int73 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray12, intArray62);
        int[] intArray77 = new int[] { 1, 1, 100 };
        int[] intArray79 = new int[] { (byte) -1 };
        int int80 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray77, intArray79);
        int[] intArray83 = new int[] { 'a', 10 };
        int int84 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray79, intArray83);
        int[] intArray88 = new int[] { (byte) 1, (short) 1, (short) -1 };
        int int89 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray79, intArray88);
        int[] intArray93 = new int[] { (byte) -1, '#', (-1) };
        int int94 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray79, intArray93);
        int int95 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray12, intArray93);
        java.lang.Class<?> wildcardClass96 = intArray12.getClass();
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
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray60), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray62), "[-1]");
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertNotNull(intArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray66), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertNotNull(intArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray71), "[1, 1, -1]");
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-1) + "'", int72 == (-1));
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertNotNull(intArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray77), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray79), "[-1]");
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + (-1) + "'", int80 == (-1));
        org.junit.Assert.assertNotNull(intArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray83), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + (-1) + "'", int84 == (-1));
        org.junit.Assert.assertNotNull(intArray88);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray88), "[1, 1, -1]");
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + (-1) + "'", int89 == (-1));
        org.junit.Assert.assertNotNull(intArray93);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray93), "[-1, 35, -1]");
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + (-1) + "'", int94 == (-1));
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + (-1) + "'", int95 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass96);
    }

    @Test
    public void test03152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03152");
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
        double double87 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray53, doubleArray70, (int) '#');
        java.lang.Class<?> wildcardClass88 = doubleArray53.getClass();
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
        org.junit.Assert.assertTrue("'" + double87 + "' != '" + (-1.0d) + "'", double87 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass88);
    }

    @Test
    public void test03153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03153");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(178.44662506919906d, 2645.398768597145d, 339.56076344170043d, 203.47355162652715d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 163.0463511901429d + "'", double4 == 163.0463511901429d);
    }

    @Test
    public void test03154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03154");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1185.0088054428425d, 2431.8220807210373d, 385.1080041055461d, 109.59014554237986d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3122.1327365159536d + "'", double4 == 3122.1327365159536d);
    }

    @Test
    public void test03155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03155");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(110.55299721646323d, 479.33602837693195d, 0.0d, 550.8499153141472d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 453.9640308216742d + "'", double4 == 453.9640308216742d);
    }

    @Test
    public void test03156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03156");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(600.2040345816112d, 320.56011654358406d, 236.09426231541696d, 1225.4763630447624d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 723.561615207351d + "'", double4 == 723.561615207351d);
    }

    @Test
    public void test03157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03157");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(665.4510980134135d, 162.4885204088238d, 1790.7743259911974d, 1410.8842493339566d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2373.718956902917d + "'", double4 == 2373.718956902917d);
    }

    @Test
    public void test03158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03158");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(340.53058208047037d, 1226.1872261806159d, 527.2756114119443d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 388.3745399895274d + "'", double4 == 388.3745399895274d);
    }

    @Test
    public void test03159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03159");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(786.3350760679193d, 2895.757831305547d, 4071.2522367299543d, 1948.9417153271818d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4231.7332766404d + "'", double4 == 4231.7332766404d);
    }

    @Test
    public void test03160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03160");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1457.4739048952406d, 331.58122766893104d, 877.0734399189231d, 1454.8156520792427d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1703.6348893866293d + "'", double4 == 1703.6348893866293d);
    }

    @Test
    public void test03161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03161");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(374.59237691164697d, 594.0319464909992d, 721.2584480765205d, 885.5120248650928d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 638.1461495389672d + "'", double4 == 638.1461495389672d);
    }

    @Test
    public void test03162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03162");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1362.3830907872932d, 249.1688358244643d, 2800.047902676809d, 364.6489401224609d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1749.958155713499d + "'", double4 == 1749.958155713499d);
    }

    @Test
    public void test03163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03163");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(626.618317666575d, 414.02599906015445d, 914.40064189523d, 980.0554403934175d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 455.7811600536774d + "'", double4 == 455.7811600536774d);
    }

    @Test
    public void test03164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03164");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1526.791159274091d, 376.8601759872545d, 870.6154329855896d, 418.8312603752497d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 698.1468106764966d + "'", double4 == 698.1468106764966d);
    }

    @Test
    public void test03165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03165");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(159.87271607883307d, 112.71645842555559d, 574.5536640965004d, 1159.7502235336701d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1082.457998521388d + "'", double4 == 1082.457998521388d);
    }

    @Test
    public void test03166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03166");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1066.464717489007d, 372.95052751976243d, 787.5043799554695d, 732.3365738517416d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 435.27058973391496d + "'", double4 == 435.27058973391496d);
    }

    @Test
    public void test03167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03167");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(22.409854457620142d, 429.42357818286894d, 816.538235654619d, 599.2159172081066d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 981.5014619695094d + "'", double4 == 981.5014619695094d);
    }

    @Test
    public void test03168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03168");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1749.958155713499d, 281.88511874515d, 174.15406001316165d, 1020.8620017552486d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2314.780978710436d + "'", double4 == 2314.780978710436d);
    }

    @Test
    public void test03169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03169");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(998.1877562866482d, 385.6725491638043d, 1289.261867709632d, 332.0533251182606d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 726.9520057945442d + "'", double4 == 726.9520057945442d);
    }

    @Test
    public void test03170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03170");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1039.668660391156d, 0.0d, 1464.527345840218d, 290.44657240654976d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 861.3005513324127d + "'", double4 == 861.3005513324127d);
    }

    @Test
    public void test03171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03171");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(484.63464714144925d, 1203.6305447770274d, 895.7811068550288d, 893.7104359117357d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 579.9865621659195d + "'", double4 == 579.9865621659195d);
    }

    @Test
    public void test03172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03172");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1333.1036007329699d, 1143.28819990604d, 132.64218988096647d, 388.46654460571847d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1527.562361003158d + "'", double4 == 1527.562361003158d);
    }

    @Test
    public void test03173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03173");
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
        int[] intArray33 = new int[] { (byte) 1, (short) 1, (short) -1 };
        int int34 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray24, intArray33);
        int int35 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray17, intArray24);
        int[] intArray39 = new int[] { 1, 1, 100 };
        int[] intArray41 = new int[] { (byte) -1 };
        int int42 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray39, intArray41);
        int[] intArray45 = new int[] { 'a', 10 };
        int int46 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray41, intArray45);
        int[] intArray50 = new int[] { (byte) 1, (short) 1, (short) -1 };
        int int51 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray41, intArray50);
        int[] intArray55 = new int[] { (byte) -1, '#', (-1) };
        int int56 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray41, intArray55);
        int int57 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray24, intArray41);
        int[] intArray61 = new int[] { 1, 1, 100 };
        int[] intArray63 = new int[] { (byte) -1 };
        int int64 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray61, intArray63);
        int[] intArray67 = new int[] { 'a', 10 };
        int int68 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray63, intArray67);
        int[] intArray72 = new int[] { (byte) 1, (short) 1, (short) -1 };
        int int73 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray63, intArray72);
        int int74 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray24, intArray63);
        int int75 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray10, intArray63);
        int[] intArray79 = new int[] { 1, 1, 100 };
        int[] intArray81 = new int[] { (byte) -1 };
        int int82 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray79, intArray81);
        int[] intArray86 = new int[] { 1, 1, 100 };
        int[] intArray88 = new int[] { (byte) -1 };
        int int89 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray86, intArray88);
        int[] intArray95 = new int[] { (byte) 10, (byte) 100, ' ', (short) -1, (short) 100 };
        int int96 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray88, intArray95);
        int int97 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray79, intArray95);
        int int98 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray10, intArray95);
        // The following exception was thrown during execution in test generation
        try {
            int int99 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray0, intArray95);
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
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[1, 1, -1]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray55), "[-1, 35, -1]");
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
        org.junit.Assert.assertNotNull(intArray95);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray95), "[10, 100, 32, -1, 100]");
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + (-1) + "'", int96 == (-1));
        org.junit.Assert.assertTrue("'" + int97 + "' != '" + (-1) + "'", int97 == (-1));
        org.junit.Assert.assertTrue("'" + int98 + "' != '" + (-1) + "'", int98 == (-1));
    }

    @Test
    public void test03174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03174");
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
        int[] intArray84 = new int[] { 1, 1, 100 };
        int[] intArray86 = new int[] { (byte) -1 };
        int int87 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray84, intArray86);
        int[] intArray90 = new int[] { 'a', 10 };
        int int91 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray86, intArray90);
        int int92 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray30, intArray90);
        java.lang.Class<?> wildcardClass93 = intArray30.getClass();
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
        org.junit.Assert.assertNotNull(intArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray84), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray86), "[-1]");
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + (-1) + "'", int87 == (-1));
        org.junit.Assert.assertNotNull(intArray90);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray90), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + (-1) + "'", int91 == (-1));
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 0 + "'", int92 == 0);
        org.junit.Assert.assertNotNull(wildcardClass93);
    }

    @Test
    public void test03175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03175");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(2093.35778685528d, 100.0d, 20.0d, 191.32568848467787d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2813.634413982297d + "'", double4 == 2813.634413982297d);
    }

    @Test
    public void test03176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03176");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(204.01225453388824d, 503.41416381475506d, 451.72086971443827d, 495.15278870800955d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 255.96999028729553d + "'", double4 == 255.96999028729553d);
    }

    @Test
    public void test03177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03177");
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
        double double53 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray40, doubleArray49, (int) (short) 100);
        double[] doubleArray58 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray59 = new double[] {};
        double double61 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray58, doubleArray59, 0);
        double double63 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray49, doubleArray58, (int) (short) 100);
        double double65 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray31, doubleArray58, (int) (byte) 10);
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
        double double93 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray71, doubleArray78, (int) ' ');
        double double95 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray31, doubleArray71, 111);
        double double97 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray13, doubleArray71, (int) (short) 10);
        java.lang.Class<?> wildcardClass98 = doubleArray71.getClass();
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
        org.junit.Assert.assertNotNull(doubleArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray86), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray87);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray87), "[]");
        org.junit.Assert.assertTrue("'" + double89 + "' != '" + (-1.0d) + "'", double89 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double91 + "' != '" + (-1.0d) + "'", double91 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double93 + "' != '" + (-1.0d) + "'", double93 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double95 + "' != '" + 0.0d + "'", double95 == 0.0d);
        org.junit.Assert.assertTrue("'" + double97 + "' != '" + 0.0d + "'", double97 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass98);
    }

    @Test
    public void test03178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03178");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(322.2455649037498d, 0.0d, 169.73970236365818d, 286.77276777452346d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 439.2786303146151d + "'", double4 == 439.2786303146151d);
    }

    @Test
    public void test03179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03179");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(564.0294948337818d, 245.189347980773d, 668.3235384618226d, 427.283815059034d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 286.3885107063019d + "'", double4 == 286.3885107063019d);
    }

    @Test
    public void test03180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03180");
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
        double double65 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray51, doubleArray60, (int) (short) 100);
        double double67 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray21, doubleArray60, 26);
        double[] doubleArray68 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double70 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray21, doubleArray68, 136);
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
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + (-1.0d) + "'", double65 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + (-1.0d) + "'", double67 == (-1.0d));
    }

    @Test
    public void test03181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03181");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(283.2880399328444d, 325.96909051909483d, 1274.8122713879661d, 86.6202979275892d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1230.8730240466273d + "'", double4 == 1230.8730240466273d);
    }

    @Test
    public void test03182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03182");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1106.5949194242176d, 723.561615207351d, 3122.1327365159536d, 205.49962547816742d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2533.5998068209196d + "'", double4 == 2533.5998068209196d);
    }

    @Test
    public void test03183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03183");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(661.9103192935652d, 1157.7967383455236d, 1298.2681613374061d, 664.0049998750062d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 636.3612895340448d + "'", double4 == 636.3612895340448d);
    }

    @Test
    public void test03184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03184");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(699.17212331377d, 0.0d, 215.05196722620533d, 587.9528783836956d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1072.0730344712604d + "'", double4 == 1072.0730344712604d);
    }

    @Test
    public void test03185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03185");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(454.00499987500626d, 490.7494344988548d, 837.1104194170482d, 682.5704654502064d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 574.9264504933935d + "'", double4 == 574.9264504933935d);
    }

    @Test
    public void test03186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03186");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1690.4676307558216d, 394.8787896067389d, 280.65128386416546d, 1619.4469115045783d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2634.3844687894953d + "'", double4 == 2634.3844687894953d);
    }

    @Test
    public void test03187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03187");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(0.0d, 415.78775792499863d, 1073.0984655358986d, 1073.0984655358986d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1517.590403722625d + "'", double4 == 1517.590403722625d);
    }

    @Test
    public void test03188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03188");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(264.9111278263732d, 579.9865621659195d, 1541.756045800729d, 567.3730282853945d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1289.4584518548806d + "'", double4 == 1289.4584518548806d);
    }

    @Test
    public void test03189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03189");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(820.1625256517515d, 652.042545403267d, 886.4434740943086d, 96.9568383829882d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 621.366655462836d + "'", double4 == 621.366655462836d);
    }

    @Test
    public void test03190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03190");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(313.2757432907782d, 2727.7455340885726d, 1560.7067058739383d, 391.5798783907461d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3583.5966182809866d + "'", double4 == 3583.5966182809866d);
    }

    @Test
    public void test03191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03191");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(291.4933092840025d, 1122.884489920265d, 646.3510287776788d, 454.12565181325886d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1023.6165576006824d + "'", double4 == 1023.6165576006824d);
    }

    @Test
    public void test03192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03192");
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
        double[] doubleArray72 = new double[] { 232.4213562373095d, (short) 0, 1.0f, 75.85073476263909d, (-1L) };
        double double74 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray64, doubleArray72, (int) (byte) -1);
        double double76 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray50, doubleArray64, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            double double78 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray0, doubleArray64, (int) (short) 10);
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
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[]");
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + (-1.0d) + "'", double66 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray72), "[232.4213562373095, 0.0, 1.0, 75.85073476263909, -1.0]");
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + (-1.0d) + "'", double74 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 0.0d + "'", double76 == 0.0d);
    }

    @Test
    public void test03193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03193");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(879.6956921111387d, 72.90846425408961d, 22.409854457620142d, 726.6062205917581d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 870.8475146266298d + "'", double4 == 870.8475146266298d);
    }

    @Test
    public void test03194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03194");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(886.4434740943086d, 167.87372472293382d, 1005.9416819900712d, 2312.1711435044044d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2263.7956266772335d + "'", double4 == 2263.7956266772335d);
    }

    @Test
    public void test03195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03195");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(500.4832062519777d, 1860.4068879497572d, 614.6324374476843d, 1650.5689502464306d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 323.9871688990332d + "'", double4 == 323.9871688990332d);
    }

    @Test
    public void test03196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03196");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1117.796061831161d, 52.430129769626305d, 52.430129769626305d, 254.3727246655306d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1371.314853839036d + "'", double4 == 1371.314853839036d);
    }

    @Test
    public void test03197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03197");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(282.94370701765916d, 849.2467365693465d, 169.5558367014212d, 634.2295453448422d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 328.40506154074217d + "'", double4 == 328.40506154074217d);
    }

    @Test
    public void test03198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03198");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(199.75445414771787d, 1592.3653583258395d, 1107.195483564638d, 232.4213562373095d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2267.38503150545d + "'", double4 == 2267.38503150545d);
    }

    @Test
    public void test03199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03199");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(207.26617133714134d, 1661.4712989827988d, 688.5904808382277d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 524.053772715601d + "'", double4 == 524.053772715601d);
    }

    @Test
    public void test03200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03200");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(788.6350227520129d, 90.5608003457567d, 459.7232166467719d, 607.2249268884098d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 375.62294801656265d + "'", double4 == 375.62294801656265d);
    }

    @Test
    public void test03201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03201");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(585.5213407208503d, 57.75429951679375d, 362.91048069008355d, 787.5043799554695d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 300.5873303086664d + "'", double4 == 300.5873303086664d);
    }

    @Test
    public void test03202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03202");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(335.49898510954745d, 989.8852570493364d, 660.8737855706839d, 1501.0475113099421d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 836.5370547217423d + "'", double4 == 836.5370547217423d);
    }

    @Test
    public void test03203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03203");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(71.2527490865055d, 344.4597570301277d, 1102.62661653041d, 395.0094394147251d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1080.9951197755147d + "'", double4 == 1080.9951197755147d);
    }

    @Test
    public void test03204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03204");
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
        double[] doubleArray48 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray49 = new double[] {};
        double double51 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray48, doubleArray49, 0);
        double double53 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray40, doubleArray49, 1);
        double double55 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray33, doubleArray49, (int) (short) 10);
        double double57 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray4, doubleArray49, 137);
        java.lang.Class<?> wildcardClass58 = doubleArray49.getClass();
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
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[]");
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + (-1.0d) + "'", double51 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + (-1.0d) + "'", double53 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 0.0d + "'", double55 == 0.0d);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + (-1.0d) + "'", double57 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass58);
    }

    @Test
    public void test03205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03205");
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
        double double37 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray13, doubleArray31, (int) (short) 0);
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
        double double84 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray58, doubleArray67, 1);
        double double86 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray13, doubleArray67, 26);
        java.lang.Class<?> wildcardClass87 = doubleArray13.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass87);
    }

    @Test
    public void test03206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03206");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(277.515023655668d, 313.2757432907782d, 490.7494344988548d, 350.69729961242604d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 250.65596716483458d + "'", double4 == 250.65596716483458d);
    }

    @Test
    public void test03207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03207");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(753.8539938166764d, 384.57813099055943d, 229.7265305245437d, 1886.8301301214929d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2026.3794624230661d + "'", double4 == 2026.3794624230661d);
    }

    @Test
    public void test03208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03208");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(506.64081324618246d, 585.5213407208503d, 493.2930398078507d, 653.6605082493417d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 81.48694096682317d + "'", double4 == 81.48694096682317d);
    }

    @Test
    public void test03209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03209");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(601.720563037279d, 181.1730024775672d, 829.1063205068886d, 434.3267617642323d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 282.3561003496619d + "'", double4 == 282.3561003496619d);
    }

    @Test
    public void test03210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03210");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(733.5968760056405d, 539.7607615863355d, 186.29062043987966d, 653.6605082493417d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 553.1129724310254d + "'", double4 == 553.1129724310254d);
    }

    @Test
    public void test03211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03211");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1089.5137394711123d, 383.60405834053d, 150.00535004535024d, 418.8312603752497d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 974.7355914604818d + "'", double4 == 974.7355914604818d);
    }

    @Test
    public void test03212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03212");
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
        int[] intArray69 = new int[] { 'a', 10 };
        int int70 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray65, intArray69);
        int[] intArray74 = new int[] { (byte) 1, (short) 1, (short) -1 };
        int int75 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray65, intArray74);
        int[] intArray79 = new int[] { (byte) -1, '#', (-1) };
        int int80 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray65, intArray79);
        int int81 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray53, intArray79);
        int int82 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray14, intArray53);
        int[] intArray83 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int84 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray14, intArray83);
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
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + (-1) + "'", int82 == (-1));
    }

    @Test
    public void test03213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03213");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1107.0997065215752d, 461.52306304116587d, 0.0d, 254.3727246655306d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1397.4308804965908d + "'", double4 == 1397.4308804965908d);
    }

    @Test
    public void test03214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03214");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1335.8608317074572d, 780.2683212621698d, 483.08021801149255d, 1522.9631008522388d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1595.4753932860335d + "'", double4 == 1595.4753932860335d);
    }

    @Test
    public void test03215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03215");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(451.47820949769306d, 296.3262775730056d, 615.2073500056413d, 871.2992730721038d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 738.7021360070464d + "'", double4 == 738.7021360070464d);
    }

    @Test
    public void test03216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03216");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(464.55529344788846d, 486.34266847173456d, (double) 'a', 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 852.897961919623d + "'", double4 == 852.897961919623d);
    }

    @Test
    public void test03217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03217");
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
        double[] doubleArray68 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray69 = new double[] {};
        double double71 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray68, doubleArray69, 0);
        double double73 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray60, doubleArray69, 1);
        double double75 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray53, doubleArray69, (int) (short) 10);
        double double77 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray43, doubleArray53, (int) ' ');
        double double79 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray20, doubleArray53, (int) (short) 100);
        double[] doubleArray84 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray85 = new double[] {};
        double double87 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray84, doubleArray85, 0);
        double double89 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray20, doubleArray84, (int) (byte) -1);
        java.lang.Class<?> wildcardClass90 = doubleArray84.getClass();
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
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray68), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray69), "[]");
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + (-1.0d) + "'", double71 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + (-1.0d) + "'", double73 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + 0.0d + "'", double75 == 0.0d);
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 0.0d + "'", double77 == 0.0d);
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + (-1.0d) + "'", double79 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray84), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray85), "[]");
        org.junit.Assert.assertTrue("'" + double87 + "' != '" + (-1.0d) + "'", double87 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double89 + "' != '" + (-1.0d) + "'", double89 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass90);
    }

    @Test
    public void test03218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03218");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(119.72206941536145d, 819.7694166303316d, 0.0d, 293.96891861545134d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 211.41272043388378d + "'", double4 == 211.41272043388378d);
    }

    @Test
    public void test03219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03219");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(267.2834268741326d, 674.0323645383281d, 319.5212270991567d, 444.63020367211396d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 281.63996109123826d + "'", double4 == 281.63996109123826d);
    }

    @Test
    public void test03220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03220");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(912.4483247186538d, 0.0d, 937.476137726764d, 270.0550079678848d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 642.880676976702d + "'", double4 == 642.880676976702d);
    }

    @Test
    public void test03221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03221");
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
        double[] doubleArray43 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray44 = new double[] {};
        double double46 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray43, doubleArray44, 0);
        double[] doubleArray51 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray52 = new double[] {};
        double double54 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray51, doubleArray52, 0);
        double double56 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray44, doubleArray52, (int) (byte) 1);
        double[] doubleArray61 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray62 = new double[] {};
        double double64 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray61, doubleArray62, 0);
        double[] doubleArray69 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray70 = new double[] {};
        double double72 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray69, doubleArray70, 0);
        double[] doubleArray77 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray78 = new double[] {};
        double double80 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray77, doubleArray78, 0);
        double double82 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray69, doubleArray78, 1);
        double double84 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray62, doubleArray78, (int) (short) 10);
        double double86 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray52, doubleArray62, (int) ' ');
        double double88 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray6, doubleArray62, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            double double90 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray0, doubleArray62, (int) (byte) 100);
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
        org.junit.Assert.assertNotNull(doubleArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray77), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray78), "[]");
        org.junit.Assert.assertTrue("'" + double80 + "' != '" + (-1.0d) + "'", double80 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + (-1.0d) + "'", double82 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double84 + "' != '" + 0.0d + "'", double84 == 0.0d);
        org.junit.Assert.assertTrue("'" + double86 + "' != '" + 0.0d + "'", double86 == 0.0d);
        org.junit.Assert.assertTrue("'" + double88 + "' != '" + 0.0d + "'", double88 == 0.0d);
    }

    @Test
    public void test03222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03222");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(2261.063597666136d, 1188.1697342114403d, 972.7599638001475d, 1316.6871369520127d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1416.821036606561d + "'", double4 == 1416.821036606561d);
    }

    @Test
    public void test03223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03223");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(0.0d, 159.05694319825284d, 220.238507078122d, 486.1444817768018d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 533.7054029724968d + "'", double4 == 533.7054029724968d);
    }

    @Test
    public void test03224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03224");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1354.0831794041292d, 754.5164898211783d, 1084.160743128407d, 2487.39376508036d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2002.799711534904d + "'", double4 == 2002.799711534904d);
    }

    @Test
    public void test03225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03225");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(229.7265305245437d, 0.0d, 1084.160743128407d, 180.0274220553354d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 855.8783938449538d + "'", double4 == 855.8783938449538d);
    }

    @Test
    public void test03226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03226");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1638.0019709217686d, 1268.6375460235577d, 433.5149692961964d, 567.8266350960342d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1905.2979125530956d + "'", double4 == 1905.2979125530956d);
    }

    @Test
    public void test03227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03227");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(716.1930244036126d, 0.0d, 1020.8620017552486d, 332.00499987500626d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 490.3301173206524d + "'", double4 == 490.3301173206524d);
    }

    @Test
    public void test03228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03228");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1764.3965242897048d, 341.7378669222432d, 113.22357839151867d, 400.13728442514685d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1709.5723634010897d + "'", double4 == 1709.5723634010897d);
    }

    @Test
    public void test03229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03229");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(388.3745399895274d, 357.79180129636717d, 505.57540820504266d, 738.2667297024383d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 368.99944164262115d + "'", double4 == 368.99944164262115d);
    }

    @Test
    public void test03230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03230");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(188.00592040346186d, 837.1104194170482d, 980.0554403934175d, 434.59128451792674d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1194.5686548890772d + "'", double4 == 1194.5686548890772d);
    }

    @Test
    public void test03231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03231");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1333.732083151523d, (double) (byte) 10, 290.44657240654976d, 243.69396484718965d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1508.8498123692932d + "'", double4 == 1508.8498123692932d);
    }

    @Test
    public void test03232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03232");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(502.68387230973843d, 1606.2044434854495d, 453.9015312110428d, 456.95497716611834d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 66.86440498595414d + "'", double4 == 66.86440498595414d);
    }

    @Test
    public void test03233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03233");
        double[] doubleArray4 = new double[] { 573.181255425285d, 819.7694166303316d, 585.5213407208503d, 1621.3386859525015d };
        double[] doubleArray9 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray10 = new double[] {};
        double double12 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray9, doubleArray10, 0);
        double[] doubleArray17 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray18 = new double[] {};
        double double20 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray17, doubleArray18, 0);
        double double22 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray9, doubleArray18, (int) (short) 100);
        double[] doubleArray27 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray28 = new double[] {};
        double double30 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray27, doubleArray28, 0);
        double double32 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray18, doubleArray27, (int) (short) 100);
        double[] doubleArray37 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray38 = new double[] {};
        double double40 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray37, doubleArray38, 0);
        double[] doubleArray45 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray46 = new double[] {};
        double double48 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray45, doubleArray46, 0);
        double[] doubleArray53 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray54 = new double[] {};
        double double56 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray53, doubleArray54, 0);
        double double58 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray45, doubleArray54, 1);
        double double60 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray38, doubleArray54, (int) (short) 10);
        double double62 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray18, doubleArray38, 100);
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
        double double92 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray38, doubleArray68, (int) (short) 1);
        double double94 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray4, doubleArray68, (int) '#');
        java.lang.Class<?> wildcardClass95 = doubleArray68.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[573.181255425285, 819.7694166303316, 585.5213407208503, 1621.3386859525015]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[]");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[]");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-1.0d) + "'", double20 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-1.0d) + "'", double22 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[]");
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + (-1.0d) + "'", double30 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + (-1.0d) + "'", double32 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[]");
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + (-1.0d) + "'", double40 == (-1.0d));
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
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 0.0d + "'", double62 == 0.0d);
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
        org.junit.Assert.assertTrue("'" + double94 + "' != '" + (-1.0d) + "'", double94 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass95);
    }

    @Test
    public void test03234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03234");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(229.10435660536763d, 716.1930244036126d, 1527.562361003158d, 2548.18217586309d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2657.8403114103457d + "'", double4 == 2657.8403114103457d);
    }

    @Test
    public void test03235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03235");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(490.3301173206524d, 0.0d, 988.5078734431651d, 284.69002088953687d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 538.9516916713967d + "'", double4 == 538.9516916713967d);
    }

    @Test
    public void test03236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03236");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(170.41777368493752d, 368.39470755902255d, 974.7355914604818d, 1044.516798678362d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1187.8452161311545d + "'", double4 == 1187.8452161311545d);
    }

    @Test
    public void test03237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03237");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(293.6673919614228d, 688.1885988018469d, 382.2425147690072d, 508.5647858466356d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 268.19893576279566d + "'", double4 == 268.19893576279566d);
    }

    @Test
    public void test03238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03238");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(145.98524464748706d, 665.4510980134135d, 933.2787870756218d, 503.6237710637337d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 949.1208693778144d + "'", double4 == 949.1208693778144d);
    }

    @Test
    public void test03239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03239");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(909.6980770786871d, 246.8310642801902d, 1333.7387222168438d, (double) 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 670.8717094183469d + "'", double4 == 670.8717094183469d);
    }

    @Test
    public void test03240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03240");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(596.178779154028d, 236.7589786659278d, 71.2527490865055d, 583.1360242569174d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 871.3030756585122d + "'", double4 == 871.3030756585122d);
    }

    @Test
    public void test03241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03241");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1187.411961597624d, 565.9850962978414d, 457.84601365209437d, 1463.7224374719767d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 780.1371363289729d + "'", double4 == 780.1371363289729d);
    }

    @Test
    public void test03242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03242");
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
        java.lang.Class<?> wildcardClass61 = intArray21.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass61);
    }

    @Test
    public void test03243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03243");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(574.8480378080076d, 2213.6714436564234d, 500.39212128973656d, 650.8900422812455d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 106.42401020861638d + "'", double4 == 106.42401020861638d);
    }

    @Test
    public void test03244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03244");
        int[] intArray6 = new int[] { 0, 215, 1, 69, (short) 10, (short) 100 };
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
        int int38 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray12, intArray34);
        int[] intArray42 = new int[] { 1, 1, 100 };
        int[] intArray44 = new int[] { (byte) -1 };
        int int45 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray42, intArray44);
        int[] intArray48 = new int[] { 'a', 10 };
        int int49 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray44, intArray48);
        int int50 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray12, intArray44);
        int[] intArray54 = new int[] { 1, 1, 100 };
        int[] intArray56 = new int[] { (byte) -1 };
        int int57 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray54, intArray56);
        int[] intArray60 = new int[] { 'a', 10 };
        int int61 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray56, intArray60);
        int[] intArray65 = new int[] { (byte) 1, (short) 1, (short) -1 };
        int int66 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray56, intArray65);
        int int67 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray44, intArray56);
        int[] intArray71 = new int[] { 1, 1, 100 };
        int[] intArray73 = new int[] { (byte) -1 };
        int int74 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray71, intArray73);
        int int75 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray56, intArray73);
        int int76 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray6, intArray73);
        java.lang.Class<?> wildcardClass77 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 215, 1, 69, 10, 100]");
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
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[-1]");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[97, 10]");
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
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertNotNull(intArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray71), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray73), "[-1]");
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-1) + "'", int76 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass77);
    }

    @Test
    public void test03245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03245");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(93.40770846134703d, 640.073700145462d, 339.56076344170043d, 456.95497716611834d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 429.27177795969703d + "'", double4 == 429.27177795969703d);
    }

    @Test
    public void test03246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03246");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1066.4156521349796d, 1634.984457121407d, 427.91471160278576d, 486.76902224492216d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 862.3651585050254d + "'", double4 == 862.3651585050254d);
    }

    @Test
    public void test03247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03247");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1044.516798678362d, 1370.939463128285d, 129.18370657668194d, 326.35324126073317d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1959.919313969232d + "'", double4 == 1959.919313969232d);
    }

    @Test
    public void test03248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03248");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1410.8842493339566d, 2813.634413982297d, 601.720563037279d, 81.25955692602055d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1556.485687014862d + "'", double4 == 1556.485687014862d);
    }

    @Test
    public void test03249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03249");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1224.7232930665004d, 376.8601759872545d, 93.40770846134703d, 1556.485687014862d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1178.9576913565845d + "'", double4 == 1178.9576913565845d);
    }

    @Test
    public void test03250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03250");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(0.0d, 676.4407711774177d, 1297.2584734734726d, 638.0814444865287d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1335.6178001643616d + "'", double4 == 1335.6178001643616d);
    }

    @Test
    public void test03251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03251");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1756.3197263345141d, 1051.3532201541273d, 140.71846197183868d, 555.5147953355564d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2012.9828433748976d + "'", double4 == 2012.9828433748976d);
    }

    @Test
    public void test03252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03252");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(385.46876585804614d, 827.8241495267088d, 718.2552672071502d, 328.77297056953023d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 831.8376803062826d + "'", double4 == 831.8376803062826d);
    }

    @Test
    public void test03253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03253");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(837.6288297522865d, 1180.3578280495476d, 0.0d, 373.44890145037124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 957.6455828074163d + "'", double4 == 957.6455828074163d);
    }

    @Test
    public void test03254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03254");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(214.19929113781262d, 1030.1790390362178d, 422.7103058845154d, 812.8189331068119d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 633.8945645939809d + "'", double4 == 633.8945645939809d);
    }

    @Test
    public void test03255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03255");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1362.443454095583d, 664.3431501479369d, 444.63020367211396d, 1066.4156521349796d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1319.885752410512d + "'", double4 == 1319.885752410512d);
    }

    @Test
    public void test03256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03256");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1092.9295786897233d, 153.8493212416082d, 739.0468175246912d, 439.6894466253013d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 639.7228865487252d + "'", double4 == 639.7228865487252d);
    }

    @Test
    public void test03257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03257");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(457.84601365209437d, 1002.602929337322d, 188.83374178579496d, 338.19105883602975d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 294.42301307252166d + "'", double4 == 294.42301307252166d);
    }

    @Test
    public void test03258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03258");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(275.8473488733406d, 689.3330009868114d, 0.0d, 169.46291368616335d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 295.65082095361277d + "'", double4 == 295.65082095361277d);
    }

    @Test
    public void test03259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03259");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(80.72264272297954d, 942.7215473271511d, 608.7160566860049d, 187.26690261190743d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1283.448058678269d + "'", double4 == 1283.448058678269d);
    }

    @Test
    public void test03260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03260");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(182.24761454025776d, 434.59128451792674d, 210.43152753590826d, 206.77820008724825d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 37.36418845665748d + "'", double4 == 37.36418845665748d);
    }

    @Test
    public void test03261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03261");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(955.7878825142769d, 1447.804915154999d, 439.22202415293077d, 959.8852305870198d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 516.5821079807387d + "'", double4 == 516.5821079807387d);
    }

    @Test
    public void test03262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03262");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(102.8619978699419d, 1624.2639273004588d, 527.1907224716535d, 79.01194999030838d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 424.99846035718303d + "'", double4 == 424.99846035718303d);
    }

    @Test
    public void test03263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03263");
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
            double double48 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray0, doubleArray42, 137);
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
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[232.4213562373095, 0.0, 1.0, 75.85073476263909, -1.0]");
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + (-1.0d) + "'", double44 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + (-1.0d) + "'", double46 == (-1.0d));
    }

    @Test
    public void test03264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03264");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(0.0d, 1122.713551037035d, 1249.7945143014063d, 317.0700696293941d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1289.3873572486573d + "'", double4 == 1289.3873572486573d);
    }

    @Test
    public void test03265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03265");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(933.8577953930046d, 1510.1966252429165d, 182.24761454025776d, 2634.3844687894953d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1875.7980243993256d + "'", double4 == 1875.7980243993256d);
    }

    @Test
    public void test03266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03266");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1066.4156521349796d, 1230.8730240466273d, 360.643250362379d, 1058.6255897318786d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 878.0198360873494d + "'", double4 == 878.0198360873494d);
    }

    @Test
    public void test03267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03267");
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
        java.lang.Class<?> wildcardClass68 = doubleArray31.getClass();
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
    public void test03268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03268");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(554.0360052988086d, 202.19892660646443d, 326.3298204913991d, 517.5452296213658d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 230.61154201185937d + "'", double4 == 230.61154201185937d);
    }

    @Test
    public void test03269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03269");
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
        java.lang.Class<?> wildcardClass94 = intArray89.getClass();
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
    public void test03270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03270");
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
        double[] doubleArray36 = new double[] { 232.4213562373095d, (short) 0, 1.0f, 75.85073476263909d, (-1L) };
        double double38 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray28, doubleArray36, (int) (byte) -1);
        double[] doubleArray43 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray44 = new double[] {};
        double double46 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray43, doubleArray44, 0);
        double[] doubleArray51 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray52 = new double[] {};
        double double54 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray51, doubleArray52, 0);
        double double56 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray43, doubleArray52, (int) (short) 100);
        double[] doubleArray61 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray62 = new double[] {};
        double double64 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray61, doubleArray62, 0);
        double double66 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray43, doubleArray61, (int) (byte) 0);
        double double68 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray36, doubleArray61, (int) (short) 100);
        double double70 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray13, doubleArray36, (int) (short) -1);
        java.lang.Class<?> wildcardClass71 = doubleArray13.getClass();
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
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[232.4213562373095, 0.0, 1.0, 75.85073476263909, -1.0]");
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
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray62), "[]");
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + (-1.0d) + "'", double64 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + Double.POSITIVE_INFINITY + "'", double66 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + (-1.0d) + "'", double68 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + (-1.0d) + "'", double70 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass71);
    }

    @Test
    public void test03271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03271");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(686.1083370593119d, 1255.1514421955394d, 386.8432478352133d, 692.822859816043d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 299.34040563238096d + "'", double4 == 299.34040563238096d);
    }

    @Test
    public void test03272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03272");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(0.0d, 824.4388460585776d, 567.3390230270919d, 342.230974572274d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 662.5674358176861d + "'", double4 == 662.5674358176861d);
    }

    @Test
    public void test03273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03273");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(2137.453079809138d, 360.37692385789285d, 360.643250362379d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2137.186753304652d + "'", double4 == 2137.186753304652d);
    }

    @Test
    public void test03274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03274");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1383.9518231925686d, 277.1976496143225d, 355.1331080333377d, 937.6910315248865d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1121.4350818668715d + "'", double4 == 1121.4350818668715d);
    }

    @Test
    public void test03275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03275");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(0.0d, 2800.047902676809d, 124.12768977003863d, 784.9484205212476d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2139.2271719256d + "'", double4 == 2139.2271719256d);
    }

    @Test
    public void test03276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03276");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(599.2159172081066d, 502.1346032942372d, 653.8220417482348d, 755.7384494027308d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 308.20997064862183d + "'", double4 == 308.20997064862183d);
    }

    @Test
    public void test03277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03277");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1594.7193413921318d, 911.9139034206346d, 3122.1327365159536d, 42.90807836106438d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2177.4089821789926d + "'", double4 == 2177.4089821789926d);
    }

    @Test
    public void test03278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03278");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(3228.153530269311d, 455.56380201307627d, 280.97238101164777d, 938.0820197110341d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3732.3322802251123d + "'", double4 == 3732.3322802251123d);
    }

    @Test
    public void test03279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03279");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(86.6202979275892d, 533.7054029724968d, 761.0206976815485d, 1158.0735480092137d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1266.0284223897884d + "'", double4 == 1266.0284223897884d);
    }

    @Test
    public void test03280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03280");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(0.0d, 1476.0291403541248d, 952.4965584854033d, 59.40894017819502d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2369.116758661333d + "'", double4 == 2369.116758661333d);
    }

    @Test
    public void test03281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03281");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(690.5107149310497d, 1590.0607786213113d, 144.3969578381549d, 1635.1822410603374d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1091.1665903818514d + "'", double4 == 1091.1665903818514d);
    }

    @Test
    public void test03282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03282");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1207.6930012050066d, 257.270124540182d, 324.87536071545964d, 506.64081324618246d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1132.1883291955473d + "'", double4 == 1132.1883291955473d);
    }

    @Test
    public void test03283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03283");
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
        double double45 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray22, doubleArray41, (int) (short) 10);
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
        double double73 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray51, doubleArray58, (int) ' ');
        double double75 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray41, doubleArray51, 136);
        java.lang.Class<?> wildcardClass76 = doubleArray51.getClass();
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
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray67), "[]");
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + (-1.0d) + "'", double69 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + (-1.0d) + "'", double71 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + (-1.0d) + "'", double73 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + (-1.0d) + "'", double75 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass76);
    }

    @Test
    public void test03284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03284");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(670.8717094183469d, 372.10153723305945d, 44.145104782617494d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 918.071395620256d + "'", double4 == 918.071395620256d);
    }

    @Test
    public void test03285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03285");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(250.49339306579066d, 270.7234827847988d, 1454.8156520792427d, (double) 10);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1228.099823167303d + "'", double4 == 1228.099823167303d);
    }

    @Test
    public void test03286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03286");
        int[] intArray3 = new int[] { 1, 1, 100 };
        int[] intArray5 = new int[] { (byte) -1 };
        int int6 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray3, intArray5);
        int[] intArray10 = new int[] { 1, 1, 100 };
        int[] intArray12 = new int[] { (byte) -1 };
        int int13 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray10, intArray12);
        int[] intArray16 = new int[] { 'a', 10 };
        int int17 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray12, intArray16);
        int int18 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray3, intArray16);
        int[] intArray23 = new int[] { 136, ' ', 0, (byte) 0 };
        int[] intArray27 = new int[] { 1, 1, 100 };
        int[] intArray29 = new int[] { (byte) -1 };
        int int30 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray27, intArray29);
        int[] intArray33 = new int[] { 'a', 10 };
        int int34 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray29, intArray33);
        int[] intArray38 = new int[] { (byte) 1, (short) 1, (short) -1 };
        int int39 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray29, intArray38);
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
        int int71 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray45, intArray67);
        int[] intArray75 = new int[] { 1, 1, 100 };
        int[] intArray77 = new int[] { (byte) -1 };
        int int78 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray75, intArray77);
        int[] intArray81 = new int[] { 'a', 10 };
        int int82 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray77, intArray81);
        int int83 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray45, intArray77);
        int int84 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray38, intArray45);
        int int85 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray23, intArray45);
        int int86 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray3, intArray45);
        java.lang.Class<?> wildcardClass87 = intArray3.getClass();
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
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[136, 32, 0, 0]");
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
        org.junit.Assert.assertNotNull(intArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray75), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray77), "[-1]");
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
        org.junit.Assert.assertNotNull(intArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray81), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + (-1) + "'", int82 == (-1));
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 0 + "'", int83 == 0);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + (-1) + "'", int84 == (-1));
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + (-1) + "'", int85 == (-1));
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + (-1) + "'", int86 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass87);
    }

    @Test
    public void test03287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03287");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(329.218801971312d, 803.8665608360225d, 324.79832460939593d, 546.9941398742101d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 217.82019745383724d + "'", double4 == 217.82019745383724d);
    }

    @Test
    public void test03288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03288");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(454.00499987500626d, 796.186267514579d, 942.7215473271511d, 314.96520757471535d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 969.9376073920084d + "'", double4 == 969.9376073920084d);
    }

    @Test
    public void test03289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03289");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(189.21443951110848d, 1357.1551954057154d, 1080.9951197755147d, 878.1086993790781d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1126.875362660789d + "'", double4 == 1126.875362660789d);
    }

    @Test
    public void test03290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03290");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(619.9042501456235d, 998.1877562866482d, 1749.958155713499d, 916.7412550310105d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1211.5004068235132d + "'", double4 == 1211.5004068235132d);
    }

    @Test
    public void test03291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03291");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(0.0d, 421.80801414835054d, 580.1837315253787d, 443.55866397150663d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 730.3132551932085d + "'", double4 == 730.3132551932085d);
    }

    @Test
    public void test03292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03292");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(277.515023655668d, 816.3228889880967d, 3333.744814787238d, 690.3361644802496d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3182.216515639417d + "'", double4 == 3182.216515639417d);
    }

    @Test
    public void test03293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03293");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(504.1892407191555d, 1082.470663860704d, 255.7198752498387d, 1315.3811552006025d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 848.3922133640784d + "'", double4 == 848.3922133640784d);
    }

    @Test
    public void test03294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03294");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1860.4068879497572d, 626.618317666575d, 330.1806184959905d, 1476.0291403541248d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2379.6370921413163d + "'", double4 == 2379.6370921413163d);
    }

    @Test
    public void test03295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03295");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(823.2048226688985d, 992.5724510938753d, 207.26617133714134d, 949.1208693778144d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 628.6773998030992d + "'", double4 == 628.6773998030992d);
    }

    @Test
    public void test03296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03296");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(760.9346764780822d, 212.5208577575268d, 619.9703522906217d, 1156.9233522299178d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 420.33078880486477d + "'", double4 == 420.33078880486477d);
    }

    @Test
    public void test03297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03297");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(338.8762958783806d, 603.0625600630915d, 934.873066853779d, 803.6708840159037d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 796.6050949282106d + "'", double4 == 796.6050949282106d);
    }

    @Test
    public void test03298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03298");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1039.407111645567d, 203.49228509754138d, 956.5579343315898d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 286.3414624115187d + "'", double4 == 286.3414624115187d);
    }

    @Test
    public void test03299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03299");
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
        int[] intArray24 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int25 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray5, intArray24);
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
    }

    @Test
    public void test03300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03300");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(171.5644349530363d, 829.1261878829811d, 564.0294948337818d, 1411.593963033508d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1300.6544713099918d + "'", double4 == 1300.6544713099918d);
    }

    @Test
    public void test03301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03301");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(197.1225084287766d, 435.2117505246209d, 389.23201588782825d, 416.4983091590088d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 210.8229488246638d + "'", double4 == 210.8229488246638d);
    }

    @Test
    public void test03302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03302");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(757.1684869401565d, (double) 0, 1086.365729179895d, 536.1815974651743d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 396.492155809011d + "'", double4 == 396.492155809011d);
    }

    @Test
    public void test03303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03303");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(272.62423739018084d, 102.26030820844352d, 1695.475884420738d, 71.2527490865055d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1453.859206152495d + "'", double4 == 1453.859206152495d);
    }

    @Test
    public void test03304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03304");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(208.61715899140685d, 1720.3168189486005d, 555.5147953355564d, 555.7197088172657d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 490.7322591768047d + "'", double4 == 490.7322591768047d);
    }

    @Test
    public void test03305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03305");
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
        double[] doubleArray88 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double90 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray23, doubleArray88, 101);
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
    }

    @Test
    public void test03306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03306");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(811.908097157059d, (double) (byte) -1, 770.9184926930953d, 1621.3386859525015d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 810.4677820566644d + "'", double4 == 810.4677820566644d);
    }

    @Test
    public void test03307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03307");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(0.0d, 709.9839372762594d, 37.3064424931273d, 1634.984457121407d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1635.4100237188457d + "'", double4 == 1635.4100237188457d);
    }

    @Test
    public void test03308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03308");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(668.1928114195907d, 508.15729725356135d, 547.552647032441d, 513.5978917155679d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 126.08075884915633d + "'", double4 == 126.08075884915633d);
    }

    @Test
    public void test03309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03309");
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
        double double37 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray13, doubleArray31, (int) (short) 0);
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
        double[] doubleArray86 = new double[] {};
        double double88 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray61, doubleArray86, 101);
        double double90 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray31, doubleArray61, (int) (byte) -1);
        java.lang.Class<?> wildcardClass91 = doubleArray61.getClass();
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
        org.junit.Assert.assertNotNull(doubleArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray86), "[]");
        org.junit.Assert.assertTrue("'" + double88 + "' != '" + 0.0d + "'", double88 == 0.0d);
        org.junit.Assert.assertTrue("'" + double90 + "' != '" + Double.POSITIVE_INFINITY + "'", double90 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertNotNull(wildcardClass91);
    }

    @Test
    public void test03310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03310");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1221.248948951979d, 0.0d, 0.0d, 29.016284593150402d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1706.7125479354936d + "'", double4 == 1706.7125479354936d);
    }

    @Test
    public void test03311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03311");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(23.120346888421807d, 137.03519842149686d, 1625.9429991177192d, 490.25700073760834d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1669.508043666988d + "'", double4 == 1669.508043666988d);
    }

    @Test
    public void test03312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03312");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(182.05164476463364d, 116.28126637821768d, 452.9073047125782d, 499.20630961813856d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 417.07297918251146d + "'", double4 == 417.07297918251146d);
    }

    @Test
    public void test03313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03313");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(453.9015312110428d, 572.2631809460208d, 905.3915780663442d, 2872.0656822953997d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2751.2925482046803d + "'", double4 == 2751.2925482046803d);
    }

    @Test
    public void test03314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03314");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(328.40506154074217d, 524.8774654412186d, 1089.9135821642358d, 1914.5847580681952d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1759.5059694863512d + "'", double4 == 1759.5059694863512d);
    }

    @Test
    public void test03315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03315");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(277.9680387517694d, 1106.9582650227076d, 674.0323645383281d, 338.9571467987568d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 400.7326059370867d + "'", double4 == 400.7326059370867d);
    }

    @Test
    public void test03316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03316");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(503.41416381475506d, 636.3612895340448d, 1034.6208250899676d, 2213.6714436564234d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2108.516815397591d + "'", double4 == 2108.516815397591d);
    }

    @Test
    public void test03317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03317");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(340.4421739578686d, 1754.2553174822342d, 460.2476947640703d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1874.060838288436d + "'", double4 == 1874.060838288436d);
    }

    @Test
    public void test03318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03318");
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
        double[] doubleArray58 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double60 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray21, doubleArray58, 0);
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
    }

    @Test
    public void test03319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03319");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(0.0d, 519.8878381495481d, 1480.1193106454605d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1480.1193106454605d + "'", double4 == 1480.1193106454605d);
    }

    @Test
    public void test03320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03320");
        int[] intArray3 = new int[] { (byte) -1, (short) -1, ' ' };
        int[] intArray7 = new int[] { 1, 1, 100 };
        int[] intArray9 = new int[] { (byte) -1 };
        int int10 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray7, intArray9);
        int int11 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray3, intArray7);
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
        int int73 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray7, intArray33);
        int[] intArray77 = new int[] { 1, 1, 100 };
        int[] intArray79 = new int[] { (byte) -1 };
        int int80 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray77, intArray79);
        int[] intArray84 = new int[] { 1, 1, 100 };
        int[] intArray86 = new int[] { (byte) -1 };
        int int87 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray84, intArray86);
        int int88 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray77, intArray86);
        int int89 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray7, intArray77);
        int[] intArray90 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int91 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray7, intArray90);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"b2\" is null");
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
        org.junit.Assert.assertNotNull(intArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray84), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray86), "[-1]");
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + (-1) + "'", int87 == (-1));
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + (-1) + "'", int88 == (-1));
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 0 + "'", int89 == 0);
    }

    @Test
    public void test03321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03321");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(0.0d, 161.715672432487d, 1227.0918332767103d, 762.2907433365718d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1444.590441845377d + "'", double4 == 1444.590441845377d);
    }

    @Test
    public void test03322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03322");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1703.6348893866293d, 0.0d, 3400.8031009312863d, 503.13322656792127d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2078.842028800691d + "'", double4 == 2078.842028800691d);
    }

    @Test
    public void test03323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03323");
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
        int[] intArray63 = new int[] { (byte) -1, '#', (-1) };
        int int64 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray49, intArray63);
        int int65 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray37, intArray63);
        java.lang.Class<?> wildcardClass66 = intArray37.getClass();
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
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray63), "[-1, 35, -1]");
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass66);
    }

    @Test
    public void test03324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03324");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(300.59725112716797d, 320.79201678899346d, 614.1505664186741d, 468.42069516739264d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 355.6408158519169d + "'", double4 == 355.6408158519169d);
    }

    @Test
    public void test03325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03325");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1185.0088054428425d, 0.0d, 206.44828153342843d, 922.8406127352839d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1013.0710045309828d + "'", double4 == 1013.0710045309828d);
    }

    @Test
    public void test03326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03326");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(900.4707772304074d, 943.4805752349077d, 609.373237025105d, 458.682951459312d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 529.0692401880206d + "'", double4 == 529.0692401880206d);
    }

    @Test
    public void test03327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03327");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(261.28660281325404d, 459.52139206247597d, 271.3442139789084d, 1260.1990459869085d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 810.7352650900868d + "'", double4 == 810.7352650900868d);
    }

    @Test
    public void test03328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03328");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(355.43448444224407d, 639.7228865487252d, 429.42357818286894d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 713.7119802893501d + "'", double4 == 713.7119802893501d);
    }

    @Test
    public void test03329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03329");
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
        double double28 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray6, doubleArray13, (int) ' ');
        double[] doubleArray33 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray34 = new double[] {};
        double double36 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray33, doubleArray34, 0);
        double[] doubleArray41 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray42 = new double[] {};
        double double44 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray41, doubleArray42, 0);
        double double46 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray33, doubleArray42, (int) (short) 100);
        double[] doubleArray51 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray52 = new double[] {};
        double double54 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray51, doubleArray52, 0);
        double double56 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray33, doubleArray51, (int) (byte) 0);
        double double58 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray13, doubleArray51, (int) (short) 10);
        double[] doubleArray63 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray64 = new double[] {};
        double double66 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray63, doubleArray64, 0);
        double double68 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray13, doubleArray64, 10);
        // The following exception was thrown during execution in test generation
        try {
            double double70 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray0, doubleArray13, (int) (short) -1);
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
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + (-1.0d) + "'", double46 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[]");
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + (-1.0d) + "'", double54 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + Double.POSITIVE_INFINITY + "'", double56 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 0.0d + "'", double58 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[]");
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + (-1.0d) + "'", double66 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + (-1.0d) + "'", double68 == (-1.0d));
    }

    @Test
    public void test03330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03330");
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
        double[] doubleArray52 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray53 = new double[] {};
        double double55 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray52, doubleArray53, 0);
        double[] doubleArray60 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray61 = new double[] {};
        double double63 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray60, doubleArray61, 0);
        double double65 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray53, doubleArray61, (int) (byte) 1);
        double double67 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray13, doubleArray61, 72);
        double[] doubleArray72 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray73 = new double[] {};
        double double75 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray72, doubleArray73, 0);
        double[] doubleArray80 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray81 = new double[] {};
        double double83 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray80, doubleArray81, 0);
        double double85 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray72, doubleArray81, 1);
        double double87 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray13, doubleArray72, (int) (byte) 10);
        java.lang.Class<?> wildcardClass88 = doubleArray13.getClass();
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
        org.junit.Assert.assertTrue("'" + double85 + "' != '" + (-1.0d) + "'", double85 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double87 + "' != '" + (-1.0d) + "'", double87 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass88);
    }

    @Test
    public void test03331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03331");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1460.1703575490526d, 269.58674802344547d, 956.8483103349404d, 634.2295453448422d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 967.2183354736177d + "'", double4 == 967.2183354736177d);
    }

    @Test
    public void test03332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03332");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(914.2930275299476d, 102.40020118002643d, 1291.2013187151874d, 918.071395620256d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 376.9272290901831d + "'", double4 == 376.9272290901831d);
    }

    @Test
    public void test03333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03333");
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
        double double35 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray23, doubleArray31, (int) (byte) 1);
        double double37 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray5, doubleArray23, (int) (short) 0);
        double[] doubleArray38 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double40 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray5, doubleArray38, (int) (byte) 0);
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
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
    }

    @Test
    public void test03334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03334");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(228.2773007214092d, 989.8852570493364d, 1395.3084982700018d, 392.5814609524481d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1178.5404842944213d + "'", double4 == 1178.5404842944213d);
    }

    @Test
    public void test03335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03335");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1359.661242426394d, 667.7052720987249d, 126.08075884915633d, 493.2930398078507d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1407.9927158681119d + "'", double4 == 1407.9927158681119d);
    }

    @Test
    public void test03336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03336");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(625.0155148874841d, 349.79792638653475d, 439.2786303146151d, 1905.2979125530956d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1293.6851270936224d + "'", double4 == 1293.6851270936224d);
    }

    @Test
    public void test03337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03337");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(517.7839731622196d, 643.9955869586861d, 186.06531298989373d, 1039.668660391156d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 727.3917336047957d + "'", double4 == 727.3917336047957d);
    }

    @Test
    public void test03338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03338");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(715.5946028369693d, 86.6202979275892d, 408.00214576283946d, 914.40064189523d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1135.3728010417708d + "'", double4 == 1135.3728010417708d);
    }

    @Test
    public void test03339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03339");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(297.8808495775337d, 488.9403457312433d, 786.4611048709063d, 1224.1383651672277d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1047.2170983367917d + "'", double4 == 1047.2170983367917d);
    }

    @Test
    public void test03340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03340");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(2645.0825816388333d, 569.959937758982d, 1285.7867645442461d, 602.6577198950658d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1391.993599230671d + "'", double4 == 1391.993599230671d);
    }

    @Test
    public void test03341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03341");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(786.4611048709063d, 378.0d, 1500.8042124361266d, 153.43012976962632d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 954.4706861730292d + "'", double4 == 954.4706861730292d);
    }

    @Test
    public void test03342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03342");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(814.040863045154d, 458.682951459312d, 419.16939749396454d, 60.315077373544014d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 850.8971937272034d + "'", double4 == 850.8971937272034d);
    }

    @Test
    public void test03343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03343");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1159.7502235336701d, 2963.7812627724106d, 628.8349589675499d, 7.706157218758875d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1268.4938111322062d + "'", double4 == 1268.4938111322062d);
    }

    @Test
    public void test03344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03344");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(321.03012572112056d, 2645.398768597145d, 469.82663509603424d, 7.706157218758875d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2786.4891207532996d + "'", double4 == 2786.4891207532996d);
    }

    @Test
    public void test03345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03345");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(590.3802649016793d, 1465.8297154389322d, 1945.7116823361646d, 1040.678218165905d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1428.177684253231d + "'", double4 == 1428.177684253231d);
    }

    @Test
    public void test03346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03346");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1075.2369309587705d, 1432.253175854684d, 423.2002675066391d, 852.931001406363d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1231.3588379004525d + "'", double4 == 1231.3588379004525d);
    }

    @Test
    public void test03347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03347");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(704.5294709279362d, 1151.6143375188597d, 297.8808495775337d, 614.1026145771851d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 416.5814657370902d + "'", double4 == 416.5814657370902d);
    }

    @Test
    public void test03348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03348");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(531.9291584092143d, 1493.8850460277881d, 1754.2553174822342d, 634.0336019724449d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2082.177603128363d + "'", double4 == 2082.177603128363d);
    }

    @Test
    public void test03349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03349");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(467.41331001723336d, 1162.4622209302931d, 305.8769656511977d, 412.7484808105533d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 170.53514037680904d + "'", double4 == 170.53514037680904d);
    }

    @Test
    public void test03350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03350");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1006.4589976708653d, 1486.0106889076544d, 967.2183354736177d, 194.89413763890983d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 812.5129855013802d + "'", double4 == 812.5129855013802d);
    }

    @Test
    public void test03351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03351");
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
        int[] intArray67 = new int[] { (byte) -1, (short) -1, ' ' };
        int[] intArray71 = new int[] { 1, 1, 100 };
        int[] intArray73 = new int[] { (byte) -1 };
        int int74 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray71, intArray73);
        int int75 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray67, intArray71);
        int int76 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray60, intArray67);
        int[] intArray80 = new int[] { 1, 1, 100 };
        int[] intArray82 = new int[] { (byte) -1 };
        int int83 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray80, intArray82);
        int int84 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray67, intArray80);
        java.lang.Class<?> wildcardClass85 = intArray67.getClass();
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray67), "[-1, -1, 32]");
        org.junit.Assert.assertNotNull(intArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray71), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray73), "[-1]");
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 72 + "'", int75 == 72);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-1) + "'", int76 == (-1));
        org.junit.Assert.assertNotNull(intArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray80), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray82), "[-1]");
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + (-1) + "'", int83 == (-1));
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 72 + "'", int84 == 72);
        org.junit.Assert.assertNotNull(wildcardClass85);
    }

    @Test
    public void test03352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03352");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(238.45762724844747d, 1.0d, 727.7419504237471d, 286.3414624115187d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 774.6257855868183d + "'", double4 == 774.6257855868183d);
    }

    @Test
    public void test03353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03353");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1734.4312664158128d, 1184.2462885697346d, 422.70616878417604d, 892.774615770831d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1558.527718499628d + "'", double4 == 1558.527718499628d);
    }

    @Test
    public void test03354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03354");
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
        double[] doubleArray62 = new double[] { 706.5032237784504d, (-1.0f), 246.4044206487757d, 51.402702719722015d };
        double double64 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray13, doubleArray62, 1);
        double[] doubleArray69 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray70 = new double[] {};
        double double72 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray69, doubleArray70, 0);
        double[] doubleArray77 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray78 = new double[] {};
        double double80 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray77, doubleArray78, 0);
        double double82 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray69, doubleArray78, (int) (short) 100);
        double double84 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray13, doubleArray78, 0);
        java.lang.Class<?> wildcardClass85 = doubleArray78.getClass();
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray62), "[706.5032237784504, -1.0, 246.4044206487757, 51.402702719722015]");
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
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + (-1.0d) + "'", double82 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double84 + "' != '" + 0.0d + "'", double84 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass85);
    }

    @Test
    public void test03355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03355");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(553.0390594020772d, 488.02963325941397d, 1439.3819415348441d, 776.4566994345988d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1174.7699483079518d + "'", double4 == 1174.7699483079518d);
    }

    @Test
    public void test03356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03356");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(567.8266350960342d, 807.5323439092334d, (double) 1, 834.828952492293d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 594.1232436790938d + "'", double4 == 594.1232436790938d);
    }

    @Test
    public void test03357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03357");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1117.4402236439857d, 1650.5689502464306d, 3583.5966182809866d, 1289.4584518548806d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2472.1483842289454d + "'", double4 == 2472.1483842289454d);
    }

    @Test
    public void test03358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03358");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(0.0d, 568.8137394967453d, 553.1129724310254d, 1197.6466171091483d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1319.2010384109283d + "'", double4 == 1319.2010384109283d);
    }

    @Test
    public void test03359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03359");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(0.0d, 360.0595479943278d, 372.95052751976243d, 886.4434740943086d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 961.703763506027d + "'", double4 == 961.703763506027d);
    }

    @Test
    public void test03360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03360");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(2592.0288495957343d, 2022.654758985479d, 650.8900422812455d, 622.4835640535658d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3341.3100022464023d + "'", double4 == 3341.3100022464023d);
    }

    @Test
    public void test03361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03361");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(373.6116600540088d, 918.071395620256d, 446.7421770525469d, 388.3745399895274d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 602.8273726292666d + "'", double4 == 602.8273726292666d);
    }

    @Test
    public void test03362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03362");
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
        int int45 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray19, intArray41);
        int[] intArray49 = new int[] { 1, 1, 100 };
        int[] intArray51 = new int[] { (byte) -1 };
        int int52 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray49, intArray51);
        int[] intArray55 = new int[] { 'a', 10 };
        int int56 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray51, intArray55);
        int[] intArray60 = new int[] { 1, 1, 100 };
        int[] intArray62 = new int[] { (byte) -1 };
        int int63 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray60, intArray62);
        int[] intArray67 = new int[] { 1, 1, 100 };
        int[] intArray69 = new int[] { (byte) -1 };
        int int70 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray67, intArray69);
        int[] intArray73 = new int[] { 'a', 10 };
        int int74 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray69, intArray73);
        int int75 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray60, intArray73);
        int int76 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray51, intArray60);
        int int77 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray41, intArray51);
        int int78 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray12, intArray41);
        int[] intArray84 = new int[] { (short) 1, 100, '4', ' ', 26 };
        int int85 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray12, intArray84);
        int[] intArray86 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int87 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray84, intArray86);
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
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[1, 1, -1]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
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
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray55), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
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
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-1) + "'", int76 == (-1));
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + (-1) + "'", int77 == (-1));
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
        org.junit.Assert.assertNotNull(intArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray84), "[1, 100, 52, 32, 26]");
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 136 + "'", int85 == 136);
    }

    @Test
    public void test03363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03363");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1978.061686919199d, 1483.1604443921456d, 1395.3084982700018d, 634.0336019724449d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1464.9275654469902d + "'", double4 == 1464.9275654469902d);
    }

    @Test
    public void test03364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03364");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(440.1952908849384d, 853.2224314401885d, 1416.821036606561d, 206.8986500189719d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1622.949527142839d + "'", double4 == 1622.949527142839d);
    }

    @Test
    public void test03365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03365");
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
        int[] intArray56 = new int[] { 'a', 10 };
        int int57 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray52, intArray56);
        int[] intArray61 = new int[] { (byte) 1, (short) 1, (short) -1 };
        int int62 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray52, intArray61);
        int[] intArray66 = new int[] { (byte) -1, '#', (-1) };
        int int67 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray52, intArray66);
        int int68 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray35, intArray52);
        int[] intArray72 = new int[] { 1, 1, 100 };
        int[] intArray74 = new int[] { (byte) -1 };
        int int75 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray72, intArray74);
        int[] intArray78 = new int[] { 'a', 10 };
        int int79 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray74, intArray78);
        int[] intArray83 = new int[] { (byte) 1, (short) 1, (short) -1 };
        int int84 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray74, intArray83);
        int int85 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray35, intArray74);
        int int86 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray21, intArray35);
        int int87 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray5, intArray35);
        java.lang.Class<?> wildcardClass88 = intArray5.getClass();
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
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray56), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray61), "[1, 1, -1]");
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertNotNull(intArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray66), "[-1, 35, -1]");
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertNotNull(intArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray72), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray74), "[-1]");
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
        org.junit.Assert.assertNotNull(intArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray78), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + (-1) + "'", int79 == (-1));
        org.junit.Assert.assertNotNull(intArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray83), "[1, 1, -1]");
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + (-1) + "'", int84 == (-1));
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 0 + "'", int85 == 0);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + (-1) + "'", int86 == (-1));
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 0 + "'", int87 == 0);
        org.junit.Assert.assertNotNull(wildcardClass88);
    }

    @Test
    public void test03366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03366");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1290.92187181343d, 795.7792892510216d, 853.5674250757505d, 285.1699348719751d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1096.729625177833d + "'", double4 == 1096.729625177833d);
    }

    @Test
    public void test03367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03367");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(281.6933070507258d, 537.6734054899458d, 774.6257855868183d, 156.94538945476546d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 508.47268495000185d + "'", double4 == 508.47268495000185d);
    }

    @Test
    public void test03368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03368");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(3333.744814787238d, 459.7280589510255d, 141.4213562373095d, 4040.16327341831d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3269.549831812153d + "'", double4 == 3269.549831812153d);
    }

    @Test
    public void test03369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03369");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(426.8068410495756d, 685.8436957842314d, 102.26030820844352d, 1416.821036606561d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1041.8534250956536d + "'", double4 == 1041.8534250956536d);
    }

    @Test
    public void test03370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03370");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1174.9292440036095d, 2429.070196532499d, 884.8574728319071d, 297.2580588905373d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2421.8839088136638d + "'", double4 == 2421.8839088136638d);
    }

    @Test
    public void test03371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03371");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(942.7215473271511d, 662.8861550421406d, 612.084721172372d, 849.6583320319836d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 517.4090031446221d + "'", double4 == 517.4090031446221d);
    }

    @Test
    public void test03372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03372");
        double[] doubleArray4 = new double[] { 573.181255425285d, 819.7694166303316d, 585.5213407208503d, 1621.3386859525015d };
        double[] doubleArray9 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray10 = new double[] {};
        double double12 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray9, doubleArray10, 0);
        double[] doubleArray17 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray18 = new double[] {};
        double double20 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray17, doubleArray18, 0);
        double double22 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray9, doubleArray18, (int) (short) 100);
        double[] doubleArray27 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray28 = new double[] {};
        double double30 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray27, doubleArray28, 0);
        double double32 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray18, doubleArray27, (int) (short) 100);
        double[] doubleArray37 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray38 = new double[] {};
        double double40 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray37, doubleArray38, 0);
        double[] doubleArray45 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray46 = new double[] {};
        double double48 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray45, doubleArray46, 0);
        double[] doubleArray53 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray54 = new double[] {};
        double double56 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray53, doubleArray54, 0);
        double double58 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray45, doubleArray54, 1);
        double double60 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray38, doubleArray54, (int) (short) 10);
        double double62 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray18, doubleArray38, 100);
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
        double double92 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray38, doubleArray68, (int) (short) 1);
        double double94 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray4, doubleArray68, (int) '#');
        double[] doubleArray95 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double97 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray68, doubleArray95, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"p2\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[573.181255425285, 819.7694166303316, 585.5213407208503, 1621.3386859525015]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[]");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[]");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-1.0d) + "'", double20 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-1.0d) + "'", double22 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[]");
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + (-1.0d) + "'", double30 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + (-1.0d) + "'", double32 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[]");
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + (-1.0d) + "'", double40 == (-1.0d));
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
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 0.0d + "'", double62 == 0.0d);
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
        org.junit.Assert.assertTrue("'" + double94 + "' != '" + (-1.0d) + "'", double94 == (-1.0d));
    }

    @Test
    public void test03373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03373");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(622.4835640535658d, 475.9324615695342d, 362.91048069008355d, 747.071354124768d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 530.7119759187161d + "'", double4 == 530.7119759187161d);
    }

    @Test
    public void test03374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03374");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(826.6984911278794d, 263.83208262570474d, 1695.475884420738d, 156.94538945476546d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 975.664086463798d + "'", double4 == 975.664086463798d);
    }

    @Test
    public void test03375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03375");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(848.9132727968378d, 1759.5059694863512d, 460.08781329172984d, 497.6952949381995d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 523.964985405007d + "'", double4 == 523.964985405007d);
    }

    @Test
    public void test03376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03376");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(444.112221123372d, 766.4096038105828d, 2727.7455340885726d, 1207.2793752197167d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2724.503084374335d + "'", double4 == 2724.503084374335d);
    }

    @Test
    public void test03377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03377");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(167.87372472293382d, 853.2224314401885d, 1155.4240670859472d, 653.8220417482348d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1100.63683634568d + "'", double4 == 1100.63683634568d);
    }

    @Test
    public void test03378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03378");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(461.52306304116587d, 754.5164898211783d, 618.7629008472783d, 730.3132551932085d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 311.404132905176d + "'", double4 == 311.404132905176d);
    }

    @Test
    public void test03379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03379");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(723.561615207351d, 49.62154523619969d, 3204.7597357909353d, 988.5078734431651d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2495.3037156507967d + "'", double4 == 2495.3037156507967d);
    }

    @Test
    public void test03380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03380");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(974.201188346456d, 366.319226711136d, 75.85073476263909d, 296.6349750306253d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1125.224204717177d + "'", double4 == 1125.224204717177d);
    }

    @Test
    public void test03381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03381");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(349.68492527213414d, 984.2335746468543d, 264.9111278263732d, 934.873066853779d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 134.1343052388362d + "'", double4 == 134.1343052388362d);
    }

    @Test
    public void test03382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03382");
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
        int[] intArray47 = new int[] { (byte) 1, (short) 1, (short) -1 };
        int int48 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray38, intArray47);
        int[] intArray52 = new int[] { 1, 1, 100 };
        int[] intArray54 = new int[] { (byte) -1 };
        int int55 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray52, intArray54);
        int[] intArray58 = new int[] { 'a', 10 };
        int int59 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray54, intArray58);
        int[] intArray63 = new int[] { 1, 1, 100 };
        int[] intArray65 = new int[] { (byte) -1 };
        int int66 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray63, intArray65);
        int[] intArray70 = new int[] { 1, 1, 100 };
        int[] intArray72 = new int[] { (byte) -1 };
        int int73 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray70, intArray72);
        int[] intArray76 = new int[] { 'a', 10 };
        int int77 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray72, intArray76);
        int int78 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray63, intArray76);
        int int79 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray54, intArray63);
        int int80 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray47, intArray54);
        int[] intArray84 = new int[] { 1, 1, 100 };
        int[] intArray86 = new int[] { (byte) -1 };
        int int87 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray84, intArray86);
        int[] intArray91 = new int[] { 1, 1, 100 };
        int[] intArray93 = new int[] { (byte) -1 };
        int int94 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray91, intArray93);
        int int95 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray84, intArray93);
        int int96 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray47, intArray84);
        int int97 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray28, intArray84);
        // The following exception was thrown during execution in test generation
        try {
            int int98 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray0, intArray28);
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
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[1, 1, -1]");
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
        org.junit.Assert.assertNotNull(intArray91);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray91), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray93);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray93), "[-1]");
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + (-1) + "'", int94 == (-1));
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + (-1) + "'", int95 == (-1));
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + 101 + "'", int96 == 101);
        org.junit.Assert.assertTrue("'" + int97 + "' != '" + 0 + "'", int97 == 0);
    }

    @Test
    public void test03383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03383");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(267.02682409492445d, 911.0474342832409d, 1512.8744646387922d, 313.2757432907782d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1246.7057816403624d + "'", double4 == 1246.7057816403624d);
    }

    @Test
    public void test03384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03384");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(516.5821079807387d, 0.0d, 58.069587009010455d, 343.53860254466906d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 490.0793677165491d + "'", double4 == 490.0793677165491d);
    }

    @Test
    public void test03385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03385");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(913.8595240793304d, 829.6926964153299d, 423.1701731848648d, 1695.475884420738d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 922.8760338390965d + "'", double4 == 922.8760338390965d);
    }

    @Test
    public void test03386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03386");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1002.6348330943177d, 1476.0291403541248d, 828.6293915546679d, 221.91905402072143d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1428.1155278730532d + "'", double4 == 1428.1155278730532d);
    }

    @Test
    public void test03387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03387");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(176.4602767831856d, 284.0384066340601d, 1267.400893421706d, 135.86683466289244d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1239.112188609688d + "'", double4 == 1239.112188609688d);
    }

    @Test
    public void test03388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03388");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(846.7695593308263d, 299.80915355137904d, 427.0954714739296d, 633.9625404236099d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 753.8274747291275d + "'", double4 == 753.8274747291275d);
    }

    @Test
    public void test03389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03389");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance((double) 100.0f, 3114.804595839457d, 930.8856102419176d, 810.4677820566644d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1093.222468963934d + "'", double4 == 1093.222468963934d);
    }

    @Test
    public void test03390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03390");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(896.632439101549d, 367.4257229620187d, 0.0d, 1069.4224285354492d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 913.1298436135796d + "'", double4 == 913.1298436135796d);
    }

    @Test
    public void test03391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03391");
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
        double[] doubleArray96 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double98 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray29, doubleArray96, (int) (byte) 0);
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
    }

    @Test
    public void test03392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03392");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1606.2044434854495d, 393.60755379174935d, 1015.6788987322241d, 284.03695697436626d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1448.0494747739556d + "'", double4 == 1448.0494747739556d);
    }

    @Test
    public void test03393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03393");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1371.314853839036d, 733.1718350049796d, 582.3482949245309d, 2636.4735994589255d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2692.268323368451d + "'", double4 == 2692.268323368451d);
    }

    @Test
    public void test03394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03394");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(822.5426568831847d, 1125.224204717177d, 536.4161158553086d, 334.29461053740494d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1077.0561352076481d + "'", double4 == 1077.0561352076481d);
    }

    @Test
    public void test03395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03395");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(179.25105674774412d, 514.4583823621946d, 192.23203831232172d, 179.25105674774412d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 348.18830717902813d + "'", double4 == 348.18830717902813d);
    }

    @Test
    public void test03396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03396");
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
        java.lang.Class<?> wildcardClass90 = intArray68.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass90);
    }

    @Test
    public void test03397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03397");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(495.15278870800955d, 1103.9192087255542d, 1790.7743259911974d, 2369.116758661333d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2560.8190872189666d + "'", double4 == 2560.8190872189666d);
    }

    @Test
    public void test03398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03398");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(395.87806039621915d, 301.85507241890923d, 2001.6207512712501d, 1113.295503583767d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2417.183122039889d + "'", double4 == 2417.183122039889d);
    }

    @Test
    public void test03399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03399");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1691.546121539237d, 1184.2462885697346d, 206.77820008724825d, 1096.729625177833d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1572.2845848438903d + "'", double4 == 1572.2845848438903d);
    }

    @Test
    public void test03400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03400");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(245.87495653847805d, 1790.7743259911974d, 1221.248948951979d, 610.1198696007909d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2156.0284488039074d + "'", double4 == 2156.0284488039074d);
    }

    @Test
    public void test03401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03401");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(521.8457348876328d, 1463.7224374719767d, 0.0d, 803.8248080837866d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1181.7433642758228d + "'", double4 == 1181.7433642758228d);
    }

    @Test
    public void test03402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03402");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(251.12978742411298d, 836.3511286601912d, 860.9945876859217d, 1328.573669597486d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1102.0873411991038d + "'", double4 == 1102.0873411991038d);
    }

    @Test
    public void test03403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03403");
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
        int[] intArray33 = new int[] { 1, 1, 100 };
        int[] intArray35 = new int[] { (byte) -1 };
        int int36 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray33, intArray35);
        int[] intArray39 = new int[] { 'a', 10 };
        int int40 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray35, intArray39);
        int[] intArray44 = new int[] { (byte) 1, (short) 1, (short) -1 };
        int int45 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray35, intArray44);
        int[] intArray49 = new int[] { 1, 1, 100 };
        int[] intArray51 = new int[] { (byte) -1 };
        int int52 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray49, intArray51);
        int[] intArray55 = new int[] { 'a', 10 };
        int int56 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray51, intArray55);
        int[] intArray60 = new int[] { 1, 1, 100 };
        int[] intArray62 = new int[] { (byte) -1 };
        int int63 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray60, intArray62);
        int[] intArray67 = new int[] { 1, 1, 100 };
        int[] intArray69 = new int[] { (byte) -1 };
        int int70 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray67, intArray69);
        int[] intArray73 = new int[] { 'a', 10 };
        int int74 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray69, intArray73);
        int int75 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray60, intArray73);
        int int76 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray51, intArray60);
        int int77 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray44, intArray51);
        int[] intArray81 = new int[] { 1, 1, 100 };
        int[] intArray83 = new int[] { (byte) -1 };
        int int84 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray81, intArray83);
        int[] intArray88 = new int[] { 1, 1, 100 };
        int[] intArray90 = new int[] { (byte) -1 };
        int int91 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray88, intArray90);
        int int92 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray81, intArray90);
        int int93 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray44, intArray81);
        int int94 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray27, intArray44);
        int int95 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray5, intArray27);
        int[] intArray96 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int97 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray27, intArray96);
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
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[-1]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
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
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray49), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray51), "[-1]");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray55), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
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
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-1) + "'", int76 == (-1));
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + (-1) + "'", int77 == (-1));
        org.junit.Assert.assertNotNull(intArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray81), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray83), "[-1]");
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + (-1) + "'", int84 == (-1));
        org.junit.Assert.assertNotNull(intArray88);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray88), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray90);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray90), "[-1]");
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + (-1) + "'", int91 == (-1));
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + (-1) + "'", int92 == (-1));
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 101 + "'", int93 == 101);
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + (-1) + "'", int94 == (-1));
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + (-1) + "'", int95 == (-1));
    }

    @Test
    public void test03404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03404");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(23.120346888421807d, 372.95052751976243d, 438.97829378179034d, 296.4987063121494d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 492.30976810098156d + "'", double4 == 492.30976810098156d);
    }

    @Test
    public void test03405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03405");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(991.2194913901131d, 574.5536640965004d, 0.0d, 951.9825489532838d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 991.9957750733951d + "'", double4 == 991.9957750733951d);
    }

    @Test
    public void test03406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03406");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(80.72264272297954d, 75.85073476263909d, 238.45762724844747d, 165.2809950475394d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 178.97050117573568d + "'", double4 == 178.97050117573568d);
    }

    @Test
    public void test03407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03407");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(269.5711589322303d, 1556.485687014862d, 405.75245585791146d, 444.112221123372d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 221.38186019448963d + "'", double4 == 221.38186019448963d);
    }

    @Test
    public void test03408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03408");
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
        int[] intArray88 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int89 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray70, intArray88);
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
    }

    @Test
    public void test03409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03409");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(60.259378594770354d, 0.0d, 195.96347416036195d, 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 155.70409556559162d + "'", double4 == 155.70409556559162d);
    }

    @Test
    public void test03410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03410");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(457.8098653414465d, 884.0404319516844d, 1121.2573802880665d, 49.62154523619969d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1497.8664016621046d + "'", double4 == 1497.8664016621046d);
    }

    @Test
    public void test03411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03411");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(996.1563978294703d, 966.2253882053817d, 266.09479742842706d, 855.8783938449538d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 743.4163428268258d + "'", double4 == 743.4163428268258d);
    }

    @Test
    public void test03412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03412");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1011.7972527379859d, 448.5118411552872d, 0.0d, 653.6605082493417d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1073.3105833825828d + "'", double4 == 1073.3105833825828d);
    }

    @Test
    public void test03413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03413");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(349.57519522850913d, 2386.244584635255d, 670.5025714040848d, 1178.8259895354986d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 889.1857289890074d + "'", double4 == 889.1857289890074d);
    }

    @Test
    public void test03414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03414");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(567.3390230270919d, 0.0d, 407.95790549631715d, 391.2284782475115d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 237.5231875163333d + "'", double4 == 237.5231875163333d);
    }

    @Test
    public void test03415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03415");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(760.1230687759271d, 580.7258883643475d, 162.4885204088238d, 1018.5759656340812d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 651.1259120141996d + "'", double4 == 651.1259120141996d);
    }

    @Test
    public void test03416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03416");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1691.546121539237d, 607.089723914349d, 0.0d, 512.5463828234233d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1786.0894626301626d + "'", double4 == 1786.0894626301626d);
    }

    @Test
    public void test03417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03417");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(621.5343680937419d, 465.8212726297929d, 0.0d, 3307.8834349646922d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3463.596530428641d + "'", double4 == 3463.596530428641d);
    }

    @Test
    public void test03418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03418");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1634.984457121407d, 1194.5686548890772d, 969.4136547668509d, 509.60940738012226d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1350.530049863511d + "'", double4 == 1350.530049863511d);
    }

    @Test
    public void test03419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03419");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1756.3197263345141d, 807.9389046705485d, 1111.061838552791d, 2186.7092492692327d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2024.0282323804074d + "'", double4 == 2024.0282323804074d);
    }

    @Test
    public void test03420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03420");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(973.531495516293d, 572.7479953040686d, 860.9945876859217d, 228.29858276560483d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 753.6820615291944d + "'", double4 == 753.6820615291944d);
    }

    @Test
    public void test03421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03421");
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
        java.lang.Class<?> wildcardClass61 = intArray5.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass61);
    }

    @Test
    public void test03422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03422");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(78.45227647258133d, 1741.486649791941d, 367.4257229620187d, 777.2918910170832d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 756.2291052536208d + "'", double4 == 756.2291052536208d);
    }

    @Test
    public void test03423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03423");
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
        int[] intArray93 = new int[] { 1, 1, 100 };
        int[] intArray95 = new int[] { (byte) -1 };
        int int96 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray93, intArray95);
        int int97 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray68, intArray93);
        java.lang.Class<?> wildcardClass98 = intArray68.getClass();
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
        org.junit.Assert.assertNotNull(intArray93);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray93), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray95);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray95), "[-1]");
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + (-1) + "'", int96 == (-1));
        org.junit.Assert.assertTrue("'" + int97 + "' != '" + (-1) + "'", int97 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass98);
    }

    @Test
    public void test03424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03424");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(2495.3037156507967d, 861.3005513324127d, 1429.1280765910471d, 402.9691622687067d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2348.3173500617618d + "'", double4 == 2348.3173500617618d);
    }

    @Test
    public void test03425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03425");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(802.6421558686652d, 497.7505917183977d, 918.1433699290993d, 521.9751938756947d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 139.7258162177311d + "'", double4 == 139.7258162177311d);
    }

    @Test
    public void test03426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03426");
        double[] doubleArray4 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray5 = new double[] {};
        double double7 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray4, doubleArray5, 0);
        double[] doubleArray13 = new double[] { 232.4213562373095d, (short) 0, 1.0f, 75.85073476263909d, (-1L) };
        double double15 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray5, doubleArray13, (int) (byte) -1);
        double[] doubleArray16 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double18 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray13, doubleArray16, (int) (byte) 0);
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
    }

    @Test
    public void test03427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03427");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(3122.1327365159536d, 855.8409738812244d, 615.2073500056413d, 1256.5953319294058d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3124.8847501054165d + "'", double4 == 3124.8847501054165d);
    }

    @Test
    public void test03428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03428");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(281.63996109123826d, 412.7484808105533d, 554.1026773232632d, 1107.0997065215752d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 869.2638972501098d + "'", double4 == 869.2638972501098d);
    }

    @Test
    public void test03429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03429");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(490.7322591768047d, 490.3301173206524d, 703.4846871930835d, 238.57103000254892d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 329.92253806839784d + "'", double4 == 329.92253806839784d);
    }

    @Test
    public void test03430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03430");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(132.64218988096647d, 396.3374956030935d, 1569.438920038542d, 665.4510980134135d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1532.4066615545596d + "'", double4 == 1532.4066615545596d);
    }

    @Test
    public void test03431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03431");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(457.8098653414465d, 161.48391061683444d, 1147.40972671585d, 340.31553305515484d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 868.4314838127239d + "'", double4 == 868.4314838127239d);
    }

    @Test
    public void test03432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03432");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1635.4100237188457d, 1082.4838795872572d, 774.1563488351445d, 316.8770294897399d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1574.892742180067d + "'", double4 == 1574.892742180067d);
    }

    @Test
    public void test03433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03433");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(220.238507078122d, 2548.18217586309d, 969.9376073920084d, 513.5978917155679d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 805.0518427817625d + "'", double4 == 805.0518427817625d);
    }

    @Test
    public void test03434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03434");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(905.7508645515792d, 10.0d, 558.0681006752535d, 895.0055401131152d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 347.84876928626426d + "'", double4 == 347.84876928626426d);
    }

    @Test
    public void test03435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03435");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(197.1225084287766d, 3333.744814787238d, 292.0641734589212d, 1157.8012157483172d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 965.3587408087419d + "'", double4 == 965.3587408087419d);
    }

    @Test
    public void test03436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03436");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(446.7421770525469d, 943.279124792876d, 460.51094068065646d, 474.72340590982594d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 31.18538151458436d + "'", double4 == 31.18538151458436d);
    }

    @Test
    public void test03437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03437");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(485.9368605967579d, 992.5724510938753d, 466.4346434120471d, 556.9757457476818d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 455.09892253090436d + "'", double4 == 455.09892253090436d);
    }

    @Test
    public void test03438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03438");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(159.6408171889707d, 980.2263420235763d, 0.0d, 710.056639111864d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 429.810520100683d + "'", double4 == 429.810520100683d);
    }

    @Test
    public void test03439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03439");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(397.8625759407711d, 837.6288297522865d, 303.3128472749923d, 385.1080041055461d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 95.406133416423d + "'", double4 == 95.406133416423d);
    }

    @Test
    public void test03440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03440");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(220.78840830511703d, 167.29384278124112d, 560.3844877706626d, 818.3121238642178d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 687.284575589997d + "'", double4 == 687.284575589997d);
    }

    @Test
    public void test03441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03441");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(898.6352748337238d, 1532.6762509565908d, 967.2183354736177d, 764.0655433643342d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 151.03856737429348d + "'", double4 == 151.03856737429348d);
    }

    @Test
    public void test03442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03442");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(760.2396163201802d, 1391.993599230671d, 1060.4403775179533d, 98.5193674472778d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 726.6320835141663d + "'", double4 == 726.6320835141663d);
    }

    @Test
    public void test03443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03443");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1026.1396300310848d, 160.51070384752757d, 1294.856623393348d, 784.7599638001475d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 892.966253314883d + "'", double4 == 892.966253314883d);
    }

    @Test
    public void test03444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03444");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(871.3030756585122d, 852.897961919623d, 634.0336019724449d, 230.61154201185937d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 859.5558935938309d + "'", double4 == 859.5558935938309d);
    }

    @Test
    public void test03445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03445");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(810.8207860532161d, 787.3684582930454d, 1709.9299242826414d, 3307.8834349646922d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3419.624114901072d + "'", double4 == 3419.624114901072d);
    }

    @Test
    public void test03446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03446");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(638.0814444865287d, 802.6421558686652d, 442.2044982103387d, 637.8514798973449d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 360.6676222475102d + "'", double4 == 360.6676222475102d);
    }

    @Test
    public void test03447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03447");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1195.2564878334267d, 692.1018639959708d, 204.83607191297912d, 77.86254967678965d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1604.6597302396287d + "'", double4 == 1604.6597302396287d);
    }

    @Test
    public void test03448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03448");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(195.86115869725893d, 0.0d, (double) 136, 210.8229488246638d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 270.6841075219227d + "'", double4 == 270.6841075219227d);
    }

    @Test
    public void test03449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03449");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(476.4278225087196d, 217.47976508146692d, 1315.3811552006025d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 964.7933273479958d + "'", double4 == 964.7933273479958d);
    }

    @Test
    public void test03450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03450");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(100.4987562112089d, 630.1930244036126d, 86.44669753535501d, 942.7215473271511d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 842.3400086830483d + "'", double4 == 842.3400086830483d);
    }

    @Test
    public void test03451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03451");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(531.6236873455962d, 506.64081324618246d, 326.3298204913991d, 983.8351075302581d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 682.4881611382727d + "'", double4 == 682.4881611382727d);
    }

    @Test
    public void test03452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03452");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1239.452605656115d, 438.1374926787372d, 3124.8847501054165d, 1370.939463128285d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2818.2341148988494d + "'", double4 == 2818.2341148988494d);
    }

    @Test
    public void test03453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03453");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1751.8339077685805d, 81.25955692602055d, 10.0d, 556.9757457476818d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2217.550096590242d + "'", double4 == 2217.550096590242d);
    }

    @Test
    public void test03454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03454");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1428.177684253231d, 160.51070384752757d, 366.319226711136d, 535.9469777784859d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1386.945931689516d + "'", double4 == 1386.945931689516d);
    }

    @Test
    public void test03455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03455");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1335.6221527888076d, 0.0d, 1391.993599230671d, 972.8176660596337d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1029.189112501497d + "'", double4 == 1029.189112501497d);
    }

    @Test
    public void test03456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03456");
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
        int[] intArray34 = new int[] { (byte) -1, (short) -1, ' ' };
        int[] intArray38 = new int[] { 1, 1, 100 };
        int[] intArray40 = new int[] { (byte) -1 };
        int int41 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray38, intArray40);
        int int42 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray34, intArray38);
        int int43 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray5, intArray38);
        java.lang.Class<?> wildcardClass44 = intArray5.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test03457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03457");
        int[] intArray3 = new int[] { (byte) -1, (short) -1, ' ' };
        int[] intArray7 = new int[] { 1, 1, 100 };
        int[] intArray9 = new int[] { (byte) -1 };
        int int10 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray7, intArray9);
        int int11 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray3, intArray7);
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
        int int73 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray7, intArray33);
        int[] intArray77 = new int[] { 1, 1, 100 };
        int[] intArray79 = new int[] { (byte) -1 };
        int int80 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray77, intArray79);
        int[] intArray83 = new int[] { 'a', 10 };
        int int84 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray79, intArray83);
        int[] intArray88 = new int[] { (byte) 1, (short) 1, (short) -1 };
        int int89 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray79, intArray88);
        int int90 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray33, intArray88);
        java.lang.Class<?> wildcardClass91 = intArray33.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, -1, 32]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 72 + "'", int11 == 72);
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
        org.junit.Assert.assertNotNull(intArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray83), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + (-1) + "'", int84 == (-1));
        org.junit.Assert.assertNotNull(intArray88);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray88), "[1, 1, -1]");
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + (-1) + "'", int89 == (-1));
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + (-1) + "'", int90 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass91);
    }

    @Test
    public void test03458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03458");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1051.3532201541273d, 2348.3173500617618d, 1079.896299750692d, 58.069587009010455d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2318.790842649316d + "'", double4 == 2318.790842649316d);
    }

    @Test
    public void test03459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03459");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(2095.41352621822d, 1122.713551037035d, 1631.6742652109288d, 650.8900422812455d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 935.5627697630805d + "'", double4 == 935.5627697630805d);
    }

    @Test
    public void test03460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03460");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(772.0458937590442d, 1260.1990459869085d, 235.95949270096705d, 650.6741640168868d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 549.654187812669d + "'", double4 == 549.654187812669d);
    }

    @Test
    public void test03461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03461");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(969.5274756057248d, 692.0591126438114d, 740.7843713896625d, 1633.5358564520893d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 702.3037359722722d + "'", double4 == 702.3037359722722d);
    }

    @Test
    public void test03462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03462");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(914.0373801399567d, 1549.2997861791393d, 347.4014495905789d, 142.45000861928543d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 957.3000311708643d + "'", double4 == 957.3000311708643d);
    }

    @Test
    public void test03463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03463");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(739.7419101766809d, 282.2613666245667d, 0.0d, 1393.7615781276963d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1851.2421216798107d + "'", double4 == 1851.2421216798107d);
    }

    @Test
    public void test03464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03464");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1187.8452161311545d, 622.5215970819753d, 1943.694419421311d, 1695.475884420738d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1828.8034906289192d + "'", double4 == 1828.8034906289192d);
    }

    @Test
    public void test03465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03465");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(264.9111278263732d, 468.9509167769467d, 391.5798783907461d, 686.1083370593119d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 343.8261708467381d + "'", double4 == 343.8261708467381d);
    }

    @Test
    public void test03466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03466");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(403.30415572758443d, 256.5675697232512d, 297.8808495775337d, 679.5574904363259d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 295.68560738951646d + "'", double4 == 295.68560738951646d);
    }

    @Test
    public void test03467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03467");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(181.94685709660757d, 1028.732704283299d, 232.4213562373095d, 1075.2369309587705d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 96.97872581617344d + "'", double4 == 96.97872581617344d);
    }

    @Test
    public void test03468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03468");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(455.7720019217035d, (double) ' ', 0.0d, 609.7793622065474d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1033.551364128251d + "'", double4 == 1033.551364128251d);
    }

    @Test
    public void test03469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03469");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(422.7103058845154d, 2212.0898829125053d, 718.2552672071502d, 564.0294948337818d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1943.6053494013581d + "'", double4 == 1943.6053494013581d);
    }

    @Test
    public void test03470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03470");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1595.4753932860335d, 57.75429951679375d, (double) (short) 10, 1058.2999707997549d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2586.021064568995d + "'", double4 == 2586.021064568995d);
    }

    @Test
    public void test03471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03471");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(0.0d, 1898.5040154974722d, 1283.448058678269d, 993.1168268225509d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1622.812358543991d + "'", double4 == 1622.812358543991d);
    }

    @Test
    public void test03472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03472");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1423.4920541423903d, 875.2621104553508d, 200.01741434894532d, 144.3969578381549d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1770.0210336623804d + "'", double4 == 1770.0210336623804d);
    }

    @Test
    public void test03473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03473");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(366.91729613657d, 389.2205766920531d, 2847.4902779710783d, 796.6050949282106d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2887.957500070666d + "'", double4 == 2887.957500070666d);
    }

    @Test
    public void test03474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03474");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(489.5472968394182d, 215.05196722620533d, 266.09479742842706d, 991.2194913901131d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 999.620023574899d + "'", double4 == 999.620023574899d);
    }

    @Test
    public void test03475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03475");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(588.5572433621583d, 2875.103071296642d, 2469.1663937111593d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4755.712221645643d + "'", double4 == 4755.712221645643d);
    }

    @Test
    public void test03476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03476");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(2482.6575303702894d, 323.77539300519203d, 262.3073194548731d, 686.3437606194915d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2582.9185785297154d + "'", double4 == 2582.9185785297154d);
    }

    @Test
    public void test03477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03477");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(114.80126049879055d, 229.10435660536763d, 340.53058208047037d, 1293.6851270936224d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1200.3003363905664d + "'", double4 == 1200.3003363905664d);
    }

    @Test
    public void test03478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03478");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(747.3085974017015d, 3341.3100022464023d, 796.6050949282106d, 326.0653325559482d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3064.541167216963d + "'", double4 == 3064.541167216963d);
    }

    @Test
    public void test03479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03479");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1370.939463128285d, 1102.0873411991038d, 286.3885107063019d, 609.7793622065474d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1324.9964028761062d + "'", double4 == 1324.9964028761062d);
    }

    @Test
    public void test03480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03480");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(0.0d, 268.59948986728233d, 2800.047902676809d, 119.99500012499374d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2948.6523924190974d + "'", double4 == 2948.6523924190974d);
    }

    @Test
    public void test03481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03481");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1132.4450013621713d, 975.664086463798d, 178.97050117573568d, 1020.8620017552486d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 959.981452064076d + "'", double4 == 959.981452064076d);
    }

    @Test
    public void test03482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03482");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(382.2425147690072d, 698.331192626287d, 293.6673919614228d, 784.9484205212476d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 175.19235070254496d + "'", double4 == 175.19235070254496d);
    }

    @Test
    public void test03483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03483");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(703.4846871930835d, 418.8312603752497d, 889.1857289890074d, 784.7599638001475d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 202.70803514327267d + "'", double4 == 202.70803514327267d);
    }

    @Test
    public void test03484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03484");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(485.9368605967579d, 185.2884933527036d, 3204.7597357909353d, 153.43012976962632d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2750.6812387772547d + "'", double4 == 2750.6812387772547d);
    }

    @Test
    public void test03485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03485");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(153.8493212416082d, 579.9160313510744d, 367.4257229620187d, 677.4071711503727d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 565.4446936464491d + "'", double4 == 565.4446936464491d);
    }

    @Test
    public void test03486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03486");
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
        int int80 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray5, intArray46);
        int[] intArray84 = new int[] { (byte) -1, (short) -1, ' ' };
        int[] intArray88 = new int[] { 1, 1, 100 };
        int[] intArray90 = new int[] { (byte) -1 };
        int int91 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray88, intArray90);
        int int92 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray84, intArray88);
        int int93 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray46, intArray84);
        java.lang.Class<?> wildcardClass94 = intArray84.getClass();
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
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
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
    public void test03487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03487");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(424.99846035718303d, 0.0d, 281.63996109123826d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 143.35849926594477d + "'", double4 == 143.35849926594477d);
    }

    @Test
    public void test03488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03488");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(158.05379963890277d, 360.65217402671465d, 1796.010984487501d, 709.3003293844439d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1986.6053402063276d + "'", double4 == 1986.6053402063276d);
    }

    @Test
    public void test03489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03489");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(275.4187635335095d, 1307.973287223694d, 699.3261970700897d, 1107.4542691037336d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 933.7990119597839d + "'", double4 == 933.7990119597839d);
    }

    @Test
    public void test03490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03490");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(171.5644349530363d, 653.4265966807379d, 762.1889468010093d, 290.44657240654976d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 953.6045361221611d + "'", double4 == 953.6045361221611d);
    }

    @Test
    public void test03491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03491");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1251.9132124366795d, 79.79641068403973d, 735.652387421924d, 1526.4176336891546d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1962.8820480198704d + "'", double4 == 1962.8820480198704d);
    }

    @Test
    public void test03492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03492");
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
        double[] doubleArray71 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray72 = new double[] {};
        double double74 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray71, doubleArray72, 0);
        double double76 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray63, doubleArray72, 1);
        double double78 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray14, doubleArray72, 10);
        // The following exception was thrown during execution in test generation
        try {
            double double80 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray0, doubleArray72, (int) 'a');
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
        org.junit.Assert.assertNotNull(doubleArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray71), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray72), "[]");
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + (-1.0d) + "'", double74 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + (-1.0d) + "'", double76 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + 0.0d + "'", double78 == 0.0d);
    }

    @Test
    public void test03493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03493");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(716.1930244036126d, 235.95949270096705d, 417.120417710081d, 44.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 735.7226964905593d + "'", double4 == 735.7226964905593d);
    }

    @Test
    public void test03494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03494");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1181.7433642758228d, 2105.1786378463567d, 298.5992668050363d, 1535.3460709311994d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1452.9766643859439d + "'", double4 == 1452.9766643859439d);
    }

    @Test
    public void test03495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03495");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(879.8033576502743d, 214.58018289845666d, 601.116670134495d, (double) 72);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 421.2668704142359d + "'", double4 == 421.2668704142359d);
    }

    @Test
    public void test03496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03496");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance((double) (short) 10, 782.0385387527926d, 531.3648924046774d, 626.2527251290963d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 677.1507060283737d + "'", double4 == 677.1507060283737d);
    }

    @Test
    public void test03497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03497");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(253.1840188907098d, 678.5281601343461d, 156.94538945476546d, 587.230440604616d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 347.6332631604373d + "'", double4 == 347.6332631604373d);
    }

    @Test
    public void test03498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03498");
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
        int int68 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray49, intArray66);
        int[] intArray72 = new int[] { 1, 1, 100 };
        int[] intArray74 = new int[] { (byte) -1 };
        int int75 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray72, intArray74);
        int[] intArray78 = new int[] { 'a', 10 };
        int int79 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray74, intArray78);
        int[] intArray83 = new int[] { (byte) 1, (short) 1, (short) -1 };
        int int84 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray74, intArray83);
        int[] intArray88 = new int[] { (byte) -1, '#', (-1) };
        int int89 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray74, intArray88);
        int int90 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray66, intArray74);
        int[] intArray91 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int92 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray74, intArray91);
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
        org.junit.Assert.assertNotNull(intArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray78), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + (-1) + "'", int79 == (-1));
        org.junit.Assert.assertNotNull(intArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray83), "[1, 1, -1]");
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + (-1) + "'", int84 == (-1));
        org.junit.Assert.assertNotNull(intArray88);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray88), "[-1, 35, -1]");
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + (-1) + "'", int89 == (-1));
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 0 + "'", int90 == 0);
    }

    @Test
    public void test03499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03499");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(2318.790842649316d, 78.45227647258133d, 1354.9427883510798d, 547.801229584586d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2016.285515832928d + "'", double4 == 2016.285515832928d);
    }

    @Test
    public void test03500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03500");
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
        java.lang.Class<?> wildcardClass86 = doubleArray50.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass86);
    }
}

