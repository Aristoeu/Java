package DistanceFormula;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest10 {

    public static boolean debug = false;

    @Test
    public void test05001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05001");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1427.5991254551002d, 1304.6718953709399d, 756.3850322363193d, 1073.8771967928965d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 902.0087917968243d + "'", double4 == 902.0087917968243d);
    }

    @Test
    public void test05002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05002");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1671.2103957794097d, 2847.4902779710783d, 756.3850322363193d, (double) 0.0f);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1905.216426746032d + "'", double4 == 1905.216426746032d);
    }

    @Test
    public void test05003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05003");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1030.1790390362178d, 1945.7116823361646d, 286.3414624115187d, 2063.761199868312d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1273.415259681321d + "'", double4 == 1273.415259681321d);
    }

    @Test
    public void test05004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05004");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1702.618724140871d, 728.7328190589028d, (double) 100, 185.51105438526488d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2206.808205666772d + "'", double4 == 2206.808205666772d);
    }

    @Test
    public void test05005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05005");
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
        int int39 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray5, intArray35);
        int[] intArray43 = new int[] { (byte) -1, (short) -1, ' ' };
        int[] intArray47 = new int[] { 1, 1, 100 };
        int[] intArray49 = new int[] { (byte) -1 };
        int int50 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray47, intArray49);
        int int51 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray43, intArray47);
        int int52 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray35, intArray47);
        java.lang.Class<?> wildcardClass53 = intArray35.getClass();
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray43), "[-1, -1, 32]");
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray49), "[-1]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 72 + "'", int51 == 72);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test05006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05006");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(247.87223346343626d, 397.7356276694724d, 0.0d, 438.1374926787372d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 288.27409847270104d + "'", double4 == 288.27409847270104d);
    }

    @Test
    public void test05007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05007");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(272.0850365622572d, 266.03145706509156d, 188.83374178579496d, 230.1492652373609d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 93.2168815106545d + "'", double4 == 93.2168815106545d);
    }

    @Test
    public void test05008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05008");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(380.6284109636399d, 604.4664943211609d, 456.95497716611834d, 733.445064771035d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 360.9783039354424d + "'", double4 == 360.9783039354424d);
    }

    @Test
    public void test05009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05009");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(490.25700073760834d, 1113.295503583767d, 871.2181639675185d, 654.8276246616472d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 839.42904215203d + "'", double4 == 839.42904215203d);
    }

    @Test
    public void test05010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05010");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(753.8274747291275d, 1997.3898007645857d, 1654.4778896802009d, 728.6883712509082d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2169.3518444647507d + "'", double4 == 2169.3518444647507d);
    }

    @Test
    public void test05011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05011");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(351.7317554491893d, 959.0422189047277d, (double) 100L, 1034.8886911307932d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 327.5782276752547d + "'", double4 == 327.5782276752547d);
    }

    @Test
    public void test05012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05012");
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
        int int73 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray5, intArray52);
        int[] intArray77 = new int[] { (byte) -1, (short) -1, ' ' };
        int[] intArray81 = new int[] { 1, 1, 100 };
        int[] intArray83 = new int[] { (byte) -1 };
        int int84 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray81, intArray83);
        int int85 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray77, intArray81);
        int int86 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray5, intArray77);
        int[] intArray87 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int88 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray77, intArray87);
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
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertNotNull(intArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray77), "[-1, -1, 32]");
        org.junit.Assert.assertNotNull(intArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray81), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray83), "[-1]");
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + (-1) + "'", int84 == (-1));
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 72 + "'", int85 == 72);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + (-1) + "'", int86 == (-1));
    }

    @Test
    public void test05013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05013");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(572.2631809460208d, 118.69185263896895d, 245.189347980773d, 1986.6053402063276d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1451.6683628403857d + "'", double4 == 1451.6683628403857d);
    }

    @Test
    public void test05014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05014");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(215.05196722620533d, 633.8945645939809d, 6704.502096016516d, 355.6408158519169d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 6767.7038775323745d + "'", double4 == 6767.7038775323745d);
    }

    @Test
    public void test05015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05015");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(489.50333118166543d, 299.7215374309961d, 0.0d, 546.9941398742101d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 736.7759336248794d + "'", double4 == 736.7759336248794d);
    }

    @Test
    public void test05016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05016");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1318.0677631941949d, 717.9718079630422d, 1140.4786243437534d, 1424.5798640010707d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 207.08145705479154d + "'", double4 == 207.08145705479154d);
    }

    @Test
    public void test05017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05017");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(753.6820615291944d, 106.42401020861638d, (double) 1L, 189.35911983480315d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 835.6171711553811d + "'", double4 == 835.6171711553811d);
    }

    @Test
    public void test05018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05018");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1380.054577119893d, 774.1563488351445d, 807.5323439092334d, 340.1389565506388d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1006.5396254951654d + "'", double4 == 1006.5396254951654d);
    }

    @Test
    public void test05019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05019");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(957.3000311708643d, 779.9841197127514d, 1453.859206152495d, 156.5958899021712d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1119.947404792211d + "'", double4 == 1119.947404792211d);
    }

    @Test
    public void test05020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05020");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1178.5404842944213d, 574.7391556348423d, 821.2629173622472d, 531.3759037767397d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 739.2355876915024d + "'", double4 == 739.2355876915024d);
    }

    @Test
    public void test05021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05021");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(649.5602895547909d, 545.9406267322378d, 1853.2363306232926d, 926.8168419803987d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1235.1952103636393d + "'", double4 == 1235.1952103636393d);
    }

    @Test
    public void test05022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05022");
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
        java.lang.Class<?> wildcardClass95 = intArray88.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass95);
    }

    @Test
    public void test05023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05023");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(725.1616906289017d, 2490.1169945845118d, 670.8183981016402d, 670.8717094183469d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 76.81533377227437d + "'", double4 == 76.81533377227437d);
    }

    @Test
    public void test05024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05024");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(788.5542416635808d, 486.34266847173456d, 312.7770071768419d, 677.489377191766d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 488.5687065050236d + "'", double4 == 488.5687065050236d);
    }

    @Test
    public void test05025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05025");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(567.3105308435377d, 1183.5853866362072d, 1886.8301301214929d, 422.0208222943637d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2081.084163619799d + "'", double4 == 2081.084163619799d);
    }

    @Test
    public void test05026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05026");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(650.8900422812455d, 978.4438663763432d, 321.03012572112056d, 51.29307631295359d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 684.3420826979981d + "'", double4 == 684.3420826979981d);
    }

    @Test
    public void test05027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05027");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(834.828952492293d, 1024.191273074927d, 1329.9464291621257d, 404.68669618344165d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1114.6220535613181d + "'", double4 == 1114.6220535613181d);
    }

    @Test
    public void test05028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05028");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(679.2205484716004d, 230.66542913617204d, 270.6964756353487d, 1318.0677631941949d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1495.9264068942746d + "'", double4 == 1495.9264068942746d);
    }

    @Test
    public void test05029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05029");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(2063.761199868312d, 922.8406127352839d, 223.31249474929078d, 1107.0048737615105d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2024.6129661452476d + "'", double4 == 2024.6129661452476d);
    }

    @Test
    public void test05030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05030");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(285.878214399093d, 137.03519842149686d, 1630.7525168910997d, 1461.456952129271d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2669.2960561997807d + "'", double4 == 2669.2960561997807d);
    }

    @Test
    public void test05031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05031");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(293.3508435673762d, 1429.1280765910471d, 1011.7972527379859d, 855.664136747898d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 912.3384692852027d + "'", double4 == 912.3384692852027d);
    }

    @Test
    public void test05032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05032");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(127.97315542808013d, 124.87818547522426d, 55.70115734375261d, 299.34040563238096d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 246.73421824148423d + "'", double4 == 246.73421824148423d);
    }

    @Test
    public void test05033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05033");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(524.053772715601d, 1424.6589766622005d, 0.0d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 741.1239527871903d + "'", double4 == 741.1239527871903d);
    }

    @Test
    public void test05034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05034");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(934.56337512867d, 776.4995539649813d, 601.116670134495d, 1178.8259895354986d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 413.3411785297121d + "'", double4 == 413.3411785297121d);
    }

    @Test
    public void test05035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05035");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(559.8794281330635d, 2545.5115799512864d, 139.47274222400492d, 483.69245455426403d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2482.225811306081d + "'", double4 == 2482.225811306081d);
    }

    @Test
    public void test05036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05036");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(256.4663026893413d, 244.55187390196627d, 1416.1891754327432d, 933.2787870756218d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1848.4497859170574d + "'", double4 == 1848.4497859170574d);
    }

    @Test
    public void test05037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05037");
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
        int[] intArray42 = new int[] { 1, 1, 100 };
        int[] intArray44 = new int[] { (byte) -1 };
        int int45 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray42, intArray44);
        int[] intArray51 = new int[] { (byte) 10, (byte) 100, ' ', (short) -1, (short) 100 };
        int int52 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray44, intArray51);
        int int53 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray35, intArray51);
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
        int int85 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray51, intArray59);
        int int86 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray12, intArray51);
        java.lang.Class<?> wildcardClass87 = intArray51.getClass();
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
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray51), "[10, 100, 32, -1, 100]");
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
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + (-1) + "'", int86 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass87);
    }

    @Test
    public void test05038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05038");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(2533.5998068209196d, 23.120346888421807d, 402.81114714039353d, 1518.3090981823398d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2360.3125927027045d + "'", double4 == 2360.3125927027045d);
    }

    @Test
    public void test05039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05039");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance((double) 101, 110.73681895204965d, 35.14926523736091d, 606.1975226364846d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 561.311438447074d + "'", double4 == 561.311438447074d);
    }

    @Test
    public void test05040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05040");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(142.38024339966802d, 654.6748980807225d, 372.10153723305945d, 1569.438920038542d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1144.4853157912107d + "'", double4 == 1144.4853157912107d);
    }

    @Test
    public void test05041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05041");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(257.270124540182d, 621.6515574452047d, 1497.810463044747d, 996.1563978294703d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1615.0451788888304d + "'", double4 == 1615.0451788888304d);
    }

    @Test
    public void test05042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05042");
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
        int int64 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray38, intArray60);
        int[] intArray68 = new int[] { 1, 1, 100 };
        int[] intArray70 = new int[] { (byte) -1 };
        int int71 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray68, intArray70);
        int[] intArray74 = new int[] { 'a', 10 };
        int int75 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray70, intArray74);
        int int76 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray38, intArray70);
        int int77 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray6, intArray70);
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
    public void test05043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05043");
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
        double[] doubleArray40 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray41 = new double[] {};
        double double43 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray40, doubleArray41, 0);
        double[] doubleArray48 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray49 = new double[] {};
        double double51 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray48, doubleArray49, 0);
        double double53 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray40, doubleArray49, (int) (short) 100);
        double double55 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray31, doubleArray49, (int) (short) 0);
        double double57 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray13, doubleArray49, (int) ' ');
        double[] doubleArray62 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray63 = new double[] {};
        double double65 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray62, doubleArray63, 0);
        double[] doubleArray71 = new double[] { 232.4213562373095d, (short) 0, 1.0f, 75.85073476263909d, (-1L) };
        double double73 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray63, doubleArray71, (int) (byte) -1);
        double double75 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray49, doubleArray63, (int) (byte) 0);
        double[] doubleArray77 = new double[] { (short) 0 };
        double[] doubleArray82 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray83 = new double[] {};
        double double85 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray82, doubleArray83, 0);
        double[] doubleArray90 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray91 = new double[] {};
        double double93 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray90, doubleArray91, 0);
        double double95 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray82, doubleArray91, (int) (short) 100);
        double double97 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray77, doubleArray82, 1);
        double double99 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray63, doubleArray82, (int) '#');
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
        org.junit.Assert.assertNotNull(doubleArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray71), "[232.4213562373095, 0.0, 1.0, 75.85073476263909, -1.0]");
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + (-1.0d) + "'", double73 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + 0.0d + "'", double75 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray77), "[0.0]");
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
        org.junit.Assert.assertTrue("'" + double99 + "' != '" + (-1.0d) + "'", double99 == (-1.0d));
    }

    @Test
    public void test05044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05044");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(879.8033576502743d, 403.9037707077835d, 0.0d, 510.9207644402136d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 986.8203513827043d + "'", double4 == 986.8203513827043d);
    }

    @Test
    public void test05045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05045");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(727.7419504237471d, 677.489377191766d, 1058.2999707997549d, 810.4677820566644d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 463.53642524090617d + "'", double4 == 463.53642524090617d);
    }

    @Test
    public void test05046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05046");
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
        int[] intArray96 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int97 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray49, intArray96);
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
    }

    @Test
    public void test05047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05047");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1024.0280124554229d, 1207.6930012050066d, 515.2878993762027d, 555.7197088172657d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1160.713405466961d + "'", double4 == 1160.713405466961d);
    }

    @Test
    public void test05048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05048");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(616.3177311214779d, 522.8515244767702d, 1739.4490961337756d, 179.25105674774412d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1466.7318327413238d + "'", double4 == 1466.7318327413238d);
    }

    @Test
    public void test05049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05049");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(852.8844890532351d, 1350.530049863511d, 829.7626614699236d, 1249.6146239116272d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 124.03725353519542d + "'", double4 == 124.03725353519542d);
    }

    @Test
    public void test05050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05050");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1206.1433496654447d, 86.6202979275892d, 103.4376113230772d, 740.6347793668249d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1756.7202197816032d + "'", double4 == 1756.7202197816032d);
    }

    @Test
    public void test05051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05051");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(3089.620601217342d, 102.26030820844352d, 1112.4837742292545d, 1693.2268372437197d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2420.534151111474d + "'", double4 == 2420.534151111474d);
    }

    @Test
    public void test05052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05052");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(364.9074540975034d, 684.1933734973263d, 995.1855896142233d, 253.26612856794847d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 640.0893013294542d + "'", double4 == 640.0893013294542d);
    }

    @Test
    public void test05053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05053");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(2390.273914579784d, 542.2897398174703d, 1471.6675533545094d, 2338.2595531011807d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2714.576174508985d + "'", double4 == 2714.576174508985d);
    }

    @Test
    public void test05054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05054");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(100.00499987500625d, 894.4519066108248d, 978.6260708451896d, 2485.882039894077d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2542.515336520697d + "'", double4 == 2542.515336520697d);
    }

    @Test
    public void test05055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05055");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(0.0d, 395.0094394147251d, 662.8861550421406d, 358.2216930256938d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 699.6739014311718d + "'", double4 == 699.6739014311718d);
    }

    @Test
    public void test05056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05056");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(309.7418279793674d, 535.9469777784859d, 226.33524583965954d, 614.6324374476843d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 316.0932484033621d + "'", double4 == 316.0932484033621d);
    }

    @Test
    public void test05057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05057");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(2748.1343799560727d, 626.2527251290963d, 0.0d, 902.5016217127433d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3024.3832765397196d + "'", double4 == 3024.3832765397196d);
    }

    @Test
    public void test05058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05058");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(256.7515121442339d, 1372.3147425323373d, 818.9571347352227d, 451.7036253361123d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 595.0474674434806d + "'", double4 == 595.0474674434806d);
    }

    @Test
    public void test05059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05059");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(289.5392231128663d, 2487.39376508036d, 346.72635292547017d, 628.7251427991296d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 343.9730453532949d + "'", double4 == 343.9730453532949d);
    }

    @Test
    public void test05060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05060");
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
        double[] doubleArray76 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray77 = new double[] {};
        double double79 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray76, doubleArray77, 0);
        double double81 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray68, doubleArray77, 1);
        double double83 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray61, doubleArray77, (int) (short) 10);
        double double85 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray39, doubleArray77, 0);
        double double87 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray4, doubleArray77, 69);
        java.lang.Class<?> wildcardClass88 = doubleArray4.getClass();
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
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray76), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray77), "[]");
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + (-1.0d) + "'", double79 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + (-1.0d) + "'", double81 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + 0.0d + "'", double83 == 0.0d);
        org.junit.Assert.assertTrue("'" + double85 + "' != '" + 0.0d + "'", double85 == 0.0d);
        org.junit.Assert.assertTrue("'" + double87 + "' != '" + (-1.0d) + "'", double87 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass88);
    }

    @Test
    public void test05061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05061");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(626.2527251290963d, 762.6473385428707d, 997.8364812996736d, 1145.4123950228852d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 754.3488126505918d + "'", double4 == 754.3488126505918d);
    }

    @Test
    public void test05062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05062");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(730.3132551932085d, 920.8731643222312d, 458.1809819987884d, 1244.073074075367d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 595.3321829475559d + "'", double4 == 595.3321829475559d);
    }

    @Test
    public void test05063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05063");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1515.4901335350462d, (double) 100L, 761.0206976815485d, 2326.316486133129d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2980.7859219866264d + "'", double4 == 2980.7859219866264d);
    }

    @Test
    public void test05064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05064");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance((double) '#', 95.78829090400235d, 264.9219637400125d, 1052.4022521239694d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1186.5359249599796d + "'", double4 == 1186.5359249599796d);
    }

    @Test
    public void test05065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05065");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(875.2621104553508d, 813.5250825095069d, 254.16807522747047d, 820.012635783017d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 623.5465540336345d + "'", double4 == 623.5465540336345d);
    }

    @Test
    public void test05066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05066");
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
        int[] intArray81 = new int[] { (byte) -1, (short) -1, ' ' };
        int[] intArray85 = new int[] { 1, 1, 100 };
        int[] intArray87 = new int[] { (byte) -1 };
        int int88 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray85, intArray87);
        int int89 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray81, intArray85);
        int int90 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray75, intArray81);
        // The following exception was thrown during execution in test generation
        try {
            int int91 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray0, intArray81);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray81), "[-1, -1, 32]");
        org.junit.Assert.assertNotNull(intArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray85), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray87);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray87), "[-1]");
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + (-1) + "'", int88 == (-1));
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 72 + "'", int89 == 72);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 157 + "'", int90 == 157);
    }

    @Test
    public void test05067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05067");
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
        int int70 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray3, intArray24);
        int[] intArray74 = new int[] { (byte) -1, (short) -1, ' ' };
        int[] intArray78 = new int[] { 1, 1, 100 };
        int[] intArray80 = new int[] { (byte) -1 };
        int int81 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray78, intArray80);
        int int82 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray74, intArray78);
        int int83 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray3, intArray78);
        java.lang.Class<?> wildcardClass84 = intArray78.getClass();
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray74), "[-1, -1, 32]");
        org.junit.Assert.assertNotNull(intArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray78), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray80), "[-1]");
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + (-1) + "'", int81 == (-1));
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 72 + "'", int82 == 72);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 0 + "'", int83 == 0);
        org.junit.Assert.assertNotNull(wildcardClass84);
    }

    @Test
    public void test05068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05068");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(0.0d, 703.4846871930835d, 484.2206679959923d, 1613.4785133942391d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1394.214494197148d + "'", double4 == 1394.214494197148d);
    }

    @Test
    public void test05069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05069");
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
        java.lang.Class<?> wildcardClass83 = intArray24.getClass();
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
    public void test05070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05070");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(339.56076344170043d, (double) 10L, 758.9251817337416d, 1543.300208463103d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1952.6646267551441d + "'", double4 == 1952.6646267551441d);
    }

    @Test
    public void test05071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05071");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(358.0908487262238d, 1466.4081851909086d, 60.0d, 1802.9490922507239d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1475.2875983939618d + "'", double4 == 1475.2875983939618d);
    }

    @Test
    public void test05072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05072");
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
        double double45 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray32, doubleArray41, (int) (short) 100);
        double[] doubleArray50 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray51 = new double[] {};
        double double53 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray50, doubleArray51, 0);
        double double55 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray32, doubleArray50, (int) (byte) 0);
        double double57 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray13, doubleArray50, (int) '#');
        java.lang.Class<?> wildcardClass58 = doubleArray13.getClass();
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
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + (-1.0d) + "'", double45 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[]");
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + (-1.0d) + "'", double53 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + Double.POSITIVE_INFINITY + "'", double55 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + (-1.0d) + "'", double57 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass58);
    }

    @Test
    public void test05073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05073");
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
        int[] intArray53 = new int[] { 1, 1, 100 };
        int[] intArray55 = new int[] { (byte) -1 };
        int int56 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray53, intArray55);
        int[] intArray59 = new int[] { 'a', 10 };
        int int60 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray55, intArray59);
        int[] intArray64 = new int[] { (byte) 1, (short) 1, (short) -1 };
        int int65 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray55, intArray64);
        int int66 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray48, intArray55);
        int[] intArray70 = new int[] { 1, 1, 100 };
        int[] intArray72 = new int[] { (byte) -1 };
        int int73 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray70, intArray72);
        int int74 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray55, intArray70);
        int int75 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray31, intArray55);
        int[] intArray79 = new int[] { 1, 1, 100 };
        int[] intArray81 = new int[] { (byte) -1 };
        int int82 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray79, intArray81);
        int[] intArray85 = new int[] { 'a', 10 };
        int int86 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray81, intArray85);
        int[] intArray90 = new int[] { (byte) 1, (short) 1, (short) -1 };
        int int91 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray81, intArray90);
        int int92 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray31, intArray81);
        int int93 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray3, intArray81);
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
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray53), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray55), "[-1]");
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray59), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertNotNull(intArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray64), "[1, 1, -1]");
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertNotNull(intArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray70), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray72), "[-1]");
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
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
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + (-1) + "'", int93 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass94);
    }

    @Test
    public void test05074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05074");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1093.2369568734316d, 2136.3412420118843d, 799.9078566364301d, 829.349727072121d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1600.320615176765d + "'", double4 == 1600.320615176765d);
    }

    @Test
    public void test05075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05075");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(895.7811068550288d, 179.42158274528765d, 619.2212485727373d, 2762.5605124068106d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2859.6987879438148d + "'", double4 == 2859.6987879438148d);
    }

    @Test
    public void test05076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05076");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(189.35911983480315d, 1226.1872261806159d, 115.7923937432095d, 1967.1612117222041d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 814.5407116331819d + "'", double4 == 814.5407116331819d);
    }

    @Test
    public void test05077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05077");
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
        double double72 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray7, doubleArray44, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            double double74 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray0, doubleArray44, (int) (byte) 0);
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
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + (-1.0d) + "'", double72 == (-1.0d));
    }

    @Test
    public void test05078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05078");
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
        int[] intArray96 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int97 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray91, intArray96);
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
    }

    @Test
    public void test05079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05079");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(660.4129438667904d, 0.0d, 1285.9566646878206d, 2209.8848487640676d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1670.9781957657663d + "'", double4 == 1670.9781957657663d);
    }

    @Test
    public void test05080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05080");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(149.16705768146082d, 977.168691216433d, 938.5565382174809d, 1694.2935428998514d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1735.0941205895042d + "'", double4 == 1735.0941205895042d);
    }

    @Test
    public void test05081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05081");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(813.5250825095069d, 423.2002675066391d, 983.8351075302581d, 1128.6419161452409d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 875.7516736593531d + "'", double4 == 875.7516736593531d);
    }

    @Test
    public void test05082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05082");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1675.5899469743117d, 503.41416381475506d, 2000.4917381037785d, 2319.802136420398d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 721.505730337643d + "'", double4 == 721.505730337643d);
    }

    @Test
    public void test05083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05083");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(580.7352867136476d, 370.03275914922597d, 299.34040563238096d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 651.4276402304927d + "'", double4 == 651.4276402304927d);
    }

    @Test
    public void test05084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05084");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(399.2696879893736d, 296.0129554346333d, 0.0d, 186.9180422268371d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 452.2272716291992d + "'", double4 == 452.2272716291992d);
    }

    @Test
    public void test05085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05085");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1284.1977576379807d, 819.3234468507314d, 0.0d, 349.5922570089044d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1753.9289474798077d + "'", double4 == 1753.9289474798077d);
    }

    @Test
    public void test05086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05086");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(564.59755583695d, 438.1374926787372d, 501.9676185738713d, 972.7100711067868d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 597.2025156911284d + "'", double4 == 597.2025156911284d);
    }

    @Test
    public void test05087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05087");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(155.2673760828769d, 2199.033873292094d, 784.2049386362926d, 1705.4264381633693d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1122.5449976821405d + "'", double4 == 1122.5449976821405d);
    }

    @Test
    public void test05088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05088");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(136.72219249863593d, 1264.0538059811463d, 309.189347980773d, 1104.1766048460413d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 982.7069551451049d + "'", double4 == 982.7069551451049d);
    }

    @Test
    public void test05089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05089");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance((double) (byte) 1, 2478.1582123423486d, 264.0d, 298.84861683750034d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2442.3095955048484d + "'", double4 == 2442.3095955048484d);
    }

    @Test
    public void test05090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05090");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(139.7258162177311d, 1228.099823167303d, 941.2198455681425d, 1638.0019709217686d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1699.1833670440267d + "'", double4 == 1699.1833670440267d);
    }

    @Test
    public void test05091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05091");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1082.4838795872572d, 1002.6348330943177d, 906.6040994538412d, 266.09479742842706d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 912.4198157993067d + "'", double4 == 912.4198157993067d);
    }

    @Test
    public void test05092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05092");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1335.8608317074572d, 474.546078308824d, 314.2078389288376d, 1023.8519448484045d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1068.2342360795853d + "'", double4 == 1068.2342360795853d);
    }

    @Test
    public void test05093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05093");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(457.84601365209437d, 1706.2933415817956d, 2568.589806105013d, 79.45141512783117d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3737.585718906883d + "'", double4 == 3737.585718906883d);
    }

    @Test
    public void test05094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05094");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(723.3533131255944d, 2472.0549922004434d, 2318.790842649316d, 1395.0198787635404d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1731.0565808224262d + "'", double4 == 1731.0565808224262d);
    }

    @Test
    public void test05095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05095");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(110.22998117257458d, 453.9015312110428d, 1061.5948938608483d, 625.7199020892954d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1082.04669754179d + "'", double4 == 1082.04669754179d);
    }

    @Test
    public void test05096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05096");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(282.2613666245667d, 621.366655462836d, 74.91343462409199d, 747.071354124768d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 333.0526306624067d + "'", double4 == 333.0526306624067d);
    }

    @Test
    public void test05097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05097");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(189.21443951110848d, 526.3691245954593d, 137.42302032977943d, 1333.1036007329699d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 858.5258953188396d + "'", double4 == 858.5258953188396d);
    }

    @Test
    public void test05098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05098");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(592.7652390487657d, 2948.6523924190974d, 815.1910886538078d, 132.92680248554626d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 510.80783697338745d + "'", double4 == 510.80783697338745d);
    }

    @Test
    public void test05099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05099");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance((double) (short) 0, 0.0d, 514.9194063045376d, 313.81045375356257d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 603.0082883958016d + "'", double4 == 603.0082883958016d);
    }

    @Test
    public void test05100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05100");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1985.300842144798d, 1786.0894626301626d, 955.6685137935176d, 1428.1155278730532d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1387.6062631083898d + "'", double4 == 1387.6062631083898d);
    }

    @Test
    public void test05101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05101");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(788.6350227520129d, 284.03695697436626d, 506.7897703571102d, (double) (-1.0f));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 838.4272272857784d + "'", double4 == 838.4272272857784d);
    }

    @Test
    public void test05102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05102");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1323.0790153317653d, 33.05800855762949d, 1624.2639273004588d, 920.0062552712888d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 503.1699525014984d + "'", double4 == 503.1699525014984d);
    }

    @Test
    public void test05103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05103");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(772.7028647813357d, 837.6288297522865d, 850.8971937272034d, 1315.6598360158976d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 548.5586802626528d + "'", double4 == 548.5586802626528d);
    }

    @Test
    public void test05104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05104");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(800.3647138088593d, 569.6093702673131d, 898.197566204712d, 547.3929705623618d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 120.04925210080398d + "'", double4 == 120.04925210080398d);
    }

    @Test
    public void test05105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05105");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(511.3067487107217d, 555.8500408038165d, 803.8248080837866d, 451.7036253361123d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 396.66447484076906d + "'", double4 == 396.66447484076906d);
    }

    @Test
    public void test05106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05106");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(235.11229898487548d, 883.2477228774341d, 696.3812201968626d, 968.7828923815307d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 866.626538533797d + "'", double4 == 866.626538533797d);
    }

    @Test
    public void test05107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05107");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(852.4982074660716d, 1118.0418394490325d, 1283.9922191100031d, 1226.1872261806159d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 570.8157012490218d + "'", double4 == 570.8157012490218d);
    }

    @Test
    public void test05108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05108");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1695.475884420738d, 1988.3507842223764d, 654.7044766211181d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3029.1221920219964d + "'", double4 == 3029.1221920219964d);
    }

    @Test
    public void test05109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05109");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(2862.266741294654d, 4071.2522367299543d, 2293.140381095677d, 4071.2522367299543d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 569.1263601989767d + "'", double4 == 569.1263601989767d);
    }

    @Test
    public void test05110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05110");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(248.10393736653214d, 350.3128472749923d, 1126.875362660789d, 308.7413345116753d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 880.8610059744032d + "'", double4 == 880.8610059744032d);
    }

    @Test
    public void test05111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05111");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(0.0d, 372.10153723305945d, 601.1556235944573d, 360.74512521998355d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 701.0885316058325d + "'", double4 == 701.0885316058325d);
    }

    @Test
    public void test05112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05112");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1264.0538059811463d, 364.18898095086786d, 2594.869788752475d, 592.6254712012968d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1490.599607119517d + "'", double4 == 1490.599607119517d);
    }

    @Test
    public void test05113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05113");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(651.5649556301087d, 2417.183122039889d, 1047.2170983367917d, 992.4778093750206d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1820.3574553715514d + "'", double4 == 1820.3574553715514d);
    }

    @Test
    public void test05114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05114");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1877.911654526508d, 394.7553821156331d, 1961.7024234416954d, 1184.4835318374214d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 698.4722287188728d + "'", double4 == 698.4722287188728d);
    }

    @Test
    public void test05115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05115");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(559.633088122564d, 2281.7907658446843d, 214.19929113781262d, 933.2272834879382d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 508.81934997600456d + "'", double4 == 508.81934997600456d);
    }

    @Test
    public void test05116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05116");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(732.3221801637014d, 1182.3781401203964d, 1157.7967383455236d, 2044.0969965035576d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1379.0510391002504d + "'", double4 == 1379.0510391002504d);
    }

    @Test
    public void test05117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05117");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1107.0048737615105d, 777.6320980383734d, 183.78023309928d, 1442.0251302194235d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1587.6176728432806d + "'", double4 == 1587.6176728432806d);
    }

    @Test
    public void test05118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05118");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(542.5212579020265d, 1072.0730344712604d, 2172.5168628156075d, 1744.8597388439184d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2025.4637727669303d + "'", double4 == 2025.4637727669303d);
    }

    @Test
    public void test05119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05119");
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
        int[] intArray53 = new int[] { (byte) -1, (short) -1, ' ' };
        int[] intArray57 = new int[] { 1, 1, 100 };
        int[] intArray59 = new int[] { (byte) -1 };
        int int60 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray57, intArray59);
        int int61 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray53, intArray57);
        int int62 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray24, intArray53);
        int int63 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray16, intArray24);
        int[] intArray67 = new int[] { 1, 1, 100 };
        int[] intArray69 = new int[] { (byte) -1 };
        int int70 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray67, intArray69);
        int int71 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray24, intArray69);
        java.lang.Class<?> wildcardClass72 = intArray69.getClass();
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray53), "[-1, -1, 32]");
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray57), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray59), "[-1]");
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 72 + "'", int61 == 72);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray67), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray69), "[-1]");
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertNotNull(wildcardClass72);
    }

    @Test
    public void test05120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05120");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(409.09203605141266d, 0.0d, 290.52223969209126d, 1813.720231278971d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1932.2900276382923d + "'", double4 == 1932.2900276382923d);
    }

    @Test
    public void test05121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05121");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1041.8534250956536d, 406.7993706330388d, 870.8475146266298d, 933.2018566740669d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 202.60351609932763d + "'", double4 == 202.60351609932763d);
    }

    @Test
    public void test05122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05122");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(821.2629173622472d, 663.5080816364044d, 142.38024339966802d, 1173.0068643841632d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1188.3814567103382d + "'", double4 == 1188.3814567103382d);
    }

    @Test
    public void test05123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05123");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(2256.576446777686d, 365.6064430735291d, 572.5208527956435d, 1512.8744646387922d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1840.9605867208377d + "'", double4 == 1840.9605867208377d);
    }

    @Test
    public void test05124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05124");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(617.4713644682606d, 362.7416955949157d, 499.025369914194d, 2944.4139862915267d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2700.1182852506777d + "'", double4 == 2700.1182852506777d);
    }

    @Test
    public void test05125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05125");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1230.3377826328476d, 819.7694166303316d, 806.6492081870565d, 384.1743828869851d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 859.2836081891377d + "'", double4 == 859.2836081891377d);
    }

    @Test
    public void test05126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05126");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(889.1857289890074d, 460.2476947640703d, 0.0d, 1097.6374505374613d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 913.2926041823763d + "'", double4 == 913.2926041823763d);
    }

    @Test
    public void test05127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05127");
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
        double[] doubleArray78 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double80 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray31, doubleArray78, (int) (byte) 10);
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
    }

    @Test
    public void test05128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05128");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1605.6695960650438d, 976.5614518064042d, 437.0990768515098d, 1078.2317336065362d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1270.240801013666d + "'", double4 == 1270.240801013666d);
    }

    @Test
    public void test05129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05129");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(2416.605715429033d, 44.0d, 0.0d, 542.5212579020265d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2915.126973331059d + "'", double4 == 2915.126973331059d);
    }

    @Test
    public void test05130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05130");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1154.3996351784397d, 445.5565709724445d, 1395.7652132288606d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 686.9221490228654d + "'", double4 == 686.9221490228654d);
    }

    @Test
    public void test05131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05131");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(262.77880662875646d, 178.44662506919906d, 2725.0650009252895d, 1466.7318327413238d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2740.8677807783633d + "'", double4 == 2740.8677807783633d);
    }

    @Test
    public void test05132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05132");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(167.58795437292852d, 782.0385387527926d, 376.8601759872545d, 1214.6262304674062d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1067.7471678006414d + "'", double4 == 1067.7471678006414d);
    }

    @Test
    public void test05133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05133");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(695.6267983030457d, 619.9703522906217d, 1362.443454095583d, 1193.3279044235942d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 832.0762245587605d + "'", double4 == 832.0762245587605d);
    }

    @Test
    public void test05134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05134");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1833.9529834977884d, 406.4772975581574d, 281.1492652373609d, 595.3321829475559d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1741.658603649826d + "'", double4 == 1741.658603649826d);
    }

    @Test
    public void test05135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05135");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(149.16705768146082d, 1130.1135156267658d, 1790.041294576208d, 725.9135564058657d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2045.0741961156473d + "'", double4 == 2045.0741961156473d);
    }

    @Test
    public void test05136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05136");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(537.326347961464d, 916.7412550310105d, 316.8537583598936d, 684.3898597150222d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 452.8239849175586d + "'", double4 == 452.8239849175586d);
    }

    @Test
    public void test05137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05137");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1510.1966252429165d, 0.0d, 136.72219249863593d, (double) 0.0f);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2041.353929209072d + "'", double4 == 2041.353929209072d);
    }

    @Test
    public void test05138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05138");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1898.2295560361429d, 1960.0953606224607d, 425.71130297188733d, 836.3511286601912d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2596.262485026525d + "'", double4 == 2596.262485026525d);
    }

    @Test
    public void test05139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05139");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1432.253175854684d, 1541.756045800729d, 446.7421770525469d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1738.557185860107d + "'", double4 == 1738.557185860107d);
    }

    @Test
    public void test05140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05140");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(282.68787864005503d, 358.52502912737987d, 1476.0291403541248d, 913.8595240793304d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1349.9781527550178d + "'", double4 == 1349.9781527550178d);
    }

    @Test
    public void test05141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05141");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(441.86431325028315d, 2545.5115799512864d, 1503.3483846639272d, 656.2457151754967d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2950.749936189434d + "'", double4 == 2950.749936189434d);
    }

    @Test
    public void test05142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05142");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1531.040785084739d, 269.5711589322303d, 1357.1551954057154d, 2694.5778500277124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1176.4585414684748d + "'", double4 == 1176.4585414684748d);
    }

    @Test
    public void test05143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05143");
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
        java.lang.Class<?> wildcardClass57 = intArray5.getClass();
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
    public void test05144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05144");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1188.3814567103382d, 2219.3195842665796d, 1266.7699483079518d, 1483.1604443921456d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 814.5476314720477d + "'", double4 == 814.5476314720477d);
    }

    @Test
    public void test05145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05145");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1134.6616725844588d, 1739.9040086647174d, 1519.086803321473d, 821.2629173622472d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 495.98534344978606d + "'", double4 == 495.98534344978606d);
    }

    @Test
    public void test05146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05146");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1269.190001179692d, 483.08021801149255d, 918.1433699290993d, 291.4933092840025d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 542.6335399780827d + "'", double4 == 542.6335399780827d);
    }

    @Test
    public void test05147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05147");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1406.6854418957596d, 982.2432624389727d, 4589.879710412303d, 182.05164476463364d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3410.638310960629d + "'", double4 == 3410.638310960629d);
    }

    @Test
    public void test05148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05148");
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
        double[] doubleArray58 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double60 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray4, doubleArray58, 137);
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
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 0.0d + "'", double57 == 0.0d);
    }

    @Test
    public void test05149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05149");
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
        double double72 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray49, doubleArray67, (int) (byte) 0);
        double double74 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray42, doubleArray67, (int) (short) 100);
        double double76 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray23, doubleArray42, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            double double78 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray0, doubleArray42, 186);
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
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + Double.POSITIVE_INFINITY + "'", double72 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + (-1.0d) + "'", double74 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + (-1.0d) + "'", double76 == (-1.0d));
    }

    @Test
    public void test05150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05150");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(719.3190312227757d, 629.5888270616556d, 0.0d, 639.0465483790342d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 723.7841806651837d + "'", double4 == 723.7841806651837d);
    }

    @Test
    public void test05151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05151");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(132.64218988096647d, 226.33524583965954d, 858.5729770312488d, 431.05208884769894d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 784.8719484947618d + "'", double4 == 784.8719484947618d);
    }

    @Test
    public void test05152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05152");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1254.328055159974d, 0.0d, 652.042545403267d, 567.8266350960342d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 913.2535436628222d + "'", double4 == 913.2535436628222d);
    }

    @Test
    public void test05153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05153");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(77.31557716268777d, 982.9863826916253d, 1117.4402236439857d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2023.1110291729233d + "'", double4 == 2023.1110291729233d);
    }

    @Test
    public void test05154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05154");
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
        int[] intArray47 = new int[] { 1, 1, 100 };
        int[] intArray49 = new int[] { (byte) -1 };
        int int50 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray47, intArray49);
        int[] intArray54 = new int[] { 1, 1, 100 };
        int[] intArray56 = new int[] { (byte) -1 };
        int int57 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray54, intArray56);
        int[] intArray60 = new int[] { 'a', 10 };
        int int61 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray56, intArray60);
        int int62 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray47, intArray60);
        int int63 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray38, intArray47);
        int int64 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray28, intArray38);
        int[] intArray68 = new int[] { 1, 1, 100 };
        int[] intArray70 = new int[] { (byte) -1 };
        int int71 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray68, intArray70);
        int[] intArray74 = new int[] { 'a', 10 };
        int int75 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray70, intArray74);
        int[] intArray79 = new int[] { 1, 1, 100 };
        int[] intArray81 = new int[] { (byte) -1 };
        int int82 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray79, intArray81);
        int[] intArray86 = new int[] { 1, 1, 100 };
        int[] intArray88 = new int[] { (byte) -1 };
        int int89 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray86, intArray88);
        int[] intArray92 = new int[] { 'a', 10 };
        int int93 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray88, intArray92);
        int int94 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray79, intArray92);
        int int95 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray70, intArray79);
        int int96 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray28, intArray70);
        // The following exception was thrown during execution in test generation
        try {
            int int97 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray0, intArray70);
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
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + (-1) + "'", int96 == (-1));
    }

    @Test
    public void test05155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05155");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(2019.5528538380092d, 0.0d, 328.77297056953023d, 691.9161973683077d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2382.6960806367865d + "'", double4 == 2382.6960806367865d);
    }

    @Test
    public void test05156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05156");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(300.59725112716797d, 508.15729725356135d, 1015.4946738808226d, 426.8068410495756d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 725.9526056487433d + "'", double4 == 725.9526056487433d);
    }

    @Test
    public void test05157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05157");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(2748.1343799560727d, 435.1888977827808d, 1001.8257413707506d, 1615.0451788888304d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2926.164919691372d + "'", double4 == 2926.164919691372d);
    }

    @Test
    public void test05158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05158");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(282.3561003496619d, 538.6545590148442d, 695.6267983030457d, 980.2263420235763d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 854.8424809621159d + "'", double4 == 854.8424809621159d);
    }

    @Test
    public void test05159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05159");
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
        double[] doubleArray28 = new double[] { (byte) 0, 132.0d };
        double double30 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray21, doubleArray28, (int) '4');
        double[] doubleArray35 = new double[] { 149.99500012499374d, Double.POSITIVE_INFINITY, 10, (byte) 100 };
        double double37 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray28, doubleArray35, (int) (byte) 0);
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
        double double75 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray42, doubleArray61, (int) (short) -1);
        double[] doubleArray80 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray81 = new double[] {};
        double double83 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray80, doubleArray81, 0);
        double double85 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray42, doubleArray81, (int) (byte) -1);
        double double87 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray28, doubleArray81, 26);
        double double89 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray5, doubleArray81, 111);
        java.lang.Class<?> wildcardClass90 = doubleArray5.getClass();
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
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[0.0, 132.0]");
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + (-1.0d) + "'", double30 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[149.99500012499374, Infinity, 10.0, 100.0]");
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
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + (-1.0d) + "'", double75 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray80), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray81), "[]");
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + (-1.0d) + "'", double83 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double85 + "' != '" + (-1.0d) + "'", double85 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double87 + "' != '" + (-1.0d) + "'", double87 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double89 + "' != '" + 0.0d + "'", double89 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass90);
    }

    @Test
    public void test05160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05160");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(296.3262775730056d, 1637.774628414361d, 1140.4786243437534d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 894.6521376148579d + "'", double4 == 894.6521376148579d);
    }

    @Test
    public void test05161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05161");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1622.949527142839d, 660.2954593813611d, 0.0d, 768.8357377606628d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1833.9780622640897d + "'", double4 == 1833.9780622640897d);
    }

    @Test
    public void test05162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05162");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(483.08021801149255d, 890.3368242933766d, 1333.7387222168438d, 646.3510287776788d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1094.644299721049d + "'", double4 == 1094.644299721049d);
    }

    @Test
    public void test05163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05163");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1023.6165576006824d, 287.6746725832743d, 2859.6987879438148d, 441.939625534273d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1990.347183294131d + "'", double4 == 1990.347183294131d);
    }

    @Test
    public void test05164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05164");
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
        int[] intArray64 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int65 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray51, intArray64);
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
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray58), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray60), "[-1]");
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 101 + "'", int63 == 101);
    }

    @Test
    public void test05165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05165");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(842.0424252196623d, 1519.086803321473d, 1028.732704283299d, 212.0862081751727d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1493.6908742099372d + "'", double4 == 1493.6908742099372d);
    }

    @Test
    public void test05166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05166");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(394.14097853281095d, 1154.8849529284475d, 704.768747047279d, 619.4286060321574d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 383.7240228035798d + "'", double4 == 383.7240228035798d);
    }

    @Test
    public void test05167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05167");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(92.25294381252866d, 0.0d, 511.47172651563227d, 920.8731643222312d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1340.0919470253348d + "'", double4 == 1340.0919470253348d);
    }

    @Test
    public void test05168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05168");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1054.9024297095775d, 677.489377191766d, 618.1977688049909d, 485.9368605967579d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 717.2396947267104d + "'", double4 == 717.2396947267104d);
    }

    @Test
    public void test05169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05169");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(560.0246542664447d, 729.8843065942162d, 1046.951343949116d, 299.80915355137904d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 917.0018427255086d + "'", double4 == 917.0018427255086d);
    }

    @Test
    public void test05170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05170");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1871.1193032415176d, 677.489377191766d, 74.57137520438836d, 2396.815309220075d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1871.881606415403d + "'", double4 == 1871.881606415403d);
    }

    @Test
    public void test05171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05171");
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
        double double55 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray42, doubleArray51, 1);
        double[] doubleArray60 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray61 = new double[] {};
        double double63 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray60, doubleArray61, 0);
        double[] doubleArray68 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray69 = new double[] {};
        double double71 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray68, doubleArray69, 0);
        double double73 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray61, doubleArray69, (int) (byte) 1);
        double[] doubleArray78 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray79 = new double[] {};
        double double81 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray78, doubleArray79, 0);
        double[] doubleArray86 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray87 = new double[] {};
        double double89 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray86, doubleArray87, 0);
        double double91 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray79, doubleArray87, (int) (byte) 1);
        double double93 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray61, doubleArray79, (int) (short) 0);
        double double95 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray51, doubleArray79, 0);
        double double97 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray35, doubleArray51, (int) (byte) 10);
        double double99 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray6, doubleArray51, 137);
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
        org.junit.Assert.assertTrue("'" + double97 + "' != '" + (-1.0d) + "'", double97 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double99 + "' != '" + (-1.0d) + "'", double99 == (-1.0d));
    }

    @Test
    public void test05172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05172");
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
        double[] doubleArray76 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double78 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray51, doubleArray76, 101);
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
    }

    @Test
    public void test05173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05173");
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
        java.lang.Class<?> wildcardClass81 = intArray5.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass81);
    }

    @Test
    public void test05174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05174");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1394.2206254847506d, 920.8731643222312d, 355.3529979411958d, 2548.18217586309d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1552.69868529266d + "'", double4 == 1552.69868529266d);
    }

    @Test
    public void test05175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05175");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(3007.5267939633395d, 1096.729625177833d, 1475.2875983939618d, 537.6734054899458d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2906.53276482351d + "'", double4 == 2906.53276482351d);
    }

    @Test
    public void test05176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05176");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(259.31005301878207d, 825.8447855853702d, 2594.4723220201163d, 348.4574041312402d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2812.549650455464d + "'", double4 == 2812.549650455464d);
    }

    @Test
    public void test05177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05177");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(928.4610636634484d, 955.1724452631145d, 301.85507241890923d, 943.4805752349077d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 638.2978612727459d + "'", double4 == 638.2978612727459d);
    }

    @Test
    public void test05178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05178");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(109.09844337062745d, 224.75210127375607d, 1800.4482544565583d, 588.6435352502476d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2055.2412450624224d + "'", double4 == 2055.2412450624224d);
    }

    @Test
    public void test05179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05179");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1820.3574553715514d, 598.6274887972286d, 586.9333963249293d, 1692.106964457491d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1240.073827582351d + "'", double4 == 1240.073827582351d);
    }

    @Test
    public void test05180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05180");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(587.9528783836956d, 711.9357567659989d, 1334.9097432104763d, 1430.75510359426d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1465.7762116550416d + "'", double4 == 1465.7762116550416d);
    }

    @Test
    public void test05181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05181");
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
        int int57 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray19, intArray51);
        int[] intArray61 = new int[] { 1, 1, 100 };
        int[] intArray63 = new int[] { (byte) -1 };
        int int64 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray61, intArray63);
        int[] intArray68 = new int[] { 1, 1, 100 };
        int[] intArray70 = new int[] { (byte) -1 };
        int int71 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray68, intArray70);
        int[] intArray74 = new int[] { 'a', 10 };
        int int75 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray70, intArray74);
        int int76 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray61, intArray74);
        int int77 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray51, intArray74);
        int[] intArray81 = new int[] { (byte) -1, (short) -1, ' ' };
        int[] intArray85 = new int[] { 1, 1, 100 };
        int[] intArray87 = new int[] { (byte) -1 };
        int int88 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray85, intArray87);
        int int89 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray81, intArray85);
        int int90 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray74, intArray81);
        int int91 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray12, intArray81);
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
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
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
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-1) + "'", int76 == (-1));
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + (-1) + "'", int77 == (-1));
        org.junit.Assert.assertNotNull(intArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray81), "[-1, -1, 32]");
        org.junit.Assert.assertNotNull(intArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray85), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray87);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray87), "[-1]");
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + (-1) + "'", int88 == (-1));
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 72 + "'", int89 == 72);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + (-1) + "'", int90 == (-1));
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + (-1) + "'", int91 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass92);
    }

    @Test
    public void test05182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05182");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1095.8320681897226d, 446.615323216948d, 423.6966685158553d, 1429.1280765910471d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1654.6481530479664d + "'", double4 == 1654.6481530479664d);
    }

    @Test
    public void test05183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05183");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(969.5274756057248d, 1097.6374505374613d, (double) (short) 100, 934.56337512867d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 870.230152979908d + "'", double4 == 870.230152979908d);
    }

    @Test
    public void test05184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05184");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(531.3759037767397d, 156.5958899021712d, 1359.4805380860778d, 283.8242735805477d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 864.3142339319622d + "'", double4 == 864.3142339319622d);
    }

    @Test
    public void test05185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05185");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1156.9233522299178d, 390.92874204283123d, 662.47774618419d, 502.68387230973843d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 820.0644818696599d + "'", double4 == 820.0644818696599d);
    }

    @Test
    public void test05186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05186");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(870.8475146266298d, 764.0617385356554d, 2447.7290027244976d, 483.4450761861905d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1857.4981504473326d + "'", double4 == 1857.4981504473326d);
    }

    @Test
    public void test05187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05187");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(185.51105438526488d, 2239.776227712452d, 5328.628649866165d, 719.3190312227757d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 5170.74555137657d + "'", double4 == 5170.74555137657d);
    }

    @Test
    public void test05188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05188");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(0.0d, 358.0908487262238d, 324.8116635053653d, 1905.216426746032d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1871.9372415251735d + "'", double4 == 1871.9372415251735d);
    }

    @Test
    public void test05189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05189");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(0.0d, 220.63410047820838d, 1128.6419161452409d, 459.0053851712383d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1218.4081904256052d + "'", double4 == 1218.4081904256052d);
    }

    @Test
    public void test05190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05190");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1384.0431932814745d, 1054.9024297095775d, 347.4014495905789d, 1111.061838552791d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1092.801152534109d + "'", double4 == 1092.801152534109d);
    }

    @Test
    public void test05191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05191");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(983.8351075302581d, 400.1135088373235d, 324.87536071545964d, 1368.8313388748368d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1627.6775768523119d + "'", double4 == 1627.6775768523119d);
    }

    @Test
    public void test05192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05192");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(143.38926349619703d, 221.38186019448963d, 659.9563710239427d, 235.09139141013205d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 524.6435521795014d + "'", double4 == 524.6435521795014d);
    }

    @Test
    public void test05193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05193");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(99.40824915468535d, 466.4346434120471d, 371.718640201512d, 403.4830412703007d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 335.26199318857306d + "'", double4 == 335.26199318857306d);
    }

    @Test
    public void test05194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05194");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(344.4597570301277d, 1089.9135821642358d, 1488.063822424116d, 124.03725353519542d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1164.6528832371605d + "'", double4 == 1164.6528832371605d);
    }

    @Test
    public void test05195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05195");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1466.4081851909086d, 182.24761454025776d, 1319.885752410512d, 1226.838413794197d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1191.113232034336d + "'", double4 == 1191.113232034336d);
    }

    @Test
    public void test05196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05196");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(2055.2412450624224d, 0.0d, 119.99500012499374d, 350.3128472749923d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2579.1391723066113d + "'", double4 == 2579.1391723066113d);
    }

    @Test
    public void test05197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05197");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(318.6063079589574d, 874.2773969027894d, 526.8899138504671d, 444.23554773240085d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 638.3254550618983d + "'", double4 == 638.3254550618983d);
    }

    @Test
    public void test05198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05198");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(920.8731643222312d, (double) (-1L), 1905.2979125530956d, 897.1389304235197d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1882.5636786543841d + "'", double4 == 1882.5636786543841d);
    }

    @Test
    public void test05199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05199");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(791.3427433400091d, 737.0371885316508d, 597.3891584399416d, 295.765818736328d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 635.2249546953902d + "'", double4 == 635.2249546953902d);
    }

    @Test
    public void test05200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05200");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(877.6746020583363d, 802.6421558686652d, 683.5143085001474d, 326.302383055439d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 670.5000663714151d + "'", double4 == 670.5000663714151d);
    }

    @Test
    public void test05201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05201");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1363.3425895331873d, 1039.407111645567d, 1835.8291604794165d, 400.0505770257366d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1072.9282646501492d + "'", double4 == 1072.9282646501492d);
    }

    @Test
    public void test05202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05202");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(5802.21738524984d, 333.20287108712284d, 598.9288607212837d, 235.15038127728056d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 5301.341014338398d + "'", double4 == 5301.341014338398d);
    }

    @Test
    public void test05203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05203");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1377.2094996345068d, 349.68492527213414d, 2750.6812387772547d, 822.0386766421623d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1481.4314904597518d + "'", double4 == 1481.4314904597518d);
    }

    @Test
    public void test05204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05204");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(2036.3891841829804d, 352.4089809365134d, 891.6463409819078d, 629.5444608483646d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1421.878323112924d + "'", double4 == 1421.878323112924d);
    }

    @Test
    public void test05205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05205");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(2362.5995916725246d, 506.7897703571102d, 127.94545891018737d, 439.22202415293077d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2948.3996269687364d + "'", double4 == 2948.3996269687364d);
    }

    @Test
    public void test05206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05206");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(413.7815112729882d, 364.402991106878d, 915.6229266699065d, 782.3144896032597d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 622.6245757473461d + "'", double4 == 622.6245757473461d);
    }

    @Test
    public void test05207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05207");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(97.09065754677769d, 0.0d, 452.39034597224276d, 725.0886617759102d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1080.3883502013753d + "'", double4 == 1080.3883502013753d);
    }

    @Test
    public void test05208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05208");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(230.61154201185937d, 282.4412369416548d, 1336.8198473250243d, 1376.0543125051038d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2199.821380876614d + "'", double4 == 2199.821380876614d);
    }

    @Test
    public void test05209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05209");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(270.44266936177814d, 2180.949647525944d, 1531.7458028141925d, 923.9920406414428d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1420.567624281549d + "'", double4 == 1420.567624281549d);
    }

    @Test
    public void test05210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05210");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(819.7694166303316d, 0.0d, 911.4620494470176d, 102.26030820844352d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 193.95294102512952d + "'", double4 == 193.95294102512952d);
    }

    @Test
    public void test05211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05211");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(179.42158274528765d, 88.74256390867768d, 516.1648405307342d, 1040.2062944463478d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 924.308574861357d + "'", double4 == 924.308574861357d);
    }

    @Test
    public void test05212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05212");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(196.0303817985771d, 1030.529719285076d, 2416.9549836999017d, 5802.21738524984d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 6992.612267866089d + "'", double4 == 6992.612267866089d);
    }

    @Test
    public void test05213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05213");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(482.65745650742093d, 423.2002675066391d, 88.87071783022412d, 3784.801788155893d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3325.541336774534d + "'", double4 == 3325.541336774534d);
    }

    @Test
    public void test05214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05214");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(2322.68957635252d, 777.6320980383734d, 687.4990900244022d, 476.2375705711027d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2466.4210784519755d + "'", double4 == 2466.4210784519755d);
    }

    @Test
    public void test05215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05215");
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
        int int84 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray67, intArray82);
        java.lang.Class<?> wildcardClass85 = intArray82.getClass();
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
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + (-1) + "'", int84 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass85);
    }

    @Test
    public void test05216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05216");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(995.4710105785174d, 1421.878323112924d, 545.5832766828634d, 863.5160259266543d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1008.2500310819237d + "'", double4 == 1008.2500310819237d);
    }

    @Test
    public void test05217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05217");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(424.55910681763555d, 766.9683109428049d, 2576.4318188109983d, 304.31952429129194d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2614.521498644876d + "'", double4 == 2614.521498644876d);
    }

    @Test
    public void test05218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05218");
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
        int[] intArray52 = new int[] { (byte) 1, (short) 1, (short) -1 };
        int int53 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray43, intArray52);
        int int54 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray36, intArray43);
        int[] intArray58 = new int[] { 1, 1, 100 };
        int[] intArray60 = new int[] { (byte) -1 };
        int int61 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray58, intArray60);
        int int62 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray36, intArray58);
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
        int int93 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray68, intArray77);
        int int94 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray58, intArray68);
        int int95 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray14, intArray58);
        java.lang.Class<?> wildcardClass96 = intArray58.getClass();
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
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + 0 + "'", int95 == 0);
        org.junit.Assert.assertNotNull(wildcardClass96);
    }

    @Test
    public void test05219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05219");
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
        double[] doubleArray50 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray51 = new double[] {};
        double double53 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray50, doubleArray51, 0);
        double[] doubleArray58 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray59 = new double[] {};
        double double61 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray58, doubleArray59, 0);
        double double63 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray50, doubleArray59, 1);
        double double65 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray39, doubleArray50, (int) '#');
        double[] doubleArray70 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray71 = new double[] {};
        double double73 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray70, doubleArray71, 0);
        double double75 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray39, doubleArray71, 1);
        double[] doubleArray80 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray81 = new double[] {};
        double double83 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray80, doubleArray81, 0);
        double[] doubleArray88 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray89 = new double[] {};
        double double91 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray88, doubleArray89, 0);
        double double93 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray80, doubleArray89, 1);
        double double95 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray39, doubleArray89, 215);
        double double97 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray5, doubleArray89, 137);
        java.lang.Class<?> wildcardClass98 = doubleArray89.getClass();
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
        org.junit.Assert.assertTrue("'" + double97 + "' != '" + 0.0d + "'", double97 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass98);
    }

    @Test
    public void test05220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05220");
        int[] intArray3 = new int[] { 1, 1, 100 };
        int[] intArray5 = new int[] { (byte) -1 };
        int int6 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray3, intArray5);
        int[] intArray9 = new int[] { 'a', 10 };
        int int10 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray5, intArray9);
        int[] intArray14 = new int[] { (byte) 1, (short) 1, (short) -1 };
        int int15 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray5, intArray14);
        int[] intArray19 = new int[] { (byte) -1, '#', (-1) };
        int int20 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray5, intArray19);
        int[] intArray24 = new int[] { 1, 1, 100 };
        int[] intArray26 = new int[] { (byte) -1 };
        int int27 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray24, intArray26);
        int[] intArray31 = new int[] { 1, 1, 100 };
        int[] intArray33 = new int[] { (byte) -1 };
        int int34 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray31, intArray33);
        int[] intArray37 = new int[] { 'a', 10 };
        int int38 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray33, intArray37);
        int[] intArray42 = new int[] { (byte) 1, (short) 1, (short) -1 };
        int int43 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray33, intArray42);
        int int44 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray26, intArray33);
        int[] intArray48 = new int[] { 1, 1, 100 };
        int[] intArray50 = new int[] { (byte) -1 };
        int int51 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray48, intArray50);
        int int52 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray26, intArray48);
        int int53 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray19, intArray48);
        int[] intArray54 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int55 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray48, intArray54);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[-1, 35, -1]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[-1]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[-1]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[1, 1, -1]");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray50), "[-1]");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 137 + "'", int53 == 137);
    }

    @Test
    public void test05221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05221");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(153.15953604848616d, 814.2659300497917d, 2466.4210784519755d, 194.89413763890983d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2932.633334814371d + "'", double4 == 2932.633334814371d);
    }

    @Test
    public void test05222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05222");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(564.6151928723338d, 1044.5829363657538d, 1466.1168744323832d, 385.1080041055461d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 919.1997131606122d + "'", double4 == 919.1997131606122d);
    }

    @Test
    public void test05223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05223");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(329.92253806839784d, 524.4025725377481d, 550.8499153141472d, 733.1466438217658d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 429.671448529767d + "'", double4 == 429.671448529767d);
    }

    @Test
    public void test05224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05224");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(694.3209466544951d, 397.7356276694724d, 1275.43851583252d, 1250.8510419178506d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1434.2329834264028d + "'", double4 == 1434.2329834264028d);
    }

    @Test
    public void test05225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05225");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(747.071354124768d, 376.8752080844716d, 318.648156660146d, 414.4694560571327d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 466.01744543728313d + "'", double4 == 466.01744543728313d);
    }

    @Test
    public void test05226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05226");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(340.4421739578686d, 2026.3794624230661d, 10.0d, 649.5369668695829d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 452.4727851872838d + "'", double4 == 452.4727851872838d);
    }

    @Test
    public void test05227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05227");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(0.0d, 0.0d, 1254.328055159974d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1254.328055159974d + "'", double4 == 1254.328055159974d);
    }

    @Test
    public void test05228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05228");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1145.4123950228852d, 1569.438920038542d, 872.7025009513111d, 254.4112638901271d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1587.7375502199889d + "'", double4 == 1587.7375502199889d);
    }

    @Test
    public void test05229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05229");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(394.14097853281095d, 0.0d, 253.1840188907098d, 560.0246542664447d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 217.68384953056642d + "'", double4 == 217.68384953056642d);
    }

    @Test
    public void test05230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05230");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1125.224204717177d, 158.31063183921498d, 510.63044040816783d, 847.3429777902343d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 674.4949750783476d + "'", double4 == 674.4949750783476d);
    }

    @Test
    public void test05231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05231");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(443.7592477112694d, 0.0d, 933.1441715331588d, 1531.040785084739d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2020.4257089066282d + "'", double4 == 2020.4257089066282d);
    }

    @Test
    public void test05232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05232");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(461.6034953317712d, 415.8647711999196d, 341.7378669222432d, 1746.0118008651607d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1289.9893271640522d + "'", double4 == 1289.9893271640522d);
    }

    @Test
    public void test05233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05233");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1932.2900276382923d, 993.1168268225509d, 228.29858276560483d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2697.1082716952383d + "'", double4 == 2697.1082716952383d);
    }

    @Test
    public void test05234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05234");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(0.0d, 605.3411715595164d, 880.8610059744032d, 163.99057517747818d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 895.9961052333194d + "'", double4 == 895.9961052333194d);
    }

    @Test
    public void test05235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05235");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(2005.904232599732d, 1475.6162292730335d, 550.8499153141472d, 784.7599638001475d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1899.572686546501d + "'", double4 == 1899.572686546501d);
    }

    @Test
    public void test05236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05236");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(913.2926041823763d, 422.0208222943637d, 105.84817372967753d, 603.0082883958016d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 988.4318965541366d + "'", double4 == 988.4318965541366d);
    }

    @Test
    public void test05237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05237");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1461.456952129271d, 735.652387421924d, 1054.9024297095775d, (double) 72);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1070.2069098416175d + "'", double4 == 1070.2069098416175d);
    }

    @Test
    public void test05238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05238");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1179.7222842655474d, 266.74043359662835d, 300.5873303086664d, 1333.1036007329699d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 892.4147553184264d + "'", double4 == 892.4147553184264d);
    }

    @Test
    public void test05239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05239");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1332.2199015767492d, 140.71846197183868d, 1007.4997444551899d, 469.82663509603424d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 921.5016692943793d + "'", double4 == 921.5016692943793d);
    }

    @Test
    public void test05240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05240");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(2170.151886646953d, 1114.6220535613181d, 1695.0049382569227d, 1279.4350305583675d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1009.5252053736407d + "'", double4 == 1009.5252053736407d);
    }

    @Test
    public void test05241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05241");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(730.5393088107734d, 0.0d, 2395.0492959748417d, 996.2580281909632d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2660.7680153550314d + "'", double4 == 2660.7680153550314d);
    }

    @Test
    public void test05242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05242");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1209.4031474744982d, 524.064893636043d, 250.65596716483458d, 679.9542693129016d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1114.6365559865221d + "'", double4 == 1114.6365559865221d);
    }

    @Test
    public void test05243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05243");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(318.648156660146d, 677.7886811069052d, 269.93412892985066d, 510.9207644402136d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 215.58194439698696d + "'", double4 == 215.58194439698696d);
    }

    @Test
    public void test05244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05244");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(961.703763506027d, 412.7484808105533d, 115.14060609640867d, 1853.2363306232926d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1229.4305583130931d + "'", double4 == 1229.4305583130931d);
    }

    @Test
    public void test05245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05245");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1427.5991254551002d, 716.1930244036126d, 825.016852109698d, 517.7839731622196d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1091.2694477038337d + "'", double4 == 1091.2694477038337d);
    }

    @Test
    public void test05246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05246");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(0.0d, 911.1185314905224d, 837.1104194170482d, 1110.874708700701d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1036.8665966272267d + "'", double4 == 1036.8665966272267d);
    }

    @Test
    public void test05247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05247");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(0.0d, 295.35263043242065d, 457.93935464055545d, 231.9064967234238d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 521.3854883495524d + "'", double4 == 521.3854883495524d);
    }

    @Test
    public void test05248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05248");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1853.2363306232926d, 600.8860538877583d, 1779.4420649611448d, 403.4830412703007d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 271.1972782796054d + "'", double4 == 271.1972782796054d);
    }

    @Test
    public void test05249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05249");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(93.2168815106545d, 127.97315542808013d, 1379.0510391002504d, 179.42158274528765d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1337.2825849068033d + "'", double4 == 1337.2825849068033d);
    }

    @Test
    public void test05250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05250");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1609.9001823186975d, 1755.8394358664898d, 1385.9035451077712d, 914.2930275299476d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1065.5430455474684d + "'", double4 == 1065.5430455474684d);
    }

    @Test
    public void test05251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05251");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(984.3915483928058d, 1557.266820436816d, 1231.3588379004525d, 1405.4091582399142d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 398.82495170454854d + "'", double4 == 398.82495170454854d);
    }

    @Test
    public void test05252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05252");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(672.9087248818287d, 1076.6332467563377d, 3072.91771441355d, 132.0438729335658d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2460.198759837524d + "'", double4 == 2460.198759837524d);
    }

    @Test
    public void test05253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05253");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(0.0d, 541.8465581885739d, 244.60262436069576d, 622.7592060348951d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 669.073592772389d + "'", double4 == 669.073592772389d);
    }

    @Test
    public void test05254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05254");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1081.1487055736848d, 634.1478301952668d, 0.0d, 132.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1583.2965357689516d + "'", double4 == 1583.2965357689516d);
    }

    @Test
    public void test05255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05255");
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
        double[] doubleArray70 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray71 = new double[] {};
        double double73 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray70, doubleArray71, 0);
        double[] doubleArray78 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray79 = new double[] {};
        double double81 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray78, doubleArray79, 0);
        double double83 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray71, doubleArray79, (int) (byte) 1);
        double double85 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray61, doubleArray79, 0);
        double double87 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray40, doubleArray79, (int) '#');
        java.lang.Class<?> wildcardClass88 = doubleArray40.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass88);
    }

    @Test
    public void test05256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05256");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1429.1280765910471d, 510.8120210636406d, 857.8986293936312d, 1187.411961597624d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 620.2658797588169d + "'", double4 == 620.2658797588169d);
    }

    @Test
    public void test05257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05257");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(938.0820197110341d, 790.3676114966954d, 1755.8394358664898d, 776.614861614777d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 831.510166037374d + "'", double4 == 831.510166037374d);
    }

    @Test
    public void test05258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05258");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(0.0d, 0.0d, 0.0d, 993.1168268225509d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 993.1168268225509d + "'", double4 == 993.1168268225509d);
    }

    @Test
    public void test05259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05259");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1796.4354730536033d, 185.51105438526488d, 606.1975226364846d, 1569.438920038542d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2574.1658160703955d + "'", double4 == 2574.1658160703955d);
    }

    @Test
    public void test05260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05260");
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
    public void test05261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05261");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(0.0d, 119.99500012499374d, 533.7897512871245d, 939.553850382393d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1353.3486015445237d + "'", double4 == 1353.3486015445237d);
    }

    @Test
    public void test05262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05262");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(903.0910492666097d, 1527.562361003158d, 574.2264568926857d, 601.1556235944573d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 446.44923719622483d + "'", double4 == 446.44923719622483d);
    }

    @Test
    public void test05263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05263");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(233.65447025960663d, 278.30377623382043d, 1595.4753932860335d, 488.02963325941397d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1571.5467800520205d + "'", double4 == 1571.5467800520205d);
    }

    @Test
    public void test05264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05264");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(372.30674150719653d, 255.41977514636133d, 393.60755379174935d, 511.3067487107217d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 277.1877858489132d + "'", double4 == 277.1877858489132d);
    }

    @Test
    public void test05265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05265");
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
        int[] intArray43 = new int[] { (byte) 1, (short) 1, (short) -1 };
        int int44 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray34, intArray43);
        int int45 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray27, intArray34);
        int[] intArray49 = new int[] { 1, 1, 100 };
        int[] intArray51 = new int[] { (byte) -1 };
        int int52 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray49, intArray51);
        int int53 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray27, intArray49);
        int int54 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray19, intArray49);
        java.lang.Class<?> wildcardClass55 = intArray19.getClass();
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
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test05266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05266");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(541.8486639615793d, 455.57461664944447d, 934.56337512867d, 1309.8869236501089d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1247.0270181677552d + "'", double4 == 1247.0270181677552d);
    }

    @Test
    public void test05267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05267");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(474.1414912901275d, 924.308574861357d, 816.3228889880967d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1266.4899725593261d + "'", double4 == 1266.4899725593261d);
    }

    @Test
    public void test05268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05268");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(20.0d, 603.0082883958016d, 2284.728282921257d, 1685.2994274341145d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3347.0194219595696d + "'", double4 == 3347.0194219595696d);
    }

    @Test
    public void test05269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05269");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(816.3228889880967d, 1128.6419161452409d, 629.4714697471602d, 423.5526445633491d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 891.9406908228283d + "'", double4 == 891.9406908228283d);
    }

    @Test
    public void test05270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05270");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1452.6290520835419d, 424.55910681763555d, 0.0d, 858.8263355548762d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1569.3096664183115d + "'", double4 == 1569.3096664183115d);
    }

    @Test
    public void test05271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05271");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(914.2930275299476d, 1613.4785133942391d, 418.4682227096378d, 404.68669618344165d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 711.0139590919035d + "'", double4 == 711.0139590919035d);
    }

    @Test
    public void test05272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05272");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(2753.8564970073144d, 367.32273218396386d, 579.9160313510744d, 697.6691737578252d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2504.2869072301014d + "'", double4 == 2504.2869072301014d);
    }

    @Test
    public void test05273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05273");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1531.7458028141925d, 93.72088191418453d, 604.2410914961023d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1790.6731119766525d + "'", double4 == 1790.6731119766525d);
    }

    @Test
    public void test05274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05274");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(253.75693821022156d, 677.1507060283737d, 281.63996109123826d, 799.2746305194268d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 150.0069473720697d + "'", double4 == 150.0069473720697d);
    }

    @Test
    public void test05275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05275");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(0.0d, 347.6332631604373d, 2223.519951796883d, 1488.063822424116d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2675.513953551034d + "'", double4 == 2675.513953551034d);
    }

    @Test
    public void test05276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05276");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1273.7081586856443d, 837.6288297522865d, 0.0d, 331.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1584.623345137529d + "'", double4 == 1584.623345137529d);
    }

    @Test
    public void test05277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05277");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(915.0333471769723d, 3084.088960040406d, 2859.6987879438148d, 1622.949527142839d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2069.5093607834597d + "'", double4 == 2069.5093607834597d);
    }

    @Test
    public void test05278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05278");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(776.614861614777d, 5170.74555137657d, 957.7440738866916d, 1269.190001179692d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4082.6847624687925d + "'", double4 == 4082.6847624687925d);
    }

    @Test
    public void test05279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05279");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(397.69618503940757d, 434.8444534510172d, 0.0d, 818.8255089349238d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 781.6772405233141d + "'", double4 == 781.6772405233141d);
    }

    @Test
    public void test05280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05280");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(630.292147948475d, 393.63625972865634d, 497.6952949381995d, 305.8769656511977d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 350.4670254577515d + "'", double4 == 350.4670254577515d);
    }

    @Test
    public void test05281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05281");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(264.9111278263732d, 998.1877562866482d, 774.0897884912134d, 506.64081324618246d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 563.645410954086d + "'", double4 == 563.645410954086d);
    }

    @Test
    public void test05282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05282");
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
        java.lang.Class<?> wildcardClass42 = intArray19.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test05283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05283");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(268.59948986728233d, 0.0d, 237.15390812259642d, 1574.892742180067d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1306.671682424156d + "'", double4 == 1306.671682424156d);
    }

    @Test
    public void test05284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05284");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(575.2911895839196d, 1428.1155278730532d, 582.1853565419128d, 400.7326059370867d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1034.27708889396d + "'", double4 == 1034.27708889396d);
    }

    @Test
    public void test05285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05285");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1731.0565808224262d, 2798.8644963525703d, 386.8432478352133d, 673.1782704198858d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1710.5601434035357d + "'", double4 == 1710.5601434035357d);
    }

    @Test
    public void test05286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05286");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(111.8257573191436d, 1424.5798640010707d, 876.5642873545353d, 709.5490174935603d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 970.617388611097d + "'", double4 == 970.617388611097d);
    }

    @Test
    public void test05287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05287");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(220.78840830511703d, 948.6076268806784d, 802.6421558686652d, 628.7251427991296d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 710.6097120806777d + "'", double4 == 710.6097120806777d);
    }

    @Test
    public void test05288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05288");
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
        int[] intArray83 = new int[] { 1, 1, 100 };
        int[] intArray85 = new int[] { (byte) -1 };
        int int86 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray83, intArray85);
        int[] intArray89 = new int[] { 'a', 10 };
        int int90 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray85, intArray89);
        int[] intArray94 = new int[] { (byte) 1, (short) 1, (short) -1 };
        int int95 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray85, intArray94);
        int int96 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray46, intArray85);
        int int97 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray32, intArray46);
        int int98 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray16, intArray46);
        int int99 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray9, intArray16);
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
        org.junit.Assert.assertNotNull(intArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray83), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray85), "[-1]");
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + (-1) + "'", int86 == (-1));
        org.junit.Assert.assertNotNull(intArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray89), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + (-1) + "'", int90 == (-1));
        org.junit.Assert.assertNotNull(intArray94);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray94), "[1, 1, -1]");
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + (-1) + "'", int95 == (-1));
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + 0 + "'", int96 == 0);
        org.junit.Assert.assertTrue("'" + int97 + "' != '" + (-1) + "'", int97 == (-1));
        org.junit.Assert.assertTrue("'" + int98 + "' != '" + 0 + "'", int98 == 0);
        org.junit.Assert.assertTrue("'" + int99 + "' != '" + (-1) + "'", int99 == (-1));
    }

    @Test
    public void test05289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05289");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(484.2452832538524d, 1978.061686919199d, 359.2623750887635d, 1431.044245781737d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 672.0003493025511d + "'", double4 == 672.0003493025511d);
    }

    @Test
    public void test05290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05290");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(605.0932959420239d, 553.0556919454142d, 475.8773849871957d, 537.0099291178069d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 145.26167378243554d + "'", double4 == 145.26167378243554d);
    }

    @Test
    public void test05291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05291");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(339.99517634338116d, 779.9841197127514d, 369.54144161435426d, 990.4666361499317d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 240.02878170815336d + "'", double4 == 240.02878170815336d);
    }

    @Test
    public void test05292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05292");
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
        double double40 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray27, doubleArray36, (int) (short) 100);
        double[] doubleArray43 = new double[] { (byte) 0, 132.0d };
        double double45 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray36, doubleArray43, (int) '4');
        double[] doubleArray47 = new double[] { (short) 0 };
        double[] doubleArray52 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray53 = new double[] {};
        double double55 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray52, doubleArray53, 0);
        double[] doubleArray60 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray61 = new double[] {};
        double double63 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray60, doubleArray61, 0);
        double double65 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray52, doubleArray61, (int) (short) 100);
        double double67 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray47, doubleArray52, 1);
        double double69 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray43, doubleArray52, 1);
        double double71 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray20, doubleArray52, (int) (short) -1);
        java.lang.Class<?> wildcardClass72 = doubleArray52.getClass();
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
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + (-1.0d) + "'", double40 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[0.0, 132.0]");
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + (-1.0d) + "'", double45 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[0.0]");
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
        org.junit.Assert.assertNotNull(wildcardClass72);
    }

    @Test
    public void test05293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05293");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1820.3574553715514d, 770.5680756103723d, 393.60755379174935d, 849.6583320319836d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1505.8401580014133d + "'", double4 == 1505.8401580014133d);
    }

    @Test
    public void test05294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05294");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(699.56173032996d, 1399.2236568241767d, 1350.530049863511d, 361.40691134511934d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1688.7850650126084d + "'", double4 == 1688.7850650126084d);
    }

    @Test
    public void test05295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05295");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(684.3898597150222d, 803.8665608360225d, 346.2513432401249d, 800.3647138088593d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 357.47422719117975d + "'", double4 == 357.47422719117975d);
    }

    @Test
    public void test05296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05296");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(2297.8324290126793d, 372.30674150719653d, 1626.811134785038d, 2306.0930398655814d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2604.8075925860267d + "'", double4 == 2604.8075925860267d);
    }

    @Test
    public void test05297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05297");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(457.2390555781002d, 0.0d, 1276.6005254872152d, 1148.933622105859d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1968.2950920149742d + "'", double4 == 1968.2950920149742d);
    }

    @Test
    public void test05298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05298");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(894.7148590037133d, 482.7855959125905d, 533.7054029724968d, 988.1839780629083d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 372.9132654675304d + "'", double4 == 372.9132654675304d);
    }

    @Test
    public void test05299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05299");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1604.6597302396287d, 383.8104267414643d, 475.9324615695342d, 2305.989973033269d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3050.9068149618993d + "'", double4 == 3050.9068149618993d);
    }

    @Test
    public void test05300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05300");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(2249.698283008857d, 760.9346764780822d, 323.08444526140875d, 1572.0167674001102d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2737.695928669476d + "'", double4 == 2737.695928669476d);
    }

    @Test
    public void test05301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05301");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(586.9333963249293d, 1790.7743259911974d, 31.18538151458436d, 285.1699348719751d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 632.3899450763809d + "'", double4 == 632.3899450763809d);
    }

    @Test
    public void test05302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05302");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(257.74051779498967d, 651.4276402304927d, 480.053811204915d, 1557.266820436816d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1318.4050256596806d + "'", double4 == 1318.4050256596806d);
    }

    @Test
    public void test05303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05303");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance((double) (byte) 10, 253.1840188907098d, 525.6033028024341d, 753.6820615291944d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 904.9363372641697d + "'", double4 == 904.9363372641697d);
    }

    @Test
    public void test05304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05304");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(814.9296334970577d, 622.4835640535658d, 0.0d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1437.4131975506234d + "'", double4 == 1437.4131975506234d);
    }

    @Test
    public void test05305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05305");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(3733.7953501472784d, 1077.0561352076481d, 218.5527652647674d, 598.9288607212837d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4710.023177978803d + "'", double4 == 4710.023177978803d);
    }

    @Test
    public void test05306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05306");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(220.78840830511703d, 497.7505917183977d, 993.6335652888822d, 2499.1808909212277d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2774.2754561865954d + "'", double4 == 2774.2754561865954d);
    }

    @Test
    public void test05307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05307");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(723.7841806651837d, 1968.277946913467d, 117.5273091577346d, 972.8176660596337d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1601.7171523612824d + "'", double4 == 1601.7171523612824d);
    }

    @Test
    public void test05308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05308");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1942.3604290676167d, 1339.0603294247537d, 777.2918910170832d, 393.60755379174935d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1938.0454501973047d + "'", double4 == 1938.0454501973047d);
    }

    @Test
    public void test05309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05309");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(583.8736067388763d, 4755.712221645643d, 953.6045361221611d, 1375.9597269450157d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 874.1289275420659d + "'", double4 == 874.1289275420659d);
    }

    @Test
    public void test05310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05310");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(805.0518427817625d, 419.0413653100427d, 351.6199127515424d, 867.1622518811478d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 901.5528166013252d + "'", double4 == 901.5528166013252d);
    }

    @Test
    public void test05311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05311");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(556.9757457476818d, 867.339749320863d, 72.09748128251067d, 368.39470755902255d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 983.8233062270116d + "'", double4 == 983.8233062270116d);
    }

    @Test
    public void test05312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05312");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(878.9369453932875d, 1187.411961597624d, 697.6691737578252d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 897.4342087367569d + "'", double4 == 897.4342087367569d);
    }

    @Test
    public void test05313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05313");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(362.91735790755365d, 1254.328055159974d, 361.22579444008596d, 727.3917336047957d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 528.6278850226458d + "'", double4 == 528.6278850226458d);
    }

    @Test
    public void test05314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05314");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(329.49735812801526d, 535.9469777784859d, 0.0d, 332.0533251182606d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 329.5072715139937d + "'", double4 == 329.5072715139937d);
    }

    @Test
    public void test05315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05315");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(536.4161158553086d, 809.867614684615d, 442.2044982103387d, 952.3439282336848d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 236.68793119403966d + "'", double4 == 236.68793119403966d);
    }

    @Test
    public void test05316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05316");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(643.9042115403038d, 1011.1285481306548d, 637.4770430936846d, 582.758941793481d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 61.482131604661696d + "'", double4 == 61.482131604661696d);
    }

    @Test
    public void test05317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05317");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1264.0538059811463d, 913.1298436135796d, 407.95790549631715d, 500.4832062519777d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1147.144390038888d + "'", double4 == 1147.144390038888d);
    }

    @Test
    public void test05318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05318");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(103.4376113230772d, 1292.0367371442157d, (double) (-1L), 876.0631684671114d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 520.4111800001816d + "'", double4 == 520.4111800001816d);
    }

    @Test
    public void test05319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05319");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(251.12978742411298d, 662.8861550421406d, 1437.4131975506234d, 393.63625972865634d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1194.812296467553d + "'", double4 == 1194.812296467553d);
    }

    @Test
    public void test05320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05320");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(0.0d, 1003.6213789219814d, 1043.889041977745d, 91.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1047.8479526921901d + "'", double4 == 1047.8479526921901d);
    }

    @Test
    public void test05321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05321");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(852.4982074660716d, 2584.284483848353d, 852.931001406363d, 1707.0881234703174d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 877.6291543183269d + "'", double4 == 877.6291543183269d);
    }

    @Test
    public void test05322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05322");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1782.6739631584846d, 1532.6762509565908d, 482.7855959125905d, 1877.2630507791253d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1644.4751670684286d + "'", double4 == 1644.4751670684286d);
    }

    @Test
    public void test05323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05323");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(690.5107149310497d, 753.9237741494105d, 1170.9018505716544d, 916.7412550310105d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 643.2086165222047d + "'", double4 == 643.2086165222047d);
    }

    @Test
    public void test05324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05324");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1812.7654321100495d, 1710.5601434035357d, 886.4434740943086d, 1158.0735480092137d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1134.3252765453205d + "'", double4 == 1134.3252765453205d);
    }

    @Test
    public void test05325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05325");
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
        int[] intArray53 = new int[] { (byte) -1, (short) -1, ' ' };
        int[] intArray57 = new int[] { 1, 1, 100 };
        int[] intArray59 = new int[] { (byte) -1 };
        int int60 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray57, intArray59);
        int int61 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray53, intArray57);
        int int62 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray24, intArray53);
        int int63 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray16, intArray24);
        int[] intArray67 = new int[] { 1, 1, 100 };
        int[] intArray69 = new int[] { (byte) -1 };
        int int70 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray67, intArray69);
        int int71 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray24, intArray69);
        int[] intArray72 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int73 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray69, intArray72);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray53), "[-1, -1, 32]");
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray57), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray59), "[-1]");
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 72 + "'", int61 == 72);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray67), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray69), "[-1]");
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
    }

    @Test
    public void test05326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05326");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1085.9203536169716d, 454.4460027984916d, 301.85507241890923d, 1319.885752410512d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1649.5050308100826d + "'", double4 == 1649.5050308100826d);
    }

    @Test
    public void test05327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05327");
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
        double[] doubleArray66 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray67 = new double[] {};
        double double69 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray66, doubleArray67, 0);
        double double71 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray58, doubleArray67, 1);
        double double73 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray51, doubleArray67, (int) (short) 10);
        double[] doubleArray78 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray79 = new double[] {};
        double double81 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray78, doubleArray79, 0);
        double[] doubleArray86 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray87 = new double[] {};
        double double89 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray86, doubleArray87, 0);
        double double91 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray78, doubleArray87, 1);
        double double93 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray67, doubleArray78, (int) '#');
        double double95 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray38, doubleArray78, (int) (byte) 1);
        double[] doubleArray96 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double98 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray78, doubleArray96, 137);
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
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray67), "[]");
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + (-1.0d) + "'", double69 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + (-1.0d) + "'", double71 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + 0.0d + "'", double73 == 0.0d);
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
    }

    @Test
    public void test05328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05328");
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
        int[] intArray25 = new int[] { 1, 1, 100 };
        int[] intArray27 = new int[] { (byte) -1 };
        int int28 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray25, intArray27);
        int[] intArray31 = new int[] { 'a', 10 };
        int int32 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray27, intArray31);
        int[] intArray36 = new int[] { (byte) 1, (short) 1, (short) -1 };
        int int37 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray27, intArray36);
        int int38 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray20, intArray27);
        int[] intArray42 = new int[] { 1, 1, 100 };
        int[] intArray44 = new int[] { (byte) -1 };
        int int45 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray42, intArray44);
        int int46 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray20, intArray42);
        int[] intArray50 = new int[] { 1, 1, 100 };
        int[] intArray52 = new int[] { (byte) -1 };
        int int53 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray50, intArray52);
        int[] intArray56 = new int[] { 'a', 10 };
        int int57 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray52, intArray56);
        int int58 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray20, intArray52);
        int[] intArray62 = new int[] { 1, 1, 100 };
        int[] intArray64 = new int[] { (byte) -1 };
        int int65 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray62, intArray64);
        int[] intArray69 = new int[] { 1, 1, 100 };
        int[] intArray71 = new int[] { (byte) -1 };
        int int72 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray69, intArray71);
        int[] intArray75 = new int[] { 'a', 10 };
        int int76 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray71, intArray75);
        int int77 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray62, intArray75);
        int int78 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray52, intArray75);
        int[] intArray82 = new int[] { 1, 1, 100 };
        int[] intArray84 = new int[] { (byte) -1 };
        int int85 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray82, intArray84);
        int[] intArray88 = new int[] { 'a', 10 };
        int int89 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray84, intArray88);
        int int90 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray75, intArray88);
        int int91 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray12, intArray88);
        int[] intArray92 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int93 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray12, intArray92);
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
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[1, 1, -1]");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[-1]");
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
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
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
    }

    @Test
    public void test05329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05329");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance((double) 72, 545.7139477899229d, 1324.9964028761062d, 204.83607191297912d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1260.0180187686728d + "'", double4 == 1260.0180187686728d);
    }

    @Test
    public void test05330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05330");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(454.30327503951946d, 237.15390812259642d, 1661.4712989827988d, 1400.1192946746407d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1533.565316844883d + "'", double4 == 1533.565316844883d);
    }

    @Test
    public void test05331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05331");
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
        int int56 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray5, intArray36);
        java.lang.Class<?> wildcardClass57 = intArray36.getClass();
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
    public void test05332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05332");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(489.5472968394182d, 0.0d, 349.60040893340556d, 402.62125830545074d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 164.7460700890521d + "'", double4 == 164.7460700890521d);
    }

    @Test
    public void test05333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05333");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(831.510166037374d, 578.4634406489067d, 282.94370701765916d, 1300.6544713099918d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1270.7574896807998d + "'", double4 == 1270.7574896807998d);
    }

    @Test
    public void test05334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05334");
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
        double[] doubleArray82 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray83 = new double[] {};
        double double85 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray82, doubleArray83, 0);
        double double87 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray69, doubleArray82, 26);
        java.lang.Class<?> wildcardClass88 = doubleArray69.getClass();
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
        org.junit.Assert.assertNotNull(doubleArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray82), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray83), "[]");
        org.junit.Assert.assertTrue("'" + double85 + "' != '" + (-1.0d) + "'", double85 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double87 + "' != '" + (-1.0d) + "'", double87 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass88);
    }

    @Test
    public void test05335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05335");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(589.8511983133467d, 1086.2697910773807d, 486.1444817768018d, 284.27897490340905d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 905.6975327105165d + "'", double4 == 905.6975327105165d);
    }

    @Test
    public void test05336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05336");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(0.0d, 3084.0340604846488d, 386.38223780084934d, 1065.4951610287171d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1133.3892411098686d + "'", double4 == 1133.3892411098686d);
    }

    @Test
    public void test05337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05337");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1350.530049863511d, 978.6260708451896d, 231.9064967234238d, 713.2658664605801d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1383.9837575246968d + "'", double4 == 1383.9837575246968d);
    }

    @Test
    public void test05338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05338");
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
        int int39 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray5, intArray35);
        java.lang.Class<?> wildcardClass40 = intArray35.getClass();
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test05339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05339");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(2748.1343799560727d, 596.0941353142186d, 2156.0284488039074d, 2596.262485026525d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 611.2728573845434d + "'", double4 == 611.2728573845434d);
    }

    @Test
    public void test05340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05340");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1853.2363306232926d, 1033.7006669989464d, 1253.288389373309d, 699.17212331377d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 934.47648493516d + "'", double4 == 934.47648493516d);
    }

    @Test
    public void test05341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05341");
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
        int[] intArray47 = new int[] { 1, 1, 100 };
        int[] intArray49 = new int[] { (byte) -1 };
        int int50 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray47, intArray49);
        int[] intArray54 = new int[] { 1, 1, 100 };
        int[] intArray56 = new int[] { (byte) -1 };
        int int57 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray54, intArray56);
        int[] intArray60 = new int[] { 'a', 10 };
        int int61 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray56, intArray60);
        int int62 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray47, intArray60);
        int int63 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray38, intArray47);
        int int64 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray28, intArray38);
        int[] intArray68 = new int[] { 1, 1, 100 };
        int[] intArray70 = new int[] { (byte) -1 };
        int int71 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray68, intArray70);
        int[] intArray74 = new int[] { 'a', 10 };
        int int75 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray70, intArray74);
        int[] intArray79 = new int[] { (byte) 1, (short) 1, (short) -1 };
        int int80 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray70, intArray79);
        int[] intArray84 = new int[] { (byte) -1, '#', (-1) };
        int int85 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray70, intArray84);
        int int86 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray28, intArray70);
        // The following exception was thrown during execution in test generation
        try {
            int int87 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray0, intArray28);
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
    }

    @Test
    public void test05342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05342");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(504.1892407191555d, 2020.0506846245455d, 927.6563662606078d, 968.7828923815307d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1474.7349177844671d + "'", double4 == 1474.7349177844671d);
    }

    @Test
    public void test05343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05343");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(692.7291040974272d, 675.0461907582147d, 1645.22279647314d, 1065.5430455474684d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1022.8560353026392d + "'", double4 == 1022.8560353026392d);
    }

    @Test
    public void test05344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05344");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(2020.0506846245455d, 991.9071844518359d, 906.6040994538412d, 1568.754461841881d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1690.2938625607494d + "'", double4 == 1690.2938625607494d);
    }

    @Test
    public void test05345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05345");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(2499.87032213283d, 2722.5729292979886d, 160.51070384752757d, 970.6014510601196d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4091.3310965231713d + "'", double4 == 4091.3310965231713d);
    }

    @Test
    public void test05346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05346");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(182.24761454025776d, 633.8605058765781d, 735.7226964905593d, 500.39683484468236d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 638.3992424182584d + "'", double4 == 638.3992424182584d);
    }

    @Test
    public void test05347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05347");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(2182.3972961457657d, 1997.3898007645857d, 1333.732083151523d, 1329.120027421337d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1203.4594887524815d + "'", double4 == 1203.4594887524815d);
    }

    @Test
    public void test05348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05348");
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
        double[] doubleArray47 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray48 = new double[] {};
        double double50 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray47, doubleArray48, 0);
        double double52 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray40, doubleArray48, (int) (byte) 1);
        double double54 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray21, doubleArray40, (int) (short) -1);
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
        double double82 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray60, doubleArray67, (int) ' ');
        double double84 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray40, doubleArray67, (int) (short) 10);
        double double86 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray14, doubleArray67, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            double double88 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray0, doubleArray67, 111);
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
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[]");
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + (-1.0d) + "'", double50 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 0.0d + "'", double52 == 0.0d);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + (-1.0d) + "'", double54 == (-1.0d));
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
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + (-1.0d) + "'", double82 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double84 + "' != '" + (-1.0d) + "'", double84 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double86 + "' != '" + (-1.0d) + "'", double86 == (-1.0d));
    }

    @Test
    public void test05349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05349");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(596.0941353142186d, 0.0d, 2725.0650009252895d, 3502.6530561004865d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 5631.623921711557d + "'", double4 == 5631.623921711557d);
    }

    @Test
    public void test05350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05350");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(2582.9185785297154d, 454.12565181325886d, 156.94538945476546d, 50.91168824543142d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3506.622991791044d + "'", double4 == 3506.622991791044d);
    }

    @Test
    public void test05351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05351");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1828.8034906289192d, 1633.5358564520893d, 31.18538151458436d, 191.4960303078818d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3239.6579352585422d + "'", double4 == 3239.6579352585422d);
    }

    @Test
    public void test05352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05352");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1851.2421216798107d, 912.4483247186538d, 1810.1478849203654d, 195.96347416036195d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 757.579087317737d + "'", double4 == 757.579087317737d);
    }

    @Test
    public void test05353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05353");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(205.5805791818629d, 391.7745645456948d, 1337.2825849068033d, 1113.295503583767d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1853.2229447630125d + "'", double4 == 1853.2229447630125d);
    }

    @Test
    public void test05354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05354");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(737.0371885316508d, 475.8773849871957d, 1472.5331850067023d, 233.2037260806634d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 978.1696553815838d + "'", double4 == 978.1696553815838d);
    }

    @Test
    public void test05355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05355");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(2022.9060016040892d, 564.59755583695d, 754.5164898211783d, 2548.18217586309d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1372.8536021167963d + "'", double4 == 1372.8536021167963d);
    }

    @Test
    public void test05356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05356");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(0.0d, 453.07593930689717d, 736.1675235684974d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1189.2434628753945d + "'", double4 == 1189.2434628753945d);
    }

    @Test
    public void test05357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05357");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(609.7793622065474d, 894.6521376148579d, 912.3200508707025d, 359.8788905584546d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 392.4042737118449d + "'", double4 == 392.4042737118449d);
    }

    @Test
    public void test05358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05358");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1059.2083086260702d, 1959.919313969232d, 546.2486273454158d, 1945.7116823361646d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1024.2147559076318d + "'", double4 == 1024.2147559076318d);
    }

    @Test
    public void test05359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05359");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(334.29461053740494d, 329.5072715139937d, 1067.588956481264d, 626.3085216071547d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 789.2988800520901d + "'", double4 == 789.2988800520901d);
    }

    @Test
    public void test05360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05360");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(802.6421558686652d, 1624.2639273004588d, 1034.085734167077d, 626.2527251290963d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1229.454780469774d + "'", double4 == 1229.454780469774d);
    }

    @Test
    public void test05361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05361");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(531.3304925815354d, 610.1198696007909d, 1409.250586878226d, 252.8742777722448d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 921.0220168572671d + "'", double4 == 921.0220168572671d);
    }

    @Test
    public void test05362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05362");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(457.78541965322023d, 631.3090460623639d, 911.0474342832409d, 1376.0543125051038d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1198.0072810727606d + "'", double4 == 1198.0072810727606d);
    }

    @Test
    public void test05363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05363");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(906.8103049270077d, 1255.1514421955394d, 3151.7523650958406d, 527.1482074781821d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2276.8197473129762d + "'", double4 == 2276.8197473129762d);
    }

    @Test
    public void test05364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05364");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(2024.6129661452476d, 2574.1658160703955d, 1235.0951599530379d, 1300.6544713099918d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1071.1929184505884d + "'", double4 == 1071.1929184505884d);
    }

    @Test
    public void test05365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05365");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(2078.842028800691d, 414.604730252317d, 2714.576174508985d, 4213.551643492881d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2227.362351095738d + "'", double4 == 2227.362351095738d);
    }

    @Test
    public void test05366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05366");
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
        int[] intArray91 = new int[] { 1, 1, 100 };
        int[] intArray93 = new int[] { (byte) -1 };
        int int94 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray91, intArray93);
        int int95 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray84, intArray93);
        int int96 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray46, intArray93);
        java.lang.Class<?> wildcardClass97 = intArray93.getClass();
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
        org.junit.Assert.assertNotNull(intArray91);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray91), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray93);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray93), "[-1]");
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + (-1) + "'", int94 == (-1));
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + (-1) + "'", int95 == (-1));
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + 0 + "'", int96 == 0);
        org.junit.Assert.assertNotNull(wildcardClass97);
    }

    @Test
    public void test05367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05367");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(782.3144896032597d, 2657.8403114103457d, 558.0681006752535d, 4710.023177978803d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3934.104978732517d + "'", double4 == 3934.104978732517d);
    }

    @Test
    public void test05368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05368");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(682.0713285674663d, 219.30999222078046d, 2751.2925482046803d, 1133.3892411098686d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2117.867869811181d + "'", double4 == 2117.867869811181d);
    }

    @Test
    public void test05369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05369");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(119.99500012499374d, 153.15953604848616d, 3114.804595839457d, 784.2536075694591d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3625.903667235436d + "'", double4 == 3625.903667235436d);
    }

    @Test
    public void test05370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05370");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1249.7945143014063d, 1330.9838083484606d, 2281.7907658446843d, 500.39683484468236d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1862.5832250470562d + "'", double4 == 1862.5832250470562d);
    }

    @Test
    public void test05371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05371");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(383.8104267414643d, 759.4458766521755d, 546.5855220111873d, 1130.6761821173957d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 534.0054007349432d + "'", double4 == 534.0054007349432d);
    }

    @Test
    public void test05372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05372");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(3347.0194219595696d, 392.4748348031439d, 2193.038732413254d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1546.4555243494597d + "'", double4 == 1546.4555243494597d);
    }

    @Test
    public void test05373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05373");
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
        double[] doubleArray61 = new double[] { 232.4213562373095d, (short) 0, 1.0f, 75.85073476263909d, (-1L) };
        double double63 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray53, doubleArray61, (int) (byte) -1);
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
        double double93 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray61, doubleArray86, (int) (short) 100);
        double double95 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray13, doubleArray61, 136);
        java.lang.Class<?> wildcardClass96 = doubleArray13.getClass();
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
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[232.4213562373095, 0.0, 1.0, 75.85073476263909, -1.0]");
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
        org.junit.Assert.assertTrue("'" + double95 + "' != '" + (-1.0d) + "'", double95 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass96);
    }

    @Test
    public void test05374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05374");
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
        int[] intArray46 = new int[] { (byte) 10, (byte) 100, ' ', (short) -1, (short) 100 };
        int int47 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray39, intArray46);
        int[] intArray51 = new int[] { 1, 1, 100 };
        int[] intArray53 = new int[] { (byte) -1 };
        int int54 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray51, intArray53);
        int[] intArray58 = new int[] { 1, 1, 100 };
        int[] intArray60 = new int[] { (byte) -1 };
        int int61 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray58, intArray60);
        int[] intArray64 = new int[] { 'a', 10 };
        int int65 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray60, intArray64);
        int int66 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray51, intArray64);
        int int67 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray39, intArray64);
        int[] intArray71 = new int[] { 1, 1, 100 };
        int[] intArray73 = new int[] { (byte) -1 };
        int int74 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray71, intArray73);
        int[] intArray77 = new int[] { 'a', 10 };
        int int78 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray73, intArray77);
        int int79 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray39, intArray73);
        int int80 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray30, intArray39);
        int[] intArray81 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int82 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray30, intArray81);
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
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[10, 100, 32, -1, 100]");
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
        org.junit.Assert.assertNotNull(intArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray64), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
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
    }

    @Test
    public void test05375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05375");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(468.02478625976096d, 407.95790549631715d, 651.1259120141996d, 284.6189351320858d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 259.15965828116396d + "'", double4 == 259.15965828116396d);
    }

    @Test
    public void test05376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05376");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1879.9233625210336d, 841.7807386553494d, 2584.284483848353d, 2041.353929209072d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 722.6232885111716d + "'", double4 == 722.6232885111716d);
    }

    @Test
    public void test05377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05377");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(180.16732073586866d, 383.7240228035798d, 536.5073332323396d, 445.4642163364769d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 444.2529091872164d + "'", double4 == 444.2529091872164d);
    }

    @Test
    public void test05378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05378");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(0.0d, 875.2507257837353d, 1170.6845108897494d, 1877.2630507791253d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2212.378535842752d + "'", double4 == 2212.378535842752d);
    }

    @Test
    public void test05379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05379");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(181.94685709660757d, 350.4670254577515d, 467.94163262749527d, 872.7029822761873d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 808.2307323493235d + "'", double4 == 808.2307323493235d);
    }

    @Test
    public void test05380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05380");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(825.8447855853702d, 428.196971756117d, 231.83280856387287d, 1649.5050308100826d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1815.3200360754631d + "'", double4 == 1815.3200360754631d);
    }

    @Test
    public void test05381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05381");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(472.5109881900736d, 3007.5267939633395d, 38.71945453690022d, 29.016284593150402d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3412.3020430233623d + "'", double4 == 3412.3020430233623d);
    }

    @Test
    public void test05382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05382");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(556.8938666288083d, 2024.3420553991118d, 0.0d, 674.6394035036492d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 569.2054024187836d + "'", double4 == 569.2054024187836d);
    }

    @Test
    public void test05383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05383");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1255.1241800674334d, 100.0d, 633.9625404236099d, 314.96520757471535d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 836.1268472185388d + "'", double4 == 836.1268472185388d);
    }

    @Test
    public void test05384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05384");
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
        int int80 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray6, intArray53);
        // The following exception was thrown during execution in test generation
        try {
            int int81 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray0, intArray6);
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
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
    }

    @Test
    public void test05385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05385");
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
        double[] doubleArray89 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray90 = new double[] {};
        double double92 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray89, doubleArray90, 0);
        double double94 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray82, doubleArray90, (int) (byte) 1);
        double double96 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray64, doubleArray82, 0);
        // The following exception was thrown during execution in test generation
        try {
            double double98 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray0, doubleArray64, 137);
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
        org.junit.Assert.assertNotNull(doubleArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray89), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray90);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray90), "[]");
        org.junit.Assert.assertTrue("'" + double92 + "' != '" + (-1.0d) + "'", double92 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double94 + "' != '" + 0.0d + "'", double94 == 0.0d);
        org.junit.Assert.assertTrue("'" + double96 + "' != '" + 0.0d + "'", double96 == 0.0d);
    }

    @Test
    public void test05386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05386");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1490.599607119517d, 814.2659300497917d, 1121.2206903444408d, 917.0018427255086d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 472.1148294507932d + "'", double4 == 472.1148294507932d);
    }

    @Test
    public void test05387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05387");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(629.6806207647535d, 461.980404764096d, 100.0d, 598.9288607212837d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 666.6290767219411d + "'", double4 == 666.6290767219411d);
    }

    @Test
    public void test05388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05388");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(0.0d, 133.29291006037232d, 2636.4735994589255d, 156.5958899021712d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2659.7765793007243d + "'", double4 == 2659.7765793007243d);
    }

    @Test
    public void test05389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05389");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(857.2744661032689d, 2948.3996269687364d, 1236.6752907573918d, 846.3445253619836d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 379.5582291992054d + "'", double4 == 379.5582291992054d);
    }

    @Test
    public void test05390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05390");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(462.4018036256481d, 1236.660733166274d, 0.0d, 529.0692401880206d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 467.18302098219533d + "'", double4 == 467.18302098219533d);
    }

    @Test
    public void test05391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05391");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1205.614526897271d, 796.6050949282106d, 670.7484667514957d, 711.0139590919035d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 620.4571959820823d + "'", double4 == 620.4571959820823d);
    }

    @Test
    public void test05392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05392");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(858.9337622460929d, 941.1476765326927d, 458.682951459312d, 490.7494344988548d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 543.8385888608505d + "'", double4 == 543.8385888608505d);
    }

    @Test
    public void test05393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05393");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(483.3392002841862d, 1186.5359249599796d, 554.0360052988086d, 3264.137257453245d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2781.696581763455d + "'", double4 == 2781.696581763455d);
    }

    @Test
    public void test05394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05394");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1447.3946977424262d, 0.0d, 274.73878064534733d, 1638.0019709217686d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2810.657888018847d + "'", double4 == 2810.657888018847d);
    }

    @Test
    public void test05395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05395");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(68.80572190500413d, 1497.3023621363538d, 596.178779154028d, 962.0155780796133d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1037.2782600053122d + "'", double4 == 1037.2782600053122d);
    }

    @Test
    public void test05396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05396");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(0.0d, 205.49962547816742d, 192.23203831232172d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 192.23203831232172d + "'", double4 == 192.23203831232172d);
    }

    @Test
    public void test05397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05397");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(0.0d, 78.45227647258133d, 2483.9847999350486d, 425.71130297188733d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2520.200507853767d + "'", double4 == 2520.200507853767d);
    }

    @Test
    public void test05398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05398");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(2023.1110291729233d, 2762.5605124068106d, 467.41331001723336d, 547.3929705623618d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2144.280574434125d + "'", double4 == 2144.280574434125d);
    }

    @Test
    public void test05399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05399");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(603.0082883958016d, 676.4487404919405d, 653.8220417482348d, 502.1608299106415d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 225.1016639337322d + "'", double4 == 225.1016639337322d);
    }

    @Test
    public void test05400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05400");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1096.071463554407d, 451.47820949769306d, 0.0d, 247.80706871775823d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1385.9744358269693d + "'", double4 == 1385.9744358269693d);
    }

    @Test
    public void test05401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05401");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(812.967611667732d, 364.6489401224609d, 1587.631056995123d, 675.0461907582147d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 786.8454561552757d + "'", double4 == 786.8454561552757d);
    }

    @Test
    public void test05402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05402");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(239.34555184024387d, 1860.9339763404182d, 1230.3377826328476d, 2183.9448788749164d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2182.5517506338774d + "'", double4 == 2182.5517506338774d);
    }

    @Test
    public void test05403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05403");
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
        int[] intArray80 = new int[] { 1, 1, 100 };
        int[] intArray82 = new int[] { (byte) -1 };
        int int83 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray80, intArray82);
        int[] intArray86 = new int[] { 'a', 10 };
        int int87 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray82, intArray86);
        int int88 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray74, intArray82);
        java.lang.Class<?> wildcardClass89 = intArray74.getClass();
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray80), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray82), "[-1]");
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + (-1) + "'", int83 == (-1));
        org.junit.Assert.assertNotNull(intArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray86), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + (-1) + "'", int87 == (-1));
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + (-1) + "'", int88 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass89);
    }

    @Test
    public void test05404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05404");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1274.21930025592d, 484.5368950805886d, 1496.5843769624714d, 286.3885107063019d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1012.5492067652477d + "'", double4 == 1012.5492067652477d);
    }

    @Test
    public void test05405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05405");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(497.6952949381995d, 622.3178581245444d, 234.50390780179015d, 311.404132905176d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 322.4501563255963d + "'", double4 == 322.4501563255963d);
    }

    @Test
    public void test05406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05406");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(704.8977144889124d, 37.36418845665748d, 1760.5047985463032d, 186.91022084648293d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1175.8475068996459d + "'", double4 == 1175.8475068996459d);
    }

    @Test
    public void test05407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05407");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1006.9909379380524d, 207.26617133714134d, 435.27058973391496d, 2455.757938577531d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2820.2121154445276d + "'", double4 == 2820.2121154445276d);
    }

    @Test
    public void test05408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05408");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(119.99500012499374d, 417.78548691883634d, 367.9531034650794d, 238.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 274.60590126126715d + "'", double4 == 274.60590126126715d);
    }

    @Test
    public void test05409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05409");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1579.576090222139d, 346.8788951708699d, 1108.4899415251407d, 135.59014554237984d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1518.8869503445171d + "'", double4 == 1518.8869503445171d);
    }

    @Test
    public void test05410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05410");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1117.6888075212794d, 590.7679441815164d, 1080.9689928527675d, 302.8507347626391d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 815.6650229146184d + "'", double4 == 815.6650229146184d);
    }

    @Test
    public void test05411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05411");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(834.4268347360893d, 1058.6255897318786d, 299.7215374309961d, 2630.7247344139123d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2106.8044419871267d + "'", double4 == 2106.8044419871267d);
    }

    @Test
    public void test05412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05412");
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
            int int91 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray68, intArray90);
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
    public void test05413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05413");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1159.9402816139109d, 0.0d, 545.5832766828634d, 1033.551364128251d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 627.2229970042904d + "'", double4 == 627.2229970042904d);
    }

    @Test
    public void test05414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05414");
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
        double[] doubleArray70 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray71 = new double[] {};
        double double73 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray70, doubleArray71, 0);
        double double75 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray62, doubleArray71, (int) (short) 100);
        double[] doubleArray78 = new double[] { (byte) 0, 132.0d };
        double double80 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray71, doubleArray78, (int) '4');
        double double82 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray50, doubleArray78, 157);
        java.lang.Class<?> wildcardClass83 = doubleArray78.getClass();
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
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray70), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray71), "[]");
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + (-1.0d) + "'", double73 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + (-1.0d) + "'", double75 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray78), "[0.0, 132.0]");
        org.junit.Assert.assertTrue("'" + double80 + "' != '" + (-1.0d) + "'", double80 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + (-1.0d) + "'", double82 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass83);
    }

    @Test
    public void test05415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05415");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(677.7121713137387d, 3114.804595839457d, 2560.8190872189666d, 660.8737855706839d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1883.1821972301382d + "'", double4 == 1883.1821972301382d);
    }

    @Test
    public void test05416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05416");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1082.470663860704d, 0.0d, 1178.9576913565845d, 1055.21852147466d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.26178603845042d + "'", double4 == 100.26178603845042d);
    }

    @Test
    public void test05417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05417");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(922.8406127352839d, 1286.2145901560154d, 1871.9372415251735d, 4040.16327341831d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3703.045312052184d + "'", double4 == 3703.045312052184d);
    }

    @Test
    public void test05418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05418");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(392.4042737118449d, 814.3831411278754d, 25.77738995443042d, 1001.7337362044342d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 553.9774788339732d + "'", double4 == 553.9774788339732d);
    }

    @Test
    public void test05419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05419");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1283.9922191100031d, 1249.643401085903d, 433.8341894155431d, 683.8176537884021d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1415.983776991961d + "'", double4 == 1415.983776991961d);
    }

    @Test
    public void test05420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05420");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1524.4128875948586d, 2698.79941054778d, 1262.9959356743564d, 634.1478301952668d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2326.068532273016d + "'", double4 == 2326.068532273016d);
    }

    @Test
    public void test05421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05421");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(22.11044946729052d, 584.2443443401818d, 0.0d, 1307.2639225900411d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1285.3436588924824d + "'", double4 == 1285.3436588924824d);
    }

    @Test
    public void test05422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05422");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(2482.225811306081d, 394.8787896067389d, 180.0274220553354d, 1006.1559190005614d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2913.475518644568d + "'", double4 == 2913.475518644568d);
    }

    @Test
    public void test05423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05423");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(570.362221215667d, 2212.378535842752d, 1449.3219229599931d, 966.6034244372169d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 964.1458647014654d + "'", double4 == 964.1458647014654d);
    }

    @Test
    public void test05424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05424");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(158.31063183921498d, 1222.7030823864745d, 1073.0984655358986d, 2472.0549922004434d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2488.021251071393d + "'", double4 == 2488.021251071393d);
    }

    @Test
    public void test05425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05425");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(359.2623750887635d, 615.2073500056413d, 943.279124792876d, 1238.5333366832397d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1055.5534035936935d + "'", double4 == 1055.5534035936935d);
    }

    @Test
    public void test05426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05426");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(738.2667297024383d, 456.0113736479015d, (double) 1, 1264.0538059811463d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1545.3091620356831d + "'", double4 == 1545.3091620356831d);
    }

    @Test
    public void test05427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05427");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(821.9404560206501d, 272.0850365622572d, 1128.5737418099877d, 912.4198157993067d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 319.70374802294884d + "'", double4 == 319.70374802294884d);
    }

    @Test
    public void test05428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05428");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1038.8816227598038d, 1335.6221527888076d, 1633.5358564520893d, 348.4574041312402d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1581.8189823498528d + "'", double4 == 1581.8189823498528d);
    }

    @Test
    public void test05429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05429");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(574.2264568926857d, 1250.8510419178506d, 183.58184974459016d, 532.5937039245571d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 392.85683806393797d + "'", double4 == 392.85683806393797d);
    }

    @Test
    public void test05430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05430");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(0.0d, 567.9905593254381d, 590.7679441815164d, 1583.2965357689516d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1689.921502333886d + "'", double4 == 1689.921502333886d);
    }

    @Test
    public void test05431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05431");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(569.959937758982d, 210.43152753590826d, 1188.1860396991142d, 1410.8842493339566d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1818.6788237381804d + "'", double4 == 1818.6788237381804d);
    }

    @Test
    public void test05432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05432");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(77.31557716268777d, 961.4828858358441d, 11.193079426714434d, 904.008957699331d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 829.3335457642763d + "'", double4 == 829.3335457642763d);
    }

    @Test
    public void test05433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05433");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(797.8832223409803d, 499.100051278382d, 2823.277210020572d, 296.0129554346333d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2086.6467286374295d + "'", double4 == 2086.6467286374295d);
    }

    @Test
    public void test05434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05434");
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
        int[] intArray46 = new int[] { (byte) 10, (byte) 100, ' ', (short) -1, (short) 100 };
        int int47 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray39, intArray46);
        int[] intArray51 = new int[] { 1, 1, 100 };
        int[] intArray53 = new int[] { (byte) -1 };
        int int54 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray51, intArray53);
        int[] intArray58 = new int[] { 1, 1, 100 };
        int[] intArray60 = new int[] { (byte) -1 };
        int int61 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray58, intArray60);
        int[] intArray64 = new int[] { 'a', 10 };
        int int65 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray60, intArray64);
        int int66 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray51, intArray64);
        int int67 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray39, intArray64);
        int[] intArray71 = new int[] { 1, 1, 100 };
        int[] intArray73 = new int[] { (byte) -1 };
        int int74 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray71, intArray73);
        int[] intArray77 = new int[] { 'a', 10 };
        int int78 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray73, intArray77);
        int int79 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray39, intArray73);
        int int80 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray30, intArray39);
        int[] intArray84 = new int[] { (byte) -1, (short) -1, ' ' };
        int[] intArray88 = new int[] { 1, 1, 100 };
        int[] intArray90 = new int[] { (byte) -1 };
        int int91 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray88, intArray90);
        int int92 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray84, intArray88);
        int int93 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray30, intArray84);
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
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[10, 100, 32, -1, 100]");
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
        org.junit.Assert.assertNotNull(intArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray64), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
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
    public void test05435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05435");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(451.47820949769306d, 721.5384481252531d, 2915.126973331059d, 724.0308906643231d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2478.679123151843d + "'", double4 == 2478.679123151843d);
    }

    @Test
    public void test05436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05436");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(999.620023574899d, 776.9027688652584d, 503.41416381475506d, 1065.5430455474684d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 500.5657799793145d + "'", double4 == 500.5657799793145d);
    }

    @Test
    public void test05437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05437");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1011.7972527379859d, 1144.4853157912107d, 717.1685837773858d, 895.2245224373729d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 316.85210118166225d + "'", double4 == 316.85210118166225d);
    }

    @Test
    public void test05438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05438");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(2429.070196532499d, 1768.7133071730161d, 592.6254712012968d, 266.09479742842706d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2837.4269693379265d + "'", double4 == 2837.4269693379265d);
    }

    @Test
    public void test05439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05439");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(868.4314838127239d, 297.8808495775337d, 514.4583823621946d, 352.5351514191304d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 625.6564411301682d + "'", double4 == 625.6564411301682d);
    }

    @Test
    public void test05440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05440");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(445.5565709724445d, 446.7421770525469d, 1754.2504958233844d, 553.9774788339732d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1415.9292266323664d + "'", double4 == 1415.9292266323664d);
    }

    @Test
    public void test05441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05441");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(459.52139206247597d, 101.0d, 967.2183354736177d, 659.9563710239427d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1066.6533144350844d + "'", double4 == 1066.6533144350844d);
    }

    @Test
    public void test05442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05442");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(0.0d, 1835.8291604794165d, 1637.4950373911101d, 579.9865621659195d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1737.1742600480686d + "'", double4 == 1737.1742600480686d);
    }

    @Test
    public void test05443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05443");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(475.4702622333558d, 605.9155468135754d, 536.4161158553086d, 2177.4089821789926d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1703.0295956101002d + "'", double4 == 1703.0295956101002d);
    }

    @Test
    public void test05444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05444");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1026.1396300310848d, 1377.7233444934122d, 185.09060898709973d, 723.7841806651837d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 893.7462019837074d + "'", double4 == 893.7462019837074d);
    }

    @Test
    public void test05445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05445");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(718.2552672071502d, 3313.656788436764d, 362.91048069008355d, 79.01194999030838d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 731.3699036132479d + "'", double4 == 731.3699036132479d);
    }

    @Test
    public void test05446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05446");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(3114.804595839457d, 1420.4614059880025d, 4082.6847624687925d, 1156.9233522299178d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2184.053795361384d + "'", double4 == 2184.053795361384d);
    }

    @Test
    public void test05447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05447");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1282.715993624304d, 2092.8269635231545d, 150.40770846134703d, 626.1724203515566d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2598.9628283345546d + "'", double4 == 2598.9628283345546d);
    }

    @Test
    public void test05448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05448");
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
        int[] intArray38 = new int[] { 1, 1, 100 };
        int[] intArray40 = new int[] { (byte) -1 };
        int int41 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray38, intArray40);
        int[] intArray44 = new int[] { 'a', 10 };
        int int45 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray40, intArray44);
        int[] intArray49 = new int[] { 1, 1, 100 };
        int[] intArray51 = new int[] { (byte) -1 };
        int int52 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray49, intArray51);
        int[] intArray56 = new int[] { 1, 1, 100 };
        int[] intArray58 = new int[] { (byte) -1 };
        int int59 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray56, intArray58);
        int[] intArray62 = new int[] { 'a', 10 };
        int int63 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray58, intArray62);
        int int64 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray49, intArray62);
        int int65 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray40, intArray49);
        int int66 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray33, intArray40);
        int[] intArray70 = new int[] { 1, 1, 100 };
        int[] intArray72 = new int[] { (byte) -1 };
        int int73 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray70, intArray72);
        int[] intArray77 = new int[] { 1, 1, 100 };
        int[] intArray79 = new int[] { (byte) -1 };
        int int80 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray77, intArray79);
        int int81 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray70, intArray79);
        int int82 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray33, intArray70);
        int int83 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray16, intArray33);
        int[] intArray87 = new int[] { (byte) -1, (short) -1, ' ' };
        int[] intArray91 = new int[] { 1, 1, 100 };
        int[] intArray93 = new int[] { (byte) -1 };
        int int94 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray91, intArray93);
        int int95 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray87, intArray91);
        int int96 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray16, intArray87);
        java.lang.Class<?> wildcardClass97 = intArray16.getClass();
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[-1]");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[97, 10]");
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
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
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
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + (-1) + "'", int81 == (-1));
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 101 + "'", int82 == 101);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + (-1) + "'", int83 == (-1));
        org.junit.Assert.assertNotNull(intArray87);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray87), "[-1, -1, 32]");
        org.junit.Assert.assertNotNull(intArray91);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray91), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray93);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray93), "[-1]");
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + (-1) + "'", int94 == (-1));
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + 72 + "'", int95 == 72);
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + (-1) + "'", int96 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass97);
    }

    @Test
    public void test05449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05449");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(193.6820285826737d, 878.1086993790781d, 787.8760041172126d, 1082.04669754179d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 798.1319736972508d + "'", double4 == 798.1319736972508d);
    }

    @Test
    public void test05450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05450");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(959.0422189047277d, 2156.0284488039074d, 404.68669618344165d, 427.0954714739296d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 768.2951175647257d + "'", double4 == 768.2951175647257d);
    }

    @Test
    public void test05451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05451");
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
        double[] doubleArray91 = new double[] { 1004.8526676203933d, 483.69245455426403d, 926.8168419803987d, 571.4354617909383d, 46.246738985369255d };
        double double93 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray50, doubleArray91, (int) '#');
        java.lang.Class<?> wildcardClass94 = doubleArray50.getClass();
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
        org.junit.Assert.assertNotNull(doubleArray91);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray91), "[1004.8526676203933, 483.69245455426403, 926.8168419803987, 571.4354617909383, 46.246738985369255]");
        org.junit.Assert.assertTrue("'" + double93 + "' != '" + (-1.0d) + "'", double93 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass94);
    }

    @Test
    public void test05452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05452");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1203.7314546168911d, 2024.3420553991118d, 49.33701282608181d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1667.8117226088834d + "'", double4 == 1667.8117226088834d);
    }

    @Test
    public void test05453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05453");
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
        int[] intArray86 = new int[] { (byte) 10, (byte) 100, ' ', (short) -1, (short) 100 };
        int int87 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray79, intArray86);
        int int88 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray62, intArray79);
        java.lang.Class<?> wildcardClass89 = intArray62.getClass();
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
        org.junit.Assert.assertNotNull(intArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray86), "[10, 100, 32, -1, 100]");
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + (-1) + "'", int87 == (-1));
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 0 + "'", int88 == 0);
        org.junit.Assert.assertNotNull(wildcardClass89);
    }

    @Test
    public void test05454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05454");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1304.6718953709399d, 1117.4402236439857d, 532.3985198594888d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1516.1051814088135d + "'", double4 == 1516.1051814088135d);
    }

    @Test
    public void test05455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05455");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(672.6788023428246d, 572.2631809460208d, 420.1686547710891d, 1786.0894626301626d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1466.3364292558772d + "'", double4 == 1466.3364292558772d);
    }

    @Test
    public void test05456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05456");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(321.03012572112056d, 877.7040025535117d, 1794.7786460596942d, 1818.6788237381804d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2101.16308835662d + "'", double4 == 2101.16308835662d);
    }

    @Test
    public void test05457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05457");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1439.8973561602534d, 224.76550746286068d, 0.0d, 1533.565316844883d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2748.697165542276d + "'", double4 == 2748.697165542276d);
    }

    @Test
    public void test05458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05458");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1829.2102125307836d, 0.0d, 0.0d, (double) (short) 10);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2579.8325137503043d + "'", double4 == 2579.8325137503043d);
    }

    @Test
    public void test05459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05459");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(234.8594808073821d, 399.3831132999537d, 689.8324544612343d, 482.65745650742093d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 538.2473168613194d + "'", double4 == 538.2473168613194d);
    }

    @Test
    public void test05460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05460");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(717.2396947267104d, 989.7389530394175d, 398.2548271112235d, 1117.864714128838d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 512.1052156916826d + "'", double4 == 512.1052156916826d);
    }

    @Test
    public void test05461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05461");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1104.1766048460413d, 475.24329446565264d, 161.27348629222328d, 46.246738985369255d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1371.8996740341013d + "'", double4 == 1371.8996740341013d);
    }

    @Test
    public void test05462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05462");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(417.66795450539934d, 738.7021360070464d, 717.9718079630422d, 818.8255089349238d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 501.1085589743867d + "'", double4 == 501.1085589743867d);
    }

    @Test
    public void test05463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05463");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(901.5528166013252d, 0.0d, 286.77276777452346d, 711.7773848285456d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1326.5574336553473d + "'", double4 == 1326.5574336553473d);
    }

    @Test
    public void test05464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05464");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1119.947404792211d, (double) 100.0f, 0.0d, 726.6320835141663d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1746.5794883063772d + "'", double4 == 1746.5794883063772d);
    }

    @Test
    public void test05465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05465");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1214.2347953862636d, 934.47648493516d, 484.5368950805886d, 1254.3346883546303d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1049.5561037251455d + "'", double4 == 1049.5561037251455d);
    }

    @Test
    public void test05466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05466");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1297.5118904532737d, 367.4257229620187d, 1849.2004754411312d, 858.8263355548762d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 704.8441748942948d + "'", double4 == 704.8441748942948d);
    }

    @Test
    public void test05467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05467");
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
        double double53 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray40, doubleArray49, (int) (short) 100);
        double[] doubleArray58 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray59 = new double[] {};
        double double61 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray58, doubleArray59, 0);
        double double63 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray49, doubleArray58, (int) (short) 100);
        double[] doubleArray68 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray69 = new double[] {};
        double double71 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray68, doubleArray69, 0);
        double[] doubleArray77 = new double[] { 232.4213562373095d, (short) 0, 1.0f, 75.85073476263909d, (-1L) };
        double double79 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray69, doubleArray77, (int) (byte) -1);
        double double81 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray58, doubleArray77, (int) (short) 10);
        double double83 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray33, doubleArray58, 101);
        double double85 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray12, doubleArray58, (int) ' ');
        java.lang.Class<?> wildcardClass86 = doubleArray58.getClass();
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
        org.junit.Assert.assertNotNull(doubleArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray77), "[232.4213562373095, 0.0, 1.0, 75.85073476263909, -1.0]");
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + (-1.0d) + "'", double79 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + (-1.0d) + "'", double81 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + (-1.0d) + "'", double83 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double85 + "' != '" + 0.0d + "'", double85 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass86);
    }

    @Test
    public void test05468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05468");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(98.5193674472778d, 969.903923617278d, 5301.341014338398d, 784.2049386362926d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 5247.81076182208d + "'", double4 == 5247.81076182208d);
    }

    @Test
    public void test05469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05469");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1288.8130769829195d, 88.87071783022412d, 1214.6262304674062d, 460.63617381552586d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 831.4930373345594d + "'", double4 == 831.4930373345594d);
    }

    @Test
    public void test05470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05470");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(178.44662506919906d, 854.8424809621159d, 277.515023655668d, 360.643250362379d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 593.2676291862059d + "'", double4 == 593.2676291862059d);
    }

    @Test
    public void test05471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05471");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1474.2469276884754d, 1671.2103957794097d, 748.6821636738565d, 418.4682227096378d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1978.306937084391d + "'", double4 == 1978.306937084391d);
    }

    @Test
    public void test05472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05472");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(2425.5363873598344d, 596.178779154028d, 520.7192514734386d, 422.59981641014514d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2078.3960986302786d + "'", double4 == 2078.3960986302786d);
    }

    @Test
    public void test05473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05473");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(175.09754101316523d, 1226.919096952711d, 702.9647896666105d, 814.5476314720477d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 829.1804691313171d + "'", double4 == 829.1804691313171d);
    }

    @Test
    public void test05474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05474");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1756.7202197816032d, 182.53302624480077d, 0.0d, 1427.5963334379958d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3001.7835269747984d + "'", double4 == 3001.7835269747984d);
    }

    @Test
    public void test05475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05475");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1325.1233860794462d, 1093.2369568734316d, 542.814174340953d, 160.0457809614037d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1715.5003876505211d + "'", double4 == 1715.5003876505211d);
    }

    @Test
    public void test05476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05476");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1143.28819990604d, 619.6523847451149d, 877.7040025535117d, 710.1098023551712d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 508.1126745005731d + "'", double4 == 508.1126745005731d);
    }

    @Test
    public void test05477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05477");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1513.686550350365d, 397.7356276694724d, 2722.5729292979886d, 527.3347368521902d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1338.4854881303413d + "'", double4 == 1338.4854881303413d);
    }

    @Test
    public void test05478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05478");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(0.0d, 519.5818462486801d, 767.8895161970873d, 3122.1327365159536d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3370.440406464361d + "'", double4 == 3370.440406464361d);
    }

    @Test
    public void test05479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05479");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(668.1928114195907d, 784.2536075694591d, 1813.720231278971d, 1822.8586946789696d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2184.132506968891d + "'", double4 == 2184.132506968891d);
    }

    @Test
    public void test05480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05480");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(661.4062218796978d, 2406.9840447187594d, 789.2988800520901d, 1197.6466171091483d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1337.2300857820032d + "'", double4 == 1337.2300857820032d);
    }

    @Test
    public void test05481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05481");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(288.27409847270104d, 454.87000703441174d, 580.1837315253787d, 2339.965808757059d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2177.0054347753253d + "'", double4 == 2177.0054347753253d);
    }

    @Test
    public void test05482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05482");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(116.28126637821768d, 0.0d, 1318.4050256596806d, 1080.3883502013753d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2282.5121094828382d + "'", double4 == 2282.5121094828382d);
    }

    @Test
    public void test05483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05483");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1318.0864281704735d, (double) 'a', 981.7729625674999d, 743.4163428268258d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 665.8471702536234d + "'", double4 == 665.8471702536234d);
    }

    @Test
    public void test05484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05484");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1009.260169719811d, 783.4339093421895d, 814.2659300497917d, 576.8366664256379d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 401.5914825865709d + "'", double4 == 401.5914825865709d);
    }

    @Test
    public void test05485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05485");
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
        // The following exception was thrown during execution in test generation
        try {
            int int76 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray0, intArray63);
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
    }

    @Test
    public void test05486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05486");
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
        int int61 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray38, intArray50);
        int[] intArray65 = new int[] { 1, 1, 100 };
        int[] intArray67 = new int[] { (byte) -1 };
        int int68 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray65, intArray67);
        int int69 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray38, intArray67);
        // The following exception was thrown during execution in test generation
        try {
            int int70 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray0, intArray38);
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
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray65), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray67), "[-1]");
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
    }

    @Test
    public void test05487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05487");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1587.6176728432806d, 526.1603102497103d, 324.9129524411771d, 1410.8842493339566d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2147.4286594863497d + "'", double4 == 2147.4286594863497d);
    }

    @Test
    public void test05488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05488");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(308.0245929034511d, 685.8436957842314d, 2148.5175617799814d, 550.4199975654466d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1975.916667095315d + "'", double4 == 1975.916667095315d);
    }

    @Test
    public void test05489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05489");
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
            double double50 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray32, doubleArray48, 100);
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
    public void test05490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05490");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(457.8098653414465d, 455.7720019217035d, 1209.4031474744982d, 1452.9766643859439d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1247.0963954995636d + "'", double4 == 1247.0963954995636d);
    }

    @Test
    public void test05491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05491");
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
        double[] doubleArray65 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double67 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray13, doubleArray65, (int) (byte) 10);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray62), "[706.5032237784504, -1.0, 246.4044206487757, 51.402702719722015]");
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + (-1.0d) + "'", double64 == (-1.0d));
    }

    @Test
    public void test05492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05492");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(302.8507347626391d, 345.02253292181524d, 793.3634741754175d, 283.7811747592152d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 551.7540975753784d + "'", double4 == 551.7540975753784d);
    }

    @Test
    public void test05493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05493");
        int[] intArray3 = new int[] { 1, 1, 100 };
        int[] intArray5 = new int[] { (byte) -1 };
        int int6 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray3, intArray5);
        int[] intArray12 = new int[] { (byte) 10, (byte) 100, ' ', (short) -1, (short) 100 };
        int int13 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray5, intArray12);
        int[] intArray20 = new int[] { 0, 215, 1, 69, (short) 10, (short) 100 };
        int[] intArray24 = new int[] { 1, 1, 100 };
        int[] intArray26 = new int[] { (byte) -1 };
        int int27 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray24, intArray26);
        int[] intArray31 = new int[] { 1, 1, 100 };
        int[] intArray33 = new int[] { (byte) -1 };
        int int34 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray31, intArray33);
        int[] intArray37 = new int[] { 'a', 10 };
        int int38 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray33, intArray37);
        int[] intArray42 = new int[] { (byte) 1, (short) 1, (short) -1 };
        int int43 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray33, intArray42);
        int int44 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray26, intArray33);
        int[] intArray48 = new int[] { 1, 1, 100 };
        int[] intArray50 = new int[] { (byte) -1 };
        int int51 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray48, intArray50);
        int int52 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray26, intArray48);
        int[] intArray56 = new int[] { 1, 1, 100 };
        int[] intArray58 = new int[] { (byte) -1 };
        int int59 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray56, intArray58);
        int[] intArray62 = new int[] { 'a', 10 };
        int int63 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray58, intArray62);
        int int64 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray26, intArray58);
        int[] intArray68 = new int[] { 1, 1, 100 };
        int[] intArray70 = new int[] { (byte) -1 };
        int int71 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray68, intArray70);
        int[] intArray74 = new int[] { 'a', 10 };
        int int75 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray70, intArray74);
        int[] intArray79 = new int[] { (byte) 1, (short) 1, (short) -1 };
        int int80 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray70, intArray79);
        int int81 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray58, intArray70);
        int[] intArray85 = new int[] { 1, 1, 100 };
        int[] intArray87 = new int[] { (byte) -1 };
        int int88 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray85, intArray87);
        int int89 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray70, intArray87);
        int int90 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray20, intArray87);
        int int91 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray5, intArray87);
        java.lang.Class<?> wildcardClass92 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[10, 100, 32, -1, 100]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 215, 1, 69, 10, 100]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[-1]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[-1]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[1, 1, -1]");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray50), "[-1]");
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
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
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
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 0 + "'", int89 == 0);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + (-1) + "'", int90 == (-1));
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 0 + "'", int91 == 0);
        org.junit.Assert.assertNotNull(wildcardClass92);
    }

    @Test
    public void test05494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05494");
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
        double double68 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray55, doubleArray64, 1);
        double[] doubleArray70 = new double[] { (short) 0 };
        double[] doubleArray75 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray76 = new double[] {};
        double double78 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray75, doubleArray76, 0);
        double[] doubleArray83 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray84 = new double[] {};
        double double86 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray83, doubleArray84, 0);
        double double88 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray75, doubleArray84, (int) (short) 100);
        double double90 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray70, doubleArray75, 1);
        double double92 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray64, doubleArray75, 215);
        double double94 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray23, doubleArray75, 0);
        double[] doubleArray95 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double97 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray75, doubleArray95, 137);
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
    }

    @Test
    public void test05495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05495");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(458.682951459312d, 577.2558119582856d, 285.1699348719751d, 582.0571490761524d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 212.90363914888033d + "'", double4 == 212.90363914888033d);
    }

    @Test
    public void test05496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05496");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(372.94976380494643d, 1372.3147425323373d, 317.0700696293941d, 444.3546768000051d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 983.8397599078845d + "'", double4 == 983.8397599078845d);
    }

    @Test
    public void test05497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05497");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(776.2644272774396d, 1564.1446073508469d, 3089.620601217342d, 358.9555529423255d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2350.6942557688576d + "'", double4 == 2350.6942557688576d);
    }

    @Test
    public void test05498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05498");
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
        int int40 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray12, intArray29);
        int[] intArray41 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int42 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray29, intArray41);
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
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
    }

    @Test
    public void test05499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05499");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1069.8300750248936d, 220.78840830511703d, 1915.2171449349437d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1066.175478215167d + "'", double4 == 1066.175478215167d);
    }

    @Test
    public void test05500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05500");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(58.216600569028486d, 1447.3946977424262d, 766.9371007545403d, 2022.9938241410887d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2088.692003539712d + "'", double4 == 2088.692003539712d);
    }
}

